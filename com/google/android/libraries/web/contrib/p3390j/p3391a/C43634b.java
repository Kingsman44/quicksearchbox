package com.google.android.libraries.web.contrib.p3390j.p3391a;

import android.text.TextUtils;

/* renamed from: com.google.android.libraries.web.contrib.j.a.b */
/* compiled from: PG */
final class C43634b extends C43637e {

    /* renamed from: a */
    public final String f113882a;

    /* renamed from: b */
    public final TextUtils.TruncateAt f113883b;

    /* renamed from: c */
    public final int f113884c;

    public C43634b(String str, TextUtils.TruncateAt truncateAt, int i) {
        this.f113882a = str;
        this.f113883b = truncateAt;
        this.f113884c = i;
    }

    /* renamed from: a */
    public final TextUtils.TruncateAt mo46660a() {
        return this.f113883b;
    }

    /* renamed from: b */
    public final C43636d mo46661b() {
        return new C43633a(this);
    }

    /* renamed from: c */
    public final String mo46662c() {
        return this.f113882a;
    }

    /* renamed from: d */
    public final int mo46663d() {
        return this.f113884c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43637e) {
            C43637e eVar = (C43637e) obj;
            return this.f113882a.equals(eVar.mo46662c()) && this.f113883b.equals(eVar.mo46660a()) && this.f113884c == eVar.mo46663d();
        }
    }

    public final int hashCode() {
        return ((((this.f113882a.hashCode() ^ 1000003) * 1000003) ^ this.f113883b.hashCode()) * 1000003) ^ this.f113884c;
    }

    public final String toString() {
        String str = this.f113882a;
        String obj = this.f113883b.toString();
        int i = this.f113884c;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "WARNING" : "INFO" : "SECURE" : "NONE";
        return "UrlBarData{displayText=" + str + ", displayTextTruncation=" + obj + ", iconType=" + str2 + "}";
    }
}
