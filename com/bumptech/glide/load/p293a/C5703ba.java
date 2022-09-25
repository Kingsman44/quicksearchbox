package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p297b.C5763ao;

/* renamed from: com.bumptech.glide.load.a.ba */
/* compiled from: PG */
final class C5703ba implements C5929d {

    /* renamed from: a */
    final /* synthetic */ C5763ao f17179a;

    /* renamed from: b */
    final /* synthetic */ C5704bb f17180b;

    public C5703ba(C5704bb bbVar, C5763ao aoVar) {
        this.f17180b = bbVar;
        this.f17179a = aoVar;
    }

    /* renamed from: f */
    public final void mo12183f(Object obj) {
        if (this.f17180b.mo12201e(this.f17179a)) {
            C5704bb bbVar = this.f17180b;
            C5763ao aoVar = this.f17179a;
            C5731x xVar = bbVar.f17181a.f17236o;
            if (obj == null || !xVar.mo12246c(aoVar.f17348c.mo11921a())) {
                C5718k kVar = bbVar.f17182b;
                C5955n nVar = aoVar.f17346a;
                C5930e eVar = aoVar.f17348c;
                kVar.mo12200d(nVar, obj, eVar, eVar.mo11921a(), bbVar.f17184d);
                return;
            }
            bbVar.f17183c = obj;
            ((C5725r) bbVar.f17182b).mo12240f(2);
        }
    }

    /* renamed from: g */
    public final void mo12184g(Exception exc) {
        if (this.f17180b.mo12201e(this.f17179a)) {
            C5704bb bbVar = this.f17180b;
            C5763ao aoVar = this.f17179a;
            C5718k kVar = bbVar.f17182b;
            C5716i iVar = bbVar.f17184d;
            C5930e eVar = aoVar.f17348c;
            kVar.mo12199c(iVar, exc, eVar, eVar.mo11921a());
        }
    }
}
