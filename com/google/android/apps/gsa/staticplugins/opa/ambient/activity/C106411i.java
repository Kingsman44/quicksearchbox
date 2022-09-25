package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import java.lang.ref.WeakReference;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.i */
/* compiled from: PG */
public final /* synthetic */ class C106411i implements Function {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f296838a;

    /* renamed from: b */
    public final /* synthetic */ C60888db f296839b;

    public /* synthetic */ C106411i(WeakReference weakReference, C60888db dbVar) {
        this.f296838a = weakReference;
        this.f296839b = dbVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        WeakReference weakReference = this.f296838a;
        C60888db dbVar = this.f296839b;
        C106740b bVar = (C106740b) obj;
        Fragment fragment = (Fragment) weakReference.get();
        if ((fragment != null ? fragment.getActivity() : null) == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        C106734a aVar = C106734a.FULL;
        return C60846c.m92878g(bVar.mo95633b(), RuntimeException.class, C47810es.m84963c(new C106412j(bVar)), dbVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
