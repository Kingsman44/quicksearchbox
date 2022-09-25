package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.protos.p4985f.p4986a.C64649ac;
import com.google.protos.p4985f.p4986a.C64650ad;
import com.google.protos.p4985f.p4986a.C64679bf;
import com.google.protos.p4985f.p4986a.C64680bg;
import com.google.protos.p4985f.p4986a.C64686bm;
import com.google.protos.p4985f.p4986a.C64687bn;
import com.google.protos.p4985f.p4986a.C64709s;
import com.google.protos.p4985f.p4986a.C64710t;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.m */
/* compiled from: PG */
public final /* synthetic */ class C22141m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C64710t f61060a;

    public /* synthetic */ C22141m(C64710t tVar) {
        this.f61060a = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C64680bg bgVar;
        C64687bn bnVar;
        C64680bg bgVar2;
        C64680bg bgVar3;
        C64687bn bnVar2;
        C64680bg bgVar4;
        C64687bn bnVar3;
        C64680bg bgVar5;
        C64680bg bgVar6;
        C64687bn bnVar4;
        C64710t tVar = this.f61060a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C64709s sVar = (C64709s) tVar.toBuilder();
            sVar.copyOnWrite();
            ((C64710t) sVar.instance).f175416a = C64710t.emptyProtobufList();
            for (C64650ad adVar : tVar.f175416a) {
                if (adVar.f175245a == 6) {
                    bgVar4 = (C64680bg) adVar.f175246b;
                } else {
                    bgVar4 = C64680bg.f175329c;
                }
                if (bgVar4.f175331a == 1) {
                    bnVar3 = (C64687bn) bgVar4.f175332b;
                } else {
                    bnVar3 = C64687bn.f175340d;
                }
                if (bnVar3.f175343b.equals("/ml/action-user-model-ml-tflite-prod/ucm.linear-callduration-ondevice-v1")) {
                    C64649ac acVar = (C64649ac) adVar.toBuilder();
                    if (adVar.f175245a == 6) {
                        bgVar5 = (C64680bg) adVar.f175246b;
                    } else {
                        bgVar5 = C64680bg.f175329c;
                    }
                    C64679bf bfVar = (C64679bf) bgVar5.toBuilder();
                    if (adVar.f175245a == 6) {
                        bgVar6 = (C64680bg) adVar.f175246b;
                    } else {
                        bgVar6 = C64680bg.f175329c;
                    }
                    if (bgVar6.f175331a == 1) {
                        bnVar4 = (C64687bn) bgVar6.f175332b;
                    } else {
                        bnVar4 = C64687bn.f175340d;
                    }
                    C64686bm bmVar = (C64686bm) bnVar4.toBuilder();
                    bmVar.copyOnWrite();
                    C64687bn bnVar5 = (C64687bn) bmVar.instance;
                    bnVar5.f175342a |= 1;
                    bnVar5.f175343b = "/ml/action-user-model-ml-tflite-prod/ucm.linear-callduration-v1";
                    bfVar.copyOnWrite();
                    C64680bg bgVar7 = (C64680bg) bfVar.instance;
                    C64687bn bnVar6 = (C64687bn) bmVar.build();
                    bnVar6.getClass();
                    bgVar7.f175332b = bnVar6;
                    bgVar7.f175331a = 1;
                    acVar.copyOnWrite();
                    C64650ad adVar2 = (C64650ad) acVar.instance;
                    C64680bg bgVar8 = (C64680bg) bfVar.build();
                    bgVar8.getClass();
                    adVar2.f175246b = bgVar8;
                    adVar2.f175245a = 6;
                    sVar.mo59305a(acVar);
                }
            }
            return (C64710t) sVar.build();
        }
        C64709s sVar2 = (C64709s) tVar.toBuilder();
        sVar2.copyOnWrite();
        ((C64710t) sVar2.instance).f175416a = C64710t.emptyProtobufList();
        for (C64650ad adVar3 : tVar.f175416a) {
            if (adVar3.f175245a == 6) {
                bgVar = (C64680bg) adVar3.f175246b;
            } else {
                bgVar = C64680bg.f175329c;
            }
            if (bgVar.f175331a == 1) {
                bnVar = (C64687bn) bgVar.f175332b;
            } else {
                bnVar = C64687bn.f175340d;
            }
            if (bnVar.f175343b.equals("/ml/action-user-model-ml-tflite-prod/ucm.linear-callduration-ondevice-v1")) {
                C64649ac acVar2 = (C64649ac) adVar3.toBuilder();
                if (adVar3.f175245a == 6) {
                    bgVar2 = (C64680bg) adVar3.f175246b;
                } else {
                    bgVar2 = C64680bg.f175329c;
                }
                C64679bf bfVar2 = (C64679bf) bgVar2.toBuilder();
                if (adVar3.f175245a == 6) {
                    bgVar3 = (C64680bg) adVar3.f175246b;
                } else {
                    bgVar3 = C64680bg.f175329c;
                }
                if (bgVar3.f175331a == 1) {
                    bnVar2 = (C64687bn) bgVar3.f175332b;
                } else {
                    bnVar2 = C64687bn.f175340d;
                }
                C64686bm bmVar2 = (C64686bm) bnVar2.toBuilder();
                String str = (String) optional.get();
                bmVar2.copyOnWrite();
                C64687bn bnVar7 = (C64687bn) bmVar2.instance;
                str.getClass();
                bnVar7.f175342a |= 2;
                bnVar7.f175344c = str;
                bfVar2.copyOnWrite();
                C64680bg bgVar9 = (C64680bg) bfVar2.instance;
                C64687bn bnVar8 = (C64687bn) bmVar2.build();
                bnVar8.getClass();
                bgVar9.f175332b = bnVar8;
                bgVar9.f175331a = 1;
                acVar2.copyOnWrite();
                C64650ad adVar4 = (C64650ad) acVar2.instance;
                C64680bg bgVar10 = (C64680bg) bfVar2.build();
                bgVar10.getClass();
                adVar4.f175246b = bgVar10;
                adVar4.f175245a = 6;
                sVar2.mo59305a(acVar2);
            }
        }
        return (C64710t) sVar2.build();
    }
}
