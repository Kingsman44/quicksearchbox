package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.p9394a.C124543a;
import com.google.android.p10712d.C142324bc;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bq */
/* compiled from: PG */
public final /* synthetic */ class C89478bq implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f242505a;

    /* renamed from: b */
    public final /* synthetic */ SQLiteDatabase f242506b;

    public /* synthetic */ C89478bq(String str, SQLiteDatabase sQLiteDatabase) {
        this.f242505a = str;
        this.f242506b = sQLiteDatabase;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f242505a;
        SQLiteDatabase sQLiteDatabase = this.f242506b;
        C89480bs bsVar = (C89480bs) obj;
        int i = C89484bw.f242512b;
        C142324bc b = C124543a.m204022b(bsVar.mo83346b(), str);
        C89484bw.m145623p(sQLiteDatabase, bsVar.mo83348d(), str, bsVar.mo83345a(), b);
        sQLiteDatabase.setTransactionSuccessful();
        return b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
