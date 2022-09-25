package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8513k;

import com.google.android.apps.gsa.assistant.shared.p.i;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88128qe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88129qf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114725e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114726f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.k.b */
/* compiled from: PG */
public final class C111545b implements i {

    /* renamed from: a */
    public final C114726f f310246a;

    /* renamed from: b */
    public Optional f310247b = Optional.empty();

    /* renamed from: c */
    private final C22871g f310248c;

    public C111545b(C22871g gVar, C68214a aVar) {
        this.f310248c = gVar;
        this.f310246a = (C114726f) aVar.mo27525b();
    }

    /* renamed from: a */
    public final C60870cx mo99171a() {
        return this.f310248c.mo28202b("getMessageNotifications", new C111544a(this));
    }

    /* renamed from: b */
    public final void mo99172b(String str, String str2) {
        if (this.f310247b.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            C88129qf qfVar = (C88129qf) C88130qg.f238240d.createBuilder();
            qfVar.copyOnWrite();
            C88130qg qgVar = (C88130qg) qfVar.instance;
            str.getClass();
            qgVar.f238242a |= 1;
            qgVar.f238243b = str;
            qfVar.copyOnWrite();
            C88130qg qgVar2 = (C88130qg) qfVar.instance;
            str2.getClass();
            qgVar2.f238242a |= 2;
            qgVar2.f238244c = str2;
            C88489j jVar = new C88489j(C87739bu.REPLY_TO_NOTIFICATIONS);
            jVar.mo82014b(C88128qe.f238239a, (C88130qg) qfVar.build());
            ((C114725e) this.f310247b.get()).f318346a.mo96219b(jVar.mo82013a());
        }
    }
}
