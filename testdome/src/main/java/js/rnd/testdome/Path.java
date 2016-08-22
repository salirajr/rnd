package js.rnd.testdome;

import java.util.Stack;

//@formatter:off
//	Write a function that provides change directory (cd) function for an abstract file system.

//	Notes:
//	1. Root path is '/'.
//	2. Path separator is '/'.
//	3. Parent directory is addressable as "..".
//	4. Directory names consist only of English alphabet letters (A-Z and a-z).
//	5. For example, new Path("/a/b/c/d").cd("../x").getPath() should return "/a/b/c/x".

//	Note: The evaluation environment uses '\' as the path separator.
// @formatter:on

public class Path {
	private String path;

	public Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public Path cd(String newPath) {
		newPath = path + "/" + newPath;
		String[] newPaths = newPath.split("/");
		String result = "";
		Stack<String> cdir = new Stack<String>();
		for (int i = 1; i < newPaths.length; i++) {
			if (newPaths[i].equals("..")) {
				cdir.pop();
			} else {
				cdir.add(newPaths[i]);
			}
		}
		for (String dir : cdir) {
			
			result += "/" + dir;
		}

		return new Path(result);
	}

	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
		System.out.println(path.cd("../x").getPath());
		System.out.println(path.cd("../../x/../y/../z").getPath());
	}
}