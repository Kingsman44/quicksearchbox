package com.google.android.apps.gsa.speech.p7261a.p7262a;

/* renamed from: com.google.android.apps.gsa.speech.a.a.a */
/* compiled from: PG */
public final class C92134a extends C92136c {

    /* renamed from: a */
    public byte[] f256865a;

    /* renamed from: b */
    public byte[] f256866b;

    /* renamed from: c */
    private boolean f256867c;

    /* renamed from: d */
    private boolean f256868d;

    /* renamed from: e */
    private boolean f256869e;

    /* renamed from: f */
    private boolean f256870f;

    /* renamed from: g */
    private byte f256871g;

    /* renamed from: a */
    public final C92137d mo86780a() {
        if (this.f256871g == 15) {
            return new C92135b(this.f256867c, this.f256865a, this.f256866b, this.f256868d, this.f256869e, this.f256870f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f256871g & 1) == 0) {
            sb.append(" isBargeInEnabled");
        }
        if ((this.f256871g & 2) == 0) {
            sb.append(" isBargeInRefactorEnabled");
        }
        if ((this.f256871g & 4) == 0) {
            sb.append(" isGearheadSession");
        }
        if ((this.f256871g & 8) == 0) {
            sb.append(" isTtsNullingEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo86781b(boolean z) {
        this.f256867c = z;
        this.f256871g = (byte) (this.f256871g | 1);
    }

    /* renamed from: c */
    public final void mo86782c(boolean z) {
        this.f256868d = z;
        this.f256871g = (byte) (this.f256871g | 2);
    }

    /* renamed from: d */
    public final void mo86783d(boolean z) {
        this.f256869e = z;
        this.f256871g = (byte) (this.f256871g | 4);
    }

    /* renamed from: e */
    public final void mo86784e(boolean z) {
        this.f256870f = z;
        this.f256871g = (byte) (this.f256871g | 8);
    }
}
