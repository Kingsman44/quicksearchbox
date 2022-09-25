package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.ah */
/* compiled from: PG */
public final /* synthetic */ class C100129ah implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280005a;

    /* renamed from: b */
    public final /* synthetic */ long f280006b;

    /* renamed from: c */
    public final /* synthetic */ C118831d f280007c;

    public /* synthetic */ C100129ah(C100125ad adVar, C118831d dVar, long j) {
        this.f280005a = adVar;
        this.f280007c = dVar;
        this.f280006b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C100125ad adVar = this.f280005a;
        C118831d dVar = this.f280007c;
        long j = this.f280006b;
        SQLiteDatabase a = adVar.mo91757a();
        C118837d.m197249c(dVar, j);
        return Boolean.valueOf(a != null);
    }
}
