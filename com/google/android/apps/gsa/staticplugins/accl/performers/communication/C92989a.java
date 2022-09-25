package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.a */
/* compiled from: PG */
final class C92989a extends C93018bb {

    /* renamed from: a */
    private int f259413a;

    /* renamed from: b */
    private int f259414b;

    /* renamed from: c */
    private byte f259415c;

    /* renamed from: a */
    public final C93019bc mo87511a() {
        if (this.f259415c == 3) {
            return new C93016b(this.f259413a, this.f259414b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f259415c & 1) == 0) {
            sb.append(" beginMs");
        }
        if ((this.f259415c & 2) == 0) {
            sb.append(" endMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo87512b(int i) {
        this.f259413a = i;
        this.f259415c = (byte) (this.f259415c | 1);
    }

    /* renamed from: c */
    public final void mo87513c(int i) {
        this.f259414b = i;
        this.f259415c = (byte) (this.f259415c | 2);
    }
}
