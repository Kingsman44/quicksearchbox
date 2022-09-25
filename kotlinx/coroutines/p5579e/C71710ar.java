package kotlinx.coroutines.p5579e;

/* renamed from: kotlinx.coroutines.e.ar */
/* compiled from: PG */
public final /* synthetic */ class C71710ar {

    /* renamed from: a */
    public static final int f191177a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final String m104848a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
