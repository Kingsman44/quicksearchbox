package com.google.android.apps.search.pronunciationlearning;

import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10638ui.practicing.PhonemeView;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ah */
/* compiled from: PG */
final class C141322ah implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141308aa f383666a;

    public C141322ah(C141308aa aaVar) {
        this.f383666a = aaVar;
    }

    public final void onClick(View view) {
        C141308aa aaVar = this.f383666a;
        aaVar.f383650x = !aaVar.f383650x;
        PhonemeView phonemeView = (PhonemeView) view;
        phonemeView.mo17754z().mo116517a(aaVar.f383650x);
        if (aaVar.f383650x) {
            C60870cx a = aaVar.f383634h.mo116408a(phonemeView.mo17754z().f384087a);
            C46439e eVar = aaVar.f383633g;
            C46438d b = C46438d.m82810b(a);
            eVar.mo50428h(b.f121541a, (Object) null, aaVar.f383638l);
            aaVar.f383641o.mo116365e();
            return;
        }
        aaVar.f383634h.mo116411d();
        aaVar.f383641o.mo116366f();
    }
}
