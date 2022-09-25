package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77495a;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.l */
/* compiled from: PG */
public final /* synthetic */ class C77593l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77595n f213760a;

    /* renamed from: b */
    public final /* synthetic */ ac f213761b;

    /* renamed from: c */
    public final /* synthetic */ C77495a f213762c;

    public /* synthetic */ C77593l(C77595n nVar, ac acVar, C77495a aVar) {
        this.f213760a = nVar;
        this.f213761b = acVar;
        this.f213762c = aVar;
    }

    public final void run() {
        boolean z;
        C77595n nVar = this.f213760a;
        ac acVar = this.f213761b;
        C77495a aVar = this.f213762c;
        Optional a = nVar.f213775e.mo72730a(acVar);
        if (nVar.f213771a.mo71417a().mo71475u() && nVar.f213771a.mo71417a().mo71477w() && !aVar.f213551g) {
            nVar.mo72726h(acVar, C83016y.ENDPOINT_ON_TIMEOUT);
        } else if (!aVar.f213551g && ((a.isPresent() || !aVar.equals(C77495a.LEGACY_TIMEOUT)) && nVar.mo72729k())) {
            nVar.mo72726h(acVar, C83016y.ENDPOINT_ON_TIMEOUT);
        } else if (a.isPresent()) {
            nVar.mo72620e((C77557aj) a.get());
        } else if (!nVar.f213776f.mo85405j(C90126fx.f251322gd) || nVar.f213788r.get() != C80471b.S3 || aVar.f213551g || !nVar.f213781k.mo74010c() || !nVar.f213779i.mo72720a() || nVar.f213786p.get()) {
            if (!nVar.f213776f.mo85405j(C90126fx.f251000aZ) && !nVar.f213777g.get()) {
                if (aVar.equals(C77495a.LEGACY_TIMEOUT)) {
                    z = nVar.f213779i.mo72720a();
                } else {
                    z = aVar.f213551g;
                }
                if (z) {
                    nVar.f213772b.s();
                    nVar.f213780j.mo74282h(aVar);
                    return;
                }
            }
            if (aVar.f213551g) {
                if (nVar.f213776f.mo85405j(C90126fx.f251000aZ)) {
                    nVar.f213780j.mo74282h(aVar);
                }
                C77598q qVar = (C77598q) nVar.f213785o.mo27525b();
                qVar.f213796a.mo28212l("[NGA] NgaErrorUi.displayAudioFailureCard", new C77597p(qVar));
                nVar.f213772b.a(C89849ae.NGA_PAUSED_SPEECH_FAILURE, C83016y.SPEECH_FAILURE);
            } else if (nVar.f213779i.mo72720a()) {
                nVar.mo72728j(acVar, C89849ae.NGA_PAUSED_NO_RECOGNITION_RECEIVED, C83016y.NO_RECOGNITION_RECEIVED);
            } else {
                nVar.mo72728j(acVar, C89849ae.NGA_PAUSED_INACTIVITY_TIMEOUT, C83016y.EXTEND_STATE_END);
            }
        } else {
            nVar.f213786p.set(true);
            nVar.f213772b.d();
        }
    }
}
