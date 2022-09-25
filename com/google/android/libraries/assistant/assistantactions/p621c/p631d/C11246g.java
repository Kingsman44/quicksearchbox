package com.google.android.libraries.assistant.assistantactions.p621c.p631d;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.d.g */
/* compiled from: PG */
public final class C11246g {

    /* renamed from: a */
    public final int f36662a = 1;

    /* renamed from: b */
    public final int f36663b;

    /* renamed from: c */
    private final String f36664c;

    /* renamed from: d */
    private final CharSequence f36665d;

    public C11246g(String str, CharSequence charSequence) {
        this.f36664c = str;
        this.f36665d = charSequence;
        this.f36663b = 3;
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f36664c) && !TextUtils.isEmpty(this.f36665d)) {
            String str = this.f36664c;
            String valueOf = String.valueOf(this.f36665d);
            return str + ": " + valueOf;
        } else if (!TextUtils.isEmpty(this.f36664c)) {
            return this.f36664c.concat(":");
        } else {
            return !TextUtils.isEmpty(this.f36665d) ? String.valueOf(this.f36665d) : BuildConfig.FLAVOR;
        }
    }
}
