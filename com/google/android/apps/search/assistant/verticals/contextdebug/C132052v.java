package com.google.android.apps.search.assistant.verticals.contextdebug;

import android.util.Base64;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10038a.C132026a;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10039b.C132031b;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.android.libraries.web.webview.p3485h.C44412a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50556x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.v */
/* compiled from: PG */
public final class C132052v {

    /* renamed from: a */
    public static final C59071e f360422a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.contextdebug.v");

    /* renamed from: b */
    public final AccountId f360423b;

    /* renamed from: c */
    public final Optional f360424c;

    /* renamed from: d */
    public final boolean f360425d;

    /* renamed from: e */
    public final C132043m f360426e;

    /* renamed from: f */
    public final C132041k f360427f;

    /* renamed from: g */
    public final C43952c f360428g;

    /* renamed from: h */
    public final C44412a f360429h;

    /* renamed from: i */
    public final C132040j f360430i;

    /* renamed from: j */
    public final C60887da f360431j;

    /* renamed from: k */
    public final C46801dp f360432k;

    /* renamed from: l */
    public final C43377v f360433l;

    /* renamed from: m */
    public final C39141kp f360434m;

    /* renamed from: n */
    public C43968o f360435n;

    /* renamed from: o */
    private final C50540h f360436o;

    /* renamed from: p */
    private final C132026a f360437p;

    public C132052v(AccountId accountId, C132031b bVar, String str, boolean z, C132043m mVar, C132041k kVar, C43960g gVar, C44412a aVar, C132040j jVar, C132026a aVar2, C60887da daVar, C46801dp dpVar, C43377v vVar, C39141kp kpVar) {
        C50540h hVar;
        this.f360423b = accountId;
        this.f360424c = str.isEmpty() ? Optional.empty() : Optional.m71637of(str);
        if ((bVar.f360390a & 2) != 0) {
            hVar = bVar.f360391b;
            if (hVar == null) {
                hVar = C50540h.f131534h;
            }
        } else {
            hVar = C50540h.f131534h;
        }
        this.f360436o = hVar;
        this.f360425d = z;
        this.f360426e = mVar;
        this.f360427f = kVar;
        this.f360428g = gVar.mo46957a(ContextDebugPostMessageConfig.f360380a);
        this.f360429h = aVar;
        this.f360430i = jVar;
        this.f360437p = aVar2;
        this.f360431j = daVar;
        this.f360435n = null;
        this.f360432k = dpVar;
        this.f360433l = vVar;
        this.f360434m = kpVar;
    }

    /* renamed from: b */
    public static C60870cx m214503b(C43968o oVar, C50556x xVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("response", Base64.encodeToString(xVar.toByteArray(), 0));
            return oVar.mo46960a(jSONObject.toString());
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f360422a.mo56225c()).mo56382g(e)).mo56372aa(39504)).mo56386p("Error creating JSON");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: a */
    public final C50540h mo110394a() {
        Optional a = this.f360437p.mo110386a(this.f360423b);
        return a.isPresent() ? (C50540h) a.get() : this.f360436o;
    }
}
