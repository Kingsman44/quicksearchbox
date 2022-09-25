package com.google.android.apps.gsa.search.core.state;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.state.p6872d.C86941bh;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.du */
/* compiled from: PG */
public final class C86995du implements C87143ik {

    /* renamed from: a */
    private final C86941bh f234978a;

    /* renamed from: b */
    private final C68214a f234979b;

    public C86995du(C86941bh bhVar, C68214a aVar) {
        this.f234978a = bhVar;
        this.f234979b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234978a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C86948bo) this.f234979b.mo27525b()).f235452J)) {
            C86941bh bhVar = this.f234978a;
            C86948bo boVar = (C86948bo) this.f234979b.mo27525b();
            Intent q = boVar.mo80598q("com.google.android.search.core.action.NOTIFICATION_DISMISSED");
            boolean z = false;
            if (q != null) {
                int intExtra = q.getIntExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 0);
                if (intExtra == 2) {
                    bhVar.f234821f = bhVar.f234817b.mo78575s(1);
                } else if (intExtra == 16) {
                    bhVar.f234819d = bhVar.f234817b.mo78575s(3);
                } else if (intExtra == 32) {
                    bhVar.f234820e = bhVar.f234817b.mo78575s(5);
                } else if (intExtra == 128) {
                    bhVar.f234822g = bhVar.f234817b.mo78575s(6);
                }
                z = true;
            }
            Intent q2 = boVar.mo80598q("com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED");
            if (q2 != null) {
                bhVar.f234818c.mo78605A(q2);
            }
            Intent q3 = boVar.mo80598q("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED");
            if (q3 != null) {
                bhVar.f234818c.mo78606B(q3);
            }
            Intent q4 = boVar.mo80598q("com.google.android.search.core.action.OPA_PROACTIVE_NOTIFICATION_TAPPED");
            if (q4 != null) {
                bhVar.f234818c.mo78608D(q4);
            }
            Intent q5 = boVar.mo80598q("com.google.android.search.core.action.OPA_PROACTIVE_NOTIFICATION_DISMISSED");
            if (q5 != null) {
                bhVar.f234818c.mo78607C(q5);
            }
            Intent q6 = boVar.mo80598q("com.google.android.search.core.action.OPA_NOTIFICATION_ACTION_PRESSED");
            if (q6 != null) {
                bhVar.f234818c.mo78634s(q6);
            }
            bhVar.mo80596e(boVar);
            if (z) {
                this.f234978a.mo80591ar();
            }
        }
    }
}
