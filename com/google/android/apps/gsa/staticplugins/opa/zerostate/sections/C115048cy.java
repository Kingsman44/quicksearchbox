package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.common.base.C58881cr;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cy */
/* compiled from: PG */
public final /* synthetic */ class C115048cy implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ List f319363a;

    public /* synthetic */ C115048cy(List list) {
        this.f319363a = list;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        return (Map) Collection.EL.stream(this.f319363a).collect(Collectors.toMap(C115047cx.f319362a, Function.CC.identity()));
    }
}
