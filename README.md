
# Relatório de Testes - SimuladorCashBack

> **Data: 18/10/2024**

## Resumo dos Testes

> Os testes tiveram como objetivo validar o cálculo do cashback em diferentes faixas de valores e categorias (Bronze, Prata e Ouro) no sistema SimuladorCashBack. Os testes verificam limites inferiores e superiores, além de casos específicos.

✅ - Passou no Teste.<br>
❌ - Não passou no Teste.

| Teste      | Entrada | Esperado |  Obtido  |  Resultado  |
| :----:        | :----:  |     :----:  |     :----:  |        :----:  |
| testaCashBackLimiteInferiorParticaoABronze | -0.01, "bronze"   | 0.0  | -0.001 | ❌
| testaCashBackLimiteInferiorParticaoAPrata	 | -0.01, "prata"    | 0.0  | -0.001500000000000002 | ❌ 
| testaCashBackLimiteInferiorParticaoAOuro	 | -0.01, "ouro"    | -0.002  | 0.0 | ❌ 
| testaCashBackLimiteSuperiorParticaoABronze	 | 0.01, "Bronze"    | 0.0005  | 0.0005 | ✅
| testaCashBackLimiteSuperiorParticaoAPrata	 | 0.01, "Prata"    | 0.001  | 0.001 | ✅
| testaCashBackLimiteSuperiorParticaoAOuro		 | 0.01, "Ouro"	    | 0.0015  | 0.0015000000000000002 | ❌
| testaCashBackLimiteInferiorParticaoBBronze		 | 99.99, "Bronze"	    | 4.9995 | 4.9995 | ✅
| testaCashBackLimiteInferiorParticaoBPrata		 | 99.99, "Prata"	    | 9.999 | 9.999 | ✅
| testaCashBackLimiteInferiorParticaoBOuro		 | 99.99, "Ouro"	    | 14.9985 | 14.9985000000000000002 | ❌
| testaCashBackLimiteSuperiorParticaoBBronze		 | 100.01, "Bronze"	    | 5.0005 | 10.001000000000001 | ❌
| testaCashBackLimiteSuperiorParticaoBPrata		 | 100.01, "Prata"	    | 10.001 | 15.0015000000000004 | ❌
| testaCashBackLimiteSuperiorParticaoBOuro		 | 100.01, "Ouro"	    | 15.0015 | 20.002000000000002 | ❌
| testaCashBackLimiteInferiorParticaoCBronze		 | 100.00, "Bronze"	    | 5.0 | 5.0 | ✅
| testaCashBackLimiteInferiorParticaoCPrata		 |  100.00, "Prata"	    | 10.0 | 10.0 | ✅
| testaCashBackLimiteInferiorParticaoCOuro		 |  100.00, "Ouro"	    | 15.0 | 15.000000000000002 | ❌
| testaCashBackLimiteSuperiorParticaoCPrata		 |  100.02, "Prata"	    | 10.002 | 15.003000000000002 | ❌
| testaCashBackLimiteSuperiorParticaoCOuro		 |  100.02, "Ouro"	    | 15.003 | 20.004 | ❌
| testaCashBackLimiteInferiorParticaoDBronze		 |  499.99, "Bronze"	    | 24.9995 | 49.999 | ❌
| testaCashBackLimiteInferiorParticaoDPrata		 |  499.99, "Prata"	    | 49.999 | 74.9985 | ❌
| testaCashBackLimiteInferiorParticaoDOuro		 |  499.99, "Ouro"	    | 74.9985 | 99.998 | ❌
| testaCashBackLimiteSuperiorParticaoDBronze		 |  500.01, "Bronze"	    | 25.0005 | 75.0015 | ❌
| testaCashBackLimiteSuperiorParticaoDPrata		 |  500.01, "Prata"		    | 50.001 | 100.00200000000001 | ❌
| testaCashBackLimiteSuperiorParticaoDOuro		 |  500.01, "Ouro"		    | 75.0015 | 125.0025 | ❌
| testaCashBackZeroBronze		 |  0.0, "Bronze"		    | 0.0 | 0.0 | ✅
| testaCashBackZeroPrata		 |  0.0, "Prata"		    | 0.0 | 0.0 | ✅
| testaCashBackZeroOuro		 |  0.0, "Ouro"		    | 0.0 | 0.0 | ✅
| testaCashBackLimiteInferiorParticaoEBronze		 |  1000.00, "Bronze"		    | 50.0 | 150.0 | ❌
| testaCashBackLimiteInferiorParticaoEPrata		 |  1000.00, "Prata"			    | 100.0 | 100.0 | ❌
| testaCashBackLimiteInferiorParticaoEOuro		 |  1000.00, "Ouro"				    | 150.0 | 250.0 | ❌
| testaCashBackLimiteSuperiorParticaoEBronze		 | 1000.01, "Bronze"					    | 50.0005 | 150.0015 | ❌
| testaCashBackLimiteSuperiorParticaoEPrata		 | 1000.01, "Prata"						    | 	100.001 | 	200.002 | ❌
| testaCashBackLimiteSuperiorParticaoEOuro		 | 1000.01, "Ouro"						    | 	150.0015 | 	250.0025 | ❌

### Conclusão

> A função calculaCashBack do SimuladorCashBack está retornando os resultados esperados e não esperados para os diferentes limites e categorias de cashback. O sistema não se comporta de acordo com as especificações.
