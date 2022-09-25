package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29383eg;
import com.google.android.libraries.mdi.download.C29384eh;
import com.google.android.libraries.mdi.download.C29395es;
import com.google.android.libraries.mdi.download.C29396et;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.libraries.mdi.download.d.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C29018ag implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29384eh f78779a;

    public /* synthetic */ C29018ag(C29384eh ehVar) {
        this.f78779a = ehVar;
    }

    public final Object apply(Object obj) {
        C29384eh ehVar = this.f78779a;
        C29396et etVar = (C29396et) obj;
        int i = C29025an.f78785e;
        int a = C58557jl.m90120a(etVar.f79695c, new C29013ab(ehVar));
        if (a == -1) {
            C29395es esVar = (C29395es) etVar.toBuilder();
            esVar.copyOnWrite();
            C29396et etVar2 = (C29396et) esVar.instance;
            ehVar.getClass();
            etVar2.mo34703a();
            etVar2.f79695c.add(ehVar);
            return (C29396et) esVar.build();
        }
        C29384eh ehVar2 = (C29384eh) etVar.f79695c.get(a);
        C29383eg egVar = (C29383eg) ehVar2.toBuilder();
        long j = ehVar2.f79660f;
        long j2 = ehVar.f79660f;
        egVar.copyOnWrite();
        C29384eh ehVar3 = (C29384eh) egVar.instance;
        ehVar3.f79655a |= 16;
        ehVar3.f79660f = j + j2;
        long j3 = ehVar2.f79661g;
        long j4 = ehVar.f79661g;
        egVar.copyOnWrite();
        C29384eh ehVar4 = (C29384eh) egVar.instance;
        ehVar4.f79655a |= 32;
        ehVar4.f79661g = j3 + j4;
        C29384eh ehVar5 = (C29384eh) egVar.build();
        C29395es esVar2 = (C29395es) etVar.toBuilder();
        esVar2.copyOnWrite();
        C29396et etVar3 = (C29396et) esVar2.instance;
        ehVar5.getClass();
        etVar3.mo34703a();
        etVar3.f79695c.set(a, ehVar5);
        return (C29396et) esVar2.build();
    }
}
