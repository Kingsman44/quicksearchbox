package android.support.p031v4.app;

import androidx.core.p094f.C1893f;

/* renamed from: android.support.v4.app.o */
/* compiled from: PG */
class C0252o {

    /* renamed from: a */
    public final C0238dc f913a;

    /* renamed from: b */
    public final C1893f f914b;

    public C0252o(C0238dc dcVar, C1893f fVar) {
        this.f913a = dcVar;
        this.f914b = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo766b() {
        C0238dc dcVar = this.f913a;
        if (dcVar.f873b.remove(this.f914b) && dcVar.f873b.isEmpty()) {
            dcVar.mo737a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo767c() {
        int c = C0237db.m553c(this.f913a.f872a.mView);
        int i = this.f913a.f876e;
        if (c != i) {
            return (c == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
