package com.google.android.libraries.micore.learning.training.util;

import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.internal.p10827a.C144762b;
import com.google.android.libraries.micore.learning.base.C29710b;
import com.google.android.libraries.micore.learning.base.C29716h;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.base.C29724p;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.micore.learning.training.util.b */
/* compiled from: PG */
public final class C29757b implements C29761f {

    /* renamed from: a */
    private final C29716h f80626a;

    /* renamed from: b */
    private final C144573b f80627b;

    /* renamed from: c */
    private final C144827n f80628c;

    /* renamed from: d */
    private final C144762b f80629d;

    /* renamed from: e */
    private final C29724p f80630e;

    /* renamed from: f */
    private final long f80631f;

    /* renamed from: g */
    private final AtomicLong f80632g = new AtomicLong(0);

    /* renamed from: h */
    private final C29710b f80633h;

    public C29757b(C29716h hVar, C29719k kVar, C144573b bVar, C144827n nVar, C144762b bVar2, C29724p pVar, C29710b bVar3) {
        this.f80626a = hVar;
        kVar.mo34856d();
        this.f80627b = bVar;
        this.f80628c = nVar;
        this.f80629d = bVar2;
        this.f80630e = pVar;
        this.f80633h = bVar3;
        this.f80631f = bVar.mo120044x();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r5.isInteractive() != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if (r9.getCurrentThermalStatus() >= r8.f80472c) goto L_0x00dc;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set m54871d(com.google.android.libraries.micore.learning.p2258a.C29700j r8, boolean r9, java.lang.String r10) {
        /*
            r7 = this;
            com.google.android.libraries.micore.learning.base.h r0 = r7.f80626a
            long r0 = r0.mo34859a()
            long r2 = r7.f80631f
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            java.util.concurrent.atomic.AtomicLong r2 = r7.f80632g
            long r2 = r2.get()
            long r2 = r0 - r2
            long r4 = r7.f80631f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x002a
            com.google.android.gms.learning.n r8 = r7.f80628c
            r9 = 1103(0x44f, float:1.546E-42)
            r8.mo120055g(r9)
            java.lang.Class<com.google.android.libraries.micore.learning.training.util.e> r8 = com.google.android.libraries.micore.learning.training.util.C29760e.class
            java.util.EnumSet r8 = java.util.EnumSet.noneOf(r8)
            return r8
        L_0x002a:
            java.util.concurrent.atomic.AtomicLong r2 = r7.f80632g
            r2.set(r0)
        L_0x002f:
            java.lang.Class<com.google.android.libraries.micore.learning.training.util.e> r0 = com.google.android.libraries.micore.learning.training.util.C29760e.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            com.google.android.gms.learning.b r1 = r7.f80627b
            boolean r1 = r1.mo120014av()
            if (r1 != 0) goto L_0x00e1
            com.google.protobuf.o r1 = r8.f80443e
            r2 = 1
            if (r1 == 0) goto L_0x0049
            boolean r1 = r1.f170230a
            if (r1 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r1 = 0
            goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            boolean r3 = r8.f80441c
            com.google.android.gms.learning.b r4 = r7.f80627b
            boolean r10 = r4.mo120011as(r10)
            r10 = r10 ^ r2
            boolean r8 = r8.f80442d
            r4 = 55
            if (r1 == 0) goto L_0x0078
            com.google.android.gms.learning.b r1 = r7.f80627b
            boolean r1 = r1.mo119991aY()
            if (r1 == 0) goto L_0x0078
            com.google.android.libraries.micore.learning.base.b r1 = r7.f80633h
            android.os.PowerManager r5 = r1.f80470a
            if (r5 != 0) goto L_0x006d
            com.google.android.gms.learning.n r1 = r1.f80471b
            r1.mo120056h(r4)
            goto L_0x0073
        L_0x006d:
            boolean r1 = r5.isInteractive()
            if (r1 == 0) goto L_0x0078
        L_0x0073:
            com.google.android.libraries.micore.learning.training.util.e r1 = com.google.android.libraries.micore.learning.training.util.C29760e.IDLE_NOT_OK
            r0.add(r1)
        L_0x0078:
            com.google.android.gms.learning.internal.a.b r1 = r7.f80629d
            com.google.android.gms.learning.internal.a.c r1 = r1.mo120196a()
            if (r1 != 0) goto L_0x0081
            goto L_0x00ab
        L_0x0081:
            com.google.android.gms.learning.b r5 = r7.f80627b
            long r5 = r5.mo120045y()
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            if (r10 == 0) goto L_0x0099
            r10 = 0
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0099
            float r10 = r1.f391612c
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            if (r3 == 0) goto L_0x00ab
            int r10 = r1.f391610a
            int r10 = com.google.common.p4552o.p4554b.p4555a.C59625e.m92470a(r10)
            if (r10 == 0) goto L_0x00ab
            r1 = 4
            if (r10 != r1) goto L_0x00ab
        L_0x00a6:
            com.google.android.libraries.micore.learning.training.util.e r10 = com.google.android.libraries.micore.learning.training.util.C29760e.BATTERY_NOT_OK
            r0.add(r10)
        L_0x00ab:
            if (r9 == 0) goto L_0x00c8
            com.google.android.libraries.micore.learning.base.p r9 = r7.f80630e
            int r9 = r9.mo34858a()
            if (r9 == 0) goto L_0x00c6
            r10 = 2
            if (r9 == r10) goto L_0x00c0
            if (r9 != r2) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            if (r8 == 0) goto L_0x00c8
            r8 = 3
            if (r9 != r8) goto L_0x00c8
        L_0x00c0:
            com.google.android.libraries.micore.learning.training.util.e r8 = com.google.android.libraries.micore.learning.training.util.C29760e.NETWORK_NOT_OK
            r0.add(r8)
            goto L_0x00c8
        L_0x00c6:
            r8 = 0
            throw r8
        L_0x00c8:
            com.google.android.libraries.micore.learning.base.b r8 = r7.f80633h
            android.os.PowerManager r9 = r8.f80470a
            if (r9 != 0) goto L_0x00d4
            com.google.android.gms.learning.n r8 = r8.f80471b
            r8.mo120056h(r4)
            goto L_0x00dc
        L_0x00d4:
            int r9 = r9.getCurrentThermalStatus()
            int r8 = r8.f80472c
            if (r9 < r8) goto L_0x00e1
        L_0x00dc:
            com.google.android.libraries.micore.learning.training.util.e r8 = com.google.android.libraries.micore.learning.training.util.C29760e.THERMALS_NOT_OK
            r0.add(r8)
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.micore.learning.training.util.C29757b.m54871d(com.google.android.libraries.micore.learning.a.j, boolean, java.lang.String):java.util.Set");
    }

    /* renamed from: a */
    public final Set mo34930a(C29700j jVar, String str) {
        return m54871d(jVar, true, str);
    }

    /* renamed from: b */
    public final Set mo34931b(C29700j jVar, String str) {
        return m54871d(jVar, false, str);
    }

    /* renamed from: c */
    public final void mo34932c(Set set, String str) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C29760e eVar = C29760e.BATTERY_NOT_OK;
            int ordinal = ((C29760e) it.next()).ordinal();
            if (ordinal == 0) {
                this.f80628c.mo120058j(81, str);
            } else if (ordinal == 1) {
                this.f80628c.mo120058j(80, str);
            } else if (ordinal == 2) {
                this.f80628c.mo120058j(97, str);
            } else if (ordinal == 3) {
                this.f80628c.mo120058j(21, str);
            }
        }
    }
}
