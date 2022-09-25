package kotlinx.coroutines.p5582h;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.C71600ba;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.h.m */
/* compiled from: PG */
public final class C71773m {

    /* renamed from: a */
    public final AtomicReferenceArray f191287a = new AtomicReferenceArray(128);

    /* renamed from: b */
    public final C71342e f191288b = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: c */
    public final C71340c f191289c = new C71340c(0, C71343f.f190534a);

    /* renamed from: d */
    public final C71340c f191290d = new C71340c(0, C71343f.f190534a);

    /* renamed from: e */
    public final C71340c f191291e = new C71340c(0, C71343f.f190534a);

    /* renamed from: f */
    private final C71768h m104977f(C71768h hVar) {
        if (hVar.f191277h.f191278a == 1) {
            C71340c.f190525a.incrementAndGet(this.f191291e);
        }
        if (mo63009a() == 127) {
            return hVar;
        }
        int i = this.f191289c.f190526b & 127;
        while (this.f191287a.get(i) != null) {
            Thread.yield();
        }
        this.f191287a.lazySet(i, hVar);
        C71340c.f190525a.incrementAndGet(this.f191289c);
        return null;
    }

    /* renamed from: a */
    public final int mo63009a() {
        return this.f191289c.f190526b - this.f191290d.f190526b;
    }

    /* renamed from: b */
    public final long mo63010b(C71773m mVar, boolean z) {
        C71768h hVar;
        do {
            hVar = (C71768h) mVar.f191288b.f190532a;
            if (hVar == null) {
                return -2;
            }
            if (z && hVar.f191277h.f191278a != 1) {
                return -2;
            }
            long j = C71771k.f191280a;
            long nanoTime = System.nanoTime() - hVar.f191276g;
            long j2 = C71771k.f191280a;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
        } while (!mVar.f191288b.mo62679d(hVar, (Object) null));
        mo63011c(hVar, false);
        return -1;
    }

    /* renamed from: c */
    public final C71768h mo63011c(C71768h hVar, boolean z) {
        C69664n.m101061g(hVar, "task");
        if (z) {
            return m104977f(hVar);
        }
        C71768h hVar2 = (C71768h) this.f191288b.mo62676a(hVar);
        if (hVar2 == null) {
            return null;
        }
        return m104977f(hVar2);
    }

    /* renamed from: d */
    public final C71768h mo63012d() {
        C71768h hVar = (C71768h) this.f191288b.mo62676a((Object) null);
        return hVar == null ? mo63013e() : hVar;
    }

    /* renamed from: e */
    public final C71768h mo63013e() {
        C71768h hVar;
        while (true) {
            int i = this.f191290d.f190526b;
            if (i - this.f191289c.f190526b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (this.f191290d.mo62672a(i, i + 1) && (hVar = (C71768h) this.f191287a.getAndSet(i2, (Object) null)) != null) {
                if (hVar.f191277h.f191278a == 1) {
                    C71340c.f190525a.decrementAndGet(this.f191291e);
                    boolean z = C71600ba.f191036a;
                }
                return hVar;
            }
        }
    }
}
