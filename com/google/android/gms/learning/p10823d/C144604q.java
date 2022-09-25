package com.google.android.gms.learning.p10823d;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.gms.learning.d.q */
/* compiled from: PG */
public final /* synthetic */ class C144604q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391295a;

    public /* synthetic */ C144604q(C144588ad adVar) {
        this.f391295a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C144588ad adVar = this.f391295a;
        IOException iOException = (IOException) obj;
        C144588ad.f391247d.mo34868j(iOException, "Failed to read from or write to disk");
        adVar.f391251g.mo120056h(1161);
        throw iOException;
    }
}
