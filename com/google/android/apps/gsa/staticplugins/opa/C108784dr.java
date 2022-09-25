package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107464ac;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dr */
/* compiled from: PG */
final class C108784dr extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f302511a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f302512b;

    public C108784dr(C109040fj fjVar, boolean z) {
        this.f302512b = fjVar;
        this.f302511a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f302512b.mo97552y();
        this.f302512b.f303450o.mo95420i().getLayoutParams().height = -1;
        if (this.f302512b.f303238X.mo96134aG() && this.f302511a) {
            this.f302512b.f303238X.mo96151ac(true);
        }
        if (C113987f.m188691b(this.f302512b.f303455t) && !this.f302512b.f303242aB) {
            C107464ac acVar = (C107464ac) C107467af.f299043c.createBuilder();
            acVar.copyOnWrite();
            C107467af afVar = (C107467af) acVar.instance;
            afVar.f299046b = 2;
            afVar.f299045a = 1 | afVar.f299045a;
            this.f302512b.mo97442aD((C107467af) acVar.build());
        }
        if (C109040fj.m181378bx(this.f302512b.f303450o)) {
            ((C113989h) ((C113988g) this.f302512b.f303450o).mo100833bf().mo56107c()).mo100858bZ();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f302512b.mo97431S(true);
        C109040fj fjVar = this.f302512b;
        if (fjVar.f303294bA && fjVar.f303455t.mo79746e(C90014bt.f247131bP)) {
            this.f302512b.f303450o.mo95420i().setAlpha(0.0f);
            this.f302512b.f303449n.findViewById(R.id.opa_search_plate_container).setAlpha(0.0f);
        }
        if (C109040fj.m181378bx(this.f302512b.f303450o)) {
            ((C113989h) ((C113988g) this.f302512b.f303450o).mo100833bf().mo56107c()).mo100899cx(true);
        }
    }
}
