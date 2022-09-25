package com.google.android.libraries.lens.sdk.p2038a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.libraries.lens.sdk.p2047d.C24933c;
import com.google.android.libraries.lens.sdk.p2047d.C24935e;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.sdk.a.m */
/* compiled from: PG */
public final class C24838m extends C24935e implements ServiceConnection {

    /* renamed from: a */
    final Queue f67874a = new ArrayDeque();

    /* renamed from: b */
    final Set f67875b = new HashSet();

    /* renamed from: c */
    public final Context f67876c;

    /* renamed from: d */
    public int f67877d = 1;

    /* renamed from: e */
    public C24933c f67878e;

    /* renamed from: f */
    public final Executor f67879f;

    /* renamed from: g */
    public final PackageManager f67880g;

    public C24838m(Context context, Executor executor) {
        this.f67876c = context;
        this.f67880g = context.getPackageManager();
        this.f67879f = executor;
    }

    /* renamed from: a */
    public static String m45962a(int i) {
        switch (i) {
            case 1:
                return "STATE_UNBOUND";
            case 2:
                return "STATE_BINDING";
            case 3:
                return "STATE_BOUND";
            case 4:
                return "STATE_BOUND_STARTED";
            case 5:
                return "STATE_UNBOUND_DEAD";
            case 6:
                return "STATE_BOUND_DEAD";
            default:
                return "UNRECOGNIZED STATE";
        }
    }

    /* renamed from: e */
    public static boolean m45963e(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    /* renamed from: f */
    public static boolean m45964f(int i) {
        return i == 4;
    }

    /* renamed from: g */
    public static boolean m45965g(int i) {
        return i == 5 || i == 6;
    }

    /* renamed from: b */
    public final void mo30039b() {
        for (C24839n nVar : this.f67875b) {
            C24840o oVar = nVar.f67881a;
            C24841p.m45970a("onLensServiceDead", new Object[0]);
            oVar.mo30029a(3, new Bundle());
        }
    }

    /* renamed from: c */
    public final void mo30040c(Bundle bundle) {
        Executor executor = this.f67879f;
        ((C24837l) executor).f67873a.post(new C24832g(this, bundle));
    }

    /* renamed from: d */
    public final void mo30041d(int i) {
        if (Log.isLoggable("LensSdk", 3)) {
            Log.d("LensSdk", String.format("Transitioning from %s to %s.", new Object[]{m45962a(this.f67877d), m45962a(i)}));
        }
        int i2 = this.f67877d;
        this.f67877d = i;
        if (m45964f(i) && !m45964f(i2)) {
            for (C24839n nVar : this.f67875b) {
                C24840o oVar = nVar.f67881a;
                C24841p.m45970a("onLensServiceConnected", new Object[0]);
                oVar.mo30029a(2, new Bundle());
            }
            while (this.f67874a.peek() != null) {
                ((Runnable) this.f67874a.remove()).run();
            }
        }
        if (m45965g(i) && !m45965g(i2)) {
            mo30039b();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Executor executor = this.f67879f;
        ((C24837l) executor).f67873a.post(new C24835j(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Executor executor = this.f67879f;
        ((C24837l) executor).f67873a.post(new C24829d(this));
    }
}
