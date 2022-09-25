package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.internal.C143747av;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.ae */
/* compiled from: PG */
public final class C143889ae implements Handler.Callback {

    /* renamed from: a */
    public final C143888ad f390064a;

    /* renamed from: b */
    public final ArrayList f390065b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f390066c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f390067d = new ArrayList();

    /* renamed from: e */
    public volatile boolean f390068e = false;

    /* renamed from: f */
    public final AtomicInteger f390069f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f390070g = false;

    /* renamed from: h */
    public final Handler f390071h;

    /* renamed from: i */
    public final Object f390072i = new Object();

    public C143889ae(Looper looper, C143888ad adVar) {
        this.f390064a = adVar;
        this.f390071h = new C144861c(looper, this);
    }

    /* renamed from: a */
    public final void mo119396a() {
        this.f390068e = false;
        this.f390069f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo119397b(C143849u uVar) {
        C143919bh.m233958a(uVar);
        synchronized (this.f390072i) {
            if (this.f390065b.contains(uVar)) {
                String valueOf = String.valueOf(uVar);
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + valueOf + " is already registered");
            } else {
                this.f390065b.add(uVar);
            }
        }
        if (((C143747av) this.f390064a).f389695a.mo119133h()) {
            Handler handler = this.f390071h;
            handler.sendMessage(handler.obtainMessage(1, uVar));
        }
    }

    /* renamed from: c */
    public final void mo119398c(C143850v vVar) {
        C143919bh.m233958a(vVar);
        synchronized (this.f390072i) {
            if (this.f390067d.contains(vVar)) {
                String valueOf = String.valueOf(vVar);
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
            } else {
                this.f390067d.add(vVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C143849u uVar = (C143849u) message.obj;
            synchronized (this.f390072i) {
                if (this.f390068e && ((C143747av) this.f390064a).f389695a.mo119133h() && this.f390065b.contains(uVar)) {
                    uVar.mo26991kq((Bundle) null);
                }
            }
            return true;
        }
        int i = message.what;
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
        return false;
    }
}
