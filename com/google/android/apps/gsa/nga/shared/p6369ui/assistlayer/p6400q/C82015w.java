package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.w */
/* compiled from: PG */
final class C82015w extends C82001i {

    /* renamed from: a */
    public String f224207a;

    /* renamed from: b */
    public Integer f224208b;

    /* renamed from: c */
    public Integer f224209c;

    /* renamed from: d */
    private int f224210d;

    /* renamed from: e */
    private byte f224211e;

    /* renamed from: a */
    public final C82002j mo75438a() {
        String str;
        if (this.f224211e == 1 && (str = this.f224207a) != null) {
            return new C82016x(str, this.f224208b, this.f224209c, this.f224210d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224207a == null) {
            sb.append(" debugName");
        }
        if (this.f224211e == 0) {
            sb.append(" titleFontSizeSp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75439b(int i) {
        this.f224210d = i;
        this.f224211e = 1;
    }
}
