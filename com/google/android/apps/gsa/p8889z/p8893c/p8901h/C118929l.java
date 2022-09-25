package com.google.android.apps.gsa.p8889z.p8893c.p8901h;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.c.h.l */
/* compiled from: PG */
public final class C118929l extends C68247h {

    /* renamed from: a */
    private final C68283d f331696a;

    /* renamed from: c */
    private final C68283d f331697c;

    /* renamed from: d */
    private final C68283d f331698d;

    /* renamed from: e */
    private final C68283d f331699e;

    public C118929l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C118929l.class), aVar);
        this.f331696a = C68236af.m98549d(dVar);
        this.f331697c = C68236af.m98549d(dVar2);
        this.f331698d = C68236af.m98549d(dVar3);
        this.f331699e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(1);
        Set<C68282c> set = (Set) list.get(2);
        C66606cd cdVar = (C66606cd) ((C66607ce) list.get(3)).toBuilder();
        for (C118928k a : (Set) list.get(0)) {
            a.mo104073a(cdVar);
        }
        C58833ax b = C57940c.m88575b(cVar);
        if (!b.mo56113h() || !(b.mo56107c() instanceof TimeoutException)) {
            for (C118928k a2 : (Set) C57940c.m88577d(cVar)) {
                a2.mo104073a(cdVar);
            }
            for (C68282c cVar2 : set) {
                if (C57940c.m88582i(cVar2)) {
                    ((C118928k) C57940c.m88577d(cVar2)).mo104073a(cdVar);
                }
            }
            return C60856cj.m92900i((C66607ce) cdVar.build());
        }
        throw new C90523o((Throwable) b.mo56107c(), (int) C89885b.S3REQUEST_BUILD_HEADER_TIMEOUT_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f331696a.mo60297gq(), C68236af.m98546a(this.f331697c.mo60297gq()), this.f331698d.mo60297gq(), this.f331699e.mo60297gq());
    }
}
