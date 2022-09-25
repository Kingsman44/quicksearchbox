package com.google.android.apps.search.podcasts.library.p10580b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10600q.C140944c;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.b.b */
/* compiled from: PG */
public final class C140567b implements C140944c {

    /* renamed from: a */
    public final C140641b f381764a;

    /* renamed from: b */
    public final C97925o f381765b;

    /* renamed from: c */
    public final boolean f381766c;

    /* renamed from: d */
    public final C140509u f381767d;

    /* renamed from: e */
    private final C69613f f381768e;

    public C140567b(C140641b bVar, C97925o oVar, boolean z, C140509u uVar) {
        C69664n.m101061g(bVar, "data");
        C69664n.m101061g(oVar, "episodeItemVe");
        C69664n.m101061g(uVar, "autoplayContext");
        this.f381764a = bVar;
        this.f381765b = oVar;
        this.f381766c = z;
        this.f381767d = uVar;
        this.f381768e = new C69747m(new C140566a(this));
    }

    /* renamed from: a */
    public final String mo115619a() {
        return (String) this.f381768e.mo5768a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C140976e.m228930c(this.f381764a, ((C140567b) cVar).f381764a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140567b)) {
            return false;
        }
        C140567b bVar = (C140567b) obj;
        return C69664n.m101066l(this.f381764a, bVar.f381764a) && C69664n.m101066l(this.f381765b, bVar.f381765b) && this.f381766c == bVar.f381766c && this.f381767d == bVar.f381767d;
    }

    public final int hashCode() {
        return (((((this.f381764a.hashCode() * 31) + this.f381765b.hashCode()) * 31) + (this.f381766c ? 1 : 0)) * 31) + this.f381767d.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381764a;
        C97925o oVar = this.f381765b;
        boolean z = this.f381766c;
        C140509u uVar = this.f381767d;
        return "LibraryEpisodeData(data=" + bVar + ", episodeItemVe=" + oVar + ", showDragHandle=" + z + ", autoplayContext=" + uVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C140567b(C140641b bVar, C97925o oVar, boolean z, int i) {
        this(bVar, oVar, z & ((i & 4) == 0), C140509u.AUTOPLAY_DEFAULT);
    }
}
