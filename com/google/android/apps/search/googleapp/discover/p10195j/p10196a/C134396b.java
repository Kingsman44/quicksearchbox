package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3131d.C40306b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64205b;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.b */
/* compiled from: PG */
public final class C134396b implements C21312s {

    /* renamed from: a */
    public final C133939b f366103a;

    /* renamed from: b */
    private final boolean f366104b;

    public C134396b(C133939b bVar, boolean z) {
        C69664n.m101061g(bVar, "actionApi");
        this.f366103a = bVar;
        this.f366104b = z;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        C62940bt btVar = C64205b.f173602c;
        C69664n.m101060f(btVar, "animateFeedLayoutCommand");
        return btVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        Object obj2;
        C64205b bVar = (C64205b) obj;
        C69664n.m101061g(bVar, "command");
        C69664n.m101061g(rVar, "eventData");
        if (!this.f366104b) {
            C69794a aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        }
        C21248ar e = rVar.mo26735e();
        C69664n.m101059e(e, "null cannot be cast to non-null type com.google.android.libraries.search.rendering.xuikit.elements.XUiKitElementBuilder");
        C40306b b = ((C40081u) e).f105300c.mo42110b();
        C62940bt r0 = C62942bv.checkIsLite(C134589g.f366529e);
        b.mo58887l(r0);
        Object l = b.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        C69664n.m101060f(obj2, "eventData.getElementBuil…xt.discoverClientContext)");
        C69794a h = C69794a.m101256h(C47810es.m84977q(new C134369a(this, bVar, (C134589g) obj2)));
        C70128t tVar = C69797b.f186184a;
        C69795a.m101266a(tVar);
        return h.mo61452j(tVar);
    }
}
