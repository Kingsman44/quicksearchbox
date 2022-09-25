package com.google.android.apps.search.podcasts.library.history.p10582a;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.history.a.a */
/* compiled from: PG */
public final class C140584a {

    /* renamed from: a */
    public final C140952k f381808a;

    /* renamed from: b */
    public final boolean f381809b;

    public C140584a(C140952k kVar, boolean z) {
        this.f381808a = kVar;
        this.f381809b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140584a)) {
            return false;
        }
        C140584a aVar = (C140584a) obj;
        return C69664n.m101066l(this.f381808a, aVar.f381808a) && this.f381809b == aVar.f381809b;
    }

    public final int hashCode() {
        return (this.f381808a.hashCode() * 31) + (this.f381809b ? 1 : 0);
    }

    public final String toString() {
        C140952k kVar = this.f381808a;
        boolean z = this.f381809b;
        return "HistoryData(recyclerViewData=" + kVar + ", showCompletedEpisodes=" + z + ")";
    }
}
