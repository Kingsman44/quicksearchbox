package com.google.android.apps.gsa.search.core.state.p6874f;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.search.core.state.p6872d.C86966r;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89958z;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91660i;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59745eb;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60616wm;
import com.google.common.p4552o.C60617wn;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.p4553a.C59474ay;
import com.google.common.p4552o.p4553a.C59477ba;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.f.e */
/* compiled from: PG */
public final class C87038e {

    /* renamed from: a */
    private static final C59071e f235100a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.f.e");

    /* renamed from: a */
    public static void m140567a(Query query, C58833ax axVar) {
        C60548tz tzVar;
        C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar2.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar2.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 193;
        String b = C39191a.m68623b(query.f252749G);
        tzVar2.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar2.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
        if (axVar.mo56113h()) {
            ActionData actionData = (ActionData) axVar.mo56107c();
            if (actionData.mo81102m()) {
                tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar.instance;
                ufVar3.f164093a |= 2;
                ufVar3.f164258m = 747;
                C59104x b2 = f235100a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "CommittedQueryLogHelper");
                ((C59052c) ((C59052c) b2).mo56372aa(9251)).mo56389s("ACTION_DATA_USING_EMBEDDED: %s", actionData.f235998h);
            } else {
                tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar.instance;
                ufVar4.f164093a |= 2;
                ufVar4.f164258m = 748;
                C59104x b3 = f235100a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "CommittedQueryLogHelper");
                ((C59052c) ((C59052c) b3).mo56372aa(9250)).mo56389s("ACTION_DATA_USING_NETWORK: %s", actionData.f235998h);
            }
            int i = actionData.f235998h.f146230cP;
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            ufVar5.f164093a |= 256;
            ufVar5.f164264s = i;
            String b4 = C39191a.m68623b(query.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar6 = (C60555uf) tzVar.instance;
            b4.getClass();
            ufVar6.f164093a |= 4;
            ufVar6.f164259n = b4;
            if (query.mo84415cv()) {
                tzVar.copyOnWrite();
                C60555uf ufVar7 = (C60555uf) tzVar.instance;
                ufVar7.f164251f |= 2048;
                ufVar7.f164113aT = true;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: b */
    public static void m140568b(Query query, int i, C58833ax axVar, C68214a aVar, C86124t tVar, C68214a aVar2) {
        C89849ae aeVar;
        if (i == 160) {
            aeVar = C89849ae.VBUS_TEXT_SEARCH_COMMIT;
        } else if (i == 161) {
            aeVar = C89849ae.VBUS_VOICE_SEARCH_COMMIT;
        } else if (i == 172) {
            aeVar = C89849ae.VBUS_VOICE_RECOGNITION_DONE;
        } else if (i == 173) {
            aeVar = C89849ae.VBUS_SOUND_SEARCH_COMMIT;
        } else if (i == 196) {
            aeVar = C89849ae.VBUS_VOICE_RESULTS_DONE;
        } else if (i == 581) {
            aeVar = C89849ae.VBUS_NATIVE_SOUND_SEARCH_COMMIT;
        } else {
            return;
        }
        aeVar.getClass();
        if (query.mo84397cd() && (aeVar == C89849ae.VBUS_TEXT_SEARCH_COMMIT || aeVar == C89849ae.VBUS_VOICE_SEARCH_COMMIT || aeVar == C89849ae.VBUS_NATIVE_SOUND_SEARCH_COMMIT || aeVar == C89849ae.VBUS_SOUND_SEARCH_COMMIT)) {
            if (!axVar.mo56113h()) {
                axVar = C58833ax.m90834k(C59687cb.f160034bf);
            }
            C59582aj ajVar = (C59582aj) ((C59687cb) axVar.mo56107c()).toBuilder();
            int i2 = aeVar.f245884YW;
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160062a |= C89885b.S3REQUEST_VALUE;
            cbVar.f160139t = i2;
            axVar = C58833ax.m90834k((C59687cb) ajVar.build());
            aeVar = C89849ae.VBUS_SEARCH_RECOMMIT;
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(query.f252749G));
        if (axVar.mo56113h()) {
            fVar.f246203c = (C59687cb) axVar.mo56107c();
        }
        ((C89859i) aVar.mo27525b()).mo74236a(fVar.mo83699a());
        if (tVar.mo79746e(C89996bb.f246772b) && aeVar == C89849ae.VBUS_VOICE_SEARCH_COMMIT && query.mo84422dC()) {
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.VBUS_OPA_VOICE_SEARCH_COMMIT;
            fVar2.mo83701c("rId", Long.toString(query.f252749G));
            if (axVar.mo56113h()) {
                fVar2.f246203c = (C59687cb) axVar.mo56107c();
            }
            ((C89859i) aVar.mo27525b()).mo74236a(fVar2.mo83699a());
        }
        if (aeVar == C89849ae.VBUS_VOICE_SEARCH_COMMIT && !query.mo84422dC()) {
            C89856f fVar3 = new C89856f();
            fVar3.f246201a = C89849ae.INTENT_API_OR_LEGACY_VOICE_SEARCH_COMMIT;
            fVar3.mo83701c("rId", Long.toString(query.f252749G));
            ((C89859i) aVar.mo27525b()).mo74236a(fVar3.mo83699a());
        }
        String bn = query.mo84355bn();
        if (bn != null && bn.startsWith("and.now.n") && aVar2 != null) {
            ((C91660i) aVar2.mo27525b()).mo86069b(C89851ag.SEARCH_FROM_NOTIFICATION, C89849ae.SEARCH_FROM_NOTIFICATION_COMMITTED);
        }
    }

    /* renamed from: c */
    public static void m140569c(SearchError searchError, Query query, C89062r rVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 202;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
        int N = searchError.mo81135N();
        eiVar.copyOnWrite();
        C59753ej ejVar = (C59753ej) eiVar.instance;
        ejVar.f161451a |= 1;
        ejVar.f161452b = N;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C59753ej ejVar2 = (C59753ej) eiVar.build();
        ejVar2.getClass();
        ufVar3.f164076J = ejVar2;
        ufVar3.f164146b |= 8192;
        if (rVar != null) {
            int i = C89034be.m144791a(rVar).f181028z;
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164093a |= 134217728;
            ufVar4.f164271z = i;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: d */
    public static void m140570d(Query query, C68214a aVar, C86124t tVar) {
        m140568b(query, 196, C58836b.f156633a, aVar, tVar, (C68214a) null);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 196;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: e */
    public static void m140571e(C87037d dVar) {
        String str;
        C89062r b;
        Query c = dVar.mo80655c();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int a = dVar.mo80653a();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = a;
        String b2 = C39191a.m68623b(c.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b2.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b2;
        long j = c.f252745C;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164250e |= 1024;
        ufVar3.f164096aC = j;
        long j2 = c.f252747E;
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        ufVar4.f164250e |= 2048;
        ufVar4.f164097aD = j2;
        amo b3 = C89949q.m146518b(dVar.mo80656d(), c.mo84337bV(), c.mo84412cs(), dVar.mo80659f());
        tzVar.copyOnWrite();
        C60555uf ufVar5 = (C60555uf) tzVar.instance;
        ufVar5.f164070D = b3.f159234au;
        ufVar5.f164146b |= 8;
        C60548tz tzVar2 = (C60548tz) ((C60555uf) tzVar.build()).toBuilder();
        Query c2 = dVar.mo80655c();
        String bn = c2.mo84355bn();
        amo amo = c2.f252760R;
        C60616wm wmVar = (C60616wm) C60617wn.f164453d.createBuilder();
        C59745eb a2 = C89958z.m146541a(bn);
        C58976aa aaVar = C58975e.f156826a;
        wmVar.copyOnWrite();
        C60617wn wnVar = (C60617wn) wmVar.instance;
        a2.getClass();
        wnVar.f164456b = a2;
        wnVar.f164455a |= 1;
        if (amo == null) {
            str = null;
        } else {
            str = amo.name();
        }
        C59745eb a3 = C89958z.m146541a(str);
        wmVar.copyOnWrite();
        C60617wn wnVar2 = (C60617wn) wmVar.instance;
        a3.getClass();
        wnVar2.f164457c = a3;
        wnVar2.f164455a |= 2;
        tzVar2.copyOnWrite();
        C60555uf ufVar6 = (C60555uf) tzVar2.instance;
        C60617wn wnVar3 = (C60617wn) wmVar.build();
        wnVar3.getClass();
        ufVar6.f164118aY = wnVar3;
        ufVar6.f164251f |= 1048576;
        if (dVar.mo80657e() && (b = dVar.mo80654b()) != null) {
            int i = C89034be.m144791a(b).f181028z;
            tzVar2.copyOnWrite();
            C60555uf ufVar7 = (C60555uf) tzVar2.instance;
            ufVar7.f164093a |= 134217728;
            ufVar7.f164271z = i;
        }
        if (c2.mo84391cX()) {
            String str2 = c2.f252770i;
            tzVar2.copyOnWrite();
            C60555uf ufVar8 = (C60555uf) tzVar2.instance;
            str2.getClass();
            ufVar8.f164249d |= 64;
            ufVar8.f164133an = str2;
        }
        if (c2.mo84380cM()) {
            int i2 = c2.mo84397cd() ? 2 : c2.mo84323bH() ? 3 : 1;
            tzVar2.copyOnWrite();
            C60555uf ufVar9 = (C60555uf) tzVar2.instance;
            ufVar9.f164119aZ = i2 - 1;
            ufVar9.f164251f |= C89885b.NOW_VALUE;
        }
        if (c2.mo84387cT()) {
            C59474ay ayVar = (C59474ay) C59477ba.f157803d.createBuilder();
            ayVar.copyOnWrite();
            C59477ba baVar = (C59477ba) ayVar.instance;
            baVar.f157806b = 2;
            baVar.f157805a |= 1;
            String b4 = C39191a.m68623b(c2.mo84476f("android.opa.extra.SRP_TO_OPA_TRANSITION_ORIGINAL_REQUEST_ID"));
            ayVar.copyOnWrite();
            C59477ba baVar2 = (C59477ba) ayVar.instance;
            b4.getClass();
            baVar2.f157805a = 2 | baVar2.f157805a;
            baVar2.f157807c = b4;
            tzVar2.copyOnWrite();
            C60555uf ufVar10 = (C60555uf) tzVar2.instance;
            C59477ba baVar3 = (C59477ba) ayVar.build();
            baVar3.getClass();
            ufVar10.f164176bd = baVar3;
            ufVar10.f164251f |= 134217728;
        }
        C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: f */
    public static void m140572f(Query query, ClientConfig clientConfig, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C86124t tVar) {
        int i;
        if (query.mo84392cY()) {
            i = 160;
        } else if (query.mo84420dA()) {
            i = 161;
        } else {
            i = query.mo84369cB() ? query.mo84438dS() ? 581 : 173 : 273;
        }
        m140568b(query, i, C58836b.f156633a, aVar3, tVar, aVar4);
        C87034a aVar5 = new C87034a();
        aVar5.mo80649c(i);
        aVar5.mo80652f(query);
        aVar5.mo80648b(clientConfig.f236951d);
        aVar5.mo80651e(((C86794i) aVar.mo27525b()).mo80452c());
        if (i != 273) {
            C89062r rVar = ((C86966r) aVar2.mo27525b()).f234900a;
            aVar5.mo80650d(true);
            aVar5.f235087a = rVar;
        } else {
            aVar5.mo80650d(false);
        }
        m140571e(aVar5.mo80647a());
    }
}
