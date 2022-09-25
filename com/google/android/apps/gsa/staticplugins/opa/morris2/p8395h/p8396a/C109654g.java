package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.p8396a;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.C73838b;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.C107348r;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.p9002a.C119578b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13325i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.a.g */
/* compiled from: PG */
public final class C109654g implements C14638a {

    /* renamed from: a */
    public static final C59071e f305372a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.h.a.g");

    /* renamed from: b */
    public final d f305373b;

    /* renamed from: c */
    public boolean f305374c = false;

    /* renamed from: d */
    private final C73838b f305375d;

    /* renamed from: e */
    private final C69464a f305376e;

    /* renamed from: f */
    private final C68214a f305377f;

    /* renamed from: g */
    private final C69464a f305378g;

    /* renamed from: h */
    private final C13325i f305379h;

    /* renamed from: i */
    private final Executor f305380i;

    /* renamed from: j */
    private final C14115ap f305381j;

    /* renamed from: k */
    private final Context f305382k;

    /* renamed from: l */
    private String f305383l = null;

    /* renamed from: m */
    private C17825k f305384m = null;

    /* renamed from: n */
    private Optional f305385n = Optional.empty();

    public C109654g(d dVar, C73838b bVar, C69464a aVar, C68214a aVar2, C69464a aVar3, C13325i iVar, C60887da daVar, C14115ap apVar, Context context) {
        this.f305373b = dVar;
        this.f305375d = bVar;
        this.f305376e = aVar;
        this.f305377f = aVar2;
        this.f305378g = aVar3;
        this.f305379h = iVar;
        this.f305380i = daVar;
        this.f305381j = apVar;
        this.f305382k = context;
    }

    /* renamed from: q */
    private final boolean m182480q() {
        if (C90771bo.m148273b(this.f305382k, UserHandleCompat.m148154a())) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (((Boolean) this.f305378g.mo17428b()).booleanValue()) {
            return true;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: a */
    public final Optional mo21569a() {
        if (this.f305374c) {
            return Optional.ofNullable(this.f305384m);
        }
        return Optional.ofNullable((C17825k) this.f305373b.d().mo3842a());
    }

    /* renamed from: b */
    public final String mo21570b() {
        return this.f305374c ? this.f305383l : (String) this.f305373b.a().mo3842a();
    }

    /* renamed from: c */
    public final void mo21571c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305375d.mo65316b();
    }

    /* renamed from: d */
    public final void mo21572d() {
        if (this.f305375d.mo65315a() == 3) {
            this.f305375d.mo65317c();
        }
    }

    /* renamed from: e */
    public final void mo21573e(C17835u uVar) {
        if (this.f305374c) {
            this.f305385n.ifPresentOrElse(new C109650c(uVar), C109651d.f305368a);
        } else {
            this.f305375d.mo65318d(uVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r8 != 100) goto L_0x027b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21574f(com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am r11) {
        /*
            r10 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.cq r0 = r11.f51248e
            int r0 = r0.size()
            if (r0 == 0) goto L_0x000c
            com.google.protobuf.cq r0 = r11.f51248e
        L_0x000c:
            int r0 = r11.f51244a
            r1 = 1
            r0 = r0 & r1
            java.lang.String r2 = "Morris.AppIntegHelper"
            if (r0 == 0) goto L_0x02bb
            java.lang.String r0 = r11.f51247d
            int r3 = r11.f51245b
            r4 = 3
            r5 = 5
            r6 = 4
            if (r3 != r4) goto L_0x027d
            java.lang.Object r3 = r11.f51246c
            com.google.android.libraries.assistant.d.c.c.ak r3 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak) r3
            int r7 = r3.f51233a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x027b
            com.google.android.libraries.assistant.d.c.c.o r7 = r3.f51238f
            if (r7 != 0) goto L_0x002d
            com.google.android.libraries.assistant.d.c.c.o r7 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17913o.f51320c
        L_0x002d:
            int r8 = r7.f51323b
            int r8 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n.m35110b(r8)
            if (r8 != 0) goto L_0x0036
            r8 = 1
        L_0x0036:
            int r8 = r8 + -1
            if (r8 == 0) goto L_0x0254
            r9 = 2
            if (r8 == r1) goto L_0x01a3
            if (r8 == r9) goto L_0x0138
            if (r8 == r4) goto L_0x0254
            if (r8 == r6) goto L_0x00c1
            if (r8 == r5) goto L_0x004b
            r4 = 100
            if (r8 == r4) goto L_0x0254
            goto L_0x027b
        L_0x004b:
            boolean r4 = r10.m182480q()
            if (r4 != 0) goto L_0x0065
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): failed to handle KEYGUARD_DISMISS_STATUS_CHANGED because driving voice plate is not supported for %s"
            r7 = 25115(0x621b, float:3.5194E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r2, r0)
            goto L_0x027b
        L_0x0065:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17887aq.f51255a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r7.mo58887l(r4)
            com.google.protobuf.bf r8 = r7.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r8.mo58857o(r4)
            if (r4 != 0) goto L_0x008c
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): KeyguardDismissStatusChangedEvent extension not set."
            r7 = 25114(0x621a, float:3.5192E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r2)
            goto L_0x027b
        L_0x008c:
            com.google.protobuf.bt r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17887aq.f51255a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r4 = r7.f169962ag
            com.google.protobuf.bs r7 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x00a2
            java.lang.Object r2 = r2.f169969b
            goto L_0x00a6
        L_0x00a2:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x00a6:
            com.google.android.libraries.assistant.d.c.c.as r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17889as) r2
            r10.mo97939j(r0)
            g.a.a r4 = r10.f305376e
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.f.d r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d) r4
            int r2 = r2.f51259b
            int r2 = com.google.android.libraries.assistant.p1467d.p1471b.C17817c.m35066a(r2)
            if (r2 != 0) goto L_0x00bc
            r2 = 1
        L_0x00bc:
            r4.mo21606r(r2)
            goto L_0x027b
        L_0x00c1:
            boolean r4 = r10.m182480q()
            if (r4 != 0) goto L_0x00db
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): failed to handle UI_SUPPRESSION_LEVEL_CHANGED because driving voice plate is not supported for %s"
            r7 = 25113(0x6219, float:3.5191E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r2, r0)
            goto L_0x027b
        L_0x00db:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17896az.f51273a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r7.mo58887l(r4)
            com.google.protobuf.bf r8 = r7.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r8.mo58857o(r4)
            if (r4 != 0) goto L_0x0102
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): UiSuppressionLevelChangedEvent extension not set."
            r7 = 25112(0x6218, float:3.519E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r2)
            goto L_0x027b
        L_0x0102:
            com.google.protobuf.bt r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17896az.f51273a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r4 = r7.f169962ag
            com.google.protobuf.bs r7 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x0118
            java.lang.Object r2 = r2.f169969b
            goto L_0x011c
        L_0x0118:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x011c:
            com.google.android.libraries.assistant.d.c.c.bb r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17899bb) r2
            r10.mo97939j(r0)
            g.a.a r4 = r10.f305376e
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.f.d r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d) r4
            int r2 = r2.f51287a
            com.google.android.libraries.assistant.d.b.o r2 = com.google.android.libraries.assistant.p1467d.p1471b.C17829o.m35073a(r2)
            if (r2 != 0) goto L_0x0133
            com.google.android.libraries.assistant.d.b.o r2 = com.google.android.libraries.assistant.p1467d.p1471b.C17829o.UI_SUPPRESSION_LEVEL_UNKNOWN
        L_0x0133:
            r4.mo21601i(r2)
            goto L_0x027b
        L_0x0138:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17893aw.f51268a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r7.mo58887l(r4)
            com.google.protobuf.bf r8 = r7.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r8.mo58857o(r4)
            if (r4 != 0) goto L_0x015f
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): NightModeStatusChangedEvent extension not set."
            r7 = 25111(0x6217, float:3.5188E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r2)
            goto L_0x027b
        L_0x015f:
            com.google.protobuf.bt r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17893aw.f51268a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r4 = r7.f169962ag
            com.google.protobuf.bs r7 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x0175
            java.lang.Object r2 = r2.f169969b
            goto L_0x0179
        L_0x0175:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x0179:
            com.google.android.libraries.assistant.d.c.c.ay r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17895ay) r2
            int r2 = r2.f51271a
            com.google.android.libraries.assistant.d.b.k r2 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.m35071a(r2)
            if (r2 != 0) goto L_0x0185
            com.google.android.libraries.assistant.d.b.k r2 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.NIGHT_MODE_STATUS_UNKNOWN
        L_0x0185:
            r10.mo97940k(r2)
            g.a.a r2 = r10.f305376e
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.f.d r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d) r2
            boolean r2 = r2.mo21604n()
            if (r2 == 0) goto L_0x027b
            g.a.a r2 = r10.f305376e
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.f.d r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d) r2
            r2.mo21599g()
            goto L_0x027b
        L_0x01a3:
            boolean r4 = r10.m182480q()
            if (r4 != 0) goto L_0x01bd
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): failed to handle NAVIGATION_STATE_CHANGED because driving voice plate is not supported for %s"
            r7 = 25110(0x6216, float:3.5187E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r2, r0)
            goto L_0x027b
        L_0x01bd:
            com.google.protobuf.bt r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17890at.f51260a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r7.mo58887l(r4)
            com.google.protobuf.bf r8 = r7.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r8.mo58857o(r4)
            if (r4 != 0) goto L_0x01e4
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r7, r2)
            java.lang.String r2 = "#handleAppIntegrationClientEvent(): NavigationStateChangedEvent extension not set."
            r7 = 25109(0x6215, float:3.5185E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r2)
            goto L_0x027b
        L_0x01e4:
            com.google.protobuf.bt r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17890at.f51260a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r4 = r7.f169962ag
            com.google.protobuf.bs r7 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x01fa
            java.lang.Object r2 = r2.f169969b
            goto L_0x01fe
        L_0x01fa:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x01fe:
            com.google.android.libraries.assistant.d.c.c.av r2 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17892av) r2
            int r4 = r2.f51263a
            r4 = r4 & r9
            if (r4 == 0) goto L_0x0212
            int r4 = r2.f51265c
            com.google.android.libraries.assistant.d.b.k r4 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.m35071a(r4)
            if (r4 != 0) goto L_0x020f
            com.google.android.libraries.assistant.d.b.k r4 = com.google.android.libraries.assistant.p1467d.p1471b.C17825k.NIGHT_MODE_STATUS_UNKNOWN
        L_0x020f:
            r10.mo97940k(r4)
        L_0x0212:
            r10.mo97939j(r0)
            g.a.a r4 = r10.f305376e
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.libraries.assistant.auto.tng.morris.f.d r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d) r4
            int r7 = r2.f51264b
            com.google.android.libraries.assistant.d.b.i r7 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.m35069a(r7)
            if (r7 != 0) goto L_0x0227
            com.google.android.libraries.assistant.d.b.i r7 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.UNKNOWN
        L_0x0227:
            int r8 = r2.f51263a
            r8 = r8 & r6
            if (r8 == 0) goto L_0x0237
            boolean r8 = r2.f51266d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            goto L_0x023b
        L_0x0237:
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
        L_0x023b:
            int r9 = r2.f51263a
            r9 = r9 & 8
            if (r9 == 0) goto L_0x024c
            boolean r2 = r2.f51267e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x0250
        L_0x024c:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0250:
            r4.mo21598f(r7, r0, r8, r2)
            goto L_0x027b
        L_0x0254:
            com.google.common.f.e r4 = f305372a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r8, r2)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r2 = 25116(0x621c, float:3.5195E-41)
            com.google.common.f.x r2 = r4.mo56372aa(r2)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r4 = r7.f51323b
            int r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n.m35110b(r4)
            if (r4 != 0) goto L_0x0272
            r4 = 1
        L_0x0272:
            java.lang.String r7 = "#handleAppIntegrationClientEvent(): unsupported client event %s."
            java.lang.String r4 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n.m35109a(r4)
            r2.mo56389s(r7, r4)
        L_0x027b:
            com.google.protobuf.cq r2 = r3.f51237e
        L_0x027d:
            int r2 = r11.f51245b
            if (r2 != r6) goto L_0x0297
            dagger.a r2 = r10.f305377f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.appintegration.r r2 = (com.google.android.apps.gsa.staticplugins.opa.appintegration.C107348r) r2
            r2.mo95948f(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r1 == r2) goto L_0x0293
            goto L_0x0294
        L_0x0293:
            r0 = 0
        L_0x0294:
            r10.mo97939j(r0)
        L_0x0297:
            int r0 = r11.f51245b
            if (r0 != r5) goto L_0x029e
            r10.mo21575g()
        L_0x029e:
            int r11 = r11.f51245b
            if (r11 != r6) goto L_0x02a3
            goto L_0x02a6
        L_0x02a3:
            if (r11 == r5) goto L_0x02a6
            return
        L_0x02a6:
            com.google.android.libraries.assistant.auto.tng.common.q.i r11 = r10.f305379h
            com.google.common.util.concurrent.cx r11 = r11.mo21026a()
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.a.f r0 = new com.google.android.apps.gsa.staticplugins.opa.morris2.h.a.f
            r0.<init>(r10)
            java.util.concurrent.Executor r1 = r10.f305380i
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r11, r0, r1)
            return
        L_0x02bb:
            com.google.common.f.e r11 = f305372a
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r0, r2)
            java.lang.String r0 = "Package name does not exist"
            r1 = 25121(0x6221, float:3.5202E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.p8396a.C109654g.mo21574f(com.google.android.libraries.assistant.d.c.c.am):void");
    }

    /* renamed from: g */
    public final void mo21575g() {
        C58976aa aaVar = C58975e.f156826a;
        ((C107348r) this.f305377f.mo27525b()).mo95946c();
        mo97939j((String) null);
        ((C107348r) this.f305377f.mo27525b()).mo95947e();
        this.f305385n = Optional.empty();
        this.f305374c = false;
    }

    /* renamed from: h */
    public final void mo21576h(IBinder iBinder) {
        ((C14647d) this.f305376e.mo17428b()).mo21600h(iBinder);
    }

    /* renamed from: i */
    public final void mo21577i() {
        if (this.f305374c) {
            this.f305385n.ifPresentOrElse(C109648a.f305365a, C109649b.f305366a);
        } else {
            this.f305375d.mo65319e();
        }
    }

    /* renamed from: j */
    public final void mo97939j(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305374c) {
            if (TextUtils.isEmpty(str) && ((C14647d) this.f305376e.mo17428b()).mo21604n()) {
                this.f305381j.mo21431e(C37182a.f98083fx.mo40813g());
                ((C14647d) this.f305376e.mo17428b()).mo21591A(Optional.empty(), C14746p.m31069b());
            }
            this.f305383l = str;
            return;
        }
        this.f305373b.e(str);
    }

    /* renamed from: k */
    public final void mo97940k(C17825k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        kVar.name();
        if (this.f305374c) {
            this.f305384m = kVar;
        } else {
            mo21569a().ifPresent(new C109652e(this, kVar));
        }
    }

    /* renamed from: l */
    public final boolean mo21578l() {
        boolean z;
        if (mo21579m()) {
            return true;
        }
        if (this.f305374c) {
            z = C13009a.f40420c.contains(this.f305383l);
        } else {
            z = C13009a.f40420c.contains(this.f305373b.a().mo3842a());
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo21579m() {
        if (this.f305374c) {
            return C13009a.f40419b.contains(this.f305383l);
        }
        return C13009a.f40419b.contains(this.f305373b.a().mo3842a());
    }

    /* renamed from: n */
    public final boolean mo21580n() {
        return this.f305374c;
    }

    /* renamed from: o */
    public final void mo21581o(String str, C119578b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305374c = true;
        mo97939j(str);
        this.f305385n = Optional.m71637of(bVar);
    }

    /* renamed from: p */
    public final void mo21582p() {
        this.f305374c = false;
    }
}
