package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.assistant.shared.p.m;
import com.google.android.apps.gsa.opa.C83571ab;
import com.google.android.apps.gsa.opa.C83572ac;
import com.google.android.apps.gsa.opa.C83573ad;
import com.google.android.apps.gsa.opa.C83587c;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.staticplugins.opa.C108797ea;
import com.google.android.apps.gsa.staticplugins.opa.C109040fj;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.OpaEditText;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ak */
/* compiled from: PG */
final class C107651ak implements l {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299483a;

    public C107651ak(C107656ap apVar) {
        this.f299483a = apVar;
    }

    /* renamed from: a */
    public final C83573ad mo96086a() {
        C58833ax axVar;
        C107658ar arVar = this.f299483a.f299595r;
        if (arVar == null) {
            return C83573ad.f227888a;
        }
        C108797ea eaVar = (C108797ea) arVar;
        C109040fj fjVar = eaVar.f302536a;
        if (fjVar.mo97493bC(true)) {
            axVar = C58833ax.m90834k(C83572ac.OOBE);
        } else if (fjVar.f303333bn || !fjVar.f303334bo) {
            axVar = (fjVar.f303336bq || !fjVar.f303335bp) ? C58836b.f156633a : C58833ax.m90834k(C83572ac.TMF);
        } else {
            axVar = C58833ax.m90834k(C83572ac.AOL);
        }
        String string = eaVar.f302536a.mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description);
        if (axVar.mo56113h() && axVar.mo56107c() == C83572ac.AOL) {
            string = eaVar.f302536a.mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_aol);
        }
        if (axVar.mo56113h() && axVar.mo56107c() == C83572ac.TMF) {
            string = eaVar.f302536a.mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_tmf);
        }
        C83571ab c = C83573ad.m133105c();
        C83587c cVar = (C83587c) c;
        cVar.f227891a = axVar;
        if (string != null) {
            cVar.f227892b = string;
            return c.mo76904a();
        }
        throw new NullPointerException("Null finishSetupBarDescription");
    }

    /* renamed from: b */
    public final void mo96087b(String str, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        if (!this.f299483a.mo96132aE()) {
            C107656ap apVar = this.f299483a;
            str.getClass();
            apVar.mo96110I(str, axVar, e.O, axVar2, axVar3);
        } else if (this.f299483a.f299595r != null) {
            C87565h hVar = new C87565h();
            hVar.f236560f = 1;
            hVar.f236568n = str;
            hVar.f236556b = e.bW;
            Bundle a = hVar.mo81685a();
            C108797ea eaVar = (C108797ea) this.f299483a.f299595r;
            eaVar.f302536a.f303441f.finish();
            ((C87568k) eaVar.f302536a.f303271ae.mo56107c()).mo81689c(eaVar.f302536a.f303346c, a, 268435456);
        } else {
            C59104x d = C107656ap.f299490a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaSearchPlateCtl");
            ((C59052c) ((C59052c) d).mo56372aa(26014)).mo56386p("Should retart OPA in intent launcher, but searchplate callback is null");
        }
    }

    /* renamed from: c */
    public final void mo96088c(String str) {
        OpaEditText m = this.f299483a.mo96184m();
        m.setText(str);
        m.setSelection(m.getText().length());
    }

    /* renamed from: d */
    public final void mo96089d() {
        C107658ar arVar = this.f299483a.f299595r;
        if (arVar != null) {
            ((C108797ea) arVar).f302536a.mo97430R();
        }
    }

    /* renamed from: e */
    public final void mo96090e(C83572ac acVar) {
        C107658ar arVar = this.f299483a.f299595r;
        if (arVar != null) {
            ((C108797ea) arVar).f302536a.mo97422J(acVar);
        }
    }

    /* renamed from: f */
    public final void mo96091f() {
        this.f299483a.mo96111J();
    }

    /* renamed from: g */
    public final void mo96092g() {
        if (this.f299483a.mo96183l() != null) {
            this.f299483a.mo96167as();
        }
    }

    /* renamed from: h */
    public final void mo96093h(boolean z) {
        View h = this.f299483a.mo96180h();
        int i = 0;
        boolean z2 = h.getVisibility() == 0;
        m l = this.f299483a.mo96183l();
        if (z2 != z && l != null && l.y()) {
            if (true != z) {
                i = 4;
            }
            h.setVisibility(i);
            if (z) {
                h.requestFocus();
                l.b().bringToFront();
            }
        }
    }

    /* renamed from: i */
    public final boolean mo96094i(Intent intent) {
        C107658ar arVar = this.f299483a.f299595r;
        if (arVar != null) {
            return ((C108797ea) arVar).f302536a.f303456u.mo65089a(intent);
        }
        return false;
    }
}
