package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.be */
/* compiled from: PG */
public final /* synthetic */ class C101046be implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101050bi f282172a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282173b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f282174c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f282175d;

    /* renamed from: e */
    public final /* synthetic */ String f282176e;

    public /* synthetic */ C101046be(C101050bi biVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, String str) {
        this.f282172a = biVar;
        this.f282173b = cxVar;
        this.f282174c = cxVar2;
        this.f282175d = cxVar3;
        this.f282176e = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101050bi biVar = this.f282172a;
        C60870cx cxVar = this.f282173b;
        C60870cx cxVar2 = this.f282174c;
        C60870cx cxVar3 = this.f282175d;
        String str = this.f282176e;
        String str2 = (String) ((Optional) C60856cj.m92909r(cxVar)).orElse(BuildConfig.FLAVOR);
        List list = (List) C60856cj.m92909r(cxVar2);
        C132798f fVar = (C132798f) C60856cj.m92909r(cxVar3);
        if (TextUtils.equals(fVar.f362321e, str2)) {
            C62971cq<String> cqVar = fVar.f362322f;
            if (cqVar.size() == list.size()) {
                for (String contains : cqVar) {
                    if (!list.contains(contains)) {
                    }
                }
                return C60866ct.f164955a;
            }
        }
        ((C59052c) ((C59052c) C101050bi.f282183a.mo56224b()).mo56372aa(19763)).mo56386p("Policy config changed for account. Refreshing.");
        Optional optional = (Optional) biVar.f282186c.mo27525b();
        if (optional.isPresent()) {
            return C100742h.m166943a(new C101048bg(biVar, str, str2, list)).mo92036f(new C101049bh(optional)).f281631a;
        }
        ((C59052c) ((C59052c) C101050bi.f282183a.mo56225c()).mo56372aa(19764)).mo56386p("Training cache entry point absent. Ignoring notify.");
        return C60866ct.f164955a;
    }
}
