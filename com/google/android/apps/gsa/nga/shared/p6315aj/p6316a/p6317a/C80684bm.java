package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bm */
/* compiled from: PG */
public final class C80684bm extends C80774ev {

    /* renamed from: a */
    private String f221529a;

    /* renamed from: a */
    public final C80775ew mo74584a() {
        String str = this.f221529a;
        if (str != null) {
            return new C80685bn(str);
        }
        throw new IllegalStateException("Missing required properties: text");
    }

    /* renamed from: b */
    public final void mo74585b(String str) {
        if (str != null) {
            this.f221529a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
