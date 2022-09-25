package com.google.android.apps.gsa.silentfeedback;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86110f;
import com.google.android.apps.gsa.search.core.p6805i.C86111g;
import com.google.android.apps.gsa.search.core.p6805i.C86112h;
import com.google.android.apps.gsa.search.core.p6805i.C86113i;
import com.google.android.gms.phenotype.Flag;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21708a;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21712e;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21714g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.p343ac.p346b.C6648j;
import com.google.p343ac.p346b.C6653o;
import com.google.p343ac.p346b.C6654p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.silentfeedback.f */
/* compiled from: PG */
public final class C92013f {

    /* renamed from: a */
    private static final C59071e f256537a = C59071e.m91332i("com.google.android.apps.gsa.silentfeedback.f");

    /* renamed from: a */
    public static C86111g m151026a(C21708a aVar, long j) {
        String str = aVar.f60026a.f393982c;
        C86110f fVar = (C86110f) C86111g.f232741g.createBuilder();
        fVar.copyOnWrite();
        C86111g gVar = (C86111g) fVar.instance;
        gVar.f232743a |= 1;
        gVar.f232745c = j;
        fVar.copyOnWrite();
        C86111g gVar2 = (C86111g) fVar.instance;
        str.getClass();
        gVar2.f232743a |= 2;
        gVar2.f232748f = str;
        for (C21712e a : aVar.mo27073a()) {
            for (C21714g gVar3 : a.mo27075a()) {
                try {
                    int parseInt = Integer.parseInt(gVar3.f60030a.f394003a);
                    C86112h hVar = (C86112h) C86113i.f232749f.createBuilder();
                    hVar.copyOnWrite();
                    C86113i iVar = (C86113i) hVar.instance;
                    iVar.f232751a |= 2;
                    iVar.f232755e = parseInt;
                    Flag flag = gVar3.f60030a;
                    int i = flag.f394009g;
                    if (i == 1) {
                        long b = flag.mo121837b();
                        hVar.copyOnWrite();
                        C86113i iVar2 = (C86113i) hVar.instance;
                        iVar2.f232752b = 4;
                        iVar2.f232753c = Long.valueOf(b);
                    } else if (i == 2) {
                        boolean e = flag.mo121841e();
                        hVar.copyOnWrite();
                        C86113i iVar3 = (C86113i) hVar.instance;
                        iVar3.f232752b = 2;
                        iVar3.f232753c = Boolean.valueOf(e);
                    } else if (i == 3) {
                        double a2 = flag.mo121836a();
                        hVar.copyOnWrite();
                        C86113i iVar4 = (C86113i) hVar.instance;
                        iVar4.f232752b = 7;
                        iVar4.f232753c = Double.valueOf(a2);
                    } else if (i == 4) {
                        String c = flag.mo121838c();
                        hVar.copyOnWrite();
                        C86113i iVar5 = (C86113i) hVar.instance;
                        iVar5.f232752b = 3;
                        iVar5.f232753c = c;
                    } else if (i == 5) {
                        C63088z A = C63088z.m96139A(flag.mo121843f());
                        hVar.copyOnWrite();
                        C86113i iVar6 = (C86113i) hVar.instance;
                        iVar6.f232752b = 6;
                        iVar6.f232753c = A;
                    }
                    fVar.copyOnWrite();
                    C86111g gVar4 = (C86111g) fVar.instance;
                    C86113i iVar7 = (C86113i) hVar.build();
                    iVar7.getClass();
                    gVar4.mo79732a();
                    gVar4.f232744b.add(iVar7);
                } catch (NumberFormatException unused) {
                    ((C59052c) ((C59052c) f256537a.mo56226d()).mo56372aa(11956)).mo56389s("Can't format flag %s to integer.", gVar3.f60030a.f394003a);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                C6654p pVar = (C6654p) C62942bv.parseFrom((C62942bv) C6654p.f19890c, C59326i.f157517e.mo56836k(str), C62921ba.m95368a());
                int a3 = C6653o.m18011a(pVar.f19892a);
                if (a3 != 0) {
                    if (a3 == 3) {
                        C6648j jVar = (C6648j) C62942bv.parseFrom((C62942bv) C6648j.f19882c, pVar.f19893b, C62921ba.m95368a());
                        fVar.mo79729a(jVar.f19884a);
                        fVar.mo79731c(jVar.f19885b);
                    }
                }
            } catch (C62974ct | IllegalArgumentException e2) {
                ((C59052c) ((C59052c) ((C59052c) f256537a.mo56225c()).mo56382g(e2)).mo56372aa(11957)).mo56386p("Failed to decode experiment IDs.");
            }
        }
        return (C86111g) fVar.build();
    }
}
