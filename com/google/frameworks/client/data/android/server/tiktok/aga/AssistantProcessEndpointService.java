package com.google.frameworks.client.data.android.server.tiktok.aga;

import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.C2382m;
import com.google.frameworks.client.data.android.server.C61560h;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;

/* compiled from: PG */
public final class AssistantProcessEndpointService extends C61582f {

    /* renamed from: b */
    public C61560h f166419b;

    /* renamed from: c */
    public C70237q f166420c;

    /* renamed from: d */
    public C70229i f166421d;

    public final IBinder onBind(Intent intent) {
        this.f6618a.mo5765a(C2382m.ON_START);
        return this.f166419b.mo58121a();
    }

    public final void onCreate() {
        super.onCreate();
        this.f166419b.mo58122b(this.f166420c, this.f166421d);
    }
}
