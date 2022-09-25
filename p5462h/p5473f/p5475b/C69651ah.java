package p5462h.p5473f.p5475b;

import p5462h.C69552c;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69616b;
import p5462h.p5473f.p5474a.C69617c;
import p5462h.p5473f.p5474a.C69618d;
import p5462h.p5473f.p5474a.C69619e;
import p5462h.p5473f.p5474a.C69620f;
import p5462h.p5473f.p5474a.C69621g;
import p5462h.p5473f.p5474a.C69622h;
import p5462h.p5473f.p5474a.C69623i;
import p5462h.p5473f.p5474a.C69624j;
import p5462h.p5473f.p5474a.C69625k;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69627m;
import p5462h.p5473f.p5474a.C69628n;
import p5462h.p5473f.p5474a.C69629o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5474a.C69632r;
import p5462h.p5473f.p5474a.C69633s;
import p5462h.p5473f.p5474a.C69634t;
import p5462h.p5473f.p5474a.C69635u;
import p5462h.p5473f.p5474a.C69636v;
import p5462h.p5473f.p5474a.C69637w;
import p5462h.p5473f.p5475b.p5476a.C69640a;
import p5462h.p5473f.p5475b.p5476a.C69641b;

/* renamed from: h.f.b.ah */
/* compiled from: PG */
public final class C69651ah {
    /* renamed from: b */
    public static void m101037b(Object obj, int i) {
        int i2;
        if (obj != null) {
            if (obj instanceof C69552c) {
                if (obj instanceof C69661k) {
                    i2 = ((C69661k) obj).mo61347jS();
                } else if (obj instanceof C69615a) {
                    i2 = 0;
                } else if (obj instanceof C69626l) {
                    i2 = 1;
                } else if (obj instanceof C69630p) {
                    i2 = 2;
                } else if (obj instanceof C69631q) {
                    i2 = 3;
                } else if (obj instanceof C69632r) {
                    i2 = 4;
                } else if (obj instanceof C69633s) {
                    i2 = 5;
                } else if (obj instanceof C69634t) {
                    i2 = 6;
                } else if (obj instanceof C69635u) {
                    i2 = 7;
                } else if (obj instanceof C69636v) {
                    i2 = 8;
                } else if (obj instanceof C69637w) {
                    i2 = 9;
                } else if (obj instanceof C69616b) {
                    i2 = 10;
                } else if (obj instanceof C69617c) {
                    i2 = 11;
                } else if (obj instanceof C69618d) {
                    i2 = 12;
                } else if (obj instanceof C69619e) {
                    i2 = 13;
                } else if (obj instanceof C69620f) {
                    i2 = 14;
                } else if (obj instanceof C69621g) {
                    i2 = 15;
                } else if (obj instanceof C69622h) {
                    i2 = 16;
                } else if (obj instanceof C69623i) {
                    i2 = 17;
                } else if (obj instanceof C69624j) {
                    i2 = 18;
                } else if (obj instanceof C69625k) {
                    i2 = 19;
                } else if (obj instanceof C69627m) {
                    i2 = 20;
                } else if (obj instanceof C69628n) {
                    i2 = 21;
                } else {
                    i2 = obj instanceof C69629o ? 22 : -1;
                }
                if (i2 == i) {
                    return;
                }
            }
            m101036a(obj, "kotlin.jvm.functions.Function" + i);
        }
    }

    /* renamed from: c */
    public static void m101038c(Object obj) {
        if ((obj instanceof C69640a) && !(obj instanceof C69641b)) {
            m101036a(obj, "kotlin.collections.MutableCollection");
        }
    }

    /* renamed from: d */
    public static void m101039d(Throwable th) {
        C69664n.m101067m(th, C69651ah.class.getName());
    }

    /* renamed from: a */
    public static void m101036a(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(str2 + " cannot be cast to " + str);
        m101039d(classCastException);
        throw classCastException;
    }
}
