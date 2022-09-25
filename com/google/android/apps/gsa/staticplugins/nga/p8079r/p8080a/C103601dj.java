package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C60418pm;
import com.google.common.p4552o.C60421pp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67438ag;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dj */
/* compiled from: PG */
public final class C103601dj extends C68247h {

    /* renamed from: a */
    private final C68283d f288611a;

    /* renamed from: c */
    private final C68283d f288612c;

    /* renamed from: d */
    private final C68283d f288613d;

    public C103601dj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C103601dj.class), aVar);
        this.f288611a = C68236af.m98549d(dVar);
        this.f288612c = C68236af.m98549d(dVar2);
        this.f288613d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C21370a aVar = (C21370a) list.get(0);
        Query query = (Query) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C58833ax a = C103595dd.m171574a((C67438ag) axVar.mo56107c());
            if (!a.mo56113h()) {
                obj2 = C58836b.f156633a;
            } else {
                long c = aVar.mo26871c();
                long j = query.f252747E;
                C60418pm pmVar = (C60418pm) C60421pp.f163510e.createBuilder();
                pmVar.copyOnWrite();
                C60421pp ppVar = (C60421pp) pmVar.instance;
                ppVar.f163512a = 1 | ppVar.f163512a;
                ppVar.f163513b = c - j;
                obj2 = C58833ax.m90834k(new C103477am(((C60421pp) pmVar.build()).f163513b, (String) a.mo56107c()));
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288611a.mo60297gq(), this.f288612c.mo60297gq(), this.f288613d.mo60297gq());
    }
}
