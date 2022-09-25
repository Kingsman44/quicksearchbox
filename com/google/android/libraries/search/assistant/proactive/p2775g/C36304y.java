package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49077fp;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.y */
/* compiled from: PG */
public final /* synthetic */ class C36304y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C49078fq f94802a;

    public /* synthetic */ C36304y(C49078fq fqVar) {
        this.f94802a = fqVar;
    }

    public final Object apply(Object obj) {
        C49078fq fqVar = this.f94802a;
        C49078fq fqVar2 = (C49078fq) obj;
        if (fqVar.f126943e != 0) {
            return fqVar;
        }
        C49077fp fpVar = (C49077fp) fqVar.toBuilder();
        long j = fqVar2.f126943e;
        fpVar.copyOnWrite();
        C49078fq fqVar3 = (C49078fq) fpVar.instance;
        fqVar3.f126939a |= 2;
        fqVar3.f126943e = j;
        return (C49078fq) fpVar.build();
    }
}
