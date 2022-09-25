package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.content.Context;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.ai */
/* compiled from: PG */
public abstract class C100982ai {

    /* renamed from: a */
    public static final C59071e f282052a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.ipc.service.ai");

    /* renamed from: b */
    final Context f282053b;

    /* renamed from: c */
    final Executor f282054c;

    /* renamed from: d */
    final C19435g f282055d;

    public C100982ai(Context context, Executor executor, C19435g gVar) {
        this.f282053b = context;
        this.f282054c = new C60904dr(executor);
        this.f282055d = gVar;
    }

    /* renamed from: a */
    public abstract C60870cx mo92127a();

    /* renamed from: b */
    public abstract C60870cx mo92128b(InAppTrainerOptions inAppTrainerOptions);
}
