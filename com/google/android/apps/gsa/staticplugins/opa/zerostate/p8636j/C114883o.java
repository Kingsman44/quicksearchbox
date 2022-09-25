package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.o */
/* compiled from: PG */
public final class C114883o extends C114810bg {

    /* renamed from: a */
    private int f318744a;

    /* renamed from: b */
    private String f318745b;

    /* renamed from: c */
    private String f318746c;

    /* renamed from: d */
    private long f318747d;

    /* renamed from: e */
    private byte f318748e;

    /* renamed from: a */
    public final C114811bh mo101609a() {
        String str;
        String str2;
        if (this.f318748e == 3 && (str = this.f318745b) != null && (str2 = this.f318746c) != null) {
            return new C114884p(this.f318744a, str, str2, this.f318747d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f318748e & 1) == 0) {
            sb.append(" id");
        }
        if (this.f318745b == null) {
            sb.append(" displayText");
        }
        if (this.f318746c == null) {
            sb.append(" query");
        }
        if ((this.f318748e & 2) == 0) {
            sb.append(" expirationTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58833ax mo101610b() {
        String str = this.f318746c;
        return str == null ? C58836b.f156633a : C58833ax.m90834k(str);
    }

    /* renamed from: c */
    public final String mo101611c() {
        String str = this.f318745b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"displayText\" has not been set");
    }

    /* renamed from: d */
    public final void mo101612d(String str) {
        if (str != null) {
            this.f318745b = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: e */
    public final void mo101613e(long j) {
        this.f318747d = j;
        this.f318748e = (byte) (this.f318748e | 2);
    }

    /* renamed from: f */
    public final void mo101614f(int i) {
        this.f318744a = i;
        this.f318748e = (byte) (this.f318748e | 1);
    }

    /* renamed from: g */
    public final void mo101615g(String str) {
        if (str != null) {
            this.f318746c = str;
            return;
        }
        throw new NullPointerException("Null query");
    }
}
