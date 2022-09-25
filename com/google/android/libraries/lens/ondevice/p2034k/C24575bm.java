package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62273aw;
import com.google.lens.p4701g.C62274ax;
import com.google.lens.p4701g.C62276az;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.p4172bg.p4174b.C55730s;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.bm */
/* compiled from: PG */
public final class C24575bm extends C68247h {

    /* renamed from: a */
    private final C68283d f67261a;

    /* renamed from: c */
    private final C68283d f67262c;

    /* renamed from: d */
    private final C68283d f67263d;

    /* renamed from: e */
    private final C68283d f67264e;

    public C24575bm(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C24575bm.class), aVar);
        this.f67261a = C68236af.m98549d(dVar);
        this.f67262c = C68236af.m98549d(dVar2);
        this.f67263d = C68236af.m98549d(dVar3);
        this.f67264e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62276az azVar;
        List list = (List) obj;
        C55731t tVar = (C55731t) list.get(0);
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = (OnDeviceEngineNativeApi) list.get(1);
        C24530h hVar = (C24530h) list.get(2);
        C58833ax a = C24435b.m45508a((C58833ax) list.get(3));
        ((C58970a) ((C58970a) C24570bh.f67259a.mo56224b()).mo56372aa(48845)).mo56386p("Sending native OCR paragraphing request.");
        C24653ej.m45755b(C24571bi.class, hVar);
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 4;
        pVar.f168327a = 1 | pVar.f168327a;
        C62273aw awVar = (C62273aw) C62274ax.f168126b.createBuilder();
        C62971cq cqVar = tVar.f147065c;
        awVar.copyOnWrite();
        C62274ax axVar = (C62274ax) awVar.instance;
        C62971cq cqVar2 = axVar.f168128a;
        if (!cqVar2.mo58948c()) {
            axVar.f168128a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) axVar.f168128a);
        oVar.copyOnWrite();
        C62353p pVar2 = (C62353p) oVar.instance;
        C62274ax axVar2 = (C62274ax) awVar.build();
        axVar2.getClass();
        pVar2.f168329c = axVar2;
        pVar2.f168328b = 5;
        try {
            C62355r b = onDeviceEngineNativeApi.mo30011b((C62353p) oVar.build());
            if (b.f168334a == 6) {
                azVar = (C62276az) b.f168335b;
            } else {
                azVar = C62276az.f168130b;
            }
            C62971cq cqVar3 = azVar.f168132a;
            C24653ej.m45756c(C24571bi.class, hVar, b);
            cqVar3.size();
            C24435b.m45509b(a);
            C55730s sVar = (C55730s) C55731t.f147061g.createBuilder(tVar);
            sVar.copyOnWrite();
            C55731t tVar2 = (C55731t) sVar.instance;
            tVar2.mo54275b();
            C62947c.addAll((Iterable) cqVar3, (List) tVar2.f147068f);
            return C60856cj.m92900i((C55731t) sVar.build());
        } catch (C62974ct e) {
            e.toString();
            C24435b.m45509b(a);
            C24653ej.m45754a(C24571bi.class, hVar);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67261a.mo60297gq(), this.f67262c.mo60297gq(), this.f67263d.mo60297gq(), this.f67264e.mo60297gq());
    }
}
