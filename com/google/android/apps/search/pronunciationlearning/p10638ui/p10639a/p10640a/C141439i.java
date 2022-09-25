package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

import android.view.View;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.i */
/* compiled from: PG */
final class C141439i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141432c f383909a;

    public C141439i(C141432c cVar) {
        this.f383909a = cVar;
    }

    public final void onClick(View view) {
        C141432c cVar = this.f383909a;
        C69664n.m101061g(view, "sentenceTtsButton");
        cVar.f383901g = !cVar.f383901g;
        String a = cVar.mo116429a();
        if (cVar.f383901g) {
            C46439e eVar = cVar.f383898d;
            C46438d b = C46438d.m82810b(cVar.f383897c.mo116408a(a));
            eVar.mo50428h(b.f121541a, (Object) null, cVar.f383902h);
        } else {
            cVar.f383897c.mo116411d();
        }
        cVar.mo116431c(view);
    }
}
