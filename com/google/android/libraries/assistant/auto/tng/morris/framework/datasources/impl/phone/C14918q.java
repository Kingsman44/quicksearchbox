package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Binder;
import android.telecom.Call;
import android.telecom.CallAudioState;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.CarCall;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.q */
/* compiled from: PG */
public final class C14918q implements C14907f {

    /* renamed from: a */
    public static final C59071e f44846a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.q");

    /* renamed from: b */
    public final List f44847b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final C14917p f44848c = new C14917p(this);

    /* renamed from: d */
    public final Object f44849d = new Object();

    /* renamed from: e */
    public C14896ai f44850e;

    /* renamed from: f */
    public int f44851f = 1;

    /* renamed from: g */
    private final Context f44852g;

    /* renamed from: h */
    private final C86124t f44853h;

    /* renamed from: i */
    private final C15388p f44854i;

    /* renamed from: j */
    private final ServiceConnection f44855j = new C14916o(this);

    public C14918q(Context context, C86124t tVar, C15388p pVar) {
        this.f44852g = context;
        this.f44853h = tVar;
        this.f44854i = pVar;
    }

    /* renamed from: a */
    public final int mo21819a() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo21856q()) {
            return 2;
        }
        C14896ai aiVar = this.f44850e;
        aiVar.getClass();
        CallAudioState callAudioState = aiVar.f44805d.getCallAudioState();
        if (callAudioState != null) {
            return callAudioState.getRoute();
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo21820b(CarCall carCall) {
        C59071e eVar = f44846a;
        C59104x c = eVar.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) c).mo56372aa(45720)).mo56386p("#answerCall()");
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c2 = C14896ai.f44802a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c2).mo56372aa(45744)).mo56386p("Unable to answer call: CarCallMapper returned null.");
                return;
            }
            a.answer(0);
            return;
        }
        C59104x d = eVar.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45721)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: c */
    public final void mo21821c() {
        this.f44854i.mo22277c().ifPresent(new C14915n(this));
    }

    /* renamed from: d */
    public final void mo21822d(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c = C14896ai.f44802a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c).mo56372aa(45745)).mo56386p("Unable to disconnect call: CarCallMapper returned null.");
                return;
            }
            a.disconnect();
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45723)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: e */
    public final void mo21823e(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c = C14896ai.f44802a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c).mo56372aa(45746)).mo56386p("Unable to hold call: CarCallMapper returned null.");
                return;
            }
            a.hold();
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45725)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21824f() {
        /*
            r7 = this;
            com.google.common.f.e r0 = f44846a
            com.google.common.f.x r1 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "Morris.LocalCallMgr"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "#init()"
            r3 = 45726(0xb29e, float:6.4076E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            java.lang.Object r1 = r7.f44849d
            monitor-enter(r1)
            int r2 = r7.f44851f     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x007c
            r3 = 2
            if (r2 == r3) goto L_0x005f
            r4 = 3
            if (r2 != r4) goto L_0x0023
            goto L_0x005f
        L_0x0023:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x007e }
            android.content.Context r4 = r7.f44852g     // Catch:{ all -> 0x007e }
            java.lang.Class<com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.MorrisInCallService> r5 = com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.MorrisInCallService.class
            r2.<init>(r4, r5)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Local_AGSA_intent"
            r2.setAction(r4)     // Catch:{ all -> 0x007e }
            android.content.Context r4 = r7.f44852g     // Catch:{ all -> 0x007e }
            android.content.ServiceConnection r5 = r7.f44855j     // Catch:{ all -> 0x007e }
            r6 = 1
            boolean r2 = r4.bindService(r2, r5, r6)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x003f
            r7.f44851f = r3     // Catch:{ all -> 0x007e }
            goto L_0x005d
        L_0x003f:
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x007e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Morris.LocalCallMgr"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            r2 = 45728(0xb2a0, float:6.4079E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            java.lang.String r2 = "Error binding to service"
            r0.mo56386p(r2)     // Catch:{ all -> 0x007e }
            r0 = 4
            r7.f44851f = r0     // Catch:{ all -> 0x007e }
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            return
        L_0x005f:
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x007e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Morris.LocalCallMgr"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            r2 = 45727(0xb29f, float:6.4077E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            java.lang.String r2 = "CallManager is either binding the service or already bound service. Skip binding service."
            r0.mo56386p(r2)     // Catch:{ all -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            return
        L_0x007c:
            r0 = 0
            throw r0     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.C14918q.mo21824f():void");
    }

    /* renamed from: g */
    public final void mo21825g(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f44853h.mo79746e(C90025cd.f248164v) || !this.f44854i.mo22278g(str)) {
            C59104x b = f44846a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
            ((C59052c) ((C59052c) b).mo56372aa(45730)).mo56386p("Placing outgoing call with legacy call placement method.");
            Intent intent = new Intent("android.intent.action.CALL", Uri.fromParts("tel", str, (String) null));
            intent.addFlags(268697600);
            Binder.clearCallingIdentity();
            this.f44852g.startActivity(intent);
        }
    }

    /* renamed from: h */
    public final void mo21826h(CarCall carCall, char c) {
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c2 = C14896ai.f44802a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c2).mo56372aa(45751)).mo56386p("Unable to play DTMF tone: CarCallMapper returned null.");
                return;
            }
            a.playDtmfTone(c);
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45731)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: i */
    public final void mo21827i(C143100al alVar) {
        this.f44847b.add(alVar);
    }

    /* renamed from: j */
    public final void mo21828j(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c = C14896ai.f44802a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c).mo56372aa(45752)).mo56386p("Unable to reject call: CarCallMapper returned null.");
                return;
            }
            a.reject(false, BuildConfig.FLAVOR);
        }
    }

    /* renamed from: k */
    public final void mo21829k(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            aiVar.f44805d.setAudioRoute(i);
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45734)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: l */
    public final void mo21830l(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            aiVar.f44805d.setMuted(z);
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45736)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: m */
    public final void mo21831m() {
        synchronized (this.f44849d) {
            C14896ai aiVar = this.f44850e;
            if (aiVar != null) {
                aiVar.f44803b.remove(this.f44848c);
            }
            this.f44847b.clear();
            int i = this.f44851f;
            if (i == 0) {
                throw null;
            } else if (i == 3) {
                this.f44852g.unbindService(this.f44855j);
                this.f44851f = 1;
                this.f44850e = null;
            }
        }
    }

    /* renamed from: n */
    public final void mo21832n(CarCall carCall) {
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c = C14896ai.f44802a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c).mo56372aa(45753)).mo56386p("Unable to stop DTMF tone: CarCallMapper returned null.");
                return;
            }
            a.stopDtmfTone();
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45737)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: o */
    public final void mo21833o(CarCall carCall) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            Call a = aiVar.f44806e.mo21835a(carCall);
            if (a == null) {
                C59104x c = C14896ai.f44802a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) c).mo56372aa(45754)).mo56386p("Unable to unhold call: CarCallMapper returned null.");
                return;
            }
            a.unhold();
            return;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45739)).mo56386p("CallManager is disconnected from telephony service");
    }

    /* renamed from: p */
    public final boolean mo21834p() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo21856q()) {
            C14896ai aiVar = this.f44850e;
            aiVar.getClass();
            CallAudioState callAudioState = aiVar.f44805d.getCallAudioState();
            if (callAudioState != null) {
                return callAudioState.isMuted();
            }
            return false;
        }
        C59104x d = f44846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) d).mo56372aa(45742)).mo56386p("CallManager is disconnected from telephony service");
        return false;
    }

    /* renamed from: q */
    public final boolean mo21856q() {
        boolean z;
        synchronized (this.f44849d) {
            int i = this.f44851f;
            if (i != 0) {
                z = false;
                if (i == 3 && this.f44850e != null) {
                    z = true;
                }
                C58976aa aaVar = C58975e.f156826a;
            } else {
                throw null;
            }
        }
        return z;
    }
}
