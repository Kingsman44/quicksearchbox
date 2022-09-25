package com.google.android.apps.gsa.shared.util.p7158b;

import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.util.b.c */
/* compiled from: PG */
public final class C90746c extends C90747d {

    /* renamed from: a */
    private Thread f253821a;

    /* renamed from: a */
    public final synchronized void mo85091a() {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f253821a;
        if (thread == null) {
            this.f253821a = currentThread;
            return;
        }
        String name = thread.getName();
        if (this.f253821a != currentThread) {
            C59052c cVar = (C59052c) C90748e.f253822a.mo56225c();
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(11357)).mo56354G("DebugSameThread check failed. Expected thread: %s, Current thread: %s.", name, currentThread.getName());
            throw new IllegalStateException("Different threads");
        }
    }
}
