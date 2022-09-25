package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50794cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.ae */
/* compiled from: PG */
public final class C117396ae implements C117405i {

    /* renamed from: a */
    public final Context f325890a;

    /* renamed from: b */
    public final C86124t f325891b;

    /* renamed from: c */
    public final C21370a f325892c;

    /* renamed from: d */
    private final C91189au f325893d;

    /* renamed from: e */
    private final C92122r f325894e;

    /* renamed from: f */
    private final C83807w f325895f;

    /* renamed from: g */
    private final C83794j f325896g;

    public C117396ae(Context context, C91189au auVar, C92122r rVar, C86124t tVar, C21370a aVar, C83807w wVar, C83794j jVar) {
        this.f325890a = context;
        this.f325893d = auVar;
        this.f325894e = rVar;
        this.f325891b = tVar;
        this.f325892c = aVar;
        this.f325895f = wVar;
        this.f325896g = jVar;
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.WEATHER;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo103283c(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r20
            r0 = r21
            com.google.android.apps.gsa.search.core.i.t r1 = r6.f325891b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90070dv.f249755g
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0018
            com.google.android.apps.gsa.staticplugins.smartspace.e.a r0 = new com.google.android.apps.gsa.staticplugins.smartspace.e.a
            r0.<init>()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0018:
            com.google.android.apps.gsa.opa.smartspace.w r1 = r6.f325895f
            com.google.android.apps.gsa.u.b r2 = com.google.android.apps.gsa.p8852u.C118569b.SMARTSPACE_WEATHER_UPDATE_REQUEST
            r3 = 1
            r1.mo77192a(r2, r3)
            boolean r1 = r0 instanceof com.google.android.apps.gsa.opa.smartspace.C83739ak
            if (r1 == 0) goto L_0x00ea
            com.google.android.apps.gsa.opa.smartspace.ak r0 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r0
            com.google.android.apps.gsa.opa.smartspace.aj r1 = r0.f228233b
            if (r1 != 0) goto L_0x002d
            com.google.android.apps.gsa.opa.smartspace.aj r1 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c
        L_0x002d:
            int r2 = r1.f228228a
            r3 = 3
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r1.f228229b
            com.google.assistant.s.a.gt r1 = (com.google.assistant.p3994s.p3995a.C53245gt) r1
            goto L_0x0039
        L_0x0037:
            com.google.assistant.s.a.gt r1 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n
        L_0x0039:
            com.google.protobuf.cq r2 = r1.f139569c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.assistant.s.a.ge r2 = (com.google.assistant.p3994s.p3995a.C53230ge) r2
            int r3 = r1.f139567a
            r3 = r3 & 256(0x100, float:3.59E-43)
            r4 = 0
            if (r3 == 0) goto L_0x0065
            com.google.assistant.s.a.gq r3 = r1.f139577k
            if (r3 != 0) goto L_0x004f
            com.google.assistant.s.a.gq r3 = com.google.assistant.p3994s.p3995a.C53242gq.f139546f
        L_0x004f:
            java.lang.String r5 = r3.f139550c
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0065
            boolean r3 = r3.f139551d
            if (r3 != 0) goto L_0x0065
            com.google.assistant.s.a.gq r3 = r1.f139577k
            if (r3 != 0) goto L_0x0061
            com.google.assistant.s.a.gq r3 = com.google.assistant.p3994s.p3995a.C53242gq.f139546f
        L_0x0061:
            java.lang.String r3 = r3.f139550c
            r13 = r3
            goto L_0x0066
        L_0x0065:
            r13 = r4
        L_0x0066:
            j$.util.OptionalLong r3 = p3186j$.util.OptionalLong.empty()
            com.google.android.apps.gsa.search.core.i.t r5 = r6.f325891b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247969be
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x00a5
            com.google.android.apps.gsa.opa.smartspace.j r5 = r6.f325896g
            boolean r5 = r5.mo77161F()
            if (r5 == 0) goto L_0x00a5
            com.google.assistant.s.a.gi r3 = r1.f139573g
            if (r3 != 0) goto L_0x0082
            com.google.assistant.s.a.gi r3 = com.google.assistant.p3994s.p3995a.C53234gi.f139523e
        L_0x0082:
            int r5 = r1.f139567a
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0097
            com.google.protobuf.fg r5 = r1.f139572f
            if (r5 != 0) goto L_0x008e
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x008e:
            long r7 = com.google.protobuf.p4750c.C62953e.m95478c(r5)
            j$.util.OptionalLong r5 = p3186j$.util.OptionalLong.m71641of(r7)
            goto L_0x00a1
        L_0x0097:
            com.google.android.libraries.f.a r5 = r6.f325892c
            long r7 = r5.mo26870b()
            j$.util.OptionalLong r5 = p3186j$.util.OptionalLong.m71641of(r7)
        L_0x00a1:
            r14 = r3
            r16 = r5
            goto L_0x00a8
        L_0x00a5:
            r16 = r3
            r14 = r4
        L_0x00a8:
            com.google.android.apps.gsa.smartspace.ae r3 = new com.google.android.apps.gsa.smartspace.ae
            java.lang.String r5 = r2.f139507c
            int r8 = java.lang.Integer.parseInt(r5)
            boolean r9 = r1.f139574h
            java.lang.String r10 = r2.f139512h
            java.lang.String r11 = r2.f139506b
            com.google.protobuf.cq r15 = r1.f139569c
            int r2 = r2.f139513i
            int r2 = com.google.assistant.p3897e.p3921j.p3926e.C52017hp.m86469a(r2)
            if (r2 != 0) goto L_0x00c4
            r2 = 1
            r17 = 1
            goto L_0x00c6
        L_0x00c4:
            r17 = r2
        L_0x00c6:
            int r2 = r1.f139567a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x00d2
            com.google.assistant.ak.n r4 = r1.f139579m
            if (r4 != 0) goto L_0x00d2
            com.google.assistant.ak.n r4 = com.google.assistant.p3820ak.C49215n.f127253d
        L_0x00d2:
            r18 = r4
            int r1 = r1.f139568b
            com.google.assistant.s.a.gg r1 = com.google.assistant.p3994s.p3995a.C53232gg.m86789a(r1)
            if (r1 != 0) goto L_0x00de
            com.google.assistant.s.a.gg r1 = com.google.assistant.p3994s.p3995a.C53232gg.UNKNOWN
        L_0x00de:
            r19 = r1
            r12 = 0
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = r0.f228242k
            r5 = r0
            r2 = r3
            goto L_0x00f0
        L_0x00ea:
            com.google.android.apps.gsa.smartspace.ae r0 = (com.google.android.apps.gsa.smartspace.C92035ae) r0
            java.lang.String r1 = ""
            r2 = r0
            r5 = r1
        L_0x00f0:
            com.google.common.util.concurrent.SettableFuture r7 = new com.google.common.util.concurrent.SettableFuture
            r7.<init>()
            java.lang.String r0 = r2.f256574c
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.apps.gsa.shared.y.au r8 = r6.f325893d
            com.google.common.util.concurrent.cx r9 = r8.mo85417d(r0)
            com.google.android.apps.gsa.staticplugins.smartspace.g.ad r10 = new com.google.android.apps.gsa.staticplugins.smartspace.g.ad
            com.google.android.apps.gsa.smartspace.r r0 = r6.f325894e
            android.content.Intent r3 = r0.mo86768b()
            r0 = r10
            r1 = r20
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r0 = "SmartspaceWeatherIH.ImageCallback"
            r8.mo85428r(r9, r0, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117396ae.mo103283c(java.lang.Object):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        if (obj instanceof C92035ae) {
            return true;
        }
        if (!(obj instanceof C83739ak)) {
            return false;
        }
        C83738aj ajVar = ((C83739ak) obj).f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        return ajVar.f228228a == 3;
    }
}
