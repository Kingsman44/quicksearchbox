package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128368e;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128369f;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.f */
/* compiled from: PG */
public final class C128374f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f353059a;

    public C128374f(String str) {
        this.f353059a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C128377i.f353069a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(37866));
        cVar.mo56386p("Failed to post TTS timepoint to timepoint event queue.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C128369f fVar = (C128369f) obj;
        C69664n.m101061g(fVar, "result");
        C128368e a = C128368e.m209480a(fVar.f353048b);
        if (a == null) {
            a = C128368e.UNKNOWN;
        }
        if (a != C128368e.SUCCESS) {
            C59052c cVar = (C59052c) C128377i.f353069a.mo56226d();
            String str = this.f353059a;
            C128368e a2 = C128368e.m209480a(fVar.f353048b);
            if (a2 == null) {
                a2 = C128368e.UNKNOWN;
            }
            int i = a2.f353044e;
            cVar.mo56379ah(new C59094n(37867));
            cVar.mo56352E("Error posting timepoint: '%s' to queue, code: %d", str, i);
        }
    }
}
