package com.google.android.libraries.gsa.conversation.p1838b;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.gsa.conversation.b.c */
/* compiled from: PG */
public final class C22349c {

    /* renamed from: a */
    public final int f61691a;

    /* renamed from: b */
    public final int f61692b;

    /* renamed from: c */
    private final String f61693c;

    /* renamed from: d */
    private final CharSequence f61694d;

    public C22349c(int i, String str, CharSequence charSequence, int i2) {
        this.f61691a = i;
        this.f61693c = str;
        this.f61694d = charSequence;
        this.f61692b = i2;
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f61693c) && !TextUtils.isEmpty(this.f61694d)) {
            String str = this.f61693c;
            String valueOf = String.valueOf(this.f61694d);
            return str + ": " + valueOf;
        } else if (!TextUtils.isEmpty(this.f61693c)) {
            return String.valueOf(this.f61693c).concat(":");
        } else {
            return !TextUtils.isEmpty(this.f61694d) ? String.valueOf(this.f61694d) : BuildConfig.FLAVOR;
        }
    }
}
