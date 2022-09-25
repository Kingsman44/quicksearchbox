package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64091i;
import com.google.protos.p4895aw.p4902b.C64093k;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.cl */
/* compiled from: PG */
public final class C146936cl extends C68247h {

    /* renamed from: a */
    private final C68283d f396654a;

    /* renamed from: c */
    private final C68283d f396655c;

    public C146936cl(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146936cl.class), aVar);
        this.f396654a = C68236af.m98549d(dVar);
        this.f396655c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C64091i iVar;
        List list = (List) obj;
        C64098p pVar = (C64098p) list.get(1);
        Iterator it = ((C64093k) list.get(0)).f173282a.iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = C64091i.f173270i;
                break;
            }
            iVar = (C64091i) it.next();
            C64098p pVar2 = iVar.f173275d;
            if (pVar2 == null) {
                pVar2 = C64098p.f173292c;
            }
            if (pVar.equals(pVar2)) {
                break;
            }
        }
        return C60856cj.m92900i(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396654a.mo60297gq(), this.f396655c.mo60297gq());
    }
}
