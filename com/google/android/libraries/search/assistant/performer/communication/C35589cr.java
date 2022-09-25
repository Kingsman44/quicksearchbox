package com.google.android.libraries.search.assistant.performer.communication;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cr */
/* compiled from: PG */
final class C35589cr implements ServiceConnection {

    /* renamed from: a */
    private final C2164c f93416a;

    public C35589cr(C2164c cVar) {
        this.f93416a = cVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f93416a.mo5437b(Optional.m71637of(new C35590cs(this, ((C35581cj) iBinder).f93405a)));
        C59071e eVar = C35591ct.f93419a;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f93416a.mo5439d(new IOException("IncomingCall InCallService is disconnected."));
        ((C59052c) ((C59052c) C35591ct.f93419a.mo56224b()).mo56372aa(51651)).mo56386p("IncomingCall InCallService is disconnected.");
    }
}
