package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ik */
/* compiled from: PG */
final class C145447ik implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393244a;

    /* renamed from: b */
    final /* synthetic */ String f393245b;

    /* renamed from: c */
    final /* synthetic */ String f393246c;

    /* renamed from: d */
    final /* synthetic */ AppMetadata f393247d;

    /* renamed from: e */
    final /* synthetic */ C145456it f393248e;

    public C145447ik(C145456it itVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata) {
        this.f393248e = itVar;
        this.f393244a = atomicReference;
        this.f393245b = str;
        this.f393246c = str2;
        this.f393247d = appMetadata;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f393244a) {
            try {
                C145456it itVar = this.f393248e;
                C145316do doVar = itVar.f393272c;
                if (doVar == null) {
                    itVar.f393011w.mo120965ar().f392795c.mo120897d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f393245b, this.f393246c);
                    this.f393244a.set(Collections.emptyList());
                    this.f393244a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C143919bh.m233958a(this.f393247d);
                    this.f393244a.set(doVar.mo120857g(this.f393245b, this.f393246c, this.f393247d));
                } else {
                    this.f393244a.set(doVar.mo120858h((String) null, this.f393245b, this.f393246c));
                }
                this.f393248e.mo121158n();
                atomicReference = this.f393244a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f393248e.f393011w.mo120965ar().f392795c.mo120897d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f393245b, e);
                    this.f393244a.set(Collections.emptyList());
                    atomicReference = this.f393244a;
                } catch (Throwable th) {
                    this.f393244a.notify();
                    throw th;
                }
            }
        }
    }
}
