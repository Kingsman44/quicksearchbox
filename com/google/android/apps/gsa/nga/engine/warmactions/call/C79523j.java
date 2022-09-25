package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.C79522i;
import com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.WarmActionsInCallService;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.search.assistant.incallservice.C33482a;
import com.google.android.libraries.search.assistant.incallservice.IncomingCallInCallService;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.j */
/* compiled from: PG */
final class C79523j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C79525l f218229a;

    public C79523j(C79525l lVar) {
        this.f218229a = lVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C58974d dVar = C79525l.f218230a;
        if (this.f218229a.f218234c.mo85405j(C90126fx.f251472jU)) {
            IncomingCallInCallService incomingCallInCallService = ((C33482a) iBinder).f89606a;
            incomingCallInCallService.f89605b.add(this.f218229a.f218238g);
            this.f218229a.f218237f.set(Optional.m71637of(incomingCallInCallService));
            return;
        }
        WarmActionsInCallService warmActionsInCallService = ((C79522i) iBinder).f218228a;
        C81459h hVar = this.f218229a.f218235d;
        Objects.requireNonNull(hVar);
        warmActionsInCallService.f218218b = Optional.m71637of(new C79513i(hVar));
        this.f218229a.f218237f.set(Optional.m71637of(warmActionsInCallService));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C58974d dVar = C79525l.f218230a;
    }
}
