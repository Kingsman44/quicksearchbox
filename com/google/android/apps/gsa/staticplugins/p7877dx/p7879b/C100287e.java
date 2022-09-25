package com.google.android.apps.gsa.staticplugins.p7877dx.p7879b;

import com.google.common.base.C58817ah;
import com.google.p375ai.p378b.C7741if;
import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.b.e */
/* compiled from: PG */
public final /* synthetic */ class C100287e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100295m f280448a;

    /* renamed from: b */
    public final /* synthetic */ C7744ii f280449b;

    public /* synthetic */ C100287e(C100295m mVar, C7744ii iiVar) {
        this.f280448a = mVar;
        this.f280449b = iiVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C100295m mVar = this.f280448a;
        Double d = (Double) obj;
        C7741if ifVar = this.f280449b.f27068n;
        if (ifVar == null) {
            ifVar = C7741if.f27048b;
        }
        if (((double) ifVar.f27050a) >= d.doubleValue()) {
            z = true;
            mVar.mo91867f(true);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
