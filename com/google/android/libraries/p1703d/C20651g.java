package com.google.android.libraries.p1703d;

import android.app.PendingIntent;

/* renamed from: com.google.android.libraries.d.g */
/* compiled from: PG */
final class C20651g extends C20667w {

    /* renamed from: a */
    private final String f57901a;

    /* renamed from: b */
    private final PendingIntent f57902b;

    public C20651g(String str, PendingIntent pendingIntent) {
        this.f57901a = str;
        this.f57902b = pendingIntent;
    }

    /* renamed from: a */
    public final PendingIntent mo25622a() {
        return this.f57902b;
    }

    /* renamed from: b */
    public final String mo25623b() {
        return this.f57901a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20667w) {
            C20667w wVar = (C20667w) obj;
            return this.f57901a.equals(wVar.mo25623b()) && this.f57902b.equals(wVar.mo25622a());
        }
    }

    public final int hashCode() {
        return ((this.f57901a.hashCode() ^ 1000003) * 1000003) ^ this.f57902b.hashCode();
    }

    public final String toString() {
        String str = this.f57901a;
        String obj = this.f57902b.toString();
        return "CctMenuButton{title=" + str + ", pendingIntent=" + obj + "}";
    }
}
