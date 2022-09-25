package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2037n.C24768aa;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62313ci;
import com.google.lens.p4701g.C62314cj;
import com.google.lens.p4701g.C62316cl;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.p4172bg.p4174b.C55730s;
import com.google.p4172bg.p4174b.C55731t;
import com.google.p4172bg.p4174b.C55732u;
import com.google.p4172bg.p4174b.C55733v;
import com.google.p4492ck.p4493a.p4494a.C58127b;
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

/* renamed from: com.google.android.libraries.lens.ondevice.k.fh */
/* compiled from: PG */
public final class C24678fh extends C68247h {

    /* renamed from: a */
    private final C68283d f67498a;

    /* renamed from: c */
    private final C68283d f67499c;

    /* renamed from: d */
    private final C68283d f67500d;

    /* renamed from: e */
    private final C68283d f67501e;

    /* renamed from: f */
    private final C68283d f67502f;

    /* renamed from: g */
    private final C68283d f67503g;

    public C24678fh(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C24678fh.class), aVar);
        this.f67498a = C68236af.m98549d(dVar);
        this.f67499c = C68236af.m98549d(dVar2);
        this.f67500d = C68236af.m98549d(dVar3);
        this.f67501e = C68236af.m98549d(dVar4);
        this.f67502f = C68236af.m98549d(dVar5);
        this.f67503g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62316cl clVar;
        C55733v vVar;
        List list = (List) obj;
        C55731t tVar = (C55731t) list.get(0);
        Bitmap bitmap = (Bitmap) list.get(1);
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = (OnDeviceEngineNativeApi) list.get(2);
        C24530h hVar = (C24530h) list.get(3);
        C24768aa aaVar = (C24768aa) list.get(4);
        ((C58970a) ((C58970a) C24673fc.f67495a.mo56224b()).mo56372aa(48853)).mo56386p("Sending native OCR stats request.");
        int i = C24674fd.f67496a;
        C58833ax a = C24435b.m45508a((C58833ax) list.get(5));
        C24653ej.m45755b(C24674fd.class, hVar);
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 3;
        pVar.f168327a |= 1;
        C62313ci ciVar = (C62313ci) C62314cj.f168217f.createBuilder();
        int width = bitmap.getWidth();
        ciVar.copyOnWrite();
        C62314cj cjVar = (C62314cj) ciVar.instance;
        cjVar.f168219a = 1 | cjVar.f168219a;
        cjVar.f168220b = width;
        int height = bitmap.getHeight();
        ciVar.copyOnWrite();
        C62314cj cjVar2 = (C62314cj) ciVar.instance;
        cjVar2.f168219a = 2 | cjVar2.f168219a;
        cjVar2.f168221c = height;
        C62971cq cqVar = tVar.f147065c;
        ciVar.copyOnWrite();
        C62314cj cjVar3 = (C62314cj) ciVar.instance;
        C62971cq cqVar2 = cjVar3.f168222d;
        if (!cqVar2.mo58948c()) {
            cjVar3.f168222d = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) cjVar3.f168222d);
        float f = aaVar.f67677c;
        ciVar.copyOnWrite();
        C62314cj cjVar4 = (C62314cj) ciVar.instance;
        cjVar4.f168219a |= 4;
        cjVar4.f168223e = f;
        oVar.copyOnWrite();
        C62353p pVar2 = (C62353p) oVar.instance;
        C62314cj cjVar5 = (C62314cj) ciVar.build();
        cjVar5.getClass();
        pVar2.f168329c = cjVar5;
        pVar2.f168328b = 4;
        try {
            C62355r b = onDeviceEngineNativeApi.mo30011b((C62353p) oVar.build());
            if (b.f168334a == 5) {
                clVar = (C62316cl) b.f168335b;
            } else {
                clVar = C62316cl.f168225b;
            }
            C58127b bVar = clVar.f168227a;
            if (bVar == null) {
                bVar = C58127b.f155392g;
            }
            C24653ej.m45756c(C24674fd.class, hVar, b);
            if (bVar.f155394a.size() > 0) {
                String str = (String) bVar.f155394a.get(0);
            }
            if (bVar.f155397d.size() > 0) {
                String str2 = (String) bVar.f155397d.get(0);
            }
            C24435b.m45509b(a);
            C55733v f2 = C24629dm.m45720f(bVar);
            C55730s sVar = (C55730s) tVar.toBuilder();
            sVar.copyOnWrite();
            C55731t tVar2 = (C55731t) sVar.instance;
            f2.getClass();
            C55733v vVar2 = tVar2.f147066d;
            if (vVar2 == null || vVar2 == (vVar = C55733v.f147070l)) {
                tVar2.f147066d = f2;
            } else {
                C55732u uVar = (C55732u) vVar.createBuilder(vVar2);
                uVar.mergeFrom(f2);
                tVar2.f147066d = (C55733v) uVar.buildPartial();
            }
            tVar2.f147063a |= 16;
            return C60856cj.m92900i((C55731t) sVar.build());
        } catch (C62974ct e) {
            e.toString();
            C24435b.m45509b(a);
            C24653ej.m45754a(C24674fd.class, hVar);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67498a.mo60297gq(), this.f67499c.mo60297gq(), this.f67500d.mo60297gq(), this.f67501e.mo60297gq(), this.f67502f.mo60297gq(), this.f67503g.mo60297gq());
    }
}
