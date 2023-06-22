The Button class:

I chose to use an abstraction class that will provide an empty method called buttonPressed(), in that way each
Button class which inherited from this parent class must implement this function which makes sense since every
different button should be able to provide different functionality. In addition, using the abstract parent
class with this method I just mentioned served the polymorphism principal and provide modular and flexible
code(we can add buttons, we can change functionality of one button, etc.).

The ButtonA class:
I implemented(override) the buttonPressed() method of the parent class this class inherited from. The method
using switch and cases to set the state of the clocked as it asked.

The Clock class:
The constructor initiate the buttons(has a relationship), and it's using them when button got presses, for
example doA() will call the buttonA.button pressed which illustrating the polymorphism principal that was
mention above. In addition, it contains enum class which represents the states of the clock in a more
comfortable way. Besides that there are get and set methods for the state will be used by the doA|B|C|D
methods such that each one of these methods can implement his functionality while getting the current state.

The Main function:
Not part of program logic/functionality, used for sanity check only.


