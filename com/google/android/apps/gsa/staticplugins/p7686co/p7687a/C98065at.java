package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91731a;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.sidekick.shared.util.C91954ae;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.at */
/* compiled from: PG */
public final class C98065at extends C91954ae {

    /* renamed from: a */
    private final C91307al f273831a;

    public C98065at(C91307al alVar) {
        this.f273831a = alVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        if (hjVar.f26950V) {
            C91307al alVar = this.f273831a;
            synchronized (alVar.f254819a) {
                C91731a a = alVar.mo85600a();
                a.copyOnWrite();
                C91732b bVar = (C91732b) a.instance;
                C91732b bVar2 = C91732b.f255833m;
                hjVar.getClass();
                bVar.mo86231a();
                bVar.f255844j.add(hjVar);
                alVar.f254822d = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo85912b(C7718hj hjVar, C7726hr hrVar) {
        mo77745a(hjVar);
    }
}
