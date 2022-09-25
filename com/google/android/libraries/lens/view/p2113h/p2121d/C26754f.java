package com.google.android.libraries.lens.view.p2113h.p2121d;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.h.d.f */
/* compiled from: PG */
public final class C26754f extends C26731a {

    /* renamed from: a */
    public SettableFuture f72883a;

    /* renamed from: b */
    private boolean f72884b;

    /* renamed from: c */
    private boolean f72885c;

    /* renamed from: d */
    private boolean f72886d;

    /* renamed from: e */
    private long f72887e;

    /* renamed from: f */
    private boolean f72888f;

    /* renamed from: g */
    private byte f72889g;

    /* renamed from: a */
    public final C26750b mo32039a() {
        if (this.f72889g == 31) {
            return new C26755g(this.f72884b, this.f72885c, this.f72886d, this.f72887e, this.f72888f, this.f72883a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f72889g & 1) == 0) {
            sb.append(" isSelectedForCapture");
        }
        if ((this.f72889g & 2) == 0) {
            sb.append(" isSuitableForPrefetch");
        }
        if ((this.f72889g & 4) == 0) {
            sb.append(" isFSIQPrefetchReady");
        }
        if ((this.f72889g & 8) == 0) {
            sb.append(" imageTimestampUs");
        }
        if ((this.f72889g & 16) == 0) {
            sb.append(" acceptedByTracker");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo32040b(boolean z) {
        this.f72888f = z;
        this.f72889g = (byte) (this.f72889g | 16);
    }

    /* renamed from: c */
    public final void mo32041c(long j) {
        this.f72887e = j;
        this.f72889g = (byte) (this.f72889g | 8);
    }

    /* renamed from: d */
    public final void mo32042d(boolean z) {
        this.f72886d = z;
        this.f72889g = (byte) (this.f72889g | 4);
    }

    /* renamed from: e */
    public final void mo32043e(boolean z) {
        this.f72884b = z;
        this.f72889g = (byte) (this.f72889g | 1);
    }

    /* renamed from: f */
    public final void mo32044f(boolean z) {
        this.f72885c = z;
        this.f72889g = (byte) (this.f72889g | 2);
    }
}
