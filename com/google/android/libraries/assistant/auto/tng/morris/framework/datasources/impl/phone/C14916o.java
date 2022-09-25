package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.CarCall;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.o */
/* compiled from: PG */
final class C14916o implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C14918q f44844a;

    public C14916o(C14918q qVar) {
        this.f44844a = qVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C59104x b = C14918q.f44846a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) b).mo56372aa(45704)).mo56386p("onServiceConnected");
        synchronized (this.f44844a.f44849d) {
            C14918q qVar = this.f44844a;
            int i = qVar.f44851f;
            if (i == 0) {
                throw null;
            } else if (i != 2) {
                C59104x d = C14918q.f44846a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
                ((C59052c) ((C59052c) d).mo56372aa(45705)).mo56386p("Ignore onServiceConnected callback as we're not in BINDING status");
            } else {
                qVar.f44851f = 3;
                qVar.f44850e = ((C14894ag) iBinder).f44801a;
                C14896ai aiVar = qVar.f44850e;
                aiVar.f44803b.add(qVar.f44848c);
                C14896ai aiVar2 = this.f44844a.f44850e;
                C59104x b2 = C14896ai.f44802a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) b2).mo56372aa(45743)).mo56389s("getCarCalls: %s", aiVar2.f44805d.getCalls());
                C58801sm G = aiVar2.f44806e.mo21838d(aiVar2.f44805d.getCalls()).listIterator(0);
                while (G.hasNext()) {
                    CarCall carCall = (CarCall) G.next();
                    for (C143100al b3 : this.f44844a.f44847b) {
                        b3.mo21807b(carCall);
                    }
                }
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x b = C14918q.f44846a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LocalCallMgr");
        ((C59052c) ((C59052c) b).mo56372aa(45706)).mo56386p("onServiceDisconnected");
        synchronized (this.f44844a.f44849d) {
            C14918q qVar = this.f44844a;
            qVar.f44851f = 1;
            qVar.f44850e = null;
        }
    }
}
