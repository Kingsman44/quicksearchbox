package com.google.research.p5181a.p5187e;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.research.a.e.p */
/* compiled from: PG */
public final class C66366p implements Comparable {

    /* renamed from: a */
    public final String f180455a;

    /* renamed from: b */
    public final float f180456b;

    /* renamed from: c */
    public final Set f180457c;

    public C66366p(String str, float f, String str2) {
        this.f180455a = str;
        this.f180456b = f;
        this.f180457c = new HashSet(Arrays.asList(new String[]{str2}));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.f180456b, ((C66366p) obj).f180456b);
    }

    public C66366p(String str, float f, Set set) {
        this.f180455a = str;
        this.f180456b = f;
        this.f180457c = new HashSet(set);
    }
}
