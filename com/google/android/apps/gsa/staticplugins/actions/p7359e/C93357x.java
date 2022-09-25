package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import com.google.p4152bb.p4153a.C55215kc;
import com.google.p4152bb.p4153a.C55221ki;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.x */
/* compiled from: PG */
public final class C93357x {

    /* renamed from: a */
    public final boolean f260375a;

    /* renamed from: b */
    public final boolean f260376b;

    /* renamed from: c */
    public final int f260377c;

    /* renamed from: d */
    final boolean f260378d;

    /* renamed from: e */
    private final C87449m f260379e;

    public C93357x(C87449m mVar, boolean z, boolean z2, boolean z3, int i) {
        this.f260379e = mVar;
        this.f260375a = z;
        this.f260378d = z3;
        this.f260377c = i;
        this.f260376b = z2;
    }

    /* renamed from: b */
    public static boolean m153582b(C55215kc kcVar, List list) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55221ki.f145381l);
        kcVar.mo58887l(r0);
        Object l = kcVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55221ki kiVar = (C55221ki) obj;
        if (kiVar != null) {
            return kiVar.f145387e == list || kiVar.f145386d == list;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m153583c(MatchingProviderInfo matchingProviderInfo, C55240la laVar) {
        if ((matchingProviderInfo.f236270h.mo81484i() || matchingProviderInfo.mo81436f()) && laVar != null && laVar.f145458h) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    protected static final C55365pr m153584d(List list, C87413a aVar, int i) {
        C58817ah ahVar;
        int i2;
        C55365pr prVar = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (aVar == null || !aVar.mo81179a()) {
            ahVar = new C93353t();
        } else {
            ahVar = new C93352s();
        }
        if (aVar != null) {
            i2 = aVar.f236074c >= i ? Integer.MAX_VALUE : aVar.f236073b;
        } else {
            i2 = 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55365pr prVar2 = (C55365pr) it.next();
            if (prVar2 != null) {
                int intValue = ((Integer) ahVar.apply(prVar2)).intValue();
                if (intValue == i2) {
                    return prVar2;
                }
                if ((intValue > 0 && (prVar == null || intValue > ((Integer) ahVar.apply(prVar)).intValue())) || (prVar == null && prVar2.f145883f == 0 && prVar2.f145884g == 0)) {
                    prVar = prVar2;
                }
            }
        }
        if (i2 > 0) {
            return prVar;
        }
        return (C55365pr) C58557jl.m90131l(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.shared.actions.util.CardDecision mo87648a(com.google.android.apps.gsa.staticplugins.actions.p7359e.C93356w r18, boolean r19, int r20, boolean r21, boolean r22, com.google.p4152bb.p4153a.C55263lx r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.bb.a.pr r2 = r1.f260373e
            if (r2 != 0) goto L_0x000e
            r18.mo87646b()
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            return r1
        L_0x000e:
            boolean r2 = r2.f145886i
            if (r2 == 0) goto L_0x0015
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236247a
            return r1
        L_0x0015:
            com.google.android.apps.gsa.search.shared.actions.util.b r8 = new com.google.android.apps.gsa.search.shared.actions.util.b
            r8.<init>()
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r2 = r0.f260379e
            com.google.bb.a.pr r3 = r1.f260373e
            r9 = 1
            if (r3 != 0) goto L_0x0023
            goto L_0x014f
        L_0x0023:
            int r4 = r3.f145878a
            r4 = r4 & r9
            r5 = 0
            r10 = 0
            if (r4 == 0) goto L_0x005c
            com.google.bb.a.he r3 = r3.f145879b
            if (r3 != 0) goto L_0x0030
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0030:
            com.google.android.apps.gsa.search.shared.actions.modular.a r4 = r1.f260372d
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = r2.mo81378a(r3, r4, r10)
            boolean r4 = r3.mo81247f()
            if (r4 == 0) goto L_0x0041
            java.lang.String r3 = r3.mo81245d()
            goto L_0x0042
        L_0x0041:
            r3 = r5
        L_0x0042:
            if (r3 == 0) goto L_0x0049
            r1.mo87645a(r8, r3)
            r6 = 1
            goto L_0x005e
        L_0x0049:
            com.google.android.apps.gsa.search.shared.actions.modular.a r4 = r1.f260372d
            com.google.android.apps.gsa.search.shared.actions.modular.f r4 = r4.mo81210Q()
            com.google.bb.a.pr r6 = r1.f260373e
            com.google.bb.a.he r6 = r6.f145879b
            if (r6 != 0) goto L_0x0057
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0057:
            r7 = 5
            r4.mo81399c(r7, r6)
            goto L_0x005d
        L_0x005c:
            r3 = r5
        L_0x005d:
            r6 = 0
        L_0x005e:
            com.google.bb.a.pr r4 = r1.f260373e
            int r7 = r4.f145878a
            r7 = r7 & 2
            if (r7 == 0) goto L_0x012a
            com.google.android.apps.gsa.staticplugins.actions.e.x r7 = r1.f260374f
            boolean r7 = r7.f260378d
            if (r7 == 0) goto L_0x012a
            com.google.bb.a.he r4 = r4.f145880c
            if (r4 != 0) goto L_0x0072
            com.google.bb.a.he r4 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0072:
            com.google.android.apps.gsa.search.shared.actions.modular.a r7 = r1.f260372d
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r2 = r2.mo81378a(r4, r7, r10)
            boolean r4 = r2.mo81247f()
            if (r4 == 0) goto L_0x0081
            java.util.Collection r4 = r2.f236133l
            goto L_0x0082
        L_0x0081:
            r4 = r5
        L_0x0082:
            if (r4 == 0) goto L_0x00fe
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x00fe
            java.util.Iterator r2 = r4.iterator()
        L_0x008e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0116
            java.lang.Object r4 = r2.next()
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r4 = (com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c) r4
            java.lang.Object r7 = r4.mo81244c()
            boolean r7 = r7 instanceof android.net.Uri
            if (r7 == 0) goto L_0x00c2
            android.net.Uri r7 = r4.mo81243b()
            if (r7 == 0) goto L_0x00c2
            com.google.android.apps.gsa.search.shared.actions.util.PromptSegment r7 = new com.google.android.apps.gsa.search.shared.actions.util.PromptSegment
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r15 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r12 = 0
            r13 = 0
            r14 = 0
            android.net.Uri r4 = r4.mo81243b()
            r16 = 0
            r11 = r15
            r10 = r15
            r15 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r7.<init>(r3, r10, r5, r5)
            r8.mo81461c(r7)
            goto L_0x00d9
        L_0x00c2:
            java.lang.String r7 = r4.mo81245d()
            if (r7 == 0) goto L_0x00db
            com.google.android.apps.gsa.search.shared.actions.util.PromptSegment r7 = new com.google.android.apps.gsa.search.shared.actions.util.PromptSegment
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r10 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            java.lang.String r4 = r4.mo81245d()
            r10.<init>((java.lang.String) r4, (boolean) r9)
            r7.<init>(r3, r10, r5, r5)
            r8.mo81461c(r7)
        L_0x00d9:
            r10 = 0
            goto L_0x008e
        L_0x00db:
            java.lang.Object r1 = r4.mo81244c()
            if (r1 == 0) goto L_0x00f6
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Class r1 = r1.getClass()
            r10 = 0
            r3[r10] = r1
            java.lang.String r1 = "Class %s is unsupported"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2.<init>(r1)
            throw r2
        L_0x00f6:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "segment.getObject() returns null."
            r1.<init>(r2)
            throw r1
        L_0x00fe:
            boolean r3 = r2.mo81247f()
            if (r3 == 0) goto L_0x0108
            java.lang.String r5 = r2.mo81245d()
        L_0x0108:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x0118
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r2 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r2.<init>((java.lang.String) r5, (boolean) r9)
            r1.mo87647c(r8, r2)
        L_0x0116:
            r7 = 1
            goto L_0x012b
        L_0x0118:
            com.google.android.apps.gsa.search.shared.actions.modular.a r2 = r1.f260372d
            com.google.android.apps.gsa.search.shared.actions.modular.f r2 = r2.mo81210Q()
            com.google.bb.a.pr r3 = r1.f260373e
            com.google.bb.a.he r3 = r3.f145880c
            if (r3 != 0) goto L_0x0126
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0126:
            r4 = 6
            r2.mo81399c(r4, r3)
        L_0x012a:
            r7 = 0
        L_0x012b:
            com.google.bb.a.pr r2 = r1.f260373e
            int r3 = r2.f145878a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0142
            com.google.z.c.v r2 = r2.f145881d
            if (r2 != 0) goto L_0x0139
            com.google.z.c.v r2 = com.google.p5277z.p5282c.C68032v.f184320b
        L_0x0139:
            r3 = r2
            long r4 = java.lang.System.currentTimeMillis()
            r2 = r8
            r2.mo81460b(r3, r4, r6, r7)
        L_0x0142:
            com.google.bb.a.pr r2 = r1.f260373e
            int r3 = r2.f145883f
            if (r3 != 0) goto L_0x014d
            int r2 = r2.f145884g
            if (r2 != 0) goto L_0x014d
            r10 = 1
        L_0x014d:
            r8.f236295h = r10
        L_0x014f:
            com.google.bb.a.pr r2 = r1.f260373e
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r3 = r0.f260379e
            com.google.android.apps.gsa.search.shared.actions.modular.a r4 = r1.f260372d
            java.util.List r2 = com.google.android.apps.gsa.staticplugins.actions.p7361g.C93399m.m153653a(r2, r3, r4)
            r8.f236293f = r2
            com.google.bb.a.pr r1 = r1.f260373e
            boolean r2 = r0.f260378d
            boolean r1 = com.google.android.apps.gsa.staticplugins.actions.p7359e.C93351r.m153572a(r1, r2, r8)
            if (r1 != 0) goto L_0x0177
            if (r19 == 0) goto L_0x0177
            if (r22 == 0) goto L_0x0174
            r1 = r20
            long r1 = (long) r1
            r8.mo81462d(r1)
            if (r21 != 0) goto L_0x0177
            r8.f236288a = r9
            goto L_0x0177
        L_0x0174:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = com.google.android.apps.gsa.search.shared.actions.util.CardDecision.f236248b
            return r1
        L_0x0177:
            r8.f236289b = r9
            r1 = r23
            r8.f236292e = r1
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r1 = r8.mo81459a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7359e.C93357x.mo87648a(com.google.android.apps.gsa.staticplugins.actions.e.w, boolean, int, boolean, boolean, com.google.bb.a.lx):com.google.android.apps.gsa.search.shared.actions.util.CardDecision");
    }
}
