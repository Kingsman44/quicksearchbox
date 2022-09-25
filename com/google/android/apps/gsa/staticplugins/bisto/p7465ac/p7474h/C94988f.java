package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87838fl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87839fm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94960u;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.f */
/* compiled from: PG */
final class C94988f extends C94991i {

    /* renamed from: a */
    final /* synthetic */ C94995m f265731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94988f(C94995m mVar) {
        super(mVar, "FETCHING");
        this.f265731a = mVar;
    }

    /* renamed from: c */
    public final void mo88897c() {
        super.mo88897c();
        this.f265731a.f265742e.f265817f = 0;
    }

    /* renamed from: d */
    public final void mo88898d(ServiceEventData serviceEventData) {
        SearchError searchError;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 55) {
            C59104x b = C94995m.f265738a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17784)).mo56386p("handleGenericEvent: NOTIFY_DEVICE_SELECTION_SUPPRESSION");
            this.f265731a.f265754q = C48098ce.ARBITRATION_LOSS;
            this.f265731a.mo88902f("DONE");
        } else if (ordinal == 154) {
            C59104x c = C94995m.f265738a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17783)).mo56386p("handleGenericEvent: BISTO_FORCE_CLOSE");
            this.f265731a.f265754q = C48098ce.QUERY_FAILED;
            if (serviceEventData.mo81913d(ParcelableVoiceAction.class) && (searchError = (SearchError) ((ParcelableVoiceAction) serviceEventData.mo81912b(ParcelableVoiceAction.class)).f236008a) != null && (searchError.f236026j.mo56113h() || searchError.mo81135N() == C89885b.GRECO_RESOURCE_NOT_FOUND.f246280a)) {
                this.f265731a.f265754q = C48098ce.OFFLINE;
            }
            this.f265731a.mo88902f("DONE");
        } else if (ordinal == 162) {
            C59071e eVar = C94995m.f265738a;
            C58976aa aaVar = C58975e.f156826a;
            C95007y yVar = this.f265731a.f265751n;
            yVar.getClass();
            yVar.mo88818i();
        } else if (ordinal != 189) {
            switch (ordinal) {
                case 156:
                    C59071e eVar2 = C94995m.f265738a;
                    C58976aa aaVar2 = C58975e.f156826a;
                    C62940bt btVar = C88354yo.f238943a;
                    C88246uo uoVar = serviceEventData.f236959a;
                    C62940bt r0 = C62942bv.checkIsLite(btVar);
                    uoVar.mo58887l(r0);
                    if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                        C59104x c2 = C94995m.f265738a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                        ((C59052c) ((C59052c) c2).mo56372aa(17778)).mo56386p("getAudioResultUris - Missing audio result data.");
                        mo88895a();
                        return;
                    }
                    this.f265731a.mo88899b((C88356yq) serviceEventData.mo81918e(C88354yo.f238943a), (String) null);
                    return;
                case 157:
                    C59071e eVar3 = C94995m.f265738a;
                    C58976aa aaVar3 = C58975e.f156826a;
                    String str = ((C88262vd) serviceEventData.mo81918e(C88260vb.f238727a)).f238731b;
                    if (this.f265731a.f265745h.mo83553h("bistoSpeechTestingMode")) {
                        C59104x b2 = C94995m.f265738a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                        ((C59052c) ((C59052c) b2).mo56372aa(17776)).mo56389s("Recognized Text: %s", str);
                    }
                    C90476a aVar = C90754k.f253829b;
                    C90476a aVar2 = C90754k.f253829b;
                    C90753j.m148239a(str);
                    C95007y yVar2 = this.f265731a.f265751n;
                    yVar2.getClass();
                    yVar2.mo88811b(str);
                    C94960u uVar = this.f265731a.f265762y;
                    uVar.getClass();
                    uVar.mo88861a();
                    return;
                case 158:
                    C59071e eVar4 = C94995m.f265738a;
                    C58976aa aaVar4 = C58975e.f156826a;
                    C88382zp zpVar = (C88382zp) serviceEventData.mo81918e(C88380zn.f238990a);
                    int i = 0;
                    boolean z = (zpVar.f238993a & 2) != 0 && !zpVar.f238995c.isEmpty();
                    if (z) {
                        i = zpVar.f238994b.length();
                    }
                    C95007y yVar3 = this.f265731a.f265751n;
                    yVar3.getClass();
                    yVar3.mo88825p(String.valueOf(zpVar.f238994b).concat(String.valueOf(zpVar.f238995c)), z, i);
                    return;
                case 159:
                    C59071e eVar5 = C94995m.f265738a;
                    C58976aa aaVar5 = C58975e.f156826a;
                    this.f265731a.mo88902f("NO_SPEECH_DETECTED");
                    return;
                case 160:
                    C59071e eVar6 = C94995m.f265738a;
                    C58976aa aaVar6 = C58975e.f156826a;
                    this.f265731a.mo88902f("RUNNING_ACTION");
                    return;
                default:
                    C59104x c3 = C94995m.f265738a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                    C59052c cVar = (C59052c) ((C59052c) c3).mo56372aa(17772);
                    String str2 = this.f265734d;
                    C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
                    if (a2 == null) {
                        a2 = C88244um.ATTACH_WEBVIEW;
                    }
                    cVar.mo56352E("In state: %s unknown event: %d", str2, a2.f238695cJ);
                    return;
            }
        } else {
            C59071e eVar7 = C94995m.f265738a;
            C58976aa aaVar7 = C58975e.f156826a;
            C62940bt btVar2 = C87839fm.f237660a;
            C88246uo uoVar2 = serviceEventData.f236959a;
            C62940bt r02 = C62942bv.checkIsLite(btVar2);
            uoVar2.mo58887l(r02);
            if (!uoVar2.f169962ag.mo58857o(r02.f169971d)) {
                C59104x c4 = C94995m.f265738a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                ((C59052c) ((C59052c) c4).mo56372aa(17780)).mo56386p("getAudioResultUris - Missing audio result data.");
                mo88895a();
                return;
            }
            C87838fl flVar = (C87838fl) serviceEventData.mo81918e(C87839fm.f237660a);
            C94995m mVar = this.f265731a;
            C88356yq yqVar = flVar.f237658b;
            if (yqVar == null) {
                yqVar = C88356yq.f238944d;
            }
            mVar.mo88899b(yqVar, flVar.f237659c);
        }
    }
}
