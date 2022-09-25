package com.google.android.apps.search.podcasts.language.p10577a;

import com.google.android.apps.search.podcasts.p10600q.C140944c;
import com.google.p4017at.p4082j.p4083a.C54359bl;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.a.d */
/* compiled from: PG */
public final class C140519d implements C140944c {

    /* renamed from: a */
    public final C54359bl f381656a;

    /* renamed from: b */
    public final boolean f381657b;

    /* renamed from: c */
    public final boolean f381658c;

    /* renamed from: d */
    private final boolean f381659d;

    public C140519d(C54359bl blVar, boolean z, boolean z2, boolean z3) {
        C69664n.m101061g(blVar, "languageOption");
        this.f381656a = blVar;
        this.f381659d = z;
        this.f381657b = z2;
        this.f381658c = z3;
    }

    /* renamed from: a */
    public final String mo115619a() {
        String str = this.f381656a.f142797a;
        boolean z = this.f381659d;
        return str + z;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        C140519d dVar = (C140519d) cVar;
        return this.f381657b == dVar.f381657b && this.f381658c == dVar.f381658c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140519d)) {
            return false;
        }
        C140519d dVar = (C140519d) obj;
        return C69664n.m101066l(this.f381656a, dVar.f381656a) && this.f381659d == dVar.f381659d && this.f381657b == dVar.f381657b && this.f381658c == dVar.f381658c;
    }

    public final int hashCode() {
        return (((((this.f381656a.hashCode() * 31) + (this.f381659d ? 1 : 0)) * 31) + (this.f381657b ? 1 : 0)) * 31) + (this.f381658c ? 1 : 0);
    }

    public final String toString() {
        C54359bl blVar = this.f381656a;
        boolean z = this.f381659d;
        boolean z2 = this.f381657b;
        boolean z3 = this.f381658c;
        return "LanguageItemData(languageOption=" + blVar + ", isSuggestedLanguage=" + z + ", isSelected=" + z2 + ", isEnabled=" + z3 + ")";
    }
}
