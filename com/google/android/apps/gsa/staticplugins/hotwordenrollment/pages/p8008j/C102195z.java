package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.z */
/* compiled from: PG */
final class C102195z implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C102128aa f285104a;

    public C102195z(C102128aa aaVar) {
        this.f285104a = aaVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        if (((Optional) this.f285104a.f284916e.get()).isPresent()) {
            ((C59052c) ((C59052c) C102128aa.f284912a.mo56224b()).mo56372aa(20576)).mo56386p("loadData: CacheHit");
            return new C46463o(new C60817ay(C60856cj.m92900i(C46688af.m83205b((Boolean) ((Optional) this.f285104a.f284916e.get()).get(), Long.MAX_VALUE))));
        }
        ((C59052c) ((C59052c) C102128aa.f284912a.mo56224b()).mo56372aa(20575)).mo56386p("loadData: CacheMiss");
        return new C46463o(new C60817ay(C60856cj.m92900i(C46688af.f121976a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C102128aa aaVar = this.f285104a;
        return C47633f.m84733g(aaVar.f284914c.mo77693b(aaVar.f284917f)).mo51515h(new C102194y(this), this.f285104a.f284915d);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return C102128aa.f284913b;
    }
}
