package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.e.b.h */
/* compiled from: PG */
final class C78249h extends C78244c {

    /* renamed from: a */
    private C78243b f215398a;

    /* renamed from: b */
    private C78243b f215399b;

    /* renamed from: a */
    public final C78245d mo73176a() {
        if (this.f215398a != null && this.f215399b != null) {
            return new C78250i(this.f215398a, this.f215399b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f215398a == null) {
            sb.append(" previousState");
        }
        if (this.f215399b == null) {
            sb.append(" state");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73177b(C78243b bVar) {
        if (bVar != null) {
            this.f215398a = bVar;
            return;
        }
        throw new NullPointerException("Null previousState");
    }

    /* renamed from: c */
    public final void mo73178c(C78243b bVar) {
        if (bVar != null) {
            this.f215399b = bVar;
            return;
        }
        throw new NullPointerException("Null state");
    }
}
