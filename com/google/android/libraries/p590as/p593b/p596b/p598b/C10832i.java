package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.as.b.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C10832i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f35874a;

    public /* synthetic */ C10832i(C58485gu guVar) {
        this.f35874a = guVar;
    }

    public final C60870cx apply(Object obj) {
        C58485gu guVar = this.f35874a;
        Stream stream = Collection.EL.stream((C58528ij) obj);
        Objects.requireNonNull(guVar);
        return C60856cj.m92900i((C58485gu) stream.filter(new C10835l(guVar)).collect(C58370cn.f155946a));
    }
}
