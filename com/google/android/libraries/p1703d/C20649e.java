package com.google.android.libraries.p1703d;

import android.app.PendingIntent;
import android.graphics.Bitmap;

/* renamed from: com.google.android.libraries.d.e */
/* compiled from: PG */
final class C20649e extends C20659o {

    /* renamed from: a */
    private final int f57894a;

    /* renamed from: b */
    private final Bitmap f57895b;

    /* renamed from: c */
    private final String f57896c;

    /* renamed from: d */
    private final PendingIntent f57897d;

    /* renamed from: e */
    private final boolean f57898e;

    public C20649e(int i, Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
        this.f57894a = i;
        this.f57895b = bitmap;
        this.f57896c = str;
        this.f57897d = pendingIntent;
        this.f57898e = z;
    }

    /* renamed from: a */
    public final int mo25612a() {
        return this.f57894a;
    }

    /* renamed from: b */
    public final PendingIntent mo25613b() {
        return this.f57897d;
    }

    /* renamed from: c */
    public final Bitmap mo25614c() {
        return this.f57895b;
    }

    /* renamed from: d */
    public final String mo25615d() {
        return this.f57896c;
    }

    /* renamed from: e */
    public final boolean mo25616e() {
        return this.f57898e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20659o) {
            C20659o oVar = (C20659o) obj;
            return this.f57894a == oVar.mo25612a() && this.f57895b.equals(oVar.mo25614c()) && this.f57896c.equals(oVar.mo25615d()) && this.f57897d.equals(oVar.mo25613b()) && this.f57898e == oVar.mo25616e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f57894a ^ 1000003) * 1000003) ^ this.f57895b.hashCode()) * 1000003) ^ this.f57896c.hashCode()) * 1000003) ^ this.f57897d.hashCode()) * 1000003) ^ (true != this.f57898e ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f57894a;
        String obj = this.f57895b.toString();
        String str = this.f57896c;
        String obj2 = this.f57897d.toString();
        boolean z = this.f57898e;
        return "CctActionButton{id=" + i + ", immutableIcon=" + obj + ", description=" + str + ", pendingIntent=" + obj2 + ", showOnToolbar=" + z + "}";
    }
}
