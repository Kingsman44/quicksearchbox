package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9858c;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129956g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.c.c */
/* compiled from: PG */
final /* synthetic */ class C129873c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129874d f356292a;

    public C129873c(C129874d dVar) {
        this.f356292a = dVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C129956g gVar;
        C129956g gVar2;
        C129956g gVar3;
        C129956g gVar4;
        C129966q qVar = (C129966q) obj;
        C129874d dVar = this.f356292a;
        if (qVar == null || qVar.f356469b != 1) {
            dVar.f356294b.requireView().setVisibility(4);
            return;
        }
        dVar.f356294b.requireView().setVisibility(0);
        if (qVar.f356469b == 1) {
            gVar = (C129956g) qVar.f356470c;
        } else {
            gVar = C129956g.f356423c;
        }
        String str = gVar.f356425a;
        if (qVar.f356469b == 1) {
            gVar2 = (C129956g) qVar.f356470c;
        } else {
            gVar2 = C129956g.f356423c;
        }
        String str2 = gVar2.f356426b;
        View findViewById = dVar.f356294b.requireView().findViewById(R.id.assistant_interpreter_source_intro);
        C69664n.m101060f(findViewById, "fragment.requireView().f…interpreter_source_intro)");
        TextView textView = (TextView) findViewById;
        if (qVar.f356469b == 1) {
            gVar3 = (C129956g) qVar.f356470c;
        } else {
            gVar3 = C129956g.f356423c;
        }
        textView.setText(gVar3.f356425a);
        View findViewById2 = dVar.f356294b.requireView().findViewById(R.id.assistant_interpreter_target_intro);
        C69664n.m101060f(findViewById2, "fragment.requireView().f…interpreter_target_intro)");
        TextView textView2 = (TextView) findViewById2;
        if (qVar.f356469b == 1) {
            gVar4 = (C129956g) qVar.f356470c;
        } else {
            gVar4 = C129956g.f356423c;
        }
        textView2.setText(gVar4.f356426b);
    }
}
