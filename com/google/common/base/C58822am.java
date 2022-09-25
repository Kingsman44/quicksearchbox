package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.common.base.am */
/* compiled from: PG */
final class C58822am extends C58915y implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Pattern f156614a;

    public C58822am(Pattern pattern) {
        pattern.getClass();
        this.f156614a = pattern;
    }

    /* renamed from: a */
    public final C58914x mo56089a(CharSequence charSequence) {
        return new C58821al(this.f156614a.matcher(charSequence));
    }

    public final String toString() {
        return this.f156614a.toString();
    }
}
