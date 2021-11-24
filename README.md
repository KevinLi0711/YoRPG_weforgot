# YoRPG_weforgot
# Kevin Li, Justin Mohabir, Jonathan Song
## New Protagonists
* Ninja: Press button to instakill. Weaknesses: everything (it has paper defenses)
* Barbarian: Tanky but low strength and attack. Special attack comes with a very high multiplier to compensate.
* Gambler: If you win the 50/50, you deal lots of damage. Otherwise, very little damage
## New Monsters
* Firebender: Deals burn damage that ignores defense. Burn damage increases over time. High defense and low attack
* Werewolf: Pray you don't get unlucky because this thing has a high attack, and can crit for double damage
* Golem: Low attack and high defense, but it deals more damage the more you hit it
## v0
* Copied source files
## v1 
* Created a Character superclass with a constructor that takes in each individual stat and returns a Character
* Subclasses were modified to use the super constructor
* Modified specialize() and normalize() to scale based on Character's attack and defense stats rather than being set changes in values
## v2 
* Made the Character instance variables protected instead of private
* Added some new instance variables to Protagonist 
* Removed some comments and made some organizational changes
## v3
* Changed the Character superclass constructor to no longer take in stats as input. Each new subclass instead modifies the Character instance variables directly
* Moved the old Protagonist constructor up into Character, so the Protagonist constructor looks better and the standard stats are easier to reference for creating new subclasses
* 3 new Protagonists and 3 new Monsters
* Modified driver to allow you to pick a Protagonist subclass, and to randomize Monster encounters
# Ideas
* Creating a speed system to determine who gets to attack first, and to give players the chance to defeat their opponent without taking any damage
* A chance to receive random powerups when defeating an enemy
* The ability to view your stats and to know what Monster you are fighting
