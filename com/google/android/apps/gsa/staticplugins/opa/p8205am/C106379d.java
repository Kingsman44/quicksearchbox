package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.d */
/* compiled from: PG */
public final /* synthetic */ class C106379d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106379d f296731a = new C106379d();

    private /* synthetic */ C106379d() {
    }

    public final Object apply(Object obj) {
        d dVar = (d) obj;
        a builder = dVar.toBuilder();
        int i = dVar.i;
        builder.copyOnWrite();
        d dVar2 = builder.instance;
        dVar2.a |= 32;
        dVar2.i = i + 1;
        return builder.build();
    }
}
