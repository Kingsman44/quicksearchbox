package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.p3589d.p3590a.C45704u;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.i */
/* compiled from: PG */
public final class C9088i {

    /* renamed from: a */
    public static final C9088i f31339a = new C9088i();

    /* renamed from: b */
    static final /* synthetic */ C69713k[] f31340b;

    /* renamed from: c */
    public static final SparseArray f31341c = new SparseArray();

    /* renamed from: d */
    public static final SparseArray f31342d = new SparseArray();

    /* renamed from: e */
    public static final C69684c f31343e = new C9087h();

    /* renamed from: f */
    private static final List f31344f = C69540x.m100947e(C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.exponent), Integer.valueOf(R.id.exponent_three), Integer.valueOf(R.id.exponent_custom), Integer.valueOf(R.id.left_parenthesis), Integer.valueOf(R.id.right_parenthesis), Integer.valueOf(R.id.zero), Integer.valueOf(R.id.one), Integer.valueOf(R.id.two), Integer.valueOf(R.id.three), Integer.valueOf(R.id.four), Integer.valueOf(R.id.five), Integer.valueOf(R.id.six), Integer.valueOf(R.id.seven), Integer.valueOf(R.id.eight), Integer.valueOf(R.id.nine), Integer.valueOf(R.id.divide), Integer.valueOf(R.id.multiply), Integer.valueOf(R.id.subtract), Integer.valueOf(R.id.plus), Integer.valueOf(R.id.pi), Integer.valueOf(R.id.period), Integer.valueOf(R.id.equals), Integer.valueOf(R.id.less), Integer.valueOf(R.id.less_eq), Integer.valueOf(R.id.greater), Integer.valueOf(R.id.greater_eq), Integer.valueOf(R.id.e), Integer.valueOf(R.id.exp), Integer.valueOf(R.id.abs), Integer.valueOf(R.id.bin_base), Integer.valueOf(R.id.tri_base), Integer.valueOf(R.id.custom_base), Integer.valueOf(R.id.degree_base), Integer.valueOf(R.id.sin), Integer.valueOf(R.id.cos), Integer.valueOf(R.id.tan), Integer.valueOf(R.id.inf), Integer.valueOf(R.id.theta), Integer.valueOf(R.id.factorial), Integer.valueOf(R.id.percentage), Integer.valueOf(R.id.imaginary), Integer.valueOf(R.id.comma), Integer.valueOf(R.id.prime), Integer.valueOf(R.id.variable), Integer.valueOf(R.id.abs_single), Integer.valueOf(R.id.right_arrow), Integer.valueOf(R.id.greek)}), C69514bd.m100887a(Integer.valueOf(R.id.sum)), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.derivative), Integer.valueOf(R.id.limit), Integer.valueOf(R.id.integral)}), C69514bd.m100887a(Integer.valueOf(R.id.fraction)), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.fraction_with_base), Integer.valueOf(R.id.log), Integer.valueOf(R.id.natural_log), Integer.valueOf(R.id.root), Integer.valueOf(R.id.function)}), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.log_custom), Integer.valueOf(R.id.function_g), Integer.valueOf(R.id.function_custom), Integer.valueOf(R.id.pi_over_two), Integer.valueOf(R.id.pi_over_three)}), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.root_cubed), Integer.valueOf(R.id.root_custom)}), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.sec), Integer.valueOf(R.id.arccos), Integer.valueOf(R.id.cosh)}), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.csc), Integer.valueOf(R.id.arcsin), Integer.valueOf(R.id.sinh)}), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.cot), Integer.valueOf(R.id.tanh), Integer.valueOf(R.id.arctan)}), C69514bd.m100887a(Integer.valueOf(R.id.integral_custom)), C69514bd.m100887a(Integer.valueOf(R.id.derivative_var)), C69531o.m100939p(new Integer[]{Integer.valueOf(R.id.limit_plus), Integer.valueOf(R.id.limit_minus)}));

    static {
        C69669s sVar = new C69669s(C9088i.class, "typeface", "getTypeface()Landroid/graphics/Typeface;");
        int i = C69649af.f186028a;
        f31340b = new C69713k[]{sVar};
    }

    private C9088i() {
    }

    /* renamed from: a */
    public final void mo17405a(ImageView imageView) {
        String str;
        String str2;
        String str3;
        C69664n.m101061g(imageView, "view");
        Context context = imageView.getContext();
        C69664n.m101060f(context, "view.context");
        int id = imageView.getId();
        C45704u uVar = (C45704u) f31342d.get(id);
        if (uVar == null || (str = uVar.mo49750c()) == null) {
            int a = C1878d.m5128a(context, R.color.keyboard_button_vector_dashed_lines);
            String str4 = "\\color{#" + Integer.toHexString((a << 8) | Color.alpha(a)) + "}{\\placeholder}";
            if (id == R.id.fraction) {
                str = "\\frac{" + str4 + "}{" + str4 + "}";
            } else if (id == R.id.fraction_with_base) {
                str = str4 + "\\frac{" + str4 + "}{" + str4 + "}";
            } else {
                if (id == R.id.exponent) {
                    str3 = "^{2}";
                } else if (id == R.id.exponent_three) {
                    str3 = "^{3}";
                } else if (id == R.id.exponent_custom) {
                    str = str4 + "^{" + str4 + "}";
                } else if (id == R.id.root) {
                    str = "\\sqrt{" + str4 + "}";
                } else if (id == R.id.root_cubed) {
                    str = "\\sqrt[3]{" + str4 + "}";
                } else if (id == R.id.root_custom) {
                    str = "\\sqrt[" + str4 + "]{" + str4 + "}";
                } else if (id == R.id.left_parenthesis) {
                    str = "(";
                } else if (id == R.id.right_parenthesis) {
                    str = ")";
                } else if (id == R.id.zero) {
                    str = "0";
                } else if (id == R.id.one) {
                    str = "1";
                } else if (id == R.id.two) {
                    str = "2";
                } else if (id == R.id.three) {
                    str = "3";
                } else if (id == R.id.four) {
                    str = "4";
                } else if (id == R.id.five) {
                    str = "5";
                } else if (id == R.id.six) {
                    str = "6";
                } else if (id == R.id.seven) {
                    str = "7";
                } else if (id == R.id.eight) {
                    str = "8";
                } else if (id == R.id.nine) {
                    str = "9";
                } else if (id == R.id.divide) {
                    str = "\\div";
                } else if (id == R.id.multiply) {
                    str = "\\times";
                } else if (id == R.id.subtract) {
                    str = "-";
                } else if (id == R.id.plus) {
                    str = "+";
                } else if (id == R.id.function) {
                    str = "f\\left(x\\right)";
                } else if (id == R.id.function_g) {
                    str = "g\\left(x\\right)";
                } else if (id == R.id.function_custom) {
                    str = str4 + "\\left(" + str4 + "\\right)";
                } else if (id == R.id.pi) {
                    str = "\\pi";
                } else if (id == R.id.pi_over_two) {
                    str = "\\pi / 2";
                } else if (id == R.id.pi_over_three) {
                    str = "\\pi / 3";
                } else if (id == R.id.period) {
                    str = ".";
                } else if (id == R.id.equals) {
                    str = "=";
                } else if (id == R.id.less) {
                    str = "<";
                } else if (id == R.id.less_eq) {
                    str = "\\leq";
                } else if (id == R.id.greater) {
                    str = ">";
                } else if (id == R.id.greater_eq) {
                    str = "\\geq";
                } else if (id == R.id.log) {
                    str = "\\log ".concat(str4);
                } else if (id == R.id.log_custom) {
                    str = "\\log_{" + str4 + "} " + str4;
                } else if (id == R.id.natural_log) {
                    str = "\\ln ".concat(str4);
                } else if (id == R.id.e) {
                    str = "e";
                } else if (id == R.id.exp) {
                    str = "e^{" + str4 + "}";
                } else if (id == R.id.abs) {
                    str = "\\left| " + str4 + " \\right|";
                } else if (id == R.id.abs_single) {
                    str = "|";
                } else {
                    if (id == R.id.bin_base) {
                        str2 = "_{2}";
                    } else if (id == R.id.tri_base) {
                        str2 = "_{3}";
                    } else if (id == R.id.custom_base) {
                        str = str4 + "_{" + str4 + "}";
                    } else if (id == R.id.degree_base) {
                        str = str4.concat("^{\\circ}");
                    } else if (id == R.id.sin) {
                        str = "\\sin";
                    } else if (id == R.id.csc) {
                        str = "\\csc";
                    } else if (id == R.id.arcsin) {
                        str = "\\arcsin";
                    } else if (id == R.id.sinh) {
                        str = "\\sinh";
                    } else if (id == R.id.cos) {
                        str = "\\cos";
                    } else if (id == R.id.sec) {
                        str = "\\sec";
                    } else if (id == R.id.arccos) {
                        str = "\\arccos";
                    } else if (id == R.id.cosh) {
                        str = "\\cosh";
                    } else if (id == R.id.tan) {
                        str = "\\tan";
                    } else if (id == R.id.cot) {
                        str = "\\cot";
                    } else if (id == R.id.arctan) {
                        str = "\\arctan";
                    } else if (id == R.id.tanh) {
                        str = "\\tanh";
                    } else if (id == R.id.integral) {
                        str = "\\int " + str4 + " dx";
                    } else if (id == R.id.integral_custom) {
                        str = "\\int_{" + str4 + "}^{" + str4 + "}" + str4 + " dx";
                    } else if (id == R.id.derivative) {
                        str = "\\frac{d}{dx} ".concat(str4);
                    } else if (id == R.id.derivative_var) {
                        str = "\\frac{d}{d" + str4 + "} " + str4;
                    } else if (id == R.id.inf) {
                        str = "\\infty";
                    } else if (id == R.id.theta) {
                        str = "\\theta";
                    } else if (id == R.id.factorial) {
                        str = "!";
                    } else if (id == R.id.percentage) {
                        str = "\\%";
                    } else if (id == R.id.limit) {
                        str = "\\lim_{" + str4 + " \\rightarrow " + str4 + "} " + str4;
                    } else if (id == R.id.limit_plus) {
                        str = "\\lim_{" + str4 + " \\rightarrow " + str4 + "^{+}} " + str4;
                    } else if (id == R.id.limit_minus) {
                        str = "\\lim_{" + str4 + " \\rightarrow " + str4 + "^{-}} " + str4;
                    } else if (id == R.id.right_arrow) {
                        str = "\\rightarrow";
                    } else if (id == R.id.sum) {
                        str = "\\sum_{" + str4 + "}^{" + str4 + "} " + str4;
                    } else {
                        str = id == R.id.imaginary ? "i" : id == R.id.comma ? "," : id == R.id.prime ? "'" : null;
                    }
                    str = str4.concat(str2);
                }
                str = str4.concat(str3);
            }
        }
        if (str != null) {
            int id2 = imageView.getId();
            Iterator it = f31344f.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((Set) it.next()).contains(Integer.valueOf(id2))) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                i = i2;
            }
            SparseArray sparseArray = f31341c;
            C9086g gVar = new C9086g(imageView);
            Object obj = sparseArray.get(i);
            if (obj == null) {
                obj = gVar.mo5761a(Integer.valueOf(i));
                sparseArray.put(i, obj);
            }
            imageView.setTag(R.id.key_latex_tag, str);
            imageView.setImageDrawable((Drawable) null);
            ((C9084e) obj).mo17401c(imageView);
        }
    }

    /* renamed from: b */
    public final void mo17406b(ImageView imageView, C45704u uVar) {
        C69664n.m101061g(imageView, "view");
        C9085f fVar = C9085f.f31334a;
        if (C9085f.m23621a(imageView.getId())) {
            if (uVar == null) {
                f31342d.remove(imageView.getId());
                imageView.setContentDescription((CharSequence) null);
            } else {
                f31342d.put(imageView.getId(), uVar);
                imageView.setContentDescription(uVar.mo49749b());
            }
            mo17405a(imageView);
        }
    }
}
