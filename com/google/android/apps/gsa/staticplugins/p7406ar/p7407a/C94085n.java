package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62942bv;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.n */
/* compiled from: PG */
public final class C94085n extends C68247h {

    /* renamed from: a */
    private final C68283d f262884a;

    /* renamed from: c */
    private final C68283d f262885c;

    public C94085n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C94085n.class), aVar);
        this.f262884a = C68236af.m98549d(dVar);
        this.f262885c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        long longValue = ((Long) list.get(1)).longValue();
        C54120s sVar = (C54120s) C62942bv.parseFrom((C62942bv) C54120s.f142008d, C62897ae.m95111N(((C89057m) list.get(0)).mo83034a().mo83032c()).mo58688w());
        C54098av avVar = sVar.f142012c;
        if (avVar == null) {
            avVar = C54098av.f141935j;
        }
        if (avVar.f141944h) {
            C58976aa aaVar = C58975e.f156826a;
            C94078g.m155279b(1085, longValue);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            C94078g.m155279b(1086, longValue);
        }
        return C60856cj.m92900i(sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f262884a.mo60297gq(), this.f262885c.mo60297gq());
    }
}
