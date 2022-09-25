package com.google.android.libraries.search.assistant.p2828y.p2862s;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a */
/* compiled from: PG */
public final class C37084a extends C37147c {

    /* renamed from: a */
    private boolean f96589a;

    /* renamed from: b */
    private boolean f96590b;

    /* renamed from: c */
    private byte f96591c;

    /* renamed from: a */
    public final C37148d mo40612a() {
        if (this.f96591c == 3) {
            return new C37146b(this.f96589a, this.f96590b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f96591c & 1) == 0) {
            sb.append(" useCallLog");
        }
        if ((this.f96591c & 2) == 0) {
            sb.append(" useSms");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40613b() {
        this.f96589a = true;
        this.f96591c = (byte) (1 | this.f96591c);
    }

    /* renamed from: c */
    public final void mo40614c() {
        this.f96590b = true;
        this.f96591c = (byte) (this.f96591c | 2);
    }
}
