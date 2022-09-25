package com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.a.e */
/* compiled from: PG */
public final class C134785e {

    /* renamed from: a */
    public final boolean f366990a;

    /* renamed from: b */
    public final Integer f366991b;

    /* renamed from: c */
    public final Integer f366992c;

    /* renamed from: d */
    public final int f366993d;

    /* renamed from: e */
    public final int f366994e;

    /* renamed from: f */
    public final int f366995f;

    /* renamed from: g */
    public final int f366996g;

    /* renamed from: h */
    private final int f366997h;

    public C134785e(boolean z, Integer num, Integer num2, int i, int i2, int i3, int i4) {
        this.f366990a = z;
        this.f366991b = num;
        this.f366992c = num2;
        this.f366993d = i;
        this.f366994e = i2;
        this.f366995f = i3;
        this.f366996g = i4;
        this.f366997h = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C134785e(boolean z, Integer num, Integer num2, int i, int i2, int i3, int i4, int i5) {
        this(z, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? null : num2, i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134785e)) {
            return false;
        }
        C134785e eVar = (C134785e) obj;
        if (this.f366990a != eVar.f366990a || !C69664n.m101066l(this.f366991b, eVar.f366991b) || !C69664n.m101066l(this.f366992c, eVar.f366992c) || this.f366993d != eVar.f366993d || this.f366994e != eVar.f366994e || this.f366995f != eVar.f366995f || this.f366996g != eVar.f366996g) {
            return false;
        }
        int i = eVar.f366997h;
        return true;
    }

    public final int hashCode() {
        int i = (this.f366990a ? 1 : 0) * true;
        Integer num = this.f366991b;
        int i2 = 0;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f366992c;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return (((((((((hashCode + i2) * 31) + this.f366993d) * 31) + this.f366994e) * 31) + this.f366995f) * 31) + this.f366996g) * 31;
    }

    public final String toString() {
        boolean z = this.f366990a;
        Integer num = this.f366991b;
        Integer num2 = this.f366992c;
        int i = this.f366993d;
        int i2 = this.f366994e;
        int i3 = this.f366995f;
        int i4 = this.f366996g;
        return "ErrorRenderData(fullFeed=" + z + ", icon=" + num + ", title=" + num2 + ", message=" + i + ", primaryActionLabel=" + i2 + ", primaryActionIcon=" + i3 + ", secondaryActionLabel=" + i4 + ", secondaryActionIcon=0)";
    }
}
