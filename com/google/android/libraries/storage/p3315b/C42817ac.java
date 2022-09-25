package com.google.android.libraries.storage.p3315b;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.C60845bz;
import java.io.File;

/* renamed from: com.google.android.libraries.storage.b.ac */
/* compiled from: PG */
final class C42817ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42823ai f112082a;

    public C42817ac(C42823ai aiVar) {
        this.f112082a = aiVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!new File(((SQLiteDatabase) obj).getPath()).exists()) {
            synchronized (this.f112082a.f112094k) {
                this.f112082a.mo45901e();
            }
        }
    }
}
