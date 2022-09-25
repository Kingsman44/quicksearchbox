package com.google.android.libraries.componentview.services.application;

/* renamed from: com.google.android.libraries.componentview.services.application.c */
/* compiled from: PG */
final class C20600c extends C20577bd {

    /* renamed from: a */
    private final String f57801a;

    public C20600c(String str) {
        if (str != null) {
            this.f57801a = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final String mo25515a() {
        return this.f57801a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20577bd) {
            return this.f57801a.equals(((C20577bd) obj).mo25515a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f57801a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f57801a;
        return "HeaderKey{key=" + str + "}";
    }
}
