package com.google.android.apps.gsa.staticplugins.opapayments.p8664a.p8665a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4129b.p4130a.p4131a.p4132a.C54658ab;
import com.google.p4129b.p4130a.p4131a.p4132a.C54660ad;
import com.google.p4129b.p4130a.p4131a.p4132a.C54712cb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54713cc;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.a.d */
/* compiled from: PG */
public final class C115909d extends C68247h {

    /* renamed from: a */
    private final C68283d f321390a;

    /* renamed from: c */
    private final C68283d f321391c;

    public C115909d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C115909d.class), aVar);
        this.f321390a = C68236af.m98549d(dVar);
        this.f321391c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C54712cb cbVar = (C54712cb) list.get(0);
        C54658ab abVar = (C54658ab) list.get(1);
        C70888j jVar = cbVar.f189039a;
        C70338di diVar = C54713cc.f143604a;
        if (diVar == null) {
            synchronized (C54713cc.class) {
                diVar = C54713cc.f143604a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.actions.internal.v1.transactions.TransactionsSetupService", "Initialize");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54658ab.f143490d);
                    d.f187486b = C70850d.m103697c(C54660ad.f143495d);
                    C70338di a = d.mo62040a();
                    C54713cc.f143604a = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, cbVar.f189040b), abVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f321390a.mo60297gq(), this.f321391c.mo60297gq());
    }
}
