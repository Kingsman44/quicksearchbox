package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.p2025e.C24435b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4701g.C62251aa;
import com.google.lens.p4701g.C62264an;
import com.google.lens.p4701g.C62265ao;
import com.google.lens.p4701g.C62266ap;
import com.google.lens.p4701g.C62268ar;
import com.google.lens.p4701g.C62270at;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4701g.C62361x;
import com.google.lens.p4701g.C62362y;
import com.google.lens.p4701g.C62363z;
import com.google.p4172bg.p4174b.C55719h;
import com.google.p4172bg.p4174b.C55727p;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.lens.ondevice.k.av */
/* compiled from: PG */
public final class C24557av {

    /* renamed from: a */
    private static final C58974d f67240a = C58974d.m91135i("OcrDetectionProducer");

    /* renamed from: a */
    static C55719h m45642a(Bitmap bitmap, C24553ar arVar, C58833ax axVar, C24530h hVar) {
        C62270at atVar;
        C58833ax a = C24435b.m45508a(axVar);
        ((C58970a) ((C58970a) f67240a.mo56224b()).mo56372aa(48843)).mo56386p("Sending native OCR detection request.");
        C24653ej.m45755b(C24558aw.class, hVar);
        try {
            C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
            oVar.copyOnWrite();
            C62353p pVar = (C62353p) oVar.instance;
            pVar.f168330d = 1;
            pVar.f168327a |= 1;
            C62266ap apVar = (C62266ap) C62268ar.f168113e.createBuilder();
            apVar.copyOnWrite();
            C62268ar arVar2 = (C62268ar) apVar.instance;
            arVar2.f168118d = 2;
            arVar2.f168115a |= 1;
            C62264an anVar = (C62264an) C62265ao.f168107d.createBuilder();
            C62363z zVar = (C62363z) C62251aa.f168060c.createBuilder();
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
            zVar.copyOnWrite();
            C62251aa aaVar = (C62251aa) zVar.instance;
            C62362y yVar5 = (C62362y) xVar.build();
            yVar5.getClass();
            aaVar.f168063b = yVar5;
            aaVar.f168062a |= 1;
            anVar.copyOnWrite();
            C62265ao aoVar = (C62265ao) anVar.instance;
            C62251aa aaVar2 = (C62251aa) zVar.build();
            aaVar2.getClass();
            aoVar.f168110b = aaVar2;
            aoVar.f168109a = 1 | aoVar.f168109a;
            C55727p a2 = C24581bs.m45677a();
            anVar.copyOnWrite();
            C62265ao aoVar2 = (C62265ao) anVar.instance;
            a2.getClass();
            aoVar2.f168111c = a2;
            aoVar2.f168109a |= 2;
            apVar.copyOnWrite();
            C62268ar arVar3 = (C62268ar) apVar.instance;
            C62265ao aoVar3 = (C62265ao) anVar.build();
            aoVar3.getClass();
            arVar3.f168117c = aoVar3;
            arVar3.f168116b = 3;
            oVar.copyOnWrite();
            C62353p pVar2 = (C62353p) oVar.instance;
            C62268ar arVar4 = (C62268ar) apVar.build();
            arVar4.getClass();
            pVar2.f168329c = arVar4;
            pVar2.f168328b = 2;
            C62355r a3 = arVar.mo29953a((C62353p) oVar.build(), bitmap);
            if (a3.f168334a == 3) {
                atVar = (C62270at) a3.f168335b;
            } else {
                atVar = C62270at.f168119b;
            }
            C55719h hVar2 = atVar.f168121a;
            if (hVar2 == null) {
                hVar2 = C55719h.f147013b;
            }
            C24653ej.m45756c(C24558aw.class, hVar, a3);
            hVar2.f147015a.size();
            C24435b.m45509b(a);
            return hVar2;
        } catch (C62974ct e) {
            e.toString();
            C24435b.m45509b(a);
            C24653ej.m45754a(C24558aw.class, hVar);
            throw e;
        }
    }
}
