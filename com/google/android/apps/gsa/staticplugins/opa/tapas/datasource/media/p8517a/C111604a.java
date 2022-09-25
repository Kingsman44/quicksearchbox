package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.net.Uri;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.a */
/* compiled from: PG */
final class C111604a extends C111621k {

    /* renamed from: b */
    private final String f310347b;

    /* renamed from: c */
    private final Uri f310348c;

    /* renamed from: d */
    private final C60755l f310349d;

    public C111604a(String str, Uri uri, C60755l lVar) {
        this.f310347b = str;
        this.f310348c = uri;
        this.f310349d = lVar;
    }

    /* renamed from: a */
    public final Uri mo99188a() {
        return this.f310348c;
    }

    /* renamed from: b */
    public final C60755l mo99189b() {
        return this.f310349d;
    }

    /* renamed from: c */
    public final String mo99190c() {
        return this.f310347b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111621k) {
            C111621k kVar = (C111621k) obj;
            String str = this.f310347b;
            if (str != null ? str.equals(kVar.mo99190c()) : kVar.mo99190c() == null) {
                Uri uri = this.f310348c;
                if (uri != null ? uri.equals(kVar.mo99188a()) : kVar.mo99188a() == null) {
                    if (this.f310349d.equals(kVar.mo99189b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f310347b;
        String valueOf = String.valueOf(this.f310348c);
        String obj = this.f310349d.toString();
        return "GooglePlayMusicMediaItemWrapper{title=" + str + ", iconUri=" + valueOf + ", iconBitmapPixels=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f310347b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Uri uri = this.f310348c;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f310349d.hashCode();
    }
}
