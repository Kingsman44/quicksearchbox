package com.google.android.libraries.search.logging.p3039b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.logging.b.d */
/* compiled from: PG */
public final class C38832d implements C38830b {

    /* renamed from: a */
    private final Executor f102488a;

    /* renamed from: b */
    private final C21370a f102489b;

    public C38832d(Executor executor, C21370a aVar) {
        this.f102488a = executor;
        this.f102489b = aVar;
    }

    /* renamed from: d */
    public static C58192i m68184d(C60555uf ufVar, C38833e eVar, String str) {
        C58191h hVar = (C58191h) C58192i.f155603j.createBuilder();
        hVar.copyOnWrite();
        C58192i iVar = (C58192i) hVar.instance;
        ufVar.getClass();
        iVar.f155607c = ufVar;
        iVar.f155605a |= 4;
        String c = eVar.mo41615c();
        hVar.copyOnWrite();
        C58192i iVar2 = (C58192i) hVar.instance;
        c.getClass();
        iVar2.f155605a |= 128;
        iVar2.f155610f = c;
        List d = eVar.mo41616d();
        hVar.copyOnWrite();
        C58192i iVar3 = (C58192i) hVar.instance;
        C62961ch chVar = iVar3.f155606b;
        if (!chVar.mo58948c()) {
            iVar3.f155606b = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) d, (List) iVar3.f155606b);
        if (str != null) {
            hVar.copyOnWrite();
            C58192i iVar4 = (C58192i) hVar.instance;
            iVar4.f155605a |= 16;
            iVar4.f155608d = str;
        }
        String b = eVar.mo41614b();
        if (b != null) {
            hVar.copyOnWrite();
            C58192i iVar5 = (C58192i) hVar.instance;
            iVar5.f155605a |= 32;
            iVar5.f155609e = b;
        }
        return (C58192i) hVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo41663a(C60555uf ufVar, C38833e eVar) {
        C60548tz tzVar = (C60548tz) ufVar.toBuilder();
        C38829a.m68180a(tzVar, 0, this.f102489b);
        C60870cx a = eVar.mo41613a();
        C38831c cVar = new C38831c((C60555uf) tzVar.build(), eVar);
        return C60922j.m93044g(a, C47810es.m84963c(cVar), this.f102488a);
    }

    /* renamed from: b */
    public final C58192i mo41664b(C60555uf ufVar, C38833e eVar, String str) {
        boolean z = true;
        C58838bb.m90868c(1 == (ufVar.f164093a & 1));
        C58838bb.m90868c((ufVar.f164250e & 16) != 0);
        if ((ufVar.f164250e & 4096) == 0) {
            z = false;
        }
        C58838bb.m90868c(z);
        return m68184d(ufVar, eVar, str);
    }

    /* renamed from: c */
    public final void mo41665c(C60548tz tzVar) {
        C38829a.m68180a(tzVar, 0, this.f102489b);
    }
}
