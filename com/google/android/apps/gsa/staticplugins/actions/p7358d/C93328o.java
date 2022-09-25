package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import com.google.android.apps.gsa.search.core.C85661bl;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55135hd;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55279mm;
import com.google.p4152bb.p4153a.C55281mo;
import com.google.p4152bb.p4153a.C55282mp;
import com.google.p4152bb.p4153a.C55362po;
import com.google.p4152bb.p4153a.C55365pr;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.o */
/* compiled from: PG */
public final class C93328o {

    /* renamed from: a */
    public static final C85662bm[] f260287a = {C85662bm.DEVICE_CONTACTS};

    /* renamed from: b */
    private static final C59071e f260288b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.d.o");

    /* renamed from: a */
    public static C85661bl m153507a(C85662bm[] bmVarArr, C85664bo boVar) {
        return boVar.mo79190b(bmVarArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4152bb.p4153a.C55282mp m153508b(com.google.android.apps.gsa.search.core.C85662bm[] r6, android.content.res.Resources r7, boolean r8, boolean r9, com.google.android.apps.gsa.search.core.C85664bo r10) {
        /*
            com.google.android.apps.gsa.search.core.bl r6 = r10.mo79190b(r6)
            boolean r10 = r6.mo79180f()
            r0 = 0
            if (r10 != 0) goto L_0x0100
            boolean r10 = r6.mo79180f()
            r1 = 2132093369(0x7f1529b9, float:1.982716E38)
            r2 = 2
            if (r10 == 0) goto L_0x0018
        L_0x0015:
            r10 = r0
            goto L_0x0085
        L_0x0018:
            boolean r10 = r6.mo79178d()
            if (r10 == 0) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            java.util.Set r10 = r6.mo79177c()
            java.util.Iterator r10 = r10.iterator()
        L_0x0027:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r10.next()
            com.google.android.apps.gsa.search.core.bm r3 = (com.google.android.apps.gsa.search.core.C85662bm) r3
            com.google.android.apps.gsa.search.core.bn r4 = r6.mo79175a(r3)
            boolean r4 = r4.mo79184b()
            if (r4 != 0) goto L_0x0027
            java.lang.String r10 = r6.mo79176b(r3)
            if (r10 != 0) goto L_0x0064
            com.google.android.apps.gsa.search.core.bm r10 = com.google.android.apps.gsa.search.core.C85662bm.AUDIO_HISTORY
            int r10 = r3.ordinal()
            if (r10 == r2) goto L_0x005d
            com.google.common.f.e r10 = f260288b
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r4 = "getFirstIneligibleRequirement() : No string for %s"
            r5 = 13634(0x3542, float:1.9105E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56389s(r4, r3)
            java.lang.String r10 = r7.getString(r1)
            goto L_0x0064
        L_0x005d:
            r10 = 2132090874(0x7f151ffa, float:1.98221E38)
            java.lang.String r10 = r7.getString(r10)
        L_0x0064:
            if (r8 != 0) goto L_0x006b
            if (r9 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r4 = r0
            goto L_0x0072
        L_0x006b:
            r4 = 2132090875(0x7f151ffb, float:1.9822102E38)
            java.lang.String r4 = r7.getString(r4)
        L_0x0072:
            com.google.bb.a.mp r10 = m153509c(r3, r10, r4)
            goto L_0x0085
        L_0x0077:
            com.google.common.f.e r10 = f260288b
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r3 = "getFirstIneligibleRequirement() : Expected a missing requirement"
            r4 = 13633(0x3541, float:1.9104E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0015
        L_0x0085:
            if (r10 != 0) goto L_0x00ff
            boolean r10 = r6.mo79180f()
            if (r10 == 0) goto L_0x008f
            goto L_0x00fe
        L_0x008f:
            boolean r10 = r6.mo79178d()
            if (r10 != 0) goto L_0x0096
            goto L_0x00fe
        L_0x0096:
            java.util.Set r10 = r6.mo79177c()
            java.util.Iterator r10 = r10.iterator()
        L_0x009e:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r3 = r10.next()
            com.google.android.apps.gsa.search.core.bm r3 = (com.google.android.apps.gsa.search.core.C85662bm) r3
            boolean r4 = r6.mo79181g(r3)
            if (r4 != 0) goto L_0x009e
            com.google.android.apps.gsa.search.core.bm r6 = com.google.android.apps.gsa.search.core.C85662bm.AUDIO_HISTORY
            int r6 = r3.ordinal()
            if (r6 == r2) goto L_0x00ca
            com.google.common.f.e r6 = f260288b
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r8 = "getFirstOptedOutRequirement() : No string for %s"
            r9 = 13636(0x3544, float:1.9108E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56389s(r8, r3)
            java.lang.String r6 = r7.getString(r1)
            goto L_0x00ec
        L_0x00ca:
            r6 = 2132090881(0x7f152001, float:1.9822115E38)
            java.lang.String r6 = r7.getString(r6)
            if (r9 == 0) goto L_0x00db
            r8 = 2132090884(0x7f152004, float:1.982212E38)
            java.lang.String r0 = r7.getString(r8)
            goto L_0x00ec
        L_0x00db:
            if (r8 == 0) goto L_0x00e5
            r8 = 2132090883(0x7f152003, float:1.9822119E38)
            java.lang.String r0 = r7.getString(r8)
            goto L_0x00ec
        L_0x00e5:
            r8 = 2132090882(0x7f152002, float:1.9822117E38)
            java.lang.String r0 = r7.getString(r8)
        L_0x00ec:
            com.google.bb.a.mp r0 = m153509c(r3, r6, r0)
            goto L_0x00fe
        L_0x00f1:
            com.google.common.f.e r6 = f260288b
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "getFirstOptedOutRequirement() : Expected a missing requirement"
            r8 = 13635(0x3543, float:1.9107E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
        L_0x00fe:
            return r0
        L_0x00ff:
            return r10
        L_0x0100:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7358d.C93328o.m153508b(com.google.android.apps.gsa.search.core.bm[], android.content.res.Resources, boolean, boolean, com.google.android.apps.gsa.search.core.bo):com.google.bb.a.mp");
    }

    /* renamed from: c */
    private static C55282mp m153509c(C85662bm bmVar, String str, String str2) {
        C55362po poVar = (C55362po) C55365pr.f145876l.createBuilder();
        if (str != null) {
            C55135hd hdVar = (C55135hd) C55136he.f145130j.createBuilder();
            hdVar.copyOnWrite();
            C55136he heVar = (C55136he) hdVar.instance;
            heVar.f145132a |= 1;
            heVar.f145133b = str;
            poVar.copyOnWrite();
            C55365pr prVar = (C55365pr) poVar.instance;
            C55136he heVar2 = (C55136he) hdVar.build();
            heVar2.getClass();
            prVar.f145879b = heVar2;
            prVar.f145878a |= 1;
        }
        if (str2 != null) {
            C55135hd hdVar2 = (C55135hd) C55136he.f145130j.createBuilder();
            hdVar2.copyOnWrite();
            C55136he heVar3 = (C55136he) hdVar2.instance;
            heVar3.f145132a |= 1;
            heVar3.f145133b = str2;
            poVar.copyOnWrite();
            C55365pr prVar2 = (C55365pr) poVar.instance;
            C55136he heVar4 = (C55136he) hdVar2.build();
            heVar4.getClass();
            prVar2.f145880c = heVar4;
            prVar2.f145878a |= 2;
        }
        C55279mm mmVar = (C55279mm) C55282mp.f145616d.createBuilder();
        C55281mo a = C55281mo.m87651a(bmVar.f231549k.f145615j);
        mmVar.copyOnWrite();
        C55282mp mpVar = (C55282mp) mmVar.instance;
        mpVar.f145619b = a.f145615j;
        mpVar.f145618a |= 1;
        mmVar.copyOnWrite();
        C55282mp mpVar2 = (C55282mp) mmVar.instance;
        C55365pr prVar3 = (C55365pr) poVar.build();
        prVar3.getClass();
        mpVar2.f145620c = prVar3;
        mpVar2.f145618a |= 2;
        return (C55282mp) mmVar.build();
    }
}
