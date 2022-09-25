package com.google.android.libraries.p1623at.p1631d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1623at.p1625b.C19468a;
import com.google.android.libraries.p1623at.p1625b.C19471d;
import com.google.android.libraries.p1623at.p1632e.C19557e;

/* renamed from: com.google.android.libraries.at.d.a */
/* compiled from: PG */
public final class C19552a {

    /* renamed from: a */
    private static final C19468a f54448a = new C19468a("debug.properties.can_override");

    /* renamed from: b */
    private final String f54449b;

    /* renamed from: c */
    private final String f54450c;

    public C19552a(String str, String str2) {
        this.f54449b = str;
        this.f54450c = str2;
    }

    /* renamed from: a */
    public final String mo24804a() {
        if (!C19471d.m37154a(f54448a)) {
            return this.f54450c;
        }
        String b = C19557e.m37300b(this.f54449b, this.f54450c);
        if (b == null || b.length() != 91) {
            return b;
        }
        String str = this.f54449b;
        StringBuilder sb = new StringBuilder(b);
        int i = 2;
        while (true) {
            int i2 = i + 1;
            String b2 = C19557e.m37300b(str + i, BuildConfig.FLAVOR);
            sb.append(b2);
            if (b2.length() != 91) {
                return sb.toString();
            }
            i = i2;
        }
    }
}
