package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.widget.ImageView;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.n */
/* compiled from: PG */
final class C109240n implements C22868d {

    /* renamed from: a */
    final /* synthetic */ ImageView f304184a;

    /* renamed from: b */
    final /* synthetic */ C109243q f304185b;

    public C109240n(C109243q qVar, ImageView imageView) {
        this.f304185b = qVar;
        this.f304184a = imageView;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109243q.f304191a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HqController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24598)).mo56386p("#updatesCenter Failed to read Updates Center first access data with error");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || !((Boolean) axVar.mo56107c()).booleanValue()) {
            C109243q qVar = this.f304185b;
            qVar.mo97702g(this.f304184a, qVar.mo97700a(true));
            return;
        }
        C109243q qVar2 = this.f304185b;
        qVar2.mo97702g(this.f304184a, qVar2.mo97700a(false));
    }
}
