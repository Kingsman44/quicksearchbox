package kotlinx.coroutines.p5579e;

import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.af */
/* compiled from: PG */
public class C71698af {

    /* renamed from: a */
    private final C71342e f191162a = new C71342e(new C71700ah(8, false), C71343f.f190534a);

    /* renamed from: a */
    public final int mo62953a() {
        long j = ((C71700ah) this.f191162a.f190532a).f191165b.f190530c;
        return 1073741823 & (((int) ((1152921503533105152L & j) >> 30)) - ((int) (j & 1073741823)));
    }

    /* renamed from: b */
    public final Object mo62954b() {
        C71342e eVar = this.f191162a;
        while (true) {
            C71700ah ahVar = (C71700ah) eVar.f190532a;
            Object c = ahVar.mo62959c();
            if (c != C71700ah.f191164a) {
                return c;
            }
            this.f191162a.mo62679d(ahVar, ahVar.mo62960d(ahVar.mo62958b()));
        }
    }

    /* renamed from: c */
    public final void mo62955c() {
        C71342e eVar = this.f191162a;
        while (true) {
            C71700ah ahVar = (C71700ah) eVar.f190532a;
            if (!ahVar.mo62961e()) {
                this.f191162a.mo62679d(ahVar, ahVar.mo62960d(ahVar.mo62958b()));
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo62956d(Object obj) {
        C69664n.m101061g(obj, "element");
        C71342e eVar = this.f191162a;
        while (true) {
            C71700ah ahVar = (C71700ah) eVar.f190532a;
            int a = ahVar.mo62957a(obj);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return false;
            }
            this.f191162a.mo62679d(ahVar, ahVar.mo62960d(ahVar.mo62958b()));
        }
    }
}
