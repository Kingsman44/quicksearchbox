package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.ae */
/* compiled from: PG */
final class C17754ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f50987a;

    /* renamed from: b */
    final /* synthetic */ C31520m f50988b;

    /* renamed from: c */
    final /* synthetic */ C48915q f50989c;

    public C17754ae(String str, C31520m mVar, C48915q qVar) {
        this.f50987a = str;
        this.f50988b = mVar;
        this.f50989c = qVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C17755af.f50990a.mo56225c()).mo56382g(th)).mo56372aa(47004)).mo56389s("Remove request failure: %s.", this.f50987a);
        C48919u uVar = this.f50989c.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        if ((uVar.f126588a & 1) != 0) {
            C31167ax a = C31167ax.m58112a();
            C31520m mVar = this.f50988b;
            C31164au b = C31164au.m58092b("ContextTriggerTng_Remove_");
            C31164au[] auVarArr = new C31164au[1];
            C48919u uVar2 = this.f50989c.f126577b;
            if (uVar2 == null) {
                uVar2 = C48919u.f126586g;
            }
            C48900b a2 = C48900b.m85301a(uVar2.f126589b);
            if (a2 == null) {
                a2 = C48900b.UNSPECIFIED;
            }
            auVarArr[0] = C31164au.m58093c((String) null, a2);
            a.mo36918j(mVar, C31164au.m58091a(b, auVarArr), 3);
            return;
        }
        C31167ax.m58112a().mo36918j(this.f50988b, C31164au.m58091a(C31164au.m58092b("ContextTriggerTng_Remove_"), C31164au.m58092b("noClient")), 3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C17755af.f50990a.mo56224b()).mo56372aa(47005)).mo56389s("Remove request success: %s.", this.f50987a);
        C31167ax a = C31167ax.m58112a();
        C31520m mVar = this.f50988b;
        C31164au b = C31164au.m58092b("ContextTriggerTng_Remove_");
        C31164au[] auVarArr = new C31164au[1];
        C48919u uVar = this.f50989c.f126577b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a2 = C48900b.m85301a(uVar.f126589b);
        if (a2 == null) {
            a2 = C48900b.UNSPECIFIED;
        }
        auVarArr[0] = C31164au.m58093c((String) null, a2);
        a.mo36918j(mVar, C31164au.m58091a(b, auVarArr), 2);
    }
}
