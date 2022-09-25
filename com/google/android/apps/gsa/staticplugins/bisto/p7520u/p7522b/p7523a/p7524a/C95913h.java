package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7494l.C95482c;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.h */
/* compiled from: PG */
public final class C95913h extends C95914i implements C89495cg {

    /* renamed from: c */
    private static final C59071e f268551c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.h");

    /* renamed from: d */
    private final C96023bs f268552d;

    /* renamed from: e */
    private final C95355bf f268553e;

    /* renamed from: f */
    private final C89492cd f268554f;

    /* renamed from: g */
    private final C95482c f268555g;

    public C95913h(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C95482c cVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, "ClassicOobeState", cdVar, iVar, aVar);
        this.f268552d = bsVar;
        this.f268553e = axVar;
        this.f268554f = cdVar;
        this.f268555g = cVar;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f268553e.mo89270k()) && set.contains(27)) {
            C59104x b = f268551c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ClassicOobeState");
            ((C59052c) ((C59052c) b).mo56372aa(15828)).mo56389s("New OOBE state: %s", dVar.mo106520r());
            C124633az azVar = C124633az.OOBE_STATE_UNKNOWN;
            int ordinal = dVar.mo106520r().ordinal();
            if (ordinal == 1) {
                this.f268555g.f267194e = true;
                mo89847j("HotwordInitState", (Intent) null);
            } else if (ordinal == 2) {
                if (dVar.mo106513k().equals(C124719q.CAR_ACCESSORY)) {
                    mo89847j("CarAccessoryOobeState", (Intent) null);
                } else {
                    mo89847j("DisconnectingState", (Intent) null);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268552d.mo89831a();
        this.f268552d.mo89840j(true);
        this.f268552d.mo89842l();
        this.f268554f.mo83360B(new C58759qy(27), this);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268554f.mo83379U(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getAction()
            if (r0 != 0) goto L_0x001f
            com.google.common.f.e r0 = f268551c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ClassicOobeState"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Null action"
            r2 = 15829(0x3dd5, float:2.2181E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            boolean r6 = super.mo89848l(r6)
            return r6
        L_0x001f:
            int r1 = r0.hashCode()
            r2 = -431663615(0xffffffffe6455601, float:-2.3297317E23)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0049
            r2 = 1542040334(0x5be9ab0e, float:1.31543492E17)
            if (r1 == r2) goto L_0x003f
            r2 = 1821585647(0x6c9330ef, float:1.4235454E27)
            if (r1 == r2) goto L_0x0035
            goto L_0x0053
        L_0x0035:
            java.lang.String r1 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 0
            goto L_0x0054
        L_0x003f:
            java.lang.String r1 = "bisto_enable_audio_output"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0049:
            java.lang.String r1 = "action_start_audio_testing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            r0 = 2
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            if (r0 == 0) goto L_0x006b
            if (r0 == r4) goto L_0x0065
            if (r0 == r3) goto L_0x005f
            boolean r6 = super.mo89848l(r6)
            return r6
        L_0x005f:
            java.lang.String r0 = "AudioTestingState"
            r5.mo89847j(r0, r6)
            return r4
        L_0x0065:
            java.lang.String r6 = "OobeEnableAuxState"
            r0 = 0
            r5.mo89847j(r6, r0)
        L_0x006b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95913h.mo89848l(android.content.Intent):boolean");
    }
}
