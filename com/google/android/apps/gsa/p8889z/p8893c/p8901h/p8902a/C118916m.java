package com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8902a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.c.h.a.m */
/* compiled from: PG */
public final class C118916m extends C68247h {

    /* renamed from: a */
    private final C68283d f331646a;

    /* renamed from: c */
    private final C68283d f331647c;

    /* renamed from: d */
    private final C68283d f331648d;

    /* renamed from: e */
    private final C68283d f331649e;

    public C118916m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C118916m.class), aVar);
        this.f331646a = C68236af.m98549d(dVar);
        this.f331647c = C68236af.m98549d(dVar2);
        this.f331648d = C68236af.m98549d(dVar3);
        this.f331649e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Set<C68282c> set = (Set) list.get(1);
        Set<C118928k> set2 = (Set) list.get(2);
        C66606cd cdVar = (C66606cd) ((C66607ce) list.get(3)).toBuilder();
        for (C118928k a : (Set) list.get(0)) {
            a.mo104073a(cdVar);
        }
        for (C68282c a2 : set) {
            try {
                ((C118928k) a2.mo60292a()).mo104073a(cdVar);
            } catch (ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C118915l.f331645a.mo56225c()).mo56382g(e)).mo56372aa(34193)).mo56386p("Nonfatal S3Extension creation failed");
            }
        }
        for (C118928k a3 : set2) {
            a3.mo104073a(cdVar);
        }
        return C60856cj.m92900i((C66607ce) cdVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331646a.mo60297gq(), this.f331647c.mo60297gq(), this.f331648d.mo60297gq(), this.f331649e.mo60297gq());
    }
}
