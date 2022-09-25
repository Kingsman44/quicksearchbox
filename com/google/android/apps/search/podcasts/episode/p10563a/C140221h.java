package com.google.android.apps.search.podcasts.episode.p10563a;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.common.p4538j.p4539a.C59308f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.episode.a.h */
/* compiled from: PG */
public final class C140221h {

    /* renamed from: a */
    public final C140993o f380959a;

    /* renamed from: b */
    public final C140641b f380960b;

    /* renamed from: c */
    public final C59308f f380961c;

    public C140221h(C140993o oVar, C140641b bVar, C59308f fVar) {
        C69664n.m101061g(oVar, "userViewable");
        this.f380959a = oVar;
        this.f380960b = bVar;
        this.f380961c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140221h)) {
            return false;
        }
        C140221h hVar = (C140221h) obj;
        return this.f380959a == hVar.f380959a && C69664n.m101066l(this.f380960b, hVar.f380960b) && C69664n.m101066l(this.f380961c, hVar.f380961c);
    }

    public final int hashCode() {
        int hashCode = this.f380959a.hashCode() * 31;
        C140641b bVar = this.f380960b;
        int i = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C59308f fVar = this.f380961c;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        C140993o oVar = this.f380959a;
        C140641b bVar = this.f380960b;
        C59308f fVar = this.f380961c;
        return "EpisodePageData(userViewable=" + oVar + ", episodeItem=" + bVar + ", safeHtml=" + fVar + ")";
    }
}
