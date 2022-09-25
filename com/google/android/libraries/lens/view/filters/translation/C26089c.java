package com.google.android.libraries.lens.view.filters.translation;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.c */
/* compiled from: PG */
final class C26089c extends C26129l {

    /* renamed from: a */
    public final String f70899a;

    /* renamed from: b */
    public final Locale f70900b;

    /* renamed from: c */
    public final int f70901c;

    public C26089c(String str, Locale locale, int i) {
        this.f70899a = str;
        this.f70900b = locale;
        this.f70901c = i;
    }

    /* renamed from: a */
    public final C26128k mo31285a() {
        return new C26062b(this);
    }

    /* renamed from: b */
    public final String mo31286b() {
        return this.f70899a;
    }

    /* renamed from: c */
    public final Locale mo31287c() {
        return this.f70900b;
    }

    /* renamed from: d */
    public final int mo31288d() {
        return this.f70901c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26129l) {
            C26129l lVar = (C26129l) obj;
            String str = this.f70899a;
            if (str != null ? str.equals(lVar.mo31286b()) : lVar.mo31286b() == null) {
                Locale locale = this.f70900b;
                if (locale != null ? locale.equals(lVar.mo31287c()) : lVar.mo31287c() == null) {
                    if (this.f70901c == lVar.mo31288d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f70899a;
        String valueOf = String.valueOf(this.f70900b);
        int i = this.f70901c;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "DOWNLOADED" : "QUEUED" : "DOWNLOADING" : "DOWNLOADABLE";
        return "DownloadLanguageChipState{chipId=" + str + ", locale=" + valueOf + ", chipState=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f70899a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Locale locale = this.f70900b;
        if (locale != null) {
            i2 = locale.hashCode();
        }
        return ((i3 ^ i2) * 1000003) ^ this.f70901c;
    }
}
