package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49890cu;
import com.google.assistant.p3861at.C49891cv;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ag */
/* compiled from: PG */
public final /* synthetic */ class C10103ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10107ak f34399a;

    public /* synthetic */ C10103ag(C10107ak akVar) {
        this.f34399a = akVar;
    }

    public final void run() {
        C10107ak akVar = this.f34399a;
        akVar.f34408f = akVar.mo18246b();
        akVar.f34413k.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        akVar.f34410h.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        akVar.f34411i.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        akVar.f34412j.q().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        C49891cv cvVar = akVar.f34408f.f129639j;
        if (cvVar == null) {
            cvVar = C49891cv.f129647N;
        }
        int a = C49886cq.m85760a(cvVar.f129666d);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        boolean z2 = a == 2 || a == 4;
        C49891cv cvVar2 = akVar.f34408f.f129639j;
        boolean z3 = (cvVar2 == null ? C49891cv.f129647N : cvVar2).f129655F;
        int a2 = C49890cu.m85762a((cvVar2 == null ? C49891cv.f129647N : cvVar2).f129667e);
        if (a2 == 0) {
            a2 = 1;
        }
        boolean z4 = a2 == 3 || a2 == 4;
        if (cvVar2 == null) {
            cvVar2 = C49891cv.f129647N;
        }
        boolean z5 = cvVar2.f129673k;
        int i = 8;
        akVar.f34409g.setVisibility((!z3 || !z2) ? 8 : 0);
        akVar.f34413k.t().setChecked(z2);
        akVar.f34410h.setChecked(z4);
        akVar.f34411i.setChecked(!z4);
        ItemView itemView = akVar.f34412j;
        if (z5 && z4) {
            i = 0;
        }
        itemView.setVisibility(i);
        CheckBox q = akVar.f34412j.q();
        if (a2 != 3) {
            z = false;
        }
        q.setChecked(z);
        akVar.f34410h.setOnCheckedChangeListener(new C10104ah(akVar));
        akVar.f34411i.setOnCheckedChangeListener(new C10104ah(akVar));
        akVar.f34413k.t().setOnCheckedChangeListener(new C10105ai(akVar));
        akVar.f34412j.q().setOnCheckedChangeListener(new C10104ah(akVar));
    }
}
