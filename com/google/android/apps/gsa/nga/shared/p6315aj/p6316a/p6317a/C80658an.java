package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.an */
/* compiled from: PG */
final class C80658an extends C80699ca {

    /* renamed from: a */
    private boolean f221420a;

    /* renamed from: b */
    private C80700cb f221421b;

    /* renamed from: c */
    private boolean f221422c;

    /* renamed from: d */
    private boolean f221423d;

    /* renamed from: e */
    private byte f221424e;

    /* renamed from: a */
    public final C80701cc mo74433a() {
        if (this.f221424e == 7 && this.f221421b != null) {
            return new C80659ao(this.f221420a, this.f221421b, this.f221422c, this.f221423d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f221424e & 1) == 0) {
            sb.append(" isVisible");
        }
        if (this.f221421b == null) {
            sb.append(" color");
        }
        if ((this.f221424e & 2) == 0) {
            sb.append(" animateTransition");
        }
        if ((this.f221424e & 4) == 0) {
            sb.append(" forcesScrim");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74434b(boolean z) {
        this.f221422c = z;
        this.f221424e = (byte) (this.f221424e | 2);
    }

    /* renamed from: c */
    public final void mo74435c(C80700cb cbVar) {
        if (cbVar != null) {
            this.f221421b = cbVar;
            return;
        }
        throw new NullPointerException("Null color");
    }

    /* renamed from: d */
    public final void mo74436d(boolean z) {
        this.f221423d = z;
        this.f221424e = (byte) (this.f221424e | 4);
    }

    /* renamed from: e */
    public final void mo74437e(boolean z) {
        this.f221420a = z;
        this.f221424e = (byte) (this.f221424e | 1);
    }
}
