package com.google.android.apps.search.googleapp.search;

import android.os.Bundle;
import androidx.navigation.C3807af;
import androidx.navigation.C3825ax;
import androidx.navigation.C3896q;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138546aa;

/* renamed from: com.google.android.apps.search.googleapp.search.i */
/* compiled from: PG */
public final /* synthetic */ class C137475i implements C3896q {

    /* renamed from: a */
    public final /* synthetic */ C137553n f373919a;

    public /* synthetic */ C137475i(C137553n nVar) {
        this.f373919a = nVar;
    }

    /* renamed from: a */
    public final void mo8090a(C3807af afVar, C3825ax axVar, Bundle bundle) {
        C137553n nVar = this.f373919a;
        CharSequence charSequence = axVar.f12357f;
        charSequence.getClass();
        if (!charSequence.toString().equals(C139779t.SEARCH.name())) {
            nVar.mo113816q();
            C138546aa m = nVar.mo113812m();
            if (m != null) {
                m.mo17754z().f376873n.f375632c = false;
            }
        } else if (nVar.f374156y) {
            nVar.mo113819t(C137418g.f373767r);
        } else {
            nVar.f374156y = true;
        }
    }
}
