package com.google.android.libraries.logging.p2182b.p2183a.p2184a;

import android.util.Log;
import com.google.android.gms.common.api.C143842n;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.logging.b.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C28268g implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C28268g f76933a = new C28268g();

    private /* synthetic */ C28268g() {
    }

    public final C60870cx apply(Object obj) {
        C143842n nVar = (C143842n) obj;
        int i = nVar.f389919a.f389621g;
        if (i == 17 || i == 31003) {
            if (Log.isLoggable("Logging.Clearcut", 3)) {
                Log.d("Logging.Clearcut", "Could not log data.", nVar);
            }
            return C60866ct.f164955a;
        }
        throw nVar;
    }
}
