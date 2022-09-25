package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.t */
/* compiled from: PG */
final class C102864t implements C22862b {

    /* renamed from: a */
    final /* synthetic */ MicroDetectionWorker f287293a;

    /* renamed from: b */
    private final C84516aa f287294b;

    /* renamed from: c */
    private final Intent f287295c;

    /* renamed from: d */
    private final C68214a f287296d;

    public C102864t(MicroDetectionWorker microDetectionWorker, Intent intent, C84516aa aaVar, C68214a aVar) {
        this.f287293a = microDetectionWorker;
        this.f287295c = intent;
        this.f287294b = aaVar;
        this.f287296d = aVar;
    }

    /* renamed from: b */
    private final void m170626b() {
        ((C89859i) this.f287293a.f286931C.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_LOCKSCREEN);
        MicroDetectionWorker.m170413F(this.f287296d, this.f287295c);
        this.f287293a.mo93438L();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17947a() {
        C59071e eVar = MicroDetectionWorker.f286928a;
        C58976aa aaVar = C58975e.f156826a;
        for (int i = 0; i < 25; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException unused) {
            }
            if (!this.f287294b.f230023b.isDeviceLocked()) {
                m170626b();
                return true;
            }
        }
        this.f287293a.mo93447V();
        if (this.f287293a.f286971b.mo80492E()) {
            this.f287293a.mo93445S(this.f287295c);
            C59104x b = MicroDetectionWorker.f286928a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b).mo56372aa(21080)).mo56386p("Unlock Failed: paused");
        } else {
            this.f287295c.removeExtra("audio_content_uri");
            m170626b();
            C59104x b2 = MicroDetectionWorker.f286928a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b2).mo56372aa(21081)).mo56386p("Unlock Failed");
        }
        return false;
    }
}
