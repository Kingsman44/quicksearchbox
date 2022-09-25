package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C100130ai implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280008a;

    /* renamed from: b */
    public final /* synthetic */ long f280009b;

    /* renamed from: c */
    public final /* synthetic */ C118831d f280010c;

    public /* synthetic */ C100130ai(C100125ad adVar, C118831d dVar, long j) {
        this.f280008a = adVar;
        this.f280010c = dVar;
        this.f280009b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C100125ad adVar = this.f280008a;
        C118831d dVar = this.f280010c;
        long j = this.f280009b;
        SQLiteDatabase b = adVar.mo91758b();
        C118837d.m197249c(dVar, j);
        return Boolean.valueOf(b != null);
    }
}
