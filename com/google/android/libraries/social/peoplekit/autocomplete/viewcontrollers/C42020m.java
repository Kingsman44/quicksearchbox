package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.view.View;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42064j;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.p3275b.p3276a.C42038c;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.m */
/* compiled from: PG */
final class C42020m implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C42075e f109720a;

    /* renamed from: b */
    final /* synthetic */ C42023p f109721b;

    public C42020m(C42023p pVar, C42075e eVar) {
        this.f109721b = pVar;
        this.f109720a = eVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C42023p pVar = this.f109721b;
            if (pVar.f109737n) {
                this.f109720a.mo44577c(4, pVar.f109736m);
            } else {
                pVar.f109737n = true;
            }
            this.f109721b.f109728e.setCursorVisible(true);
            this.f109721b.mo44494l();
            C42023p pVar2 = this.f109721b;
            pVar2.f109731h.mo44462c(pVar2.f109728e.getText().toString(), this.f109721b.f109728e);
        } else {
            this.f109721b.mo44492j(8);
            this.f109721b.f109728e.setCursorVisible(false);
            if (C42131a.m73921d() && !this.f109721b.f109743t.isEmpty()) {
                ((C42064j) C58557jl.m90131l(this.f109721b.f109743t)).mo44553b(false);
            }
        }
        C42038c cVar = this.f109721b.f109745v;
        if (cVar != null && cVar.f109837b.f109857m && z) {
            cVar.f109836a.setVisibility(0);
            cVar.f109837b.f109857m = false;
        }
    }
}
