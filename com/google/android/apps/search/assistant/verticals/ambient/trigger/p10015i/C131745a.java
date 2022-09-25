package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.i.a */
/* compiled from: PG */
final class C131745a extends C131747c {

    /* renamed from: a */
    public String f359888a;

    /* renamed from: b */
    public int f359889b;

    /* renamed from: c */
    private boolean f359890c;

    /* renamed from: d */
    private boolean f359891d;

    /* renamed from: e */
    private byte f359892e;

    /* renamed from: a */
    public final C131748d mo110287a() {
        String str;
        int i;
        if (this.f359892e == 3 && (str = this.f359888a) != null && (i = this.f359889b) != 0) {
            return new C131746b(this.f359890c, str, i, this.f359891d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f359892e & 1) == 0) {
            sb.append(" shouldDiscard");
        }
        if (this.f359888a == null) {
            sb.append(" message");
        }
        if (this.f359889b == 0) {
            sb.append(" reason");
        }
        if ((this.f359892e & 2) == 0) {
            sb.append(" shouldClearCards");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo110288b(String str) {
        if (str != null) {
            this.f359888a = str;
            return;
        }
        throw new NullPointerException("Null message");
    }

    /* renamed from: c */
    public final void mo110289c(boolean z) {
        this.f359891d = z;
        this.f359892e = (byte) (this.f359892e | 2);
    }

    /* renamed from: d */
    public final void mo110290d(boolean z) {
        this.f359890c = z;
        this.f359892e = (byte) (this.f359892e | 1);
    }
}
