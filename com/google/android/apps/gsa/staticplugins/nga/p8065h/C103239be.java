package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87876gw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87877gx;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.C103087e;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.be */
/* compiled from: PG */
public final class C103239be implements C118549h {

    /* renamed from: a */
    public final C81459h f288011a;

    /* renamed from: b */
    private final C103284m f288012b;

    /* renamed from: c */
    private final C68214a f288013c;

    /* renamed from: d */
    private final C86124t f288014d;

    public C103239be(C103284m mVar, C81465n nVar, C68214a aVar, C86124t tVar, C22871g gVar) {
        this.f288012b = mVar;
        this.f288011a = nVar.mo75095b(gVar, C103238bd.f288010a);
        this.f288013c = aVar;
        this.f288014d = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        if (this.f288014d.mo79746e(C90126fx.f251385hn)) {
            ((C103087e) this.f288013c.mo27525b()).mo93595b();
        }
        C103284m mVar = this.f288012b;
        C87876gw gwVar = (C87876gw) C87877gx.f237731f.createBuilder();
        gwVar.copyOnWrite();
        C87877gx gxVar = (C87877gx) gwVar.instance;
        gxVar.f237733a |= 2;
        gxVar.f237735c = true;
        return C60922j.m93045h(C60838bs.m92859i(mVar.mo93746a((C87877gx) gwVar.build())), new C103237bc(this), C60826bg.f164896a);
    }
}
