package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2037n.C24768aa;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62355r;
import com.google.p4172bg.p4174b.C55720i;
import com.google.p4172bg.p4174b.C55721j;
import com.google.p4172bg.p4174b.C55730s;
import com.google.p4172bg.p4174b.C55731t;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ao */
/* compiled from: PG */
public final class C24550ao extends C68247h {

    /* renamed from: a */
    private final C68283d f67227a;

    /* renamed from: c */
    private final C68283d f67228c;

    /* renamed from: d */
    private final C68283d f67229d;

    /* renamed from: e */
    private final C68283d f67230e;

    public C24550ao(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C24550ao.class), aVar);
        this.f67227a = C68236af.m98549d(dVar);
        this.f67228c = C68236af.m98549d(dVar2);
        this.f67229d = C68236af.m98549d(dVar3);
        this.f67230e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C55731t tVar = (C55731t) list.get(0);
        C24530h hVar = (C24530h) list.get(1);
        C24768aa aaVar = (C24768aa) list.get(2);
        C24435b.m45508a((C58833ax) list.get(3));
        C24653ej.m45755b(C24546ak.class, hVar);
        ArrayList arrayList = new ArrayList();
        for (C55721j jVar : tVar.f147065c) {
            C55720i iVar = (C55720i) C55721j.f147017k.createBuilder(jVar);
            if (aaVar.f67680f) {
                iVar.copyOnWrite();
                C55721j jVar2 = (C55721j) iVar.instance;
                jVar2.f147025g = null;
                jVar2.f147019a &= -2049;
            }
            if (aaVar.f67679e) {
                iVar.copyOnWrite();
                C55721j jVar3 = (C55721j) iVar.instance;
                jVar3.f147027i = null;
                jVar3.f147019a &= -65537;
            }
            if (!aaVar.f67678d) {
                arrayList.add((C55721j) iVar.build());
            } else if ((jVar.f147019a & 8) != 0) {
                arrayList.add((C55721j) iVar.build());
            }
        }
        C24653ej.m45756c(C24546ak.class, hVar, C62355r.f168332e);
        C58485gu j = C58485gu.m89842j(arrayList);
        C55730s sVar = (C55730s) C55731t.f147061g.createBuilder(tVar);
        sVar.copyOnWrite();
        ((C55731t) sVar.instance).f147065c = C55731t.emptyProtobufList();
        sVar.mo54272a(j);
        return C60856cj.m92900i((C55731t) sVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67227a.mo60297gq(), this.f67228c.mo60297gq(), this.f67229d.mo60297gq(), this.f67230e.mo60297gq());
    }
}
