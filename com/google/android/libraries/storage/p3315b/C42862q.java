package com.google.android.libraries.storage.p3315b;

import android.database.sqlite.SQLiteDatabase;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.b.q */
/* compiled from: PG */
public final class C42862q {

    /* renamed from: a */
    public final SQLiteDatabase f112162a;

    /* renamed from: b */
    public final Executor f112163b;

    /* renamed from: c */
    public volatile boolean f112164c = false;

    /* renamed from: d */
    public final C42815aa f112165d;

    /* renamed from: e */
    private final Executor f112166e;

    public C42862q(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, C42815aa aaVar) {
        this.f112162a = sQLiteDatabase;
        this.f112163b = executor;
        this.f112166e = executor2;
        this.f112165d = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo45947a(C42844bc bcVar) {
        mo45948b();
        C42847bf bfVar = new C42847bf(this.f112162a);
        C47558bi a = C47831fm.m85006a("Transaction");
        try {
            C60871cy cyVar = new C60871cy(C47810es.m84978r(new C42860o(this, bcVar, bfVar)));
            this.f112166e.execute(cyVar);
            cyVar.f164961a.mo57297a(new C42857l(cyVar, bfVar), C60826bg.f164896a);
            a.mo51417a(cyVar);
            a.close();
            return cyVar;
        } catch (Throwable th) {
            C42853h.m75709a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo45948b() {
        if (this.f112164c) {
            throw new IllegalStateException("Already closed");
        }
    }
}
