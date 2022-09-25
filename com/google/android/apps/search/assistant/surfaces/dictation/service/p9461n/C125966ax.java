package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ax */
/* compiled from: PG */
public final /* synthetic */ class C125966ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126160x f347186a;

    /* renamed from: b */
    public final /* synthetic */ Supplier f347187b;

    public /* synthetic */ C125966ax(C126160x xVar, Supplier supplier) {
        this.f347186a = xVar;
        this.f347187b = supplier;
    }

    public final C60870cx apply(Object obj) {
        C126160x xVar = this.f347186a;
        Supplier supplier = this.f347187b;
        Optional optional = (Optional) obj;
        C59071e eVar = C126038bc.f347355a;
        return optional.isPresent() ? C60856cj.m92900i(optional) : C126038bc.m206092d(xVar, supplier);
    }
}
