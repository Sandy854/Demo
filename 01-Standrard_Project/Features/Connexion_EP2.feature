@feature2
Feature: Connexion à l'Espace Perso de SeLoger

  Scenario: Chois de l'onglet 'Se connecter'
    Given Ouvre la Home Page de SeLoger
    When Clique sur le bouton d'accès à l'EP
    Then Choisir l'onglet 'Se connecter'

