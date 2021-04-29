import java.util.HashSet;
import java.util.Set;

public enum a6 implements y0 {
    qp("BLOCK_INDENT", 0, "Java indentation options", "Indent block contents", "public void f()\n{\n    int i;\n}", "public void f()\n{\nint i;\n}"),
	k2("ARRAY_INDENT", 1, "Java indentation options", "Indent array initializer", "int[] arr = new int[]\n{\n    1\n};", "int[] arr = new int[]\n{\n1\n};"),
	zh("BRACE_INDENT", 2, "Java indentation options", "Indent open and close brace", "public void f()\n    {\n        int i;\n    }", "public void f()\n{\n    int i;\n}"),
	AL("CASE_INDENT", 3, "Java indentation options", "Indent case contents", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\n    case 10:\n    return 5;\n}"),
	w9("CASELABEL_INDENT", 4, "Java indentation options", "Indent case labels", "switch (x)\n{\n    case 10:\n        return 5;\n}", "switch (x)\n{\ncase 10:\n    return 5;\n}"),
	hK("LABELLEFT_INDENT", 5, "Java indentation options", "Indent goto labels in leftmost column", "    goto L;\nL:\n    return;", "    goto L;\n    L:\n    return;"),
	cT("NEXTLINE_INDENT", 6, "Java indentation options", "Indent lines in multi line statements", "int i = 10 +\n    20;", "int i = 10 +\n20;"),
	q7("ARGUMENT_INDENT", 7, "Java indentation options", "Align arguments", "System.out.println(\"\",\n                  20);", "System.out.println(\"\",\n    20);"),
	Z1("PARAMETER_INDENT", 8, "Java indentation options", "Align parameters", "void foo(int i,\n         int j)\n{\n}", "void foo(int i,\n    int j)\n{\n}"),
	n5("ADJUST_NEWLINES", 9, "Java new line options", "Adjust lines on autoformat", "", ""),
	Q6("TYPE_NEWLINE", 10, "Java new line options", "Place open brace on new line for types", "public class C\n{\n    //...\n}", "public class C {\n    //...\n}"),
	kf("METHOD_NEWLINE", 11, "Java new line options", "Place open brace on new line for methods", "public void f()\n{\n    //...\n}", "public void f() {\n    //...\n}"),
	Jl("BLOCK_NEWLINE", 12, "Java new line options", "Place open brace on new line for control blocks", "public void f()\n{\n    if (a < b)\n    {\n    }\n}", "public void f()\n{\n    if (a < b) {\n    }\n}"),
	iW("ELSE_NEWLINE", 13, "Java new line options", "Place \"else\" on new line", "if (i == 10) {\n    return 10;\n}\nelse {\n    return 0;\n}", "if (i == 10) {\n    return 10;\n} else {\n    return 0;\n}"),
	eU("CATCH_NEWLINE", 14, "Java new line options", "Place \"catch\" on new line", "try {\n}\ncatch {\n}", "try {\n} catch {\n}"),
	e3("FINALLY_NEWLINE", 15, "Java new line options", "Place \"finally\" on new line", "try {\n}\nfinally {\n}", "try {\n} finally {\n}"),
	sE("STATEMENT_WRAP", 16, "Java wrapping options", "Place statement in a new line if it doesn't fit", "int i;\ni = 10;", "int i; i = 10;"),
	sg("ADJUST_SPACES", 17, "Java spacing options", "Adjust spaces on autoformat", "", ""),
	pO("BRACE_SPACE", 18, "Java spacing options", "Insert space before open brace", "public class C {\n    //...\n}", "public class C{\n    //...\n}"),
	fN("METHODNAME_SPACE", 19, "Java spacing options", "Insert space before parameters", "public void f ()\n{\n}", "public void f()\n{\n}"),
	Gj("PARAMETER_SPACE", 20, "Java spacing options", "Insert space within parameter parentheses", "public void f( int i )\n{\n}", "public void f(int i)\n{\n}"),
	Cz("PARAMETERCOMMA_SPACE", 21, "Java spacing options", "Insert space after each parameter", "public void f(int i, int j)\n{\n}", "public void f(int i,int j)\n{\n}"),
	pN("KEYWORD_SPACE", 22, "Java spacing options", "Insert space after keywords", "if (a == b) return 0;", "if(a == b) return 0;"),
	oy("CONDITION_SPACE", 23, "Java spacing options", "Insert space within statement parentheses", "if ( a == b ) return 0;", "if (a == b) return 0;"),
	aX("PAREN_SPACE", 24, "Java spacing options", "Insert space within parentheses", "int i = ( 10 + 20 ) * 5;", "int i = (10 + 20) * 5;"),
	e9("METHODCALL_SPACE", 25, "Java spacing options", "Insert space before arguments", "System.out.println (10);", "System.out.println(10);"),
	QO("ARGUMENT_SPACE", 26, "Java spacing options", "Insert space within argument parentheses", "System.out.println( 10 );", "System.out.println(10);"),
	sM("ARGUMENTCOMMA_SPACE", 27, "Java spacing options", "Insert space after each argument", "System.out.println(\"\", 20);", "System.out.println(\"\",20);"),
	a5("ARRAYMETHODCALL_SPACE", 28, "Java spacing options", "Insert space before array brackets", "int i = ai [10];", "int i = ai[10];"),
	ys("ARRAYARGUMENT_SPACE", 29, "Java spacing options", "Insert space within array brackets", "int i = ai[ 10 ];", "int i = ai[10];"),
	IS("BINARYOPERATOR_SPACE", 30, "Java spacing options", "Insert space around binary operator ", "int i;\ni = 10 + 20;", "int i;\ni = 10+20;"),
	gG("ASSIGNMENTOPERATOR_SPACE", 31, "Java spacing options", "Insert space around assignment operator ", "int i;\ni = 10;", "int i;\ni=10;");

	private final String WB;
    private final String fY;
    private final String jw;
    private final String mb;
	
    private a6(String str, int i, String str2, String str3, String str4, String str5) {
        this.WB = str2;
		this.mb = str3;
		this.jw = str4;
		this.fY = str5;
    }

    public static Set<a6> j6() {
		HashSet hashSet = new HashSet();
		hashSet.add(n5);
		hashSet.add(sg);
		hashSet.add(Q6);
		hashSet.add(kf);
		hashSet.add(Jl);
		hashSet.add(iW);
		hashSet.add(eU);
		hashSet.add(e3);
		hashSet.add(sE);
		hashSet.add(Cz);
		hashSet.add(pN);
		hashSet.add(pO);
		hashSet.add(sM);
		hashSet.add(IS);
		hashSet.add(gG);
		hashSet.add(qp);
		hashSet.add(k2);
		hashSet.add(AL);
		hashSet.add(w9);
		hashSet.add(q7);
		hashSet.add(Z1);
		hashSet.add(cT);
		return hashSet;
    }

    public static <E> a6 valueOf(String str) {
        return Enum.valueOf(a6.class, str);
    }

    public String DW() {
        return this.WB;
    }

    public String FH() {
        return "java_" + name();
    }

    public String getName() {
        return this.mb;
    }

    public String v5(boolean z) {
        return z ? this.jw : this.fY;
    }
}
