package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.util.Pair;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14730a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import java.util.ArrayList;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.z */
/* compiled from: PG */
public final /* synthetic */ class C14937z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14219bc f44885a;

    /* renamed from: b */
    public final /* synthetic */ C14221be f44886b;

    public /* synthetic */ C14937z(C14219bc bcVar, C14221be beVar) {
        this.f44885a = bcVar;
        this.f44886b = beVar;
    }

    public final void accept(Object obj) {
        C14219bc bcVar = this.f44885a;
        C14221be beVar = this.f44886b;
        C14730a aVar = (C14730a) obj;
        if (aVar.f44519b == null) {
            aVar.f44519b = new ArrayList();
        }
        aVar.f44519b.add(new Pair(bcVar, beVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
