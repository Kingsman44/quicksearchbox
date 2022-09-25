package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.c.f.a.j;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58836b;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.au */
/* compiled from: PG */
final class C100592au extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C100603be f281271a;

    /* renamed from: b */
    private final AtomicBoolean f281272b = new AtomicBoolean();

    public C100592au(C100603be beVar) {
        this.f281271a = beVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C118896b bVar = (C118896b) obj;
        C22872h.m42743c(C86593a.class);
        if (!this.f281272b.getAndSet(true)) {
            j.a((C89859i) this.f281271a.f281304l.mo27525b(), C89849ae.FIRST_RECOGNIZED_TEXT_RECEIVED, this.f281271a.f281297e.f252749G, C58836b.f156633a);
        }
        if (bVar.mo104061d()) {
            j.a((C89859i) this.f281271a.f281304l.mo27525b(), C89849ae.FINAL_RECOGNIZED_TEXT_RECEIVED, this.f281271a.f281297e.f252749G, C58836b.f156633a);
        }
        C100603be beVar = this.f281271a;
        beVar.f281295c.mo78949o(beVar.f281297e, bVar.mo104059b(), bVar.mo104060c(), bVar.mo104061d(), bVar.mo104058a());
    }
}
