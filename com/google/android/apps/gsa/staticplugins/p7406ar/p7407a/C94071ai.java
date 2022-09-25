package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4086k.p4087a.p4090b.p4091a.C54503l;
import com.google.p4017at.p4086k.p4087a.p4090b.p4091a.C54505n;
import com.google.p4017at.p4086k.p4087a.p4090b.p4091a.C54506o;
import com.google.p4017at.p4086k.p4087a.p4090b.p4091a.C54507p;
import com.google.p4017at.p4086k.p4087a.p4090b.p4091a.C54508q;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.ai */
/* compiled from: PG */
public final class C94071ai extends C68247h {

    /* renamed from: a */
    private final C68283d f262803a;

    /* renamed from: c */
    private final C68283d f262804c;

    public C94071ai(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C94071ai.class), aVar);
        this.f262803a = C68236af.m98549d(dVar);
        this.f262804c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C54503l lVar = (C54503l) list.get(0);
        C54507p pVar = (C54507p) C70864c.m103731e(new C54506o(), (C70888j) list.get(1), C70851i.f189015a);
        C70888j jVar = pVar.f189039a;
        C70338di diVar = C54508q.f143124a;
        if (diVar == null) {
            synchronized (C54508q.class) {
                diVar = C54508q.f143124a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.search.gsa.oncontent.v1.OnContentService", "GetOnContentData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54503l.f143106g);
                    d.f187486b = C70850d.m103697c(C54505n.f143114h);
                    C70338di a = d.mo62040a();
                    C54508q.f143124a = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, pVar.f189040b), lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f262803a.mo60297gq(), this.f262804c.mo60297gq());
    }
}
