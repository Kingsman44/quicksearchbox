package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Intent;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88403aa;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.staticplugins.bubble.p7575b.C96947a;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40126e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.activity.C40093a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ci */
/* compiled from: PG */
public final /* synthetic */ class C118173ci implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C118174cj f328050a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f328051b;

    /* renamed from: c */
    public final /* synthetic */ long f328052c;

    public /* synthetic */ C118173ci(C118174cj cjVar, JSONObject jSONObject, long j) {
        this.f328050a = cjVar;
        this.f328051b = jSONObject;
        this.f328052c = j;
    }

    public final void run() {
        C118174cj cjVar = this.f328050a;
        JSONObject jSONObject = this.f328051b;
        long j = this.f328052c;
        if (jSONObject.has("agsase")) {
            cjVar.f328054b.mo80881e(jSONObject.optString("agsase"));
        }
        if (jSONObject.has("gsais")) {
            cjVar.f328054b.mo80885i(jSONObject.getString("gsais"));
        }
        if (jSONObject.has("gsaim")) {
            cjVar.f328054b.mo80884h(jSONObject.getString("gsaim"));
        }
        if (jSONObject.has("wobtm")) {
            boolean parseBoolean = Boolean.parseBoolean(jSONObject.getString("wobtm"));
            C86337q b = ((C86338r) cjVar.f328061i.mo27525b()).mo80076b();
            b.mo80070e("temp_units", parseBoolean ^ true ? 1 : 0);
            b.apply();
            cjVar.f328059g.mo80040a().mo80038f(true != parseBoolean ? 2 : 1);
            ((C91306ak) cjVar.f328056d.mo27525b()).mo85594g();
        }
        if (jSONObject.optLong("gsafs", -1) != -1) {
            cjVar.f328054b.mo80883g();
        }
        if (jSONObject.has("eao")) {
            cjVar.f328054b.mo80882f(j);
        }
        if (jSONObject.has("switchph")) {
            long optLong = jSONObject.optLong("switchph", -1);
            if (optLong == 0) {
                C86341u uVar = new C86341u((C86346z) cjVar.f328058f.f232790a.mo79722a());
                uVar.mo80085k("turn_off_ph", true);
                uVar.mo80086l(false);
            } else if (optLong == 1) {
                C86341u uVar2 = new C86341u((C86346z) cjVar.f328058f.f232790a.mo79722a());
                uVar2.mo80075j("turn_off_ph");
                uVar2.mo80086l(false);
            } else if (optLong == 2) {
                C86341u uVar3 = new C86341u((C86346z) cjVar.f328058f.f232790a.mo79722a());
                uVar3.mo80085k("turn_off_heterodyne", true);
                uVar3.mo80086l(false);
            } else if (optLong == 3) {
                C86341u uVar4 = new C86341u((C86346z) cjVar.f328058f.f232790a.mo79722a());
                uVar4.mo80075j("turn_off_heterodyne");
                uVar4.mo80086l(false);
            }
        }
        if (jSONObject.has("webviewcdc")) {
            try {
                C54946ad adVar = (C54946ad) C62942bv.parseFrom((C62942bv) C54946ad.f144531h, Base64.decode(jSONObject.optString("webviewcdc"), 8), C62921ba.m95368a());
                if ((adVar.f144533a & 16) != 0) {
                    Map map = ((C86159h) cjVar.f328060h.mo27525b()).f232838g;
                    C54948af afVar = adVar.f144536d;
                    if (afVar == null) {
                        afVar = C54948af.f144541h;
                    }
                    C55421x a = C55421x.m87686a(afVar.f144544b);
                    if (a == null) {
                        a = C55421x.UNKNOWN_ACTION_TYPE;
                    }
                    map.put(a, adVar);
                }
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C118174cj.f328053a.mo56225c()).mo56382g(e)).mo56372aa(33847)).mo56386p("Bad web view client discourse context.");
            }
        }
        if (jSONObject.has("wcpeanut")) {
            cjVar.f328054b.mo80879c(jSONObject.optString("wcpeanut"), jSONObject.optString("agsase"));
        }
        if (jSONObject.has("agsaos")) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");
            cjVar.f328057e.mo65089a(intent);
        }
        if (jSONObject.has("gsacl")) {
            cjVar.f328054b.mo80880d(j);
        }
        long optLong2 = jSONObject.optLong("gsasa", -1);
        if (optLong2 != -1) {
            int i = (int) optLong2;
            if (i == 0) {
                C89949q.m146523g(238);
            } else if (i == 1) {
                C89949q.m146523g(237);
            } else if (i != 2) {
                ((C59052c) ((C59052c) C118174cj.f328053a.mo56226d()).mo56372aa(33842)).mo56387q("Unknown account selection event type: %d", i);
            } else {
                C89949q.m146523g(311);
            }
            cjVar.f328057e.mo65089a(((C84515a) cjVar.f328065m.mo27525b()).mo78218a("and.gsa.int", C90208n.DRAWER_TAB, true));
        }
        if (jSONObject.has("gsaolsc")) {
            cjVar.mo103584b(jSONObject.optString("gsaolsc"));
        } else if (jSONObject.optLong("gsaols", -1) == 1) {
            cjVar.mo103584b((String) null);
        }
        if (jSONObject.has("webviewcsi")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("webviewcsi");
            if (optJSONObject == null) {
                ((C59052c) ((C59052c) C118174cj.f328053a.mo56225c()).mo56372aa(33850)).mo56386p("CsiInfo is null");
            } else {
                String optString = optJSONObject.optString("url", BuildConfig.FLAVOR);
                if (!optString.isEmpty()) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 533;
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    optString.getClass();
                    ufVar2.f164250e |= 4;
                    ufVar2.f164145az = optString;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
            }
        }
        if (jSONObject.has("gsaoht")) {
            C74554t i2 = C74555u.m120572i();
            i2.mo70869c(C9439b.SRP_VOICE_FEATURE_TIPS);
            cjVar.f328057e.mo65089a(i2.mo70882h());
        }
        if (jSONObject.has("gsaoif")) {
            cjVar.mo103583a((String) null);
        }
        if (jSONObject.has("gsaoifwvi")) {
            try {
                cjVar.mo103583a(jSONObject.getString("gsaoifwvi"));
            } catch (JSONException unused) {
                ((C59052c) ((C59052c) C118174cj.f328053a.mo56226d()).mo56372aa(33852)).mo56386p("EVENT_OPEN_INTEREST_FEED_WITH_VERSION_INFO has no string.");
                int i3 = C90755l.f253831a;
            }
        }
        if (jSONObject.has("gsasb")) {
            try {
                try {
                    C88474x xVar = (C88474x) C62942bv.parseFrom((C62942bv) C88474x.f239172h, Base64.decode(jSONObject.getString("gsasb"), 0), C62921ba.m95368a());
                    if (!((C84474e) cjVar.f328066n.mo27525b()).mo78089ac()) {
                        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
                        baVar.mo58885m(C88403aa.f239030a, xVar);
                        cjVar.f328063k.mo80275j("bubble", (C88431bb) baVar.build());
                    } else if (cjVar.f328067o.isEmpty()) {
                        ((C59052c) ((C59052c) C118174cj.f328053a.mo56225c()).mo56372aa(33844)).mo56386p("No BubbleProtoAdapter Dagger binding available to launch bubble from SRP");
                    } else {
                        Optional a2 = ((C96947a) cjVar.f328067o.get()).mo65584a(xVar).mo90383a();
                        if (a2.isEmpty()) {
                            ((C59052c) ((C59052c) C118174cj.f328053a.mo56226d()).mo56372aa(33843)).mo56386p("Cannot extract xBlend Bubble params from the given parameter.");
                            int i4 = C90755l.f253831a;
                        } else {
                            cjVar.f328057e.mo65089a(C40093a.m69617a(cjVar.f328055c, (C40126e) a2.get()));
                        }
                    }
                } catch (C62974ct e2) {
                    ((C59052c) ((C59052c) ((C59052c) C118174cj.f328053a.mo56226d()).mo56382g(e2)).mo56372aa(33845)).mo56386p("Cannot create Bubble proto from the given parameter.");
                    int i5 = C90755l.f253831a;
                }
            } catch (JSONException unused2) {
                ((C59052c) ((C59052c) C118174cj.f328053a.mo56226d()).mo56372aa(33851)).mo56386p("EVENT_SHOW_BUBBLE has no string.");
                int i6 = C90755l.f253831a;
            }
        }
        if (jSONObject.has("gsaluci")) {
            long optLong3 = jSONObject.optLong("gsaluci");
            if (optLong3 != 0) {
                cjVar.f328064l.mo78660a(optLong3);
            }
        }
    }
}
