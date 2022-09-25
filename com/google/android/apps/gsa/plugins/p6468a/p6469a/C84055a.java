package com.google.android.apps.gsa.plugins.p6468a.p6469a;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88148qy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88152rb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88174rx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88175ry;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.plugins.a.a.a */
/* compiled from: PG */
public final class C84055a {

    /* renamed from: a */
    public static final C59071e f228944a = C59071e.m91332i("com.google.android.apps.gsa.plugins.a.a.a");

    /* renamed from: b */
    public int f228945b = 1;

    /* renamed from: c */
    private final C87680ah f228946c;

    public C84055a(C87680ah ahVar) {
        this.f228946c = ahVar;
    }

    /* renamed from: a */
    public final void mo77508a(String str, String str2, String str3, boolean z, C88148qy qyVar) {
        C88152rb rbVar = (C88152rb) C88153rc.f238294j.createBuilder();
        rbVar.copyOnWrite();
        C88153rc rcVar = (C88153rc) rbVar.instance;
        str.getClass();
        rcVar.f238297a |= 1;
        rcVar.f238298b = str;
        String g = C58837ba.m90858g(str2);
        rbVar.copyOnWrite();
        C88153rc rcVar2 = (C88153rc) rbVar.instance;
        rcVar2.f238297a |= 2;
        rcVar2.f238299c = g;
        rbVar.copyOnWrite();
        C88153rc rcVar3 = (C88153rc) rbVar.instance;
        rcVar3.f238297a |= 4;
        rcVar3.f238300d = C58837ba.m90858g(str3);
        rbVar.copyOnWrite();
        C88153rc rcVar4 = (C88153rc) rbVar.instance;
        rcVar4.f238297a |= 64;
        rcVar4.f238304h = z;
        int i = this.f228945b;
        rbVar.copyOnWrite();
        C88153rc rcVar5 = (C88153rc) rbVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            rcVar5.f238302f = i2;
            rcVar5.f238297a |= 16;
            if (qyVar != null) {
                rbVar.copyOnWrite();
                C88153rc rcVar6 = (C88153rc) rbVar.instance;
                rcVar6.f238305i = qyVar;
                rcVar6.f238297a |= 128;
            }
            C87680ah ahVar = this.f228946c;
            C88489j jVar = new C88489j(C87739bu.OPEN_AMP_DOCUMENT);
            jVar.mo82014b(C88153rc.f238295k, (C88153rc) rbVar.build());
            ahVar.mo81961c(jVar.mo82013a());
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo77509b(String str, String str2) {
        C88174rx rxVar = (C88174rx) C88175ry.f238360e.createBuilder();
        rxVar.copyOnWrite();
        C88175ry ryVar = (C88175ry) rxVar.instance;
        str.getClass();
        ryVar.f238363a |= 1;
        ryVar.f238364b = str;
        String g = C58837ba.m90858g(str2);
        rxVar.copyOnWrite();
        C88175ry ryVar2 = (C88175ry) rxVar.instance;
        ryVar2.f238363a |= 2;
        ryVar2.f238365c = g;
        int i = this.f228945b;
        rxVar.copyOnWrite();
        C88175ry ryVar3 = (C88175ry) rxVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            ryVar3.f238366d = i2;
            ryVar3.f238363a |= 4;
            C87680ah ahVar = this.f228946c;
            C88489j jVar = new C88489j(C87739bu.PRERENDER_AMP_DOCUMENT);
            jVar.mo82014b(C88175ry.f238361f, (C88175ry) rxVar.build());
            ahVar.mo81961c(jVar.mo82013a());
            return;
        }
        throw null;
    }
}
