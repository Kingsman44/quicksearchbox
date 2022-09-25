package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7957c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b.C101175a;
import com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b.C101177c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.c.o */
/* compiled from: PG */
final class C101192o implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C101196s f282449a;

    public C101192o(C101196s sVar) {
        this.f282449a = sVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C101177c cVar;
        C59104x b = C101196s.f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19862)).mo56386p("Training cache service connected.");
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.staticplugins.fedass.trainingcache.aidl.ITrainingCacheService");
            cVar = queryLocalInterface instanceof C101177c ? (C101177c) queryLocalInterface : new C101175a(iBinder);
        }
        if (cVar != null) {
            this.f282449a.f282452b.mo28212l("[TrainingCache] TrainingCacheService.onServiceConnected", new C101190m(this, cVar));
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x b = C101196s.f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19863)).mo56386p("Training cache service disconnected.");
        this.f282449a.f282452b.mo28212l("[TrainingCache] TrainingCacheService.onServiceDisconnected", new C101191n(this));
    }
}
