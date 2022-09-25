package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9864f;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129961l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.f.c */
/* compiled from: PG */
final /* synthetic */ class C129979c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129981e f356486a;

    public C129979c(C129981e eVar) {
        this.f356486a = eVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C129961l lVar;
        C129961l lVar2;
        C129966q qVar = (C129966q) obj;
        C129981e eVar = this.f356486a;
        if (qVar == null || qVar.f356469b != 5) {
            eVar.f356488a.requireView().setVisibility(4);
            return;
        }
        eVar.f356488a.requireView().setVisibility(0);
        View findViewById = eVar.f356488a.requireView().findViewById(R.id.assistant_interpreter_language_name);
        C69664n.m101060f(findViewById, "fragment.requireView().f…nterpreter_language_name)");
        TextView textView = (TextView) findViewById;
        if (qVar.f356469b == 5) {
            lVar = (C129961l) qVar.f356470c;
        } else {
            lVar = C129961l.f356436e;
        }
        textView.setText(lVar.f356439b);
        TextView a = eVar.mo109364a();
        if (qVar.f356469b == 5) {
            lVar2 = (C129961l) qVar.f356470c;
        } else {
            lVar2 = C129961l.f356436e;
        }
        a.setHint(lVar2.f356440c);
    }
}
