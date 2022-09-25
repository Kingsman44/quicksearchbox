package com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a;

import com.google.android.libraries.assistant.p1594s.p1597b.C19169bc;

/* renamed from: com.google.android.apps.search.assistant.platform.i.d.a.a */
/* compiled from: PG */
public final class C121477a extends C121480d {

    /* renamed from: a */
    public C19169bc f337147a;

    /* renamed from: b */
    private long f337148b;

    /* renamed from: c */
    private long f337149c;

    /* renamed from: d */
    private long f337150d;

    /* renamed from: e */
    private byte f337151e;

    /* renamed from: a */
    public final C121481e mo105164a() {
        C19169bc bcVar;
        if (this.f337151e == 7 && (bcVar = this.f337147a) != null) {
            return new C121478b(bcVar, this.f337148b, this.f337149c, this.f337150d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f337147a == null) {
            sb.append(" serviceRequest");
        }
        if ((this.f337151e & 1) == 0) {
            sb.append(" requestId");
        }
        if ((this.f337151e & 2) == 0) {
            sb.append(" timestampMsec");
        }
        if ((this.f337151e & 4) == 0) {
            sb.append(" timestampMsecSinceEpoch");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo105165b(long j) {
        this.f337148b = j;
        this.f337151e = (byte) (this.f337151e | 1);
    }

    /* renamed from: c */
    public final void mo105166c(C19169bc bcVar) {
        if (bcVar != null) {
            this.f337147a = bcVar;
            return;
        }
        throw new NullPointerException("Null serviceRequest");
    }

    /* renamed from: d */
    public final void mo105167d(long j) {
        this.f337149c = j;
        this.f337151e = (byte) (this.f337151e | 2);
    }

    /* renamed from: e */
    public final void mo105168e(long j) {
        this.f337150d = j;
        this.f337151e = (byte) (this.f337151e | 4);
    }
}
