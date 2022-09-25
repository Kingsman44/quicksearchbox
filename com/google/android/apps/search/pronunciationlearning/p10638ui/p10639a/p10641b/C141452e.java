package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b;

import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b.e */
/* compiled from: PG */
final class C141452e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141444c f383952a;

    public C141452e(C141444c cVar) {
        this.f383952a = cVar;
    }

    public final void onClick(View view) {
        C141444c cVar = this.f383952a;
        C69664n.m101061g(view, "view");
        PhonemeView phonemeView = (PhonemeView) view;
        cVar.f383936n = !cVar.f383936n;
        phonemeView.mo17754z().mo116517a(cVar.f383936n);
        if (cVar.f383936n) {
            C60870cx a = cVar.f383926d.mo116408a(phonemeView.mo17754z().f384087a);
            C46439e eVar = cVar.f383927e;
            C46438d b = C46438d.m82810b(a);
            eVar.mo50428h(b.f121541a, (Object) null, cVar.f383941s);
            cVar.f383933k.mo116365e();
            return;
        }
        cVar.f383926d.mo116411d();
        cVar.f383933k.mo116366f();
    }
}
