package com.google.android.libraries.notifications.p2268e.p2287j;

/* renamed from: com.google.android.libraries.notifications.e.j.c */
/* compiled from: PG */
public final class C29952c extends C29955f {

    /* renamed from: a */
    private final String f81109a;

    /* renamed from: b */
    private final boolean f81110b;

    public C29952c(String str, boolean z) {
        this.f81109a = str;
        this.f81110b = z;
    }

    /* renamed from: a */
    public final String mo35251a() {
        return this.f81109a;
    }

    /* renamed from: b */
    public final boolean mo35252b() {
        return this.f81110b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29955f) {
            C29955f fVar = (C29955f) obj;
            return this.f81109a.equals(fVar.mo35251a()) && this.f81110b == fVar.mo35252b();
        }
    }

    public final int hashCode() {
        return ((this.f81109a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f81110b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f81109a;
        boolean z = this.f81110b;
        return "ChimeNotificationChannelGroup{id=" + str + ", blocked=" + z + "}";
    }
}
