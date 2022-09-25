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
import com.google.p4172bg.p4174b.C55719h;
import com.google.p4172bg.p4174b.C55726o;
import com.google.p4172bg.p4174b.C55727p;
import com.google.p4172bg.p4174b.C55730s;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.ondevice.k.bn */
/* compiled from: PG */
public final class C24576bn {

    /* renamed from: a */
    private static final C58974d f67265a = C58974d.m91135i("OcrRecognitionProducer");

    /* renamed from: a */
    static C55731t m45669a(Bitmap bitmap, C55719h hVar, C24553ar arVar, C24530h hVar2, C58833ax axVar) {
        C62286bi biVar;
        C24553ar arVar2 = arVar;
        C24530h hVar3 = hVar2;
        C58833ax a = C24435b.m45508a(axVar);
        ((C58970a) ((C58970a) f67265a.mo56224b()).mo56372aa(48846)).mo56386p("Sending native OCR recognition request");
        C24653ej.m45755b(C24577bo.class, hVar3);
        try {
            C55730s sVar = (C55730s) C55731t.f147061g.createBuilder();
            C63088z zVar = C63088z.f170246b;
            sVar.copyOnWrite();
            C55731t tVar = (C55731t) sVar.instance;
            zVar.getClass();
            tVar.f147063a |= 1;
            tVar.f147064b = zVar;
            C55726o oVar = (C55726o) C55727p.f147048f.createBuilder();
            oVar.copyOnWrite();
            C55727p pVar = (C55727p) oVar.instance;
            pVar.f147050a |= 256;
            pVar.f147051b = true;
            sVar.copyOnWrite();
            C55731t tVar2 = (C55731t) sVar.instance;
            C55727p pVar2 = (C55727p) oVar.build();
            pVar2.getClass();
            tVar2.f147067e = pVar2;
            tVar2.f147063a |= 32;
            C55731t tVar3 = (C55731t) sVar.build();
            C62352o oVar2 = (C62352o) C62353p.f168325e.createBuilder();
            oVar2.copyOnWrite();
            C62353p pVar3 = (C62353p) oVar2.instance;
            pVar3.f168330d = 2;
            pVar3.f168327a |= 1;
            C62282be beVar = (C62282be) C62284bg.f168146e.createBuilder();
            beVar.copyOnWrite();
            C62284bg bgVar = (C62284bg) beVar.instance;
            bgVar.f168151d = 2;
            bgVar.f168148a |= 1;
            C62287bj bjVar = (C62287bj) C62288bk.f168158e.createBuilder();
            C62363z zVar2 = (C62363z) C62251aa.f168060c.createBuilder();
            C62361x xVar = (C62361x) C62362y.f168351f.createBuilder();
            xVar.copyOnWrite();
            C62362y yVar = (C62362y) xVar.instance;
            yVar.f168353a |= 1;
            yVar.f168354b = 0;
            xVar.copyOnWrite();
            C62362y yVar2 = (C62362y) xVar.instance;
            yVar2.f168353a |= 2;
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
            zVar2.copyOnWrite();
            C62251aa aaVar = (C62251aa) zVar2.instance;
            C62362y yVar5 = (C62362y) xVar.build();
            yVar5.getClass();
            aaVar.f168063b = yVar5;
            aaVar.f168062a |= 1;
            bjVar.copyOnWrite();
            C62288bk bkVar = (C62288bk) bjVar.instance;
            C62251aa aaVar2 = (C62251aa) zVar2.build();
            aaVar2.getClass();
            bkVar.f168161b = aaVar2;
            bkVar.f168160a = 1 | bkVar.f168160a;
            bjVar.copyOnWrite();
            C62288bk bkVar2 = (C62288bk) bjVar.instance;
            tVar3.getClass();
            bkVar2.f168162c = tVar3;
            bkVar2.f168160a |= 2;
            bjVar.copyOnWrite();
            C62288bk bkVar3 = (C62288bk) bjVar.instance;
            hVar.getClass();
            bkVar3.f168163d = hVar;
            bkVar3.f168160a |= 4;
            beVar.copyOnWrite();
            C62284bg bgVar2 = (C62284bg) beVar.instance;
            C62288bk bkVar4 = (C62288bk) bjVar.build();
            bkVar4.getClass();
            bgVar2.f168150c = bkVar4;
            bgVar2.f168149b = 3;
            oVar2.copyOnWrite();
            C62353p pVar4 = (C62353p) oVar2.instance;
            C62284bg bgVar3 = (C62284bg) beVar.build();
            bgVar3.getClass();
            pVar4.f168329c = bgVar3;
            pVar4.f168328b = 3;
            C62355r a2 = arVar2.mo29953a((C62353p) oVar2.build(), bitmap);
            if (a2.f168334a == 4) {
                biVar = (C62286bi) a2.f168335b;
            } else {
                biVar = C62286bi.f168153b;
            }
            C55731t tVar4 = biVar.f168155a;
            if (tVar4 == null) {
                tVar4 = C55731t.f147061g;
            }
            C24653ej.m45757d(C24577bo.class, hVar3, C24657en.m45761a(tVar4), a2);
            String.format("Lines: " + tVar4.f147065c.size() + ", OCR Model: " + ((String) arVar2.f67235a.mo56109e("null")), new Object[0]);
            C24435b.m45509b(a);
            return tVar4;
        } catch (C62974ct e) {
            e.toString();
            C24435b.m45509b(a);
            C24653ej.m45754a(C24577bo.class, hVar3);
            throw e;
        }
    }
}
