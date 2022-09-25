package com.google.android.apps.search.assistant.verticals.ambient.p10017u;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a */
/* compiled from: PG */
public final class C131815a extends C131835g {

    /* renamed from: a */
    private boolean f360010a;

    /* renamed from: b */
    private boolean f360011b;

    /* renamed from: c */
    private boolean f360012c;

    /* renamed from: d */
    private byte f360013d;

    /* renamed from: a */
    public final C131836h mo110313a() {
        if (this.f360013d == 7) {
            return new C131830b(this.f360010a, this.f360011b, this.f360012c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f360013d & 1) == 0) {
            sb.append(" canStoreTraces");
        }
        if ((this.f360013d & 2) == 0) {
            sb.append(" canShareFiles");
        }
        if ((this.f360013d & 4) == 0) {
            sb.append(" allowsSlicingAdjustment");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo110314b(boolean z) {
        this.f360012c = z;
        this.f360013d = (byte) (this.f360013d | 4);
    }

    /* renamed from: c */
    public final void mo110315c(boolean z) {
        this.f360011b = z;
        this.f360013d = (byte) (this.f360013d | 2);
    }

    /* renamed from: d */
    public final void mo110316d() {
        this.f360010a = true;
        this.f360013d = (byte) (1 | this.f360013d);
    }
}
