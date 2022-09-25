package com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a;

/* renamed from: com.google.android.libraries.ac.b.c.a.a */
/* compiled from: PG */
public final class C146794a extends C146799f {

    /* renamed from: a */
    public Integer f396338a;

    /* renamed from: b */
    private int f396339b;

    /* renamed from: c */
    private C146803j f396340c;

    /* renamed from: d */
    private C146803j f396341d;

    /* renamed from: e */
    private C146803j f396342e;

    /* renamed from: f */
    private C146803j f396343f;

    /* renamed from: g */
    private byte f396344g;

    /* renamed from: a */
    public final C146800g mo123639a() {
        C146803j jVar;
        C146803j jVar2;
        C146803j jVar3;
        C146803j jVar4;
        if (this.f396344g == 7 && (jVar = this.f396340c) != null && (jVar2 = this.f396341d) != null && (jVar3 = this.f396342e) != null && (jVar4 = this.f396343f) != null) {
            return new C146795b(this.f396339b, jVar, jVar2, jVar3, jVar4, this.f396338a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f396344g & 1) == 0) {
            sb.append(" syncType");
        }
        if (this.f396340c == null) {
            sb.append(" upSyncPolicy");
        }
        if (this.f396341d == null) {
            sb.append(" upSyncWithListenerPolicy");
        }
        if (this.f396342e == null) {
            sb.append(" downSyncPolicy");
        }
        if (this.f396343f == null) {
            sb.append(" downSyncWithListenerPolicy");
        }
        if ((this.f396344g & 2) == 0) {
            sb.append(" requiresCharging");
        }
        if ((this.f396344g & 4) == 0) {
            sb.append(" requiresUnmetered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo123640b(C146803j jVar) {
        if (jVar != null) {
            this.f396342e = jVar;
            return;
        }
        throw new NullPointerException("Null downSyncPolicy");
    }

    /* renamed from: c */
    public final void mo123641c(C146803j jVar) {
        if (jVar != null) {
            this.f396343f = jVar;
            return;
        }
        throw new NullPointerException("Null downSyncWithListenerPolicy");
    }

    /* renamed from: d */
    public final void mo123642d(int i) {
        this.f396339b = i;
        this.f396344g = (byte) (this.f396344g | 1);
    }

    /* renamed from: e */
    public final void mo123643e(C146803j jVar) {
        if (jVar != null) {
            this.f396340c = jVar;
            return;
        }
        throw new NullPointerException("Null upSyncPolicy");
    }

    /* renamed from: f */
    public final void mo123644f(C146803j jVar) {
        if (jVar != null) {
            this.f396341d = jVar;
            return;
        }
        throw new NullPointerException("Null upSyncWithListenerPolicy");
    }

    /* renamed from: g */
    public final void mo123645g() {
        this.f396344g = (byte) (this.f396344g | 2);
    }

    /* renamed from: h */
    public final void mo123646h() {
        this.f396344g = (byte) (this.f396344g | 4);
    }
}
