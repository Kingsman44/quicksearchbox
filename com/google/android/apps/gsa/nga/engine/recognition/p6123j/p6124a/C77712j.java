package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.p6119h.p6120a.C77652a;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80546a;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.protobuf.C63088z;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.j */
/* compiled from: PG */
final class C77712j {
    /* renamed from: a */
    static final void m124684a(C77566as asVar, ac acVar, C91142g gVar, ByteArrayOutputStream byteArrayOutputStream, C77652a aVar) {
        if (gVar.mo85405j(C90126fx.f251044bQ)) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length != 0) {
                C80546a aVar2 = (C80546a) C80547b.f221090g.createBuilder();
                C63088z A = C63088z.m96139A(byteArray);
                aVar2.copyOnWrite();
                C80547b bVar = (C80547b) aVar2.instance;
                bVar.f221092a |= 1;
                bVar.f221093b = A;
                int c = asVar.mo72680c();
                aVar2.copyOnWrite();
                C80547b bVar2 = (C80547b) aVar2.instance;
                bVar2.f221092a |= 2;
                bVar2.f221094c = c;
                int bitCount = Integer.bitCount(asVar.mo72678a());
                aVar2.copyOnWrite();
                C80547b bVar3 = (C80547b) aVar2.instance;
                bVar3.f221092a |= 4;
                bVar3.f221095d = bitCount;
                C83320io b = acVar.b();
                aVar2.copyOnWrite();
                C80547b bVar4 = (C80547b) aVar2.instance;
                b.getClass();
                bVar4.f221096e = b;
                bVar4.f221092a |= 8;
                aVar.f213880c.set((C80547b) aVar2.build());
            }
        }
    }
}
