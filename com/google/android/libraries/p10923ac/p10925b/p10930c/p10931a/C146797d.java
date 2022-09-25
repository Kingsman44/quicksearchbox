package com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a;

/* renamed from: com.google.android.libraries.ac.b.c.a.d */
/* compiled from: PG */
final class C146797d extends C146802i {

    /* renamed from: a */
    private boolean f396354a;

    /* renamed from: b */
    private int f396355b;

    /* renamed from: c */
    private byte f396356c;

    /* renamed from: a */
    public final C146803j mo123664a() {
        if (this.f396356c == 3) {
            return new C146798e(this.f396354a, this.f396355b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f396356c & 1) == 0) {
            sb.append(" enabled");
        }
        if ((this.f396356c & 2) == 0) {
            sb.append(" throttleDelaySeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo123665b(boolean z) {
        this.f396354a = z;
        this.f396356c = (byte) (this.f396356c | 1);
    }

    /* renamed from: c */
    public final void mo123666c(int i) {
        this.f396355b = i;
        this.f396356c = (byte) (this.f396356c | 2);
    }
}
