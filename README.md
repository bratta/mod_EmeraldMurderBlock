# Emerald Murder Block

## Mod for Minecraft 1.0.0

This mod adds a new Emerald Ore block to the game. Once you install the
mod, the block will appear in newly-generated chunks, so you'll have to
do some exploring or just create a new world.

Mine this ore, and you'll get a random number of emeralds. If you happen
to try smelting these emeralds, you'll get an Emerald Murder Block which
is quite fun to use.

Emerald Murder Blocks don't like living creatures, with the odd
exception of Steve. It tends to teleport living creatures up into the
air 24 blocks, allowing them to fall to their deaths.

Emerald Murder Blocks don't like to be moved once placed. They'll bite
you if you try. Don't remove the murder blocks when you're low on
health.

You can also place the ore and the block using WorldEdit:

    //set 123
    //set 124

(Note that if you have a mod that already overrides these block ID's,
you'll get a conflict. This will have to do until Minecraft gets a real
mod API).

## Requirements

* Minecraft 1.0.0
* ModLoader
* A tool for patching files into your minecraft.jar. I use mcpatcher.

## Installation

* Stop Minecraft completely.
* Copy all the files in the zip file EXCEPT `README.md` into your
minecraft.jar.
* Start Minecraft and have fun!

## Todo

* Teleportation doesn't check for any existing blocks at the destination coordinates. So if it teleports into solid rock, things could get...  messy.
* There's a bug with a 2-high stack of murder blocks. If you walk into them, it's like you walk inside the blocks and start taking damage.
* It would be neat to give the ore particles and glowy effects like redstone.

## License

Copyright (C) 2011 Tim Gourley

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
of the Software, and to permit persons to whom the Software is furnished to do
so, subject to the following conditions:

The above copyright notice and this permission notice shall be included
in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
