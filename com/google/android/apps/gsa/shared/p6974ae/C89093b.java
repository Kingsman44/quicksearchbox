package com.google.android.apps.gsa.shared.p6974ae;

/* renamed from: com.google.android.apps.gsa.shared.ae.b */
/* compiled from: PG */
final class C89093b extends C89097f {

    /* renamed from: a */
    private final int f241436a;

    /* renamed from: b */
    private final int f241437b;

    /* renamed from: c */
    private final int f241438c;

    /* renamed from: d */
    private final int f241439d;

    public C89093b(int i, int i2, int i3, int i4) {
        this.f241436a = i;
        this.f241437b = i2;
        this.f241438c = i3;
        this.f241439d = i4;
    }

    /* renamed from: a */
    public final int mo83064a() {
        return this.f241436a;
    }

    /* renamed from: b */
    public final int mo83065b() {
        return this.f241437b;
    }

    /* renamed from: c */
    public final int mo83066c() {
        return this.f241439d;
    }

    /* renamed from: d */
    public final int mo83067d() {
        return this.f241438c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89097f) {
            C89097f fVar = (C89097f) obj;
            return this.f241436a == fVar.mo83064a() && this.f241437b == fVar.mo83065b() && this.f241438c == fVar.mo83067d() && this.f241439d == fVar.mo83066c();
        }
    }

    public final int hashCode() {
        return ((((((this.f241436a ^ 1000003) * 1000003) ^ this.f241437b) * 1000003) ^ this.f241438c) * 1000003) ^ this.f241439d;
    }

    public final String toString() {
        int i = this.f241436a;
        int i2 = this.f241437b;
        int i3 = this.f241438c;
        int i4 = this.f241439d;
        return "NotificationStringIds{needPermissionNotificationId=" + i + ", needPermissionNotificationTitleId=" + i2 + ", needPermissionTtsId=" + i3 + ", needPermissionTtsFallbackEnabledId=" + i4 + "}";
    }
}
