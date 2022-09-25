package com.google.android.apps.gsa.p8889z.p8909e.p8910a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4455f.C57971a;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.z.e.a.af */
/* compiled from: PG */
public final class C118958af extends C68247h {

    /* renamed from: a */
    private final C118954ab f331736a;

    /* renamed from: c */
    private final C68283d f331737c;

    public C118958af(C118954ab abVar, C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C118958af.class), aVar);
        this.f331736a = abVar;
        this.f331737c = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C68282c cVar = (C68282c) obj;
        C118954ab abVar = this.f331736a;
        try {
            abVar.f331728a.f155029a.mo57356n((C118826c) cVar.mo60292a());
            return C60856cj.m92900i((C118826c) cVar.mo60292a());
        } catch (ExecutionException e) {
            C60870cx h = C60856cj.m92899h(C57971a.m88684a(e));
            abVar.f331728a.f155029a.mo57358p(h);
            return h;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f331737c.mo60297gq());
    }
}
