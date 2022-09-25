package com.google.android.libraries.places.widget.internal.p2440a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146036p;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.p2437b.C31856l;
import com.google.android.libraries.places.widget.internal.common.C31915c;
import com.google.android.libraries.places.widget.internal.common.C31919g;
import com.google.android.libraries.places.widget.internal.common.C31920h;

/* renamed from: com.google.android.libraries.places.widget.internal.a.j */
/* compiled from: PG */
public final /* synthetic */ class C31908j implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C31912n f85796a;

    /* renamed from: b */
    public final /* synthetic */ AutocompletePrediction f85797b;

    public /* synthetic */ C31908j(C31912n nVar, AutocompletePrediction autocompletePrediction) {
        this.f85796a = nVar;
        this.f85797b = autocompletePrediction;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C31912n nVar = this.f85796a;
        AutocompletePrediction autocompletePrediction = this.f85797b;
        if (!((C146014aj) abVar).f394703b) {
            Exception f = abVar.mo122487f();
            if (f == null) {
                nVar.f85806b.f85857k = true;
                Place a = ((C31856l) abVar.mo122488g()).mo37413a();
                a.getClass();
                C31919g i = C31920h.m59473i(8);
                ((C31915c) i).f85837c = a;
                nVar.mo37653e(i.mo37677a());
                return;
            }
            nVar.f85806b.f85854h++;
            Status a2 = C31912n.m59429a(f);
            if (!C31912n.m59430f(a2)) {
                a2.getClass();
                C31919g i2 = C31920h.m59473i(9);
                C31915c cVar = (C31915c) i2;
                cVar.f85838d = autocompletePrediction;
                cVar.f85839e = a2;
                nVar.mo37653e(i2.mo37677a());
                return;
            }
            nVar.mo37653e(C31920h.m59472h(a2));
        }
    }
}
