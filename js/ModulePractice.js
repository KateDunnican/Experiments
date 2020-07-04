import { printMsg } from './Module1.js';
import { msg2, msg1 } from './Module2.js';
// Import everything from a module as an object: import * as mod1 from './Module1.js';
    // access: mod1.msg1

// Could use alias:  import { msg2, msg1 as msg3 } from './Module2.js';
    // printMsg(msg3 + msg2);

printMsg(msg1 + msg2);

// Stuff from an imported module can't be changed here, must only be changed in module
