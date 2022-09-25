package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71809s;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71708ap;

/* renamed from: kotlinx.coroutines.a.af */
/* compiled from: PG */
public final class C71352af extends C71366at implements C71364ar {

    /* renamed from: a */
    public final Throwable f190545a;

    public C71352af(Throwable th) {
        this.f190545a = th;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo62695a() {
        return this;
    }

    /* renamed from: b */
    public final C71708ap mo62696b(Object obj, C71693aa aaVar) {
        C71708ap apVar = C71809s.f191342a;
        if (aaVar != null) {
            aaVar.f191154c.mo62937k(aaVar);
        }
        return apVar;
    }

    /* renamed from: c */
    public final void mo62697c(Object obj) {
    }

    /* renamed from: d */
    public final void mo62698d(C71352af afVar) {
        boolean z = C71600ba.f191036a;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo62699f() {
        return this;
    }

    /* renamed from: g */
    public final Throwable mo62700g() {
        Throwable th = this.f190545a;
        return th == null ? new C71353ag() : th;
    }

    /* renamed from: h */
    public final Throwable mo62701h() {
        Throwable th = this.f190545a;
        return th == null ? new C71354ah("Channel was closed") : th;
    }

    /* renamed from: mm */
    public final C71708ap mo62702mm(C71693aa aaVar) {
        C71708ap apVar = C71809s.f191342a;
        if (aaVar != null) {
            aaVar.f191154c.mo62937k(aaVar);
        }
        return apVar;
    }

    /* renamed from: mn */
    public final void mo62703mn() {
    }

    public final String toString() {
        String b = C71601bb.m104527b(this);
        Throwable th = this.f190545a;
        return "Closed@" + b + "[" + th + "]";
    }
}
