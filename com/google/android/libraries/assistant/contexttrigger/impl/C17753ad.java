package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.ad */
/* compiled from: PG */
final class C17753ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f50984a;

    /* renamed from: b */
    final /* synthetic */ C31520m f50985b;

    /* renamed from: c */
    final /* synthetic */ C48917s f50986c;

    public C17753ad(String str, C31520m mVar, C48917s sVar) {
        this.f50984a = str;
        this.f50985b = mVar;
        this.f50986c = sVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C17755af.f50990a.mo56225c()).mo56382g(th)).mo56372aa(47002)).mo56389s("Update request failure: %s.", this.f50984a);
        C48919u uVar = this.f50986c.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        if ((uVar.f126588a & 1) == 0) {
            C31167ax a = C31167ax.m58112a();
            C31520m mVar = this.f50985b;
            C31164au b = C31164au.m58092b("ContextTriggerTng_Update_");
            C31164au[] auVarArr = new C31164au[1];
            C48919u uVar2 = this.f50986c.f126581b;
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
        C31167ax.m58112a().mo36918j(this.f50985b, C31164au.m58091a(C31164au.m58092b("ContextTriggerTng_Update_"), C31164au.m58092b("noClient")), 3);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C17755af.f50990a.mo56224b()).mo56372aa(47003)).mo56389s("Update request success: %s.", this.f50984a);
        C31167ax a = C31167ax.m58112a();
        C31520m mVar = this.f50985b;
        C31164au b = C31164au.m58092b("ContextTriggerTng_Update_");
        C31164au[] auVarArr = new C31164au[1];
        C48919u uVar = this.f50986c.f126581b;
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
