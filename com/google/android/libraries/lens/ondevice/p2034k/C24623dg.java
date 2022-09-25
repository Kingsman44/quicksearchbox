package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.android.libraries.lens.ondevice.p2037n.C24778ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.lens.p4701g.C62291bn;
import com.google.lens.p4701g.C62292bo;
import com.google.lens.p4701g.C62293bp;
import com.google.lens.p4701g.C62294bq;
import com.google.lens.p4701g.C62296bs;
import com.google.lens.p4701g.C62297bt;
import com.google.lens.p4701g.C62299bv;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.lens.p4707j.C62431bh;
import com.google.p4172bg.C55694ab;
import com.google.p4172bg.C55764y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.ondevice.k.dg */
/* compiled from: PG */
public final class C24623dg {

    /* renamed from: a */
    public final OnDeviceEngineNativeApi f67365a;

    /* renamed from: b */
    public final Map f67366b = new HashMap();

    /* renamed from: c */
    public final Map f67367c = new HashMap();

    /* renamed from: d */
    private final C58833ax f67368d;

    public C24623dg(OnDeviceEngineNativeApi onDeviceEngineNativeApi, C58833ax axVar) {
        this.f67365a = onDeviceEngineNativeApi;
        this.f67368d = axVar;
    }

    /* renamed from: d */
    private final C62355r m45709d(C62297bt btVar, LodeResourceHolder lodeResourceHolder) {
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f67365a;
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 8;
        pVar.f168327a |= 1;
        oVar.copyOnWrite();
        C62353p pVar2 = (C62353p) oVar.instance;
        C62299bv bvVar = (C62299bv) btVar.build();
        bvVar.getClass();
        pVar2.f168329c = bvVar;
        pVar2.f168328b = 6;
        return onDeviceEngineNativeApi.mo30013d((C62353p) oVar.build(), lodeResourceHolder);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.lens.p4701g.C62355r mo29968a(com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi r0 = r7.f67365a     // Catch:{ all -> 0x00c6 }
            long r0 = r0.mo30010a()     // Catch:{ all -> 0x00c6 }
            r2 = 0
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.String r1 = "Cannot run page layout mutator: NativeApi has not been initialized yet."
            com.google.common.base.C58838bb.m90884s(r0, r1)     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bv r0 = com.google.lens.p4701g.C62299bv.f168178f     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bt r0 = (com.google.lens.p4701g.C62297bt) r0     // Catch:{ all -> 0x00c6 }
            r0.copyOnWrite()     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bv r1 = (com.google.lens.p4701g.C62299bv) r1     // Catch:{ all -> 0x00c6 }
            r2 = 3
            r1.f168183d = r2     // Catch:{ all -> 0x00c6 }
            int r3 = r1.f168180a     // Catch:{ all -> 0x00c6 }
            r3 = r3 | r5
            r1.f168180a = r3     // Catch:{ all -> 0x00c6 }
            com.google.common.base.ax r1 = r7.f67368d     // Catch:{ all -> 0x00c6 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x0052
            com.google.common.base.ax r1 = r7.f67368d     // Catch:{ all -> 0x00c6 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x00c6 }
            com.google.android.libraries.lens.ondevice.e.a r1 = (com.google.android.libraries.lens.ondevice.p2025e.C24434a) r1     // Catch:{ all -> 0x00c6 }
            boolean r1 = r1.mo29879f()     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x0045
            goto L_0x0052
        L_0x0045:
            com.google.common.base.ax r1 = r7.f67368d     // Catch:{ all -> 0x00c6 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x00c6 }
            com.google.android.libraries.lens.ondevice.e.a r1 = (com.google.android.libraries.lens.ondevice.p2025e.C24434a) r1     // Catch:{ all -> 0x00c6 }
            int r1 = r1.mo29884k()     // Catch:{ all -> 0x00c6 }
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            r0.copyOnWrite()     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bv r3 = (com.google.lens.p4701g.C62299bv) r3     // Catch:{ all -> 0x00c6 }
            int r6 = r1 + -1
            if (r1 == 0) goto L_0x00c4
            r3.f168184e = r6     // Catch:{ all -> 0x00c6 }
            int r1 = r3.f168180a     // Catch:{ all -> 0x00c6 }
            r1 = r1 | 16
            r3.f168180a = r1     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bz r1 = com.google.lens.p4701g.C62303bz.f168191d     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.by r1 = (com.google.lens.p4701g.C62302by) r1     // Catch:{ all -> 0x00c6 }
            r1.copyOnWrite()     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bz r3 = (com.google.lens.p4701g.C62303bz) r3     // Catch:{ all -> 0x00c6 }
            r9.getClass()     // Catch:{ all -> 0x00c6 }
            int r6 = r3.f168193a     // Catch:{ all -> 0x00c6 }
            r6 = r6 | r5
            r3.f168193a = r6     // Catch:{ all -> 0x00c6 }
            r3.f168194b = r9     // Catch:{ all -> 0x00c6 }
            r1.copyOnWrite()     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bv r9 = r1.instance     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bz r9 = (com.google.lens.p4701g.C62303bz) r9     // Catch:{ all -> 0x00c6 }
            int r3 = r9.f168193a     // Catch:{ all -> 0x00c6 }
            r3 = r3 | 2
            r9.f168193a = r3     // Catch:{ all -> 0x00c6 }
            r9.f168195c = r10     // Catch:{ all -> 0x00c6 }
            r0.copyOnWrite()     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bv r9 = r0.instance     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bv r9 = (com.google.lens.p4701g.C62299bv) r9     // Catch:{ all -> 0x00c6 }
            com.google.protobuf.bv r10 = r1.build()     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.bz r10 = (com.google.lens.p4701g.C62303bz) r10     // Catch:{ all -> 0x00c6 }
            r10.getClass()     // Catch:{ all -> 0x00c6 }
            r9.f168182c = r10     // Catch:{ all -> 0x00c6 }
            r9.f168181b = r2     // Catch:{ all -> 0x00c6 }
            com.google.lens.g.r r8 = r7.m45709d(r0, r8)     // Catch:{ all -> 0x00c6 }
            com.google.lens.j.bh r9 = r8.f168337d     // Catch:{ all -> 0x00c6 }
            if (r9 != 0) goto L_0x00ac
            com.google.lens.j.bh r9 = com.google.lens.p4707j.C62431bh.f168521d     // Catch:{ all -> 0x00c6 }
        L_0x00ac:
            int r10 = r9.f168524b     // Catch:{ all -> 0x00c6 }
            if (r10 != 0) goto L_0x00b2
            monitor-exit(r7)
            return r8
        L_0x00b2:
            com.google.android.libraries.lens.ondevice.b.a.e r8 = new com.google.android.libraries.lens.ondevice.b.a.e     // Catch:{ all -> 0x00c6 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = r9.f168525c     // Catch:{ all -> 0x00c6 }
            r10[r4] = r9     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Failed to run PageLayoutMutator: %s"
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x00c6 }
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c4:
            r8 = 0
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2034k.C24623dg.mo29968a(com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder, java.lang.String, boolean):com.google.lens.g.r");
    }

    /* renamed from: b */
    public final synchronized void mo29969b(LodeResourceHolder lodeResourceHolder, Bitmap bitmap, C55694ab abVar) {
        C62297bt btVar = (C62297bt) C62299bv.f168178f.createBuilder();
        btVar.copyOnWrite();
        C62299bv bvVar = (C62299bv) btVar.instance;
        bvVar.f168183d = 2;
        bvVar.f168180a |= 1;
        C62291bn bnVar = (C62291bn) C62292bo.f168167c.createBuilder();
        bnVar.copyOnWrite();
        C62292bo boVar = (C62292bo) bnVar.instance;
        abVar.getClass();
        boVar.f168170b = abVar;
        boVar.f168169a |= 1;
        btVar.copyOnWrite();
        C62299bv bvVar2 = (C62299bv) btVar.instance;
        C62292bo boVar2 = (C62292bo) bnVar.build();
        boVar2.getClass();
        bvVar2.f168182c = boVar2;
        bvVar2.f168181b = 6;
        C58838bb.m90884s(this.f67365a.mo30010a() != 0, "Cannot create PageLayoutMutatorContext: NativeApi has not been initialized yet.");
        C58838bb.m90869d(1 == (((C62299bv) btVar.instance).f168180a & 1), "A type must be provided to the PageLayoutMutatorRequest.Builder.");
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f67365a;
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 8;
        pVar.f168327a |= 1;
        oVar.copyOnWrite();
        C62353p pVar2 = (C62353p) oVar.instance;
        C62299bv bvVar3 = (C62299bv) btVar.build();
        bvVar3.getClass();
        pVar2.f168329c = bvVar3;
        pVar2.f168328b = 6;
        C62431bh bhVar = onDeviceEngineNativeApi.mo30014e((C62353p) oVar.build(), lodeResourceHolder, bitmap).f168337d;
        if (bhVar == null) {
            bhVar = C62431bh.f168521d;
        }
        if (bhVar.f168524b != 0) {
            throw new C24273e(String.format("Failed to create PageLayoutMutatorContext %s", new Object[]{bhVar.f168525c}));
        }
    }

    /* renamed from: c */
    public final synchronized void mo29970c(Context context, LodeResourceHolder lodeResourceHolder, C55764y yVar, C24778ak akVar) {
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f67365a;
        if (onDeviceEngineNativeApi.mo30010a() == 0) {
            C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
            C62296bs bsVar = C62296bs.f168175a;
            mVar.copyOnWrite();
            C62351n nVar = (C62351n) mVar.instance;
            bsVar.getClass();
            nVar.f168324b = bsVar;
            nVar.f168323a = 5;
            onDeviceEngineNativeApi.mo30015f(context, (C62351n) mVar.build());
        }
        C58838bb.m90884s(this.f67365a.mo30010a() != 0, "Cannot create PageLayoutMutatorRunner: NativeApi has not been initialized yet.");
        C62297bt btVar = (C62297bt) C62299bv.f168178f.createBuilder();
        btVar.copyOnWrite();
        C62299bv bvVar = (C62299bv) btVar.instance;
        bvVar.f168183d = 1;
        bvVar.f168180a |= 1;
        C62293bp bpVar = (C62293bp) C62294bq.f168171c.createBuilder();
        bpVar.copyOnWrite();
        C62294bq bqVar = (C62294bq) bpVar.instance;
        yVar.getClass();
        bqVar.f168174b = yVar;
        bqVar.f168173a |= 1;
        btVar.copyOnWrite();
        C62299bv bvVar2 = (C62299bv) btVar.instance;
        C62294bq bqVar2 = (C62294bq) bpVar.build();
        bqVar2.getClass();
        bvVar2.f168182c = bqVar2;
        bvVar2.f168181b = 4;
        C62431bh bhVar = m45709d(btVar, lodeResourceHolder).f168337d;
        if (bhVar == null) {
            bhVar = C62431bh.f168521d;
        }
        if (bhVar.f168524b == 0) {
            this.f67366b.put(yVar.f147155a, yVar);
            this.f67367c.put(yVar.f147155a, akVar);
        } else {
            throw new C24273e(String.format("Failed to create PageLayoutMutatorRunner for %s: %s", new Object[]{yVar.f147155a, bhVar.f168525c}));
        }
    }
}
