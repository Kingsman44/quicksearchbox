package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.g.ac;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.h */
/* compiled from: PG */
public final class C77651h extends C77619e {

    /* renamed from: a */
    private ac f213873a;

    /* renamed from: b */
    private float f213874b;

    /* renamed from: c */
    private float f213875c;

    /* renamed from: d */
    private long f213876d;

    /* renamed from: e */
    private byte f213877e;

    /* renamed from: a */
    public final C77623f mo72747a() {
        ac acVar;
        if (this.f213877e == 7 && (acVar = this.f213873a) != null) {
            return new C77654i(acVar, this.f213874b, this.f213875c, this.f213876d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f213873a == null) {
            sb.append(" utteranceIdentifier");
        }
        if ((this.f213877e & 1) == 0) {
            sb.append(" volumeLevel");
        }
        if ((this.f213877e & 2) == 0) {
            sb.append(" speechConfidence");
        }
        if ((this.f213877e & 4) == 0) {
            sb.append(" timestampMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72748b(float f) {
        this.f213875c = f;
        this.f213877e = (byte) (this.f213877e | 2);
    }

    /* renamed from: c */
    public final void mo72749c(long j) {
        this.f213876d = j;
        this.f213877e = (byte) (this.f213877e | 4);
    }

    /* renamed from: d */
    public final void mo72750d(ac acVar) {
        if (acVar != null) {
            this.f213873a = acVar;
            return;
        }
        throw new NullPointerException("Null utteranceIdentifier");
    }

    /* renamed from: e */
    public final void mo72751e(float f) {
        this.f213874b = f;
        this.f213877e = (byte) (this.f213877e | 1);
    }
}
