package com.google.android.libraries.web.contrib.debug;

/* renamed from: com.google.android.libraries.web.contrib.debug.a */
/* compiled from: PG */
final class C43469a extends C43471c {

    /* renamed from: a */
    public boolean f113555a;

    /* renamed from: b */
    public byte f113556b;

    /* renamed from: c */
    private C43474f f113557c;

    /* renamed from: d */
    private int f113558d;

    /* renamed from: a */
    public final DebugFeature mo46550a() {
        C43474f fVar;
        if (this.f113556b == 3 && (fVar = this.f113557c) != null) {
            return new AutoValue_DebugFeature(fVar, this.f113555a, this.f113558d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f113557c == null) {
            sb.append(" debugKey");
        }
        if ((this.f113556b & 1) == 0) {
            sb.append(" isFragmentDumpEnabled");
        }
        if ((this.f113556b & 2) == 0) {
            sb.append(" webStateCapacity");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo46551b(C43474f fVar) {
        if (fVar != null) {
            this.f113557c = fVar;
            return;
        }
        throw new NullPointerException("Null debugKey");
    }

    /* renamed from: c */
    public final void mo46552c(int i) {
        this.f113558d = i;
        this.f113556b = (byte) (this.f113556b | 2);
    }
}
