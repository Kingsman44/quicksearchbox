package com.google.android.libraries.lens.view.vision;

/* renamed from: com.google.android.libraries.lens.view.vision.c */
/* compiled from: PG */
public final class C28161c extends C28173o {

    /* renamed from: a */
    public int f76618a;

    /* renamed from: b */
    private int f76619b;

    /* renamed from: c */
    private int f76620c;

    /* renamed from: d */
    private float f76621d;

    /* renamed from: e */
    private int f76622e;

    /* renamed from: f */
    private byte f76623f;

    /* renamed from: a */
    public final C28174p mo33619a() {
        int i;
        if (this.f76623f == 15 && (i = this.f76618a) != 0) {
            return new C28162d(this.f76619b, this.f76620c, this.f76621d, this.f76622e, i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f76623f & 1) == 0) {
            sb.append(" analyzerWidth");
        }
        if ((this.f76623f & 2) == 0) {
            sb.append(" analyzerHeight");
        }
        if ((this.f76623f & 4) == 0) {
            sb.append(" downsampleFactor");
        }
        if ((this.f76623f & 8) == 0) {
            sb.append(" analyzerBufferRowStride");
        }
        if (this.f76618a == 0) {
            sb.append(" analyzerImageFormat");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33620b(int i) {
        this.f76622e = i;
        this.f76623f = (byte) (this.f76623f | 8);
    }

    /* renamed from: c */
    public final void mo33621c(int i) {
        this.f76620c = i;
        this.f76623f = (byte) (this.f76623f | 2);
    }

    /* renamed from: d */
    public final void mo33622d(int i) {
        this.f76619b = i;
        this.f76623f = (byte) (this.f76623f | 1);
    }

    /* renamed from: e */
    public final void mo33623e(float f) {
        this.f76621d = f;
        this.f76623f = (byte) (this.f76623f | 4);
    }
}
