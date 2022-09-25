package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.ac.b.k.a */
/* compiled from: PG */
final class C147125a extends C147130ae {

    /* renamed from: a */
    public C58495hd f397236a;

    /* renamed from: b */
    private long f397237b;

    /* renamed from: c */
    private long f397238c;

    /* renamed from: d */
    private byte f397239d;

    public C147125a() {
    }

    public C147125a(C147131af afVar) {
        C147142b bVar = (C147142b) afVar;
        this.f397237b = bVar.f397254a;
        this.f397238c = bVar.f397255b;
        this.f397236a = bVar.f397256c;
        this.f397239d = 3;
    }

    /* renamed from: a */
    public final C147131af mo123946a() {
        C58495hd hdVar;
        if (this.f397239d == 3 && (hdVar = this.f397236a) != null) {
            return new C147142b(this.f397237b, this.f397238c, hdVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f397239d & 1) == 0) {
            sb.append(" read");
        }
        if ((this.f397239d & 2) == 0) {
            sb.append(" write");
        }
        if (this.f397236a == null) {
            sb.append(" triggers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58495hd mo123947b() {
        C58495hd hdVar = this.f397236a;
        if (hdVar != null) {
            return hdVar;
        }
        throw new IllegalStateException("Property \"triggers\" has not been set");
    }

    /* renamed from: c */
    public final void mo123948c(long j) {
        this.f397237b = j;
        this.f397239d = (byte) (this.f397239d | 1);
    }

    /* renamed from: d */
    public final void mo123949d(C58495hd hdVar) {
        if (hdVar != null) {
            this.f397236a = hdVar;
            return;
        }
        throw new NullPointerException("Null triggers");
    }

    /* renamed from: e */
    public final void mo123950e(long j) {
        this.f397238c = j;
        this.f397239d = (byte) (this.f397239d | 2);
    }
}
