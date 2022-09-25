package com.google.android.apps.gsa.queryentry;

import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.lens.p4707j.C62433bj;

/* renamed from: com.google.android.apps.gsa.queryentry.c */
/* compiled from: PG */
final class C84241c extends C87662k {

    /* renamed from: a */
    private final QueryEntryActivity f229261a;

    public C84241c(QueryEntryActivity queryEntryActivity) {
        this.f229261a = queryEntryActivity;
    }

    /* renamed from: a */
    public final void mo71032a() {
        this.f229261a.mo77724v();
    }

    /* renamed from: c */
    public final void mo76789c(boolean z) {
        int i;
        C139921f fVar = this.f229261a.f229255t;
        C24970c cVar = new C24970c();
        cVar.f68114v = true;
        cVar.f68102j = this.f229261a.getPackageName();
        cVar.f68093a = true;
        if (z) {
            i = C62433bj.LENS_IN_SEARCH_PLATE_HOMESCREEN.f168594ao;
        } else {
            i = C62433bj.LENS_IN_SEARCH_PLATE.f168594ao;
        }
        cVar.f68105m = i;
        cVar.f68118z = Long.valueOf(this.f229261a.f229256u.mo26872d());
        fVar.mo115338b(cVar.mo30192a());
    }

    /* renamed from: d */
    public final void mo76790d() {
        C89949q.m146523g(516);
        this.f229261a.startActivity(C89429a.m145443a(this.f229261a, "and.gsa.queryentry.superg"));
    }

    /* renamed from: g */
    public final void mo77726g(boolean z) {
        if (z) {
            this.f229261a.setVolumeControlStream(3);
        }
    }
}
