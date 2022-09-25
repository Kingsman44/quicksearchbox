package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11932a;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11945h;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11946i;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11947j;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11948k;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.assistant.p3897e.p3921j.aex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60527te;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.C63595f;
import com.google.protos.p4850an.p4855d.p4856a.C63468u;
import com.google.protos.p4850an.p4855d.p4856a.C63469v;
import com.google.protos.p4850an.p4855d.p4856a.C63473z;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.speech.grammar.pumpkin.C66525q;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.af */
/* compiled from: PG */
public final class C11844af implements a {

    /* renamed from: e */
    private static final C58974d f38084e = C58974d.m91134h("OfflineVRMBuilder");

    /* renamed from: f */
    private static final C58485gu f38085f = C58485gu.m89848p("SENDER", "SECONDSENDER", "THIRDSENDER");

    /* renamed from: g */
    private static final C58528ij f38086g = new C58759qy("Hangouts");

    /* renamed from: a */
    C64782b f38087a;

    /* renamed from: b */
    aex f38088b;

    /* renamed from: c */
    int f38089c;

    /* renamed from: d */
    int f38090d = 0;

    /* renamed from: h */
    private final b f38091h;

    /* renamed from: i */
    private final SemanticsBuilderUtil f38092i;

    /* renamed from: j */
    private final C11947j f38093j;

    /* renamed from: k */
    private final C86124t f38094k;

    /* renamed from: l */
    private final C68214a f38095l;

    /* renamed from: m */
    private boolean f38096m = false;

    /* renamed from: n */
    private final C9309a f38097n;

    public C11844af(b bVar, SemanticsBuilderUtil semanticsBuilderUtil, C11947j jVar, C9309a aVar, C86124t tVar, C68214a aVar2) {
        this.f38091h = bVar;
        this.f38092i = semanticsBuilderUtil;
        this.f38093j = jVar;
        this.f38087a = C64782b.f175579d;
        this.f38088b = aex.f134969f;
        this.f38097n = aVar;
        this.f38094k = tVar;
        this.f38095l = aVar2;
    }

    /* renamed from: d */
    private final C51809dy m27549d(boolean z) {
        int i;
        boolean z2 = this.f38089c == this.f38088b.f134972b.size() + -1;
        if (z) {
            i = z2 ? R.string.final_notification_reprompt : R.string.more_notification_reprompt;
            if (!m27553h(this.f38089c)) {
                i = true != z2 ? R.string.more_notification_no_reply_reprompt : R.string.final_notification_no_reply_reprompt;
            }
        } else {
            i = z2 ? R.string.final_notification_prompt : R.string.more_notification_prompt;
            if (!m27553h(this.f38089c)) {
                i = true != z2 ? R.string.more_notification_no_reply_prompt : R.string.final_notification_no_reply_prompt;
            }
        }
        C9309a aVar = this.f38097n;
        return C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(i));
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.assistant.e.j.dy] */
    /* JADX WARNING: type inference failed for: r4v24, types: [com.google.assistant.e.j.dy] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m27550e(boolean r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.assistant.e.j.aex r1 = r10.f38088b
            com.google.protobuf.cq r1 = r1.f134972b
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L_0x0229
            int r1 = r10.f38089c
            r4 = 0
            r5 = 2
            if (r1 != 0) goto L_0x010c
            if (r11 != 0) goto L_0x010c
            com.google.assistant.e.j.aex r1 = r10.f38088b
            com.google.protobuf.cq r1 = r1.f134972b
            int r1 = r1.size()
            if (r1 > r3) goto L_0x0026
            r1 = r4
            goto L_0x0107
        L_0x0026:
            com.google.assistant.e.j.aex r1 = r10.f38088b
            com.google.protobuf.cq r1 = r1.f134972b
            int r1 = r1.size()
            if (r1 != r5) goto L_0x005f
            com.google.android.apps.gsa.a.c.a r1 = r10.f38097n
            android.content.Context r6 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            java.lang.Object r7 = r7.get(r2)
            com.google.assistant.e.j.aco r7 = (com.google.assistant.p3897e.p3921j.aco) r7
            java.lang.String r7 = r7.f134825c
            r6[r2] = r7
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            java.lang.Object r7 = r7.get(r3)
            com.google.assistant.e.j.aco r7 = (com.google.assistant.p3897e.p3921j.aco) r7
            java.lang.String r7 = r7.f134825c
            r6[r3] = r7
            r7 = 2132093119(0x7f1528bf, float:1.9826654E38)
            java.lang.String r1 = r1.getString(r7, r6)
            goto L_0x0103
        L_0x005f:
            com.google.assistant.e.j.aex r1 = r10.f38088b
            com.google.protobuf.cq r1 = r1.f134972b
            int r1 = r1.size()
            r6 = 3
            if (r1 != r6) goto L_0x00a6
            com.google.android.apps.gsa.a.c.a r1 = r10.f38097n
            android.content.Context r7 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r7)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            java.lang.Object r7 = r7.get(r2)
            com.google.assistant.e.j.aco r7 = (com.google.assistant.p3897e.p3921j.aco) r7
            java.lang.String r7 = r7.f134825c
            r6[r2] = r7
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            java.lang.Object r7 = r7.get(r3)
            com.google.assistant.e.j.aco r7 = (com.google.assistant.p3897e.p3921j.aco) r7
            java.lang.String r7 = r7.f134825c
            r6[r3] = r7
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            java.lang.Object r7 = r7.get(r5)
            com.google.assistant.e.j.aco r7 = (com.google.assistant.p3897e.p3921j.aco) r7
            java.lang.String r7 = r7.f134825c
            r6[r5] = r7
            r7 = 2132092958(0x7f15281e, float:1.9826327E38)
            java.lang.String r1 = r1.getString(r7, r6)
            goto L_0x0103
        L_0x00a6:
            com.google.common.b.gu r1 = f38085f
            com.google.common.b.pq r1 = (com.google.common.p4522b.C58724pq) r1
            int r1 = r1.f156474d
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            int r7 = r7.size()
            int r1 = java.lang.Math.min(r1, r7)
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            int r7 = r7.size()
            int r7 = r7 - r1
            com.google.android.apps.gsa.a.c.a r1 = r10.f38097n
            android.content.Context r8 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r8)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.google.assistant.e.j.aex r9 = r10.f38088b
            com.google.protobuf.cq r9 = r9.f134972b
            java.lang.Object r9 = r9.get(r2)
            com.google.assistant.e.j.aco r9 = (com.google.assistant.p3897e.p3921j.aco) r9
            java.lang.String r9 = r9.f134825c
            r8[r2] = r9
            com.google.assistant.e.j.aex r9 = r10.f38088b
            com.google.protobuf.cq r9 = r9.f134972b
            java.lang.Object r9 = r9.get(r3)
            com.google.assistant.e.j.aco r9 = (com.google.assistant.p3897e.p3921j.aco) r9
            java.lang.String r9 = r9.f134825c
            r8[r3] = r9
            com.google.assistant.e.j.aex r9 = r10.f38088b
            com.google.protobuf.cq r9 = r9.f134972b
            java.lang.Object r9 = r9.get(r5)
            com.google.assistant.e.j.aco r9 = (com.google.assistant.p3897e.p3921j.aco) r9
            java.lang.String r9 = r9.f134825c
            r8[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8[r6] = r9
            r6 = 2131951670(0x7f130036, float:1.9539761E38)
            java.lang.String r1 = r1.getQuantityString(r6, r7, r8)
        L_0x0103:
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
        L_0x0107:
            if (r1 == 0) goto L_0x010c
            r0.add(r1)
        L_0x010c:
            int r1 = r10.f38089c
            com.google.assistant.e.j.aex r6 = r10.f38088b
            com.google.protobuf.cq r6 = r6.f134972b
            int r6 = r6.size()
            if (r1 >= r6) goto L_0x0206
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.assistant.e.j.aex r6 = r10.f38088b
            int r7 = r10.f38089c
            com.google.protobuf.cq r6 = r6.f134972b
            java.lang.Object r6 = r6.get(r7)
            com.google.assistant.e.j.aco r6 = (com.google.assistant.p3897e.p3921j.aco) r6
            int r6 = r6.f134823a
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x014a
            if (r6 == 0) goto L_0x0135
            r11 = 2132091954(0x7f152432, float:1.982429E38)
            goto L_0x0138
        L_0x0135:
            r11 = 2132091955(0x7f152433, float:1.9824293E38)
        L_0x0138:
            com.google.android.apps.gsa.a.c.a r3 = r10.f38097n
            android.content.Context r4 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r4)
            java.lang.String r11 = r3.getString(r11)
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r11)
            goto L_0x01e5
        L_0x014a:
            int r11 = r10.f38089c
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            int r7 = r7.size()
            if (r11 >= r7) goto L_0x01d7
            int r11 = r10.f38089c
            com.google.assistant.e.j.aex r7 = r10.f38088b
            com.google.protobuf.cq r7 = r7.f134972b
            int r7 = r7.size()
            if (r11 >= r7) goto L_0x01cf
            com.google.assistant.e.j.aex r11 = r10.f38088b
            int r4 = r10.f38089c
            com.google.protobuf.cq r11 = r11.f134972b
            java.lang.Object r11 = r11.get(r4)
            com.google.assistant.e.j.aco r11 = (com.google.assistant.p3897e.p3921j.aco) r11
            if (r6 == 0) goto L_0x01a0
            com.google.assistant.e.j.aex r4 = r10.f38088b
            com.google.protobuf.cq r4 = r4.f134972b
            int r4 = r4.size()
            if (r4 != r3) goto L_0x017e
            r4 = 2132090447(0x7f151e4f, float:1.9821234E38)
            goto L_0x0189
        L_0x017e:
            int r4 = r10.f38089c
            if (r4 != 0) goto L_0x0186
            r4 = 2132086815(0x7f15101f, float:1.9813868E38)
            goto L_0x0189
        L_0x0186:
            r4 = 2132089622(0x7f151b16, float:1.981956E38)
        L_0x0189:
            com.google.android.apps.gsa.a.c.a r6 = r10.f38097n
            android.content.Context r7 = r6.f32300b
            android.content.res.Resources r6 = r6.mo17491a(r7)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = r11.f134832j
            r5[r2] = r7
            java.lang.String r11 = r11.f134827e
            r5[r3] = r11
            java.lang.String r4 = r6.getString(r4, r5)
            goto L_0x01cf
        L_0x01a0:
            com.google.assistant.e.j.aex r4 = r10.f38088b
            com.google.protobuf.cq r4 = r4.f134972b
            int r4 = r4.size()
            if (r4 != r3) goto L_0x01ae
            r4 = 2132090448(0x7f151e50, float:1.9821236E38)
            goto L_0x01b9
        L_0x01ae:
            int r4 = r10.f38089c
            if (r4 != 0) goto L_0x01b6
            r4 = 2132086817(0x7f151021, float:1.9813872E38)
            goto L_0x01b9
        L_0x01b6:
            r4 = 2132089623(0x7f151b17, float:1.9819563E38)
        L_0x01b9:
            com.google.android.apps.gsa.a.c.a r6 = r10.f38097n
            android.content.Context r7 = r6.f32300b
            android.content.res.Resources r6 = r6.mo17491a(r7)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = r11.f134825c
            r5[r2] = r7
            java.lang.String r11 = r11.f134827e
            r5[r3] = r11
            java.lang.String r4 = r6.getString(r4, r5)
        L_0x01cf:
            r4.getClass()
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r4)
            goto L_0x01e5
        L_0x01d7:
            com.google.common.f.a.d r11 = f38084e
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r3 = "Messages were lost, unable to read."
            r5 = 43701(0xaab5, float:6.1238E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r5)).mo56386p(r3)
        L_0x01e5:
            r4.getClass()
            r1.add(r4)
            int r11 = r10.f38089c
            com.google.assistant.e.j.dy r11 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27752e(r11)
            r1.add(r11)
            com.google.assistant.e.j.dy r11 = r10.m27549d(r2)
            r1.add(r11)
            com.google.assistant.e.j.dy r11 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27751d()
            r1.add(r11)
            r0.addAll(r1)
            return r0
        L_0x0206:
            r10.f38096m = r3
            java.util.ArrayList r11 = new java.util.ArrayList
            com.google.assistant.e.j.dy[] r0 = new com.google.assistant.p3897e.p3921j.C51809dy[r3]
            com.google.android.apps.gsa.a.c.a r1 = r10.f38097n
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            r3 = 2132090106(0x7f151cfa, float:1.9820543E38)
            java.lang.String r1 = r1.getString(r3)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            r11.<init>(r0)
            return r11
        L_0x0229:
            r10.f38096m = r3
            java.util.ArrayList r11 = new java.util.ArrayList
            com.google.assistant.e.j.dy[] r0 = new com.google.assistant.p3897e.p3921j.C51809dy[r3]
            com.google.android.apps.gsa.a.c.a r1 = r10.f38097n
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            r3 = 2132090111(0x7f151cff, float:1.9820553E38)
            java.lang.String r1 = r1.getString(r3)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11844af.m27550e(boolean):java.util.List");
    }

    /* renamed from: f */
    private final void m27551f() {
        this.f38087a = C64782b.f175579d;
        this.f38089c = 0;
        this.f38096m = false;
        this.f38090d = 0;
        this.f38093j.mo20321e();
    }

    /* renamed from: g */
    private final void m27552g(C63473z zVar) {
        if (!this.f38096m) {
            this.f38096m = this.f38093j.mo20322f(zVar);
        }
        if (this.f38093j.mo20323g() && C11947j.m27796h(zVar)) {
            this.f38093j.mo20321e();
        }
    }

    /* renamed from: h */
    private final boolean m27553h(int i) {
        return ((aco) this.f38088b.f134972b.get(i)).f134833k && !((C58759qy) f38086g).f156534a.equals(((aco) this.f38088b.f134972b.get(i)).f134827e);
    }

    /* renamed from: i */
    private final boolean m27554i() {
        return !this.f38094k.mo79746e(C90086ek.f250510h);
    }

    /* renamed from: a */
    public final C58833ax mo20208a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C60870cx mo20209b(C66525q qVar, Query query) {
        C58485gu guVar;
        C51809dy dyVar;
        C63473z zVar;
        C63469v vVar;
        aet aet;
        if (qVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!this.f38091h.f()) {
            m27551f();
        }
        List arrayList = new ArrayList();
        if (!qVar.f180932b.equals("SearchMessage")) {
            C58833ax a = this.f38092i.mo20311a(qVar, C11948k.m27806b(this.f38093j.mo20323g() ? this.f38093j.f38381a : this.f38087a));
            if (a.mo56113h()) {
                C63595f fVar = (C63595f) a.mo56107c();
                String str = qVar.f180932b;
                if (this.f38093j.mo20323g() && C11946i.m27795b(this.f38093j.f38381a)) {
                    arrayList = C58485gu.m89842j(this.f38093j.mo20319c(C11946i.m27794a(query), this.f38089c, false, false));
                } else if (str.equals("SearchMessageFollowOn") && (vVar = (C63469v) C15669a.m32464c(fVar, C63469v.f171519d)) != null && (vVar.f171521a & 32) != 0) {
                    int a2 = C63468u.m96241a(vVar.f171522b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    arrayList = C58485gu.m89842j(m27555j(a2));
                } else if (!this.f38093j.mo20323g()) {
                    ((C58970a) ((C58970a) f38084e.mo56225c()).mo56372aa(43703)).mo56386p("Cannot handle AnalyzerResponse in Read Message builder.");
                    arrayList = C58485gu.m89845m();
                } else if (!str.equals("SendMessageFollowOn") || (zVar = (C63473z) C15669a.m32464c(fVar, C63473z.f171528i)) == null) {
                    C63473z zVar2 = C63473z.f171527h;
                    arrayList = C58485gu.m89842j(this.f38093j.mo20319c(zVar2, this.f38089c, false, false));
                    m27552g(zVar2);
                } else {
                    List c = this.f38093j.mo20319c(zVar, this.f38089c, false, false);
                    if (C11947j.m27796h(zVar)) {
                        c.addAll(m27555j(4));
                    }
                    m27552g(zVar);
                    arrayList = C58485gu.m89842j(c);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f38090d = 0;
                C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                C52081en b = C15669a.m32463b(arrayList, Arrays.asList(new Integer[]{58570}));
                eVar.copyOnWrite();
                C51195j jVar = (C51195j) eVar.instance;
                b.getClass();
                jVar.f133275j = b;
                jVar.f133266a |= 128;
                return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar.build()));
            } else if (this.f38093j.mo20323g()) {
                return C60856cj.m92900i(C58836b.f156633a);
            } else {
                C51190e eVar2 = (C51190e) C51195j.f133264n.createBuilder();
                int i = this.f38090d;
                if (i < 2) {
                    if (i == 0) {
                        C9309a aVar = this.f38097n;
                        dyVar = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.sorry_string));
                    } else {
                        dyVar = m27549d(true);
                    }
                    this.f38090d++;
                    guVar = C58485gu.m89847o(dyVar, C11932a.m27751d());
                } else {
                    this.f38096m = true;
                    C9309a aVar2 = this.f38097n;
                    List f = C11932a.m27753f(aVar2.mo17491a(aVar2.f32300b));
                    if (this.f38094k.mo79746e(C90086ek.f250253E)) {
                        f.add(C11932a.m27750c(this.f38089c, true, m27554i()));
                    }
                    guVar = C58485gu.m89842j(f);
                }
                C52081en b2 = C15669a.m32463b(guVar, Arrays.asList(new Integer[]{58570}));
                eVar2.copyOnWrite();
                C51195j jVar2 = (C51195j) eVar2.instance;
                b2.getClass();
                jVar2.f133275j = b2;
                jVar2.f133266a |= 128;
                return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar2.build()));
            }
        } else if (!((C91123v) this.f38095l.mo27525b()).mo85390b() || !this.f38094k.mo79746e(C90086ek.f250252D) || !this.f38094k.mo79746e(C90086ek.f250304ac)) {
            this.f38087a = C11945h.m27778c("search.MESSAGE", C58485gu.m89845m());
            this.f38091h.e(new TaggerResult(qVar, C60527te.f163903c));
            this.f38090d = 0;
            if (((C91123v) this.f38095l.mo27525b()).mo85390b()) {
                aet = aet.DEFAULT;
            } else {
                aet = aet.ALTERNATIVE;
            }
            C51190e eVar3 = (C51190e) C51195j.f133264n.createBuilder();
            C52081en b3 = C15669a.m32463b(C58485gu.m89846n(C11932a.m27749b(aet, false)), Arrays.asList(new Integer[]{58570}));
            eVar3.copyOnWrite();
            C51195j jVar3 = (C51195j) eVar3.instance;
            b3.getClass();
            jVar3.f133275j = b3;
            jVar3.f133266a |= 128;
            return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar3.build()));
        } else {
            ((C58970a) ((C58970a) f38084e.mo56226d()).mo56372aa(43708)).mo56386p("#getSearchMessageAssistantResponse, couldn't read");
            C51190e eVar4 = (C51190e) C51195j.f133264n.createBuilder();
            C9309a aVar3 = this.f38097n;
            C52081en b4 = C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar3.mo17491a(aVar3.f32300b).getString(R.string.generic_builder_punt_embedded))), Arrays.asList(new Integer[]{58570}));
            eVar4.copyOnWrite();
            C51195j jVar4 = (C51195j) eVar4.instance;
            b4.getClass();
            jVar4.f133275j = b4;
            jVar4.f133266a |= 128;
            return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar4.build()));
        }
    }

    /* renamed from: c */
    public final C60870cx mo20210c(C52081en enVar) {
        C63088z zVar;
        C52078ek ekVar;
        C52078ek ekVar2;
        C52070ec ecVar;
        C52078ek ekVar3;
        C52070ec ecVar2;
        C52078ek ekVar4;
        C52070ec ecVar3;
        Iterator it = enVar.f136684d.iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            C52083ep epVar = (C52083ep) it.next();
            if (epVar.f136692b == 3) {
                ekVar3 = (C52078ek) epVar.f136693c;
            } else {
                ekVar3 = C52078ek.f136671f;
            }
            if (ekVar3.f136674b == 3) {
                ecVar2 = (C52070ec) ekVar3.f136675c;
            } else {
                ecVar2 = C52070ec.f136651d;
            }
            if ((ecVar2.f136653a & 2) != 0) {
                if (epVar.f136692b == 3) {
                    ekVar4 = (C52078ek) epVar.f136693c;
                } else {
                    ekVar4 = C52078ek.f136671f;
                }
                if (ekVar4.f136674b == 3) {
                    ecVar3 = (C52070ec) ekVar4.f136675c;
                } else {
                    ecVar3 = C52070ec.f136651d;
                }
                C52069eb ebVar = ecVar3.f136655c;
                if (ebVar == null) {
                    ebVar = C52069eb.f136648b;
                }
                for (C52232kc kcVar : ebVar.f136650a) {
                    if (kcVar.f137065b.equals("notification_fetch_result")) {
                        C52230ka kaVar = kcVar.f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        zVar = kaVar.f137061c;
                    }
                }
                continue;
            }
        }
        if (zVar != null) {
            try {
                this.f38088b = (aex) C62942bv.parseFrom((C62942bv) aex.f134969f, zVar);
                return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(m27550e(false), Arrays.asList(new Integer[]{58570}))));
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) f38084e.mo56225c()).mo56382g(e)).mo56372aa(43713)).mo56386p("Invalid parse");
                this.f38096m = true;
            }
        }
        Iterator it2 = enVar.f136684d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C52083ep epVar2 = (C52083ep) it2.next();
            if (epVar2.f136692b == 3) {
                ekVar = (C52078ek) epVar2.f136693c;
            } else {
                ekVar = C52078ek.f136671f;
            }
            if (ekVar.f136674b == 3) {
                if (epVar2.f136692b == 3) {
                    ekVar2 = (C52078ek) epVar2.f136693c;
                } else {
                    ekVar2 = C52078ek.f136671f;
                }
                if (ekVar2.f136674b == 3) {
                    ecVar = (C52070ec) ekVar2.f136675c;
                } else {
                    ecVar = C52070ec.f136651d;
                }
                C52236kg kgVar = ecVar.f136654b;
                if (kgVar == null) {
                    kgVar = C52236kg.f137089d;
                }
                C52235kf a = C52235kf.m86549a(kgVar.f137092b);
                if (a == null) {
                    a = C52235kf.OK;
                }
                if (a.equals(C52235kf.PERMISSION_DENIED)) {
                    this.f38096m = true;
                    break;
                }
            }
        }
        if (!this.f38096m) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        m27551f();
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }

    /* renamed from: j */
    private final List m27555j(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return m27550e(true);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                this.f38089c++;
                List e = m27550e(false);
                if (this.f38094k.mo79746e(C90086ek.f250253E)) {
                    e.add(C11932a.m27750c(this.f38089c - 1, true, m27554i()));
                }
                return e;
            } else if (i2 == 4) {
                this.f38096m = true;
                ArrayList arrayList = new ArrayList();
                C9309a aVar = this.f38097n;
                arrayList.add(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.okay_notification)));
                if (this.f38094k.mo79746e(C90086ek.f250253E)) {
                    arrayList.add(C11932a.m27750c(this.f38089c, true, m27554i()));
                }
                return arrayList;
            }
        } else if (m27553h(this.f38089c)) {
            return this.f38093j.mo20317a();
        }
        return new ArrayList();
    }
}
