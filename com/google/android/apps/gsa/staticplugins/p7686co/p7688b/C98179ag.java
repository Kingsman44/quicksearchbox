package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C98179ag implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C98179ag f274155a = new C98179ag();

    private /* synthetic */ C98179ag() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118314e eVar = (C118314e) obj;
        C59071e eVar2 = C98211bl.f274214e;
        try {
            C58480gp e = C58485gu.m89837e();
            while (eVar.hasNext()) {
                C118332u uVar = (C118332u) eVar.next();
                if (uVar.mo103670a()) {
                    e.mo55395g(uVar.mo103671b());
                }
            }
            C58485gu f = e.mo55394f();
            if (eVar != null) {
                eVar.mo91755c().mo91751b();
            }
            return f;
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.mo91755c().mo91751b();
            }
            throw th;
        }
    }
}
