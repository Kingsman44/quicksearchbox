package com.google.android.apps.gsa.proactive.p6475b;

import com.google.android.apps.gsa.shared.p7127q.C90456c;

/* renamed from: com.google.android.apps.gsa.proactive.b.a */
/* compiled from: PG */
public final class C84158a extends C84161d {

    /* renamed from: a */
    public C90456c f229103a;

    /* renamed from: b */
    private boolean f229104b;

    /* renamed from: c */
    private int f229105c;

    /* renamed from: d */
    private boolean f229106d;

    /* renamed from: e */
    private byte f229107e;

    /* renamed from: a */
    public final C84162e mo77589a() {
        if (this.f229107e == 7) {
            return new C84159b(this.f229104b, this.f229105c, this.f229103a, this.f229106d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f229107e & 1) == 0) {
            sb.append(" nextPageAvailable");
        }
        if ((this.f229107e & 2) == 0) {
            sb.append(" clientErrorCode");
        }
        if ((this.f229107e & 4) == 0) {
            sb.append(" responseHasContent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77590b(int i) {
        this.f229105c = i;
        this.f229107e = (byte) (this.f229107e | 2);
    }

    /* renamed from: c */
    public final void mo77591c(boolean z) {
        this.f229104b = z;
        this.f229107e = (byte) (this.f229107e | 1);
    }

    /* renamed from: d */
    public final void mo77592d(boolean z) {
        this.f229106d = z;
        this.f229107e = (byte) (this.f229107e | 4);
    }
}
