package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91432n;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91434p;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91439u;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7212g.C91425b;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104476l;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23279c;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7752iq;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dv */
/* compiled from: PG */
public final class C104635dv extends C23056g {

    /* renamed from: a */
    public final C91417d f291321a;

    /* renamed from: b */
    private final C104476l f291322b;

    /* renamed from: c */
    private final C23278b f291323c;

    /* renamed from: d */
    private final C91425b f291324d;

    /* renamed from: e */
    private C7718hj f291325e;

    /* renamed from: f */
    private C7718hj f291326f;

    /* renamed from: g */
    private C9278v f291327g;

    /* renamed from: h */
    private int f291328h;

    /* renamed from: i */
    private int f291329i;

    /* renamed from: j */
    private int f291330j;

    public C104635dv(C23052c cVar, C104476l lVar, C23279c cVar2, C91425b bVar, C91417d dVar) {
        super(cVar);
        this.f291322b = lVar;
        this.f291321a = dVar;
        this.f291323c = cVar2.mo28756a(cVar);
        this.f291324d = bVar;
        C23015k kVar = (C23015k) cVar;
        kVar.f63315j.mo28430t(C91434p.class);
        kVar.f63315j.mo28430t(C91439u.class);
        kVar.f63315j.mo28430t(C91432n.class);
        kVar.f63315j.mo28430t(C87334q.class);
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        C7718hj hjVar;
        if ("EVENT_ENTRY_VIEW".equals(str)) {
            C91425b bVar = this.f291324d;
            C7752iq iqVar = (C7752iq) C23245b.m43557b((ProtoParcelable) parcelable, C7752iq.f27124E.getParserForType(), C62921ba.m95368a(), true);
            iqVar.getClass();
            C9278v vVar = this.f291327g;
            if ((vVar.f32192a & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hjVar = vVar.f32174H;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
            } else {
                hjVar = null;
            }
            bVar.mo85777a(iqVar, hjVar, this.f291325e, this.f291326f, this.f291328h, this.f291329i, -1);
        } else if ("EVENT_SCROLL_TO_CARD".equals(str)) {
            ((C104593cg) this.f291322b).f291161a.mo28730f(BuildConfig.FLAVOR, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r2 == 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r2 == 0) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ad A[ADDED_TO_REGION] */
    /* renamed from: iD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28439iD(com.google.android.libraries.gsa.monet.shared.ProtoParcelable r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.af r1 = com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104489af.f290595k
            com.google.protobuf.eb r1 = r1.getParserForType()
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()
            r3 = 1
            r4 = r17
            com.google.protobuf.bv r1 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r4, r1, r2, r3)
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.af r1 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104489af) r1
            r1.getClass()
            int r2 = r1.f290597a
            r4 = 4
            r2 = r2 & r4
            r5 = 0
            if (r2 == 0) goto L_0x0026
            com.google.ai.b.hj r2 = r1.f290600d
            if (r2 != 0) goto L_0x0027
            com.google.ai.b.hj r2 = com.google.p375ai.p378b.C7718hj.f26927af
            goto L_0x0027
        L_0x0026:
            r2 = r5
        L_0x0027:
            r0.f291325e = r2
            int r2 = r1.f290597a
            r6 = 2
            r2 = r2 & r6
            if (r2 == 0) goto L_0x0035
            com.google.ai.b.hj r5 = r1.f290599c
            if (r5 != 0) goto L_0x0035
            com.google.ai.b.hj r5 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0035:
            r0.f291326f = r5
            int r2 = r1.f290603g
            r0.f291328h = r2
            int r2 = r1.f290604h
            r0.f291329i = r2
            int r2 = r1.f290605i
            r0.f291330j = r2
            com.google.android.apps.g.d.v r2 = r1.f290598b
            if (r2 != 0) goto L_0x0049
            com.google.android.apps.g.d.v r2 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
        L_0x0049:
            r0.f291327g = r2
            int r5 = r2.f32195b
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x005a
            int r2 = r2.f32184R
            int r2 = com.google.p375ai.p378b.C7693gl.m22807a(r2)
            if (r2 != 0) goto L_0x0085
            goto L_0x0084
        L_0x005a:
            int r5 = r2.f32192a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0084
            com.google.ai.b.hj r2 = r2.f32174H
            if (r2 != 0) goto L_0x0067
            com.google.ai.b.hj r2 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0067:
            int r2 = r2.f26961b
            r5 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0084
            com.google.android.apps.g.d.v r2 = r0.f291327g
            com.google.ai.b.hj r2 = r2.f32174H
            if (r2 != 0) goto L_0x0076
            com.google.ai.b.hj r2 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x0076:
            com.google.ai.b.gm r2 = r2.f26956aa
            if (r2 != 0) goto L_0x007c
            com.google.ai.b.gm r2 = com.google.p375ai.p378b.C7694gm.f26861e
        L_0x007c:
            int r2 = r2.f26864b
            int r2 = com.google.p375ai.p378b.C7693gl.m22807a(r2)
            if (r2 != 0) goto L_0x0085
        L_0x0084:
            r2 = 1
        L_0x0085:
            com.google.ai.b.hj r5 = r0.f291326f
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.l r7 = r0.f291322b
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cg r7 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104593cg) r7
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r7 = r7.f291162b
            com.google.android.apps.gsa.sidekick.main.h.g.b r8 = r0.f291324d
            com.google.android.apps.g.d.v r9 = r0.f291327g
            boolean r8 = r8.mo85779c(r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9 = 0
            r7.mo28730f(r8, r9)
            com.google.android.libraries.gsa.monet.service.c r7 = r0.f63405W
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.du r8 = new com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.du
            r8.<init>(r0, r5)
            java.lang.Class<com.google.android.apps.gsa.sidekick.main.h.d> r5 = com.google.android.apps.gsa.sidekick.main.p7205h.C91417d.class
            r7.mo28433w(r5, r8)
            com.google.android.apps.g.d.v r5 = r0.f291327g
            com.google.android.apps.g.d.ax r5 = r5.f32216w
            if (r5 != 0) goto L_0x00b1
            com.google.android.apps.g.d.ax r5 = com.google.android.apps.p489g.p494d.C9161ax.f31622d
        L_0x00b1:
            com.google.ai.b.sf r5 = r5.f31625b
            if (r5 != 0) goto L_0x00b7
            com.google.ai.b.sf r5 = com.google.p375ai.p378b.C8011sf.f28129c
        L_0x00b7:
            com.google.protobuf.cq r5 = r5.f28131a
            r7 = 0
        L_0x00ba:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x02cd
            java.lang.Object r8 = r5.get(r7)
            com.google.ai.b.st r8 = (com.google.p375ai.p378b.C8025st) r8
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r10 = com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah.f290608o
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ag r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104490ag) r10
            com.google.ai.b.hj r11 = r0.f291325e
            if (r11 == 0) goto L_0x00e1
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r12 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r12
            r12.f290616g = r11
            int r11 = r12.f290610a
            r11 = r11 | 32
            r12.f290610a = r11
        L_0x00e1:
            com.google.ai.b.hj r11 = r0.f291326f
            if (r11 == 0) goto L_0x00f4
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r12 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r12
            r12.f290615f = r11
            int r11 = r12.f290610a
            r11 = r11 | 16
            r12.f290610a = r11
        L_0x00f4:
            com.google.ai.b.tb r11 = com.google.p375ai.p378b.C8034tb.f28222f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.ai.b.ta r11 = (com.google.p375ai.p378b.C8033ta) r11
            com.google.android.apps.g.d.v r12 = r0.f291327g
            com.google.android.apps.g.d.ax r12 = r12.f32216w
            if (r12 != 0) goto L_0x0104
            com.google.android.apps.g.d.ax r12 = com.google.android.apps.p489g.p494d.C9161ax.f31622d
        L_0x0104:
            com.google.ai.b.sf r12 = r12.f31625b
            if (r12 != 0) goto L_0x010a
            com.google.ai.b.sf r12 = com.google.p375ai.p378b.C8011sf.f28129c
        L_0x010a:
            com.google.ai.b.tb r12 = r12.f28132b
            if (r12 != 0) goto L_0x0110
            com.google.ai.b.tb r12 = com.google.p375ai.p378b.C8034tb.f28222f
        L_0x0110:
            int r12 = r12.f28227d
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.ai.b.tb r13 = (com.google.p375ai.p378b.C8034tb) r13
            int r14 = r13.f28224a
            r14 = r14 | r4
            r13.f28224a = r14
            r13.f28227d = r12
            com.google.android.apps.g.d.v r12 = r0.f291327g
            com.google.android.apps.g.d.ax r12 = r12.f32216w
            if (r12 != 0) goto L_0x0128
            com.google.android.apps.g.d.ax r12 = com.google.android.apps.p489g.p494d.C9161ax.f31622d
        L_0x0128:
            com.google.ai.b.sf r12 = r12.f31625b
            if (r12 != 0) goto L_0x012e
            com.google.ai.b.sf r12 = com.google.p375ai.p378b.C8011sf.f28129c
        L_0x012e:
            com.google.ai.b.tb r12 = r12.f28132b
            if (r12 != 0) goto L_0x0134
            com.google.ai.b.tb r12 = com.google.p375ai.p378b.C8034tb.f28222f
        L_0x0134:
            int r12 = r12.f28228e
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.ai.b.tb r13 = (com.google.p375ai.p378b.C8034tb) r13
            int r14 = r13.f28224a
            r14 = r14 | 8
            r13.f28224a = r14
            r13.f28228e = r12
            if (r7 != 0) goto L_0x0149
            r12 = 1
            goto L_0x014a
        L_0x0149:
            r12 = 0
        L_0x014a:
            if (r12 == 0) goto L_0x0181
            com.google.android.apps.g.d.v r13 = r0.f291327g
            com.google.android.apps.g.d.ax r13 = r13.f32216w
            if (r13 != 0) goto L_0x0154
            com.google.android.apps.g.d.ax r13 = com.google.android.apps.p489g.p494d.C9161ax.f31622d
        L_0x0154:
            com.google.ai.b.sf r13 = r13.f31625b
            if (r13 != 0) goto L_0x015a
            com.google.ai.b.sf r13 = com.google.p375ai.p378b.C8011sf.f28129c
        L_0x015a:
            com.google.ai.b.tb r13 = r13.f28132b
            if (r13 != 0) goto L_0x0160
            com.google.ai.b.tb r13 = com.google.p375ai.p378b.C8034tb.f28222f
        L_0x0160:
            int r13 = r13.f28225b
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.ai.b.tb r14 = (com.google.p375ai.p378b.C8034tb) r14
            int r15 = r14.f28224a
            r15 = r15 | r3
            r14.f28224a = r15
            r14.f28225b = r13
            int r13 = r1.f290602f
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r14 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r14
            int r15 = r14.f290610a
            r15 = r15 | 128(0x80, float:1.794E-43)
            r14.f290610a = r15
            r14.f290618i = r13
        L_0x0181:
            int r13 = r5.size()
            int r13 = r13 + -1
            if (r7 != r13) goto L_0x018b
            r13 = 1
            goto L_0x018c
        L_0x018b:
            r13 = 0
        L_0x018c:
            if (r13 == 0) goto L_0x01d6
            com.google.android.apps.g.d.v r14 = r0.f291327g
            com.google.android.apps.g.d.ax r14 = r14.f32216w
            if (r14 != 0) goto L_0x0196
            com.google.android.apps.g.d.ax r14 = com.google.android.apps.p489g.p494d.C9161ax.f31622d
        L_0x0196:
            com.google.ai.b.sf r14 = r14.f31625b
            if (r14 != 0) goto L_0x019c
            com.google.ai.b.sf r14 = com.google.p375ai.p378b.C8011sf.f28129c
        L_0x019c:
            com.google.ai.b.tb r14 = r14.f28132b
            if (r14 != 0) goto L_0x01a2
            com.google.ai.b.tb r14 = com.google.p375ai.p378b.C8034tb.f28222f
        L_0x01a2:
            int r14 = r14.f28226c
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.ai.b.tb r15 = (com.google.p375ai.p378b.C8034tb) r15
            int r9 = r15.f28224a
            r9 = r9 | r6
            r15.f28224a = r9
            r15.f28226c = r14
            int r9 = r1.f290601e
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r14 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r14
            int r15 = r14.f290610a
            r15 = r15 | 64
            r14.f290610a = r15
            r14.f290617h = r9
            com.google.android.apps.g.d.v r9 = r0.f291327g
            boolean r9 = r9.f32183Q
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r14 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r14
            int r15 = r14.f290610a
            r15 = r15 | 4096(0x1000, float:5.74E-42)
            r14.f290610a = r15
            r14.f290623n = r9
        L_0x01d6:
            int r9 = r0.f291328h
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r14 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r14
            int r15 = r14.f290610a
            r15 = r15 | 256(0x100, float:3.59E-43)
            r14.f290610a = r15
            r14.f290619j = r9
            int r9 = r0.f291329i
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r14 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r14
            int r15 = r14.f290610a
            r15 = r15 | 512(0x200, float:7.175E-43)
            r14.f290610a = r15
            r14.f290620k = r9
            int r9 = r0.f291330j
            r10.copyOnWrite()
            com.google.protobuf.bv r14 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r14 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r14
            int r15 = r14.f290610a
            r15 = r15 | 1024(0x400, float:1.435E-42)
            r14.f290610a = r15
            r14.f290621l = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r9 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r9
            com.google.protobuf.bv r11 = r11.build()
            com.google.ai.b.tb r11 = (com.google.p375ai.p378b.C8034tb) r11
            r11.getClass()
            r9.f290612c = r11
            int r11 = r9.f290610a
            r11 = r11 | r6
            r9.f290610a = r11
            if (r12 == 0) goto L_0x0227
            if (r13 == 0) goto L_0x0226
            r9 = r2
            goto L_0x0240
        L_0x0226:
            r13 = 0
        L_0x0227:
            r9 = 6
            if (r12 == 0) goto L_0x0230
            if (r2 == r6) goto L_0x022e
            if (r2 != r9) goto L_0x0230
        L_0x022e:
            r9 = 2
            goto L_0x0240
        L_0x0230:
            if (r13 == 0) goto L_0x023b
            if (r2 == r4) goto L_0x0239
            if (r2 == r9) goto L_0x0239
            r9 = 7
            if (r2 != r9) goto L_0x023b
        L_0x0239:
            r9 = 4
            goto L_0x0240
        L_0x023b:
            r9 = 5
            if (r2 != r9) goto L_0x023f
            goto L_0x0240
        L_0x023f:
            r9 = 3
        L_0x0240:
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r11 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r11
            int r9 = r9 + -1
            r11.f290614e = r9
            int r9 = r11.f290610a
            r9 = r9 | 8
            r11.f290610a = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r9 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r9
            r8.getClass()
            r9.f290611b = r8
            int r8 = r9.f290610a
            r8 = r8 | r3
            r9.f290610a = r8
            com.google.android.apps.g.d.v r8 = r0.f291327g
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r9 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r9
            r8.getClass()
            r9.f290613d = r8
            int r8 = r9.f290610a
            r8 = r8 | r4
            r9.f290610a = r8
            com.google.android.apps.g.d.v r8 = r0.f291327g
            int r8 = r8.f32167A
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r9 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r9
            int r11 = r9.f290610a
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r9.f290610a = r11
            r9.f290622m = r8
            com.google.android.libraries.gsa.monet.tools.recycling.b.b r8 = r0.f291323c
            java.lang.String r9 = "TYPE_GRID_ROW"
            com.google.android.libraries.gsa.monet.shared.y r9 = r0.mo28494O(r9)
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.apps.gsa.staticplugins.nowcards.e.c.ah r10 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104491ah) r10
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r10 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r10)
            com.google.android.libraries.gsa.monet.tools.recycling.b.g r11 = r8.f63752b
            com.google.android.libraries.gsa.monet.tools.children.a.h r11 = r11.f63757a
            com.google.android.libraries.gsa.monet.tools.children.shared.h r11 = r11.f63585a
            int r11 = r11.mo28704b()
            java.lang.String r12 = "GRID_ROWS"
            r8.mo28754e(r12, r9, r10, r11)
            boolean r8 = r1.f290606j
            if (r8 == 0) goto L_0x02c9
            if (r7 != 0) goto L_0x02c9
            com.google.android.apps.gsa.staticplugins.nowcards.e.b.l r7 = r0.f291322b
            com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cg r7 = (com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104593cg) r7
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r7 = r7.f291161a
            com.google.android.libraries.gsa.monet.tools.recycling.b.b r8 = r0.f291323c
            com.google.android.libraries.gsa.monet.tools.recycling.b.g r8 = r8.f63752b
            com.google.android.libraries.gsa.monet.tools.children.a.h r8 = r8.f63757a
            com.google.android.libraries.gsa.monet.service.g r8 = r8.mo28637b()
            java.lang.String r8 = r8.mo28496Q()
            r9 = 0
            r7.mo28730f(r8, r9)
            r7 = 0
            goto L_0x02ca
        L_0x02c9:
            r9 = 0
        L_0x02ca:
            int r7 = r7 + r3
            goto L_0x00ba
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104635dv.mo28439iD(com.google.android.libraries.gsa.monet.shared.ProtoParcelable):void");
    }
}
