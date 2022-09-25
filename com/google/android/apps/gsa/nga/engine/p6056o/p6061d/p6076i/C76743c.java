package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82892eh;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82893ei;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122547c;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;
import p5488io.grpc.C70761fa;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.i.c */
/* compiled from: PG */
final class C76743c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f212089a;

    /* renamed from: b */
    final /* synthetic */ Optional f212090b;

    /* renamed from: c */
    final /* synthetic */ C76745e f212091c;

    public C76743c(C76745e eVar, String str, Optional optional) {
        this.f212091c = eVar;
        this.f212089a = str;
        this.f212090b = optional;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C76744d dVar;
        C58974d dVar2 = C76745e.f212096a;
        if (th instanceof CancellationException) {
            dVar = new C76744d("CANCELLED", false);
        } else if (th instanceof C70761fa) {
            dVar = C76745e.m123361b(((C70761fa) th).f188571a);
        } else if (th instanceof StatusException) {
            dVar = C76745e.m123361b(((StatusException) th).f186943a);
        } else if (th instanceof C122547c) {
            C122547c cVar = (C122547c) th;
            dVar = C76745e.m123362c("FulfillmentFailed_".concat(String.valueOf(cVar.f339673a)), cVar.f339674b);
        } else {
            dVar = th instanceof SecurityException ? new C76744d(C76745e.m123363d(th), C58837ba.m90858g(th.getMessage())) : new C76744d(C76745e.m123363d(th), true);
        }
        if (dVar.f212095d) {
            ((C58970a) ((C58970a) ((C58970a) C76745e.f212096a.mo56226d()).mo56382g(th)).mo56372aa(3646)).mo56354G("Failure in source %s utterance %s", this.f212089a, this.f212090b.map(C76742b.f212088a).orElse(BuildConfig.FLAVOR));
        }
        this.f212091c.mo72317e(dVar, this.f212089a);
        C76745e eVar = this.f212091c;
        String str = this.f212089a;
        Optional optional = this.f212090b;
        if (dVar.f212095d && !optional.isEmpty()) {
            C83334w wVar = eVar.f212098b;
            C82887ec ecVar = C82887ec.ONDEVICE_FULFILLMENT_ERROR_EVENT;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82892eh ehVar = (C82892eh) C82893ei.f226110e.createBuilder();
            String str2 = dVar.f212093b + ":" + dVar.f212094c;
            ehVar.copyOnWrite();
            C82893ei eiVar = (C82893ei) ehVar.instance;
            eiVar.f226112a = 1 | eiVar.f226112a;
            eiVar.f226113b = str2;
            ehVar.copyOnWrite();
            C82893ei eiVar2 = (C82893ei) ehVar.instance;
            eiVar2.f226112a |= 2;
            eiVar2.f226114c = str;
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            C82893ei eiVar3 = (C82893ei) ehVar.build();
            eiVar3.getClass();
            eaVar.f225980b = eiVar3;
            eaVar.f225979a = 113;
            wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), (C83320io) optional.get());
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f212091c.mo72317e(C76744d.f212092a, this.f212089a);
    }
}
