package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.o */
/* compiled from: PG */
public final /* synthetic */ class C98339o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98321ac f274496a;

    public /* synthetic */ C98339o(C98321ac acVar) {
        this.f274496a = acVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98321ac acVar = this.f274496a;
        C118314e eVar = (C118314e) obj;
        C58480gp e = C58485gu.m89837e();
        while (eVar.hasNext()) {
            try {
                C118332u uVar = (C118332u) eVar.next();
                if (uVar.mo103670a()) {
                    e.mo55395g(acVar.mo91049a(uVar.mo103671b()));
                }
            } catch (IOException e2) {
                C59104x c = C98323ae.f274452a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NowContentStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(30613)).mo56386p("Exception while deserializing");
            } catch (Throwable th) {
                eVar.mo91755c().mo91751b();
                throw th;
            }
        }
        eVar.mo91755c().mo91751b();
        return e.mo55394f();
    }
}
