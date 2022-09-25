package com.google.android.apps.gsa.shared.util.debug.p7163a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.c */
/* compiled from: PG */
final class C91003c {

    /* renamed from: a */
    public final int f254226a;

    /* renamed from: b */
    public final int f254227b;

    /* renamed from: c */
    private final String f254228c;

    /* renamed from: d */
    private final CharSequence f254229d;

    public C91003c(int i, String str, CharSequence charSequence, int i2) {
        this.f254226a = i;
        this.f254228c = str;
        this.f254229d = charSequence;
        this.f254227b = i2;
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f254228c) && !TextUtils.isEmpty(this.f254229d)) {
            String str = this.f254228c;
            String valueOf = String.valueOf(this.f254229d);
            return str + ": " + valueOf;
        } else if (!TextUtils.isEmpty(this.f254228c)) {
            return String.valueOf(this.f254228c).concat(":");
        } else {
            return !TextUtils.isEmpty(this.f254229d) ? String.valueOf(this.f254229d) : BuildConfig.FLAVOR;
        }
    }
}
