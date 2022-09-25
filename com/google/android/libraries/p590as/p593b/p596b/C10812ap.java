package com.google.android.libraries.p590as.p593b.p596b;

import android.content.Context;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10878f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.as.b.b.ap */
/* compiled from: PG */
public final class C10812ap {

    /* renamed from: a */
    public static final C58974d f35848a = C58974d.m91134h("LPRequestClient");

    /* renamed from: b */
    public final C10949k f35849b;

    /* renamed from: c */
    public final Boolean f35850c;

    /* renamed from: d */
    private final C10846ba f35851d;

    /* renamed from: e */
    private final Context f35852e;

    /* renamed from: f */
    private final C37215b f35853f;

    /* renamed from: g */
    private final C60887da f35854g;

    public C10812ap(C10949k kVar, C10846ba baVar, Context context, C37215b bVar, Boolean bool, C60887da daVar) {
        this.f35849b = kVar;
        this.f35851d = baVar;
        this.f35852e = context;
        this.f35853f = bVar;
        this.f35850c = bool;
        this.f35854g = daVar;
    }

    /* renamed from: a */
    public static C58833ax m25842a(String str, int i, C58485gu guVar) {
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C10962x(str)).filter(new C10963y(i)).collect(C58370cn.f155946a);
        if (guVar2.isEmpty()) {
            return C58836b.f156633a;
        }
        guVar2.size();
        return C58833ax.m90834k((C10882h) guVar2.get(0));
    }

    /* renamed from: b */
    public static C58528ij m25843b(C58471gg ggVar) {
        return (C58528ij) Collection.EL.stream(((HashMap) Collection.EL.stream(ggVar).collect(Collectors.groupingBy(C10804ah.f35838a, C10805ai.f35839a, Collectors.reducing(C10806aj.f35840a)))).values()).map(C10807ak.f35841a).collect(C58370cn.f155947b);
    }

    /* renamed from: c */
    static C58528ij m25844c(C58471gg ggVar, C10879g gVar) {
        return (C58528ij) Collection.EL.stream(ggVar).filter(new C10952n(gVar)).filter(new C10953o(gVar)).filter(new C10954p(gVar)).filter(new C10955q(gVar)).collect(C58370cn.f155947b);
    }

    /* renamed from: d */
    public final C60870cx mo19302d(C10879g gVar) {
        C60870cx c = this.f35849b.mo19274c();
        C60870cx d = this.f35849b.mo19275d();
        return C47638k.m84753d(c, d).mo51520a(new C10803ag(this, c, d, gVar), this.f35854g);
    }

    /* renamed from: e */
    public final C60870cx mo19303e(C10879g gVar) {
        C60870cx c = this.f35849b.mo19274c();
        C10808al alVar = new C10808al(gVar);
        return C60922j.m93044g(c, C47810es.m84963c(alVar), this.f35854g);
    }

    /* renamed from: f */
    public final C60870cx mo19304f(String str, int i) {
        this.f35853f.mo19974a(C37206a.f98775ae);
        ((C58970a) ((C58970a) f35848a.mo56224b()).mo56372aa(53967)).mo56386p("#getAllPacks");
        C60870cx c = this.f35849b.mo19274c();
        C60870cx f = this.f35849b.mo19277f();
        C60870cx d = this.f35849b.mo19275d();
        C60870cx a = C47638k.m84753d(c, f, d).mo51520a(new C10956r(c, f, d), this.f35854g);
        C10951m mVar = new C10951m(this, str, i);
        return C60922j.m93045h(a, C47810es.m84966f(mVar), this.f35854g);
    }

    /* renamed from: g */
    public final C60870cx mo19305g(int i, String str, C10882h hVar) {
        if (!str.equals(hVar.mo19289g().toLanguageTag())) {
            ((C58970a) ((C58970a) f35848a.mo56226d()).mo56372aa(53972)).mo56354G("Requested locale %s does not match the locale of the download candidate: %s. This could be API misuse.", str, hVar.mo19289g());
        }
        C10846ba baVar = this.f35851d;
        C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
        fVar.copyOnWrite();
        C10879g gVar = (C10879g) fVar.instance;
        str.getClass();
        gVar.f35960a |= 1;
        gVar.f35961b = str;
        C60870cx a = baVar.mo19313a((C10879g) fVar.build());
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(new C10959u(this, hVar)), this.f35854g);
        C60856cj.m92911t(h, C47810es.m84974n(new C10810an(this.f35852e, hVar.mo19289g().toLanguageTag(), hVar.mo19282a())), this.f35854g);
        return C60922j.m93044g(a, C47810es.m84963c(new C10961w(i, h)), this.f35854g);
    }
}
