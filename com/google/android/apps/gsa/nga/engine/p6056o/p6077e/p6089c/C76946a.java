package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.a */
/* compiled from: PG */
final class C76946a extends C76972p {

    /* renamed from: a */
    public Optional f212445a = Optional.empty();

    /* renamed from: b */
    public Optional f212446b = Optional.empty();

    /* renamed from: c */
    private boolean f212447c;

    /* renamed from: d */
    private boolean f212448d;

    /* renamed from: e */
    private Optional f212449e = Optional.empty();

    /* renamed from: f */
    private byte f212450f;

    /* renamed from: a */
    public final C76973q mo72365a() {
        if (this.f212450f == 3) {
            return new C76958b(this.f212447c, this.f212448d, this.f212445a, this.f212449e, this.f212446b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f212450f & 1) == 0) {
            sb.append(" isFrontCamera");
        }
        if ((this.f212450f & 2) == 0) {
            sb.append(" isOpenOnly");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72366b(Optional optional) {
        if (optional != null) {
            this.f212449e = optional;
            return;
        }
        throw new NullPointerException("Null imageCaptureFormat");
    }

    /* renamed from: c */
    public final void mo72367c(boolean z) {
        this.f212447c = z;
        this.f212450f = (byte) (this.f212450f | 1);
    }

    /* renamed from: d */
    public final void mo72368d(boolean z) {
        this.f212448d = z;
        this.f212450f = (byte) (this.f212450f | 2);
    }
}
