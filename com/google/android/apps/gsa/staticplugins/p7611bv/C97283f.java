package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.f */
/* compiled from: PG */
public final /* synthetic */ class C97283f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97285h f271697a;

    /* renamed from: b */
    public final /* synthetic */ String f271698b;

    public /* synthetic */ C97283f(C97285h hVar, String str) {
        this.f271697a = hVar;
        this.f271698b = str;
    }

    public final C60870cx apply(Object obj) {
        C97285h hVar = this.f271697a;
        C118826c cVar = (C118826c) obj;
        Callable callable = (Callable) hVar.f271700a.f271709c.mo124097c().get(this.f271698b);
        callable.getClass();
        return C118826c.m197213c((C60870cx) callable.call());
    }
}
