package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7752iq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C98183ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274161a;

    /* renamed from: b */
    public final /* synthetic */ C7752iq f274162b;

    public /* synthetic */ C98183ak(C98211bl blVar, C7752iq iqVar) {
        this.f274161a = blVar;
        this.f274162b = iqVar;
    }

    public final C60870cx apply(Object obj) {
        C98211bl blVar = this.f274161a;
        C7752iq iqVar = this.f274162b;
        if (((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        C58485gu n = C58485gu.m89846n(iqVar);
        ArrayList arrayList = new ArrayList();
        int i = ((C58724pq) n).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C7752iq) C98211bl.m162656x((C7752iq) n.get(i2)).build());
        }
        return C118826c.m197213c(blVar.mo91028u(true, arrayList));
    }
}
