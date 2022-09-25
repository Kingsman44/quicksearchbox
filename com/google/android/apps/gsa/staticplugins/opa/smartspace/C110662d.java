package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.d */
/* compiled from: PG */
public final /* synthetic */ class C110662d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110664e f308353a;

    /* renamed from: b */
    public final /* synthetic */ int f308354b;

    /* renamed from: c */
    public final /* synthetic */ int f308355c;

    public /* synthetic */ C110662d(C110664e eVar, int i, int i2) {
        this.f308353a = eVar;
        this.f308354b = i;
        this.f308355c = i2;
    }

    public final C60870cx apply(Object obj) {
        C110664e eVar = this.f308353a;
        if (Collection.EL.stream((C58485gu) obj).anyMatch(new C110517b(this.f308354b, this.f308355c))) {
            eVar.mo98837e(false);
        } else {
            eVar.mo98837e(true);
        }
        return C118826c.f331423b;
    }
}
