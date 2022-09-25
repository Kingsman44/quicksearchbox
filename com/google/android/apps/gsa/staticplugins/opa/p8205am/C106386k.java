package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.k */
/* compiled from: PG */
public final /* synthetic */ class C106386k implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106386k f296738a = new C106386k();

    private /* synthetic */ C106386k() {
    }

    public final Object apply(Object obj) {
        a builder = ((d) obj).toBuilder();
        int i = builder.instance.d;
        builder.copyOnWrite();
        d dVar = builder.instance;
        dVar.a |= 2;
        dVar.d = i + 1;
        return builder.build();
    }
}
