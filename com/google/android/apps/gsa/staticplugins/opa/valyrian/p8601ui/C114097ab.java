package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.support.p033v7.widget.C0568ck;
import android.support.p033v7.widget.C0673gh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ab */
/* compiled from: PG */
public final class C114097ab extends C0568ck {
    public C114097ab() {
        this.f2409i = Duration.ofMillis(300).toMillis();
        this.f2408h = Duration.ofSeconds(1).toMillis();
        this.f2538m = false;
    }

    /* renamed from: f */
    public final boolean mo2690f(C0673gh ghVar) {
        C108232bc bcVar;
        int h;
        if ((ghVar instanceof C108241bl) && (bcVar = ((C108241bl) ghVar).f301069S) != null && ((h = bcVar.mo95830h()) == 0 || h == 1 || h == 2 || h == 19 || h == 26)) {
            return super.mo2690f(ghVar);
        }
        mo2889m(ghVar);
        return false;
    }

    /* renamed from: g */
    public final boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4) {
        if (ghVar == ghVar2) {
            mo2889m(ghVar2);
            return false;
        }
        if (ghVar != null) {
            mo2889m(ghVar);
        }
        mo2889m(ghVar2);
        return false;
    }

    /* renamed from: h */
    public final boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4) {
        mo2889m(ghVar);
        return false;
    }

    /* renamed from: i */
    public final boolean mo2693i(C0673gh ghVar) {
        C108232bc bcVar;
        int h;
        if ((ghVar instanceof C108241bl) && (bcVar = ((C108241bl) ghVar).f301069S) != null && ((h = bcVar.mo95830h()) == 0 || h == 1 || h == 2 || h == 19 || h == 26)) {
            return super.mo2693i(ghVar);
        }
        mo2889m(ghVar);
        return false;
    }
}
