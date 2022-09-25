package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.p2420a.C31634b;
import com.google.android.libraries.phenotype.client.p2420a.C31638f;
import com.google.common.base.C58817ah;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bv */
/* compiled from: PG */
public final /* synthetic */ class C31730bv implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C31730bv f85299a = new C31730bv();

    private /* synthetic */ C31730bv() {
    }

    public final Object apply(Object obj) {
        C63088z zVar;
        C31634b bVar = (C31634b) obj;
        C31732bx bxVar = (C31732bx) C31733by.f85305h.createBuilder();
        if (bVar == null) {
            return (C31733by) bxVar.build();
        }
        for (C31638f fVar : bVar.f85113e) {
            C31734bz bzVar = (C31734bz) C31736ca.f85315e.createBuilder();
            String str = fVar.f85132d;
            bzVar.copyOnWrite();
            C31736ca caVar = (C31736ca) bzVar.instance;
            str.getClass();
            caVar.f85317a |= 1;
            caVar.f85320d = str;
            int i = fVar.f85130b;
            boolean z = false;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    long longValue = i == 1 ? ((Long) fVar.f85131c).longValue() : 0;
                    bzVar.copyOnWrite();
                    C31736ca caVar2 = (C31736ca) bzVar.instance;
                    caVar2.f85318b = 2;
                    caVar2.f85319c = Long.valueOf(longValue);
                } else if (i3 == 1) {
                    if (i == 2) {
                        z = ((Boolean) fVar.f85131c).booleanValue();
                    }
                    bzVar.copyOnWrite();
                    C31736ca caVar3 = (C31736ca) bzVar.instance;
                    caVar3.f85318b = 3;
                    caVar3.f85319c = Boolean.valueOf(z);
                } else if (i3 == 2) {
                    double doubleValue = i == 3 ? ((Double) fVar.f85131c).doubleValue() : C59203do.f157270a;
                    bzVar.copyOnWrite();
                    C31736ca caVar4 = (C31736ca) bzVar.instance;
                    caVar4.f85318b = 4;
                    caVar4.f85319c = Double.valueOf(doubleValue);
                } else if (i3 == 3) {
                    String str2 = i == 4 ? (String) fVar.f85131c : BuildConfig.FLAVOR;
                    bzVar.copyOnWrite();
                    C31736ca caVar5 = (C31736ca) bzVar.instance;
                    str2.getClass();
                    caVar5.f85318b = 5;
                    caVar5.f85319c = str2;
                } else if (i3 == 4) {
                    if (i == 5) {
                        zVar = (C63088z) fVar.f85131c;
                    } else {
                        zVar = C63088z.f170246b;
                    }
                    bzVar.copyOnWrite();
                    C31736ca caVar6 = (C31736ca) bzVar.instance;
                    zVar.getClass();
                    caVar6.f85318b = 6;
                    caVar6.f85319c = zVar;
                } else {
                    throw new IllegalStateException("No known flag type");
                }
                C31736ca caVar7 = (C31736ca) bzVar.build();
                bxVar.copyOnWrite();
                C31733by byVar = (C31733by) bxVar.instance;
                caVar7.getClass();
                C62971cq cqVar = byVar.f85313g;
                if (!cqVar.mo58948c()) {
                    byVar.f85313g = C62942bv.mutableCopy(cqVar);
                }
                byVar.f85313g.add(caVar7);
            } else {
                throw null;
            }
        }
        String str3 = bVar.f85112d;
        bxVar.copyOnWrite();
        C31733by byVar2 = (C31733by) bxVar.instance;
        str3.getClass();
        byVar2.f85307a = 4 | byVar2.f85307a;
        byVar2.f85310d = str3;
        String str4 = bVar.f85110b;
        bxVar.copyOnWrite();
        C31733by byVar3 = (C31733by) bxVar.instance;
        str4.getClass();
        byVar3.f85307a = 1 | byVar3.f85307a;
        byVar3.f85308b = str4;
        long j = bVar.f85116h;
        bxVar.copyOnWrite();
        C31733by byVar4 = (C31733by) bxVar.instance;
        byVar4.f85307a |= 8;
        byVar4.f85311e = j;
        if ((bVar.f85109a & 2) != 0) {
            C63088z zVar2 = bVar.f85111c;
            bxVar.copyOnWrite();
            C31733by byVar5 = (C31733by) bxVar.instance;
            zVar2.getClass();
            byVar5.f85307a |= 2;
            byVar5.f85309c = zVar2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        bxVar.copyOnWrite();
        C31733by byVar6 = (C31733by) bxVar.instance;
        byVar6.f85307a |= 16;
        byVar6.f85312f = currentTimeMillis;
        return (C31733by) bxVar.build();
    }
}
