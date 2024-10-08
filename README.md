# Real Python Feed Reader

The Real Python Feed Reader is a basic [web feed](https://en.wikipedia.org/wiki/Web_feed) reader that can download the latest Real Python tutorials from the [Real Python feed](https://realpython.com/contact/#rss-atom-feed).

For more information see the tutorial [How to Publish an Open-Source Python Package to PyPI](https://realpython.com/pypi-publish-python-package/) on Real Python.

## How to setup this project
* Install a docker engine using either docker desktop, rancher desktop, colima, orbstack or podman
* Install the devcontainer extension in visual studio code
* Open the git repo with devcontainer. use of the following
  * close the visual studio and then reopen it to get the prompt to open in devcontainer
  * press command-shift-p and type "Dev Containers: Rebuild"
* open a termainl inside the visual studio code

If you want to use the git command inside the visual studio code to commit and push make sure to setup ssh-add on your host before opening the visual studio

To test to see if you are using the correct ssh identify file or if you have correct permission run the following command
<pre>
  ssh -T git@github.com
</pre>

[![Bump version and Publish package workflow](https://github.com/tchia04/realpython-reader/actions/workflows/bump-and-publish.yml/badge.svg)](https://github.com/tchia04/realpython-reader/actions/workflows/bump-and-publish.yml)


Check the pypi package at 

https://pypi.org/project/realpython-reader-tchia/

## How to bump the version
### Patch 
To change to automatically increment the patch version portion of the version string, 

Edit this line and change it to patch

https://github.com/tchia04/realpython-reader/blob/master/.github/workflows/bump-and-publish.yml#L32


### Minor
To change to automatically increment the patch version portion of the version string, 

Edit this line and change it to minor

https://github.com/tchia04/realpython-reader/blob/master/.github/workflows/bump-and-publish.yml#L32

To resume auto increment the patch version, make sure to change it back to patch after the minor version and package is successful 
so the next version incremented in patch and not minor again. 

### Major
To change to automatically increment the patch version portion of the version string, 

Edit this line and change it to major

https://github.com/tchia04/realpython-reader/blob/master/.github/workflows/bump-and-publish.yml#L32

To resume auto increment the patch version, make sure to change it back to patch after the minor version and package is successful 
so the next version incremented in patch and not minor again. 

## Installation

You can install the Real Python Feed Reader from [PyPI](https://pypi.org/project/realpython-reader/):

    pip install realpython-reader

The reader is supported on Python 2.7, as well as Python 3.4 and above.

## How to use

The Real Python Feed Reader is a command line application, named `realpython`. To see a list of the [latest Real Python tutorials](https://realpython.com/) simply call the program:

    $ realpython
    The latest tutorials from Real Python (https://realpython.com/)
     0 How to Publish an Open-Source Python Package to PyPI
     1 Python "while" Loops (Indefinite Iteration)
     2 Writing Comments in Python (Guide)
     3 Setting Up Python for Machine Learning on Windows
     4 Python Community Interview With Michael Kennedy
     5 Practical Text Classification With Python and Keras
     6 Getting Started With Testing in Python
     7 Python, Boto3, and AWS S3: Demystified
     8 Python's range() Function (Guide)
     9 Python Community Interview With Mike Grouchy
    10 How to Round Numbers in Python
    11 Building and Documenting Python REST APIs With Flask and Connexion – Part 2
    12 Splitting, Concatenating, and Joining Strings in Python
    13 Image Segmentation Using Color Spaces in OpenCV + Python
    14 Python Community Interview With Mahdi Yusuf
    15 Absolute vs Relative Imports in Python
    16 Top 10 Must-Watch PyCon Talks
    17 Logging in Python
    18 The Best Python Books
    19 Conditional Statements in Python

To read one particular tutorial, call the program with the numerical ID of the tutorial as a parameter:

    $ realpython 0
    # How to Publish an Open-Source Python Package to PyPI

    Python is famous for coming with batteries included. Sophisticated
    capabilities are available in the standard library. You can find modules for
    working with sockets, parsing CSV, JSON, and XML files, and working with
    files and file paths.

    However great the packages included with Python are, there are many
    fantastic projects available outside the standard library. These are most
    often hosted at the Python Packaging Index (PyPI), historically known as the
    Cheese Shop. At PyPI, you can find everything from Hello World to advanced
    deep learning libraries.

    [... The full text of the article ...]

You can also call the Real Python Feed Reader in your own Python code, by importing from the `reader` package:

    >>> from reader import feed
    >>> feed.get_titles()
    ['How to Publish an Open-Source Python Package to PyPI', ...]





