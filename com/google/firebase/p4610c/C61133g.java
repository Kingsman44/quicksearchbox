package com.google.firebase.p4610c;

import android.content.Context;
import androidx.core.p094f.C1902o;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.firebase.p4611d.C61174a;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.c.g */
/* compiled from: PG */
public final class C61133g implements C61136j, C61137k {

    /* renamed from: c */
    private static final ThreadFactory f165454c = C61128b.f165448a;

    /* renamed from: a */
    public final C61174a f165455a;

    /* renamed from: b */
    public final C61174a f165456b;

    /* renamed from: d */
    private final Context f165457d;

    /* renamed from: e */
    private final Set f165458e;

    /* renamed from: f */
    private final Executor f165459f;

    public C61133g(Context context, String str, Set set, C61174a aVar) {
        C61132f fVar = new C61132f(context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f165454c);
        this.f165455a = fVar;
        this.f165458e = set;
        this.f165459f = threadPoolExecutor;
        this.f165456b = aVar;
        this.f165457d = context;
    }

    /* renamed from: a */
    public final C146006ab mo57698a() {
        if (!C1902o.m5170a(this.f165457d)) {
            return C146021aq.m237850d(BuildConfig.FLAVOR);
        }
        return C146021aq.m237847a(this.f165459f, new C61129c(this));
    }

    /* renamed from: b */
    public final synchronized int mo57699b() {
        long currentTimeMillis = System.currentTimeMillis();
        C61138l lVar = (C61138l) this.f165455a.mo57687a();
        if (!lVar.mo57707g(currentTimeMillis)) {
            return 1;
        }
        lVar.mo57703c();
        return 3;
    }

    /* renamed from: c */
    public final void mo57700c() {
        if (this.f165458e.size() <= 0) {
            C146021aq.m237850d((Object) null);
        } else if (!C1902o.m5170a(this.f165457d)) {
            C146021aq.m237850d((Object) null);
        } else {
            C146021aq.m237847a(this.f165459f, new C61130d(this));
        }
    }
}
