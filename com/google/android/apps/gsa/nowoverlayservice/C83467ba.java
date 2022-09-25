package com.google.android.apps.gsa.nowoverlayservice;

import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.common.p4552o.C60321oe;
import com.google.lens.p4707j.C62433bj;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ba */
/* compiled from: PG */
final class C83467ba extends C87662k {

    /* renamed from: a */
    final /* synthetic */ C83468bb f227533a;

    public C83467ba(C83468bb bbVar) {
        this.f227533a = bbVar;
    }

    /* renamed from: b */
    public final void mo76788b() {
        C83468bb bbVar = this.f227533a;
        if (bbVar.f227561l) {
            bbVar.mo76802k();
        }
    }

    /* renamed from: c */
    public final void mo76789c(boolean z) {
        int i;
        C139921f fVar = this.f227533a.f227552c;
        C24970c cVar = new C24970c();
        cVar.f68114v = true;
        cVar.f68102j = this.f227533a.f227551b.getPackageName();
        cVar.f68093a = true;
        if (z) {
            i = C62433bj.LENS_IN_SEARCH_PLATE_HOMESCREEN.f168594ao;
        } else {
            i = C62433bj.LENS_IN_SEARCH_PLATE.f168594ao;
        }
        cVar.f68105m = i;
        cVar.f68118z = Long.valueOf(this.f227533a.f227550a.mo26872d());
        fVar.mo115338b(cVar.mo30192a());
    }

    /* renamed from: d */
    public final void mo76790d() {
        C83468bb bbVar = this.f227533a;
        if (!bbVar.f227561l) {
            bbVar.f227554e.mo81810ar();
        }
        C89949q.m146525j(this.f227533a.mo76794b(516), (C60321oe) null, (C63196b) null, (String) null);
        C83468bb bbVar2 = this.f227533a;
        this.f227533a.f227551b.startActivity(C89429a.m145443a(bbVar2.f227551b, bbVar2.f227554e.f236804aG));
    }

    /* renamed from: e */
    public final void mo76791e() {
        C83468bb bbVar = this.f227533a;
        if (bbVar.f227561l && bbVar.f227555f) {
            bbVar.f227557h = true;
            bbVar.mo76797f();
        }
    }

    /* renamed from: f */
    public final boolean mo76792f() {
        C83468bb bbVar = this.f227533a;
        if (!bbVar.f227561l) {
            return false;
        }
        bbVar.mo76802k();
        return true;
    }
}
