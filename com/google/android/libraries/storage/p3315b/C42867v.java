package com.google.android.libraries.storage.p3315b;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.storage.b.v */
/* compiled from: PG */
public final /* synthetic */ class C42867v implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C42823ai f112170a;

    public /* synthetic */ C42867v(C42823ai aiVar) {
        this.f112170a = aiVar;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C42862q qVar;
        C42823ai aiVar = this.f112170a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Executor executor = aiVar.f112095l;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            qVar = new C42862q(sQLiteDatabase, aiVar.f112086c, executor, aiVar.f112100q);
        } else {
            qVar = new C42862q(sQLiteDatabase, executor, executor, aiVar.f112100q);
        }
        C60870cx i = C60856cj.m92900i(qVar);
        Objects.requireNonNull(qVar);
        return C42823ai.m75658b(i, new C42871z(qVar));
    }
}
