package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.k */
/* compiled from: PG */
public final /* synthetic */ class C77592k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77595n f213757a;

    /* renamed from: b */
    public final /* synthetic */ String f213758b;

    /* renamed from: c */
    public final /* synthetic */ C77557aj f213759c;

    public /* synthetic */ C77592k(C77595n nVar, String str, C77557aj ajVar) {
        this.f213757a = nVar;
        this.f213758b = str;
        this.f213759c = ajVar;
    }

    public final void run() {
        C77595n nVar = this.f213757a;
        String str = this.f213758b;
        C77557aj ajVar = this.f213759c;
        if (nVar.f213771a.mo71417a().mo71458b().a() || nVar.f213787q.get()) {
            ajVar.mo72662z();
            ajVar.mo72660x();
            boolean z = false;
            if (nVar.f213771a.mo71417a().mo71475u() && nVar.f213771a.mo71417a().mo71477w()) {
                z = true;
            }
            if (!ajVar.mo72662z() || !ajVar.mo72660x().isEmpty() || z) {
                nVar.f213772b.q(ajVar.mo72662z());
                nVar.f213773c.d(str, ajVar);
                return;
            }
            nVar.mo72728j(ajVar.mo72638a().b(), C89849ae.NGA_PAUSED_NO_SPEECH_DETECTED, C83016y.RECOGNIZER_NO_SPEECH);
        }
    }
}
