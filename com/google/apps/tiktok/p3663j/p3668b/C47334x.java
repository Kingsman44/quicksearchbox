package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.p3663j.p3670c.C47338a;
import com.google.apps.tiktok.p3663j.p3670c.C47339b;
import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.apps.tiktok.p3663j.p3670c.C47345h;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.apps.tiktok.j.b.x */
/* compiled from: PG */
public final /* synthetic */ class C47334x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f123031a;

    /* renamed from: b */
    public final /* synthetic */ C47304al f123032b;

    /* renamed from: c */
    public final /* synthetic */ long f123033c;

    /* renamed from: d */
    public final /* synthetic */ boolean f123034d;

    public /* synthetic */ C47334x(C47298af afVar, C47304al alVar, long j, boolean z) {
        this.f123031a = afVar;
        this.f123032b = alVar;
        this.f123033c = j;
        this.f123034d = z;
    }

    public final void run() {
        C47341d dVar;
        ReentrantReadWriteLock reentrantReadWriteLock;
        C47298af afVar = this.f123031a;
        C47304al alVar = this.f123032b;
        long j = this.f123033c;
        boolean z = this.f123034d;
        afVar.f122956b.writeLock().lock();
        try {
            dVar = C47341d.f123048f;
            dVar = afVar.mo51180a();
        } catch (IOException e) {
            if (!afVar.mo51185f(e)) {
                ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e)).mo56372aa(54778)).mo56386p("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
            }
        } catch (Throwable th) {
            afVar.f122956b.writeLock().unlock();
            throw th;
        }
        C47340c cVar = (C47340c) C47341d.f123048f.createBuilder();
        cVar.mergeFrom(dVar);
        cVar.copyOnWrite();
        ((C47341d) cVar.instance).f123052c = C47341d.emptyProtobufList();
        C47339b bVar = null;
        for (C47339b bVar2 : dVar.f123052c) {
            C47345h hVar = bVar2.f123044b;
            if (hVar == null) {
                hVar = C47345h.f123059d;
            }
            if (alVar.equals(new C47304al(hVar))) {
                bVar = bVar2;
            } else {
                cVar.mo51217a(bVar2);
            }
        }
        if (bVar != null) {
            if (dVar.f123051b < 0) {
                long j2 = afVar.f122960f;
                if (j2 < 0) {
                    j2 = afVar.f122958d.mo26870b();
                    afVar.f122960f = j2;
                }
                cVar.copyOnWrite();
                C47341d dVar2 = (C47341d) cVar.instance;
                dVar2.f123050a |= 1;
                dVar2.f123051b = j2;
            }
            C47338a aVar = (C47338a) C47339b.f123041f.createBuilder();
            C47345h hVar2 = alVar.f122965a;
            aVar.copyOnWrite();
            C47339b bVar3 = (C47339b) aVar.instance;
            hVar2.getClass();
            bVar3.f123044b = hVar2;
            bVar3.f123043a |= 1;
            aVar.copyOnWrite();
            C47339b bVar4 = (C47339b) aVar.instance;
            bVar4.f123043a |= 4;
            bVar4.f123046d = j;
            if (z) {
                aVar.copyOnWrite();
                C47339b bVar5 = (C47339b) aVar.instance;
                bVar5.f123043a |= 2;
                bVar5.f123045c = j;
                aVar.copyOnWrite();
                C47339b bVar6 = (C47339b) aVar.instance;
                bVar6.f123043a |= 8;
                bVar6.f123047e = 0;
            } else {
                long j3 = bVar.f123045c;
                aVar.copyOnWrite();
                C47339b bVar7 = (C47339b) aVar.instance;
                bVar7.f123043a |= 2;
                bVar7.f123045c = j3;
                aVar.copyOnWrite();
                C47339b bVar8 = (C47339b) aVar.instance;
                bVar8.f123043a |= 8;
                bVar8.f123047e = bVar.f123047e + 1;
            }
            cVar.mo51217a((C47339b) aVar.build());
            try {
                afVar.mo51184e((C47341d) cVar.build());
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e2)).mo56372aa(54777)).mo56386p("Error writing sync data file after sync. Sync may run too frequently.");
            }
            reentrantReadWriteLock = afVar.f122956b;
        } else {
            reentrantReadWriteLock = afVar.f122956b;
        }
        reentrantReadWriteLock.writeLock().unlock();
    }
}
