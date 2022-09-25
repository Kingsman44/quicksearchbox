package com.google.android.apps.search.podcasts.search.p10609a;

import com.google.android.apps.search.podcasts.p10600q.C140944c;
import com.google.p4017at.p4082j.p4083a.C54406de;
import com.google.p4017at.p4082j.p4083a.C54407df;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.a.a */
/* compiled from: PG */
public final class C141000a implements C140944c {

    /* renamed from: a */
    public final C54407df f382801a;

    public C141000a(C54407df dfVar) {
        C69664n.m101061g(dfVar, "suggestResult");
        this.f382801a = dfVar;
    }

    /* renamed from: a */
    public final String mo115619a() {
        C54407df dfVar = this.f382801a;
        String str = dfVar.f142897a;
        int b = C54406de.m87381b(dfVar.f142898b);
        if (b == 0) {
            b = 1;
        }
        Integer.toString(C54406de.m87380a(b));
        return String.valueOf(str).concat(Integer.toString(C54406de.m87380a(b)));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C69664n.m101066l(this.f382801a, ((C141000a) cVar).f382801a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C141000a) && C69664n.m101066l(this.f382801a, ((C141000a) obj).f382801a);
    }

    public final int hashCode() {
        return this.f382801a.hashCode();
    }

    public final String toString() {
        C54407df dfVar = this.f382801a;
        return "SearchSuggestItemData(suggestResult=" + dfVar + ")";
    }
}
