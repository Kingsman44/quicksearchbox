package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118978s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67438ag;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dl */
/* compiled from: PG */
public final class C103603dl extends C68247h {

    /* renamed from: a */
    private final C68283d f288615a;

    /* renamed from: c */
    private final C68283d f288616c;

    public C103603dl(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103603dl.class), aVar);
        this.f288615a = C68236af.m98549d(dVar);
        this.f288616c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C67438ag agVar;
        C67438ag agVar2;
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C67238p pVar = (C67238p) axVar.mo56107c();
            if (pVar.f182740b == 1) {
                agVar = (C67438ag) pVar.f182741c;
            } else {
                agVar = C67438ag.f183256k;
            }
            C58833ax a = C103595dd.m171574a(agVar);
            if (!a.mo56113h()) {
                obj2 = C58836b.f156633a;
            } else {
                C67238p pVar2 = (C67238p) axVar.mo56107c();
                if (pVar2.f182740b == 1) {
                    agVar2 = (C67438ag) pVar2.f182741c;
                } else {
                    agVar2 = C67438ag.f183256k;
                }
                obj2 = C58833ax.m90834k(new C103477am(C118978s.m197519b(agVar2, agVar2.f183265h, tVar.mo79746e(C90126fx.f251775pf)).f163513b, (String) a.mo56107c()));
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288615a.mo60297gq(), this.f288616c.mo60297gq());
    }
}
