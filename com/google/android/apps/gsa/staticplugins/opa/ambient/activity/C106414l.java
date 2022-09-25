package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60931s;
import java.lang.ref.WeakReference;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.l */
/* compiled from: PG */
public final /* synthetic */ class C106414l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f296843a;

    /* renamed from: b */
    public final /* synthetic */ C60888db f296844b;

    public /* synthetic */ C106414l(WeakReference weakReference, C60888db dbVar) {
        this.f296843a = weakReference;
        this.f296844b = dbVar;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream((List) obj).map(new C106411i(this.f296843a, this.f296844b)).collect(Collectors.toList()));
    }
}
