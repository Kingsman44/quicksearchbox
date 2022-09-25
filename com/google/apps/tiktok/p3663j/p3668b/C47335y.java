package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.p3663j.p3670c.C47338a;
import com.google.apps.tiktok.p3663j.p3670c.C47339b;
import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.apps.tiktok.p3663j.p3670c.C47345h;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.apps.tiktok.j.b.y */
/* compiled from: PG */
public final /* synthetic */ class C47335y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f123035a;

    /* renamed from: b */
    public final /* synthetic */ Collection f123036b;

    public /* synthetic */ C47335y(C47298af afVar, Collection collection) {
        this.f123035a = afVar;
        this.f123036b = collection;
    }

    public final Object call() {
        boolean valueOf;
        ReentrantReadWriteLock reentrantReadWriteLock;
        C47298af afVar = this.f123035a;
        Collection<C47304al> collection = this.f123036b;
        afVar.f122956b.writeLock().lock();
        C47341d dVar = C47341d.f123048f;
        boolean z = false;
        try {
            dVar = afVar.mo51180a();
        } catch (IOException unused) {
        } catch (IOException e) {
            if (!afVar.mo51185f(e)) {
                ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e)).mo56372aa(54772)).mo56386p("Error, could not read or clear store. Aborting sync attempt.");
                valueOf = false;
                reentrantReadWriteLock = afVar.f122956b;
            }
        } catch (Throwable th) {
            afVar.f122956b.writeLock().unlock();
            throw th;
        }
        C47340c cVar = (C47340c) C47341d.f123048f.createBuilder();
        cVar.mergeFrom(dVar);
        cVar.copyOnWrite();
        ((C47341d) cVar.instance).f123052c = C47341d.emptyProtobufList();
        long b = afVar.f122958d.mo26870b();
        HashSet hashSet = new HashSet();
        for (C47339b bVar : dVar.f123052c) {
            C47345h hVar = bVar.f123044b;
            if (hVar == null) {
                hVar = C47345h.f123059d;
            }
            if (collection.contains(new C47304al(hVar))) {
                C47345h hVar2 = bVar.f123044b;
                if (hVar2 == null) {
                    hVar2 = C47345h.f123059d;
                }
                hashSet.add(new C47304al(hVar2));
                C47338a aVar = (C47338a) bVar.toBuilder();
                aVar.copyOnWrite();
                C47339b bVar2 = (C47339b) aVar.instance;
                bVar2.f123043a |= 4;
                bVar2.f123046d = b;
                cVar.mo51217a((C47339b) aVar.build());
            } else {
                cVar.mo51217a(bVar);
            }
        }
        for (C47304al alVar : collection) {
            if (!hashSet.contains(alVar)) {
                C47338a aVar2 = (C47338a) C47339b.f123041f.createBuilder();
                C47345h hVar3 = alVar.f122965a;
                aVar2.copyOnWrite();
                C47339b bVar3 = (C47339b) aVar2.instance;
                hVar3.getClass();
                bVar3.f123044b = hVar3;
                bVar3.f123043a |= 1;
                long j = afVar.f122960f;
                aVar2.copyOnWrite();
                C47339b bVar4 = (C47339b) aVar2.instance;
                bVar4.f123043a |= 2;
                bVar4.f123045c = j;
                aVar2.copyOnWrite();
                C47339b bVar5 = (C47339b) aVar2.instance;
                bVar5.f123043a |= 4;
                bVar5.f123046d = b;
                aVar2.copyOnWrite();
                C47339b bVar6 = (C47339b) aVar2.instance;
                bVar6.f123043a |= 8;
                bVar6.f123047e = 0;
                cVar.mo51217a((C47339b) aVar2.build());
            }
        }
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
        afVar.mo51184e((C47341d) cVar.build());
        afVar.f122959e.set(true);
        z = true;
        valueOf = Boolean.valueOf(z);
        reentrantReadWriteLock = afVar.f122956b;
        reentrantReadWriteLock.writeLock().unlock();
        return valueOf;
    }
}
