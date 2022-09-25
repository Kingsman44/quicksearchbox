package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.google.apps.tiktok.j.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C47295ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f122950a;

    /* renamed from: b */
    public final /* synthetic */ Set f122951b;

    public /* synthetic */ C47295ac(C47298af afVar, Set set) {
        this.f122950a = afVar;
        this.f122951b = set;
    }

    public final void run() {
        C47341d dVar;
        C47298af afVar = this.f122950a;
        Set<C47304al> set = this.f122951b;
        afVar.f122956b.writeLock().lock();
        try {
            dVar = C47341d.f123048f;
            dVar = afVar.mo51180a();
        } catch (IOException e) {
            if (!afVar.mo51185f(e)) {
                ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e)).mo56372aa(54780)).mo56386p("Unable to read or clear store, will not update scheduled account ids. ");
            }
        } catch (Throwable th) {
            afVar.f122956b.writeLock().unlock();
            throw th;
        }
        C47340c cVar = (C47340c) dVar.toBuilder();
        cVar.copyOnWrite();
        ((C47341d) cVar.instance).f123054e = C47341d.emptyIntList();
        TreeSet treeSet = new TreeSet();
        for (C47304al alVar : set) {
            if (alVar.mo51188c()) {
                treeSet.add(Integer.valueOf(((AutoValue_AccountId) alVar.f122967c).f120739a));
            }
        }
        cVar.copyOnWrite();
        C47341d dVar2 = (C47341d) cVar.instance;
        C62961ch chVar = dVar2.f123054e;
        if (!chVar.mo58948c()) {
            dVar2.f123054e = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) treeSet, (List) dVar2.f123054e);
        try {
            afVar.mo51184e((C47341d) cVar.build());
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56225c()).mo56382g(e2)).mo56372aa(54779)).mo56386p("Error writing scheduled account ids");
        }
        afVar.f122956b.writeLock().unlock();
    }
}
