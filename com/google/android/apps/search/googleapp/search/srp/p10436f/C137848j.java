package com.google.android.apps.search.googleapp.search.srp.p10436f;

import android.view.View;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.apps.search.lens.p10547a.C139917b;
import com.google.android.apps.search.lens.p10547a.C139918c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.lens.p4707j.C62433bj;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.j */
/* compiled from: PG */
final class C137848j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137843g f375056a;

    public C137848j(C137843g gVar) {
        this.f375056a = gVar;
    }

    public final void onClick(View view) {
        C137843g gVar = this.f375056a;
        gVar.f375030e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C139916a aVar = gVar.f375029d;
        C139917b bVar = (C139917b) C139918c.f380355d.createBuilder();
        C62433bj bjVar = C62433bj.LENS_IN_SEARCH_PLATE;
        bVar.copyOnWrite();
        C139918c cVar = (C139918c) bVar.instance;
        cVar.f380358b = bjVar.f168594ao;
        cVar.f380357a |= 1;
        aVar.mo41490e((C139918c) bVar.build());
    }
}
