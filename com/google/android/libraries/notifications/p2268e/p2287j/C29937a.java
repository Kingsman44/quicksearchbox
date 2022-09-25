package com.google.android.libraries.notifications.p2268e.p2287j;

/* renamed from: com.google.android.libraries.notifications.e.j.a */
/* compiled from: PG */
public final class C29937a extends C29953d {

    /* renamed from: a */
    private final String f81070a;

    /* renamed from: b */
    private final String f81071b;

    /* renamed from: c */
    private final int f81072c;

    public C29937a(String str, String str2, int i) {
        this.f81070a = str;
        this.f81071b = str2;
        this.f81072c = i;
    }

    /* renamed from: a */
    public final String mo35223a() {
        return this.f81071b;
    }

    /* renamed from: b */
    public final String mo35224b() {
        return this.f81070a;
    }

    /* renamed from: c */
    public final int mo35225c() {
        return this.f81072c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29953d) {
            C29953d dVar = (C29953d) obj;
            return this.f81070a.equals(dVar.mo35224b()) && this.f81071b.equals(dVar.mo35223a()) && this.f81072c == dVar.mo35225c();
        }
    }

    public final int hashCode() {
        return ((((this.f81070a.hashCode() ^ 1000003) * 1000003) ^ this.f81071b.hashCode()) * 1000003) ^ this.f81072c;
    }

    public final String toString() {
        String str = this.f81070a;
        String str2 = this.f81071b;
        int i = this.f81072c;
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "IMPORTANCE_NONE" : "IMPORTANCE_LOW" : "IMPORTANCE_HIGH" : "IMPORTANCE_DEFAULT" : "IMPORTANCE_UNSPECIFIED";
        return "ChimeNotificationChannel{id=" + str + ", group=" + str2 + ", importance=" + str3 + "}";
    }
}
