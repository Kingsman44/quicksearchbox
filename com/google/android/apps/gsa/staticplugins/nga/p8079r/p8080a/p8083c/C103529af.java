package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80498f;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66635db;
import com.google.speech.p5208h.C66637dd;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.af */
/* compiled from: PG */
public final class C103529af extends C68247h {

    /* renamed from: a */
    private final C68283d f288449a;

    /* renamed from: c */
    private final C68283d f288450c;

    public C103529af(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103529af.class), aVar);
        this.f288449a = C68236af.m98549d(dVar);
        this.f288450c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        List list = (List) obj;
        C80498f fVar = (C80498f) list.get(1);
        if (((C90021c) list.get(0)).mo79746e(C90126fx.f251444it)) {
            kVar = new C118928k(C58836b.f156633a, C66637dd.f181303d);
        } else if (!fVar.f220976a) {
            kVar = new C118928k(C58836b.f156633a, C66637dd.f181303d);
        } else {
            C66635db dbVar = (C66635db) C66637dd.f181302c.createBuilder();
            dbVar.copyOnWrite();
            C66637dd ddVar = (C66637dd) dbVar.instance;
            ddVar.f181306b = 2;
            ddVar.f181305a = 2 | ddVar.f181305a;
            kVar = new C118928k(C58833ax.m90834k((C66637dd) dbVar.build()), C66637dd.f181303d);
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288449a.mo60297gq(), this.f288450c.mo60297gq());
    }
}
