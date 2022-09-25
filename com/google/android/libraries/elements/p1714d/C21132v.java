package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.youtube.p5283a.p5284a.C68098t;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.v */
/* compiled from: PG */
public final /* synthetic */ class C21132v implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20794ag f59269a;

    /* renamed from: b */
    public final /* synthetic */ C6411u f59270b;

    /* renamed from: c */
    public final /* synthetic */ C68098t f59271c;

    /* renamed from: d */
    public final /* synthetic */ boolean f59272d;

    /* renamed from: e */
    public final /* synthetic */ C21319z f59273e;

    /* renamed from: f */
    public final /* synthetic */ C21292ch f59274f;

    /* renamed from: g */
    public final /* synthetic */ String f59275g;

    public /* synthetic */ C21132v(C20794ag agVar, C6411u uVar, C68098t tVar, boolean z, C21319z zVar, C21292ch chVar, String str) {
        this.f59269a = agVar;
        this.f59270b = uVar;
        this.f59271c = tVar;
        this.f59272d = z;
        this.f59273e = zVar;
        this.f59274f = chVar;
        this.f59275g = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if ((r2.mo58678m() >>> 3) != com.google.protos.youtube.elements.C66132bk.f179835c.f169971d.f169964b) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25875a(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.libraries.elements.d.ag r1 = r10.f59269a
            com.facebook.litho.u r2 = r10.f59270b
            com.youtube.a.a.t r0 = r10.f59271c
            boolean r3 = r10.f59272d
            com.google.android.libraries.elements.interfaces.z r4 = r10.f59273e
            com.google.android.libraries.elements.interfaces.ch r5 = r10.f59274f
            java.lang.String r6 = r10.f59275g
            com.google.android.libraries.elements.interfaces.ci r11 = (com.google.android.libraries.elements.interfaces.C21293ci) r11
            if (r3 == 0) goto L_0x0029
            r11 = 14
            java.nio.ByteBuffer r11 = r0.mo16918f(r11)
            boolean r7 = r0.mo60253j()
            r0 = r1
            r1 = r2
            r2 = r11
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            io.b.l r11 = r0.mo25877b(r1, r2, r3, r4, r5, r6)
            goto L_0x00cf
        L_0x0029:
            com.youtube.a.a.ah r2 = r0.mo60251h()
            if (r2 != 0) goto L_0x0066
            r2 = 10
            java.nio.ByteBuffer r2 = r0.mo16918f(r2)
            if (r2 != 0) goto L_0x0038
            goto L_0x0051
        L_0x0038:
            com.google.protobuf.ae r2 = com.google.protobuf.C62897ae.m95111N(r2)     // Catch:{ IOException -> 0x005d }
            boolean r3 = r2.mo58661D()     // Catch:{ IOException -> 0x005d }
            if (r3 != 0) goto L_0x0051
            int r2 = r2.mo58678m()     // Catch:{ IOException -> 0x005d }
            int r2 = r2 >>> 3
            com.google.protobuf.bt r3 = com.google.protos.youtube.elements.C66132bk.f179835c     // Catch:{ IOException -> 0x005d }
            com.google.protobuf.bs r3 = r3.f169971d     // Catch:{ IOException -> 0x005d }
            int r3 = r3.f169964b     // Catch:{ IOException -> 0x005d }
            if (r2 == r3) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            com.google.android.libraries.elements.interfaces.ab r2 = r1.f58179a
            com.google.android.libraries.elements.d.f.q r3 = new com.google.android.libraries.elements.d.f.q
            r3.<init>(r0, r2)
            io.b.l r0 = p5488io.p5490b.C70120l.m102048g(r3)
            goto L_0x008d
        L_0x005d:
            r11 = move-exception
            com.google.android.libraries.elements.interfaces.bc r0 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r1 = "Error reading model"
            r0.<init>(r1, r11)
            throw r0
        L_0x0066:
            boolean r2 = r1.f58185g
            if (r2 == 0) goto L_0x007c
            com.google.android.libraries.elements.interfaces.ab r2 = r1.f58179a
            com.google.android.libraries.elements.d.f.a.p r3 = r1.f58184f
            io.b.l r3 = r3.mo26149c(r4)
            com.google.android.libraries.elements.d.f.j r7 = new com.google.android.libraries.elements.d.f.j
            r7.<init>(r0, r2, r3)
            io.b.l r0 = p5488io.p5490b.C70120l.m102048g(r7)
            goto L_0x008d
        L_0x007c:
            com.google.android.libraries.elements.interfaces.ab r2 = r1.f58179a
            com.google.android.libraries.elements.d.f.a.p r3 = r1.f58184f
            io.b.l r3 = r3.mo26149c(r4)
            com.google.android.libraries.elements.d.f.a r7 = new com.google.android.libraries.elements.d.f.a
            r7.<init>(r0, r2, r3)
            io.b.l r0 = p5488io.p5490b.C70120l.m102048g(r7)
        L_0x008d:
            com.google.android.libraries.elements.interfaces.ac r2 = r1.f58191m
            boolean r2 = r2.mo26164a()
            r3 = 0
            if (r2 == 0) goto L_0x00bf
            com.google.android.libraries.elements.f.o r2 = new com.google.android.libraries.elements.f.o
            r2.<init>(r6, r3)
            io.b.k.f r3 = r2.f59366a
            r7 = 2
            io.b.n[] r8 = new p5488io.p5490b.C70122n[r7]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r3
            io.b.e.e.d.ai r0 = new io.b.e.e.d.ai
            r0.<init>(r8)
            io.b.d.d r3 = p5488io.p5490b.p5517i.C70101a.f186843k
            io.b.d.d r3 = p5488io.p5490b.p5497e.p5499b.C69840i.f186208a
            int r8 = p5488io.p5490b.C70092f.f186825a
            java.lang.String r9 = "bufferSize"
            p5488io.p5490b.p5497e.p5499b.C69841j.m101338c(r8, r9)
            io.b.e.e.d.aa r9 = new io.b.e.e.d.aa
            r9.<init>(r0, r3, r7, r8)
            io.b.d.d r0 = p5488io.p5490b.p5517i.C70101a.f186843k
            r7 = r2
            goto L_0x00c1
        L_0x00bf:
            r9 = r0
            r7 = r3
        L_0x00c1:
            com.google.android.libraries.elements.d.ae r8 = new com.google.android.libraries.elements.d.ae
            r0 = r8
            r2 = r5
            r3 = r11
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            io.b.l r11 = r9.mo61652l(r8)
        L_0x00cf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C21132v.mo25875a(java.lang.Object):java.lang.Object");
    }
}
