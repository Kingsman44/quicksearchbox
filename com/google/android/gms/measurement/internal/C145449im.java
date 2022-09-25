package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.im */
/* compiled from: PG */
final class C145449im implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393254a;

    /* renamed from: b */
    final /* synthetic */ String f393255b;

    /* renamed from: c */
    final /* synthetic */ String f393256c;

    /* renamed from: d */
    final /* synthetic */ AppMetadata f393257d;

    /* renamed from: e */
    final /* synthetic */ boolean f393258e;

    /* renamed from: f */
    final /* synthetic */ C145456it f393259f;

    public C145449im(C145456it itVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata, boolean z) {
        this.f393259f = itVar;
        this.f393254a = atomicReference;
        this.f393255b = str;
        this.f393256c = str2;
        this.f393257d = appMetadata;
        this.f393258e = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f393254a) {
            try {
                C145456it itVar = this.f393259f;
                C145316do doVar = itVar.f393272c;
                if (doVar == null) {
                    itVar.f393011w.mo120965ar().f392795c.mo120897d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f393255b, this.f393256c);
                    this.f393254a.set(Collections.emptyList());
                    this.f393254a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C143919bh.m233958a(this.f393257d);
                    this.f393254a.set(doVar.mo120859i(this.f393255b, this.f393256c, this.f393258e, this.f393257d));
                } else {
                    this.f393254a.set(doVar.mo120860j((String) null, this.f393255b, this.f393256c, this.f393258e));
                }
                this.f393259f.mo121158n();
                atomicReference = this.f393254a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f393259f.f393011w.mo120965ar().f392795c.mo120897d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f393255b, e);
                    this.f393254a.set(Collections.emptyList());
                    atomicReference = this.f393254a;
                } catch (Throwable th) {
                    this.f393254a.notify();
                    throw th;
                }
            }
        }
    }
}
