package com.google.android.gms.mdh.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.mdh.internal.a */
/* compiled from: PG */
public final class C145033a {

    /* renamed from: a */
    public final Executor f392055a;

    /* renamed from: b */
    public final Executor f392056b;

    /* renamed from: c */
    public final C145070u f392057c;

    /* renamed from: d */
    public final C145073x f392058d;

    public C145033a(Context context, Executor executor, Executor executor2) {
        this.f392055a = executor;
        this.f392056b = executor2;
        this.f392057c = new C145070u(context);
        this.f392058d = new C145073x(context);
    }
}
