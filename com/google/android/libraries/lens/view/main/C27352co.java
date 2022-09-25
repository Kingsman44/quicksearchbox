package com.google.android.libraries.lens.view.main;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.translation.C26201n;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27134aj;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.main.co */
/* compiled from: PG */
public final /* synthetic */ class C27352co implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74844a;

    public /* synthetic */ C27352co(C27384dt dtVar) {
        this.f74844a = dtVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26201n nVar = (C26201n) obj;
        C26980p pVar = this.f74844a.f75005y;
        C58485gu l = pVar.mo32436b().mo32423l();
        int size = l.size();
        int i = 0;
        while (i < size) {
            C27129ae aeVar = (C27129ae) l.get(i);
            if (!(aeVar instanceof C27134aj) || ((C27134aj) aeVar).f74144a != 2) {
                i++;
            } else {
                pVar.mo32446n(2);
                return;
            }
        }
    }
}
