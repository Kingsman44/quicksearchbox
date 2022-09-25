package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.p10712d.C142330bi;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bj */
/* compiled from: PG */
final class C96106bj extends C96134ck {

    /* renamed from: a */
    final /* synthetic */ C96109bm f269058a;

    public C96106bj(C96109bm bmVar) {
        this.f269058a = bmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C58485gu mo89961a() {
        C142330bi biVar = this.f269058a.f269078n.f269538a.f269047b.f386132r;
        if (biVar == null) {
            biVar = C142330bi.f386146h;
        }
        if (biVar.f386154g) {
            C68214a aVar = this.f269058a.f269066b;
            Objects.requireNonNull(aVar);
            C96105bi biVar2 = new C96105bi(aVar);
            C68214a aVar2 = this.f269058a.f269073i;
            Objects.requireNonNull(aVar2);
            return C58485gu.m89847o(biVar2, new C96105bi(aVar2));
        }
        C59104x d = C96109bm.f269061a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) d).mo56372aa(16957)).mo56389s("VM only request bad %s", this.f269058a.f269083s.f269039a);
        return this.f269058a.mo89962b();
    }
}
