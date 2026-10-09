<div align="center">
<table>
  <tr>
    <td><pre>
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
</pre></td>
  </tr>
</table>
</div>

<h1 align="center">star_trees</h1>

<p align="center">
  Print all the classic star patterns in your console with a few loops ☆*: .｡. o(≧▽≦)o .｡.:*☆
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java">
</p>

<p align="center">
  <a href="https://github.com/SalimMc/star_trees/stargazers">
    <img src="https://img.shields.io/github/stars/SalimMc/star_trees?style=for-the-badge" alt="GitHub stars">
  </a>
  <a href="https://github.com/SalimMc/star_trees/network/members">
    <img src="https://img.shields.io/github/forks/SalimMc/star_trees?style=for-the-badge" alt="GitHub forks">
  </a>
</p>

This repository gathers small Java programs that each draw a star (`*`) pattern in the console using nested loops: triangles, pyramids, diamonds, squares and more!!! Every pattern is a standalone class with its own `main` method and no dependencies. (o゜▽゜)o☆



## o(*￣▽￣*)o Usage

Clone the repo, compile all the classes with a JDK (8 or later), then run the pattern you want by its class name:

```bash
javac -d out src/*.java
```

```bash
java -cp out DiamondStar
```


## 🔄 Customization

Change the size of any pattern by editing the `public static` constants at the top of its class (`NB_LINES`, `NB_COLUMNS`, `SIDE_LENGTH`, `WIDTH`, `LENGTH`), then recompile. For centered shapes, keep `NB_COLUMNS` equal to `2 * NB_LINES - 1` so the pattern stays symmetric.


## ✨ Patterns

### Triangles

<table>
  <tr>
    <th><code>LeftTriangleStar</code></th>
    <th><code>RightTriangleStar</code></th>
    <th><code>ReverseLeftTriangleStar</code></th>
    <th><code>ReverseRightTriangleStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
*
**
***
****
*****
</pre></td>
    <td valign="top"><pre>
    *
   **
  ***
 ****
*****
</pre></td>
    <td valign="top"><pre>
*****
****
***
**
*
</pre></td>
    <td valign="top"><pre>
*****
 ****
  ***
   **
    *
</pre></td>
  </tr>
</table>

### Pyramids

<table>
  <tr>
    <th><code>PyramidStar</code></th>
    <th><code>ReversePyramidStar</code></th>
    <th><code>PyramidSpaceStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
     *
    ***
   *****
  *******
 *********
</pre></td>
    <td valign="top"><pre>
***********
 *********
  *******
   *****
    ***
     *
</pre></td>
    <td valign="top"><pre>
     *
    * *
   * * *
  * * * *
 * * * * *
</pre></td>
  </tr>
</table>

<table>
  <tr>
    <th><code>HollowPyramidStar</code></th>
    <th><code>ReverseHollowPyramidStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
    *
   * *
  *   *
 *     *
*********
</pre></td>
    <td valign="top"><pre>
***********
 *       *
  *     *
   *   *
    * *
     *
</pre></td>
  </tr>
</table>

### Diamonds

<table>
  <tr>
    <th><code>DiamondStar</code></th>
    <th><code>HollowDiamondStar</code></th>
    <th><code>HalfDiamondStar</code></th>
    <th><code>ReverseHalfDiamondStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
</pre></td>
    <td valign="top"><pre>
     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *
</pre></td>
    <td valign="top"><pre>
*
**
***
****
*****
****
***
**
*
</pre></td>
    <td valign="top"><pre>
*****
****
***
**
*
**
***
****
*****
</pre></td>
  </tr>
</table>

### Squares and rectangles

<table>
  <tr>
    <th><code>SquareStar</code></th>
    <th><code>HollowSquareStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
*****
*****
*****
*****
*****
</pre></td>
    <td valign="top"><pre>
*****
*   *
*   *
*   *
*****
</pre></td>
  </tr>
</table>

<table>
  <tr>
    <th><code>RectangleStar</code></th>
    <th><code>HollowRectangleStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
********************
********************
********************
********************
********************
</pre></td>
    <td valign="top"><pre>
********************
*                  *
*                  *
*                  *
********************
</pre></td>
  </tr>
</table>

### Other

<table>
  <tr>
    <th><code>PlusStar</code></th>
  </tr>
  <tr>
    <td valign="top"><pre>
    *
    *
*********
    *
    *
</pre></td>
  </tr>
</table>

---

## 📂 Repository structure

```text
star_trees
│
├── src/
│   ├── LeftTriangleStar.java
│   ├── RightTriangleStar.java
│   ├── ReverseLeftTriangleStar.java
│   ├── ReverseRightTriangleStar.java
│   ├── PyramidStar.java
│   ├── ReversePyramidStar.java
│   ├── PyramidSpaceStar.java
│   ├── HollowPyramidStar.java
│   ├── ReverseHollowPyramidStar.java
│   ├── DiamondStar.java
│   ├── HollowDiamondStar.java
│   ├── HalfDiamondStar.java
│   ├── ReverseHalfDiamondStar.java
│   ├── SquareStar.java
│   ├── HollowSquareStar.java
│   ├── RectangleStar.java
│   ├── HollowRectangleStar.java
│   └── PlusStar.java
│
├── README.md
├── LICENSE
└── .gitignore
```

---

## ༼ つ ◕_◕ ༽つ Contributors



<a href="https://github.com/SalimMc/star_trees/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=SalimMc/star_trees" alt="Contributors">
</a>


---

## 📄 License

Licensed under MIT License. For further information, see the [LICENSE](LICENSE.md) file.

---

<p align="center">

Made with ❤️ by SalimMc

⭐ If this repository helped you, you know what to do!

</p>
