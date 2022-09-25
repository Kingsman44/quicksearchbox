package com.google.android.apps.search.podcasts.language.p10577a;

import com.google.android.apps.search.podcasts.p10600q.C140944c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.a.c */
/* compiled from: PG */
public final class C140518c implements C140944c {

    /* renamed from: a */
    public final String f381655a;

    public C140518c(String str) {
        C69664n.m101061g(str, "text");
        this.f381655a = str;
    }

    /* renamed from: a */
    public final String mo115619a() {
        return this.f381655a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        C140518c cVar2 = (C140518c) cVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140518c) && C69664n.m101066l(this.f381655a, ((C140518c) obj).f381655a);
    }

    public final int hashCode() {
        return this.f381655a.hashCode();
    }

    public final String toString() {
        String str = this.f381655a;
        return "LanguageHeaderData(text=" + str + ")";
    }
}
