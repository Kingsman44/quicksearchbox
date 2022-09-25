package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14730a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import java.util.ArrayList;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ac */
/* compiled from: PG */
public final /* synthetic */ class C14788ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14219bc f44563a;

    public /* synthetic */ C14788ac(C14219bc bcVar) {
        this.f44563a = bcVar;
    }

    public final void accept(Object obj) {
        C14219bc bcVar = this.f44563a;
        C14730a aVar = (C14730a) obj;
        if (aVar.f44518a == null) {
            aVar.f44518a = new ArrayList();
        }
        aVar.f44518a.add(bcVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
