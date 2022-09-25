package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.p.ax */
/* compiled from: PG */
public final class C86214ax extends C68247h {

    /* renamed from: a */
    private final C68283d f232978a;

    /* renamed from: c */
    private final C68283d f232979c;

    /* renamed from: d */
    private final C68283d f232980d;

    /* renamed from: e */
    private final C68283d f232981e;

    public C86214ax(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C86214ax.class), aVar);
        this.f232978a = C68236af.m98549d(dVar);
        this.f232979c = C68236af.m98549d(dVar2);
        this.f232980d = C68236af.m98549d(dVar3);
        this.f232981e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C86232bo boVar;
        List list = (List) obj;
        C21370a aVar = (C21370a) list.get(0);
        Query query = (Query) list.get(1);
        C86237bt btVar = (C86237bt) list.get(2);
        long longValue = ((Long) list.get(3)).longValue();
        C86232bo boVar2 = null;
        if (longValue != 0) {
            synchronized (btVar.f233070f) {
                boVar = (C86232bo) btVar.f233071g.get(longValue);
                if (boVar != null && (boVar.mo79882R() || boVar.mo79880P())) {
                    btVar.f233071g.remove(longValue);
                    boVar = null;
                }
            }
            if (boVar != null) {
                boVar2 = boVar;
            }
            if (boVar2 != null) {
                boVar2.mo79879O();
            }
        }
        return C60856cj.m92900i(C58833ax.m90833j(boVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f232978a.mo60297gq(), this.f232979c.mo60297gq(), this.f232980d.mo60297gq(), this.f232981e.mo60297gq());
    }
}
