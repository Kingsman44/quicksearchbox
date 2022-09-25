package androidx.core.p098j;

import android.view.Window;

/* renamed from: androidx.core.j.cr */
/* compiled from: PG */
class C2084cr extends C2083cq {
    public C2084cr(Window window) {
        super(window);
    }

    /* renamed from: e */
    public final void mo5253e(boolean z) {
        if (z) {
            this.f5995a.clearFlags(67108864);
            mo5252d();
            mo5249a(8192);
            return;
        }
        mo5250b(8192);
    }

    /* renamed from: f */
    public final boolean mo5254f() {
        return (this.f5995a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
