package com.google.android.apps.gsa.opa.p6435c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3745ab.C48269bz;
import com.google.assistant.p3745ab.C48273ca;

/* renamed from: com.google.android.apps.gsa.opa.c.f */
/* compiled from: PG */
public final /* synthetic */ class C83594f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C83600l f227901a;

    /* renamed from: b */
    public final /* synthetic */ long f227902b;

    public /* synthetic */ C83594f(C83600l lVar, long j) {
        this.f227901a = lVar;
        this.f227902b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118826c cVar;
        C83600l lVar = this.f227901a;
        long j = this.f227902b;
        synchronized (lVar.f227909d) {
            lVar.mo76955b();
            C48269bz bzVar = (C48269bz) C48273ca.f124851d.createBuilder();
            float f = (float) j;
            bzVar.copyOnWrite();
            C48273ca caVar = (C48273ca) bzVar.instance;
            caVar.f124853a |= 1;
            caVar.f124854b = f;
            bzVar.copyOnWrite();
            C48273ca caVar2 = (C48273ca) bzVar.instance;
            caVar2.f124853a |= 2;
            caVar2.f124855c = f;
            lVar.f227912g.mo27600a(4, (C48273ca) bzVar.build());
            cVar = C118826c.f331422a;
        }
        return cVar;
    }
}
