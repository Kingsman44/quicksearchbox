package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.p3663j.p3670c.C47340c;
import com.google.apps.tiktok.p3663j.p3670c.C47341d;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.j.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C47294ab implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f122948a;

    /* renamed from: b */
    public final /* synthetic */ long f122949b;

    public /* synthetic */ C47294ab(C47298af afVar, long j) {
        this.f122948a = afVar;
        this.f122949b = j;
    }

    public final Object call() {
        C47298af afVar = this.f122948a;
        long j = this.f122949b;
        C47341d dVar = C47341d.f123048f;
        afVar.f122956b.writeLock().lock();
        try {
            dVar = afVar.mo51180a();
        } catch (IOException e) {
            C58887cx.m90974a(e);
        } catch (Throwable th) {
            afVar.f122956b.writeLock().unlock();
            throw th;
        }
        C47340c cVar = (C47340c) dVar.toBuilder();
        cVar.copyOnWrite();
        C47341d dVar2 = (C47341d) cVar.instance;
        dVar2.f123050a |= 2;
        dVar2.f123053d = j;
        try {
            afVar.mo51184e((C47341d) cVar.build());
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) C47298af.f122955a.mo56226d()).mo56382g(e2)).mo56372aa(54773)).mo56386p("Error writing sync data file. Cannot update last wakeup.");
        }
        afVar.f122956b.writeLock().unlock();
        int i = dVar.f123050a;
        return Long.valueOf((i & 2) != 0 ? dVar.f123053d : (i & 1) != 0 ? dVar.f123051b : -1);
    }
}
