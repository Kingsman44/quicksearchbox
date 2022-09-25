package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.s */
/* compiled from: PG */
public final /* synthetic */ class C126155s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C63124b f347625a;

    public /* synthetic */ C126155s(C63124b bVar) {
        this.f347625a = bVar;
    }

    public final Object apply(Object obj) {
        int number = this.f347625a.getNumber();
        C126152p pVar = C126152p.f347617d;
        C62995dn dnVar = ((C125943aa) obj).f347160a;
        Integer valueOf = Integer.valueOf(number);
        return dnVar.containsKey(valueOf) ? (C126152p) dnVar.get(valueOf) : pVar;
    }
}
