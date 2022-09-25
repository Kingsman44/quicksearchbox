package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.ai */
/* compiled from: PG */
public final /* synthetic */ class C76565ai implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76565ai f211802a = new C76565ai();

    private /* synthetic */ C76565ai() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63624h hVar;
        C61758t tVar;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 15) {
            hVar = (C63624h) jVar.f166803b;
        } else {
            hVar = C63624h.f172070b;
        }
        if (hVar.f172072a.size() > 0) {
            if (hVar.f172072a.size() > 1) {
                C62971cq cqVar = hVar.f172072a;
            }
            return Optional.m71637of((C63775d) hVar.f172072a.get(0));
        }
        if (jVar.f166802a == 3) {
            tVar = (C61758t) jVar.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        String str = tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR;
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
        aVar.copyOnWrite();
        C63775d dVar = (C63775d) aVar.instance;
        str.getClass();
        dVar.f172520a = 1 | dVar.f172520a;
        dVar.f172521b = str;
        return Optional.m71637of((C63775d) aVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
