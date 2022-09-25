package com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64091i;
import com.google.protos.p4895aw.p4902b.C64093k;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.b.b.q */
/* compiled from: PG */
public final class C146789q extends C68247h {

    /* renamed from: a */
    private final C68283d f396336a;

    /* renamed from: c */
    private final C68283d f396337c;

    public C146789q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146789q.class), aVar);
        this.f396336a = C68236af.m98549d(dVar);
        this.f396337c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object emptyList;
        List list = (List) obj;
        C64098p pVar = (C64098p) list.get(1);
        Iterator it = ((C64093k) list.get(0)).f173282a.iterator();
        while (true) {
            if (!it.hasNext()) {
                emptyList = Collections.emptyList();
                break;
            }
            C64091i iVar = (C64091i) it.next();
            C64098p pVar2 = iVar.f173275d;
            if (pVar2 == null) {
                pVar2 = C64098p.f173292c;
            }
            if (pVar.equals(pVar2)) {
                emptyList = iVar.f173277f;
                break;
            }
        }
        return C60856cj.m92900i(emptyList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396336a.mo60297gq(), this.f396337c.mo60297gq());
    }
}
