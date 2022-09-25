package com.google.android.apps.gsa.staticplugins.bubble;

import android.view.ContextThemeWrapper;
import android.view.WindowManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97209d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97211f;
import com.google.android.apps.gsa.staticplugins.bubble.p7581e.C96967b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.C97016d;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97044g;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b.C97035a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4559e.C59743a;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f */
/* compiled from: PG */
public final class C96968f {

    /* renamed from: d */
    private static final C59071e f271002d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.f");

    /* renamed from: a */
    public final C22871g f271003a;

    /* renamed from: b */
    public final C97017g f271004b;

    /* renamed from: c */
    public final C96967b f271005c;

    /* renamed from: e */
    private final C69464a f271006e;

    /* renamed from: f */
    private final C86124t f271007f;

    /* renamed from: g */
    private final C68214a f271008g;

    public C96968f(C22871g gVar, C97017g gVar2, C69464a aVar, C96967b bVar, C86124t tVar, C68214a aVar2) {
        this.f271003a = gVar;
        this.f271004b = gVar2;
        this.f271006e = aVar;
        this.f271005c = bVar;
        this.f271007f = tVar;
        this.f271008g = aVar2;
    }

    /* renamed from: a */
    public final void mo90386a(C97040c cVar, C97016d dVar) {
        if (dVar.f271131a) {
            C97211f fVar = (C97211f) this.f271008g.mo27525b();
            C97211f fVar2 = fVar;
            C97209d dVar2 = new C97209d(fVar2, new ContextThemeWrapper(fVar.f271605b, R.style.bubble_window_snackbar), dVar.f271133c, dVar.f271132b, new C96946b(this, cVar));
            WindowManager windowManager = fVar.f271604a;
            WindowManager.LayoutParams a = C97044g.m160631a(-1, -2, 1000);
            a.gravity = 80;
            windowManager.addView(dVar2, a);
        }
        C97017g gVar = this.f271004b;
        synchronized (gVar.f271136b) {
            gVar.mo90391a(cVar, false);
        }
    }

    /* renamed from: b */
    public final void mo90387b(C88474x xVar) {
        int a = C97035a.m160609a(xVar);
        int i = xVar.f239175b;
        C88473w wVar = C88473w.UNKNOWN;
        C59743a aVar = C59743a.LIVE_RESULTS_BUBBLE_POPOUT;
        C88473w a2 = C88473w.m142819a(xVar.f239175b);
        if (a2 == null) {
            a2 = C88473w.UNKNOWN;
        }
        C97042e.m160627c(aVar, C97042e.m160626b(a2), a);
        this.f271003a.mo28212l("askForPermissionAndShowBubble", new C96952c(this, xVar, a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x018e, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90388c(com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x r31, int r32) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            int r3 = r2.f239175b
            com.google.android.apps.gsa.search.shared.service.c.b.w r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.m142819a(r3)
            if (r3 != 0) goto L_0x000e
            com.google.android.apps.gsa.search.shared.service.c.b.w r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.UNKNOWN
        L_0x000e:
            com.google.android.apps.gsa.search.shared.service.c.b.w r4 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.UNKNOWN
            boolean r3 = r3.equals(r4)
            r4 = 3
            if (r3 == 0) goto L_0x004a
            int r3 = r2.f239175b
            com.google.android.apps.gsa.search.shared.service.c.b.w r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.m142819a(r3)
            if (r3 != 0) goto L_0x0021
            com.google.android.apps.gsa.search.shared.service.c.b.w r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.UNKNOWN
        L_0x0021:
            int r3 = com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e.m160626b(r3)
            r5 = r32
            com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e.m160628d(r4, r3, r5)
            com.google.common.f.e r3 = f271002d
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 18312(0x4788, float:2.566E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r2 = r2.f239175b
            com.google.android.apps.gsa.search.shared.service.c.b.w r2 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.m142819a(r2)
            if (r2 != 0) goto L_0x0044
            com.google.android.apps.gsa.search.shared.service.c.b.w r2 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.UNKNOWN
        L_0x0044:
            java.lang.String r4 = "Got bubble type that is not supported - %s"
            r3.mo56389s(r4, r2)
            return
        L_0x004a:
            g.a.a r3 = r1.f271006e
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.apps.gsa.binaries.satin.app.ami r3 = (com.google.android.apps.gsa.binaries.satin.app.ami) r3
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.staticplugins.bubble.p7582f.C96982b.f271035e
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r2.mo58887l(r5)
            com.google.protobuf.bf r6 = r2.f169962ag
            com.google.protobuf.bs r7 = r5.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x0068
            java.lang.Object r5 = r5.f169969b
            goto L_0x006c
        L_0x0068:
            java.lang.Object r5 = r5.mo58889c(r6)
        L_0x006c:
            com.google.android.apps.gsa.staticplugins.bubble.f.b r5 = (com.google.android.apps.gsa.staticplugins.bubble.p7582f.C96982b) r5
            if (r5 != 0) goto L_0x0072
            com.google.android.apps.gsa.staticplugins.bubble.f.b r5 = com.google.android.apps.gsa.staticplugins.bubble.p7582f.C96982b.f271034d
        L_0x0072:
            r5.getClass()
            r3.f197978c = r5
            r31.getClass()
            r3.f197979d = r2
            com.google.android.apps.gsa.staticplugins.bubble.g r2 = r1.f271004b
            java.util.LinkedHashMap r2 = r2.f271136b
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.f197980e = r2
            com.google.android.apps.gsa.staticplugins.bubble.f.b r2 = r3.f197978c
            java.lang.Class<com.google.android.apps.gsa.staticplugins.bubble.f.b> r5 = com.google.android.apps.gsa.staticplugins.bubble.p7582f.C96982b.class
            dagger.p5294a.C68225k.m98529a(r2, r5)
            com.google.android.apps.gsa.search.shared.service.c.b.x r2 = r3.f197979d
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.c.b.x> r5 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x.class
            dagger.p5294a.C68225k.m98529a(r2, r5)
            java.lang.Integer r2 = r3.f197980e
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            dagger.p5294a.C68225k.m98529a(r2, r5)
            com.google.android.apps.gsa.binaries.satin.app.amk r2 = new com.google.android.apps.gsa.binaries.satin.app.amk
            com.google.android.apps.gsa.binaries.satin.app.aqy r5 = r3.f197976a
            com.google.android.apps.gsa.binaries.satin.app.alk r6 = r3.f197977b
            com.google.android.apps.gsa.search.shared.service.c.b.x r7 = r3.f197979d
            java.lang.Integer r3 = r3.f197980e
            r2.<init>(r5, r6, r7, r3)
            com.google.android.apps.gsa.staticplugins.bubble.g r3 = r1.f271004b
            g.a.a r5 = r2.k
            java.lang.Object r5 = r5.mo17428b()
            com.google.android.apps.gsa.staticplugins.bubble.i.c r5 = (com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c) r5
            g.a.a r2 = r2.C
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.staticplugins.bubble.mvc.b r2 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.C97049b) r2
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f271007f
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90003bi.f246872h
            long r6 = r6.mo79743a(r7)
            int r7 = (int) r6
            java.util.LinkedHashMap r6 = r3.f271136b
            monitor-enter(r6)
            java.util.LinkedHashMap r8 = r3.f271136b     // Catch:{ all -> 0x05d1 }
            boolean r8 = r8.containsKey(r5)     // Catch:{ all -> 0x05d1 }
            r9 = 4
            if (r8 == 0) goto L_0x018f
            java.util.LinkedHashMap r2 = r3.f271136b     // Catch:{ all -> 0x05d1 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.b r2 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.C97049b) r2     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.search.shared.service.c.b.w r3 = r5.mo90392a()     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.search.shared.service.c.b.w r4 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.SEARCH     // Catch:{ all -> 0x05d1 }
            if (r3 == r4) goto L_0x018d
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r3 = r2.f271183h     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r4 = com.google.android.apps.gsa.staticplugins.bubble.mvc.C97045a.CREATED     // Catch:{ all -> 0x05d1 }
            if (r3 == r4) goto L_0x0102
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bubble.mvc.C97049b.f271176a     // Catch:{ all -> 0x05d1 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x05d1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x05d1 }
            r4 = 18335(0x479f, float:2.5693E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x05d1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x05d1 }
            java.lang.String r4 = "animateToScreenCenter() called on bubble with state [%s]"
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r2 = r2.f271183h     // Catch:{ all -> 0x05d1 }
            r3.mo56389s(r4, r2)     // Catch:{ all -> 0x05d1 }
            goto L_0x018d
        L_0x0102:
            dagger.a r2 = r2.f271179d     // Catch:{ all -> 0x05d1 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah r2 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97136ah) r2     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h r3 = r2.f271415m     // Catch:{ all -> 0x05d1 }
            if (r3 == 0) goto L_0x017e
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.m r4 = r2.f271416n     // Catch:{ all -> 0x05d1 }
            if (r4 != 0) goto L_0x0113
            goto L_0x017e
        L_0x0113:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.b r4 = r3.f271343l     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.b r4 = r4.mo90473b()     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.b r5 = r3.mo90495d(r4)     // Catch:{ all -> 0x05d1 }
            r7 = r5
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a r7 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a) r7     // Catch:{ all -> 0x05d1 }
            float r7 = r7.f271607a     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.b r8 = r3.f271343l     // Catch:{ all -> 0x05d1 }
            com.google.android.libraries.ad.j r8 = r8.f271316b     // Catch:{ all -> 0x05d1 }
            float r8 = r8.f397999e     // Catch:{ all -> 0x05d1 }
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0141
            float r7 = r4.mo90592a()     // Catch:{ all -> 0x05d1 }
            int r8 = r3.mo90493b()     // Catch:{ all -> 0x05d1 }
            int r8 = r8 / r9
            float r8 = (float) r8     // Catch:{ all -> 0x05d1 }
            float r7 = r7 - r8
            float r4 = r4.mo90593b()     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a r8 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a     // Catch:{ all -> 0x05d1 }
            r8.<init>(r7, r4)     // Catch:{ all -> 0x05d1 }
            goto L_0x0155
        L_0x0141:
            float r7 = r4.mo90592a()     // Catch:{ all -> 0x05d1 }
            int r8 = r3.mo90493b()     // Catch:{ all -> 0x05d1 }
            int r8 = r8 / r9
            float r8 = (float) r8     // Catch:{ all -> 0x05d1 }
            float r7 = r7 + r8
            float r4 = r4.mo90593b()     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a r8 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a     // Catch:{ all -> 0x05d1 }
            r8.<init>(r7, r4)     // Catch:{ all -> 0x05d1 }
        L_0x0155:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.b r4 = r3.f271343l     // Catch:{ all -> 0x05d1 }
            com.google.android.libraries.ad.r r7 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h.f271333b     // Catch:{ all -> 0x05d1 }
            r4.mo90475d(r7, r8)     // Catch:{ all -> 0x05d1 }
            android.view.View r4 = r3.f271339h     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.e r7 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.e     // Catch:{ all -> 0x05d1 }
            r7.<init>(r3, r5)     // Catch:{ all -> 0x05d1 }
            r8 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r7, r8)     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.m r2 = r2.f271416n     // Catch:{ all -> 0x05d1 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1066024305(0x3f8a3d71, float:1.08)
            com.google.android.libraries.ad.j r3 = r2.mo90503a(r3, r4)     // Catch:{ all -> 0x05d1 }
            android.view.View r2 = r2.f271357a     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.j r4 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.j     // Catch:{ all -> 0x05d1 }
            r4.<init>(r3)     // Catch:{ all -> 0x05d1 }
            r2.postDelayed(r4, r8)     // Catch:{ all -> 0x05d1 }
            goto L_0x018d
        L_0x017e:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97136ah.f271397a     // Catch:{ all -> 0x05d1 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x05d1 }
            java.lang.String r3 = "Invalid state. Called playAttentionSeekingAnimation without calling onCreate."
            r4 = 18408(0x47e8, float:2.5795E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x05d1 }
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x05d1 }
        L_0x018d:
            monitor-exit(r6)     // Catch:{ all -> 0x05d1 }
            return
        L_0x018f:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r8 = r2.f271183h     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r10 = com.google.android.apps.gsa.staticplugins.bubble.mvc.C97045a.DESTROYED     // Catch:{ d -> 0x05af }
            r12 = 0
            if (r8 != r10) goto L_0x058e
            android.content.Context r8 = r2.f271180e     // Catch:{ d -> 0x05af }
            com.google.android.libraries.p2459q.C32047d.m59724a(r8)     // Catch:{ d -> 0x05af }
            dagger.a r8 = r2.f271178c     // Catch:{ d -> 0x05af }
            r8.mo27525b()     // Catch:{ d -> 0x05af }
            dagger.a r8 = r2.f271177b     // Catch:{ d -> 0x05af }
            r8.mo27525b()     // Catch:{ d -> 0x05af }
            dagger.a r8 = r2.f271179d     // Catch:{ d -> 0x05af }
            r8.mo27525b()     // Catch:{ d -> 0x05af }
            dagger.a r8 = r2.f271179d     // Catch:{ d -> 0x05af }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah r8 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97136ah) r8     // Catch:{ d -> 0x05af }
            r8.f271426x = r12     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c r10 = r8.f271407e     // Catch:{ d -> 0x05af }
            r10.mo90577e(r8)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c r10 = r8.f271407e     // Catch:{ d -> 0x05af }
            r10.mo90576d()     // Catch:{ d -> 0x05af }
            android.content.Context r10 = r8.f271404b     // Catch:{ d -> 0x05af }
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)     // Catch:{ d -> 0x05af }
            r13 = 2131626733(0x7f0e0aed, float:1.888071E38)
            r14 = 0
            android.view.View r10 = r10.inflate(r13, r14)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r10 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BubbleView) r10     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.i.b.c r13 = r8.f271409g     // Catch:{ d -> 0x05af }
            int r13 = r13.mo90401a()     // Catch:{ d -> 0x05af }
            r10.setLayoutDirection(r13)     // Catch:{ d -> 0x05af }
            r13 = 2131429780(0x7f0b0994, float:1.8481242E38)
            android.view.View r13 = r10.findViewById(r13)     // Catch:{ d -> 0x05af }
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c r15 = r8.f271407e     // Catch:{ d -> 0x05af }
            android.view.View r15 = r15.mo90573a()     // Catch:{ d -> 0x05af }
            r13.addView(r15)     // Catch:{ d -> 0x05af }
            r13 = 2131429778(0x7f0b0992, float:1.8481238E38)
            android.view.View r13 = r10.findViewById(r13)     // Catch:{ d -> 0x05af }
            androidx.cardview.widget.CardView r13 = (androidx.cardview.widget.CardView) r13     // Catch:{ d -> 0x05af }
            r8.f271423u = r13     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.w r13 = r8.f271398A     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.w r15 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.SEARCH     // Catch:{ d -> 0x05af }
            if (r13 != r15) goto L_0x0208
            androidx.cardview.widget.CardView r13 = r8.f271423u     // Catch:{ d -> 0x05af }
            r15 = 0
            r13.mo4475e(r15)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ab r13 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ab     // Catch:{ d -> 0x05af }
            r13.<init>(r8, r10)     // Catch:{ d -> 0x05af }
            r10.mo90609a(r13)     // Catch:{ d -> 0x05af }
        L_0x0208:
            r8.mo90528p()     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j     // Catch:{ d -> 0x05af }
            r15 = 50187(0xc40b, float:7.0327E-41)
            r13.<init>(r15)     // Catch:{ d -> 0x05af }
            r15 = 5
            r13.mo33795i(r15)     // Catch:{ d -> 0x05af }
            r4 = 38
            r13.mo33795i(r4)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.C28295m.m52919e(r10, r13)     // Catch:{ d -> 0x05af }
            r4 = 2131429776(0x7f0b0990, float:1.8481234E38)
            android.view.View r4 = r10.findViewById(r4)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j     // Catch:{ d -> 0x05af }
            r12 = 51684(0xc9e4, float:7.2425E-41)
            r13.<init>(r12)     // Catch:{ d -> 0x05af }
            r12 = 2
            r13.mo33794h(r12)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.C28295m.m52919e(r4, r13)     // Catch:{ d -> 0x05af }
            r8.f271420r = r10     // Catch:{ d -> 0x05af }
            android.content.Context r4 = r8.f271404b     // Catch:{ d -> 0x05af }
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)     // Catch:{ d -> 0x05af }
            r10 = 2131626734(0x7f0e0aee, float:1.8880713E38)
            android.view.View r4 = r4.inflate(r10, r14)     // Catch:{ d -> 0x05af }
            r10 = 2131429394(0x7f0b0812, float:1.848046E38)
            android.view.View r10 = r4.findViewById(r10)     // Catch:{ d -> 0x05af }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c r13 = r8.f271407e     // Catch:{ d -> 0x05af }
            android.view.View r13 = r13.mo90574b()     // Catch:{ d -> 0x05af }
            r10.addView(r13)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.i.b.c r10 = r8.f271409g     // Catch:{ d -> 0x05af }
            int r10 = r10.mo90401a()     // Catch:{ d -> 0x05af }
            r4.setLayoutDirection(r10)     // Catch:{ d -> 0x05af }
            r10 = 2131429393(0x7f0b0811, float:1.8480457E38)
            android.view.View r13 = r4.findViewById(r10)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.j r9 = new com.google.android.libraries.logging.j     // Catch:{ d -> 0x05af }
            r11 = 50188(0xc40c, float:7.0328E-41)
            r9.<init>(r11)     // Catch:{ d -> 0x05af }
            r9.mo33795i(r15)     // Catch:{ d -> 0x05af }
            r9.mo33794h(r12)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.C28295m.m52919e(r13, r9)     // Catch:{ d -> 0x05af }
            r8.f271421s = r4     // Catch:{ d -> 0x05af }
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            android.view.View r4 = r4.findViewById(r10)     // Catch:{ d -> 0x05af }
            r8.f271422t = r4     // Catch:{ d -> 0x05af }
            android.content.Context r4 = r8.f271404b     // Catch:{ d -> 0x05af }
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)     // Catch:{ d -> 0x05af }
            r9 = 2131624689(0x7f0e02f1, float:1.8876565E38)
            android.view.View r4 = r4.inflate(r9, r14)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout r4 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view.BackButtonFrameLayout) r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ad r9 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ad     // Catch:{ d -> 0x05af }
            r9.<init>(r8)     // Catch:{ d -> 0x05af }
            r4.f271644a = r9     // Catch:{ d -> 0x05af }
            r8.f271419q = r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.e.b r4 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e.C97207b.NONE     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.q r4 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88467q.UNSPECIFIED     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.q r4 = r8.f271411i     // Catch:{ d -> 0x05af }
            int r4 = r4.ordinal()     // Catch:{ d -> 0x05af }
            r9 = 1
            if (r4 == r9) goto L_0x02ad
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            r9 = 4
            r4.setVisibility(r9)     // Catch:{ d -> 0x05af }
            goto L_0x02c5
        L_0x02ad:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r4 = r8.f271420r     // Catch:{ d -> 0x05af }
            r9 = 4
            r4.setVisibility(r9)     // Catch:{ d -> 0x05af }
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            r9 = 0
            r4.setVisibility(r9)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout r4 = r8.f271419q     // Catch:{ d -> 0x05af }
            r4.setVisibility(r9)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout r4 = r8.f271419q     // Catch:{ d -> 0x05af }
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setBackgroundColor(r9)     // Catch:{ d -> 0x05af }
        L_0x02c5:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.i r4 = r8.f271399B     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r9 = r8.f271420r     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.o r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.o     // Catch:{ d -> 0x05af }
            r10.<init>(r8)     // Catch:{ d -> 0x05af }
            androidx.cardview.widget.CardView r11 = r8.f271423u     // Catch:{ d -> 0x05af }
            if (r11 != 0) goto L_0x02d5
            r28 = 0
            goto L_0x02df
        L_0x02d5:
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()     // Catch:{ d -> 0x05af }
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11     // Catch:{ d -> 0x05af }
            int r11 = r11.topMargin     // Catch:{ d -> 0x05af }
            r28 = r11
        L_0x02df:
            com.google.android.apps.gsa.search.shared.service.c.b.w r11 = r8.f271398A     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.w r13 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.SEARCH     // Catch:{ d -> 0x05af }
            if (r11 != r13) goto L_0x02e8
            r29 = 1
            goto L_0x02ea
        L_0x02e8:
            r29 = 0
        L_0x02ea:
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h r11 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h     // Catch:{ d -> 0x05af }
            g.a.a r13 = r4.f271349a     // Catch:{ d -> 0x05af }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ d -> 0x05af }
            r22 = r13
            android.content.Context r22 = (android.content.Context) r22     // Catch:{ d -> 0x05af }
            r22.getClass()     // Catch:{ d -> 0x05af }
            g.a.a r13 = r4.f271350b     // Catch:{ d -> 0x05af }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ d -> 0x05af }
            r23 = r13
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.t r23 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97124t) r23     // Catch:{ d -> 0x05af }
            r23.getClass()     // Catch:{ d -> 0x05af }
            g.a.a r13 = r4.f271351c     // Catch:{ d -> 0x05af }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ d -> 0x05af }
            r24 = r13
            com.google.android.apps.gsa.staticplugins.bubble.i.c r24 = (com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c) r24     // Catch:{ d -> 0x05af }
            r24.getClass()     // Catch:{ d -> 0x05af }
            g.a.a r4 = r4.f271352d     // Catch:{ d -> 0x05af }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ d -> 0x05af }
            r25 = r4
            com.google.android.apps.gsa.search.core.i.t r25 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r25     // Catch:{ d -> 0x05af }
            r25.getClass()     // Catch:{ d -> 0x05af }
            r9.getClass()     // Catch:{ d -> 0x05af }
            r21 = r11
            r26 = r9
            r27 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ d -> 0x05af }
            r8.f271415m = r11     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h r4 = r8.f271415m     // Catch:{ d -> 0x05af }
            android.view.View r9 = r4.f271339h     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.f r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.f     // Catch:{ d -> 0x05af }
            r10.<init>(r4)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97216d.m160921a(r9, r10)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.t r9 = r4.f271336e     // Catch:{ d -> 0x05af }
            java.util.Set r9 = r9.f271382a     // Catch:{ d -> 0x05af }
            r9.add(r4)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.b r9 = r4.f271343l     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.g r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.g     // Catch:{ d -> 0x05af }
            r10.<init>(r4)     // Catch:{ d -> 0x05af }
            java.util.List r4 = r9.f271315a     // Catch:{ d -> 0x05af }
            r4.add(r10)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.m r4 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.m     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r9 = r8.f271420r     // Catch:{ d -> 0x05af }
            r4.<init>(r9)     // Catch:{ d -> 0x05af }
            r8.f271416n = r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.o r4 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.o     // Catch:{ d -> 0x05af }
            android.view.WindowManager r10 = r8.f271405c     // Catch:{ d -> 0x05af }
            android.hardware.display.DisplayManager r11 = r8.f271406d     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h r13 = r8.f271415m     // Catch:{ d -> 0x05af }
            android.view.View r14 = r8.f271421s     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout r15 = r8.f271419q     // Catch:{ d -> 0x05af }
            r21 = r4
            r22 = r10
            r23 = r11
            r24 = r13
            r25 = r9
            r26 = r14
            r27 = r15
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ d -> 0x05af }
            r8.f271417o = r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r14 = r8.f271420r     // Catch:{ d -> 0x05af }
            if (r14 == 0) goto L_0x0586
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            if (r4 == 0) goto L_0x057e
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout r9 = r8.f271419q     // Catch:{ d -> 0x05af }
            if (r9 == 0) goto L_0x0576
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.p r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.p     // Catch:{ d -> 0x05af }
            r10.<init>(r8)     // Catch:{ d -> 0x05af }
            android.hardware.display.DisplayManager r11 = r8.f271406d     // Catch:{ d -> 0x05af }
            if (r11 == 0) goto L_0x056e
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.q r13 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.q     // Catch:{ d -> 0x05af }
            r13.<init>(r8)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.d r15 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.d     // Catch:{ d -> 0x05af }
            r21 = r15
            r22 = r14
            r23 = r4
            r24 = r9
            r25 = r11
            r26 = r10
            r27 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ d -> 0x05af }
            r8.f271428z = r15     // Catch:{ d -> 0x05af }
            android.content.Context r4 = r8.f271404b     // Catch:{ d -> 0x05af }
            android.view.View r15 = r8.f271422t     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h r9 = r8.f271415m     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.k r10 = r8.f271400C     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.j r11 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.j     // Catch:{ d -> 0x05af }
            r15.getClass()     // Catch:{ d -> 0x05af }
            r4.getClass()     // Catch:{ d -> 0x05af }
            r9.getClass()     // Catch:{ d -> 0x05af }
            g.a.a r13 = r10.f271630a     // Catch:{ d -> 0x05af }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ d -> 0x05af }
            r19 = r13
            com.google.android.apps.gsa.search.shared.service.c.b.w r19 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w) r19     // Catch:{ d -> 0x05af }
            r19.getClass()     // Catch:{ d -> 0x05af }
            g.a.a r10 = r10.f271631b     // Catch:{ d -> 0x05af }
            java.lang.Object r10 = r10.mo17428b()     // Catch:{ d -> 0x05af }
            r20 = r10
            com.google.android.libraries.f.a r20 = (com.google.android.libraries.p1730f.C21370a) r20     // Catch:{ d -> 0x05af }
            r20.getClass()     // Catch:{ d -> 0x05af }
            r13 = r11
            r10 = 5
            r16 = r4
            r17 = r9
            r18 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ d -> 0x05af }
            r8.f271414l = r11     // Catch:{ d -> 0x05af }
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            android.content.Context r9 = r8.f271404b     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.r r11 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.r     // Catch:{ d -> 0x05af }
            r11.<init>(r8)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.s r13 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.s     // Catch:{ d -> 0x05af }
            r13.<init>(r8)     // Catch:{ d -> 0x05af }
            android.view.GestureDetector r14 = new android.view.GestureDetector     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b r15 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b     // Catch:{ d -> 0x05af }
            r15.<init>()     // Catch:{ d -> 0x05af }
            r14.<init>(r9, r15)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a r9 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a     // Catch:{ d -> 0x05af }
            r9.<init>(r14, r13)     // Catch:{ d -> 0x05af }
            r4.setOnTouchListener(r9)     // Catch:{ d -> 0x05af }
            r4.setOnClickListener(r11)     // Catch:{ d -> 0x05af }
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            r9 = 2131430989(0x7f0b0e4d, float:1.8483695E38)
            android.view.View r4 = r4.findViewById(r9)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ac r9 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ac     // Catch:{ d -> 0x05af }
            r9.<init>(r8)     // Catch:{ d -> 0x05af }
            r4.setOnClickListener(r9)     // Catch:{ d -> 0x05af }
            android.view.View r4 = r8.f271421s     // Catch:{ d -> 0x05af }
            r9 = 2131429398(0x7f0b0816, float:1.8480468E38)
            android.view.View r4 = r4.findViewById(r9)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.j r11 = new com.google.android.libraries.logging.j     // Catch:{ d -> 0x05af }
            r13 = 73119(0x11d9f, float:1.02462E-40)
            r11.<init>(r13)     // Catch:{ d -> 0x05af }
            r11.mo33795i(r10)     // Catch:{ d -> 0x05af }
            r11.mo33794h(r12)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.C28295m.m52919e(r4, r11)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ae r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ae     // Catch:{ d -> 0x05af }
            r10.<init>(r8)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.shared.logger.l r11 = new com.google.android.apps.gsa.shared.logger.l     // Catch:{ d -> 0x05af }
            r11.<init>(r10)     // Catch:{ d -> 0x05af }
            r4.setOnClickListener(r11)     // Catch:{ d -> 0x05af }
            android.view.WindowManager r4 = r8.f271405c     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout r10 = r8.f271419q     // Catch:{ d -> 0x05af }
            r11 = 201326624(0xc000020, float:9.860799E-32)
            r12 = -1
            android.view.WindowManager$LayoutParams r11 = com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97044g.m160631a(r12, r12, r11)     // Catch:{ d -> 0x05af }
            java.lang.String r13 = "background"
            r11.setTitle(r13)     // Catch:{ d -> 0x05af }
            r4.addView(r10, r11)     // Catch:{ d -> 0x05af }
            android.view.WindowManager r4 = r8.f271405c     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r10 = r8.f271420r     // Catch:{ d -> 0x05af }
            r11 = 262952(0x40328, float:3.68474E-40)
            r13 = -2
            android.view.WindowManager$LayoutParams r11 = com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97044g.m160631a(r13, r13, r11)     // Catch:{ d -> 0x05af }
            java.lang.String r13 = "collapsed"
            r11.setTitle(r13)     // Catch:{ d -> 0x05af }
            r13 = 51
            r11.gravity = r13     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.w r13 = r8.f271398A     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.search.shared.service.c.b.w r14 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w.SEARCH     // Catch:{ d -> 0x05af }
            if (r13 != r14) goto L_0x0477
            android.hardware.display.DisplayManager r13 = r8.f271406d     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.b r13 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g.m160926b(r13)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a r13 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a) r13     // Catch:{ d -> 0x05af }
            float r13 = r13.f271607a     // Catch:{ d -> 0x05af }
            int r13 = (int) r13     // Catch:{ d -> 0x05af }
            r11.x = r13     // Catch:{ d -> 0x05af }
            r13 = 0
            goto L_0x047a
        L_0x0477:
            r13 = 0
            r11.x = r13     // Catch:{ d -> 0x05af }
        L_0x047a:
            r11.y = r13     // Catch:{ d -> 0x05af }
            r4.addView(r10, r11)     // Catch:{ d -> 0x05af }
            android.view.WindowManager r4 = r8.f271405c     // Catch:{ d -> 0x05af }
            android.view.View r10 = r8.f271421s     // Catch:{ d -> 0x05af }
            r11 = 808(0x328, float:1.132E-42)
            android.view.WindowManager$LayoutParams r11 = com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97044g.m160631a(r12, r12, r11)     // Catch:{ d -> 0x05af }
            java.lang.String r12 = "extended"
            r11.setTitle(r12)     // Catch:{ d -> 0x05af }
            r12 = 17
            r11.gravity = r12     // Catch:{ d -> 0x05af }
            r4.addView(r10, r11)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.e.c r4 = r8.f271418p     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.t r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.t     // Catch:{ d -> 0x05af }
            r10.<init>(r8)     // Catch:{ d -> 0x05af }
            r4.mo90541f(r10)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.u r10 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.u     // Catch:{ d -> 0x05af }
            r10.<init>(r8)     // Catch:{ d -> 0x05af }
            r4.mo90542g(r10)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h r4 = r8.f271415m     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.m r10 = r8.f271416n     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r11 = r8.f271420r     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.v r12 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.v     // Catch:{ d -> 0x05af }
            r12.<init>(r4, r10)     // Catch:{ d -> 0x05af }
            r11.post(r12)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c.a r4 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c.a     // Catch:{ d -> 0x05af }
            android.content.Context r10 = r8.f271404b     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.x r11 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.x     // Catch:{ d -> 0x05af }
            r11.<init>(r8)     // Catch:{ d -> 0x05af }
            r4.<init>(r10, r11)     // Catch:{ d -> 0x05af }
            r8.f271425w = r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.i.b.c r4 = r8.f271409g     // Catch:{ d -> 0x05af }
            r4.mo90404d()     // Catch:{ d -> 0x05af }
            dagger.a r4 = r2.f271178c     // Catch:{ d -> 0x05af }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.d.h r4 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97093h) r4     // Catch:{ d -> 0x05af }
            dagger.a r8 = r2.f271179d     // Catch:{ d -> 0x05af }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.d.i r8 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97094i) r8     // Catch:{ d -> 0x05af }
            r4.f271293e = r8     // Catch:{ d -> 0x05af }
            dagger.a r4 = r2.f271177b     // Catch:{ d -> 0x05af }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.c.c r4 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97076c) r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah r8 = r4.f271258b     // Catch:{ d -> 0x05af }
            r8.f271408f = r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.c.a r4 = r4.f271257a     // Catch:{ d -> 0x05af }
            r4.mo90429b()     // Catch:{ d -> 0x05af }
            dagger.a r4 = r2.f271179d     // Catch:{ d -> 0x05af }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ah r4 = (com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97136ah) r4     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.c r8 = r4.f271407e     // Catch:{ d -> 0x05af }
            com.google.common.util.concurrent.cx r8 = r8.mo90575c()     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BubbleView r10 = r4.f271420r     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.k r10 = com.google.android.libraries.logging.C28295m.m52916b(r10)     // Catch:{ d -> 0x05af }
            android.view.View r11 = r4.f271422t     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.k r11 = com.google.android.libraries.logging.C28295m.m52916b(r11)     // Catch:{ d -> 0x05af }
            android.view.View r12 = r4.f271421s     // Catch:{ d -> 0x05af }
            android.view.View r9 = r12.findViewById(r9)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.logging.k r9 = com.google.android.libraries.logging.C28295m.m52916b(r9)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.gsa.k.g r12 = r4.f271427y     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.y r13 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.y     // Catch:{ d -> 0x05af }
            r13.<init>(r4, r11, r9, r10)     // Catch:{ d -> 0x05af }
            java.lang.String r9 = "buildBubbleVeTree"
            com.google.common.util.concurrent.cx r8 = r12.mo28209i(r8, r9, r13)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.gsa.k.g r4 = r4.f271427y     // Catch:{ d -> 0x05af }
            java.lang.String r9 = "logImpression"
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.m r10 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97227m.f271633a     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.shared.util.c.ag r11 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ d -> 0x05af }
            r11.<init>(r8, r4, r9, r10)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.n r4 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97228n.f271634a     // Catch:{ d -> 0x05af }
            r11.mo85223a(r4)     // Catch:{ d -> 0x05af }
            com.google.android.libraries.f.a r4 = r2.f271182g     // Catch:{ d -> 0x05af }
            long r8 = r4.mo26870b()     // Catch:{ d -> 0x05af }
            r2.f271184i = r8     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r4 = com.google.android.apps.gsa.staticplugins.bubble.mvc.C97045a.CREATED     // Catch:{ d -> 0x05af }
            r2.f271183h = r4     // Catch:{ d -> 0x05af }
            java.util.LinkedHashMap r4 = r3.f271136b     // Catch:{ all -> 0x05d1 }
            int r4 = r4.size()     // Catch:{ all -> 0x05d1 }
            r8 = 1
            if (r4 != r8) goto L_0x054b
            if (r7 <= r8) goto L_0x054b
            com.google.android.libraries.f.a r4 = r3.f271137c     // Catch:{ all -> 0x05d1 }
            long r8 = r4.mo26870b()     // Catch:{ all -> 0x05d1 }
            r3.f271138d = r8     // Catch:{ all -> 0x05d1 }
        L_0x054b:
            java.util.LinkedHashMap r4 = r3.f271136b     // Catch:{ all -> 0x05d1 }
            int r4 = r4.size()     // Catch:{ all -> 0x05d1 }
            if (r4 < r7) goto L_0x0567
            java.util.LinkedHashMap r4 = r3.f271136b     // Catch:{ all -> 0x05d1 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x05d1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x05d1 }
            java.lang.Object r4 = r4.next()     // Catch:{ all -> 0x05d1 }
            com.google.android.apps.gsa.staticplugins.bubble.i.c r4 = (com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c) r4     // Catch:{ all -> 0x05d1 }
            r7 = 1
            r3.mo90391a(r4, r7)     // Catch:{ all -> 0x05d1 }
        L_0x0567:
            java.util.LinkedHashMap r3 = r3.f271136b     // Catch:{ all -> 0x05d1 }
            r3.put(r5, r2)     // Catch:{ all -> 0x05d1 }
            monitor-exit(r6)     // Catch:{ all -> 0x05d1 }
            return
        L_0x056e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ d -> 0x05af }
            java.lang.String r4 = "Null displayManager"
            r3.<init>(r4)     // Catch:{ d -> 0x05af }
            throw r3     // Catch:{ d -> 0x05af }
        L_0x0576:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ d -> 0x05af }
            java.lang.String r4 = "Null extendedOutsideView"
            r3.<init>(r4)     // Catch:{ d -> 0x05af }
            throw r3     // Catch:{ d -> 0x05af }
        L_0x057e:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ d -> 0x05af }
            java.lang.String r4 = "Null extendedContainerView"
            r3.<init>(r4)     // Catch:{ d -> 0x05af }
            throw r3     // Catch:{ d -> 0x05af }
        L_0x0586:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ d -> 0x05af }
            java.lang.String r4 = "Null collapsedView"
            r3.<init>(r4)     // Catch:{ d -> 0x05af }
            throw r3     // Catch:{ d -> 0x05af }
        L_0x058e:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.mvc.a r4 = r2.f271183h     // Catch:{ d -> 0x05af }
            r7 = 0
            r3[r7] = r4     // Catch:{ d -> 0x05af }
            java.lang.String r4 = "create() called on bubble with state [%s]"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ d -> 0x05af }
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bubble.mvc.C97049b.f271176a     // Catch:{ d -> 0x05af }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ d -> 0x05af }
            java.lang.String r7 = "%s"
            r8 = 18336(0x47a0, float:2.5694E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r8)).mo56389s(r7, r3)     // Catch:{ d -> 0x05af }
            com.google.android.apps.gsa.staticplugins.bubble.i.d r4 = new com.google.android.apps.gsa.staticplugins.bubble.i.d     // Catch:{ d -> 0x05af }
            r4.<init>(r3)     // Catch:{ d -> 0x05af }
            throw r4     // Catch:{ d -> 0x05af }
        L_0x05af:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.gsa.search.shared.service.c.b.w r4 = r5.mo90392a()     // Catch:{ all -> 0x05d1 }
            int r5 = com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e.m160626b(r4)     // Catch:{ all -> 0x05d1 }
            int r7 = r2.f271181f     // Catch:{ all -> 0x05d1 }
            r8 = 3
            com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e.m160628d(r8, r5, r7)     // Catch:{ all -> 0x05d1 }
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bubble.C97017g.f271135a     // Catch:{ all -> 0x05d1 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x05d1 }
            java.lang.String r7 = "Error while initializing bubble of type [%s]"
            r8 = 18313(0x4789, float:2.5662E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r3)).mo56372aa(r8)).mo56389s(r7, r4)     // Catch:{ all -> 0x05d1 }
            r2.mo90407a()     // Catch:{ all -> 0x05d1 }
            monitor-exit(r6)     // Catch:{ all -> 0x05d1 }
            return
        L_0x05d1:
            r0 = move-exception
            r2 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x05d1 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bubble.C96968f.mo90388c(com.google.android.apps.gsa.search.shared.service.c.b.x, int):void");
    }
}
