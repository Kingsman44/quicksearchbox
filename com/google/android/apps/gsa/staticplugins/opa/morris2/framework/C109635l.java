package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.libraries.assistant.auto.tng.morris.service.C15457c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.l */
/* compiled from: PG */
final class C109635l implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C109636m f305313a;

    public C109635l(C109636m mVar) {
        this.f305313a = mVar;
    }

    public final void onBindingDied(ComponentName componentName) {
        C59104x c = C109636m.f305314a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.FrameworkCntr");
        ((C59052c) ((C59052c) c).mo56372aa(24820)).mo56386p("Binding to Morris service died");
        this.f305313a.f305323g = Optional.empty();
    }

    public final void onNullBinding(ComponentName componentName) {
        C59104x c = C109636m.f305314a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.FrameworkCntr");
        ((C59052c) ((C59052c) c).mo56372aa(24821)).mo56386p("Null binding to Morris service");
        this.f305313a.f305323g = Optional.empty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            C59104x c = C109636m.f305314a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.FrameworkCntr");
            ((C59052c) ((C59052c) c).mo56372aa(24822)).mo56386p("Binder instance null when connecting to MorrisService");
            this.f305313a.f305323g = Optional.empty();
            return;
        }
        this.f305313a.f305323g = Optional.m71637of((C15457c) iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x b = C109636m.f305314a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.FrameworkCntr");
        ((C59052c) ((C59052c) b).mo56372aa(24823)).mo56386p("Service disconnected from Morris framework");
        this.f305313a.f305323g = Optional.empty();
    }
}
