package com.google.android.libraries.search.silk.web;

import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.silk.p3238b.p3239a.C41747e;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59591api;
import com.google.common.p4552o.apn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63010eb;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.silk.web.f */
/* compiled from: PG */
public final class C40769f {

    /* renamed from: b */
    private static final C59071e f106884b = C59071e.m91332i("com.google.android.libraries.search.silk.web.f");

    /* renamed from: a */
    public final C40757k f106885a;

    /* renamed from: c */
    private final C60887da f106886c;

    /* renamed from: d */
    private final Optional f106887d;

    /* renamed from: e */
    private final C62921ba f106888e;

    public C40769f(C60887da daVar, Optional optional, C43269t tVar, C62921ba baVar) {
        this.f106886c = daVar;
        this.f106887d = optional;
        this.f106885a = (C40757k) ((SilkCoreFeature) tVar.mo46384b().mo46298a(SilkCoreFeature.class)).mo42692d().mo58938a(C40757k.f106857c, C62921ba.m95368a());
        this.f106888e = baVar;
    }

    /* renamed from: a */
    public final void mo42717a(C59591api api, String str, String str2) {
        this.f106887d.ifPresent(new C40659a(this, api, str, str2));
    }

    /* renamed from: b */
    public final void mo42718b(Throwable th, String str, String str2) {
        String str3;
        if (th instanceof C41742a) {
            str3 = ((C41742a) th).f109086a.f151672b;
        } else {
            str3 = C41749b.f109097a.f151672b;
        }
        C59591api api = (C59591api) apn.f159680i.createBuilder();
        api.copyOnWrite();
        apn apn = (apn) api.instance;
        apn.f159685d = 2;
        apn.f159682a |= 32;
        api.copyOnWrite();
        apn apn2 = (apn) api.instance;
        str3.getClass();
        apn2.f159682a |= 512;
        apn2.f159688g = str3;
        mo42717a(api, str, str2);
    }

    /* renamed from: c */
    public final void mo42719c(C60930r rVar, C43968o oVar, JSONObject jSONObject, String str, String str2) {
        String b = C41743a.m73201b(jSONObject);
        try {
            ((C59052c) ((C59052c) f106884b.mo56224b()).mo56372aa(53387)).mo56354G("Calling Silk method: %s.%s", str, str2);
            C60870cx a = rVar.mo18058a();
            C40711b bVar = new C40711b(this, C41743a.m73201b(jSONObject), oVar, str, str2);
            C60856cj.m92911t(a, C47810es.m84974n(bVar), this.f106886c);
        } catch (Throwable th) {
            Throwable th2 = th;
            mo42724h(C41743a.m73202c(b, th2), oVar, th2, str, str2);
        }
    }

    /* renamed from: d */
    public final void mo42720d(C60931s sVar, C43968o oVar, JSONObject jSONObject, String str, String str2, C63010eb ebVar) {
        String b = C41743a.m73201b(jSONObject);
        try {
            ((C59052c) ((C59052c) f106884b.mo56224b()).mo56372aa(53388)).mo56354G("Calling Silk method: %s.%s", str, str2);
            try {
                C60870cx apply = sVar.apply(C41743a.m73200a(jSONObject, ebVar, this.f106888e));
                C40711b bVar = new C40711b(this, b, oVar, str, str2);
                C60856cj.m92911t(apply, C47810es.m84974n(bVar), this.f106886c);
            } catch (Throwable th) {
                mo42724h(C41743a.m73202c(b, th), oVar, th, str, str2);
            }
        } catch (C41747e e) {
            ((C59052c) ((C59052c) f106884b.mo56225c()).mo56372aa(53389)).mo56386p("Field 'request' is not parsable");
            mo42724h(C41743a.m73204e("Field 'request' is not parsable"), oVar, e, str, str2);
        }
    }

    /* renamed from: e */
    public final void mo42721e(C60930r rVar, C43968o oVar, JSONObject jSONObject, String str, String str2) {
        String b = C41743a.m73201b(jSONObject);
        try {
            ((C59052c) ((C59052c) f106884b.mo56224b()).mo56372aa(53390)).mo56354G("Calling Silk method: %s.%s", str, str2);
            C60870cx a = rVar.mo18058a();
            C40712c cVar = new C40712c(this, C41743a.m73201b(jSONObject), oVar, str, str2);
            C60856cj.m92911t(a, C47810es.m84974n(cVar), this.f106886c);
        } catch (Throwable th) {
            Throwable th2 = th;
            mo42724h(C41743a.m73202c(b, th2), oVar, th2, str, str2);
        }
    }

    /* renamed from: f */
    public final void mo42722f(C60931s sVar, C43968o oVar, JSONObject jSONObject, String str, String str2, C63010eb ebVar) {
        String b = C41743a.m73201b(jSONObject);
        try {
            ((C59052c) ((C59052c) f106884b.mo56224b()).mo56372aa(53391)).mo56354G("Calling Silk method: %s.%s", str, str2);
            try {
                C60870cx apply = sVar.apply(C41743a.m73200a(jSONObject, ebVar, this.f106888e));
                C40712c cVar = new C40712c(this, C41743a.m73201b(jSONObject), oVar, str, str2);
                C60856cj.m92911t(apply, C47810es.m84974n(cVar), this.f106886c);
            } catch (Throwable th) {
                mo42724h(C41743a.m73202c(b, th), oVar, th, str, str2);
            }
        } catch (C41747e e) {
            ((C59052c) ((C59052c) f106884b.mo56225c()).mo56372aa(53392)).mo56386p("Field 'request' is not parsable");
            mo42724h(C41743a.m73204e("Field 'request' is not parsable"), oVar, e, str, str2);
        }
    }

    /* renamed from: g */
    public final void mo42723g(JSONObject jSONObject, C43968o oVar, String str, String str2) {
        C60870cx a = oVar.mo46960a(jSONObject.toString());
        if (this.f106887d.isPresent()) {
            C40760d dVar = new C40760d(this, str, str2);
            C60856cj.m92911t(a, C47810es.m84974n(dVar), this.f106886c);
        }
    }

    /* renamed from: h */
    public final void mo42724h(JSONObject jSONObject, C43968o oVar, Throwable th, String str, String str2) {
        C60870cx a = oVar.mo46960a(jSONObject.toString());
        if (this.f106887d.isPresent()) {
            C40768e eVar = new C40768e(this, th, str, str2);
            C60856cj.m92911t(a, C47810es.m84974n(eVar), this.f106886c);
        }
    }
}
