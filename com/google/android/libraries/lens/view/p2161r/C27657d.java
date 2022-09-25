package com.google.android.libraries.lens.view.p2161r;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.lens.view.r.d */
/* compiled from: PG */
final class C27657d {

    /* renamed from: a */
    public final int f75510a;

    /* renamed from: b */
    private final String f75511b;

    /* renamed from: c */
    private final String f75512c;

    public C27657d(int i, String str, String str2) {
        this.f75510a = i;
        this.f75511b = str;
        this.f75512c = str2;
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f75511b) && !TextUtils.isEmpty(this.f75512c)) {
            String str = this.f75511b;
            String str2 = this.f75512c;
            return str + ": " + str2;
        } else if (!TextUtils.isEmpty(this.f75511b)) {
            return String.valueOf(this.f75511b).concat(":");
        } else {
            return !TextUtils.isEmpty(this.f75512c) ? String.valueOf(this.f75512c) : BuildConfig.FLAVOR;
        }
    }
}
