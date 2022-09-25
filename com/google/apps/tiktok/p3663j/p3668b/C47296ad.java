package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.p3663j.p3670c.C47339b;
import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.apps.tiktok.p3663j.p3670c.C47345h;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.apps.tiktok.j.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C47296ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f122952a;

    /* renamed from: b */
    public final /* synthetic */ Set f122953b;

    public /* synthetic */ C47296ad(C47298af afVar, Set set) {
        this.f122952a = afVar;
        this.f122953b = set;
    }

    public final void run() {
        C47341d dVar;
        ReentrantReadWriteLock reentrantReadWriteLock;
        C47298af afVar = this.f122952a;
        Set set = this.f122953b;
        afVar.f122956b.writeLock().lock();
        try {
            dVar = C47341d.f123048f;
            dVar = afVar.mo51180a();
        } catch (IOException e) {
            if (!afVar.mo51185f(e)) {
                ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e)).mo56372aa(54776)).mo56386p("Unable to read or clear store. Cannot remove account.");
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
        for (C47339b bVar : dVar.f123052c) {
            C47345h hVar = bVar.f123044b;
            if (hVar == null) {
                hVar = C47345h.f123059d;
            }
            if (!set.contains(new C47304al(hVar))) {
                cVar.mo51217a(bVar);
            }
        }
        try {
            afVar.mo51184e((C47341d) cVar.build());
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e2)).mo56372aa(54775)).mo56386p("Error writing sync data file. Cannot remove account.");
        }
        reentrantReadWriteLock = afVar.f122956b;
        reentrantReadWriteLock.writeLock().unlock();
    }
}
