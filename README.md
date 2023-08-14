# DesafioSDE

# Pseudo code

```
payment_type := PROD_FISICO
             |  LIVRO
             |  ASSOCIACAO_MEMBRO
             |  UPGRADE_ASSOCIACAO_MEMBRO
             |  VIDEO_APRENDER_ESQUIAR
             |  OTHER

action_type :=  GERAR_GUIA_REMESSA_ENVIO
            |   GERAR_GUIA_REMESSA_DUPLICATA
            |   ATIVAR_ASSOCIACAO_MEMBRO
            |   UPGRADE_ASSOCIACAO_MEMBRO
            |   ENVIAR_EMAIL_USUARIO
            |   INFORMAR_USUARIO
            |   ADD_VIDEO_PRIMEIROS_SOCORROS
            |   GERAR_PAGAMENTO_COMISSAO_AGENTE
            |   DEFAULT_ACTION


IF (payment_type == PROD_FISICO) THEN
  DO action(action_type = GERAR_GUIA_REMESSA_ENVIO)

IF (payment_type == LIVRO) THEN
  DO action(action_type = GERAR_GUIA_REMESSA_DUPLICATA)

IF (payment_type == ASSOCIACAO_MEMBRO) THEN
  DO action(action_type = ATIVAR_ASSOCIACAO_MEMBRO)

IF (payment_type == UPGRADE_ASSOCIACAO_MEMBRO) THEN
  DO action(action_type = UPGRADE_ASSOCIACAO_MEMBRO)

IF (payment_type == ASSOCIACAO_MEMBRO) OR
   (payment_type == UPGRADE_ASSOCIACAO_MEMBRO) THEN
  DO action(action_type = ENVIAR_EMAIL_USUARIO)
  DO action(action_type = INFORMAR_USUARIO)

IF (payment_type == VIDEO_APRENDER_ESQUIAR) THEN
  DO action(action_type = ADD_VIDEO_PRIMEIROS_SOCORROS)

IF (payment_type == PROD_FISICO) OR
   (payment_type == LIVRO) THEN
  DO action(action_type = GERAR_PAGAMENTO_COMISSAO_AGENTE)

IF (payment_type == OTHER) THEN
  DO action(action_type = DEFAULT_ACTION)

```
