package com.google.android.gms.common;

import android.util.Log;

/* renamed from: com.google.android.gms.common.w */
/* compiled from: PG */
public class C144020w {

    /* renamed from: a */
    public static final C144020w f390257a = new C144020w(true, (String) null, (Throwable) null);

    /* renamed from: b */
    final boolean f390258b;

    /* renamed from: c */
    final String f390259c;

    /* renamed from: d */
    final Throwable f390260d;

    public C144020w(boolean z, String str, Throwable th) {
        this.f390258b = z;
        this.f390259c = str;
        this.f390260d = th;
    }

    /* renamed from: b */
    static C144020w m234200b(String str) {
        return new C144020w(false, str, (Throwable) null);
    }

    /* renamed from: c */
    static C144020w m234201c(String str, Throwable th) {
        return new C144020w(false, str, th);
    }

    /* renamed from: a */
    public String mo119527a() {
        return this.f390259c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo119528d() {
        if (!this.f390258b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f390260d != null) {
                Log.d("GoogleCertificatesRslt", mo119527a(), this.f390260d);
            } else {
                Log.d("GoogleCertificatesRslt", mo119527a());
            }
        }
    }

    /* renamed from: e */
    public final void mo119529e() {
        if (!this.f390258b) {
            String str = "GoogleCertificatesRslt: " + mo119527a() + " (go/gsrlt)";
            Throwable th = this.f390260d;
            if (th != null) {
                throw new SecurityException(str, th);
            }
            throw new SecurityException(str);
        }
    }
}
