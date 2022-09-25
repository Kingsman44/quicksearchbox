package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C77764ar implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C77772az f214224a;

    public /* synthetic */ C77764ar(C77772az azVar) {
        this.f214224a = azVar;
    }

    public final void run() {
        C77772az azVar = this.f214224a;
        azVar.f214236e.mo72827f();
        C77817v vVar = azVar.f214237f;
        Lock writeLock = vVar.f214367k.writeLock();
        writeLock.lock();
        try {
            Soda a = vVar.mo72833a();
            ((C58970a) ((C58970a) C77817v.f214357a.mo56224b()).mo56372aa(4426)).mo56386p("uninitializing SODA");
            vVar.f214366j.set((Object) null);
            a.mo24340l();
            vVar.f214369m = null;
            ((C58970a) ((C58970a) C77817v.f214357a.mo56224b()).mo56372aa(4427)).mo56386p("SODA uninitialized");
        } catch (C77816u e) {
            ((C58970a) ((C58970a) ((C58970a) C77817v.f214357a.mo56226d()).mo56382g(e)).mo56372aa(4428)).mo56386p("Soda is already uninitialized");
        } finally {
            writeLock.unlock();
        }
    }
}
