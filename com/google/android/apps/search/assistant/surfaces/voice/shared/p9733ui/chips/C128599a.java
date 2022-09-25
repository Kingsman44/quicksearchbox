package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.a */
/* compiled from: PG */
final class C128599a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C65496e f353579a;

    /* renamed from: b */
    final /* synthetic */ C128604e f353580b;

    /* renamed from: c */
    final /* synthetic */ C128602c f353581c;

    public C128599a(C65496e eVar, C128604e eVar2, C128602c cVar) {
        this.f353579a = eVar;
        this.f353580b = eVar2;
        this.f353581c = cVar;
    }

    public final void onClick(View view) {
        C59052c cVar = (C59052c) C128604e.f353590a.mo56224b();
        String str = this.f353579a.f178053b;
        cVar.mo56379ah(new C59094n(37877));
        cVar.mo56389s("Performing chip %s click.", str);
        C65496e eVar = this.f353579a;
        C128604e eVar2 = this.f353580b;
        C128602c cVar2 = this.f353581c;
        C69626l lVar = (C69626l) eVar2.f353597h.get(eVar);
        if (lVar == null) {
            C59052c cVar3 = (C59052c) C128604e.f353590a.mo56226d();
            cVar3.mo56379ah(new C59094n(37878));
            cVar3.mo56389s("No handler provided for %s.", eVar);
            return;
        }
        lVar.mo5761a(eVar);
        if (eVar.f178056e != 0) {
            eVar2.f353593d.mo108811c(cVar2.f353585a);
        }
    }
}
