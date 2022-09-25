package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79553k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.speech.p5218j.C67026ih;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.n */
/* compiled from: PG */
public final class C79631n implements C19347o {

    /* renamed from: a */
    private final C79617a f218443a;

    /* renamed from: b */
    private final C79553k f218444b;

    public C79631n(C79617a aVar, C79553k kVar) {
        this.f218443a = aVar;
        this.f218444b = kVar;
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C59081b.m91349a(TimeUnit.SECONDS, "time unit");
        if ((koVar.f182368a & 2) != 0) {
            this.f218443a.mo74166e(koVar);
        }
        if ((koVar.f182368a & 8) != 0) {
            C79617a aVar = this.f218443a;
            C67038it itVar = koVar.f182372e;
            if (itVar == null) {
                itVar = C67038it.f182220d;
            }
            aVar.mo74164c(itVar);
        }
        if ((koVar.f182368a & 32) != 0) {
            C79617a aVar2 = this.f218443a;
            C67026ih ihVar = koVar.f182373f;
            if (ihVar == null) {
                ihVar = C67026ih.f182188e;
            }
            aVar2.mo74163b(ihVar);
        }
        if ((koVar.f182368a & 1) != 0) {
            this.f218443a.mo74165d(koVar);
        }
    }

    /* renamed from: u */
    public final void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        this.f218444b.mo74135a(C79562t.SODA_STOP_CAPTURE);
    }
}
