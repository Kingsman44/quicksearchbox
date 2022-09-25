package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.widget.Button;
import androidx.viewpager.widget.C4277j;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.co */
/* compiled from: PG */
final class C96138co implements C4277j {

    /* renamed from: a */
    final /* synthetic */ C96139cp f269132a;

    public C96138co(C96139cp cpVar) {
        this.f269132a = cpVar;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        C96139cp cpVar = this.f269132a;
        if (i == ((C58724pq) ((C96140cq) cpVar.f269144m).f269150c).f156474d - 1 && !cpVar.f269141j) {
            Button a = cpVar.f269139h.mo77360a();
            a.setTextColor(this.f269132a.getContext().getResources().getColor(R.color.bisto_quantum_white_text));
            a.setBackgroundDrawable(this.f269132a.f269140i);
            this.f269132a.f269141j = true;
        }
    }
}
