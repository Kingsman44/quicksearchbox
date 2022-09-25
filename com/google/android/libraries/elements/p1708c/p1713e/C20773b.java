package com.google.android.libraries.elements.p1708c.p1713e;

import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.C20800am;
import com.google.android.libraries.elements.p1714d.C20929dy;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66222ei;

/* renamed from: com.google.android.libraries.elements.c.e.b */
/* compiled from: PG */
public final class C20773b implements C21270bm {
    /* renamed from: a */
    public final C62917ay mo25837a() {
        return C66222ei.f180074g;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C66222ei eiVar = (C66222ei) obj;
        if (arVar.mo25928E() instanceof C20800am) {
            C20800am amVar = (C20800am) arVar.mo25928E();
            float f = eiVar.f180078c;
            amVar.f58233a.f58238C = (float) amVar.f18979b.mo13257a(f);
            if ((eiVar.f180076a & 4) != 0) {
                float f2 = eiVar.f180079d;
                amVar.f58233a.f58236A = Float.valueOf((float) amVar.f18979b.mo13257a(f2));
            }
            if ((eiVar.f180076a & 8) != 0) {
                float f3 = eiVar.f180080e;
                amVar.f58233a.f58237B = Float.valueOf((float) amVar.f18979b.mo13257a(f3));
            }
            if ((eiVar.f180076a & 1) != 0) {
                amVar.f58233a.f58239D = Integer.valueOf(eiVar.f180077b);
            }
        }
        if (arVar.mo25928E() instanceof C20929dy) {
            C20929dy dyVar = (C20929dy) arVar.mo25928E();
            float f4 = eiVar.f180078c;
            dyVar.f58694a.f59037G = (float) dyVar.f18979b.mo13257a(f4);
            float f5 = eiVar.f180079d;
            dyVar.f58694a.f59035E = (float) dyVar.f18979b.mo13257a(f5);
            float f6 = eiVar.f180080e;
            dyVar.f58694a.f59036F = (float) dyVar.f18979b.mo13257a(f6);
            if ((eiVar.f180076a & 1) != 0) {
                dyVar.f58694a.f59034D = Integer.valueOf(eiVar.f180077b);
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
