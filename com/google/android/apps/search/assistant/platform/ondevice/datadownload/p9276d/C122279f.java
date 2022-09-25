package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.f */
/* compiled from: PG */
final class C122279f extends C122296w {

    /* renamed from: a */
    public final String f339067a;

    /* renamed from: b */
    public final String f339068b;

    public C122279f(String str, String str2) {
        if (str != null) {
            this.f339067a = str;
            if (str2 != null) {
                this.f339068b = str2;
                return;
            }
            throw new NullPointerException("Null notificationText");
        }
        throw new NullPointerException("Null notificationTitle");
    }

    /* renamed from: a */
    public final String mo105584a() {
        return this.f339068b;
    }

    /* renamed from: b */
    public final String mo105585b() {
        return this.f339067a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122296w) {
            C122296w wVar = (C122296w) obj;
            return this.f339067a.equals(wVar.mo105585b()) && this.f339068b.equals(wVar.mo105584a());
        }
    }

    public final int hashCode() {
        return ((this.f339067a.hashCode() ^ 1000003) * 1000003) ^ this.f339068b.hashCode();
    }

    public final String toString() {
        String str = this.f339067a;
        String str2 = this.f339068b;
        return "NotificationData{notificationTitle=" + str + ", notificationText=" + str2 + "}";
    }
}
