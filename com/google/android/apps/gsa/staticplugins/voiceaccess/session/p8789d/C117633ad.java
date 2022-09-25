package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.p6837i.C86496n;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.ad */
/* compiled from: PG */
public final class C117633ad extends C68247h {

    /* renamed from: a */
    private final C68283d f326527a;

    /* renamed from: c */
    private final C68283d f326528c;

    /* renamed from: d */
    private final C68283d f326529d;

    public C117633ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117633ad.class), aVar);
        this.f326527a = C68236af.m98549d(dVar);
        this.f326528c = C68236af.m98549d(dVar2);
        this.f326529d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58976aa aaVar = C58975e.f156826a;
        return new C86496n((Query) list.get(0), (C86575u) list.get(1), (C89356b) list.get(2)).mo80180a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326527a.mo60297gq(), this.f326528c.mo60297gq(), this.f326529d.mo60297gq());
    }
}
