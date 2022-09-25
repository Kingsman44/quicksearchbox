package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130839a;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130882w;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.m */
/* compiled from: PG */
public final /* synthetic */ class C130852m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130857r f358111a;

    /* renamed from: b */
    public final /* synthetic */ C53738w f358112b;

    /* renamed from: c */
    public final /* synthetic */ C130883x f358113c;

    public /* synthetic */ C130852m(C130857r rVar, C53738w wVar, C130883x xVar) {
        this.f358111a = rVar;
        this.f358112b = wVar;
        this.f358113c = xVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130857r rVar = this.f358111a;
        C53738w wVar = this.f358112b;
        C130883x xVar = this.f358113c;
        C130882w j = C130883x.m213237j();
        C130839a aVar = (C130839a) j;
        aVar.f358086a = Double.valueOf(xVar.mo109846c().doubleValue());
        aVar.f358087b = Double.valueOf(xVar.mo109846c().doubleValue());
        aVar.f358088c = Double.valueOf(xVar.mo109852h().doubleValue());
        aVar.f358090e = Double.valueOf(xVar.mo109847d().doubleValue());
        aVar.f358091f = Double.valueOf(xVar.mo109854i().doubleValue());
        aVar.f358092g = Boolean.valueOf(xVar.mo109844a().booleanValue());
        C130883x a = j.mo109836a();
        ((C58970a) ((C58970a) rVar.f358127d.mo56224b()).mo56372aa(38983)).mo56389s("max retrieval distance: %f", xVar.mo109848e());
        C60870cx a2 = rVar.f358124a.mo109856a(((C130856q) obj).mo109838b(), a, rVar.f358125b);
        C130841b bVar = new C130841b(rVar, wVar, xVar);
        return C60922j.m93044g(a2, C47810es.m84963c(bVar), rVar.f358125b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
