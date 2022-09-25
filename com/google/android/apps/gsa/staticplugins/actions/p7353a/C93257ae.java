package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.os.PowerManager;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.ae */
/* compiled from: PG */
final class C93257ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PowerManager.WakeLock f260027a;

    public C93257ae(PowerManager.WakeLock wakeLock) {
        this.f260027a = wakeLock;
    }

    public final void run() {
        try {
            this.f260027a.release();
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C93264al.f260043a.mo56225c()).mo56382g(e)).mo56372aa(13541)).mo56386p("Runtime Exception while releasing wakelock.");
        }
    }
}
