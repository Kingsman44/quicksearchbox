package androidx.work;

/* renamed from: androidx.work.ad */
/* compiled from: PG */
public abstract class C4380ad {

    /* renamed from: b */
    public static final Object f14004b = new Object();

    /* renamed from: c */
    public static volatile C4380ad f14005c;

    /* renamed from: h */
    public static C4380ad m12560h() {
        C4380ad adVar;
        synchronized (f14004b) {
            if (f14005c == null) {
                f14005c = new C4379ac(3);
            }
            adVar = f14005c;
        }
        return adVar;
    }

    /* renamed from: i */
    public static String m12561i(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo9309a(String str, String str2);

    /* renamed from: b */
    public abstract void mo9310b(String str, String str2, Throwable th);

    /* renamed from: c */
    public abstract void mo9311c(String str, String str2);

    /* renamed from: d */
    public abstract void mo9312d(String str, String str2, Throwable th);

    /* renamed from: e */
    public abstract void mo9313e(String str, String str2);

    /* renamed from: f */
    public abstract void mo9314f(String str, String str2);

    /* renamed from: g */
    public abstract void mo9315g(String str, String str2, Throwable th);
}
