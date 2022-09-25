package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6928f.C87552h;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108211ai;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108244bo;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107144k;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.util.C113892w;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114582bc;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3898a.C50870f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h */
/* compiled from: PG */
public final class C109138h implements C87682aj {

    /* renamed from: a */
    public static final C59071e f303906a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.h");

    /* renamed from: b */
    public final C91097g f303907b;

    /* renamed from: c */
    public final C89911f f303908c;

    /* renamed from: d */
    String f303909d;

    /* renamed from: e */
    public final FragmentManager f303910e;

    /* renamed from: f */
    public final Context f303911f;

    /* renamed from: g */
    public final C58881cr f303912g;

    /* renamed from: h */
    public final C60870cx f303913h;

    /* renamed from: i */
    public C87546b f303914i = null;

    /* renamed from: j */
    long f303915j;

    /* renamed from: k */
    private final C108230ba f303916k;

    /* renamed from: l */
    private final C68214a f303917l;

    /* renamed from: m */
    private final C108429ij f303918m;

    /* renamed from: n */
    private final C68214a f303919n;

    /* renamed from: o */
    private final C68214a f303920o;

    /* renamed from: p */
    private final C113892w f303921p;

    /* renamed from: q */
    private final Activity f303922q;

    /* renamed from: r */
    private final C21370a f303923r;

    /* renamed from: s */
    private final C114582bc f303924s;

    /* renamed from: t */
    private boolean f303925t = false;

    /* renamed from: u */
    private C58833ax f303926u = C58836b.f156633a;

    /* renamed from: b */
    public static C87545a m181659b(C87546b bVar, C54201r rVar) {
        try {
            return bVar.mo77519a(rVar.toByteArray());
        } catch (C87552h e) {
            ((C59052c) ((C59052c) ((C59052c) f303906a.mo56225c()).mo56382g(e)).mo56372aa(22553)).mo56386p("Fail to build card.");
            return null;
        }
    }

    /* renamed from: e */
    private final C108232bc m181660e(CharSequence charSequence, C50870f fVar) {
        C108262cf cfVar = new C108262cf();
        charSequence.getClass();
        cfVar.f301174d = charSequence;
        if (fVar != null) {
            cfVar.f301045a = fVar.f132450c;
            cfVar.f301046b = (C91189au) this.f303919n.mo27525b();
        }
        return cfVar;
    }

    /* renamed from: f */
    private static int m181661f(Bundle bundle) {
        return bundle.getBoolean("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA") ? 2 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo97634d(C54201r rVar) {
        C87546b bVar = this.f303914i;
        if (rVar == null || rVar.f142247c.size() == 0 || bVar == null) {
            return new ArrayList();
        }
        return bVar.mo77520b(rVar.toByteArray());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.cd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.bv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.bv} */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05b4, code lost:
        if (android.text.TextUtils.isEmpty(r6.f301045a) == false) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05c4, code lost:
        if (r8.equals(r6.f301045a) == false) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06a9, code lost:
        if (r0 == 2) goto L_0x06b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x06ff  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0702 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0233  */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r26) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            com.google.android.apps.gsa.search.shared.service.b.uo r2 = r0.f236959a
            int r2 = r2.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r2)
            if (r2 != 0) goto L_0x0010
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0010:
            int r3 = r2.ordinal()
            r4 = 57
            r5 = 4
            r6 = 2
            r7 = 0
            r8 = 0
            r9 = 1
            if (r3 == r4) goto L_0x03ba
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L_0x038e
            r4 = 72
            if (r3 == r4) goto L_0x025d
            r4 = 73
            if (r3 == r4) goto L_0x0248
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L_0x003c
            r0 = 113(0x71, float:1.58E-43)
            if (r3 == r0) goto L_0x0033
            goto L_0x0729
        L_0x0033:
            com.google.android.apps.gsa.staticplugins.opa.util.w r0 = r1.f303921p
            r0.getClass()
            r0.mo98071c()
            return
        L_0x003c:
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a.f299120a
            com.google.android.apps.gsa.search.shared.service.b.uo r4 = r0.f236959a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 != 0) goto L_0x005f
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "onServiceEvent: %s missing OpaSessionServiceEvent extension"
            r4 = 22563(0x5823, float:3.1617E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
            return
        L_0x005f:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a.f299120a
            java.lang.Object r2 = r0.mo81918e(r2)
            com.google.android.apps.gsa.staticplugins.opa.as.b.e r2 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e) r2
            int r3 = r2.f299213b
            int r3 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c.m178398a(r3)
            if (r3 != 0) goto L_0x0070
            r3 = 1
        L_0x0070:
            int r3 = r3 + -1
            if (r3 == r9) goto L_0x00f0
            if (r3 == r5) goto L_0x0078
            goto L_0x0231
        L_0x0078:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107512af.f299135a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r3 = r2.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 == 0) goto L_0x0231
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107512af.f299135a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r2.mo58887l(r0)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x00a1
            java.lang.Object r0 = r0.f169969b
            goto L_0x00a5
        L_0x00a1:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x00a5:
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.ah r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107514ah) r0
            dagger.a r2 = r1.f303920o
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.at.n r2 = (com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n) r2
            java.lang.String r3 = r0.f299139b
            boolean r4 = r0.f299140c
            java.lang.String r0 = r0.f299141d
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x00d9
            java.lang.String r5 = r2.f299278i
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00c4
            goto L_0x00d9
        L_0x00c4:
            if (r4 == 0) goto L_0x00ce
            com.google.common.util.concurrent.SettableFuture r0 = r2.f299277h
            com.google.android.apps.gsa.x.c r2 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            r0.mo57356n(r2)
            goto L_0x00ed
        L_0x00ce:
            com.google.common.util.concurrent.SettableFuture r2 = r2.f299277h
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r0)
            r2.mo57357o(r3)
            goto L_0x00ed
        L_0x00d9:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n.f299268a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "MsgCarouselAdapter"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Can't handle send reply to notification result. Android notification key is either empty or doesn't match the pending notification key"
            r3 = 25503(0x639f, float:3.5737E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x00ed:
            r7 = 1
            goto L_0x0231
        L_0x00f0:
            dagger.a r3 = r1.f303917l
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0231
            dagger.a r3 = r1.f303917l
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247507iU
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0231
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107515ai.f299142a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r4 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x0231
            com.google.android.apps.gsa.staticplugins.opa.chatui.fa r3 = new com.google.android.apps.gsa.staticplugins.opa.chatui.fa
            android.content.Context r4 = r1.f303911f
            dagger.a r5 = r1.f303920o
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.at.n r5 = (com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n) r5
            com.google.android.libraries.f.a r6 = r1.f303923r
            com.google.android.apps.gsa.shared.util.t.g r7 = r1.f303907b
            r3.<init>(r4, r5, r6, r7)
            com.google.android.apps.gsa.staticplugins.opa.at.n r4 = r3.f301361b
            java.util.List r5 = r4.f299271b
            r5.clear()
            android.support.v7.widget.fc r4 = r4.mObservable
            r4.mo2879a()
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107515ai.f299142a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r2.mo58887l(r4)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r2 = r2.mo58854l(r5)
            if (r2 != 0) goto L_0x0158
            java.lang.Object r2 = r4.f169969b
            goto L_0x015c
        L_0x0158:
            java.lang.Object r2 = r4.mo58889c(r2)
        L_0x015c:
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.ak r2 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107517ak) r2
            com.google.protobuf.cq r2 = r2.f299145a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0169:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01fc
            java.lang.Object r5 = r2.next()
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.n r5 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107535n) r5
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            boolean r6 = r0.mo81913d(r6)
            if (r6 != 0) goto L_0x018e
            com.google.android.apps.gsa.staticplugins.opa.at.d r6 = new com.google.android.apps.gsa.staticplugins.opa.at.d
            com.google.assistant.e.j.aco r7 = r5.f299176b
            if (r7 != 0) goto L_0x0185
            com.google.assistant.e.j.aco r7 = com.google.assistant.p3897e.p3921j.aco.f134821t
        L_0x0185:
            java.lang.String r7 = r7.f134834l
            r6.<init>(r5, r8, r7, r9)
            r4.add(r6)
            goto L_0x0169
        L_0x018e:
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            android.os.Parcelable r6 = r0.mo81912b(r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            dagger.a r7 = r1.f303917l
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r7 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r7
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248140D
            boolean r7 = r7.mo79746e(r10)
            if (r7 == 0) goto L_0x01ca
            com.google.android.apps.gsa.staticplugins.opa.at.d r7 = new com.google.android.apps.gsa.staticplugins.opa.at.d
            com.google.assistant.e.j.aco r10 = r5.f299176b
            if (r10 != 0) goto L_0x01ae
            com.google.assistant.e.j.aco r10 = com.google.assistant.p3897e.p3921j.aco.f134821t
        L_0x01ae:
            java.lang.String r10 = r10.f134834l
            int r11 = m181661f(r6)
            r7.<init>(r5, r8, r10, r11)
            com.google.assistant.e.j.aco r5 = r5.f299176b
            if (r5 != 0) goto L_0x01bd
            com.google.assistant.e.j.aco r5 = com.google.assistant.p3897e.p3921j.aco.f134821t
        L_0x01bd:
            int r5 = r5.f134824b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = r6.getBoolean(r5)
            r7.f299289g = r5
            goto L_0x01f7
        L_0x01ca:
            com.google.android.apps.gsa.staticplugins.opa.at.d r7 = new com.google.android.apps.gsa.staticplugins.opa.at.d
            com.google.assistant.e.j.aco r10 = r5.f299176b
            if (r10 != 0) goto L_0x01d2
            com.google.assistant.e.j.aco r10 = com.google.assistant.p3897e.p3921j.aco.f134821t
        L_0x01d2:
            int r10 = r10.f134824b
            java.lang.String r10 = java.lang.String.valueOf(r10)
            android.os.Parcelable r10 = r6.getParcelable(r10)
            boolean r11 = r10 instanceof android.app.Notification
            if (r11 == 0) goto L_0x01e7
            android.app.Notification r10 = (android.app.Notification) r10
            androidx.core.app.s r10 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r10)
            goto L_0x01e8
        L_0x01e7:
            r10 = r8
        L_0x01e8:
            com.google.assistant.e.j.aco r11 = r5.f299176b
            if (r11 != 0) goto L_0x01ee
            com.google.assistant.e.j.aco r11 = com.google.assistant.p3897e.p3921j.aco.f134821t
        L_0x01ee:
            java.lang.String r11 = r11.f134834l
            int r6 = m181661f(r6)
            r7.<init>(r5, r10, r11, r6)
        L_0x01f7:
            r4.add(r7)
            goto L_0x0169
        L_0x01fc:
            com.google.android.apps.gsa.staticplugins.opa.at.n r0 = r3.f301361b
            java.util.Iterator r2 = r4.iterator()
        L_0x0202:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r2.next()
            com.google.android.apps.gsa.staticplugins.opa.at.o r4 = (com.google.android.apps.gsa.staticplugins.opa.p8306at.C107572o) r4
            java.util.List r5 = r0.f299271b
            r5.add(r4)
            int r4 = r0.getItemCount()
            int r4 = r4 + -1
            r0.notifyItemInserted(r4)
            goto L_0x0202
        L_0x021d:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303916k
            com.google.android.apps.gsa.staticplugins.opa.chatui.fa r0 = r0.mo95423l()
            if (r0 == 0) goto L_0x022a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r1.f303916k
            r2.mo95372N(r0)
        L_0x022a:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303916k
            r0.mo95430s(r3)
            goto L_0x00ed
        L_0x0231:
            if (r7 == 0) goto L_0x0242
            com.google.android.apps.gsa.staticplugins.opa.util.w r0 = r1.f303921p
            r0.getClass()
            boolean r2 = r1.f303925t
            r2 = r2 ^ r9
            long r3 = r1.f303915j
            com.google.common.base.ax r5 = r1.f303926u
            r0.mo98091w(r2, r3, r5)
        L_0x0242:
            boolean r0 = r1.f303925t
            r0 = r0 | r7
            r1.f303925t = r0
            return
        L_0x0248:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r2 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r2 = r0.mo81913d(r2)
            if (r2 == 0) goto L_0x0729
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r2 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r0 = r0.mo81912b(r2)
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            long r2 = r0.f252749G
            r1.f303915j = r2
            return
        L_0x025d:
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87760co.f237522a
            com.google.android.apps.gsa.search.shared.service.b.uo r4 = r0.f236959a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 != 0) goto L_0x0280
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "onServiceEvent: %s missing ConversationSurfaceEvent extension"
            r4 = 22562(0x5822, float:3.1616E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
            return
        L_0x0280:
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87760co.f237522a
            java.lang.Object r3 = r0.mo81918e(r3)
            com.google.android.apps.gsa.search.shared.service.b.cw r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw) r3
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r5 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r5 = r0.mo81913d(r5)
            if (r5 == 0) goto L_0x029e
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r4 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r0 = r0.mo81912b(r4)
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x029e:
            if (r3 == 0) goto L_0x0380
            int r0 = r3.f237532e
            int r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct.m142765a(r0)
            if (r0 != 0) goto L_0x02a9
            r0 = 1
        L_0x02a9:
            int r0 = r0 + -1
            if (r0 == r9) goto L_0x034a
            if (r0 == r6) goto L_0x0309
            r2 = 3
            if (r0 == r2) goto L_0x02d4
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 22557(0x581d, float:3.1609E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r2 = r3.f237532e
            int r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct.m142765a(r2)
            if (r2 != 0) goto L_0x02cb
            goto L_0x02cc
        L_0x02cb:
            r9 = r2
        L_0x02cc:
            java.lang.String r2 = "Received unknown EventType: %d"
            int r9 = r9 + -1
            r0.mo56387q(r2, r9)
            return
        L_0x02d4:
            com.google.common.base.cr r0 = r1.f303912g
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.staticplugins.opa.hw r0 = (com.google.android.apps.gsa.staticplugins.opa.C109258hw) r0
            int r2 = r3.f237528a
            r2 = r2 & r6
            if (r2 == 0) goto L_0x02e8
            java.lang.String r2 = r3.f237530c
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x02ea
        L_0x02e8:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x02ea:
            com.google.protobuf.z r5 = r3.f237529b
            java.lang.String r3 = r3.f237531d
            boolean r0 = r0.mo97724o(r2, r5, r3, r4)
            if (r0 == 0) goto L_0x0303
            com.google.android.apps.gsa.staticplugins.opa.util.w r2 = r1.f303921p
            r2.getClass()
            boolean r3 = r1.f303925t
            r3 = r3 ^ r9
            long r4 = r1.f303915j
            com.google.common.base.ax r6 = r1.f303926u
            r2.mo98091w(r3, r4, r6)
        L_0x0303:
            boolean r2 = r1.f303925t
            r0 = r0 | r2
            r1.f303925t = r0
            return
        L_0x0309:
            com.google.common.base.cr r0 = r1.f303912g
            java.lang.Object r0 = r0.mo6453a()
            com.google.android.apps.gsa.staticplugins.opa.hw r0 = (com.google.android.apps.gsa.staticplugins.opa.C109258hw) r0
            r0.f304297t = r9
            boolean r0 = r1.f303925t
            if (r0 == 0) goto L_0x0729
            r1.f303925t = r7
            dagger.a r0 = r1.f303917l
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248564cm
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x033a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.bc r0 = r1.f303924s
            r4 = 1
            j$.time.Duration r2 = p3186j$.time.Duration.ofSeconds(r4)
            r4 = 3
            j$.time.Duration r4 = p3186j$.time.Duration.ofSeconds(r4)
            r0.mo101439a(r2, r4)
        L_0x033a:
            com.google.android.apps.gsa.staticplugins.opa.util.w r5 = r1.f303921p
            r5.getClass()
            long r6 = r1.f303915j
            java.lang.String r8 = r3.f237531d
            r9 = 0
            java.lang.String r10 = "conv-delta-resp-rend"
            r5.mo98081m(r6, r8, r9, r10)
            return
        L_0x034a:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r1.f303926u = r0
            int r0 = r3.f237528a
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0361
            java.lang.String r0 = r3.f237531d
            com.google.android.libraries.gsa.conversation.h.u r0 = com.google.android.libraries.gsa.conversation.p1855h.C22704h.m42283b(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r1.f303926u = r0
            goto L_0x0375
        L_0x0361:
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0375
            com.google.common.o.l.r r0 = r3.f237535h
            if (r0 != 0) goto L_0x036b
            com.google.common.o.l.r r0 = com.google.common.p4552o.p4566l.C60218r.f162925d
        L_0x036b:
            com.google.android.libraries.gsa.conversation.h.u r0 = com.google.android.libraries.gsa.conversation.p1855h.C22704h.m42282a(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r1.f303926u = r0
        L_0x0375:
            com.google.android.apps.gsa.staticplugins.opa.util.w r0 = r1.f303921p
            r0.getClass()
            long r2 = r1.f303915j
            r0.mo98082n(r2)
            return
        L_0x0380:
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "onServiceEvent: %s eventData is null"
            r4 = 22561(0x5821, float:3.1615E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
            return
        L_0x038e:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r2 = r1.f303922q
            r0.<init>(r2)
            r2 = 2132091047(0x7f1520a7, float:1.9822451E38)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            r2 = 2132091046(0x7f1520a6, float:1.982245E38)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            r2 = 2132085566(0x7f150b3e, float:1.9811334E38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r8)
            com.google.android.apps.gsa.staticplugins.opa.g r2 = new com.google.android.apps.gsa.staticplugins.opa.g
            r2.<init>(r1)
            r3 = 2132085828(0x7f150c44, float:1.9811866E38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r2)
            r0.show()
            return
        L_0x03ba:
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88283vy.f238773a
            com.google.android.apps.gsa.search.shared.service.b.uo r4 = r0.f236959a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 != 0) goto L_0x03dd
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = "onServiceEvent: %s missing ShowAssistantResponse extension"
            r4 = 22560(0x5820, float:3.1613E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
            return
        L_0x03dd:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r2 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r2 = r0.mo81913d(r2)
            if (r2 == 0) goto L_0x03f0
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r2 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r2 = r0.mo81912b(r2)
            com.google.android.apps.gsa.shared.search.Query r2 = (com.google.android.apps.gsa.shared.search.Query) r2
            long r2 = r2.f252749G
            goto L_0x03f2
        L_0x03f0:
            r2 = 0
        L_0x03f2:
            r11 = r2
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88283vy.f238773a
            java.lang.Object r0 = r0.mo81918e(r2)
            com.google.android.apps.gsa.search.shared.service.b.wa r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88286wa) r0
            int r2 = r0.f238776a
            r2 = r2 & r9
            if (r2 == 0) goto L_0x0729
            com.google.assistant.e.e.a.j r0 = r0.f238777b
            if (r0 != 0) goto L_0x0406
            com.google.assistant.e.e.a.j r0 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
        L_0x0406:
            r2 = r0
            com.google.android.apps.gsa.staticplugins.opa.util.w r0 = r1.f303921p
            if (r0 != 0) goto L_0x0419
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "showAssistantResponse: AssistantResponse can't be handled with null callback"
            r3 = 22565(0x5825, float:3.162E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0419:
            r0.mo98082n(r11)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303916k
            boolean r0 = r0.mo95405ap()
            if (r0 != 0) goto L_0x071c
            com.google.protobuf.cq r0 = r2.f133272g
            java.util.Iterator r0 = r0.iterator()
        L_0x042a:
            boolean r3 = r0.hasNext()
            r4 = 8
            if (r3 == 0) goto L_0x043f
            java.lang.Object r3 = r0.next()
            com.google.assistant.e.e.a.b r3 = (com.google.assistant.p3897e.p3910e.p3911a.C51187b) r3
            int r3 = r3.f133237a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x042a
            r3 = 1
            goto L_0x0440
        L_0x043f:
            r3 = 0
        L_0x0440:
            int r0 = r2.f133266a
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0459
            com.google.assistant.e.e.a.i r0 = r2.f133270e
            if (r0 != 0) goto L_0x044b
            com.google.assistant.e.e.a.i r0 = com.google.assistant.p3897e.p3910e.p3911a.C51194i.f133258e
        L_0x044b:
            int r0 = r0.f133263d
            int r0 = com.google.assistant.p3897e.p3910e.p3911a.C51193h.m86083a(r0)
            if (r0 != 0) goto L_0x0454
            goto L_0x0459
        L_0x0454:
            if (r0 == r6) goto L_0x0457
            goto L_0x0459
        L_0x0457:
            r0 = 0
            goto L_0x045a
        L_0x0459:
            r0 = 1
        L_0x045a:
            java.lang.String r5 = "Contextual cards should be handled by handleContextualCards"
            com.google.common.base.C58838bb.m90869d(r0, r5)
            r1.f303909d = r8
            com.google.protobuf.cq r0 = r2.f133272g
            java.util.Iterator r5 = r0.iterator()
            r13 = r8
            r10 = 0
        L_0x0469:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05d9
            java.lang.Object r0 = r5.next()
            r14 = r0
            com.google.assistant.e.e.a.b r14 = (com.google.assistant.p3897e.p3910e.p3911a.C51187b) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r0 = r14.f133238b
            com.google.at.h.b.a.r r8 = r14.f133239c
            if (r8 != 0) goto L_0x0483
            com.google.at.h.b.a.r r8 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
        L_0x0483:
            com.google.android.apps.gsa.search.shared.f.a r16 = r1.mo97633a(r8)     // Catch:{ h -> 0x048a }
            r4 = r16
            goto L_0x049b
        L_0x048a:
            r0 = move-exception
            r4 = r0
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r6 = "Invalid card data."
            r9 = 22555(0x581b, float:3.1606E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r4)).mo56372aa(r9)).mo56386p(r6)
            r0 = 0
            r4 = 0
        L_0x049b:
            com.google.android.apps.gsa.staticplugins.opa.util.w r6 = r1.f303921p
            r6.getClass()
            com.google.assistant.e.a.f r9 = r14.f133241e
            if (r9 != 0) goto L_0x04a6
            com.google.assistant.e.a.f r9 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x04a6:
            r6.mo98087s(r9, r3)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x04bf
            r0.getClass()
            com.google.assistant.e.a.f r6 = r14.f133241e
            if (r6 != 0) goto L_0x04b8
            com.google.assistant.e.a.f r6 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x04b8:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r0 = r1.m181660e(r0, r6)
            r15.add(r0)
        L_0x04bf:
            if (r4 == 0) goto L_0x04e4
            android.view.View r0 = r4.mo25098kH()
            if (r0 == 0) goto L_0x04e4
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.aj
            android.view.View r6 = r4.mo25098kH()
            r6.getClass()
            r0.<init>(r6, r7)
            com.google.assistant.e.e.a.t r6 = r14.f133240d
            if (r6 != 0) goto L_0x04d9
            com.google.assistant.e.e.a.t r6 = com.google.assistant.p3897e.p3910e.p3911a.C51205t.f133298d
        L_0x04d9:
            r0.mo96596c(r8, r4, r6)
            r15.add(r0)
            r1.mo97634d(r8)
            goto L_0x0561
        L_0x04e4:
            com.google.assistant.e.e.a.t r0 = r14.f133240d
            if (r0 != 0) goto L_0x04ea
            com.google.assistant.e.e.a.t r0 = com.google.assistant.p3897e.p3910e.p3911a.C51205t.f133298d
        L_0x04ea:
            com.google.l.a.a.f r0 = r0.f133301b
            if (r0 != 0) goto L_0x04f0
            com.google.l.a.a.f r0 = com.google.p4691l.p4692a.p4693a.C62018f.f167582c
        L_0x04f0:
            boolean r4 = r0.f167585b
            if (r4 == 0) goto L_0x04fb
            java.lang.String r0 = r0.f167584a
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            goto L_0x04fd
        L_0x04fb:
            java.lang.String r0 = r0.f167584a
        L_0x04fd:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0561
            com.google.assistant.e.e.a.t r4 = r14.f133240d
            if (r4 != 0) goto L_0x0509
            com.google.assistant.e.e.a.t r4 = com.google.assistant.p3897e.p3910e.p3911a.C51205t.f133298d
        L_0x0509:
            int r4 = r4.f133302c
            int r4 = com.google.assistant.p3897e.p3910e.p3911a.C51204s.m86085a(r4)
            if (r4 != 0) goto L_0x0512
            r4 = 2
        L_0x0512:
            int r4 = r4 + -1
            r6 = 1
            if (r4 == r6) goto L_0x0551
            r6 = 2
            if (r4 == r6) goto L_0x0543
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r4 = 22554(0x581a, float:3.1605E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.assistant.e.e.a.t r4 = r14.f133240d
            if (r4 != 0) goto L_0x0530
            com.google.assistant.e.e.a.t r4 = com.google.assistant.p3897e.p3910e.p3911a.C51205t.f133298d
        L_0x0530:
            int r4 = r4.f133302c
            int r4 = com.google.assistant.p3897e.p3910e.p3911a.C51204s.m86085a(r4)
            if (r4 != 0) goto L_0x0539
            r4 = 2
        L_0x0539:
            java.lang.String r6 = "Unrecognized rendering type: %d"
            int r4 = r4 + -1
            r0.mo56387q(r6, r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0561
        L_0x0543:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ab r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ab
            r0.getClass()
            com.google.android.apps.gsa.shared.util.t.g r6 = r1.f303907b
            r4.<init>(r0, r6)
            r15.add(r4)
            goto L_0x0561
        L_0x0551:
            r0.getClass()
            com.google.assistant.e.a.f r4 = r14.f133241e
            if (r4 != 0) goto L_0x055a
            com.google.assistant.e.a.f r4 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x055a:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r0 = r1.m181660e(r0, r4)
            r15.add(r0)
        L_0x0561:
            java.lang.String r0 = r14.f133242f
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0576
            com.google.assistant.e.a.f r4 = r14.f133241e
            if (r4 != 0) goto L_0x056f
            com.google.assistant.e.a.f r4 = com.google.assistant.p3897e.p3898a.C50870f.f132446g
        L_0x056f:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r0 = r1.m181660e(r0, r4)
            r15.add(r0)
        L_0x0576:
            java.lang.String r0 = r14.f133243g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0582
            java.lang.String r0 = r14.f133243g
            r1.f303909d = r0
        L_0x0582:
            java.util.Iterator r0 = r15.iterator()
        L_0x0586:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x05d2
            java.lang.Object r4 = r0.next()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc) r4
            r4.f301038t = r11
            boolean r6 = r4 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf
            if (r6 == 0) goto L_0x05cb
            r6 = r4
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r6 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r6
            if (r13 != 0) goto L_0x059f
        L_0x059d:
            r8 = 1
            goto L_0x05c7
        L_0x059f:
            boolean r8 = r13.mo96710A()
            if (r8 == 0) goto L_0x05a6
            goto L_0x059d
        L_0x05a6:
            java.lang.String r8 = r13.f301045a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x05b9
            java.lang.String r8 = r6.f301045a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x05b7
            goto L_0x059d
        L_0x05b7:
            r8 = 0
            goto L_0x05c7
        L_0x05b9:
            java.lang.String r8 = r13.f301045a
            r8.getClass()
            java.lang.String r9 = r6.f301045a
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x05b7
            goto L_0x059d
        L_0x05c7:
            r6.mo96611b(r8)
            r13 = r6
        L_0x05cb:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r6 = r1.f303916k
            r6.mo95430s(r4)
            r10 = 1
            goto L_0x0586
        L_0x05d2:
            r4 = 8
            r6 = 2
            r8 = 0
            r9 = 1
            goto L_0x0469
        L_0x05d9:
            if (r10 == 0) goto L_0x05f6
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            int r3 = r2.f133266a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x05ed
            java.lang.String r0 = r2.f133271f
            com.google.android.libraries.gsa.conversation.h.u r0 = com.google.android.libraries.gsa.conversation.p1855h.C22704h.m42283b(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x05ed:
            com.google.android.apps.gsa.staticplugins.opa.util.w r3 = r1.f303921p
            r3.getClass()
            r4 = 1
            r3.mo98091w(r4, r11, r0)
        L_0x05f6:
            com.google.protobuf.cq r0 = r2.f133268c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x070d
            com.google.protobuf.cq r0 = r2.f133268c
            com.google.protos.f.u.p[] r3 = new com.google.protos.p4985f.p5042u.C65354p[r7]
            java.lang.Object[] r0 = r0.toArray(r3)
            com.google.protos.f.u.p[] r0 = (com.google.protos.p4985f.p5042u.C65354p[]) r0
            r0.getClass()
            com.google.protos.f.u.p[] r0 = (com.google.protos.p4985f.p5042u.C65354p[]) r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r3 = r1.f303916k
            com.google.android.apps.gsa.staticplugins.opa.chatui.ij r4 = r1.f303918m
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r0.length
        L_0x0617:
            if (r7 >= r6) goto L_0x070a
            r8 = r0[r7]
            com.google.protos.f.u.r r9 = r8.f177741f
            if (r9 != 0) goto L_0x0621
            com.google.protos.f.u.r r9 = com.google.protos.p4985f.p5042u.C65356r.f177743a
        L_0x0621:
            com.google.protobuf.bt r10 = com.google.protos.p4950bb.p4951a.C64390b.f174636c
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r9 = r9.f169962ag
            com.google.protobuf.bs r13 = r10.f169971d
            java.lang.Object r9 = r9.mo58854l(r13)
            if (r9 != 0) goto L_0x0637
            java.lang.Object r9 = r10.f169969b
            goto L_0x063b
        L_0x0637:
            java.lang.Object r9 = r10.mo58889c(r9)
        L_0x063b:
            com.google.protos.bb.a.b r9 = (com.google.protos.p4950bb.p4951a.C64390b) r9
            int r9 = r9.f174638a
            int r10 = r8.f177737b
            r13 = 8
            if (r10 != r13) goto L_0x0660
            int r10 = r8.f177736a
            r14 = 1
            r10 = r10 & r14
            if (r10 == 0) goto L_0x065e
            java.lang.String r10 = r8.f177739d
            java.lang.String r8 = r8.f177740e
            com.google.android.apps.gsa.staticplugins.opa.chatui.gy r8 = r4.mo96871a(r9, r10, r8)
            r4.mo96874d(r8)
            r23 = r0
            r24 = r6
            r6 = 2
        L_0x065b:
            r9 = 0
            goto L_0x06fd
        L_0x065e:
            r10 = 8
        L_0x0660:
            r14 = 5
            if (r10 != r14) goto L_0x06f6
            int r10 = r8.f177736a
            r14 = 1
            r10 = r10 & r14
            if (r10 == 0) goto L_0x06f6
            java.lang.Object r10 = r8.f177738c
            com.google.protos.au.h r10 = (com.google.protos.p4892au.C63830h) r10
            java.lang.String r15 = r8.f177739d
            java.lang.String r8 = r8.f177740e
            int r13 = r10.f172623a
            int r13 = com.google.protos.p4892au.C63829g.m96314a(r13)
            if (r13 != 0) goto L_0x067a
            goto L_0x0684
        L_0x067a:
            r14 = 2
            if (r13 != r14) goto L_0x0684
            r23 = r0
            r24 = r6
            r6 = 2
            r8 = 0
            goto L_0x065b
        L_0x0684:
            com.google.protobuf.cq r10 = r10.f172624b
            java.util.Iterator r10 = r10.iterator()
        L_0x068a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x06c4
            java.lang.Object r13 = r10.next()
            com.google.protos.au.d r13 = (com.google.protos.p4892au.C63826d) r13
            int r14 = r13.f172614a
            r17 = r14 & 1
            r23 = r0
            if (r17 == 0) goto L_0x06af
            int r0 = r13.f172615b
            int r0 = com.google.protos.p4892au.C63825c.m96313a(r0)
            if (r0 == 0) goto L_0x06ac
            r24 = r6
            r6 = 2
            if (r0 != r6) goto L_0x06bf
            goto L_0x06b2
        L_0x06ac:
            r0 = r23
            goto L_0x068a
        L_0x06af:
            r24 = r6
            r6 = 2
        L_0x06b2:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x06ca
            java.lang.String r0 = r13.f172616c
            boolean r0 = r4.mo96873c(r0)
            if (r0 == 0) goto L_0x06bf
            goto L_0x06ca
        L_0x06bf:
            r0 = r23
            r6 = r24
            goto L_0x068a
        L_0x06c4:
            r23 = r0
            r24 = r6
            r6 = 2
            r13 = 0
        L_0x06ca:
            if (r13 == 0) goto L_0x06fb
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108251bv.m179920e(r9)
            if (r0 == 0) goto L_0x06e6
            com.google.android.apps.gsa.staticplugins.opa.chatui.bv r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bv
            com.google.android.apps.gsa.search.core.i.t r10 = r4.f301590b
            r17 = r0
            r18 = r13
            r19 = r9
            r20 = r15
            r21 = r8
            r22 = r10
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x06eb
        L_0x06e6:
            com.google.android.apps.gsa.staticplugins.opa.chatui.cd r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cd
            r0.<init>(r13, r9, r15, r8)
        L_0x06eb:
            r8 = r0
            com.google.android.libraries.logging.j r0 = r8.f301597d
            r9 = 0
            r0.mo33792f(r9)
            r4.mo96874d(r8)
            goto L_0x06fd
        L_0x06f6:
            r23 = r0
            r24 = r6
            r6 = 2
        L_0x06fb:
            r9 = 0
            r8 = r9
        L_0x06fd:
            if (r8 == 0) goto L_0x0702
            r5.add(r8)
        L_0x0702:
            int r7 = r7 + 1
            r0 = r23
            r6 = r24
            goto L_0x0617
        L_0x070a:
            r3.mo95408as(r5)
        L_0x070d:
            com.google.android.apps.gsa.staticplugins.opa.util.w r10 = r1.f303921p
            r10.getClass()
            java.lang.String r13 = r2.f133271f
            java.lang.String r14 = r1.f303909d
            java.lang.String r15 = "response-rendered"
            r10.mo98081m(r11, r13, r14, r15)
            return
        L_0x071c:
            com.google.common.f.e r0 = f303906a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "showAssistantResponse: should prevent updates to ChatUi"
            r3 = 22564(0x5824, float:3.1619E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x0729:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109138h.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    public C109138h(C108230ba baVar, C91097g gVar, FragmentManager fragmentManager, C107659as asVar, C107144k kVar, C113892w wVar, C108244bo boVar, C108211ai aiVar, C60870cx cxVar, C107710u uVar, C68214a aVar, C89911f fVar, C108429ij ijVar, C68214a aVar2, C109259hx hxVar, Context context, C68214a aVar3, Activity activity, C21370a aVar4, C114582bc bcVar) {
        baVar.getClass();
        this.f303916k = baVar;
        gVar.getClass();
        this.f303907b = gVar;
        this.f303917l = aVar;
        this.f303908c = fVar;
        this.f303918m = ijVar;
        this.f303919n = aVar2;
        this.f303910e = fragmentManager;
        this.f303911f = context;
        this.f303920o = aVar3;
        C113892w wVar2 = wVar;
        this.f303921p = wVar2;
        this.f303922q = activity;
        this.f303923r = aVar4;
        this.f303913h = cxVar;
        this.f303912g = C58886cw.m90973a(new C108520d(this, hxVar, baVar, gVar, wVar2, boVar, asVar, kVar, aiVar));
        this.f303924s = bcVar;
        uVar.mo96220c(this, C88244um.ASSISTANT_REQUEST_ID, C88244um.CONVERSATION_SURFACE_EVENT, C88244um.NOTIFY_COMPLETED_ASSISTANT_CONVERSATION, C88244um.SHOW_ASSISTANT_RESPONSE, C88244um.START_OF_SPEECH, C88244um.OPA_SESSION_SERVICE_EVENT, C88244um.OPEN_ANDROID_NOTIFICATION_SETTINGS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C87545a mo97633a(C54201r rVar) {
        C87546b bVar;
        if (rVar != null && (rVar.f142245a & 1) != 0 && (bVar = this.f303914i) != null) {
            return bVar.mo77519a(rVar.toByteArray());
        }
        this.f303908c.mo83755a((Throwable) null, 38437351, 29).mo83721a();
        return null;
    }
}
