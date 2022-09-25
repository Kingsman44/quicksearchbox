package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.anf;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.apps.search.googleapp.customtabs.features.appactions.p10158a.C133781f;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133731q;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133733s;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133734t;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62910ar;
import dagger.p5294a.C68225k;
import java.util.concurrent.ScheduledExecutorService;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69092m;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.r */
/* compiled from: PG */
public final /* synthetic */ class C133799r implements C133733s {

    /* renamed from: a */
    public final /* synthetic */ anf f364442a;

    public /* synthetic */ C133799r(anf anf) {
        this.f364442a = anf;
    }

    /* renamed from: a */
    public final C133734t mo111365a(C133731q qVar) {
        anf anf = this.f364442a;
        C62910ar arVar = (C62910ar) ((C46897i) new C69092m(anf.f198000a.b.f198009I).f185293a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45374951").mo50905d();
        C68225k.m98532d(arVar);
        boolean f = ((C46897i) new C69092m(anf.f198000a.b.f198009I).f185293a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45378567").mo50907f();
        anh anh = anf.f198000a.b;
        return new C133798q(arVar, f, new C133781f((Context) anh.f198133c.g.mo17428b(), (AccountId) anh.f198239e.mo17428b(), anh.mo66071bQ(), (C47449e) anh.f198133c.gH.mo17428b(), (C60887da) anh.f198133c.n.mo17428b()), (ScheduledExecutorService) anf.f198000a.a.n.mo17428b(), (C38768q) anf.f198000a.b.f198016P.mo17428b(), anf.f198000a.b.mo66068bN(), qVar);
    }
}
