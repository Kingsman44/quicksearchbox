package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147084g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64087ep;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.do */
/* compiled from: PG */
public final class C146966do extends C68247h {

    /* renamed from: a */
    private final C68283d f396722a;

    /* renamed from: c */
    private final C68283d f396723c;

    /* renamed from: d */
    private final C68283d f396724d;

    public C146966do(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146966do.class), aVar);
        this.f396722a = C68236af.m98549d(dVar);
        this.f396723c = C68236af.m98549d(dVar2);
        this.f396724d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C64087ep epVar = (C64087ep) list.get(0);
        C147084g gVar = (C147084g) list.get(1);
        C146907bj bjVar = (C146907bj) list.get(2);
        C147078aw b = bjVar.mo123808m().mo123904b();
        try {
            gVar.mo123907a(b);
            C64057dm dmVar = epVar.f173261b;
            if (dmVar == null) {
                dmVar = C64057dm.f173196c;
            }
            bjVar.mo123805j(b, dmVar);
            b.mo123901j();
            if (b != null) {
                b.close();
            }
            C64057dm dmVar2 = epVar.f173261b;
            if (dmVar2 == null) {
                dmVar2 = C64057dm.f173196c;
            }
            return C60856cj.m92900i(dmVar2);
        } catch (Throwable th) {
            C146963dl.m239567a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396722a.mo60297gq(), this.f396723c.mo60297gq(), this.f396724d.mo60297gq());
    }
}
