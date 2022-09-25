package com.google.android.libraries.mdi.download;

/* renamed from: com.google.android.libraries.mdi.download.u */
/* compiled from: PG */
final class C29681u extends C29654hy {

    /* renamed from: a */
    private int f80374a;

    /* renamed from: b */
    private byte f80375b;

    /* renamed from: a */
    public final C29655hz mo34798a() {
        if (this.f80375b == 1) {
            return new C29682v(this.f80374a);
        }
        throw new IllegalStateException("Missing required properties: removedFileGroupsCount");
    }

    /* renamed from: b */
    public final void mo34799b(int i) {
        this.f80374a = i;
        this.f80375b = 1;
    }
}
