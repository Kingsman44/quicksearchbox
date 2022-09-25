package com.google.android.apps.search.podcasts.settings.p10612a;

import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.a.c */
/* compiled from: PG */
public final class C141050c {

    /* renamed from: a */
    public final C141049b f382932a;

    /* renamed from: b */
    public final C141051d f382933b;

    /* renamed from: c */
    public final C141051d f382934c;

    /* renamed from: d */
    public final boolean f382935d;

    /* renamed from: e */
    public final boolean f382936e;

    /* renamed from: f */
    public final C54362bo f382937f;

    /* renamed from: g */
    public final boolean f382938g;

    /* renamed from: h */
    public final List f382939h;

    /* renamed from: i */
    public final C140449ak f382940i;

    /* renamed from: j */
    public final C141048a f382941j;

    /* renamed from: k */
    public final C141048a f382942k;

    /* renamed from: l */
    public final boolean f382943l;

    /* renamed from: m */
    public final boolean f382944m;

    public C141050c(C141049b bVar, C141051d dVar, C141051d dVar2, boolean z, boolean z2, C54362bo boVar, boolean z3, List list, C140449ak akVar, C141048a aVar, C141048a aVar2, boolean z4, boolean z5) {
        C69664n.m101061g(dVar, "timeToRemoveCompletedEpisode");
        C69664n.m101061g(dVar2, "timeToRemoveUnfinishedEpisode");
        C69664n.m101061g(boVar, "personalizationSetting");
        C69664n.m101061g(list, "subscriptions");
        C69664n.m101061g(akVar, "themeSetting");
        this.f382932a = bVar;
        this.f382933b = dVar;
        this.f382934c = dVar2;
        this.f382935d = z;
        this.f382936e = z2;
        this.f382937f = boVar;
        this.f382938g = z3;
        this.f382939h = list;
        this.f382940i = akVar;
        this.f382941j = aVar;
        this.f382942k = aVar2;
        this.f382943l = z4;
        this.f382944m = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141050c)) {
            return false;
        }
        C141050c cVar = (C141050c) obj;
        return C69664n.m101066l(this.f382932a, cVar.f382932a) && this.f382933b == cVar.f382933b && this.f382934c == cVar.f382934c && this.f382935d == cVar.f382935d && this.f382936e == cVar.f382936e && this.f382937f == cVar.f382937f && this.f382938g == cVar.f382938g && C69664n.m101066l(this.f382939h, cVar.f382939h) && this.f382940i == cVar.f382940i && C69664n.m101066l(this.f382941j, cVar.f382941j) && C69664n.m101066l(this.f382942k, cVar.f382942k) && this.f382943l == cVar.f382943l && this.f382944m == cVar.f382944m;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((this.f382932a.hashCode() * 31) + this.f382933b.hashCode()) * 31) + this.f382934c.hashCode()) * 31) + (this.f382935d ? 1 : 0)) * 31) + (this.f382936e ? 1 : 0)) * 31) + this.f382937f.hashCode()) * 31) + (this.f382938g ? 1 : 0)) * 31) + this.f382939h.hashCode()) * 31) + this.f382940i.hashCode()) * 31;
        C141048a aVar = this.f382941j;
        int i = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C141048a aVar2 = this.f382942k;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + (this.f382943l ? 1 : 0)) * 31) + (this.f382944m ? 1 : 0);
    }

    public final String toString() {
        C141049b bVar = this.f382932a;
        C141051d dVar = this.f382933b;
        C141051d dVar2 = this.f382934c;
        boolean z = this.f382935d;
        boolean z2 = this.f382936e;
        C54362bo boVar = this.f382937f;
        boolean z3 = this.f382938g;
        List list = this.f382939h;
        C140449ak akVar = this.f382940i;
        C141048a aVar = this.f382941j;
        C141048a aVar2 = this.f382942k;
        boolean z4 = this.f382943l;
        boolean z5 = this.f382944m;
        return "SettingData(preferredLanguage=" + bVar + ", timeToRemoveCompletedEpisode=" + dVar + ", timeToRemoveUnfinishedEpisode=" + dVar2 + ", autoDownloadEnabled=" + z + ", autoDownloadOnlyOnUnmeteredNetworks=" + z2 + ", personalizationSetting=" + boVar + ", autoplayEnabled=" + z3 + ", subscriptions=" + list + ", themeSetting=" + akVar + ", podcastsApplicationInfo=" + aVar + ", googleAppApplicationInfo=" + aVar2 + ", signedIn=" + z4 + ", isExplicitContentShown=" + z5 + ")";
    }
}
