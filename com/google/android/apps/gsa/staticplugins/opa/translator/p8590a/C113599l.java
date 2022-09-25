package com.google.android.apps.gsa.staticplugins.opa.translator.p8590a;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113672ax;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113680be;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.C113694k;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterInputButtonPlateView;
import com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterIntroView;
import com.google.android.libraries.logging.C28285c;
import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60757n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.a.l */
/* compiled from: PG */
public final class C113599l {

    /* renamed from: a */
    final /* synthetic */ C113613z f314530a;

    public C113599l(C113613z zVar) {
        this.f314530a = zVar;
    }

    /* renamed from: a */
    public final void mo100323a(int i) {
        Context context;
        C59071e eVar = C113613z.f314555a;
        C58976aa aaVar = C58975e.f156826a;
        C113613z zVar = this.f314530a;
        C113613z zVar2 = zVar.f314590r.f314554a;
        RelativeLayout relativeLayout = zVar2.f314584l;
        Snackbar snackbar = null;
        if (!(relativeLayout == null || (context = zVar2.f314583k) == null)) {
            snackbar = Snackbar.m79661q((Context) null, relativeLayout, C113672ax.m188247b(context, i, zVar2.f314588p), -1);
        }
        if (snackbar == null) {
            C59104x c = C113613z.f314555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(28058)).mo56386p("null snackbar, init not called?");
            return;
        }
        C107955f fVar = zVar.f314579g;
        fVar.mo96345b(fVar.mo96346c(snackbar, new C44893x(), 0));
    }

    /* renamed from: b */
    public final void mo100324b(C113680be beVar, boolean z) {
        int i;
        int i2;
        C59071e eVar = C113613z.f314555a;
        C58976aa aaVar = C58975e.f156826a;
        C113613z zVar = this.f314530a;
        C59104x b = C113613z.f314555a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(28005)).mo56360M("animateToNewMode: mode: %s, closeMic: %b, waitingToOpenMicAfterAutoEndOfIntroTts: %b, isContinuousTranslation: %b", beVar, Boolean.valueOf(z), Boolean.valueOf(zVar.f314592t), Boolean.valueOf(zVar.f314593u));
        RelativeLayout relativeLayout = zVar.f314584l;
        if (relativeLayout != null) {
            C89949q.m146521e(C28285c.m52882i(C113613z.m188062g(relativeLayout), 5, (Integer) null), false);
            if (beVar != C113680be.KEYBOARD) {
                zVar.mo100338k();
            }
            if (beVar != C113680be.AUTO) {
                zVar.f314592t = false;
                if (C113613z.m188058c(zVar.f314584l).getVisibility() == 0) {
                    C113613z.m188058c(zVar.f314584l).setVisibility(8);
                }
            }
            zVar.f314586n = beVar;
            zVar.f314587o = false;
            InterpreterIntroView f = C113613z.m188061f(zVar.f314584l);
            f.f314736k = beVar;
            boolean z2 = f.f314737l;
            f.f314728c.cancel();
            f.f314728c.reset();
            f.f314729d.cancel();
            f.f314729d.reset();
            if (!f.f314737l) {
                f.mo100392b(beVar);
                i = 0;
            } else {
                f.startAnimation(f.f314729d);
                i = (int) (f.f314729d.getDuration() + f.f314728c.getDuration());
            }
            InterpreterInputButtonPlateView e = C113613z.m188060e(zVar.f314584l);
            C113680be beVar2 = e.f314718h;
            C113680be beVar3 = C113680be.UNKNOWN;
            e.f314718h = beVar;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = e.f314722l;
            C113680be beVar4 = e.f314718h;
            if (beVar4 == C113680be.MANUAL && !e.f314720j && onGlobalLayoutListener == null) {
                C113694k kVar = new C113694k(e);
                e.f314722l = kVar;
                e.f314723m.mo100529b(kVar);
            } else if (beVar4 == C113680be.KEYBOARD && !e.f314721k && onGlobalLayoutListener == null) {
                C113694k kVar2 = new C113694k(e);
                e.f314722l = kVar2;
                e.f314723m.mo100529b(kVar2);
            } else if (onGlobalLayoutListener != null) {
                e.f314722l = null;
                e.f314723m.mo100530c(onGlobalLayoutListener);
            }
            if (beVar2 == beVar3) {
                e.mo100380i();
                e.mo100381j();
                i2 = 0;
            } else {
                e.mo100380i();
                e.mo100378g().mo28225e(1, true);
                e.f314719i = true;
                e.f314717g.mo100524b(e);
                e.mo100386o();
                i2 = (int) (e.f314717g.f314891a.getDuration() + e.f314716f.f314891a.getDuration());
            }
            if (z) {
                zVar.mo100339l();
            }
            if (beVar != C113680be.AUTO) {
                zVar.f314578f.mo98059d();
            }
            if (!zVar.mo100337j().isEmpty()) {
                zVar.f314580h.edit().putInt(zVar.mo100337j(), beVar.f314876e).apply();
            }
            if (!zVar.f314593u) {
                int a = zVar.mo100336a(C113610w.INTRO_VIEW, true);
                if (beVar == C113680be.AUTO && !zVar.f314592t) {
                    zVar.f314584l.postDelayed(new C113598k(zVar), Math.max(zVar.f314575c + ((long) C60757n.m92746g(i, i2, a)), zVar.f314574b));
                }
            }
        }
    }
}
