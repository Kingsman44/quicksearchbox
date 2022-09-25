package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import java.io.FileNotFoundException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.af */
/* compiled from: PG */
public final /* synthetic */ class C78672af implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78674ah f216586a;

    public /* synthetic */ C78672af(C78674ah ahVar) {
        this.f216586a = ahVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78674ah ahVar = this.f216586a;
        C58495hd a = cu.a((C29690f) obj);
        if (!a.containsKey("on_device_tactile_config")) {
            return C60856cj.m92899h(new FileNotFoundException("Could not find file with id: on_device_tactile_config"));
        }
        return ahVar.f216590b.mo28201a("[NGA] TactileResourcesManager.onResourceGroupUpdate", new C78673ag(ahVar, a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
