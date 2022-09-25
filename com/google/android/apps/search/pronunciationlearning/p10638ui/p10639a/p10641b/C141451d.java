package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.b.d */
/* compiled from: PG */
final class C141451d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141444c f383951a;

    public C141451d(C141444c cVar) {
        this.f383951a = cVar;
    }

    public final void onClick(View view) {
        C141444c cVar = this.f383951a;
        C69664n.m101061g(view, "sentenceTtsButton");
        cVar.f383934l = !cVar.f383934l;
        TextView textView = (TextView) cVar.f383929g.requireView().findViewById(R.id.pronunciationlearning_expected_sentence);
        if (cVar.f383934l) {
            C46439e eVar = cVar.f383927e;
            C46438d b = C46438d.m82810b(cVar.f383926d.mo116408a(textView.getText().toString()));
            eVar.mo50428h(b.f121541a, (Object) null, cVar.f383939q);
            cVar.f383933k.mo116363c();
        } else {
            cVar.f383926d.mo116411d();
            cVar.f383933k.mo116364d();
        }
        cVar.mo116444d(view);
    }
}
