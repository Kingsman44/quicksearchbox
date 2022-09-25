package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96625a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.i */
/* compiled from: PG */
final class C95534i extends C94650n {

    /* renamed from: e */
    final /* synthetic */ C95535j f267350e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95534i(C95535j jVar, CharSequence charSequence) {
        super(jVar.f267351a, jVar.f267353c, jVar.f267354d, charSequence, (Uri) null);
        this.f267350e = jVar;
    }

    /* renamed from: c */
    public final C60237lk mo88569c() {
        C60237lk lkVar = this.f264731d;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 128;
        loVar.f162988g = "bisto_dnd";
        lkVar.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar.instance;
        loVar3.f162982a |= 2;
        loVar3.f162984c = true;
        return lkVar;
    }

    /* renamed from: n */
    public final void mo88581n(C95285o oVar, C95284n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        C95535j jVar = this.f267350e;
        jVar.f267355e = jVar.f267354d.mo26870b();
        C96625a b = jVar.f267352b.mo90290b();
        b.mo90286c("DndAnnouncement", "timestamp", jVar.f267355e);
        b.mo90284a();
        super.mo88581n(oVar, nVar);
    }
}
