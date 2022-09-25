package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.apps.tiktok.j.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C47297ae implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f122954a;

    public /* synthetic */ C47297ae(C47298af afVar) {
        this.f122954a = afVar;
    }

    public final Object call() {
        long j;
        C47340c cVar;
        Long valueOf;
        ReentrantReadWriteLock reentrantReadWriteLock;
        C47298af afVar = this.f122954a;
        afVar.f122956b.writeLock().lock();
        try {
            if (afVar.f122959e.get()) {
                valueOf = Long.valueOf(afVar.f122960f);
                reentrantReadWriteLock = afVar.f122956b;
            } else {
                C47341d a = afVar.mo51180a();
                j = a.f123051b;
                cVar = (C47340c) a.toBuilder();
                if (j > 0) {
                    afVar.f122960f = j;
                    afVar.f122959e.set(true);
                    valueOf = Long.valueOf(afVar.f122960f);
                    reentrantReadWriteLock = afVar.f122956b;
                } else {
                    long b = afVar.f122958d.mo26870b();
                    afVar.f122960f = b;
                    cVar.copyOnWrite();
                    C47341d dVar = (C47341d) cVar.instance;
                    dVar.f123050a |= 1;
                    dVar.f123051b = b;
                    try {
                        afVar.mo51184e((C47341d) cVar.build());
                        afVar.f122959e.set(true);
                    } catch (IOException e) {
                        ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56226d()).mo56382g(e)).mo56372aa(54774)).mo56386p("Could not write sync epoch. Using current time but future runs may be delayed.");
                        afVar.f122959e.set(false);
                    }
                    valueOf = Long.valueOf(afVar.f122960f);
                    reentrantReadWriteLock = afVar.f122956b;
                }
            }
        } catch (IOException e2) {
            afVar.mo51185f(e2);
            j = afVar.f122958d.mo26870b();
            cVar = (C47340c) C47341d.f123048f.createBuilder();
        } catch (Throwable th) {
            afVar.f122956b.writeLock().unlock();
            throw th;
        }
        reentrantReadWriteLock.writeLock().unlock();
        return valueOf;
    }
}
