package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.g */
/* compiled from: PG */
public final class C30262g {

    /* renamed from: a */
    public final C30253a f81824a;

    /* renamed from: b */
    public final C30898c f81825b;

    /* renamed from: c */
    public final C63644b f81826c;

    /* renamed from: d */
    public final C63644b f81827d;

    /* renamed from: e */
    public final C30897z f81828e;

    /* renamed from: f */
    public final C30261f f81829f;

    /* renamed from: g */
    public final Runnable f81830g;

    public C30262g(C30253a aVar, C30898c cVar, C63644b bVar, C30897z zVar, C30261f fVar, Runnable runnable) {
        this.f81824a = aVar;
        this.f81825b = cVar;
        C63643a aVar2 = (C63643a) bVar.toBuilder();
        aVar2.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar2.instance;
        bVar2.f172122b = 3;
        bVar2.f172121a |= 1;
        this.f81826c = (C63644b) aVar2.build();
        C63643a aVar3 = (C63643a) bVar.toBuilder();
        aVar3.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar3.instance;
        bVar3.f172122b = 4;
        bVar3.f172121a |= 1;
        this.f81827d = (C63644b) aVar3.build();
        this.f81828e = zVar;
        this.f81829f = fVar;
        this.f81830g = runnable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35772a(com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30258c r7, java.lang.Object r8) {
        /*
            r6 = this;
            com.google.android.libraries.onegoogle.accountmanagement.b.d r0 = new com.google.android.libraries.onegoogle.accountmanagement.b.d
            r0.<init>(r6, r8)
            com.google.android.libraries.onegoogle.accountmanagement.b.e r1 = new com.google.android.libraries.onegoogle.accountmanagement.b.e
            r1.<init>(r6)
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r2 = r7.f81814a
            r3 = 1
            r2.f81719e = r3
            com.google.android.libraries.onegoogle.c.b.z r4 = r7.f81819f
            r2.mo35630b(r4)
            r7.f81820g = r8
            com.google.android.libraries.onegoogle.accountmanagement.b.a r2 = new com.google.android.libraries.onegoogle.accountmanagement.b.a
            r2.<init>(r7, r8)
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r4 = r7.f81814a
            com.google.android.libraries.onegoogle.account.particle.d r4 = r4.f81715a
            r4.mo35703a(r8, r2)
            com.google.common.base.ax r2 = r7.f81815b
            boolean r2 = r2.mo56113h()
            r4 = 0
            if (r2 == 0) goto L_0x003f
            com.google.common.base.ax r2 = r7.f81815b
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.onegoogle.accountmanagement.a.a r2 = (com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a) r2
            com.google.android.libraries.onegoogle.account.c.d r2 = r2.f81803a
            com.google.android.libraries.onegoogle.account.a.c r5 = r7.f81816c
            boolean r8 = r2.mo35583a(r8)
            if (r8 == 0) goto L_0x003f
            r8 = 1
            goto L_0x0040
        L_0x003f:
            r8 = 0
        L_0x0040:
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r2 = r7.f81814a
            if (r3 == r8) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            r2.setOnClickListener(r0)
            if (r8 == 0) goto L_0x0057
            com.google.common.base.ax r0 = r7.f81815b
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.onegoogle.accountmanagement.a.a r0 = (com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a) r0
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            goto L_0x0059
        L_0x0057:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0059:
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r1 = r7.f81814a
            android.widget.TextView r1 = r1.f81717c
            r1.setAlpha(r0)
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r1 = r7.f81814a
            android.widget.TextView r1 = r1.f81718d
            r1.setAlpha(r0)
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r1 = r7.f81814a
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r1 = r1.f81716b
            r1.setAlpha(r0)
            if (r8 == 0) goto L_0x0084
            android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
            r0.<init>()
            r2 = 0
            r0.setSaturation(r2)
            android.graphics.ColorMatrixColorFilter r2 = new android.graphics.ColorMatrixColorFilter
            r2.<init>(r0)
            com.google.android.libraries.onegoogle.account.disc.AvatarView r0 = r1.f81547a
            r0.setColorFilter(r2)
            goto L_0x008a
        L_0x0084:
            com.google.android.libraries.onegoogle.account.disc.AvatarView r0 = r1.f81547a
            r1 = 0
            r0.setColorFilter(r1)
        L_0x008a:
            com.google.android.libraries.onegoogle.account.particle.AccountParticle r0 = r7.f81814a
            r1 = 2131433800(0x7f0b1948, float:1.8489396E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r3 == r8) goto L_0x0097
            r4 = 8
        L_0x0097:
            r0.setVisibility(r4)
            com.google.common.base.ax r8 = r7.f81818e
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x00d7
            com.google.common.base.ax r8 = r7.f81818e
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.libraries.onegoogle.account.particle.g r8 = (com.google.android.libraries.onegoogle.account.particle.C30233g) r8
            com.google.common.base.ax r8 = r8.mo35710e()
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x00d7
            com.google.common.base.ax r8 = r7.f81818e
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.libraries.onegoogle.account.particle.g r8 = (com.google.android.libraries.onegoogle.account.particle.C30233g) r8
            com.google.common.base.ax r8 = r8.mo35710e()
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.libraries.onegoogle.account.particle.l r8 = (com.google.android.libraries.onegoogle.account.particle.C30238l) r8
            com.google.common.base.ax r0 = r7.f81818e
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.onegoogle.account.particle.g r0 = (com.google.android.libraries.onegoogle.account.particle.C30233g) r0
            androidx.lifecycle.v r0 = r0.mo35706a()
            androidx.lifecycle.ah r7 = r7.f81817d
            r8.mo5704e(r0, r7)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30262g.mo35772a(com.google.android.libraries.onegoogle.accountmanagement.b.c, java.lang.Object):void");
    }
}
