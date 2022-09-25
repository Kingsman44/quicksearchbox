package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.l */
/* compiled from: PG */
public final /* synthetic */ class C106387l implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106387l f296739a = new C106387l();

    private /* synthetic */ C106387l() {
    }

    public final Object apply(Object obj) {
        d dVar = (d) obj;
        Map unmodifiableMap = Collections.unmodifiableMap(dVar.b);
        a builder = dVar.toBuilder();
        builder.copyOnWrite();
        builder.instance.a().clear();
        Map.EL.forEach(unmodifiableMap, new C106376a(builder));
        return builder.build();
    }
}
