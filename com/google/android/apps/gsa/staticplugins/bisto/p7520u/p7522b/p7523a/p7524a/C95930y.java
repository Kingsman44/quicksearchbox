package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89648c;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.p10712d.C142375d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.y */
/* compiled from: PG */
public final /* synthetic */ class C95930y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95931z f268599a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f268600b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f268601c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f268602d;

    public /* synthetic */ C95930y(C95931z zVar, SettableFuture settableFuture, C60870cx cxVar, C60870cx cxVar2) {
        this.f268599a = zVar;
        this.f268600b = settableFuture;
        this.f268601c = cxVar;
        this.f268602d = cxVar2;
    }

    public final void run() {
        C124636bb bbVar;
        C95931z zVar = this.f268599a;
        SettableFuture settableFuture = this.f268600b;
        C60870cx cxVar = this.f268601c;
        C60870cx cxVar2 = this.f268602d;
        if (settableFuture.isDone()) {
            C59104x b = C95931z.f268603c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "InitState");
            ((C59052c) ((C59052c) b).mo56372aa(15867)).mo56386p("Futures complete when opaEnabledStateFuture is done. Ignoring.");
        } else if (!C90877ak.m148480n(cxVar) || !C90877ak.m148480n(cxVar2)) {
            C59104x c = C95931z.f268603c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InitState");
            ((C59052c) ((C59052c) c).mo56372aa(15866)).mo56354G("One of futures failed: %s, %s", cxVar, cxVar2);
            settableFuture.mo57357o(new Exception("One of futures failed"));
            zVar.mo89847j("DisconnectingState", (Intent) null);
        } else {
            boolean z = ((C142375d) C90877ak.m148474h(cxVar2)).f386338b;
            boolean contains = C89648c.f242752a.contains(C90877ak.m148474h(cxVar));
            if ((!z) || contains) {
                bbVar = C124636bb.OPA_ENABLED;
            } else {
                bbVar = C124636bb.OPA_DISABLED;
            }
            zVar.f268607g.mo83394aj(zVar.f268605e.mo89270k(), bbVar, (C124633az) null);
            settableFuture.mo57356n(bbVar);
            C124548d b2 = zVar.mo89856b();
            if (b2 == null) {
                C59104x c2 = C95931z.f268603c.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "InitState");
                ((C59052c) ((C59052c) c2).mo56372aa(15865)).mo56386p("Null bistoDeviceInfo");
                zVar.mo89847j("DisconnectingState", (Intent) null);
            } else if (C124636bb.OPA_DISABLED.equals(bbVar) && b2.mo106520r().equals(C124633az.OOBE_FINISHED)) {
                C59104x b3 = C95931z.f268603c.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "InitState");
                ((C59052c) ((C59052c) b3).mo56372aa(15864)).mo56386p("Assistant is disabled on device, OOBE is complete");
                zVar.f268607g.mo83394aj(zVar.f268605e.mo89270k(), C124636bb.OPA_DISABLED, C124633az.OOBE_NOT_FINISHED);
                zVar.mo89847j("DisconnectingState", (Intent) null);
            } else if (C124636bb.OPA_ENABLED.equals(bbVar) && b2.mo106520r().equals(C124633az.OOBE_FINISHED)) {
                C59104x b4 = C95931z.f268603c.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "InitState");
                ((C59052c) ((C59052c) b4).mo56372aa(15863)).mo56386p("Assistant is enabled on device, OOBE is complete");
                zVar.mo89847j("HotwordInitState", (Intent) null);
            } else if (b2.mo106520r().equals(C124633az.OOBE_IN_PROGRESS) || b2.mo106520r().equals(C124633az.OOBE_EXTERNAL)) {
                C59104x b5 = C95931z.f268603c.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "InitState");
                ((C59052c) ((C59052c) b5).mo56372aa(15860)).mo56386p("OOBE is requested");
                zVar.mo89847j("ClassicOobeState", (Intent) null);
            } else if (!b2.mo106513k().equals(C124719q.CAR_ACCESSORY) || b2.mo106520r().equals(C124633az.OOBE_FINISHED)) {
                C59104x b6 = C95931z.f268603c.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "InitState");
                ((C59052c) ((C59052c) b6).mo56372aa(15861)).mo56359L("Disconnecting: Assistant enabled: %s, OOBE state: %s, device category: %s", bbVar, b2.mo106520r(), b2.mo106513k());
                zVar.mo89847j("DisconnectingState", (Intent) null);
            } else {
                C59104x b7 = C95931z.f268603c.mo56224b();
                b7.mo56378ag(C58975e.f156826a, "InitState");
                ((C59052c) ((C59052c) b7).mo56372aa(15862)).mo56386p("Car accessory not yet set up");
                zVar.mo89847j("CarAccessoryOobeState", (Intent) null);
            }
        }
    }
}
