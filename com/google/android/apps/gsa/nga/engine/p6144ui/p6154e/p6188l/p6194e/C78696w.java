package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import android.content.ComponentName;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.w */
/* compiled from: PG */
public final /* synthetic */ class C78696w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78669ac f216627a;

    public /* synthetic */ C78696w(C78669ac acVar) {
        this.f216627a = acVar;
    }

    public final void accept(Object obj) {
        C78669ac acVar = this.f216627a;
        ComponentName componentName = (ComponentName) obj;
        String packageName = componentName.getPackageName();
        acVar.copyOnWrite();
        C78670ad adVar = C78670ad.f216577h;
        packageName.getClass();
        ((C78670ad) acVar.instance).f216579a = packageName;
        String className = componentName.getClassName();
        acVar.copyOnWrite();
        className.getClass();
        ((C78670ad) acVar.instance).f216580b = className;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
