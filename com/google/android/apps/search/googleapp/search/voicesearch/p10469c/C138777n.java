package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138716b;
import com.google.android.libraries.assistant.p1533o.C18489g;
import com.google.android.libraries.assistant.p1533o.C18490h;
import com.google.android.libraries.assistant.p1533o.C18495m;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.assistant.p1533o.C18504v;
import com.google.android.libraries.assistant.p1533o.C18505w;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.p10905k.C146606e;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.n */
/* compiled from: PG */
public final /* synthetic */ class C138777n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C138778o f377478a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f377479b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f377480c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f377481d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f377482e;

    public /* synthetic */ C138777n(C138778o oVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4) {
        this.f377478a = oVar;
        this.f377479b = cxVar;
        this.f377480c = cxVar2;
        this.f377481d = cxVar3;
        this.f377482e = cxVar4;
    }

    public final Object call() {
        C138778o oVar = this.f377478a;
        C60870cx cxVar = this.f377479b;
        C60870cx cxVar2 = this.f377480c;
        C60870cx cxVar3 = this.f377481d;
        C60870cx cxVar4 = this.f377482e;
        String str = (String) C60856cj.m92909r(cxVar);
        C43257h hVar = (C43257h) C60856cj.m92909r(cxVar2);
        C138716b bVar = (C138716b) C60856cj.m92909r(cxVar3);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar4)).booleanValue();
        Uri parse = Uri.parse(hVar.mo46356f());
        String authority = parse.getAuthority();
        authority.getClass();
        String c = C146606e.m238841c(oVar.f377486d.f377298a, "device_country", (String) null);
        if (c != null && c.toLowerCase(Locale.US).equals("cn")) {
            authority = "www.google.com.hk";
        }
        C18495m mVar = (C18495m) C18496n.f52438d.createBuilder();
        C18504v vVar = (C18504v) C18505w.f52458d.createBuilder();
        vVar.copyOnWrite();
        ((C18505w) vVar.instance).f52460a = "User-Agent";
        vVar.copyOnWrite();
        str.getClass();
        ((C18505w) vVar.instance).f52461b = str;
        mVar.mo24007c(vVar);
        C18504v vVar2 = (C18504v) C18505w.f52458d.createBuilder();
        vVar2.copyOnWrite();
        ((C18505w) vVar2.instance).f52460a = "Host";
        vVar2.copyOnWrite();
        ((C18505w) vVar2.instance).f52461b = authority;
        mVar.mo24007c(vVar2);
        if (!oVar.f377490h || ((oVar.f377491i && booleanValue) || oVar.f377492j)) {
            C58485gu a = bVar.mo114496a();
            mVar.copyOnWrite();
            C18496n nVar = (C18496n) mVar.instance;
            C62971cq cqVar = nVar.f52442c;
            if (!cqVar.mo58948c()) {
                nVar.f52442c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) a, (List) nVar.f52442c);
        }
        Map.EL.forEach(hVar.mo46353d(), new C138775l(mVar));
        C18489g gVar = (C18489g) C18490h.f52429c.createBuilder();
        gVar.copyOnWrite();
        ((C18490h) gVar.instance).f52431a = "spknlang";
        String c2 = bVar.mo114498c();
        gVar.copyOnWrite();
        c2.getClass();
        ((C18490h) gVar.instance).f52432b = c2;
        mVar.mo24006b(gVar);
        for (String next : parse.getQueryParameterNames()) {
            if (!next.equals("q")) {
                C18489g gVar2 = (C18489g) C18490h.f52429c.createBuilder();
                gVar2.copyOnWrite();
                next.getClass();
                ((C18490h) gVar2.instance).f52431a = next;
                String queryParameter = parse.getQueryParameter(next);
                queryParameter.getClass();
                gVar2.copyOnWrite();
                ((C18490h) gVar2.instance).f52432b = queryParameter;
                mVar.mo24006b(gVar2);
            }
        }
        C18489g gVar3 = (C18489g) C18490h.f52429c.createBuilder();
        gVar3.copyOnWrite();
        ((C18490h) gVar3.instance).f52431a = "inm";
        gVar3.copyOnWrite();
        ((C18490h) gVar3.instance).f52432b = "vs";
        C18490h hVar2 = (C18490h) gVar3.build();
        mVar.copyOnWrite();
        C18496n nVar2 = (C18496n) mVar.instance;
        hVar2.getClass();
        nVar2.mo24009a();
        nVar2.f52440a.add(hVar2);
        return (C18496n) mVar.build();
    }
}
