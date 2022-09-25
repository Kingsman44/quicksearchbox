package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import java.util.Collections;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ge */
/* compiled from: PG */
public final /* synthetic */ class C112576ge implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f312169a;

    public /* synthetic */ C112576ge(StringBuilder sb) {
        this.f312169a = sb;
    }

    public final void accept(Object obj, Object obj2) {
        StringBuilder sb = this.f312169a;
        int i = C112585gn.f312180a;
        sb.append(((C112142i) obj).name());
        sb.append(": [");
        Map.EL.forEach(Collections.unmodifiableMap(((C112144k) obj2).f311416a), new C112584gm(sb));
        sb.append("]; ");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
