package com.google.android.apps.gsa.search.core.p6884y;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6884y.p6888d.C87294b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88025mj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88026mk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88029mn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88030mo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88035mt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88036mu;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.search.core.y.c */
/* compiled from: PG */
public final class C87290c {

    /* renamed from: a */
    private final C87294b f235751a;

    /* renamed from: b */
    private final C23084ao f235752b;

    public C87290c(C87294b bVar, C23084ao aoVar) {
        this.f235751a = bVar;
        this.f235752b = aoVar;
    }

    /* renamed from: a */
    public final void mo80935a() {
        this.f235752b.mo28328a();
        C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
        C88026mk mkVar = C88026mk.f238032d;
        mtVar.copyOnWrite();
        C88036mu muVar = (C88036mu) mtVar.instance;
        mkVar.getClass();
        muVar.f238060b = mkVar;
        muVar.f238059a = 9;
        this.f235751a.mo80939a((C88036mu) mtVar.build(), C58836b.f156633a);
    }

    /* renamed from: b */
    public final void mo80936b(int i, Intent intent) {
        this.f235752b.mo28328a();
        C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
        C88025mj mjVar = (C88025mj) C88026mk.f238032d.createBuilder();
        mjVar.copyOnWrite();
        C88026mk mkVar = (C88026mk) mjVar.instance;
        mkVar.f238034a |= 1;
        mkVar.f238035b = i;
        C88026mk mkVar2 = (C88026mk) mjVar.build();
        mtVar.copyOnWrite();
        C88036mu muVar = (C88036mu) mtVar.instance;
        mkVar2.getClass();
        muVar.f238060b = mkVar2;
        muVar.f238059a = 9;
        this.f235751a.mo80939a((C88036mu) mtVar.build(), C58833ax.m90834k(intent));
    }

    /* renamed from: c */
    public final void mo80937c() {
        this.f235752b.mo28328a();
        C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
        C88025mj mjVar = (C88025mj) C88026mk.f238032d.createBuilder();
        mjVar.copyOnWrite();
        C88026mk mkVar = (C88026mk) mjVar.instance;
        mkVar.f238034a |= 2;
        mkVar.f238036c = true;
        C88026mk mkVar2 = (C88026mk) mjVar.build();
        mtVar.copyOnWrite();
        C88036mu muVar = (C88036mu) mtVar.instance;
        mkVar2.getClass();
        muVar.f238060b = mkVar2;
        muVar.f238059a = 9;
        this.f235751a.mo80939a((C88036mu) mtVar.build(), C58836b.f156633a);
    }

    /* renamed from: d */
    public final void mo80938d(int i, Intent intent) {
        this.f235752b.mo28328a();
        C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
        C88029mn mnVar = (C88029mn) C88030mo.f238044c.createBuilder();
        mnVar.copyOnWrite();
        C88030mo moVar = (C88030mo) mnVar.instance;
        moVar.f238046a |= 1;
        moVar.f238047b = i;
        C88030mo moVar2 = (C88030mo) mnVar.build();
        mtVar.copyOnWrite();
        C88036mu muVar = (C88036mu) mtVar.instance;
        moVar2.getClass();
        muVar.f238060b = moVar2;
        muVar.f238059a = 14;
        C88036mu muVar2 = (C88036mu) mtVar.build();
        if (intent == null) {
            this.f235751a.mo80939a(muVar2, C58836b.f156633a);
        } else {
            this.f235751a.mo80939a(muVar2, C58833ax.m90834k(intent));
        }
    }
}
