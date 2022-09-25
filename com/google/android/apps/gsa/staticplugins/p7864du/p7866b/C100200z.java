package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.common.base.C58817ah;
import com.google.common.base.C58885cv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.z */
/* compiled from: PG */
final class C100200z implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ String f280230a;

    public C100200z(String str) {
        this.f280230a = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C118314e eVar = (C118314e) obj;
        try {
            if (eVar.mo91753a() == 1) {
                C118332u uVar = (C118332u) eVar.next();
                eVar.mo91755c().mo91751b();
                return uVar;
            }
        } catch (Exception e) {
            C59104x c = C100125ad.f279965a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SqliteContentStore");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33197)).mo56386p("Unexpected exception reading row data that should be there.");
        } catch (Throwable th) {
            eVar.mo91755c().mo91751b();
            throw th;
        }
        C118332u uVar2 = new C118332u(this.f280230a, new C58885cv((Object) null), C118332u.f328460a);
        eVar.mo91755c().mo91751b();
        return uVar2;
    }
}
