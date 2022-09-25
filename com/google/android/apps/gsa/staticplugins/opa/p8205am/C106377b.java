package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.b */
/* compiled from: PG */
public final /* synthetic */ class C106377b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f296729a;

    public /* synthetic */ C106377b(boolean z) {
        this.f296729a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f296729a;
        a builder = ((d) obj).toBuilder();
        builder.copyOnWrite();
        d dVar = builder.instance;
        dVar.a |= 4;
        dVar.e = z;
        return builder.build();
    }
}
