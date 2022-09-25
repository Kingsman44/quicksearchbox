package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62306cb;
import com.google.lens.p4701g.C62327cw;
import com.google.lens.p4701g.C62328cx;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.gn */
/* compiled from: PG */
public final class C24711gn extends C68247h {

    /* renamed from: a */
    private final C68283d f67563a;

    /* renamed from: c */
    private final C68283d f67564c;

    public C24711gn(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24711gn.class), aVar);
        this.f67563a = C68236af.m98549d(dVar);
        this.f67564c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62328cx cxVar;
        List list = (List) obj;
        C62306cb cbVar = (C62306cb) list.get(0);
        C24530h hVar = (C24530h) list.get(1);
        C24653ej.m45755b(C24705gh.class, hVar);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < cbVar.f168199a.size(); i4++) {
            C19652b bVar = (C19652b) cbVar.f168199a.get(i4);
            int i5 = bVar.f54666c * bVar.f54667d;
            if (i5 > i2) {
                i = i4;
                i3 = i2;
                i2 = i5;
            } else if (i5 > i3) {
                i3 = i5;
            }
        }
        C24653ej.m45756c(C24705gh.class, hVar, C62355r.f168332e);
        if (i < 0 || (i3 > 0 && i2 / i3 < 4)) {
            cxVar = C62328cx.f168247b;
        } else {
            C62327cw cwVar = (C62327cw) C62328cx.f168247b.createBuilder();
            C19652b bVar2 = (C19652b) cbVar.f168199a.get(i);
            cwVar.copyOnWrite();
            C62328cx cxVar2 = (C62328cx) cwVar.instance;
            bVar2.getClass();
            C62971cq cqVar = cxVar2.f168249a;
            if (!cqVar.mo58948c()) {
                cxVar2.f168249a = C62942bv.mutableCopy(cqVar);
            }
            cxVar2.f168249a.add(bVar2);
            cxVar = (C62328cx) cwVar.build();
        }
        return C60856cj.m92900i(cxVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67563a.mo60297gq(), this.f67564c.mo60297gq());
    }
}
