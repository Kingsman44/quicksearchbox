package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126980aa;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126981b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126986g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126995p;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126996q;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126998s;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127034w;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d.C129349af;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.h */
/* compiled from: PG */
final class C127074h extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C127081o f349900a;

    /* renamed from: b */
    final /* synthetic */ C127034w f349901b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127074h(C127081o oVar, C127034w wVar) {
        super(0);
        this.f349900a = oVar;
        this.f349901b = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C127081o.f349917a.mo56226d();
        cVar.mo56379ah(new C59094n(37372));
        cVar.mo56386p("Mic opening timeout triggered");
        C127081o oVar = this.f349900a;
        C119834cb cbVar = this.f349901b.f349813d;
        C126986g gVar = (C126986g) C126988i.f349669h.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C126981b a = C69664n.m101061g(gVar, "builder");
        a.mo107883c(C126985f.ERROR_TIMEOUT);
        a.mo107887g(C126998s.TIMEOUT_MIC_NOT_OPENED);
        a.mo107884d(cbVar);
        C126995p pVar = (C126995p) C126996q.f349705c.createBuilder();
        C69664n.m101060f(pVar, "newBuilder()");
        C126980aa a2 = C69664n.m101061g(pVar, "builder");
        Context context = oVar.f349921e;
        int i = C129349af.f355240a;
        String string = context.getString(R.string.assistant_mic_open_timeout);
        C69664n.m101060f(string, "context.getString(ErrorU…ssageForMicOpenFailure())");
        a2.mo107880b(string);
        a.mo107886f(a2.mo107879a());
        oVar.f349918b.mo5761a(a.mo107881a());
        return C69788q.f186170a;
    }
}
