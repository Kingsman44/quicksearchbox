package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.p375ai.p378b.C7641en;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.n */
/* compiled from: PG */
public final class C98447n extends C98436dc {

    /* renamed from: a */
    public C7641en f274857a;

    /* renamed from: b */
    public byte f274858b;

    /* renamed from: c */
    public C98444k f274859c;

    /* renamed from: d */
    private int f274860d;

    /* renamed from: e */
    private boolean f274861e;

    /* renamed from: f */
    private boolean f274862f;

    /* renamed from: a */
    public final C98437dd mo91102a() {
        if (this.f274858b == 15) {
            return new C98448o(this.f274860d, this.f274861e, this.f274862f, this.f274859c, this.f274857a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f274858b & 1) == 0) {
            sb.append(" timeToLiveSeconds");
        }
        if ((this.f274858b & 2) == 0) {
            sb.append(" delaySecs");
        }
        if ((this.f274858b & 4) == 0) {
            sb.append(" forceSendImmediately");
        }
        if ((this.f274858b & 8) == 0) {
            sb.append(" ignoreMainRequestBucketPending");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo91103b(boolean z) {
        this.f274861e = z;
        this.f274858b = (byte) (this.f274858b | 4);
    }

    /* renamed from: c */
    public final void mo91104c(boolean z) {
        this.f274862f = z;
        this.f274858b = (byte) (this.f274858b | 8);
    }

    /* renamed from: d */
    public final void mo91105d(int i) {
        this.f274860d = i;
        this.f274858b = (byte) (this.f274858b | 1);
    }
}
