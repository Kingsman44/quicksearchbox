package com.google.firebase.iid;

import com.google.android.gms.common.util.p10784a.C143999b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.b */
/* compiled from: PG */
final class C61210b {

    /* renamed from: a */
    public static final Executor f165579a = C61207a.f165578a;

    /* renamed from: a */
    static ExecutorService m93602a() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C143999b("firebase-iid-executor"));
    }
}
