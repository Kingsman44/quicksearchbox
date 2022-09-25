package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bh */
/* compiled from: PG */
final class C80679bh extends C80761ei {

    /* renamed from: a */
    private boolean f221511a;

    /* renamed from: b */
    private boolean f221512b;

    /* renamed from: c */
    private boolean f221513c;

    /* renamed from: d */
    private boolean f221514d;

    /* renamed from: e */
    private byte f221515e;

    /* renamed from: a */
    public final C80762ej mo74557a() {
        if (this.f221515e == 15) {
            return new C80680bi(this.f221511a, this.f221512b, this.f221513c, this.f221514d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f221515e & 1) == 0) {
            sb.append(" lockScreen");
        }
        if ((this.f221515e & 2) == 0) {
            sb.append(" homeScreen");
        }
        if ((this.f221515e & 4) == 0) {
            sb.append(" screenOn");
        }
        if ((this.f221515e & 8) == 0) {
            sb.append(" opaCardVisible");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74558b(boolean z) {
        this.f221512b = z;
        this.f221515e = (byte) (this.f221515e | 2);
    }

    /* renamed from: c */
    public final void mo74559c(boolean z) {
        this.f221511a = z;
        this.f221515e = (byte) (this.f221515e | 1);
    }

    /* renamed from: d */
    public final void mo74560d(boolean z) {
        this.f221514d = z;
        this.f221515e = (byte) (this.f221515e | 8);
    }

    /* renamed from: e */
    public final void mo74561e(boolean z) {
        this.f221513c = z;
        this.f221515e = (byte) (this.f221515e | 4);
    }
}
