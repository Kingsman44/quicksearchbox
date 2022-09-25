package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8175yh;
import com.google.p375ai.p378b.C8176yi;
import com.google.p375ai.p378b.C8177yj;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.h */
/* compiled from: PG */
public final class C91866h {

    /* renamed from: a */
    private static final C59071e f256193a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.h");

    /* renamed from: a */
    public final C8178yk mo86388a(C7708h hVar, C7718hj hjVar) {
        C7709ha haVar = hjVar.f26972m;
        if (haVar == null) {
            haVar = C7709ha.f26910f;
        }
        if (hVar != null && (hVar.f26896a & 2048) != 0) {
            C8178yk ykVar = hVar.f26907l;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            return mo86389b(ykVar, haVar);
        } else if ((hjVar.f26955a & 128) == 0) {
            return null;
        } else {
            C8178yk ykVar2 = hjVar.f26973n;
            if (ykVar2 == null) {
                ykVar2 = C8178yk.f28736g;
            }
            return mo86389b(ykVar2, haVar);
        }
    }

    /* renamed from: b */
    public final C8178yk mo86389b(C8178yk ykVar, C7709ha haVar) {
        C8176yi yiVar;
        if (haVar == null) {
            ((C59052c) ((C59052c) f256193a.mo56226d()).mo56372aa(11927)).mo56386p("Null metadata. Cannot populate eventId.");
            return null;
        }
        C60220t tVar = haVar.f26913b;
        if (tVar == null) {
            tVar = C60220t.f162931e;
        }
        int i = tVar.f162933a;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            ((C59052c) ((C59052c) f256193a.mo56226d()).mo56372aa(11926)).mo56386p("eventId not populated with required fields.");
            return null;
        }
        C8177yj yjVar = (C8177yj) ykVar.toBuilder();
        if (ykVar.f28739b == 1) {
            yiVar = (C8176yi) ykVar.f28740c;
        } else {
            yiVar = C8176yi.f28728f;
        }
        C8175yh yhVar = (C8175yh) yiVar.toBuilder();
        C60220t tVar2 = haVar.f26913b;
        if (tVar2 == null) {
            tVar2 = C60220t.f162931e;
        }
        yhVar.copyOnWrite();
        C8176yi yiVar2 = (C8176yi) yhVar.instance;
        tVar2.getClass();
        yiVar2.f28731b = tVar2;
        yiVar2.f28730a |= 1;
        yjVar.copyOnWrite();
        C8178yk ykVar2 = (C8178yk) yjVar.instance;
        C8176yi yiVar3 = (C8176yi) yhVar.build();
        yiVar3.getClass();
        ykVar2.f28740c = yiVar3;
        ykVar2.f28739b = 1;
        return (C8178yk) yjVar.build();
    }

    /* renamed from: c */
    public final C57057b mo86390c(C7718hj hjVar, C8142xb xbVar, C90021c cVar) {
        return mo86391d(hjVar, xbVar, cVar.mo79746e(C90010bp.f246945aN));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4283bv.p4354e.p4356b.C57057b mo86391d(com.google.p375ai.p378b.C7718hj r4, com.google.p375ai.p378b.C8142xb r5, boolean r6) {
        /*
            r3 = this;
            com.google.bv.e.b.b r0 = r4.f26958ad
            if (r0 != 0) goto L_0x0006
            com.google.bv.e.b.b r0 = com.google.p4283bv.p4354e.p4356b.C57057b.f152311e
        L_0x0006:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.bv.e.b.a r0 = (com.google.p4283bv.p4354e.p4356b.C57052a) r0
            com.google.ai.b.fo r1 = r4.f26968i
            if (r1 != 0) goto L_0x0012
            com.google.ai.b.fo r1 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0012:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bv.e.b.b r2 = (com.google.p4283bv.p4354e.p4356b.C57057b) r2
            r1.getClass()
            r2.f152314b = r1
            int r1 = r2.f152313a
            r1 = r1 | 1
            r2.f152313a = r1
            com.google.ai.b.xb r1 = com.google.p375ai.p378b.C8142xb.UNKNOWN_SURFACE
            int r5 = r5.ordinal()
            r1 = 3
            if (r5 == r1) goto L_0x0042
            r1 = 14
            if (r5 == r1) goto L_0x003f
            r1 = 11
            if (r5 == r1) goto L_0x0042
            r1 = 12
            if (r5 == r1) goto L_0x003c
            com.google.bv.e.m r5 = com.google.p4283bv.p4354e.C57528m.UNKNOWN_SURFACE
            goto L_0x0044
        L_0x003c:
            com.google.bv.e.m r5 = com.google.p4283bv.p4354e.C57528m.AGSA_MAIN_SCREEN
            goto L_0x0044
        L_0x003f:
            com.google.bv.e.m r5 = com.google.p4283bv.p4354e.C57528m.AGSA_SECOND_SCREEN
            goto L_0x0044
        L_0x0042:
            com.google.bv.e.m r5 = com.google.p4283bv.p4354e.C57528m.ANDROID_LAUNCHER_MAIN_SCREEN
        L_0x0044:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bv.e.b.b r1 = (com.google.p4283bv.p4354e.p4356b.C57057b) r1
            int r5 = r5.f153693B
            r1.f152316d = r5
            int r5 = r1.f152313a
            r5 = r5 | 4
            r1.f152313a = r5
            if (r6 == 0) goto L_0x0075
            int r5 = r4.f26955a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0075
            com.google.ai.b.qv r4 = r4.f26971l
            if (r4 != 0) goto L_0x0063
            com.google.ai.b.qv r4 = com.google.p375ai.p378b.C7973qv.f28001c
        L_0x0063:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.bv.e.b.b r5 = (com.google.p4283bv.p4354e.p4356b.C57057b) r5
            r4.getClass()
            r5.f152315c = r4
            int r4 = r5.f152313a
            r4 = r4 | 2
            r5.f152313a = r4
        L_0x0075:
            com.google.protobuf.bv r4 = r0.build()
            com.google.bv.e.b.b r4 = (com.google.p4283bv.p4354e.p4356b.C57057b) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h.mo86391d(com.google.ai.b.hj, com.google.ai.b.xb, boolean):com.google.bv.e.b.b");
    }
}
