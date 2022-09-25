package com.google.android.apps.search.podcasts.language.p10577a;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.a.b */
/* compiled from: PG */
public final class C140517b {

    /* renamed from: a */
    public final C140952k f381653a;

    /* renamed from: b */
    public final boolean f381654b;

    public C140517b(C140952k kVar, boolean z) {
        this.f381653a = kVar;
        this.f381654b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140517b)) {
            return false;
        }
        C140517b bVar = (C140517b) obj;
        return C69664n.m101066l(this.f381653a, bVar.f381653a) && this.f381654b == bVar.f381654b;
    }

    public final int hashCode() {
        return (this.f381653a.hashCode() * 31) + (this.f381654b ? 1 : 0);
    }

    public final String toString() {
        C140952k kVar = this.f381653a;
        boolean z = this.f381654b;
        return "LanguageDialogData(recyclerViewData=" + kVar + ", enableSaveButton=" + z + ")";
    }
}
