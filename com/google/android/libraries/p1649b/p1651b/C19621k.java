package com.google.android.libraries.p1649b.p1651b;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.p1649b.p1650a.C19607d;
import com.google.android.libraries.p1649b.p1650a.C19609f;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4816ai.p4817a.C63188b;
import com.google.protos.p4816ai.p4817a.C63192f;

/* renamed from: com.google.android.libraries.b.b.k */
/* compiled from: PG */
public final class C19621k {

    /* renamed from: a */
    public static final String f54601a = "k";

    private C19621k() {
    }

    /* renamed from: a */
    public static C19609f m37454a(View view, C60214n nVar, boolean z, boolean z2, C19610g gVar) {
        C19609f fVar;
        int i;
        if (!(view == null || (nVar.f162916a & 2048) == 0)) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (z) {
                if (!z2) {
                    C60218r rVar = nVar.f162921f;
                    if (rVar == null) {
                        rVar = C60218r.f162925d;
                    }
                    i = gVar.mo24941a(rVar);
                } else {
                    i = -1;
                }
                fVar = new C19609f(view.getWidth(), view.getHeight(), iArr[0], iArr[1] + gVar.f54571b, nVar, i);
            } else if ((nVar.f162916a & 1) != 0) {
                C60218r rVar2 = nVar.f162921f;
                if (rVar2 == null) {
                    rVar2 = C60218r.f162925d;
                }
                int a = gVar.mo24941a(rVar2);
                int i2 = nVar.f162917b;
                int width = view.getWidth();
                int height = view.getHeight();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = gVar.f54571b;
                C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
                mVar.copyOnWrite();
                C60214n nVar2 = (C60214n) mVar.instance;
                nVar2.f162916a |= 1;
                nVar2.f162917b = i2;
                fVar = new C19609f(width, height, i3, i4 + i5, (C60214n) mVar.build(), a);
            } else {
                Log.w(f54601a, "ClickTrackingCGI must use ve_index when using legacy VE identifier fields");
            }
            if (fVar.f54564a == 0 && fVar.f54565b == 0) {
                return null;
            }
            return fVar;
        }
        return null;
    }

    /* renamed from: b */
    public static void m37455b(C63188b bVar, C19609f fVar, boolean z, C19607d dVar) {
        int i = fVar.f54566c;
        bVar.copyOnWrite();
        C63192f fVar2 = (C63192f) bVar.instance;
        C63192f fVar3 = C63192f.f170699q;
        fVar2.f170701a |= 4;
        fVar2.f170706f = i;
        int i2 = fVar.f54567d;
        bVar.copyOnWrite();
        C63192f fVar4 = (C63192f) bVar.instance;
        fVar4.f170701a |= 8;
        fVar4.f170707g = i2;
        int i3 = fVar.f54564a;
        bVar.copyOnWrite();
        C63192f fVar5 = (C63192f) bVar.instance;
        fVar5.f170701a |= 32;
        fVar5.f170709i = i3;
        int i4 = fVar.f54565b;
        bVar.copyOnWrite();
        C63192f fVar6 = (C63192f) bVar.instance;
        fVar6.f170701a |= 16;
        fVar6.f170708h = i4;
        int i5 = fVar.f54569f;
        C60214n nVar = fVar.f54568e;
        if (z) {
            if (i5 == -1) {
                i5 = -1;
            } else if ((nVar.f162916a & 2048) != 0) {
                C60213m mVar = (C60213m) nVar.toBuilder();
                mVar.copyOnWrite();
                C60214n nVar2 = (C60214n) mVar.instance;
                nVar2.f162921f = null;
                nVar2.f162916a &= -2049;
                bVar.copyOnWrite();
                C63192f fVar7 = (C63192f) bVar.instance;
                C60214n nVar3 = (C60214n) mVar.build();
                nVar3.getClass();
                fVar7.f170703c = nVar3;
                fVar7.f170702b = 19;
            }
            bVar.copyOnWrite();
            C63192f fVar8 = (C63192f) bVar.instance;
            nVar.getClass();
            fVar8.f170703c = nVar;
            fVar8.f170702b = 19;
        } else {
            int i6 = nVar.f162917b;
            bVar.copyOnWrite();
            C63192f fVar9 = (C63192f) bVar.instance;
            fVar9.f170702b = 10;
            fVar9.f170703c = Integer.valueOf(i6);
        }
        if (i5 != -1) {
            bVar.copyOnWrite();
            C63192f fVar10 = (C63192f) bVar.instance;
            fVar10.f170701a |= 8192;
            fVar10.f170714n = i5;
        }
        dVar.mo24936c((C63192f) bVar.build());
    }

    /* renamed from: c */
    public static void m37456c(C19609f fVar, long j, boolean z, C19607d dVar, C60931s sVar) {
        if (dVar.f54554a) {
            C63188b bVar = (C63188b) C19607d.m37427e(j, 2).toBuilder();
            if (sVar != null) {
                C60856cj.m92911t(C60922j.m93045h(C60838bs.m92859i(C60856cj.m92900i(bVar)), sVar, C60826bg.f164896a), new C19620j(fVar, z, dVar, bVar), C60826bg.f164896a);
            } else {
                m37455b(bVar, fVar, z, dVar);
            }
        }
    }
}
