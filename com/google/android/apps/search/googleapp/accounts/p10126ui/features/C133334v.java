package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.view.View;
import com.google.android.apps.gsa.h.m.c;
import com.google.android.apps.gsa.h.m.d;
import com.google.android.apps.gsa.h.m.g;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.v */
/* compiled from: PG */
public final /* synthetic */ class C133334v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363320a;

    /* renamed from: b */
    public final /* synthetic */ c f363321b;

    public /* synthetic */ C133334v(C133255c cVar, c cVar2) {
        this.f363320a = cVar;
        this.f363321b = cVar2;
    }

    public final void onClick(View view) {
        C133255c cVar = this.f363320a;
        c cVar2 = this.f363321b;
        cVar.mo111050a(149788);
        d createBuilder = g.c.createBuilder();
        createBuilder.copyOnWrite();
        g gVar = createBuilder.instance;
        gVar.b = 1;
        gVar.a = 1 | gVar.a;
        cVar2.mo41490e(createBuilder.build());
    }
}
