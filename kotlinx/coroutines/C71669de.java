package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.de */
/* compiled from: PG */
public abstract class C71669de extends C71414ao {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo62919c() {
        C71669de deVar;
        C71669de a = C71613bn.m104563a();
        if (this == a) {
            return "Dispatchers.Main";
        }
        try {
            deVar = a.mo62770h();
        } catch (UnsupportedOperationException unused) {
            deVar = null;
        }
        if (this == deVar) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    /* renamed from: h */
    public abstract C71669de mo62770h();

    public String toString() {
        String c = mo62919c();
        if (c != null) {
            return c;
        }
        String a = C71601bb.m104526a(this);
        String b = C71601bb.m104527b(this);
        return a + "@" + b;
    }
}
