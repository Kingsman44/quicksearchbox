package kotlinx.coroutines;

import kotlinx.p5572a.C71339b;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ac */
/* compiled from: PG */
public class C71396ac {

    /* renamed from: b */
    public final Throwable f190604b;

    /* renamed from: c */
    public final C71339b f190605c;

    public C71396ac(Throwable th, boolean z) {
        C69664n.m101061g(th, "cause");
        this.f190604b = th;
        this.f190605c = new C71339b(z, C71343f.f190534a);
    }

    public final String toString() {
        String a = C71601bb.m104526a(this);
        Throwable th = this.f190604b;
        return a + "[" + th + "]";
    }
}
