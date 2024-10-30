---
name: Release template
about: Template de release
title: ''
labels: ''
assignees: ''

---

# Release X.X.X

## Resumo

- Faça um breve resumo do objetivo dessa release

## Descrição

- Feature - XX-123 - Qual o objetivo da feature?
- Bugfix - XX-124 - O que foi corrigido?
- Hotfix - XX-125 - O que foi corrigido?
- DT - XX-126 - Qual melhoria/mudança foi feita?

## Checklist:

- [ ] Todas as variáveis de ambiente foram configuradas em produção?
- [ ] Há necessidade de mudanças externas (banco, DNS, load-balancer, analytics, monitoramento, logging, etc)?
- [ ] Requisitor e/ou aprovador tem acesso a logs (kibana) e monitamento (grafana)?
- [ ] Release notes já foi publicado no slack?
- [ ] Essa release vai ser feita sexta à tarde ou no final de semana? Se sim, pode esperar para segunda?
- [ ] Requisitor e/ou aprovador vão estar disponíveis nas horas seguindas para monitorar?
- [ ] Requisitor ou aprovador sabe / tem acesso para realizar rollback?
- [ ] Quais testes serão feitos para confirmar que o deploy deu certo (teste de fumaça)?
