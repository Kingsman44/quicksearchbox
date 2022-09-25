package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.aq */
/* compiled from: PG */
public final class C82315aq extends C82544jc {

    /* renamed from: a */
    public String f224851a;

    /* renamed from: b */
    public String f224852b;

    /* renamed from: c */
    public String f224853c;

    /* renamed from: d */
    private boolean f224854d;

    /* renamed from: e */
    private String f224855e;

    /* renamed from: f */
    private int f224856f;

    /* renamed from: g */
    private byte f224857g;

    /* renamed from: a */
    public final C82545jd mo75661a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f224857g == 7 && (str = this.f224851a) != null && (str2 = this.f224852b) != null && (str3 = this.f224855e) != null && (str4 = this.f224853c) != null) {
            return new C82316ar(str, this.f224854d, str2, str3, str4, this.f224856f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224851a == null) {
            sb.append(" token");
        }
        if ((this.f224857g & 1) == 0) {
            sb.append(" onDeviceEnabled");
        }
        if (this.f224852b == null) {
            sb.append(" action");
        }
        if (this.f224855e == null) {
            sb.append(" status");
        }
        if (this.f224853c == null) {
            sb.append(" sessionType");
        }
        if ((this.f224857g & 2) == 0) {
            sb.append(" isContinuousMode");
        }
        if ((this.f224857g & 4) == 0) {
            sb.append(" apiLevel");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75662b(int i) {
        this.f224856f = i;
        this.f224857g = (byte) (this.f224857g | 4);
    }

    /* renamed from: c */
    public final void mo75663c() {
        this.f224857g = (byte) (this.f224857g | 2);
    }

    /* renamed from: d */
    public final void mo75664d(boolean z) {
        this.f224854d = z;
        this.f224857g = (byte) (this.f224857g | 1);
    }

    /* renamed from: e */
    public final void mo75665e(String str) {
        if (str != null) {
            this.f224855e = str;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
