package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9857b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129954e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.b.d */
/* compiled from: PG */
final /* synthetic */ class C129862d implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129860c f356269a;

    public C129862d(C129860c cVar) {
        this.f356269a = cVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C129966q qVar = (C129966q) obj;
        C69664n.m101061g(qVar, "p0");
        C129860c cVar = this.f356269a;
        C129954e eVar = qVar.f356477j;
        if (eVar == null) {
            eVar = C129954e.f356419c;
        }
        C69664n.m101060f(eVar, "state.homescreenShortcutPayload");
        cVar.f356265c = eVar;
        String str = qVar.f356471d;
        C69664n.m101060f(str, "state.sourceLocale");
        cVar.f356266d = str;
        String str2 = qVar.f356472e;
        C69664n.m101060f(str2, "state.targetLocale");
        cVar.f356267e = str2;
    }
}
