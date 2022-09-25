package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.p10712d.C142330bi;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bl */
/* compiled from: PG */
final class C96108bl extends C96134ck {

    /* renamed from: a */
    final /* synthetic */ C96109bm f269060a;

    public C96108bl(C96109bm bmVar) {
        this.f269060a = bmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C58485gu mo89961a() {
        C142330bi biVar = this.f269060a.f269078n.f269538a.f269047b.f386132r;
        if (biVar == null) {
            biVar = C142330bi.f386146h;
        }
        if (biVar.f386154g) {
            C58480gp gpVar = new C58480gp(4);
            C68214a aVar = this.f269060a.f269068d;
            Objects.requireNonNull(aVar);
            gpVar.mo55395g(new C96107bk(aVar));
            C68214a aVar2 = this.f269060a.f269069e;
            Objects.requireNonNull(aVar2);
            gpVar.mo55395g(new C96107bk(aVar2));
            C68214a aVar3 = this.f269060a.f269070f;
            Objects.requireNonNull(aVar3);
            gpVar.mo55395g(new C96107bk(aVar3));
            C68214a aVar4 = this.f269060a.f269067c;
            Objects.requireNonNull(aVar4);
            gpVar.mo55395g(new C96107bk(aVar4));
            C68214a aVar5 = this.f269060a.f269072h;
            Objects.requireNonNull(aVar5);
            gpVar.mo55395g(new C96107bk(aVar5));
            C68214a aVar6 = this.f269060a.f269075k;
            Objects.requireNonNull(aVar6);
            gpVar.mo55395g(new C96107bk(aVar6));
            C68214a aVar7 = this.f269060a.f269071g;
            Objects.requireNonNull(aVar7);
            gpVar.mo55395g(new C96107bk(aVar7));
            C68214a aVar8 = this.f269060a.f269077m;
            Objects.requireNonNull(aVar8);
            gpVar.mo55395g(new C96107bk(aVar8));
            C68214a aVar9 = this.f269060a.f269074j;
            Objects.requireNonNull(aVar9);
            gpVar.mo55395g(new C96107bk(aVar9));
            return gpVar.mo55394f();
        }
        C59104x d = C96109bm.f269061a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) d).mo56372aa(16958)).mo56389s("Post gesture bad %s", this.f269060a.f269083s.f269039a);
        return this.f269060a.mo89962b();
    }
}
