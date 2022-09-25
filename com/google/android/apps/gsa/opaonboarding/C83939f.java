package com.google.android.apps.gsa.opaonboarding;

/* renamed from: com.google.android.apps.gsa.opaonboarding.f */
/* compiled from: PG */
final class C83939f extends C83877ak {

    /* renamed from: a */
    private int f228601a;

    /* renamed from: b */
    private boolean f228602b;

    /* renamed from: c */
    private int f228603c;

    /* renamed from: d */
    private byte f228604d;

    /* renamed from: a */
    public final HotwordTrainingConfig mo77217a() {
        if (this.f228604d == 7) {
            return new AutoValue_HotwordTrainingConfig(this.f228601a, this.f228602b, this.f228603c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f228604d & 1) == 0) {
            sb.append(" enrollmentEntryId");
        }
        if ((this.f228604d & 2) == 0) {
            sb.append(" requestPersonalResponsePermission");
        }
        if ((this.f228604d & 4) == 0) {
            sb.append(" personalResponsePermissionStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77218b(int i) {
        this.f228601a = i;
        this.f228604d = (byte) (this.f228604d | 1);
    }

    /* renamed from: c */
    public final void mo77219c(int i) {
        this.f228603c = i;
        this.f228604d = (byte) (this.f228604d | 4);
    }

    /* renamed from: d */
    public final void mo77220d(boolean z) {
        this.f228602b = z;
        this.f228604d = (byte) (this.f228604d | 2);
    }
}
