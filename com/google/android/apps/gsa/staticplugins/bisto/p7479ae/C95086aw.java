package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60057jf;
import com.google.common.p4552o.C60087kg;
import com.google.common.p4552o.C60091kk;
import com.google.common.p4552o.C60092kl;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.aw */
/* compiled from: PG */
final class C95086aw extends C95095be {

    /* renamed from: a */
    public C95107bq f265998a;

    /* renamed from: b */
    public C60870cx f265999b;

    /* renamed from: c */
    final /* synthetic */ C95097bg f266000c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95086aw(C95097bg bgVar) {
        super(bgVar, "FETCHING");
        this.f266000c = bgVar;
    }

    /* renamed from: f */
    private final void m157070f() {
        C95832d dVar = this.f266000c.f266052x;
        if (dVar != null) {
            dVar.mo89805f(C60091kk.HOTWORD_QUERY_RESPONSE_RECEIVED, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
        }
    }

    /* renamed from: a */
    public final void mo89003a() {
        super.mo89003a();
        this.f266000c.f266044p.mo89277r(6);
        if (this.f265999b == null) {
            this.f265999b = this.f266000c.f266032d.mo28208h("thinking", 1500, new C95085av(this));
        }
    }

    /* renamed from: is */
    public final void mo89004is() {
        super.mo89004is();
        C60870cx cxVar = this.f265999b;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f265999b = null;
        }
        if (this.f265998a != null) {
            if (this.f265998a == this.f266000c.f266042n.mo89153b()) {
                this.f266000c.f266042n.mo89162j(3);
            }
            this.f265998a = null;
        }
        C95127t tVar = this.f266000c.f266026J;
        if (tVar != null) {
            tVar.mo89047a();
        }
    }

    /* renamed from: it */
    public final void mo89005it(ServiceEventData serviceEventData) {
        C89885b bVar = C89885b.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal != 18) {
            if (ordinal == 55) {
                C59071e eVar = C95097bg.f266015a;
                C58976aa aaVar = C58975e.f156826a;
                this.f266000c.mo89018e("IDLE");
                return;
            } else if (ordinal == 154) {
                C59104x c = C95097bg.f266015a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) c).mo56372aa(17998)).mo56386p("handleGenericEvent: BISTO_FORCE_CLOSE. Response rendering failed.");
                if (serviceEventData.mo81913d(ParcelableVoiceAction.class)) {
                    this.f266000c.f266023G = (SearchError) ((ParcelableVoiceAction) serviceEventData.mo81912b(ParcelableVoiceAction.class)).f236008a;
                }
                this.f266000c.mo89018e("QUERY_FAILED");
                return;
            } else if (ordinal != 156) {
                if (ordinal == 159) {
                    C59104x b = C95097bg.f266015a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "QueryHandler");
                    ((C59052c) ((C59052c) b).mo56372aa(17997)).mo56386p("handleGenericEvent: BISTO_NO_SPEECH_DETECTED");
                    this.f266000c.mo89018e("NO_SPEECH_DETECTED");
                    return;
                } else if (ordinal != 160) {
                    C59104x c2 = C95097bg.f266015a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "QueryHandler");
                    C59052c cVar = (C59052c) ((C59052c) c2).mo56372aa(17996);
                    String str = this.f266012d;
                    C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
                    if (a2 == null) {
                        a2 = C88244um.ATTACH_WEBVIEW;
                    }
                    cVar.mo56354G("In state: %s unknown event: %s", str, a2);
                    return;
                } else {
                    C59104x b2 = C95097bg.f266015a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "QueryHandler");
                    ((C59052c) ((C59052c) b2).mo56372aa(18002)).mo56386p("handleGenericEvent: BISTO_VOICE_SEARCH_DONE");
                    this.f266000c.mo89021i(4);
                    m157070f();
                    this.f266000c.mo89018e("RUNNING_ACTION");
                    return;
                }
            }
        }
        C59104x b3 = C95097bg.f266015a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b3).mo56372aa(18000)).mo56386p("handleGenericEvent: BISTO_TTS_RESULT_EVENT.");
        C62940bt btVar = C88354yo.f238943a;
        C88246uo uoVar = serviceEventData.f236959a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        uoVar.mo58887l(r0);
        if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x c3 = C95097bg.f266015a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) c3).mo56372aa(18001)).mo56386p("getAudioResultUris - Missing audio result data.");
            mo89006d();
            return;
        }
        this.f266000c.mo89021i(4);
        m157070f();
        this.f266000c.f266022F = (C88356yq) serviceEventData.mo81918e(C88354yo.f238943a);
        this.f266000c.mo89018e("PLAYING_TTS_RESPONSE");
    }
}
