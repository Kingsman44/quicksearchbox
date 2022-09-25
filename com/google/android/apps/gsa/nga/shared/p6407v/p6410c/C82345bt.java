package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bt */
/* compiled from: PG */
final class C82345bt extends C82575kg {

    /* renamed from: a */
    public String f224941a;

    /* renamed from: b */
    private boolean f224942b;

    /* renamed from: c */
    private byte f224943c;

    /* renamed from: a */
    public final C82576kh mo75792a() {
        String str;
        if (this.f224943c == 1 && (str = this.f224941a) != null) {
            return new C82346bu(str, this.f224942b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224941a == null) {
            sb.append(" token");
        }
        if (this.f224943c == 0) {
            sb.append(" success");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75793b(boolean z) {
        this.f224942b = z;
        this.f224943c = 1;
    }
}
