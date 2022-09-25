package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b;

import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10628a.C141305l;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b.f */
/* compiled from: PG */
final class C141453f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141444c f383953a;

    public C141453f(C141444c cVar) {
        this.f383953a = cVar;
    }

    public final void onClick(View view) {
        C141444c cVar = this.f383953a;
        C69664n.m101061g(view, "view");
        cVar.f383935m = !cVar.f383935m;
        ((PhonemeView) view).mo17754z().mo116517a(cVar.f383935m);
        if (cVar.f383935m) {
            C60870cx b = cVar.f383932j.mo116333b(cVar.f383931i.mo116380b(), 0, 0);
            C46439e eVar = cVar.f383927e;
            C46438d b2 = C46438d.m82810b(b);
            eVar.mo50428h(b2.f121541a, (Object) null, cVar.f383942t);
            cVar.f383933k.mo116370j();
            return;
        }
        C141305l lVar = cVar.f383932j;
        lVar.mo116332a(lVar.f383618e);
        cVar.f383933k.mo116371k();
    }
}
