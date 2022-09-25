package com.google.common.base;

import java.util.regex.Matcher;

/* renamed from: com.google.common.base.al */
/* compiled from: PG */
final class C58821al extends C58914x {

    /* renamed from: a */
    final Matcher f156613a;

    public C58821al(Matcher matcher) {
        matcher.getClass();
        this.f156613a = matcher;
    }

    /* renamed from: a */
    public final int mo56085a() {
        return this.f156613a.end();
    }

    /* renamed from: b */
    public final int mo56086b() {
        return this.f156613a.start();
    }

    /* renamed from: c */
    public final boolean mo56087c(int i) {
        return this.f156613a.find(i);
    }

    /* renamed from: d */
    public final boolean mo56088d() {
        return this.f156613a.matches();
    }
}
