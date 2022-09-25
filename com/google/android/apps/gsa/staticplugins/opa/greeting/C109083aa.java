package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.view.View;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.aa */
/* compiled from: PG */
final class C109083aa implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f303711a;

    /* renamed from: b */
    final /* synthetic */ C109100ar f303712b;

    public C109083aa(C109100ar arVar, int i) {
        this.f303712b = arVar;
        this.f303711a = i;
    }

    public final void onClick(View view) {
        C109100ar arVar = this.f303712b;
        C91097g gVar = arVar.f303789v;
        C74554t i = C74555u.m120572i();
        i.mo70869c(C9439b.OPA_VOICE_MATCH_FROM_FRE_INPUT_PLATE);
        gVar.mo65090b(i.mo70882h(), new C109127x(arVar));
        this.f303712b.f303758W.mo101394d("opa_voice_match_button_interaction_count", Integer.valueOf(this.f303711a + 1));
    }
}
