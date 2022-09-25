package com.google.android.apps.gsa.staticplugins.microdetection;

import android.net.Uri;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.r */
/* compiled from: PG */
final class C102862r implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Uri f287289a;

    /* renamed from: b */
    final /* synthetic */ HotwordResult f287290b;

    /* renamed from: c */
    final /* synthetic */ C102863s f287291c;

    public C102862r(C102863s sVar, Uri uri, HotwordResult hotwordResult) {
        this.f287291c = sVar;
        this.f287289a = uri;
        this.f287290b = hotwordResult;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = MicroDetectionWorker.f286928a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(21046)).mo56386p("Did not launch Opa from lockscreen");
        this.f287291c.mo93517e(this.f287289a);
        this.f287291c.f287292a.f286971b.mo80468e(this.f287290b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            this.f287291c.mo93517e(this.f287289a);
            C59104x b = MicroDetectionWorker.f286928a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b).mo56372aa(21047)).mo56386p("Keyguard not dismissed");
        }
        this.f287291c.f287292a.f286971b.mo80468e(this.f287290b);
    }
}
