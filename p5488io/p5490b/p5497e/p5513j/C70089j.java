package p5488io.p5490b.p5497e.p5513j;

import p5488io.p5490b.C70123o;

/* renamed from: io.b.e.j.j */
/* compiled from: PG */
public enum C70089j {
    ;

    private C70089j() {
    }

    /* renamed from: a */
    public static Object m101988a(Throwable th) {
        return new C70088i(th);
    }

    /* renamed from: b */
    public static Throwable m101989b(Object obj) {
        return ((C70088i) obj).f186818a;
    }

    /* renamed from: c */
    public static boolean m101990c(Object obj, C70123o oVar) {
        if (obj == f186819a) {
            oVar.mo25986a();
            return true;
        } else if (obj instanceof C70088i) {
            oVar.mo25987b(((C70088i) obj).f186818a);
            return true;
        } else {
            oVar.mo25988lL(obj);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m101991d(Object obj) {
        return obj instanceof C70088i;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }
}
