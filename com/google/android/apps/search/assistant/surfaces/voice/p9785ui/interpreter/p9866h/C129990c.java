package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9866h;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129965p;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129967r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.h.c */
/* compiled from: PG */
final /* synthetic */ class C129990c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129993f f356501a;

    public C129990c(C129993f fVar) {
        this.f356501a = fVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C129965p pVar;
        C129965p pVar2;
        C129965p pVar3;
        C129965p pVar4;
        C129965p pVar5;
        C129965p pVar6;
        int i;
        C129965p pVar7;
        C129965p pVar8;
        C129966q qVar = (C129966q) obj;
        C129993f fVar = this.f356501a;
        if (qVar == null || qVar.f356469b != 2) {
            fVar.mo109377e().setVisibility(4);
        } else if (!C129967r.m212142c(qVar)) {
            if (qVar.f356469b == 2) {
                pVar = (C129965p) qVar.f356470c;
            } else {
                pVar = C129965p.f356456i;
            }
            String str = pVar.f356465h;
            C69664n.m101060f(str, "state.waitingState.locale");
            fVar.f356511h = str;
            fVar.mo109377e().setVisibility(0);
            if (C129967r.m212140a(qVar)) {
                fVar.mo109378f().setVisibility(4);
                fVar.mo109376d().setVisibility(0);
                View findViewById = fVar.f356506c.requireView().findViewById(R.id.assistant_interpreter_auto_source_waiting);
                C69664n.m101060f(findViewById, "fragment.requireView().f…eter_auto_source_waiting)");
                TextView textView = (TextView) findViewById;
                if (qVar.f356469b == 2) {
                    pVar7 = (C129965p) qVar.f356470c;
                } else {
                    pVar7 = C129965p.f356456i;
                }
                textView.setText(pVar7.f356459b);
                View findViewById2 = fVar.f356506c.requireView().findViewById(R.id.assistant_interpreter_auto_target_waiting);
                C69664n.m101060f(findViewById2, "fragment.requireView().f…eter_auto_target_waiting)");
                TextView textView2 = (TextView) findViewById2;
                if (qVar.f356469b == 2) {
                    pVar8 = (C129965p) qVar.f356470c;
                } else {
                    pVar8 = C129965p.f356456i;
                }
                textView2.setText(pVar8.f356460c);
                return;
            }
            fVar.mo109378f().setVisibility(0);
            fVar.mo109376d().setVisibility(4);
            EditText c = fVar.mo109375c();
            if (qVar.f356469b == 2) {
                pVar2 = (C129965p) qVar.f356470c;
            } else {
                pVar2 = C129965p.f356456i;
            }
            c.setHint(pVar2.f356459b);
            TextView g = fVar.mo109379g();
            if (qVar.f356469b == 2) {
                pVar3 = (C129965p) qVar.f356470c;
            } else {
                pVar3 = C129965p.f356456i;
            }
            g.setText(pVar3.f356462e);
            Button a = fVar.mo109373a();
            if (qVar.f356469b == 2) {
                pVar4 = (C129965p) qVar.f356470c;
            } else {
                pVar4 = C129965p.f356456i;
            }
            a.setText(pVar4.f356464g);
            Button b = fVar.mo109374b();
            if (qVar.f356469b == 2) {
                pVar5 = (C129965p) qVar.f356470c;
            } else {
                pVar5 = C129965p.f356456i;
            }
            b.setText(pVar5.f356463f);
            Context c2 = C44534d.m78716c(fVar.f356506c.requireContext());
            C69664n.m101060f(c2, "wrapContextIfAvailable(fragment.requireContext())");
            if (qVar.f356469b == 2) {
                pVar6 = (C129965p) qVar.f356470c;
            } else {
                pVar6 = C129965p.f356456i;
            }
            if (pVar6.f356461d) {
                i = C19391a.m36980a(c2, R.attr.colorPrimary);
            } else {
                i = C19391a.m36980a(c2, R.attr.colorSecondary);
            }
            fVar.mo109374b().setTextColor(i);
            fVar.mo109373a().setTextColor(C19391a.m36980a(c2, R.attr.assistantOnBackground));
            fVar.mo109379g().setTextColor(i);
            fVar.mo109375c().setHintTextColor(C19391a.m36980a(c2, R.attr.colorHairline));
        } else {
            C59052c cVar = (C59052c) C129993f.f356504a.mo56226d();
            cVar.mo56379ah(new C59094n(38676));
            cVar.mo56386p("WaitingState is not applicable for manual mode");
            fVar.mo109377e().setVisibility(4);
        }
    }
}
