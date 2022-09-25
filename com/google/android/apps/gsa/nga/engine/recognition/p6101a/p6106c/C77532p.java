package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import android.os.Build;
import com.google.android.apps.gsa.nga.engine.recognition.C77548aa;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82314ap;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82315aq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82544jc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82545jd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82779ac;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82780ad;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.p */
/* compiled from: PG */
public final /* synthetic */ class C77532p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77534r f213610a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f213611b;

    /* renamed from: c */
    public final /* synthetic */ C77566as f213612c;

    /* renamed from: d */
    public final /* synthetic */ C80561f f213613d;

    public /* synthetic */ C77532p(C77534r rVar, C58872ci ciVar, C77566as asVar, C80561f fVar) {
        this.f213610a = rVar;
        this.f213611b = ciVar;
        this.f213612c = asVar;
        this.f213613d = fVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C37519dz dzVar;
        C37519dz dzVar2;
        C37519dz dzVar3;
        C60870cx cxVar;
        C37563ed edVar;
        C77534r rVar = this.f213610a;
        C58872ci ciVar = this.f213611b;
        C77566as asVar = this.f213612c;
        C80561f fVar = this.f213613d;
        C37400be beVar = (C37400be) obj;
        C37561eb ebVar = beVar.mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 1) {
            C77509a aVar = rVar.f213619e;
            long a = ciVar.mo56158a(TimeUnit.MILLISECONDS);
            int m = asVar.mo72690m();
            C83305i iVar = aVar.f213571a;
            String a2 = C77568au.m124486a(m);
            if (m != 0) {
                iVar.mo75579d(new C82314ap("MIC_OPEN_LATENCY", Double.valueOf((double) a), a2, aVar.f213573c.mo72021b().mo72042g()));
                C58833ax d = beVar.mo40932d();
                if (!d.mo56113h()) {
                    cxVar = C60856cj.m92900i(Optional.empty());
                } else {
                    cxVar = rVar.f213616b.mo28209i((C60870cx) d.mo56107c(), "[NGA] AudioLibraryMicStateHandler.getTickerFirstByteReceivedElapsedTime", C77522f.f213595a);
                }
                C90873ag agVar = new C90873ag(cxVar, rVar.f213616b, "[NGA] AudioLibraryMicStateHandler.notifyMicOpened", new C77533q(rVar));
                agVar.mo85224b(Exception.class, new C77520d(rVar, fVar));
                agVar.mo85223a(new C77521e(rVar, fVar));
                C58970a aVar2 = (C58970a) ((C58970a) C77534r.f213615a.mo56224b()).mo56372aa(4283);
                int i = fVar.f221127b;
                if (ebVar.f99802a == 1) {
                    edVar = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
                    if (edVar == null) {
                        edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                    }
                } else {
                    edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                }
                aVar2.mo56395y("Microphone(id=%d) opened successfully with status: %s", i, edVar.name());
            } else {
                throw null;
            }
        } else {
            C81459h hVar = rVar.f213627m;
            C77548aa n = asVar.mo72691n();
            if (ebVar.f99802a == 2) {
                dzVar2 = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar2 == null) {
                    dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            hVar.mo75090a(new C58835az(n, dzVar2));
            C58970a aVar3 = (C58970a) ((C58970a) C77534r.f213615a.mo56224b()).mo56372aa(4282);
            int i2 = fVar.f221127b;
            if (ebVar.f99802a == 2) {
                dzVar3 = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar3 == null) {
                    dzVar3 = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar3 = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            aVar3.mo56395y("Microphone(id=%d) didn't open successfully with status: %s", i2, dzVar3.name());
        }
        rVar.f213625k.mo75090a(new C58835az(fVar, ebVar));
        C77509a aVar4 = rVar.f213619e;
        int m2 = asVar.mo72690m();
        int i3 = ebVar.f99802a;
        if (i3 == 1) {
            C37563ed a3 = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
            if (a3 == null) {
                a3 = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            str = a3.name();
        } else {
            if (i3 == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            str = dzVar.name();
        }
        C83305i iVar2 = aVar4.f213571a;
        C82544jc j = C82545jd.m131436j();
        C82315aq aqVar = (C82315aq) j;
        aqVar.f224852b = "OPEN";
        j.mo75665e(str);
        String a4 = C77568au.m124486a(m2);
        if (m2 != 0) {
            aqVar.f224853c = a4;
            j.mo75664d(aVar4.f213573c.mo72021b().mo72042g());
            j.mo75663c();
            j.mo75662b(Build.VERSION.SDK_INT);
            iVar2.mo75579d(j.mo75661a());
            C83334w wVar = aVar4.f213572b;
            C82887ec ecVar = C82887ec.AUDIO_LIBRARY_MIC_EVENT;
            C82883dz dzVar4 = (C82883dz) C82885ea.f225977c.createBuilder();
            C82779ac acVar = (C82779ac) C82780ad.f225550e.createBuilder();
            acVar.copyOnWrite();
            C82780ad adVar = (C82780ad) acVar.instance;
            ebVar.getClass();
            adVar.f225553b = ebVar;
            adVar.f225552a |= 1;
            acVar.copyOnWrite();
            C82780ad adVar2 = (C82780ad) acVar.instance;
            adVar2.f225554c = m2;
            adVar2.f225552a |= 2;
            acVar.copyOnWrite();
            C82780ad adVar3 = (C82780ad) acVar.instance;
            adVar3.f225552a |= 4;
            adVar3.f225555d = false;
            C82780ad adVar4 = (C82780ad) acVar.build();
            dzVar4.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar4.instance;
            adVar4.getClass();
            eaVar.f225980b = adVar4;
            eaVar.f225979a = 79;
            wVar.mo75543a(ecVar, (C82885ea) dzVar4.build());
            return C118826c.f331422a;
        }
        throw null;
    }
}
