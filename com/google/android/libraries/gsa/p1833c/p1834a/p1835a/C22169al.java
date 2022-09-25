package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.gsa.c.a.a.al */
/* compiled from: PG */
final class C22169al implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C22170am f61179a;

    public C22169al(C22170am amVar) {
        this.f61179a = amVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) C22170am.f61180a.mo56225c()).mo56372aa(48532)).mo56386p("Connectivity check failed");
        this.f61179a.f61183d.lock();
        try {
            C22170am amVar = this.f61179a;
            amVar.f61193n = true;
            amVar.f61194o = C22196u.f61276a;
            C22170am amVar2 = this.f61179a;
            amVar2.f61195p = null;
            amVar2.f61183d.unlock();
        } catch (Throwable th2) {
            this.f61179a.f61183d.unlock();
            throw th2;
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C22196u uVar = (C22196u) obj;
        this.f61179a.f61183d.lock();
        try {
            C22170am amVar = this.f61179a;
            amVar.f61195p = null;
            amVar.f61183d.unlock();
        } catch (Throwable th) {
            this.f61179a.f61183d.unlock();
            throw th;
        }
    }
}
