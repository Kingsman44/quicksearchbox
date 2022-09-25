package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4701g.C62251aa;
import com.google.lens.p4701g.C62282be;
import com.google.lens.p4701g.C62284bg;
import com.google.lens.p4701g.C62286bi;
import com.google.lens.p4701g.C62287bj;
import com.google.lens.p4701g.C62288bk;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4701g.C62361x;
import com.google.lens.p4701g.C62362y;
import com.google.lens.p4701g.C62363z;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ba */
/* compiled from: PG */
public final class C24563ba {

    /* renamed from: a */
    private static final C58974d f67249a = C58974d.m91135i("OcrStandaloneRecognitionProducer");

    /* renamed from: a */
    static C55731t m45651a(Bitmap bitmap, C24553ar arVar, C24530h hVar, C58833ax axVar) {
        C62286bi biVar;
        C58833ax a = C24435b.m45508a(axVar);
        ((C58970a) ((C58970a) f67249a.mo56224b()).mo56372aa(48844)).mo56386p("Sending OCR standalone recognition request.");
        C24653ej.m45755b(C24564bb.class, hVar);
        try {
            C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
            oVar.copyOnWrite();
            C62353p pVar = (C62353p) oVar.instance;
            pVar.f168330d = 2;
            pVar.f168327a |= 1;
            C62282be beVar = (C62282be) C62284bg.f168146e.createBuilder();
            beVar.copyOnWrite();
            C62284bg bgVar = (C62284bg) beVar.instance;
            bgVar.f168151d = 2;
            bgVar.f168148a |= 1;
            C62287bj bjVar = (C62287bj) C62288bk.f168158e.createBuilder();
            C62363z zVar = (C62363z) C62251aa.f168060c.createBuilder();
            C62361x xVar = (C62361x) C62362y.f168351f.createBuilder();
            xVar.copyOnWrite();
            C62362y yVar = (C62362y) xVar.instance;
            yVar.f168353a |= 1;
            yVar.f168354b = 0;
            xVar.copyOnWrite();
            C62362y yVar2 = (C62362y) xVar.instance;
            yVar2.f168353a = 2 | yVar2.f168353a;
            yVar2.f168355c = 0;
            int width = bitmap.getWidth();
            xVar.copyOnWrite();
            C62362y yVar3 = (C62362y) xVar.instance;
            yVar3.f168353a |= 4;
            yVar3.f168356d = width;
            int height = bitmap.getHeight();
            xVar.copyOnWrite();
            C62362y yVar4 = (C62362y) xVar.instance;
            yVar4.f168353a |= 8;
            yVar4.f168357e = height;
            zVar.copyOnWrite();
            C62251aa aaVar = (C62251aa) zVar.instance;
            C62362y yVar5 = (C62362y) xVar.build();
            yVar5.getClass();
            aaVar.f168063b = yVar5;
            aaVar.f168062a |= 1;
            bjVar.copyOnWrite();
            C62288bk bkVar = (C62288bk) bjVar.instance;
            C62251aa aaVar2 = (C62251aa) zVar.build();
            aaVar2.getClass();
            bkVar.f168161b = aaVar2;
            bkVar.f168160a |= 1;
            beVar.copyOnWrite();
            C62284bg bgVar2 = (C62284bg) beVar.instance;
            C62288bk bkVar2 = (C62288bk) bjVar.build();
            bkVar2.getClass();
            bgVar2.f168150c = bkVar2;
            bgVar2.f168149b = 3;
            oVar.copyOnWrite();
            C62353p pVar2 = (C62353p) oVar.instance;
            C62284bg bgVar3 = (C62284bg) beVar.build();
            bgVar3.getClass();
            pVar2.f168329c = bgVar3;
            pVar2.f168328b = 3;
            C62355r a2 = arVar.mo29953a((C62353p) oVar.build(), bitmap);
            if (a2.f168334a == 4) {
                biVar = (C62286bi) a2.f168335b;
            } else {
                biVar = C62286bi.f168153b;
            }
            C55731t tVar = biVar.f168155a;
            if (tVar == null) {
                tVar = C55731t.f147061g;
            }
            C24653ej.m45756c(C24564bb.class, hVar, a2);
            tVar.f147065c.size();
            String str = (String) arVar.f67235a.mo56109e("null");
            C24435b.m45509b(a);
            return tVar;
        } catch (C62974ct e) {
            e.toString();
            C24435b.m45509b(a);
            C24653ej.m45754a(C24564bb.class, hVar);
            throw e;
        }
    }
}
