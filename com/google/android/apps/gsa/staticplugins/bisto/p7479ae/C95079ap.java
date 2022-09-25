package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88405ac;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142531w;
import com.google.assistant.p3897e.p3917i.p3918a.C51247aq;
import com.google.assistant.p3897e.p3917i.p3918a.C51248ar;
import com.google.assistant.p3897e.p3917i.p3918a.C51249as;
import com.google.assistant.p3897e.p3917i.p3918a.C51250at;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51337dz;
import com.google.assistant.p3897e.p3917i.p3918a.C51339ea;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60057jf;
import com.google.common.p4552o.C60087kg;
import com.google.common.p4552o.C60091kk;
import com.google.common.p4552o.C60092kl;
import com.google.common.p4552o.amo;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ap */
/* compiled from: PG */
public final /* synthetic */ class C95079ap implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95097bg f265987a;

    /* renamed from: b */
    public final /* synthetic */ C95455a f265988b;

    /* renamed from: c */
    public final /* synthetic */ PlaybackStatus f265989c;

    public /* synthetic */ C95079ap(C95097bg bgVar, C95455a aVar, PlaybackStatus playbackStatus) {
        this.f265987a = bgVar;
        this.f265988b = aVar;
        this.f265989c = playbackStatus;
    }

    public final void run() {
        int i;
        long j;
        C58833ax axVar;
        C58833ax axVar2;
        long j2;
        C95097bg bgVar;
        C95832d dVar;
        byte[] bArr;
        C95097bg bgVar2 = this.f265987a;
        C95455a aVar = this.f265988b;
        PlaybackStatus playbackStatus = this.f265989c;
        bgVar2.f266050v = bgVar2.f266045q.mo89123b();
        bgVar2.f266051w = bgVar2.f266045q.mo89122a();
        bgVar2.f266045q.mo89130i();
        bgVar2.f266045q.mo89128g(true);
        bgVar2.f266042n.f266450d.mo89148a(false);
        boolean z = bgVar2.f266018B || aVar.f267099b;
        bgVar2.f266053y = z;
        bgVar2.f266021E = true;
        bgVar2.f266025I = 0;
        bgVar2.f266024H = null;
        Bundle a = C95130w.m157240a(bgVar2.f266033e, !z, aVar);
        C95133z zVar = bgVar2.f266034f;
        long j3 = bgVar2.f266027K;
        Uri uri = aVar.f267098a;
        boolean z2 = bgVar2.f266018B;
        C58833ax a2 = aVar.mo89372a();
        C95832d dVar2 = bgVar2.f266052x;
        C58833ax j4 = C58833ax.m90833j(bgVar2.f266020D);
        C58976aa aaVar = C58975e.f156826a;
        zVar.f266164f.mo89056a();
        if (!a.containsKey("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE") || (i = a.getInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE")) == 0 || i < 0) {
            i = 0;
        }
        if (!a.containsKey("com.google.android.apps.gsa.shared.bisto.QUERY_START_TIME_MILLIS")) {
            j = 0;
        } else {
            j = a.getLong("com.google.android.apps.gsa.shared.bisto.QUERY_START_TIME_MILLIS");
        }
        C124548d b = ((C89496ch) zVar.f266165g.mo27525b()).mo83401b(zVar.f266166h.mo89270k());
        Bundle bundle = new Bundle();
        bundle.putString("user-agent-suffix", zVar.f266162d.mo89055e());
        bundle.putString("device-model-suffix", String.format(" Bisto-%s", new Object[]{zVar.f266162d.mo89054c()}));
        bundle.putBoolean("is-in-driving-mode", zVar.f266162d.f266150d.get());
        bundle.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        bundle.putBoolean("android.opa.extra.EXTRA_BISTO_PR_DISALLOWED", b != null ? b.mo106487aa() : false);
        String O = b != null ? b.mo106474O() : null;
        if (b != null) {
            bgVar = bgVar2;
            C59104x b2 = C95133z.f266159a.mo56224b();
            dVar = dVar2;
            b2.mo56378ag(C58975e.f156826a, "GsaVoiceCM");
            j2 = j3;
            ((C59052c) ((C59052c) b2).mo56372aa(17982)).mo56386p("About to set encoding version");
            C51249as asVar = (C51249as) C51250at.f133421d.createBuilder();
            asVar.copyOnWrite();
            C51250at atVar = (C51250at) asVar.instance;
            atVar.f133423a |= 1;
            atVar.f133425c = 1;
            C58485gu C = b.mo106462C();
            int size = C.size();
            int i2 = 0;
            while (i2 < size) {
                C142531w wVar = (C142531w) C.get(i2);
                C58485gu guVar = C;
                C51247aq aqVar = (C51247aq) C51248ar.f133416d.createBuilder();
                int i3 = size;
                C63088z zVar2 = wVar.f386759b;
                aqVar.copyOnWrite();
                C58833ax axVar3 = a2;
                C51248ar arVar = (C51248ar) aqVar.instance;
                zVar2.getClass();
                C58833ax axVar4 = j4;
                arVar.f133418a |= 1;
                arVar.f133419b = zVar2;
                C63088z zVar3 = wVar.f386760c;
                aqVar.copyOnWrite();
                C51248ar arVar2 = (C51248ar) aqVar.instance;
                zVar3.getClass();
                arVar2.f133418a |= 2;
                arVar2.f133420c = zVar3;
                asVar.mo53561a((C51248ar) aqVar.build());
                i2++;
                size = i3;
                C = guVar;
                a2 = axVar3;
                j4 = axVar4;
            }
            axVar2 = a2;
            axVar = j4;
            bArr = ((C51250at) asVar.build()).toByteArray();
        } else {
            bgVar = bgVar2;
            axVar2 = a2;
            axVar = j4;
            j2 = j3;
            dVar = dVar2;
            bArr = null;
        }
        if (O != null) {
            C59104x b3 = C95133z.f266159a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "GsaVoiceCM");
            ((C59052c) ((C59052c) b3).mo56372aa(17973)).mo56389s("Setting deviceActionModelId: %s", O);
            bundle.putString("android.opa.extra.DEVICE_MODEL_ID", O);
            if (bArr != null) {
                bundle.putByteArray("android.opa.extra.DEVICE_ACTIONS_CONTEXT", bArr);
            }
        }
        if (playbackStatus != null) {
            bundle.putParcelable("android.speech.extra.PLAYBACK_STATUS_FROM_CLIENT", playbackStatus);
        }
        Query aI = Query.f252741b.mo84307as(bundle).mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(amo.BISTO);
        C90498f i4 = aI.mo84480i();
        i4.mo84562U(1);
        i4.mo84573e(0, 2);
        i4.mo84561T(QueryTriggerType.BISTO);
        i4.mo84572d(0, 33554432);
        i4.mo84572d(512, 0);
        i4.mo84552K(-2, -2);
        i4.mo84572d(0, 16384);
        i4.mo84564W(0);
        i4.mo84547F(uri, i, false);
        i4.mo84572d(0, 1024);
        i4.mo84549H((Long) null);
        i4.mo84593y(aI.f252746D.mo83792a(j));
        Query aX = i4.mo84568a().mo84244G(true).mo84261Y(!a.getBoolean("com.google.android.apps.gsa.shared.bisto.ENDPOINTING_BY_CLOSING_STREAM", false)).mo84314az().mo84287aX();
        if (zVar.f266162d.f266151e.get()) {
            C95130w wVar2 = zVar.f266162d;
            C124548d b4 = wVar2.f266153g.mo83401b(wVar2.f266152f);
            int f = C95130w.m157243f(b4 == null ? C142413ek.UNKNOWN : b4.mo106461B());
            C51337dz dzVar = (C51337dz) C51339ea.f133718c.createBuilder();
            dzVar.copyOnWrite();
            C51339ea eaVar = (C51339ea) dzVar.instance;
            eaVar.f133721b = f - 2;
            eaVar.f133720a |= 1;
            C51339ea eaVar2 = (C51339ea) dzVar.build();
            C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
            csVar.copyOnWrite();
            C51334dw dwVar = (C51334dw) csVar.instance;
            eaVar2.getClass();
            dwVar.f133662C = eaVar2;
            dwVar.f133688b |= 128;
            bundle.putByteArray("bisto-device-properties", ((C51334dw) csVar.build()).toByteArray());
        }
        if (z2) {
            aX = aX.mo84286aW((!axVar.mo56113h() || !((C86253h) axVar.mo56107c()).equals(C86253h.CONVERSATION_DELTA)) ? QueryTriggerType.FOLLOW_ON : QueryTriggerType.CONVERSATIONAL_FOLLOW_ON);
        } else if (axVar2.mo56113h()) {
            aX = aX.mo84286aW(QueryTriggerType.HOTWORD).mo84310av(HotwordResultMetadata.m147624r(zVar.f266160b, (HotwordResult) axVar2.mo56107c(), false, zVar.f266163e.mo26870b(), false));
        }
        Query aH = aX.mo84271aH(j2);
        C59104x b5 = C95133z.f266159a.mo56224b();
        b5.mo56378ag(C58975e.f156826a, "GsaVoiceCM");
        ((C59052c) ((C59052c) b5).mo56372aa(17978)).mo56389s("query=%s", aH);
        if (axVar2.mo56113h()) {
            if (dVar != null) {
                dVar.mo89805f(C60091kk.HOTWORD_QUERY_STARTED, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
            }
            C88405ac acVar = (C88405ac) C88406ad.f239033l.createBuilder();
            C63088z m = C90772bp.m148305m(aH);
            acVar.copyOnWrite();
            C88406ad adVar = (C88406ad) acVar.instance;
            m.getClass();
            adVar.f239035a |= 1;
            adVar.f239036b = m;
            C63088z m2 = C90772bp.m148305m((Parcelable) axVar2.mo56107c());
            acVar.copyOnWrite();
            C88406ad adVar2 = (C88406ad) acVar.instance;
            m2.getClass();
            adVar2.f239035a |= 2;
            adVar2.f239037c = m2;
            C88489j jVar = new C88489j(C87739bu.HOTWORD_DETECTED_ON_ACTIVE_CLIENT);
            jVar.mo82014b(C87873gt.f237726a, (C88406ad) acVar.build());
            zVar.f266161c.mo81937i(jVar.mo82013a());
        } else {
            zVar.f266161c.mo81931b(aH);
        }
        long j5 = aH.f252749G;
        C95097bg bgVar3 = bgVar;
        bgVar3.mo89018e("LISTENING");
        bgVar3.f266017A = false;
    }
}
