package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142500hq;
import com.google.android.p10712d.C142520l;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.c */
/* compiled from: PG */
public abstract class C95110c implements ServiceConnection {

    /* renamed from: a */
    public final C142500hq f266100a;

    /* renamed from: b */
    public final C95028a f266101b;

    /* renamed from: c */
    public volatile Messenger f266102c = null;

    /* renamed from: d */
    private final Context f266103d;

    /* renamed from: e */
    private volatile boolean f266104e = false;

    public C95110c(Context context, C142500hq hqVar, C95028a aVar) {
        this.f266103d = context;
        this.f266100a = hqVar;
        this.f266101b = aVar;
    }

    /* renamed from: j */
    private final void m157174j() {
        this.f266104e = true;
        if (mo89041h()) {
            this.f266102c = null;
            this.f266101b.mo88943s();
        }
    }

    /* renamed from: a */
    public abstract void mo89028a();

    /* renamed from: b */
    public abstract void mo89029b(C142520l lVar);

    /* renamed from: c */
    public void mo89030c(C124548d dVar) {
    }

    /* renamed from: d */
    public abstract void mo89031d(byte[] bArr);

    /* renamed from: e */
    public abstract void mo89032e();

    /* renamed from: f */
    public abstract void mo89033f();

    /* renamed from: g */
    public final boolean mo89040g() {
        return !this.f266104e;
    }

    /* renamed from: h */
    public final boolean mo89041h() {
        return this.f266102c != null;
    }

    /* renamed from: i */
    public boolean mo89034i(Intent intent, int i) {
        this.f266103d.unbindService(this);
        m157174j();
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            this.f266102c = new Messenger(iBinder);
            this.f266101b.mo88942p();
            mo89028a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m157174j();
    }
}
