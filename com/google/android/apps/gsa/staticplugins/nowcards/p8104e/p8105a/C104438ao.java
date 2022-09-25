package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.shared.cards.C91678ag;
import com.google.android.apps.gsa.sidekick.shared.cards.C91679ah;
import com.google.android.apps.gsa.sidekick.shared.cards.C91680ai;
import com.google.android.apps.gsa.sidekick.shared.cards.C91686ao;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104535ac;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104600cn;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104659es;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104660et;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104670m;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.apps.p489g.p494d.C9261ep;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7577cd;
import com.google.p375ai.p378b.C7605de;
import com.google.p375ai.p378b.C7617dq;
import com.google.p375ai.p378b.C7620dt;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7681g;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.ao */
/* compiled from: PG */
public final class C104438ao implements C23113i {

    /* renamed from: a */
    private final C104436am f290567a;

    public C104438ao(C104436am amVar) {
        this.f290567a = amVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        C91680ai aiVar;
        C7617dq dqVar;
        C7605de deVar;
        C7577cd cdVar;
        if ("WhyThisAdEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("handleLearnMoreClick_com.google.geo.sidekick.ClientActionProto.WhyThisAdAction.TargetingReason")) {
                C7620dt dtVar = (C7620dt) new C23271p(C7620dt.f26326d.getParserForType(), C62921ba.m95368a(), C7620dt.f26326d).mo28733b("targetingReason", pVar);
                C104436am amVar = this.f290567a;
                C9281y yVar = (C9281y) C9141ad.f31521K.createBuilder();
                int i = dtVar.f26328a;
                if (i == 3) {
                    C9140ac acVar = C9140ac.OPEN_URL;
                    yVar.copyOnWrite();
                    C9141ad adVar = (C9141ad) yVar.instance;
                    adVar.f31537c = acVar.f31520am;
                    adVar.f31535a |= 1;
                    if (dtVar.f26328a == 3) {
                        cdVar = (C7577cd) dtVar.f26329b;
                    } else {
                        cdVar = C7577cd.f26179i;
                    }
                    C9195cd b = C91992k.m150974b(cdVar);
                    yVar.copyOnWrite();
                    C9141ad adVar2 = (C9141ad) yVar.instance;
                    b.getClass();
                    adVar2.f31541g = b;
                    adVar2.f31535a |= 16;
                    C104660et etVar = (C104660et) amVar;
                    aiVar = new C91678ag(etVar.f291469d, etVar.f291470e);
                } else if (i == 4) {
                    C9140ac acVar2 = C9140ac.SEARCH;
                    yVar.copyOnWrite();
                    C9141ad adVar3 = (C9141ad) yVar.instance;
                    adVar3.f31537c = acVar2.f31520am;
                    adVar3.f31535a |= 1;
                    if (dtVar.f26328a == 4) {
                        deVar = (C7605de) dtVar.f26329b;
                    } else {
                        deVar = C7605de.f26269s;
                    }
                    yVar.copyOnWrite();
                    C9141ad adVar4 = (C9141ad) yVar.instance;
                    deVar.getClass();
                    adVar4.f31543i = deVar;
                    adVar4.f31535a |= 64;
                    aiVar = new C91679ah(new C104659es((C104660et) amVar), C58836b.f156633a);
                } else {
                    C9140ac acVar3 = C9140ac.WEB_VIEW;
                    yVar.copyOnWrite();
                    C9141ad adVar5 = (C9141ad) yVar.instance;
                    adVar5.f31537c = acVar3.f31520am;
                    adVar5.f31535a |= 1;
                    if (dtVar.f26328a == 5) {
                        dqVar = (C7617dq) dtVar.f26329b;
                    } else {
                        dqVar = C7617dq.f26317h;
                    }
                    C9261ep d = C91992k.m150976d(dqVar);
                    yVar.copyOnWrite();
                    C9141ad adVar6 = (C9141ad) yVar.instance;
                    d.getClass();
                    adVar6.f31546l = d;
                    adVar6.f31535a |= 512;
                    C104660et etVar2 = (C104660et) amVar;
                    aiVar = new C91686ao(etVar2.f291469d, etVar2.f291470e);
                }
                aiVar.mo86157b((C9141ad) yVar.build());
            } else if (str.equals("showAdsSettings")) {
                C104660et etVar3 = (C104660et) this.f290567a;
                etVar3.f291467b.mo65089a(C87574a.f236603a.mo83277a(new Intent("android.intent.action.VIEW", Uri.parse(etVar3.f291468c.mo79758x(C90010bp.f246992d)))));
            } else if (str.equals("updateUserSettings_boolean")) {
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("update")).booleanValue();
                C104660et etVar4 = (C104660et) this.f290567a;
                ((C104600cn) etVar4.f291466a).f291215a.mo28730f(C58836b.f156633a, false);
                C104670m mVar = etVar4.f291471f;
                if (mVar != null) {
                    C104535ac acVar4 = mVar.f291497a;
                    if (booleanValue) {
                        C9281y yVar2 = (C9281y) C9141ad.f31521K.createBuilder();
                        int i2 = C7681g.AD_DOMAIN_BLOCK.f26835cv;
                        yVar2.copyOnWrite();
                        C9141ad adVar7 = (C9141ad) yVar2.instance;
                        adVar7.f31535a |= 2;
                        adVar7.f31538d = i2;
                        acVar4.mo94166iX((C9141ad) yVar2.build());
                        acVar4.f290758e.mo86208b(C7642eo.AD_DOMAIN_BLOCK);
                        return;
                    }
                    ((C23186f) acVar4.f290755b.mo94186d()).mo28627h();
                }
            }
        }
    }
}
