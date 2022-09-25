package com.google.apps.tiktok.contrib.p3629c;

/* renamed from: com.google.apps.tiktok.contrib.c.i */
/* compiled from: PG */
final class C46488i extends C46489j {

    /* renamed from: a */
    private final String f121636a;

    public C46488i(String str) {
        this.f121636a = str;
    }

    /* renamed from: b */
    public final int mo50487b() {
        return 2;
    }

    /* renamed from: c */
    public final String mo50491c() {
        return this.f121636a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C46495p) {
            C46495p pVar = (C46495p) obj;
            if (pVar.mo50487b() != 2 || !this.f121636a.equals(pVar.mo50491c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f121636a.hashCode();
    }

    public final String toString() {
        String str = this.f121636a;
        return "TikTokArgument{string=" + str + "}";
    }
}
