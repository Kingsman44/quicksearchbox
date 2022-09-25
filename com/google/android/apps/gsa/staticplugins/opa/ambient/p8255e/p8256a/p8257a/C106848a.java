package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.C106847a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.C106856b;
import com.google.assistant.p3886c.C50838j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106848a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106855h f297724a;

    public /* synthetic */ C106848a(C106855h hVar) {
        this.f297724a = hVar;
    }

    public final Object apply(Object obj) {
        C106855h hVar = this.f297724a;
        Stream stream = Collection.EL.stream((C58485gu) obj);
        C106856b bVar = hVar.f297736f;
        int i = C106851d.f297727a;
        C50838j a = C106855h.m177613a((C58485gu) stream.filter(new C106847a(bVar)).collect(C58370cn.f155946a));
        int size = a.f132372a.size();
        int sum = Collection.EL.stream(a.f132372a).mapToInt(C106852e.f297728a).sum();
        hVar.f297734d.mo77192a(C118569b.SMARTSPACE_HYBRID_HOTSEAT_SUGGESTION_CONTEXT_COUNT, (long) size);
        hVar.f297734d.mo77192a(C118569b.SMARTSPACE_HYBRID_HOTSEAT_SUGGESTION_COUNT, (long) sum);
        Collection.EL.stream(a.f132372a).forEach(new C106853f(hVar));
        ((C58970a) ((C58970a) hVar.f297735e.mo56224b()).mo56372aa(23327)).mo56387q("Sending app suggestions for %d contexts to AiAi", size);
        return a;
    }
}
