package com.google.android.libraries.gsa.monet.shared;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.shared.y */
/* compiled from: PG */
public final class C23129y {

    /* renamed from: a */
    public final String f63476a;

    /* renamed from: b */
    public final String f63477b;

    /* renamed from: c */
    public final String f63478c;

    public C23129y(String str) {
        this.f63478c = str;
        if (str.lastIndexOf(46) == -1) {
            this.f63476a = BuildConfig.FLAVOR;
            this.f63477b = str;
            return;
        }
        int indexOf = str.indexOf(46);
        this.f63476a = str.substring(0, indexOf);
        this.f63477b = str.substring(indexOf + 1);
    }

    /* renamed from: a */
    public static C23129y m43315a(String str) {
        m43316d(str);
        return new C23129y(BuildConfig.FLAVOR, str);
    }

    /* renamed from: d */
    private static void m43316d(String str) {
        C23067b.m43230c(str.indexOf(46) < 0, "Not a local type: %s", str);
    }

    /* renamed from: b */
    public final C23129y mo28576b(String str) {
        m43316d(str);
        if (!mo28577c()) {
            return new C23129y(str);
        }
        String str2 = this.f63476a;
        return new C23129y(str2 + "." + str);
    }

    /* renamed from: c */
    public final boolean mo28577c() {
        return !this.f63476a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23129y)) {
            return false;
        }
        return TextUtils.equals(this.f63478c, ((C23129y) obj).f63478c);
    }

    public final int hashCode() {
        return this.f63478c.hashCode();
    }

    public final String toString() {
        return this.f63478c;
    }

    public C23129y(String str, String str2) {
        String str3;
        if (str.isEmpty()) {
            str3 = str2;
        } else {
            str3 = str + "." + str2;
        }
        this.f63478c = str3;
        this.f63476a = str;
        this.f63477b = str2;
    }
}
