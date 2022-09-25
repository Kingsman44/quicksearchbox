package com.google.frameworks.client.data.android.server.tiktok;

import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.C2382m;
import com.google.frameworks.client.data.android.server.C61560h;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;

/* compiled from: PG */
public final class TrainProcessEndpointService extends C61595j {

    /* renamed from: b */
    public C61560h f166414b;

    /* renamed from: c */
    public C70237q f166415c;

    /* renamed from: d */
    public C70229i f166416d;

    public final IBinder onBind(Intent intent) {
        this.f6618a.mo5765a(C2382m.ON_START);
        return this.f166414b.mo58121a();
    }

    public final void onCreate() {
        super.onCreate();
        this.f166414b.mo58122b(this.f166415c, this.f166416d);
    }
}
