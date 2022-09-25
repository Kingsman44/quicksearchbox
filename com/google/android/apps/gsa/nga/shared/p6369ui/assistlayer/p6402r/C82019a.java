package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a */
/* compiled from: PG */
final class C82019a extends C82036c {

    /* renamed from: a */
    private boolean f224220a;

    /* renamed from: b */
    private boolean f224221b;

    /* renamed from: c */
    private byte f224222c;

    /* renamed from: a */
    public final C82037d mo75460a() {
        if (this.f224222c == 3) {
            return new C82033b(this.f224220a, this.f224221b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f224222c & 1) == 0) {
            sb.append(" lightNavBar");
        }
        if ((this.f224222c & 2) == 0) {
            sb.append(" lightStatusBar");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75461b(boolean z) {
        this.f224220a = z;
        this.f224222c = (byte) (this.f224222c | 1);
    }

    /* renamed from: c */
    public final void mo75462c(boolean z) {
        this.f224221b = z;
        this.f224222c = (byte) (this.f224222c | 2);
    }
}
