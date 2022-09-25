package com.google.android.apps.search.fedora.metrics;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p1635au.C19566c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.fedora.metrics.h */
/* compiled from: PG */
public final class C133070h {

    /* renamed from: a */
    public static final C59071e f362826a = C59071e.m91332i("com.google.android.apps.search.fedora.metrics.h");

    /* renamed from: b */
    private final Context f362827b;

    /* renamed from: c */
    private final C60888db f362828c;

    /* renamed from: d */
    private final AtomicReference f362829d = new AtomicReference();

    public C133070h(Context context, C60888db dbVar) {
        this.f362827b = context;
        this.f362828c = dbVar;
    }

    /* renamed from: a */
    public final synchronized C133068f mo110962a() {
        C133068f fVar = (C133068f) this.f362829d.get();
        if (fVar != null) {
            return fVar;
        }
        C60888db dbVar = this.f362828c;
        Context context = this.f362827b;
        C133068f fVar2 = new C133068f(dbVar, new C19566c(context, "STREAMZ_FEDASS", (String) null), (Application) context);
        this.f362829d.set(fVar2);
        return fVar2;
    }
}
