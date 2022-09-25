package com.google.android.libraries.elements.p1727f;

import android.graphics.Rect;
import android.util.Pair;
import androidx.core.p097i.C1967b;
import com.facebook.litho.C6110au;
import com.facebook.yoga.C6575k;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.youtube.elements.p5166b.C66102g;
import com.google.protos.youtube.elements.p5166b.C66103h;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.google.protos.youtube.elements.p5166b.C66109n;
import com.google.protos.youtube.elements.p5166b.C66110o;
import com.google.protos.youtube.elements.p5166b.C66111p;
import com.google.protos.youtube.elements.p5166b.C66112q;
import com.google.protos.youtube.elements.p5166b.C66113r;

/* renamed from: com.google.android.libraries.elements.f.a */
/* compiled from: PG */
public final /* synthetic */ class C21152a implements C1967b {

    /* renamed from: a */
    public final /* synthetic */ C66112q f59336a;

    public /* synthetic */ C21152a(C66112q qVar) {
        this.f59336a = qVar;
    }

    /* renamed from: a */
    public final void mo3353a(Object obj) {
        C66111p pVar;
        C66105j jVar;
        C66112q qVar = this.f59336a;
        Pair pair = (Pair) obj;
        int i = C21160i.f59348d;
        int[] iArr = (int[]) pair.first;
        C6110au auVar = (C6110au) pair.second;
        Object i2 = auVar.mo12865i();
        if (i2 instanceof C21166o) {
            synchronized (((C21166o) i2).f59370e) {
                jVar = ((C21166o) i2).f59369d;
            }
            qVar.copyOnWrite();
            C66113r rVar = (C66113r) qVar.instance;
            C66113r rVar2 = C66113r.f179786e;
            jVar.getClass();
            C62971cq cqVar = rVar.f179789b;
            if (!cqVar.mo58948c()) {
                rVar.f179789b = C62942bv.mutableCopy(cqVar);
            }
            rVar.f179789b.add(jVar);
        }
        String k = auVar.mo12866k();
        if (k == null) {
            pVar = null;
        } else {
            C66110o oVar = (C66110o) C66111p.f179778g.createBuilder();
            oVar.copyOnWrite();
            C66111p pVar2 = (C66111p) oVar.instance;
            pVar2.f179780a |= 1;
            pVar2.f179781b = k;
            Rect a = auVar.mo12860a();
            C66102g gVar = (C66102g) C66103h.f179752f.createBuilder();
            int i3 = iArr[0];
            int i4 = a.left;
            gVar.copyOnWrite();
            C66103h hVar = (C66103h) gVar.instance;
            hVar.f179754a |= 1;
            hVar.f179755b = (float) (i3 + i4);
            int i5 = iArr[1];
            int i6 = a.top;
            gVar.copyOnWrite();
            C66103h hVar2 = (C66103h) gVar.instance;
            hVar2.f179754a |= 2;
            hVar2.f179756c = (float) (i5 + i6);
            int width = a.width();
            gVar.copyOnWrite();
            C66103h hVar3 = (C66103h) gVar.instance;
            hVar3.f179754a |= 4;
            hVar3.f179757d = (float) width;
            int height = a.height();
            gVar.copyOnWrite();
            C66103h hVar4 = (C66103h) gVar.instance;
            hVar4.f179754a |= 8;
            hVar4.f179758e = (float) height;
            C66103h hVar5 = (C66103h) gVar.build();
            oVar.copyOnWrite();
            C66111p pVar3 = (C66111p) oVar.instance;
            hVar5.getClass();
            pVar3.f179782c = hVar5;
            pVar3.f179780a |= 2;
            C6575k h = auVar.mo12864h();
            C66109n d = C21160i.m39730d(h.mo13668S(1), h.mo13668S(2), h.mo13668S(3), h.mo13668S(4));
            if (d != null) {
                oVar.copyOnWrite();
                C66111p pVar4 = (C66111p) oVar.instance;
                pVar4.f179783d = d;
                pVar4.f179780a |= 8;
            }
            C66109n d2 = C21160i.m39730d(h.mo13667R(1), h.mo13667R(2), h.mo13667R(3), h.mo13667R(4));
            if (d2 != null) {
                oVar.copyOnWrite();
                C66111p pVar5 = (C66111p) oVar.instance;
                pVar5.f179784e = d2;
                pVar5.f179780a |= 16;
            }
            C66109n d3 = C21160i.m39730d(h.mo13669T(1), h.mo13669T(2), h.mo13669T(3), h.mo13669T(4));
            if (d3 != null) {
                oVar.copyOnWrite();
                C66111p pVar6 = (C66111p) oVar.instance;
                pVar6.f179785f = d3;
                pVar6.f179780a |= 32;
            }
            pVar = (C66111p) oVar.build();
        }
        if (pVar != null) {
            qVar.copyOnWrite();
            C66113r rVar3 = (C66113r) qVar.instance;
            C66113r rVar4 = C66113r.f179786e;
            C62971cq cqVar2 = rVar3.f179791d;
            if (!cqVar2.mo58948c()) {
                rVar3.f179791d = C62942bv.mutableCopy(cqVar2);
            }
            rVar3.f179791d.add(pVar);
        }
    }
}
