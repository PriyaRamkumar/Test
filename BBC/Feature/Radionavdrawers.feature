Feature: Radio Nav Drawers
AS A user
I WANT to see more content associated with navigation links
So THAT I can easily find what I am looking for
Scenario Outline: Opening and closing the drawers
Given I can see the radio nav
When I select <section> in the radio nav
Then the <section> drawer is open
When I select <section> in the radio nav again
Then the <section> drawer is closed
Examples: of sections
| section|
| Stations |
| Categories |
| Schedules |

@todo
Scenario Outline: Opening a drawer should close the other drawers
Given I can see the radio nav
When I select <section> in the radio nav
Then the <section> drawer is open and the other drawers are closed
Examples: of sections
| section |
| Stations |
| Categories |
| Schedules |

@todo
Scenario: Selecting categories displays categories links
Given I can see the radio nav
When I select Categories in the radio nav
Then I can see the following categories
| Comedy |
| Drama |
| Factual |
| Music |
| News |
| Science & Nature |
| History |
| Arts & Culture |
| Politics |
| Entertainment |
| Religion |
| Performances & Events |
| Documentaries |
| Readings |
| Podcasts |

@todo
Scenario: Selecting all categories navigates to all categories page
Given I can see the radio nav
When I select Categories in the radio nav
And I select the all categories link
Then I am on the all categories page


Scenario: Selecting stations in the radionav should open links to all national and nations stations
Given I can see the radio nav
And I select the Stations in the radio nav
And I can see Local Radio link inside the Stations drawer
When I select the Local Radio link in the Stations drawer
Then the stations page is open
And Stations page contains section listing all the local networks


Scenario Outline: Selecting a network from a Stations drawer the user is taken to the appropriate network homepage
Given I can see the radio nav
When I select the Stations in the radio nav
And I select a <network> from the station drawer
Then I am taken to the appropriate <network> homepage
Examples: of networks
| network |
| Radio 1 |
| Radio 1Xtra |
| Radio 2 |
| Radio 3 |
| Radio 4 |
| Radio 4 Extra |
| Radio 5 live |
| Radio 5 live sports extra |
| Radio 6 Music |
| Asian Network |
| World Service |
| Radio Scotland |
| Radio nan Gàidheal Radio 1 |
| Radio Ulster |
| Radio Foyle |
| Radio Wales |
| Radio Cymru |
| Local Radio |


Scenario: Selecting the iplayer Radio logo opens the radio homepage
Given I am on the BBC website
When I select the iplayer Radio logo
Then I am taken to the radio homepage
