package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.hotword.service.C146589g;
import com.google.android.hotword.service.C146591i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.c.a.d.g */
/* compiled from: PG */
final class C39492g implements ServiceConnection {

    /* renamed from: a */
    public final C39489d f104010a;

    /* renamed from: b */
    private final Executor f104011b;

    public C39492g(C39489d dVar, Executor executor) {
        this.f104010a = dVar;
        this.f104011b = executor;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C146591i iVar;
        if (iBinder == null) {
            iVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.hotword.service.IHotwordService");
            iVar = queryLocalInterface instanceof C146591i ? (C146591i) queryLocalInterface : new C146589g(iBinder);
        }
        C59104x b = C39493h.f104012a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
        ((C59052c) ((C59052c) b).mo56372aa(53678)).mo56354G("Connected to HotwordService. ComponentName %s, service %s", componentName, iBinder);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C39491f(this, iVar)), this.f104011b), "Error when getting HotwordInformation", new Object[0]);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59104x b = C39493h.f104012a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
        ((C59052c) ((C59052c) b).mo56372aa(53679)).mo56386p("HotwordService Disconnected");
    }
}
