package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14730a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.common.util.concurrent.C60870cx;
import java.util.LinkedHashMap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ab */
/* compiled from: PG */
public final /* synthetic */ class C14787ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14219bc f44561a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f44562b;

    public /* synthetic */ C14787ab(C14219bc bcVar, C60870cx cxVar) {
        this.f44561a = bcVar;
        this.f44562b = cxVar;
    }

    public final void accept(Object obj) {
        C14219bc bcVar = this.f44561a;
        C60870cx cxVar = this.f44562b;
        C14730a aVar = (C14730a) obj;
        if (aVar.f44520c == null) {
            aVar.f44520c = new LinkedHashMap();
        }
        aVar.f44520c.put(bcVar, cxVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
