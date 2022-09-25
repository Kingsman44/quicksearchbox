package com.google.android.libraries.onegoogle.owners.mdi;

import com.google.android.gms.common.api.C143842n;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.n */
/* compiled from: PG */
public final /* synthetic */ class C30999n implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C30999n f83496a = new C30999n();

    private /* synthetic */ C30999n() {
    }

    public final C60870cx apply(Object obj) {
        C143842n nVar = (C143842n) obj;
        if (nVar.f389919a.f389621g == 17) {
            return C60856cj.m92899h(new MdiNotAvailableException.ApiNotConnectedException());
        }
        return C60856cj.m92899h(nVar);
    }
}
