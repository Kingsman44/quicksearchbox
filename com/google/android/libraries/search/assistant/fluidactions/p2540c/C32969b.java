package com.google.android.libraries.search.assistant.fluidactions.p2540c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.b */
/* compiled from: PG */
public final class C32969b extends C32972e {

    /* renamed from: a */
    private final String f88337a;

    public C32969b(String str) {
        this.f88337a = str;
    }

    /* renamed from: a */
    public final String mo38414a() {
        return this.f88337a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32972e) {
            return this.f88337a.equals(((C32972e) obj).mo38414a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f88337a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f88337a;
        return "DeviceSettingMonitorToken{token=" + str + "}";
    }
}
