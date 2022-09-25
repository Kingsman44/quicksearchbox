package com.google.android.libraries.p11002ag.p11003a;

import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.ag.a.e */
/* compiled from: PG */
public final class C147555e {

    /* renamed from: a */
    private final C147554d f398251a;

    public C147555e(int i) {
        this.f398251a = new C147554d(i);
    }

    /* renamed from: a */
    public final Pattern mo124309a(String str) {
        Pattern pattern = (Pattern) this.f398251a.mo124307a(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.f398251a.mo124308b(str, compile);
        return compile;
    }
}
