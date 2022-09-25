package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.apps.search.lens.p10547a.C139917b;
import com.google.android.apps.search.lens.p10547a.C139918c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.lens.p4707j.C62433bj;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.i */
/* compiled from: PG */
final class C138607i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138611m f376961a;

    /* renamed from: b */
    final /* synthetic */ ImageButton f376962b;

    public C138607i(C138611m mVar, ImageButton imageButton) {
        this.f376961a = mVar;
        this.f376962b = imageButton;
    }

    public final void onClick(View view) {
        this.f376961a.f376977h.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f376962b));
        C139916a aVar = this.f376961a.f376979j;
        C139917b bVar = (C139917b) C139918c.f380355d.createBuilder();
        C62433bj bjVar = C62433bj.LENS_IN_SEARCH_PLATE_SUGGEST;
        bVar.copyOnWrite();
        C139918c cVar = (C139918c) bVar.instance;
        cVar.f380358b = bjVar.f168594ao;
        cVar.f380357a |= 1;
        aVar.mo41490e(bVar.build());
    }
}
