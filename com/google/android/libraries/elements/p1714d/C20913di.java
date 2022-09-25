package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6103an;
import com.facebook.litho.C6143bx;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6168cp;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6284g;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21237ag;
import com.google.android.libraries.elements.interfaces.C21238ah;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.youtube.p5283a.p5284a.C68042ae;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.di */
/* compiled from: PG */
final class C20913di extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: A */
    Map f58627A;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: B */
    C21296cl f58628B;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    C21357r f58629a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    C21313t f58630b;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: c */
    C21319z f58631c;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: d */
    C21237ag f58632d;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: e */
    C68042ae f58633e;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: f */
    C21357r f58634f;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: g */
    C21259bb f58635g;

    public C20913di() {
        super("ExpandableTextComponent");
    }

    /* renamed from: b */
    public static C6154cb m39316b(C6411u uVar, C21357r rVar, C21357r rVar2) {
        return m15817L(C20913di.class, "ExpandableTextComponent", uVar, 2076732558, new Object[]{uVar, rVar, rVar2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final Object mo12796O(C6154cb cbVar, Object obj) {
        int i = cbVar.f18198c;
        if (i == -1048037474) {
            C6103an.m15875b((C6411u) cbVar.f18199d[0], (C6143bx) obj);
            return null;
        } else if (i != 2076732558) {
            return null;
        } else {
            C6284g gVar = (C6284g) obj;
            C6168cp cpVar = cbVar.f18197b;
            Object[] objArr = cbVar.f18199d;
            C6411u uVar = (C6411u) objArr[0];
            C21357r rVar = (C21357r) objArr[1];
            C21357r rVar2 = (C21357r) objArr[2];
            C20913di diVar = (C20913di) cpVar;
            C21313t tVar = diVar.f58630b;
            C21319z zVar = diVar.f58631c;
            boolean booleanValue = ((C20912dh) diVar.f18999v).f58626a.booleanValue();
            if (uVar.f19012e != null) {
                uVar.mo13349g(new C6278fu(0, new Object[0]), "updateState:ExpandableTextComponent.updateExpand");
            }
            C21309p k = C21311r.m40252k();
            C21230a aVar = (C21230a) k;
            aVar.f59565f = zVar.mo26806h();
            C21238ah g = zVar.mo26805g();
            if (g != null) {
                aVar.f59564e = g;
            }
            if (!booleanValue) {
                if (rVar != null) {
                    tVar.mo26124a(rVar.mo26862a(), k.mo26698a()).mo61453k();
                }
            } else if (rVar2 != null) {
                tVar.mo26124a(rVar2.mo26862a(), k.mo26698a()).mo61453k();
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        fxVar.f18496a = false;
        ((C20912dh) this.f18999v).f58626a = (Boolean) fxVar.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        ((C20912dh) fvVar2).f58626a = ((C20912dh) fvVar).f58626a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final boolean mo12815af() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo12818ai() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0222  */
    /* renamed from: ar */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.litho.C6407q mo12827ar(com.facebook.litho.C6411u r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            com.google.android.libraries.elements.internal.r r3 = r0.f58634f
            com.google.android.libraries.elements.internal.r r4 = r0.f58629a
            com.youtube.a.a.ae r5 = r0.f58633e
            com.google.android.libraries.elements.interfaces.t r6 = r0.f58630b
            com.google.android.libraries.elements.interfaces.cl r7 = r0.f58628B
            com.google.android.libraries.elements.interfaces.z r8 = r0.f58631c
            com.google.android.libraries.elements.interfaces.bb r9 = r0.f58635g
            java.util.Map r10 = r0.f58627A
            com.google.android.libraries.elements.interfaces.ag r11 = r0.f58632d
            com.facebook.litho.fv r12 = r0.f18999v
            com.google.android.libraries.elements.d.dh r12 = (com.google.android.libraries.elements.p1714d.C20912dh) r12
            java.lang.Boolean r12 = r12.f58626a
            com.google.android.libraries.elements.d.dy r13 = com.google.android.libraries.elements.p1714d.C21065ea.m39570b(r28)
            r13.mo26059d(r6)
            r13.mo26057W(r7)
            r13.mo26061f(r11)
            r13.mo26063h(r9)
            r13.mo26060e(r8)
            com.youtube.a.a.bj r14 = com.google.android.libraries.elements.p1714d.C20916dl.m39327a(r5, r12)
            r13.mo26065j(r14)
            r13.mo26064i(r10)
            com.google.android.libraries.elements.d.ea r13 = r13.mo13259a()
            com.facebook.litho.hr r14 = com.facebook.litho.C6394hs.m17136b(r28)
            r14.mo13404d(r13)
            r15 = 1065353216(0x3f800000, float:1.0)
            r14.mo13429M(r15)
            com.facebook.litho.hs r14 = r14.mo13259a()
            com.facebook.litho.h r15 = com.facebook.litho.C6395i.m17143b(r28)
            r15.mo13264f(r14)
            boolean r14 = r12.booleanValue()
            r16 = 0
            if (r14 == 0) goto L_0x0080
            com.youtube.a.a.g r14 = new com.youtube.a.a.g
            r14.<init>()
            r0 = 16
            int r0 = r5.mo16913a(r0)
            if (r0 == 0) goto L_0x007d
            r17 = r15
            int r15 = r5.f24703a
            int r0 = r0 + r15
            java.nio.ByteBuffer r15 = r5.f24704b
            int r15 = r15.getInt(r0)
            int r0 = r0 + r15
            java.nio.ByteBuffer r15 = r5.f24704b
            r14.mo16917e(r0, r15)
            goto L_0x00a1
        L_0x007d:
            r17 = r15
            goto L_0x009f
        L_0x0080:
            r17 = r15
            com.youtube.a.a.g r14 = new com.youtube.a.a.g
            r14.<init>()
            r0 = 14
            int r0 = r5.mo16913a(r0)
            if (r0 == 0) goto L_0x009f
            int r15 = r5.f24703a
            int r0 = r0 + r15
            java.nio.ByteBuffer r15 = r5.f24704b
            int r15 = r15.getInt(r0)
            int r0 = r0 + r15
            java.nio.ByteBuffer r15 = r5.f24704b
            r14.mo16917e(r0, r15)
            goto L_0x00a1
        L_0x009f:
            r14 = r16
        L_0x00a1:
            if (r14 != 0) goto L_0x00a6
            r0 = r16
            goto L_0x00aa
        L_0x00a6:
            java.lang.String r0 = r14.mo60230y()
        L_0x00aa:
            r15 = 22
            int r15 = r5.mo16913a(r15)
            r18 = 1
            r19 = r3
            if (r15 == 0) goto L_0x00e1
            java.nio.ByteBuffer r3 = r5.f24704b
            r20 = r4
            int r4 = r5.f24703a
            int r15 = r15 + r4
            int r3 = r3.getInt(r15)
            r4 = 2
            if (r3 == r4) goto L_0x00cf
            r4 = 3
            if (r3 == r4) goto L_0x00c8
            goto L_0x00e3
        L_0x00c8:
            if (r0 == 0) goto L_0x00cc
            r0 = 1
            goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            r3 = 0
            goto L_0x00e9
        L_0x00cf:
            boolean r3 = r12.booleanValue()
            r3 = r3 ^ 1
            boolean r4 = r12.booleanValue()
            if (r4 != 0) goto L_0x00df
            if (r0 == 0) goto L_0x00df
            r0 = 1
            goto L_0x00e9
        L_0x00df:
            r0 = 0
            goto L_0x00e9
        L_0x00e1:
            r20 = r4
        L_0x00e3:
            if (r0 == 0) goto L_0x00e7
            r0 = 1
            goto L_0x00e8
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            r3 = 1
        L_0x00e9:
            boolean r4 = r12.booleanValue()
            if (r4 != 0) goto L_0x0140
            if (r0 == 0) goto L_0x0140
            com.google.android.libraries.elements.d.dy r4 = com.google.android.libraries.elements.p1714d.C21065ea.m39570b(r28)
            r4.mo26059d(r6)
            r4.mo26061f(r11)
            r4.mo26057W(r7)
            r4.mo26063h(r9)
            r4.mo26060e(r8)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r18)
            com.youtube.a.a.bj r12 = com.google.android.libraries.elements.p1714d.C20916dl.m39327a(r5, r12)
            r4.mo26065j(r12)
            r4.mo26064i(r10)
            com.google.android.libraries.elements.d.ea r4 = r4.mo13259a()
            com.facebook.litho.fs r12 = new com.facebook.litho.fs
            r12.<init>()
            r18 = r0
            r15 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r15)
            r4.mo13464t(r1, r2, r0, r12)
            com.facebook.litho.fs r0 = new com.facebook.litho.fs
            r0.<init>()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r15)
            r13.mo13464t(r1, r2, r4, r0)
            int r2 = r12.f18535a
            int r4 = r0.f18535a
            if (r2 != r4) goto L_0x0142
            int r2 = r12.f18536b
            int r0 = r0.f18536b
            if (r2 != r0) goto L_0x0142
            r0 = 0
            r3 = 0
            goto L_0x0144
        L_0x0140:
            r18 = r0
        L_0x0142:
            r0 = r18
        L_0x0144:
            if (r0 == 0) goto L_0x021a
            com.google.af.c r0 = new com.google.af.c
            r2 = 0
            r0.<init>(r2)
            int r22 = com.google.android.libraries.elements.internal.C21359t.m40376a(r0, r14)
            r23 = 0
            r25 = 0
            r26 = 0
            r21 = r0
            int r4 = com.youtube.p5283a.p5284a.C68074bj.m98366l(r21, r22, r23, r25, r26)
            r0.mo16911t(r4)
            r0.mo16902j()
            java.nio.ByteBuffer r0 = r0.f24688a
            com.youtube.a.a.bj r0 = com.youtube.p5283a.p5284a.C68074bj.m98365k(r0)
            com.google.android.libraries.elements.d.dy r4 = com.google.android.libraries.elements.p1714d.C21065ea.m39570b(r28)
            r4.mo26059d(r6)
            r4.mo26061f(r11)
            r4.mo26057W(r7)
            r4.mo26063h(r9)
            r4.mo26060e(r8)
            r4.mo26065j(r0)
            r4.mo26064i(r10)
            r0 = 0
            r4.mo13429M(r0)
            com.youtube.a.a.x r0 = new com.youtube.a.a.x
            r0.<init>()
            r6 = 24
            int r6 = r5.mo16913a(r6)
            if (r6 == 0) goto L_0x01a2
            int r7 = r5.f24703a
            int r6 = r6 + r7
            java.nio.ByteBuffer r7 = r5.f24704b
            int r7 = r7.getInt(r6)
            int r6 = r6 + r7
            java.nio.ByteBuffer r7 = r5.f24704b
            r0.mo16917e(r6, r7)
            goto L_0x01a4
        L_0x01a2:
            r0 = r16
        L_0x01a4:
            com.youtube.a.a.x r6 = new com.youtube.a.a.x
            r6.<init>()
            r7 = 26
            int r7 = r5.mo16913a(r7)
            if (r7 == 0) goto L_0x01c1
            int r8 = r5.f24703a
            int r7 = r7 + r8
            java.nio.ByteBuffer r8 = r5.f24704b
            int r8 = r8.getInt(r7)
            int r7 = r7 + r8
            java.nio.ByteBuffer r8 = r5.f24704b
            r6.mo16917e(r7, r8)
            goto L_0x01c3
        L_0x01c1:
            r6 = r16
        L_0x01c3:
            com.facebook.litho.fl r7 = com.facebook.litho.C6270fm.m16828b(r28)
            com.google.android.libraries.elements.d.ea r8 = r4.mo13259a()
            r7.mo13264f(r8)
            if (r0 == 0) goto L_0x01dd
            com.google.android.libraries.elements.a.a.d r8 = new com.google.android.libraries.elements.a.a.d
            r8.<init>(r0)
            com.google.android.libraries.elements.d.dj r0 = new com.google.android.libraries.elements.d.dj
            r0.<init>(r4)
            com.google.android.libraries.elements.internal.C21344e.m40355c(r8, r0)
        L_0x01dd:
            if (r6 == 0) goto L_0x01ec
            com.google.android.libraries.elements.a.a.d r0 = new com.google.android.libraries.elements.a.a.d
            r0.<init>(r6)
            com.google.android.libraries.elements.d.dk r6 = new com.google.android.libraries.elements.d.dk
            r6.<init>(r4)
            com.google.android.libraries.elements.internal.C21344e.m40355c(r0, r6)
        L_0x01ec:
            r0 = 18
            int r0 = r5.mo16913a(r0)
            if (r0 == 0) goto L_0x0210
            java.nio.ByteBuffer r6 = r5.f24704b
            int r5 = r5.f24703a
            int r0 = r0 + r5
            byte r0 = r6.get(r0)
            if (r0 == 0) goto L_0x0210
            if (r3 == 0) goto L_0x0210
            r0 = r19
            r5 = r20
            com.facebook.litho.cb r3 = m39316b(r1, r0, r5)
            r4.mo13445r(r3)
            r2 = r17
            r3 = 0
            goto L_0x0216
        L_0x0210:
            r0 = r19
            r5 = r20
            r2 = r17
        L_0x0216:
            r2.mo13390j(r7)
            goto L_0x0220
        L_0x021a:
            r2 = r17
            r0 = r19
            r5 = r20
        L_0x0220:
            if (r3 == 0) goto L_0x0229
            com.facebook.litho.cb r0 = m39316b(r1, r0, r5)
            r2.mo13445r(r0)
        L_0x0229:
            com.facebook.litho.i r0 = r2.f18849a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20913di.mo12827ar(com.facebook.litho.u, int):com.facebook.litho.q");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C6407q mo13318j() {
        C20913di diVar = (C20913di) super.mo13318j();
        diVar.f18999v = new C20912dh();
        return diVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C20912dh();
    }
}
