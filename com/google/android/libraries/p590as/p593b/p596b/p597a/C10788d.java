package com.google.android.libraries.p590as.p593b.p596b.p597a;

import com.google.android.libraries.p590as.p593b.p596b.C10949k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.as.b.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C10788d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C10795k f35814a;

    public /* synthetic */ C10788d(C10795k kVar) {
        this.f35814a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C10795k kVar = this.f35814a;
        C58485gu guVar = (C58485gu) obj;
        ((C58970a) ((C58970a) C10795k.f35823a.mo56224b()).mo56372aa(53988)).mo56387q("Background deleting %d stale packs", guVar.size());
        Stream stream = Collection.EL.stream(guVar);
        C10949k kVar2 = kVar.f35824b;
        Objects.requireNonNull(kVar2);
        return C60856cj.m92896e((Iterable) stream.map(new C10791g(kVar2)).collect(C58370cn.f155946a));
    }
}
