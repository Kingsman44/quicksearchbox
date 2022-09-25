package com.google.android.libraries.assistant.trainingcache.p1617b;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.assistant.trainingcache.b.i */
/* compiled from: PG */
public final class C19437i {

    /* renamed from: a */
    public static final C59071e f54349a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.b.i");

    /* renamed from: b */
    private final Context f54350b;

    /* renamed from: c */
    private final C60888db f54351c;

    /* renamed from: d */
    private C19434f f54352d;

    public C19437i(Context context, C60888db dbVar) {
        this.f54350b = context;
        this.f54351c = dbVar;
    }

    /* renamed from: a */
    public final synchronized C19434f mo24626a() {
        if (this.f54352d == null) {
            C60888db dbVar = this.f54351c;
            Context context = this.f54350b;
            this.f54352d = new C19434f(dbVar, new C19566c(context, "STREAMZ_FEDASS", (String) null), (Application) context);
        }
        return this.f54352d;
    }

    /* renamed from: b */
    public final void mo24627b(int i) {
        ((C19567d) mo24626a().f54344f.mo6453a()).mo24822a(1, i != 2 ? "TNG_CACHE_EVENT_FROM_CLASSIC" : "CLASSIC_CACHE_EVENT");
    }
}
