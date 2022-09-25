package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4705i.p4706a.C62370ab;
import com.google.lens.p4705i.p4706a.C62380k;
import com.google.lens.p4705i.p4706a.C62381l;
import com.google.lens.p4705i.p4706a.C62382m;
import com.google.lens.p4705i.p4706a.C62383n;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.gz */
/* compiled from: PG */
public final class C24723gz extends C68247h {

    /* renamed from: a */
    private final C68283d f67582a;

    /* renamed from: c */
    private final C68283d f67583c;

    public C24723gz(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24723gz.class), aVar);
        this.f67582a = C68236af.m98549d(dVar);
        this.f67583c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62383n nVar;
        List list = (List) obj;
        C62370ab abVar = (C62370ab) list.get(0);
        C24721gx gxVar = (C24721gx) list.get(1);
        C24653ej.m45755b(C24718gu.class, gxVar.f67577b);
        if (gxVar.f67578c.mo31462g(C26239a.LENS_PROACTIVE_TEXT_SENSITIVITY_FILTER_BYPASS)) {
            C62382m mVar = (C62382m) C62383n.f168403e.createBuilder();
            mVar.copyOnWrite();
            C62383n nVar2 = (C62383n) mVar.instance;
            nVar2.f168405a = 1 | nVar2.f168405a;
            nVar2.f168406b = false;
            nVar = (C62383n) mVar.build();
        } else {
            try {
                C62380k kVar = (C62380k) C62381l.f168399c.createBuilder();
                kVar.copyOnWrite();
                C62381l lVar = (C62381l) kVar.instance;
                abVar.getClass();
                lVar.f168402b = abVar;
                lVar.f168401a |= 1;
                C62381l lVar2 = (C62381l) kVar.build();
                C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
                oVar.copyOnWrite();
                C62353p pVar = (C62353p) oVar.instance;
                pVar.f168330d = 16;
                pVar.f168327a = 1 | pVar.f168327a;
                oVar.copyOnWrite();
                C62353p pVar2 = (C62353p) oVar.instance;
                lVar2.getClass();
                pVar2.f168329c = lVar2;
                pVar2.f168328b = 8;
                C62355r b = gxVar.f67576a.mo30011b((C62353p) oVar.build());
                C24653ej.m45756c(C24718gu.class, gxVar.f67577b, b);
                if (b.f168334a == 12) {
                    nVar = (C62383n) b.f168335b;
                } else {
                    nVar = C62383n.f168403e;
                }
            } catch (C62974ct e) {
                C24653ej.m45754a(C24718gu.class, gxVar.f67577b);
                throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
            }
        }
        return C60856cj.m92900i(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67582a.mo60297gq(), this.f67583c.mo60297gq());
    }
}
