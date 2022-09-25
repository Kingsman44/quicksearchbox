package com.google.android.libraries.componentview.services.application;

import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;

/* renamed from: com.google.android.libraries.componentview.services.application.f */
/* compiled from: PG */
final class C20615f extends C20599bz {

    /* renamed from: a */
    public final Throwable f57827a;

    /* renamed from: b */
    public final String f57828b;

    /* renamed from: c */
    public final String f57829c;

    /* renamed from: d */
    public final String f57830d;

    /* renamed from: e */
    public final String f57831e;

    /* renamed from: f */
    public final C19742a f57832f;

    public C20615f(Throwable th, String str, String str2, String str3, String str4, C19742a aVar) {
        this.f57827a = th;
        this.f57828b = str;
        this.f57829c = str2;
        this.f57830d = str3;
        this.f57831e = str4;
        this.f57832f = aVar;
    }

    /* renamed from: a */
    public final C19742a mo25537a() {
        return this.f57832f;
    }

    /* renamed from: b */
    public final C20598by mo25538b() {
        return new C20614e(this);
    }

    /* renamed from: c */
    public final String mo25539c() {
        return this.f57830d;
    }

    /* renamed from: d */
    public final String mo25540d() {
        return this.f57831e;
    }

    /* renamed from: e */
    public final String mo25541e() {
        return this.f57828b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20599bz) {
            C20599bz bzVar = (C20599bz) obj;
            Throwable th = this.f57827a;
            if (th != null ? th.equals(bzVar.mo25543g()) : bzVar.mo25543g() == null) {
                String str = this.f57828b;
                if (str != null ? str.equals(bzVar.mo25541e()) : bzVar.mo25541e() == null) {
                    String str2 = this.f57829c;
                    if (str2 != null ? str2.equals(bzVar.mo25542f()) : bzVar.mo25542f() == null) {
                        String str3 = this.f57830d;
                        if (str3 != null ? str3.equals(bzVar.mo25539c()) : bzVar.mo25539c() == null) {
                            String str4 = this.f57831e;
                            if (str4 != null ? str4.equals(bzVar.mo25540d()) : bzVar.mo25540d() == null) {
                                if (this.f57832f.equals(bzVar.mo25537a())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String mo25542f() {
        return this.f57829c;
    }

    /* renamed from: g */
    public final Throwable mo25543g() {
        return this.f57827a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f57827a);
        String str = this.f57828b;
        String str2 = this.f57829c;
        String str3 = this.f57830d;
        String str4 = this.f57831e;
        String obj = this.f57832f.toString();
        return "ErrorInfo{cause=" + valueOf + ", message=" + str + ", ved=" + str2 + ", componentName=" + str3 + ", dumpInfo=" + str4 + ", errorCode=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        Throwable th = this.f57827a;
        int i4 = 0;
        int hashCode = ((th == null ? 0 : th.hashCode()) ^ 1000003) * 1000003;
        String str = this.f57828b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (hashCode ^ i) * 1000003;
        String str2 = this.f57829c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str3 = this.f57830d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        String str4 = this.f57831e;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return ((i7 ^ i4) * 1000003) ^ this.f57832f.hashCode();
    }
}
