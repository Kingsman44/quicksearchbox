package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.as */
/* compiled from: PG */
final class C80663as extends C80706ch {

    /* renamed from: a */
    private C80708cj f221442a;

    /* renamed from: b */
    private C80707ci f221443b;

    /* renamed from: c */
    private boolean f221444c;

    /* renamed from: d */
    private C80709ck f221445d;

    /* renamed from: e */
    private byte f221446e;

    /* renamed from: a */
    public final C80710cl mo74465a() {
        if (this.f221446e == 1 && this.f221442a != null && this.f221443b != null && this.f221445d != null) {
            return new C80664at(this.f221442a, this.f221443b, this.f221444c, this.f221445d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221442a == null) {
            sb.append(" state");
        }
        if (this.f221443b == null) {
            sb.append(" goneLogoState");
        }
        if (this.f221446e == 0) {
            sb.append(" listening");
        }
        if (this.f221445d == null) {
            sb.append(" triggerType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74466b(C80707ci ciVar) {
        if (ciVar != null) {
            this.f221443b = ciVar;
            return;
        }
        throw new NullPointerException("Null goneLogoState");
    }

    /* renamed from: c */
    public final void mo74467c(boolean z) {
        this.f221444c = z;
        this.f221446e = 1;
    }

    /* renamed from: d */
    public final void mo74468d(C80708cj cjVar) {
        if (cjVar != null) {
            this.f221442a = cjVar;
            return;
        }
        throw new NullPointerException("Null state");
    }

    /* renamed from: e */
    public final void mo74469e(C80709ck ckVar) {
        if (ckVar != null) {
            this.f221445d = ckVar;
            return;
        }
        throw new NullPointerException("Null triggerType");
    }
}
