package com.google.android.libraries.search.assistant.p2513e.p2514a;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46423aj;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.a.f */
/* compiled from: PG */
public final class C32569f {

    /* renamed from: a */
    public final Context f87215a;

    /* renamed from: b */
    public final C46423aj f87216b;

    /* renamed from: c */
    private final Executor f87217c;

    public C32569f(Context context, Executor executor) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "backgroundExecutor");
        this.f87215a = context;
        this.f87217c = executor;
        this.f87216b = new C46423aj(new C32568e(this), executor);
    }
}
