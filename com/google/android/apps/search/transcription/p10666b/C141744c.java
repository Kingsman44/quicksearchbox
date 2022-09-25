package com.google.android.apps.search.transcription.p10666b;

/* renamed from: com.google.android.apps.search.transcription.b.c */
/* compiled from: PG */
final class C141744c extends C141742a {

    /* renamed from: a */
    public int f384724a;

    /* renamed from: b */
    private int f384725b;

    /* renamed from: c */
    private byte f384726c;

    /* renamed from: a */
    public final C141743b mo116701a() {
        int i;
        if (this.f384726c == 1 && (i = this.f384724a) != 0) {
            return new C141745d(i, this.f384725b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f384724a == 0) {
            sb.append(" errorType");
        }
        if (this.f384726c == 0) {
            sb.append(" errorCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo116702b(int i) {
        this.f384725b = i;
        this.f384726c = 1;
    }
}
