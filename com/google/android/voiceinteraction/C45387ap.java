package com.google.android.voiceinteraction;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.service.voice.VoiceInteractionService;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.nga.shared.p6345h.C81323s;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.p6976ag.p6977a.C89105a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.p8368b.C109174c;
import com.google.android.libraries.assistant.contexttrigger.p1455b.p1456a.C17625e;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17637b;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17643g;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17651o;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17660aa;
import com.google.android.libraries.assistant.contexttrigger.p1460d.C17684y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.voiceinteraction.ap */
/* compiled from: PG */
class C45387ap extends VoiceInteractionService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f118760a;

    /* renamed from: b */
    private final Object f118761b = new Object();

    /* renamed from: c */
    private boolean f118762c = false;

    /* renamed from: ak */
    public final C68326i mo49508ak() {
        if (this.f118760a == null) {
            synchronized (this.f118761b) {
                if (this.f118760a == null) {
                    this.f118760a = new C68326i(this);
                }
            }
        }
        return this.f118760a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo49508ak().mo17653jN();
    }

    public void onCreate() {
        if (!this.f118762c) {
            this.f118762c = true;
            GsaVoiceInteractionService gsaVoiceInteractionService = (GsaVoiceInteractionService) this;
            amb amb = (amb) mo49508ak().mo17653jN();
            gsaVoiceInteractionService.f118633E = (C90929bz) amb.f197807b.a.f203444q.mo17428b();
            gsaVoiceInteractionService.f118634F = (C22871g) amb.f197807b.aV.mo17428b();
            gsaVoiceInteractionService.f118635G = (C22871g) amb.f197807b.aU.mo17428b();
            C22871g gVar = (C22871g) amb.f197807b.aW.mo17428b();
            gsaVoiceInteractionService.f118676aV = (C90851k) amb.f197807b.s.mo17428b();
            gsaVoiceInteractionService.f118636H = (C91022f) amb.f197807b.a.f202649b.mo17428b();
            gsaVoiceInteractionService.f118637I = (Context) amb.f197807b.g.mo17428b();
            gsaVoiceInteractionService.f118638J = (ComponentName) amb.f197807b.bp.mo17428b();
            gsaVoiceInteractionService.f118639K = C58833ax.m90834k((C89606ad) amb.f197807b.jU.mo17428b());
            gsaVoiceInteractionService.f118640L = (C87677ae) amb.f197807b.a.f202634al.mo17428b();
            gsaVoiceInteractionService.f118641M = C68219e.m98518a(amb.f197807b.cL);
            gsaVoiceInteractionService.f118642N = C68219e.m98518a(amb.f197807b.bq);
            gsaVoiceInteractionService.f118643O = C68219e.m98518a(amb.f197807b.a.f202702c);
            gsaVoiceInteractionService.f118644P = C68219e.m98518a(amb.f197807b.bJ);
            gsaVoiceInteractionService.f118645Q = amb.f197748U;
            gsaVoiceInteractionService.f118646R = (C90479a) amb.f197807b.t.mo17428b();
            gsaVoiceInteractionService.f118647S = (C88483e) amb.f197807b.a.f202635am.mo17428b();
            gsaVoiceInteractionService.f118648T = C58833ax.m90834k((C81428d) amb.f197807b.jz.mo17428b());
            aso aso = amb.f197807b.d;
            gsaVoiceInteractionService.f118649U = C58528ij.m90011K((C89105a) amb.f197807b.d.f201782fc.mo17428b(), new C109174c((C91142g) aso.f201488a.bq.mo17428b(), new C17625e(C58495hd.m89900n(C17651o.HEADPHONE, new C17660aa((Context) aso.f201488a.g.mo17428b(), new C17643g((C17637b) aso.f201783fd.mo17428b(), (Executor) aso.f201488a.n.mo17428b()), new C17684y((Context) aso.f201488a.g.mo17428b(), (AudioManager) aso.f201488a.E.mo17428b(), (C21370a) aso.f201488a.i.mo17428b(), (C60888db) aso.f201488a.n.mo17428b()))), (C17637b) aso.f201783fd.mo17428b(), (Executor) aso.f201488a.n.mo17428b())));
            gsaVoiceInteractionService.f118650V = C68219e.m98518a(amb.f197807b.a.f202586Q);
            gsaVoiceInteractionService.f118651W = C68219e.m98518a(amb.f197807b.a.f202588S);
            C90476a aVar = (C90476a) amb.f197807b.r.mo17428b();
            gsaVoiceInteractionService.f118652X = (C21370a) amb.f197807b.i.mo17428b();
            C68219e.m98518a(amb.f197807b.b.f199956aW);
            gsaVoiceInteractionService.f118653Y = C68219e.m98518a(amb.f197807b.cK);
            C68219e.m98518a(amb.f197807b.fq);
            gsaVoiceInteractionService.f118654Z = C68219e.m98518a(amb.f197807b.dl);
            gsaVoiceInteractionService.f118679aa = C68219e.m98518a(amb.f197807b.aC);
            gsaVoiceInteractionService.f118680ab = C68219e.m98518a(amb.f197749V);
            gsaVoiceInteractionService.f118681ac = C68219e.m98518a(amb.f197807b.b.f199969aj);
            gsaVoiceInteractionService.f118682ad = C68219e.m98518a(amb.f197807b.a.f202945ge);
            gsaVoiceInteractionService.f118683ae = C68219e.m98518a(amb.f197750W);
            gsaVoiceInteractionService.f118684af = C68219e.m98518a(amb.f197807b.gV);
            gsaVoiceInteractionService.f118685ag = C68219e.m98518a(amb.f197751X);
            gsaVoiceInteractionService.f118686ah = C68219e.m98518a(amb.f197752Y);
            gsaVoiceInteractionService.f118687ai = C68219e.m98518a(amb.f197753Z);
            C68219e.m98518a(amb.f197807b.a.f203118js);
            gsaVoiceInteractionService.f118688aj = C68219e.m98518a(amb.f197807b.a.f203115jp);
            aqy aqy = amb.f197807b;
            gsaVoiceInteractionService.f118689ak = aqy.d.f201784fe;
            gsaVoiceInteractionService.f118690al = C68219e.m98518a(aqy.a.f202593X);
            gsaVoiceInteractionService.f118691am = C68219e.m98518a(amb.f197807b.a.f203656u);
            gsaVoiceInteractionService.f118692an = C58833ax.m90834k((C81323s) amb.f197807b.b.f200148eC.mo17428b());
            gsaVoiceInteractionService.f118693ao = C68219e.m98518a(amb.f197781aa);
        }
        super.onCreate();
    }
}
