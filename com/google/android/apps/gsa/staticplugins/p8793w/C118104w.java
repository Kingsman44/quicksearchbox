package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.w */
/* compiled from: PG */
public final /* synthetic */ class C118104w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C117724al f327741a;

    /* renamed from: b */
    public final /* synthetic */ C88244um f327742b;

    /* renamed from: c */
    public final /* synthetic */ ServiceEventData f327743c;

    public /* synthetic */ C118104w(C117724al alVar, C88244um umVar, ServiceEventData serviceEventData) {
        this.f327741a = alVar;
        this.f327742b = umVar;
        this.f327743c = serviceEventData;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z;
        C117724al alVar = this.f327741a;
        C88244um umVar = this.f327742b;
        ServiceEventData serviceEventData = this.f327743c;
        if (!((Boolean) obj).booleanValue() || umVar != C88244um.START_ACTIVITY) {
            z = false;
        } else {
            alVar.f326749b.mo28212l("#startActivity", new C118093l(alVar, serviceEventData));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
