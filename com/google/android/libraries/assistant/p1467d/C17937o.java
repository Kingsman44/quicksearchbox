package com.google.android.libraries.assistant.p1467d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.libraries.assistant.p1467d.p1468a.p1469a.p1470a.C17813b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.libraries.assistant.d.o */
/* compiled from: PG */
public final class C17937o implements ServiceConnection {

    /* renamed from: a */
    public volatile int f51382a = 0;

    /* renamed from: b */
    final /* synthetic */ C17938p f51383b;

    public C17937o(C17938p pVar) {
        this.f51383b = pVar;
    }

    /* renamed from: a */
    public final void mo23495a() {
        this.f51383b.f51388e = null;
        this.f51382a = 1;
        C17813b bVar = this.f51383b.f51386c;
        boolean z = bVar.f51113b;
        Log.v("AIClientCbStub", "#resetStatesDelayed(): isMorrisVoicePlateOpened = %b false");
        boolean z2 = bVar.f51113b;
        C59104x d = C17938p.f51384a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MaestroConnector");
        ((C59052c) ((C59052c) d).mo56372aa(42843)).mo56386p("#resetAndNotifyDisconnected(): callback is null when try to notify onServiceDisconnected.");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        C60826bg bgVar = C60826bg.f164896a;
        C47810es.m84977q(new C17936n(this, componentName, iBinder)).run();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = this.f51383b.f51386c.f51113b;
        mo23495a();
    }
}
