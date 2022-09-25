package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.f */
/* compiled from: PG */
public final /* synthetic */ class C138974f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C138977i f377953a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f377954b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f377955c;

    public /* synthetic */ C138974f(C138977i iVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f377953a = iVar;
        this.f377954b = cxVar;
        this.f377955c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C138993y yVar;
        String str;
        C138977i iVar = this.f377953a;
        C60870cx cxVar2 = this.f377954b;
        C60870cx cxVar3 = this.f377955c;
        C139031i iVar2 = (C139031i) C60856cj.m92909r(cxVar2);
        Optional optional = (Optional) C60856cj.m92909r(cxVar3);
        if ((iVar2.f378100a & 128) == 0 || optional.isEmpty()) {
            ((C59052c) ((C59052c) C138977i.f377958a.mo56224b()).mo56372aa(41323)).mo56386p("No expiration time or network time not valid, clear cache");
            return iVar.mo114647c();
        }
        C63042fg fgVar = (C63042fg) optional.get();
        C63042fg fgVar2 = iVar2.f378109j;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        if (C62953e.m95476a(fgVar, fgVar2) >= 0) {
            ((C59052c) ((C59052c) C138977i.f377958a.mo56224b()).mo56372aa(41324)).mo56386p("Passed expiration time. clear cache.");
            return iVar.mo114647c();
        }
        C138990v vVar = iVar.f377966i;
        if (vVar.f377990f || vVar.f377991g.mo114767q().length != 0) {
            vVar.f377992h.mo114639a(C37182a.f98201iI.mo40813g());
            C138994z zVar = vVar.f377987c;
            if (!TextUtils.isEmpty(zVar.f377999d)) {
                str = zVar.f377999d;
                yVar = C138993y.f377995a;
            } else {
                str = TextUtils.concat(new CharSequence[]{"https://www.google.com", "/async/ddljson"}).toString();
                yVar = C138993y.f377995a;
            }
            C60870cx a = zVar.mo114649a(str, yVar);
            C60931s f = C47810es.m84966f(new C138987s(vVar));
            cxVar = C60922j.m93045h(a, C47810es.m84966f(f), vVar.f377989e);
        } else {
            ((C59052c) ((C59052c) C138990v.f377985a.mo56224b()).mo56372aa(41328)).mo56386p("No widget Id found.");
            cxVar = C60866ct.f164955a;
        }
        C60931s f2 = C47810es.m84966f(new C138972d(iVar));
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(f2), iVar.f377964g);
        C138973e eVar = new C138973e(iVar);
        return C60846c.m92879h(h, Throwable.class, C47810es.m84966f(eVar), iVar.f377964g);
    }
}
