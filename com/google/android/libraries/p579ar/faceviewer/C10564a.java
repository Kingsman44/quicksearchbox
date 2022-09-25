package com.google.android.libraries.p579ar.faceviewer;

import android.util.Log;
import com.google.android.libraries.p579ar.faceviewer.p580a.p583c.C10577b;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10651b;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p363ad.p364a.C6671ac;
import com.google.p363ad.p364a.C6677ai;
import com.google.p363ad.p364a.C6685i;
import com.google.p363ad.p364a.C6687k;
import com.google.p363ad.p364a.C6688l;
import com.google.p363ad.p364a.C6691o;
import com.google.p363ad.p364a.C6692p;
import com.google.p363ad.p364a.C6702z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.ar.faceviewer.a */
/* compiled from: PG */
public final /* synthetic */ class C10564a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10661e f35343a;

    /* renamed from: b */
    public final /* synthetic */ C6677ai f35344b;

    /* renamed from: c */
    public final /* synthetic */ int f35345c;

    public /* synthetic */ C10564a(C10661e eVar, C6677ai aiVar, int i) {
        this.f35343a = eVar;
        this.f35344b = aiVar;
        this.f35345c = i;
    }

    public final Object apply(Object obj) {
        C6671ac acVar;
        C10661e eVar = this.f35343a;
        C6677ai aiVar = this.f35344b;
        int i = this.f35345c;
        C10650a aVar = new C10650a(eVar.f35570k, new C10651b(aiVar, i), eVar.f35569j, eVar.f35568i, eVar.f35567h, (CronetEngine) obj);
        for (C10652c c : eVar.f35561b) {
            c.mo18628c(aVar);
        }
        if (!aVar.f35545a.mo18694c()) {
            eVar.f35564e.mo18639d();
        }
        C10577b bVar = aVar.f35549e.f35542a;
        C6691o oVar = (C6691o) C6692p.f19980e.createBuilder();
        int i2 = aiVar.f19943b;
        if (i2 == 1) {
            String str = (String) aiVar.f19944c;
            oVar.copyOnWrite();
            C6692p pVar = (C6692p) oVar.instance;
            str.getClass();
            pVar.f19983b = 1;
            pVar.f19984c = str;
        } else if (i2 == 6) {
            C6687k kVar = (C6687k) C6688l.f19967b.createBuilder();
            if (aiVar.f19943b == 6) {
                acVar = (C6671ac) aiVar.f19944c;
            } else {
                acVar = C6671ac.f19926b;
            }
            C62971cq cqVar = acVar.f19928a;
            kVar.copyOnWrite();
            C6688l lVar = (C6688l) kVar.instance;
            C62971cq cqVar2 = lVar.f19969a;
            if (!cqVar2.mo58948c()) {
                lVar.f19969a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) lVar.f19969a);
            oVar.copyOnWrite();
            C6692p pVar2 = (C6692p) oVar.instance;
            C6688l lVar2 = (C6688l) kVar.build();
            lVar2.getClass();
            pVar2.f19984c = lVar2;
            pVar2.f19983b = 2;
        }
        C10653d dVar = bVar.f35390c;
        if (dVar != null) {
            int i3 = ((C10650a) dVar).f35549e.f35544c.f35564e.f35396b;
            oVar.copyOnWrite();
            C6692p pVar3 = (C6692p) oVar.instance;
            int i4 = i3 - 1;
            if (i3 != 0) {
                pVar3.f19985d = i4;
                pVar3.f19982a |= 4;
            } else {
                throw null;
            }
        }
        C10662f fVar = bVar.f35389b;
        C6685i a = bVar.mo18634a();
        C6692p pVar4 = (C6692p) oVar.build();
        a.copyOnWrite();
        C6702z zVar = (C6702z) a.instance;
        C6702z zVar2 = C6702z.f20007e;
        pVar4.getClass();
        zVar.f20011c = pVar4;
        zVar.f20010b = 2;
        fVar.mo18697a(a);
        if (Log.isLoggable(C10662f.f35572a, 3)) {
            ((C59052c) ((C59052c) C10662f.f35573b.mo56224b()).mo56372aa(42277)).mo56386p("DefaultPlatformLogger: logVeEnteredExperience.");
        }
        return null;
    }
}
