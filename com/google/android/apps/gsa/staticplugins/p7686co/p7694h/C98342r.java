package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.r */
/* compiled from: PG */
public final /* synthetic */ class C98342r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98323ae f274499a;

    public /* synthetic */ C98342r(C98323ae aeVar) {
        this.f274499a = aeVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98323ae aeVar = this.f274499a;
        C118314e eVar = (C118314e) obj;
        C118316g c = aeVar.f274453b.mo91759c();
        while (eVar.hasNext()) {
            try {
                String str = ((C118332u) eVar.next()).f328461b;
                if (!C98325ag.m162880e(str)) {
                    C58976aa aaVar = C58975e.f156826a;
                    c.mo103661b(str);
                }
            } catch (Throwable th) {
                eVar.mo91755c().mo91751b();
                throw th;
            }
        }
        eVar.mo91755c().mo91751b();
        if (c.f328434b <= 0) {
            return C118826c.f331423b;
        }
        return C118826c.m197213c(aeVar.f274453b.mo91762h(c.mo103660a()));
    }
}
