package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79624g;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79629l;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79630m;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.locks.Lock;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bd */
/* compiled from: PG */
public final /* synthetic */ class C79675bd implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C79630m f218516a;

    public /* synthetic */ C79675bd(C79630m mVar) {
        this.f218516a = mVar;
    }

    public final void run() {
        C79630m mVar = this.f218516a;
        mVar.f218435f.ifPresent(C79624g.f218427a);
        Lock writeLock = mVar.f218439j.writeLock();
        writeLock.lock();
        try {
            Soda soda = mVar.f218442m;
            if (soda != null) {
                if (soda.mo24355v()) {
                    Soda a = mVar.mo74168a();
                    ((C58970a) ((C58970a) C79630m.f218430a.mo56224b()).mo56372aa(5709)).mo56386p("#MWW uninitializing SODA");
                    if (a.f53870c.get()) {
                        a.mo24349p();
                    }
                    mVar.mo74170c();
                    mVar.f218438i.set(Optional.empty());
                    a.mo24340l();
                    mVar.f218442m = null;
                    writeLock.unlock();
                    return;
                }
            }
            mVar.mo74170c();
        } catch (C79629l e) {
            ((C58970a) ((C58970a) ((C58970a) C79630m.f218430a.mo56226d()).mo56382g(e)).mo56372aa(5711)).mo56386p("#MWW SODA is already uninitialized, skipping.");
        } finally {
            writeLock.unlock();
        }
    }
}
