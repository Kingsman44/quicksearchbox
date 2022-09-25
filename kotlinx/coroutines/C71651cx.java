package kotlinx.coroutines;

import java.util.ArrayList;
import kotlinx.p5572a.C71339b;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.cx */
/* compiled from: PG */
final class C71651cx implements C71636ci {

    /* renamed from: a */
    public final C71670df f191092a;

    /* renamed from: b */
    public final C71339b f191093b = new C71339b(false, C71343f.f190534a);

    /* renamed from: c */
    public final C71342e f191094c;

    /* renamed from: d */
    private final C71342e f191095d;

    public C71651cx(C71670df dfVar, Throwable th) {
        this.f191092a = dfVar;
        this.f191095d = new C71342e(th, C71343f.f190534a);
        this.f191094c = new C71342e((Object) null, C71343f.f190534a);
    }

    /* renamed from: f */
    public static final ArrayList m104651f() {
        return new ArrayList(4);
    }

    /* renamed from: c */
    public final Throwable mo62886c() {
        return (Throwable) this.f191095d.f190532a;
    }

    /* renamed from: d */
    public final void mo62887d(Throwable th) {
        C69664n.m101061g(th, "exception");
        Throwable c = mo62886c();
        if (c == null) {
            this.f191095d.mo62678c(th);
        } else if (th != c) {
            Object obj = this.f191094c.f190532a;
            if (obj == null) {
                this.f191094c.mo62678c(th);
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList f = m104651f();
                    f.add(obj);
                    f.add(th);
                    this.f191094c.mo62678c(f);
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                new StringBuilder("State is ").append(obj);
                throw new IllegalStateException("State is ".concat(obj.toString()));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo62888e() {
        return mo62886c() != null;
    }

    /* renamed from: lS */
    public final C71670df mo62840lS() {
        return this.f191092a;
    }

    /* renamed from: lU */
    public final boolean mo62841lU() {
        return mo62886c() == null;
    }

    public final String toString() {
        boolean e = mo62888e();
        boolean a = this.f191093b.mo62669a();
        Throwable c = mo62886c();
        Object obj = this.f191094c.f190532a;
        C71670df dfVar = this.f191092a;
        return "Finishing[cancelling=" + e + ", completing=" + a + ", rootCause=" + c + ", exceptions=" + obj + ", list=" + dfVar + "]";
    }
}
