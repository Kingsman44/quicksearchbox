package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jf */
/* compiled from: PG */
public final /* synthetic */ class C108452jf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108453jg f301667a;

    public /* synthetic */ C108452jf(C108453jg jgVar) {
        this.f301667a = jgVar;
    }

    public final void onClick(View view) {
        C108453jg jgVar = this.f301667a;
        C91097g gVar = jgVar.f301670c;
        C74554t i = C74555u.m120572i();
        i.mo70869c(C9439b.OPA_DEFERRED_VOICE_MATCH_POST_QUERY_CHIP);
        gVar.mo65089a(i.mo70882h());
        C28292j jVar = jgVar.f301030l;
        if (jVar != null) {
            C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
        }
        ((SharedPreferences) jgVar.f301669b.mo27525b()).edit().putBoolean("voice_onboarding_completed", true).apply();
        ((SharedPreferences) jgVar.f301669b.mo27525b()).edit().putInt("opa_deferred_match_post_query_chip_tap_count", ((SharedPreferences) jgVar.f301669b.mo27525b()).getInt("opa_deferred_match_post_query_chip_tap_count", 0) + 1).apply();
    }
}
