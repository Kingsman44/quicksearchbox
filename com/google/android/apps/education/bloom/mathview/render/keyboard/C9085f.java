package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.util.SparseArray;
import com.google.android.apps.education.bloom.mathview.render.comm.InsertCodePointAsSubscriptCommand;
import com.google.android.apps.education.bloom.mathview.render.comm.InsertCodePointAsSuperscriptCommand;
import com.google.android.apps.education.bloom.mathview.render.comm.InsertLatexCommandWithEditorMarkers;
import com.google.android.apps.education.bloom.mathview.render.comm.InsertPrimeCommand;
import com.google.android.apps.education.bloom.mathview.render.comm.InsertRowBelowCommand;
import com.google.android.apps.education.bloom.mathview.render.comm.KeyboardCommand;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Arrays;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.f */
/* compiled from: PG */
public final class C9085f {

    /* renamed from: a */
    public static final C9085f f31334a = new C9085f();

    /* renamed from: b */
    public static final SparseArray f31335b;

    /* renamed from: c */
    public static final SparseArray f31336c = new SparseArray();

    /* renamed from: d */
    private static final int[] f31337d = {R.id.variable, R.id.greek};

    static {
        SparseArray sparseArray = new SparseArray();
        m23624d(sparseArray, R.id.add_row, InsertRowBelowCommand.f31286a);
        m23624d(sparseArray, R.id.left_parenthesis, new InsertLatexCommandWithEditorMarkers("("));
        m23624d(sparseArray, R.id.right_parenthesis, new InsertLatexCommandWithEditorMarkers(")"));
        m23624d(sparseArray, R.id.fraction, new InsertLatexCommandWithEditorMarkers("\\frac{\\selection}{\\cursorIfSelection}"));
        m23624d(sparseArray, R.id.fraction_with_base, new InsertLatexCommandWithEditorMarkers("\\cursor\\frac{}{}"));
        m23624d(sparseArray, R.id.exponent, new InsertCodePointAsSuperscriptCommand(50));
        m23624d(sparseArray, R.id.exponent_three, new InsertCodePointAsSuperscriptCommand(51));
        m23624d(sparseArray, R.id.exponent_custom, new InsertLatexCommandWithEditorMarkers("{}^{\\selection}"));
        m23624d(sparseArray, R.id.root, new InsertLatexCommandWithEditorMarkers("\\sqrt{\\selection}"));
        m23624d(sparseArray, R.id.root_cubed, new InsertLatexCommandWithEditorMarkers("\\sqrt[3]{\\selection}"));
        m23624d(sparseArray, R.id.root_custom, new InsertLatexCommandWithEditorMarkers("\\sqrt[\\cursor]{\\selection}"));
        m23624d(sparseArray, R.id.function, new InsertLatexCommandWithEditorMarkers("f(x)"));
        m23624d(sparseArray, R.id.function_g, new InsertLatexCommandWithEditorMarkers("g(x)"));
        m23624d(sparseArray, R.id.function_custom, new InsertLatexCommandWithEditorMarkers("\\cursor()"));
        m23624d(sparseArray, R.id.pi, new InsertLatexCommandWithEditorMarkers("\\pi"));
        m23624d(sparseArray, R.id.pi_over_two, new InsertLatexCommandWithEditorMarkers("\\frac{\\pi}{2}"));
        m23624d(sparseArray, R.id.pi_over_three, new InsertLatexCommandWithEditorMarkers("\\frac{\\pi}{3}"));
        m23624d(sparseArray, R.id.zero, new InsertLatexCommandWithEditorMarkers("0"));
        m23624d(sparseArray, R.id.one, new InsertLatexCommandWithEditorMarkers("1"));
        m23624d(sparseArray, R.id.two, new InsertLatexCommandWithEditorMarkers("2"));
        m23624d(sparseArray, R.id.three, new InsertLatexCommandWithEditorMarkers("3"));
        m23624d(sparseArray, R.id.four, new InsertLatexCommandWithEditorMarkers("4"));
        m23624d(sparseArray, R.id.five, new InsertLatexCommandWithEditorMarkers("5"));
        m23624d(sparseArray, R.id.six, new InsertLatexCommandWithEditorMarkers("6"));
        m23624d(sparseArray, R.id.seven, new InsertLatexCommandWithEditorMarkers("7"));
        m23624d(sparseArray, R.id.eight, new InsertLatexCommandWithEditorMarkers("8"));
        m23624d(sparseArray, R.id.nine, new InsertLatexCommandWithEditorMarkers("9"));
        m23624d(sparseArray, R.id.period, new InsertLatexCommandWithEditorMarkers("."));
        m23624d(sparseArray, R.id.equals, new InsertLatexCommandWithEditorMarkers("="));
        m23624d(sparseArray, R.id.plus, new InsertLatexCommandWithEditorMarkers("+"));
        m23624d(sparseArray, R.id.subtract, new InsertLatexCommandWithEditorMarkers("-"));
        m23624d(sparseArray, R.id.divide, new InsertLatexCommandWithEditorMarkers("/"));
        m23624d(sparseArray, R.id.multiply, new InsertLatexCommandWithEditorMarkers("\\times"));
        m23624d(sparseArray, R.id.less, new InsertLatexCommandWithEditorMarkers("<"));
        m23624d(sparseArray, R.id.less_eq, new InsertLatexCommandWithEditorMarkers("\\leq"));
        m23624d(sparseArray, R.id.greater, new InsertLatexCommandWithEditorMarkers(">"));
        m23624d(sparseArray, R.id.greater_eq, new InsertLatexCommandWithEditorMarkers("\\geq"));
        m23624d(sparseArray, R.id.log, new InsertLatexCommandWithEditorMarkers("\\log"));
        m23624d(sparseArray, R.id.log_custom, new InsertLatexCommandWithEditorMarkers("\\log_{\\cursor}"));
        m23624d(sparseArray, R.id.natural_log, new InsertLatexCommandWithEditorMarkers("\\ln"));
        m23624d(sparseArray, R.id.e, new InsertLatexCommandWithEditorMarkers("e"));
        m23624d(sparseArray, R.id.exp, new InsertLatexCommandWithEditorMarkers("e^{\\selection}"));
        m23624d(sparseArray, R.id.abs, new InsertLatexCommandWithEditorMarkers("\\left|\\cursor\\right|"));
        m23624d(sparseArray, R.id.abs_single, new InsertLatexCommandWithEditorMarkers("|"));
        m23624d(sparseArray, R.id.bin_base, new InsertCodePointAsSubscriptCommand(50));
        m23624d(sparseArray, R.id.tri_base, new InsertCodePointAsSubscriptCommand(51));
        m23624d(sparseArray, R.id.custom_base, new InsertLatexCommandWithEditorMarkers("{}_{\\selection}"));
        m23624d(sparseArray, R.id.degree_base, new InsertLatexCommandWithEditorMarkers("\\cursor\\degree"));
        m23624d(sparseArray, R.id.sin, new InsertLatexCommandWithEditorMarkers("\\sin"));
        m23624d(sparseArray, R.id.csc, new InsertLatexCommandWithEditorMarkers("\\csc"));
        m23624d(sparseArray, R.id.arcsin, new InsertLatexCommandWithEditorMarkers("\\arcsin"));
        m23624d(sparseArray, R.id.sinh, new InsertLatexCommandWithEditorMarkers("\\sinh"));
        m23624d(sparseArray, R.id.cos, new InsertLatexCommandWithEditorMarkers("\\cos"));
        m23624d(sparseArray, R.id.sec, new InsertLatexCommandWithEditorMarkers("\\sec"));
        m23624d(sparseArray, R.id.arccos, new InsertLatexCommandWithEditorMarkers("\\arccos"));
        m23624d(sparseArray, R.id.cosh, new InsertLatexCommandWithEditorMarkers("\\cosh"));
        m23624d(sparseArray, R.id.tan, new InsertLatexCommandWithEditorMarkers("\\tan"));
        m23624d(sparseArray, R.id.cot, new InsertLatexCommandWithEditorMarkers("\\cot"));
        m23624d(sparseArray, R.id.tanh, new InsertLatexCommandWithEditorMarkers("\\tanh"));
        m23624d(sparseArray, R.id.arctan, new InsertLatexCommandWithEditorMarkers("\\arctan"));
        m23624d(sparseArray, R.id.integral, new InsertLatexCommandWithEditorMarkers("\\int \\cursor dx"));
        m23624d(sparseArray, R.id.integral_custom, new InsertLatexCommandWithEditorMarkers("\\int_{\\cursor}^{}dx"));
        m23624d(sparseArray, R.id.derivative, new InsertLatexCommandWithEditorMarkers("\\frac{d}{dx}"));
        m23624d(sparseArray, R.id.derivative_var, new InsertLatexCommandWithEditorMarkers("\\frac{d}{d\\cursor}"));
        m23624d(sparseArray, R.id.limit, new InsertLatexCommandWithEditorMarkers("\\lim_{\\cursor\\rightarrow}"));
        m23624d(sparseArray, R.id.limit_plus, new InsertLatexCommandWithEditorMarkers("\\lim_{\\cursor\\rightarrow{}^{+}}"));
        m23624d(sparseArray, R.id.limit_minus, new InsertLatexCommandWithEditorMarkers("\\lim_{\\cursor\\rightarrow{}^{-}}"));
        m23624d(sparseArray, R.id.right_arrow, new InsertLatexCommandWithEditorMarkers("\\rightarrow"));
        m23624d(sparseArray, R.id.theta, new InsertLatexCommandWithEditorMarkers("\\theta"));
        m23624d(sparseArray, R.id.factorial, new InsertLatexCommandWithEditorMarkers("!"));
        m23624d(sparseArray, R.id.percentage, new InsertLatexCommandWithEditorMarkers("\\%"));
        m23624d(sparseArray, R.id.imaginary, new InsertLatexCommandWithEditorMarkers("i"));
        m23624d(sparseArray, R.id.inf, new InsertLatexCommandWithEditorMarkers("\\infty"));
        m23624d(sparseArray, R.id.sum, new InsertLatexCommandWithEditorMarkers("\\sum_{\\cursor}^{}"));
        m23624d(sparseArray, R.id.comma, new InsertLatexCommandWithEditorMarkers(","));
        m23624d(sparseArray, R.id.prime, InsertPrimeCommand.f31285a);
        f31335b = sparseArray;
    }

    private C9085f() {
    }

    /* renamed from: a */
    public static final boolean m23621a(int i) {
        if (f31335b.indexOfKey(i) < 0) {
            return true;
        }
        int[] iArr = f31337d;
        C69664n.m101061g(iArr, "<this>");
        C69664n.m101061g(iArr, "<this>");
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            } else if (i != iArr[i2]) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m23622b(int i, ArrayList arrayList) {
        if (m23621a(i)) {
            if (arrayList == null || arrayList.isEmpty()) {
                f31336c.remove(i);
            } else {
                f31336c.put(i, arrayList);
            }
        }
    }

    /* renamed from: c */
    public static final void m23623c(int i, String str) {
        C69664n.m101061g(str, "latex");
        m23622b(i, C69540x.m100946d(new InsertLatexCommandWithEditorMarkers(str)));
    }

    /* renamed from: d */
    private static final void m23624d(SparseArray sparseArray, int i, KeyboardCommand... keyboardCommandArr) {
        sparseArray.put(i, C69540x.m100946d(Arrays.copyOf(keyboardCommandArr, 1)));
    }
}
