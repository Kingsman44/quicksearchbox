package com.google.android.libraries.elements.p1714d.p1719e;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.litho.p322a.C6075h;
import com.facebook.litho.p322a.C6076i;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58532in;
import com.google.p370af.C7490c;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68063az;
import com.youtube.p5283a.p5284a.C68070bf;
import com.youtube.p5283a.p5284a.C68077bm;
import com.youtube.p5283a.p5284a.C68078bn;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.elements.d.e.bl */
/* compiled from: PG */
public final class C21039bl implements C21271bn {

    /* renamed from: a */
    private static final C58532in f58956a;

    /* renamed from: b */
    private final C21259bb f58957b;

    static {
        C58529ik ikVar = new C58529ik();
        ikVar.mo55497e(1, Arrays.asList(new C6076i[]{C6075h.f17956a, C6075h.f17957b}));
        ikVar.mo55497e(2, Arrays.asList(new C6076i[]{C6075h.f17958c, C6075h.f17959d}));
        ikVar.mo55497e(4, Arrays.asList(new C6076i[]{C6075h.f17960e}));
        ikVar.mo55497e(3, Arrays.asList(new C6076i[]{C6075h.f17961f}));
        ikVar.mo55497e(5, Arrays.asList(new C6076i[]{C6075h.f17962g}));
        f58956a = ikVar.mo55493a();
    }

    public C21039bl(C21259bb bbVar) {
        this.f58957b = bbVar;
    }

    /* renamed from: a */
    public final int mo26066a() {
        return 225874218;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.youtube.a.a.bo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.youtube.a.a.bo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.youtube.a.a.bo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0217 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0214  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo25838b(com.facebook.litho.C6411u r19, com.google.android.libraries.elements.interfaces.C21319z r20, java.lang.String r21, java.lang.Object r22, com.google.android.libraries.elements.interfaces.C21248ar r23, com.google.android.libraries.elements.interfaces.C21310q r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            com.youtube.a.a.bn r3 = (com.youtube.p5283a.p5284a.C68078bn) r3
            com.facebook.litho.o r4 = r23.mo25928E()
            int r5 = r3.mo60204g()
            if (r5 != 0) goto L_0x0015
            return
        L_0x0015:
            r5 = 0
            if (r2 != 0) goto L_0x0022
            com.google.android.libraries.elements.interfaces.bb r2 = r0.f58957b
            com.google.protos.youtube.elements.r r3 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r4 = "Key is required with valid transition, but the key is null"
            r2.mo25782a(r3, r4, r1, r5)
            return
        L_0x0022:
            java.lang.String r6 = "com.youtube.transition_key."
            java.lang.String r2 = r6.concat(r2)
            com.facebook.litho.q r6 = r4.f18980c
            com.facebook.litho.l r6 = r6.mo13456J()
            com.facebook.litho.q r7 = r4.f18980c
            java.lang.String r7 = r7.f18990m
            com.facebook.litho.k r6 = r6.mo13412d()
            int r8 = r6.f18954a
            r8 = r8 | 512(0x200, float:7.175E-43)
            r6.f18954a = r8
            r6.f18961h = r2
            r6.f18960g = r7
            com.facebook.litho.q r6 = r4.f18980c
            com.facebook.litho.l r6 = r6.mo13456J()
            com.facebook.litho.k r6 = r6.mo13412d()
            com.facebook.litho.go r6 = r6.f18962i
            if (r6 != 0) goto L_0x0053
            com.facebook.litho.go r6 = com.facebook.litho.C6365gr.f18822h
            r4.mo13421E(r6)
        L_0x0053:
            r4.mo13268k()
            com.facebook.litho.go r6 = com.facebook.litho.C6362go.GLOBAL
            r4.mo13421E(r6)
            com.facebook.litho.go r6 = com.facebook.litho.C6362go.GLOBAL
            com.facebook.litho.gq r2 = com.facebook.litho.C6365gr.m17056d(r6, r2)
            r6 = 0
            r7 = 0
        L_0x0063:
            int r8 = r3.mo60204g()
            if (r7 >= r8) goto L_0x0294
            com.youtube.a.a.bo r8 = new com.youtube.a.a.bo
            r8.<init>()
            r9 = 4
            int r10 = r3.mo16913a(r9)
            if (r10 == 0) goto L_0x008b
            int r10 = r3.mo16914b(r10)
            int r11 = r7 * 4
            int r10 = r10 + r11
            java.nio.ByteBuffer r11 = r3.f24704b
            int r11 = r11.getInt(r10)
            int r10 = r10 + r11
            java.nio.ByteBuffer r11 = r3.f24704b
            r8.mo16917e(r10, r11)
            r10 = r19
            goto L_0x008e
        L_0x008b:
            r10 = r19
            r8 = r5
        L_0x008e:
            android.content.Context r11 = r10.f19009b
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            com.google.common.b.in r12 = f58956a
            int r13 = r8.mo16913a(r9)
            if (r13 == 0) goto L_0x00aa
            java.nio.ByteBuffer r14 = r8.f24704b
            int r15 = r8.f24703a
            int r13 = r13 + r15
            int r13 = r14.getInt(r13)
            goto L_0x00ab
        L_0x00aa:
            r13 = 0
        L_0x00ab:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.common.b.ij r12 = r12.mo54902c(r13)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x00c6
            com.google.android.libraries.elements.interfaces.bb r8 = r0.f58957b
            com.google.protos.youtube.elements.r r9 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INVALID_FIELD
            java.lang.String r11 = "Unknown TransitionValue specified"
            r8.mo25782a(r9, r11, r1, r5)
        L_0x00c2:
            r17 = r3
            goto L_0x0288
        L_0x00c6:
            com.google.common.b.sl r12 = r12.iterator()
        L_0x00ca:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c2
            java.lang.Object r13 = r12.next()
            com.facebook.litho.a.i r13 = (com.facebook.litho.p322a.C6076i) r13
            r2.mo13373a()
            com.facebook.litho.gj r14 = new com.facebook.litho.gj
            r14.<init>(r13)
            r2.f18801c = r14
            com.youtube.a.a.bl r14 = new com.youtube.a.a.bl
            r14.<init>()
            r15 = 6
            int r16 = r8.mo16913a(r15)
            if (r16 == 0) goto L_0x00fd
            int r5 = r8.f24703a
            int r5 = r16 + r5
            java.nio.ByteBuffer r9 = r8.f24704b
            int r9 = r9.getInt(r5)
            int r5 = r5 + r9
            java.nio.ByteBuffer r9 = r8.f24704b
            r14.mo16917e(r5, r9)
            goto L_0x00fe
        L_0x00fd:
            r14 = 0
        L_0x00fe:
            r5 = 1000(0x3e8, float:1.401E-42)
            r9 = 0
            if (r14 == 0) goto L_0x0114
            float r16 = r14.mo60199g()
            int r16 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0114
            float r5 = r14.mo60199g()
            r16 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r16
            int r5 = (int) r5
        L_0x0114:
            if (r14 == 0) goto L_0x0129
            int r16 = r14.mo16913a(r15)
            if (r16 == 0) goto L_0x0127
            java.nio.ByteBuffer r15 = r14.f24704b
            int r9 = r14.f24703a
            int r9 = r16 + r9
            int r9 = r15.getInt(r9)
            goto L_0x012a
        L_0x0127:
            r9 = 0
            goto L_0x012a
        L_0x0129:
            r9 = 2
        L_0x012a:
            if (r14 == 0) goto L_0x0137
            int r15 = r14.mo60201i()
            if (r15 <= 0) goto L_0x0137
            float r15 = r14.mo60200h(r6)
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            r6 = 1
            if (r14 == 0) goto L_0x0146
            int r0 = r14.mo60201i()
            if (r0 <= r6) goto L_0x0146
            float r0 = r14.mo60200h(r6)
            goto L_0x0147
        L_0x0146:
            r0 = 0
        L_0x0147:
            if (r14 == 0) goto L_0x0155
            int r6 = r14.mo60201i()
            r1 = 2
            if (r6 <= r1) goto L_0x0155
            float r1 = r14.mo60200h(r1)
            goto L_0x0156
        L_0x0155:
            r1 = 0
        L_0x0156:
            r6 = 3
            if (r14 == 0) goto L_0x0166
            r17 = r3
            int r3 = r14.mo60201i()
            if (r3 <= r6) goto L_0x0168
            float r3 = r14.mo60200h(r6)
            goto L_0x0169
        L_0x0166:
            r17 = r3
        L_0x0168:
            r3 = 0
        L_0x0169:
            r14 = 1
            if (r9 == r14) goto L_0x01b7
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r9 == r6) goto L_0x01aa
            r6 = 4
            if (r9 == r6) goto L_0x019d
            r6 = 5
            if (r9 == r6) goto L_0x0193
            r6 = 6
            if (r9 == r6) goto L_0x0189
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            r9 = 1053609165(0x3ecccccd, float:0.4)
            r10 = 0
            android.view.animation.PathInterpolator r0 = androidx.core.p098j.p100b.C2034a.m5471c(r9, r10, r6, r14)
            com.facebook.litho.gn r0 = com.facebook.litho.C6365gr.m17055c(r5, r0)
            goto L_0x01c1
        L_0x0189:
            r10 = 0
            android.view.animation.PathInterpolator r0 = androidx.core.p098j.p100b.C2034a.m5471c(r15, r0, r1, r3)
            com.facebook.litho.gn r0 = com.facebook.litho.C6365gr.m17055c(r5, r0)
            goto L_0x01c1
        L_0x0193:
            r10 = 0
            android.view.animation.PathInterpolator r0 = androidx.core.p098j.p100b.C2034a.m5470b(r15, r0)
            com.facebook.litho.gn r0 = com.facebook.litho.C6365gr.m17055c(r5, r0)
            goto L_0x01c1
        L_0x019d:
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            r10 = 0
            android.view.animation.PathInterpolator r0 = androidx.core.p098j.p100b.C2034a.m5471c(r10, r10, r6, r14)
            com.facebook.litho.gn r0 = com.facebook.litho.C6365gr.m17055c(r5, r0)
            goto L_0x01c1
        L_0x01aa:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r10 = 0
            android.view.animation.PathInterpolator r0 = androidx.core.p098j.p100b.C2034a.m5471c(r0, r10, r14, r14)
            com.facebook.litho.gn r0 = com.facebook.litho.C6365gr.m17055c(r5, r0)
            goto L_0x01c1
        L_0x01b7:
            r10 = 0
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            com.facebook.litho.gn r0 = com.facebook.litho.C6365gr.m17055c(r5, r0)
        L_0x01c1:
            r2.f18802d = r0
            r0 = 8
            int r0 = r8.mo16913a(r0)
            if (r0 == 0) goto L_0x021f
            java.nio.ByteBuffer r1 = r8.f24704b
            int r3 = r8.f24703a
            int r0 = r0 + r3
            byte r0 = r1.get(r0)
            if (r0 == 0) goto L_0x021f
            com.youtube.a.a.bm r0 = new com.youtube.a.a.bm
            r0.<init>()
            r1 = 10
            int r1 = r8.mo16913a(r1)
            if (r1 == 0) goto L_0x01f3
            int r3 = r8.f24703a
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r8.f24704b
            int r3 = r3.getInt(r1)
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r8.f24704b
            r0.mo16917e(r1, r3)
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            r1 = 12
            int r1 = r8.mo16913a(r1)
            if (r1 == 0) goto L_0x0206
            java.nio.ByteBuffer r3 = r8.f24704b
            int r5 = r8.f24703a
            int r1 = r1 + r5
            float r1 = r3.getFloat(r1)
            goto L_0x0207
        L_0x0206:
            r1 = 0
        L_0x0207:
            float r0 = m39536e(r11, r0, r13, r1)
            com.facebook.litho.a.n r1 = new com.facebook.litho.a.n
            r1.<init>(r0)
            com.facebook.litho.gj r0 = r2.f18801c
            if (r0 == 0) goto L_0x0217
            r2.f18803e = r1
            goto L_0x021f
        L_0x0217:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Must specify a single property using #animate() before specifying an appearFrom value!"
            r0.<init>(r1)
            throw r0
        L_0x021f:
            r0 = 14
            int r0 = r8.mo16913a(r0)
            if (r0 == 0) goto L_0x027b
            java.nio.ByteBuffer r1 = r8.f24704b
            int r3 = r8.f24703a
            int r0 = r0 + r3
            byte r0 = r1.get(r0)
            if (r0 == 0) goto L_0x027b
            com.youtube.a.a.bm r0 = new com.youtube.a.a.bm
            r0.<init>()
            r1 = 16
            int r1 = r8.mo16913a(r1)
            if (r1 == 0) goto L_0x024f
            int r3 = r8.f24703a
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r8.f24704b
            int r3 = r3.getInt(r1)
            int r1 = r1 + r3
            java.nio.ByteBuffer r3 = r8.f24704b
            r0.mo16917e(r1, r3)
            goto L_0x0250
        L_0x024f:
            r0 = 0
        L_0x0250:
            r1 = 18
            int r1 = r8.mo16913a(r1)
            if (r1 == 0) goto L_0x0262
            java.nio.ByteBuffer r3 = r8.f24704b
            int r5 = r8.f24703a
            int r1 = r1 + r5
            float r9 = r3.getFloat(r1)
            goto L_0x0263
        L_0x0262:
            r9 = 0
        L_0x0263:
            float r0 = m39536e(r11, r0, r13, r9)
            com.facebook.litho.a.n r1 = new com.facebook.litho.a.n
            r1.<init>(r0)
            com.facebook.litho.gj r0 = r2.f18801c
            if (r0 == 0) goto L_0x0273
            r2.f18804f = r1
            goto L_0x027b
        L_0x0273:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Must specify a single property using #animate() before specifying an disappearTo value!"
            r0.<init>(r1)
            throw r0
        L_0x027b:
            r0 = r18
            r10 = r19
            r1 = r20
            r3 = r17
            r5 = 0
            r6 = 0
            r9 = 4
            goto L_0x00ca
        L_0x0288:
            int r7 = r7 + 1
            r0 = r18
            r1 = r20
            r3 = r17
            r5 = 0
            r6 = 0
            goto L_0x0063
        L_0x0294:
            r2.mo13373a()
            com.facebook.litho.q r0 = r4.f18980c
            com.facebook.litho.l r0 = r0.mo13456J()
            com.facebook.litho.k r0 = r0.mo13412d()
            int r1 = r0.f18954a
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r3
            r0.f18954a = r1
            r0.f18963j = r2
            r4.mo13268k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1719e.C21039bl.mo25838b(com.facebook.litho.u, com.google.android.libraries.elements.interfaces.z, java.lang.String, java.lang.Object, com.google.android.libraries.elements.interfaces.ar, com.google.android.libraries.elements.interfaces.q):void");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ C7492e mo26067d(ByteBuffer byteBuffer) {
        C68078bn bnVar = new C68078bn();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bnVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return bnVar;
    }

    /* renamed from: e */
    private static float m39536e(DisplayMetrics displayMetrics, C68077bm bmVar, C6076i iVar, float f) {
        if (bmVar != null) {
            if (C6075h.f17956a.equals(iVar)) {
                C68063az g = bmVar.mo60202g();
                if (g != null) {
                    f = g.mo60145b();
                }
            } else if (C6075h.f17957b.equals(iVar)) {
                C68063az g2 = bmVar.mo60202g();
                if (g2 != null) {
                    f = g2.mo60146c();
                }
            } else if (C6075h.f17958c.equals(iVar)) {
                C68070bf h = bmVar.mo60203h();
                if (h != null) {
                    f = h.mo60167c();
                }
            } else if (C6075h.f17959d.equals(iVar)) {
                C68070bf h2 = bmVar.mo60203h();
                if (h2 != null) {
                    f = h2.mo60166b();
                }
            } else if (C7490c.m22726p(bmVar, 4)) {
                int a = bmVar.mo16913a(4);
                f = a != 0 ? bmVar.f24704b.getFloat(a + bmVar.f24703a) : 0.0f;
            }
        }
        if (C6075h.f17956a.equals(iVar) || C6075h.f17957b.equals(iVar) || C6075h.f17958c.equals(iVar) || C6075h.f17959d.equals(iVar)) {
            return TypedValue.applyDimension(1, f, displayMetrics);
        }
        return f;
    }
}
