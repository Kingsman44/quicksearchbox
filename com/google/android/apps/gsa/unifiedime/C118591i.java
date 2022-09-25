package com.google.android.apps.gsa.unifiedime;

import java.util.List;

/* renamed from: com.google.android.apps.gsa.unifiedime.i */
/* compiled from: PG */
final class C118591i extends C118607y {

    /* renamed from: a */
    public final String f330870a;

    /* renamed from: b */
    public final List f330871b;

    public C118591i(String str, List list) {
        this.f330870a = str;
        this.f330871b = list;
    }

    /* renamed from: a */
    public final String mo103775a() {
        return this.f330870a;
    }

    /* renamed from: b */
    public final List mo103776b() {
        return this.f330871b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C118607y) {
            C118607y yVar = (C118607y) obj;
            return this.f330870a.equals(yVar.mo103775a()) && this.f330871b.equals(yVar.mo103776b());
        }
    }

    public final int hashCode() {
        return ((this.f330870a.hashCode() ^ 1000003) * 1000003) ^ this.f330871b.hashCode();
    }

    public final String toString() {
        String str = this.f330870a;
        String obj = this.f330871b.toString();
        return "UnifiedImeRecognitionLocale{primaryRequestLocale=" + str + ", secondaryRequestLocales=" + obj + "}";
    }
}
