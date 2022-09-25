package com.google.android.libraries.p1703d;

/* renamed from: com.google.android.libraries.d.h */
/* compiled from: PG */
public final class C20652h extends C20638ab {

    /* renamed from: a */
    public String f57903a;

    /* renamed from: b */
    public String f57904b;

    /* renamed from: c */
    public Integer f57905c;

    /* renamed from: d */
    private boolean f57906d;

    /* renamed from: e */
    private byte f57907e;

    /* renamed from: a */
    public final C20639ac mo25585a() {
        String str;
        if (this.f57907e == 1 && (str = this.f57903a) != null) {
            return new C20653i(str, this.f57906d, this.f57904b, this.f57905c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f57903a == null) {
            sb.append(" packageName");
        }
        if (this.f57907e == 0) {
            sb.append(" firstRunDone");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo25586b(boolean z) {
        this.f57906d = z;
        this.f57907e = 1;
    }
}
