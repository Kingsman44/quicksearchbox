package com.google.android.libraries.lens.view.p2067ak;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.lens.view.ak.br */
/* compiled from: PG */
final class C25239br implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f68690a;

    /* renamed from: b */
    final /* synthetic */ C25241bt f68691b;

    public C25239br(C25241bt btVar, AtomicReference atomicReference) {
        this.f68691b = btVar;
        this.f68690a = atomicReference;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        synchronized (this.f68691b) {
            C25241bt btVar = this.f68691b;
            btVar.f68696e--;
        }
        ((C58970a) ((C58970a) ((C58970a) C25241bt.f68692a.mo56225c()).mo56382g(th)).mo56372aa(49829)).mo56386p("Failed to write proto update to storage");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f68691b) {
            C25241bt btVar = this.f68691b;
            int i = btVar.f68696e - 1;
            btVar.f68696e = i;
            if (i == 0) {
                MessageLite messageLite = (MessageLite) this.f68690a.get();
                messageLite.getClass();
                btVar.f68695d = messageLite;
            }
        }
    }
}
