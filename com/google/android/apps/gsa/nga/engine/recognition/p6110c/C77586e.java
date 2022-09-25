package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.e */
/* compiled from: PG */
public final /* synthetic */ class C77586e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77595n f213746a;

    /* renamed from: b */
    public final /* synthetic */ C67464l f213747b;

    /* renamed from: c */
    public final /* synthetic */ boolean f213748c;

    /* renamed from: d */
    public final /* synthetic */ ac f213749d;

    public /* synthetic */ C77586e(C77595n nVar, C67464l lVar, boolean z, ac acVar) {
        this.f213746a = nVar;
        this.f213747b = lVar;
        this.f213748c = z;
        this.f213749d = acVar;
    }

    public final void run() {
        C77595n nVar = this.f213746a;
        C67464l lVar = this.f213747b;
        boolean z = this.f213748c;
        ac acVar = this.f213749d;
        if (nVar.f213771a.mo71417a().mo71458b().a() && nVar.f213776f.mo85405j(C90126fx.f251317gY) && ((C80471b) nVar.f213788r.get()).equals(C80471b.S3) && nVar.mo72729k()) {
            C67463k a = C67463k.m97475a(lVar.f183359b);
            if (a == null) {
                a = C67463k.START_OF_SPEECH;
            }
            if (a != C67463k.END_OF_UTTERANCE) {
                return;
            }
            if (!z || nVar.f213775e.mo72734e(acVar)) {
                nVar.mo72726h(acVar, C83016y.OFFLINE_SPEECH_ENDED);
            }
        }
    }
}
