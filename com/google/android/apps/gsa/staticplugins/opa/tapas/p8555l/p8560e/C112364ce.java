package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ce */
/* compiled from: PG */
public final /* synthetic */ class C112364ce implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Map f311782a;

    /* renamed from: b */
    public final /* synthetic */ C48668ac f311783b;

    public /* synthetic */ C112364ce(Map map, C48668ac acVar) {
        this.f311782a = map;
        this.f311783b = acVar;
    }

    public final void accept(Object obj) {
        Map map = this.f311782a;
        C48668ac acVar = this.f311783b;
        C121537f fVar = C112365cf.f311784a;
        map.put(acVar.name(), (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
