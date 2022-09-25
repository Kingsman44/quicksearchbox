package com.google.android.libraries.onegoogle.owners.mdi;

import com.google.android.gms.common.api.C143842n;
import com.google.android.libraries.onegoogle.common.C30926m;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.o */
/* compiled from: PG */
public final /* synthetic */ class C31000o implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C31000o f83497a = new C31000o();

    private /* synthetic */ C31000o() {
    }

    public final C60870cx apply(Object obj) {
        IOException iOException = (IOException) obj;
        C143842n nVar = (C143842n) C30926m.m57722b(iOException, C143842n.class);
        if (nVar == null || nVar.f389919a.f389621g != 10) {
            return C60856cj.m92899h(iOException);
        }
        return C60856cj.m92899h(new MdiNotAvailableException.DeveloperErrorException());
    }
}
