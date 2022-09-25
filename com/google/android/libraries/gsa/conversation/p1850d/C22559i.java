package com.google.android.libraries.gsa.conversation.p1850d;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.gsa.conversation.p1838b.C22348b;
import com.google.android.libraries.gsa.conversation.p1838b.C22350d;
import com.google.android.libraries.gsa.conversation.p1838b.C22352f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.gsa.conversation.d.i */
/* compiled from: PG */
public final class C22559i implements C22348b {

    /* renamed from: a */
    public static final C59071e f62180a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.d.i");

    /* renamed from: b */
    public static final long f62181b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: c */
    public static final long f62182c = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: d */
    public final Context f62183d;

    /* renamed from: e */
    public final Handler f62184e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public final AtomicBoolean f62185f;

    /* renamed from: g */
    public final C21370a f62186g;

    /* renamed from: h */
    public C58833ax f62187h;

    /* renamed from: i */
    public C58833ax f62188i;

    /* renamed from: j */
    public final C22352f f62189j;

    /* renamed from: k */
    public final C22352f f62190k;

    public C22559i(Context context, C21370a aVar) {
        this.f62183d = context;
        this.f62186g = aVar;
        this.f62185f = new AtomicBoolean(false);
        this.f62189j = new C22352f();
        this.f62190k = new C22352f();
        C58836b bVar = C58836b.f156633a;
        this.f62187h = bVar;
        this.f62188i = bVar;
    }

    /* renamed from: a */
    public final void mo27576a(C22350d dVar) {
        dVar.mo27580c("JavascriptRunner");
        dVar.mo27579b("Initialized", Boolean.valueOf(this.f62185f.get()));
        dVar.mo27579b("Init latency", this.f62189j.mo27582a().mo27581d());
        dVar.mo27579b("Eval latency", this.f62190k.mo27582a().mo27581d());
    }

    /* renamed from: b */
    public final void mo27649b(SettableFuture settableFuture, long j, String str) {
        this.f62184e.postDelayed(new C22552b(settableFuture, str, j), j);
    }
}
