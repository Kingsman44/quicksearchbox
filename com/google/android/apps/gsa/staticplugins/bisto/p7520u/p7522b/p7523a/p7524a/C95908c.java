package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95259h;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.c */
/* compiled from: PG */
public final class C95908c extends C95914i {

    /* renamed from: c */
    public static final C59071e f268530c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.c");

    /* renamed from: d */
    public C60870cx f268531d;

    /* renamed from: e */
    private final C96023bs f268532e;

    /* renamed from: f */
    private final C95355bf f268533f;

    /* renamed from: g */
    private final C95259h f268534g;

    /* renamed from: h */
    private final C22871g f268535h;

    /* renamed from: i */
    private final C89492cd f268536i;

    /* renamed from: j */
    private boolean f268537j;

    public C95908c(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C95259h hVar, C22871g gVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, "AudioTestingState", cdVar, iVar, aVar);
        this.f268532e = bsVar;
        this.f268533f = axVar;
        this.f268534g = hVar;
        this.f268535h = gVar;
        this.f268536i = cdVar;
    }

    /* renamed from: c */
    private final C124548d m159046c() {
        return this.f268536i.mo83401b(this.f268533f.mo89270k());
    }

    /* renamed from: b */
    public final void mo89851b() {
        if (this.f268537j) {
            mo89847j("ReadyNoAudClassicState", (Intent) null);
        } else {
            mo89847j("ClassicOobeState", (Intent) null);
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268532e.mo89831a();
        this.f268532e.mo89840j(true);
        this.f268532e.mo89842l();
        C124548d c = m159046c();
        if (c == null) {
            C59104x c2 = f268530c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AudioTestingState");
            ((C59052c) ((C59052c) c2).mo56372aa(15797)).mo56386p("Null BistoDeviceInfo!");
            return;
        }
        this.f268537j = c.mo106520r().equals(C124633az.OOBE_FINISHED);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        C60870cx cxVar = this.f268531d;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f268531d = null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = r23.getAction()
            java.lang.String r2 = "AudioTestingState"
            if (r1 != 0) goto L_0x0021
            com.google.common.f.e r1 = f268530c
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Null action"
            r3 = 15803(0x3dbb, float:2.2145E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            boolean r1 = super.mo89848l(r23)
            return r1
        L_0x0021:
            int r3 = r1.hashCode()
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -431663615: goto L_0x004b;
                case 823930323: goto L_0x0041;
                case 1821585647: goto L_0x0037;
                case 1854535521: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0055
        L_0x002d:
            java.lang.String r3 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0037:
            java.lang.String r3 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            r1 = 0
            goto L_0x0056
        L_0x0041:
            java.lang.String r3 = "action_stop_audio_testing"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            r1 = 3
            goto L_0x0056
        L_0x004b:
            java.lang.String r3 = "action_start_audio_testing"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            r1 = 2
            goto L_0x0056
        L_0x0055:
            r1 = -1
        L_0x0056:
            if (r1 == 0) goto L_0x01b3
            r3 = 0
            if (r1 == r7) goto L_0x016c
            if (r1 == r6) goto L_0x0084
            if (r1 == r5) goto L_0x0064
            boolean r1 = super.mo89848l(r23)
            return r1
        L_0x0064:
            com.google.common.util.concurrent.cx r1 = r0.f268531d
            if (r1 == 0) goto L_0x006e
            r1.cancel(r4)
            r0.f268531d = r3
            goto L_0x0080
        L_0x006e:
            com.google.common.f.e r1 = f268530c
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "audioTestingFuture is null"
            r3 = 15802(0x3dba, float:2.2143E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x0080:
            r22.mo89851b()
            return r7
        L_0x0084:
            java.lang.String r1 = "extra_profiles_for_audio_testing"
            r4 = r23
            java.util.ArrayList r1 = r4.getIntegerArrayListExtra(r1)
            if (r1 == 0) goto L_0x0156
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0096
            goto L_0x0156
        L_0x0096:
            com.google.android.apps.gsa.staticplugins.bisto.d.h r2 = r0.f268534g
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r9 = r0.f268533f
            com.google.android.apps.gsa.staticplugins.bisto.d.g r3 = new com.google.android.apps.gsa.staticplugins.bisto.d.g
            r9.getClass()
            g.a.a r4 = r2.f266527a
            java.lang.Object r4 = r4.mo17428b()
            r10 = r4
            android.content.Context r10 = (android.content.Context) r10
            r10.getClass()
            g.a.a r4 = r2.f266528b
            java.lang.Object r4 = r4.mo17428b()
            r11 = r4
            com.google.android.libraries.gsa.k.g r11 = (com.google.android.libraries.gsa.p1876k.C22871g) r11
            r11.getClass()
            g.a.a r4 = r2.f266529c
            java.lang.Object r4 = r4.mo17428b()
            r12 = r4
            com.google.android.apps.gsa.shared.bisto.latencymeasurement.k r12 = (com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89668k) r12
            r12.getClass()
            g.a.a r4 = r2.f266530d
            java.lang.Object r4 = r4.mo17428b()
            r13 = r4
            com.google.android.apps.gsa.shared.bisto.latencymeasurement.p r13 = (com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89673p) r13
            r13.getClass()
            g.a.a r4 = r2.f266531e
            java.lang.Object r4 = r4.mo17428b()
            r14 = r4
            com.google.android.apps.gsa.staticplugins.bisto.d.m r14 = (com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95264m) r14
            r14.getClass()
            g.a.a r4 = r2.f266532f
            java.lang.Object r4 = r4.mo17428b()
            r15 = r4
            com.google.android.apps.gsa.shared.bisto.latencymeasurement.i r15 = (com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89666i) r15
            r15.getClass()
            g.a.a r4 = r2.f266533g
            java.lang.Object r4 = r4.mo17428b()
            r16 = r4
            com.google.android.apps.gsa.staticplugins.bisto.d.k r16 = (com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95262k) r16
            r16.getClass()
            g.a.a r4 = r2.f266534h
            java.lang.Object r4 = r4.mo17428b()
            r17 = r4
            com.google.android.apps.gsa.staticplugins.bisto.d.r r17 = (com.google.android.apps.gsa.staticplugins.bisto.p7486d.C95269r) r17
            r17.getClass()
            g.a.a r4 = r2.f266535i
            java.lang.Object r4 = r4.mo17428b()
            r18 = r4
            com.google.android.libraries.gsa.k.g r18 = (com.google.android.libraries.gsa.p1876k.C22871g) r18
            r18.getClass()
            g.a.a r4 = r2.f266536j
            java.lang.Object r4 = r4.mo17428b()
            r19 = r4
            com.google.android.apps.gsa.shared.bisto.k r19 = (com.google.android.apps.gsa.shared.bisto.C89656k) r19
            r19.getClass()
            g.a.a r4 = r2.f266537k
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4
            g.a.a r4 = r4.f184585a
            dagger.a r20 = dagger.p5294a.C68219e.m98518a(r4)
            r20.getClass()
            g.a.a r2 = r2.f266538l
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r21 = dagger.p5294a.C68219e.m98518a(r2)
            r21.getClass()
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.google.common.util.concurrent.cx r1 = r3.mo89184a(r1)
            r0.f268531d = r1
            com.google.android.libraries.gsa.k.g r2 = r0.f268535h
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.a r3 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.a
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "audioTestingFuture"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.b r1 = new com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.b
            r1.<init>(r0)
            r4.mo85223a(r1)
            goto L_0x016b
        L_0x0156:
            com.google.common.f.e r1 = f268530c
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "profilesToTest null or empty"
            r3 = 15801(0x3db9, float:2.2142E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            r22.mo89851b()
        L_0x016b:
            return r7
        L_0x016c:
            r4 = r23
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r1 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145896b(r23)
            if (r1 != 0) goto L_0x0187
            com.google.common.f.e r1 = f268530c
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "OobeState is null"
            r3 = 15798(0x3db6, float:2.2138E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x01b3
        L_0x0187:
            int r1 = r1.ordinal()
            if (r1 == r7) goto L_0x01ae
            if (r1 == r6) goto L_0x0190
            goto L_0x01b3
        L_0x0190:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r1 = r22.m159046c()
            if (r1 == 0) goto L_0x01a8
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r1 = r1.mo106513k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.CAR_ACCESSORY
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01a8
            java.lang.String r1 = "CarAccessoryOobeState"
            r0.mo89847j(r1, r3)
            goto L_0x01b3
        L_0x01a8:
            java.lang.String r1 = "DisconnectingState"
            r0.mo89847j(r1, r3)
            goto L_0x01b3
        L_0x01ae:
            java.lang.String r1 = "HotwordInitState"
            r0.mo89847j(r1, r3)
        L_0x01b3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95908c.mo89848l(android.content.Intent):boolean");
    }
}
