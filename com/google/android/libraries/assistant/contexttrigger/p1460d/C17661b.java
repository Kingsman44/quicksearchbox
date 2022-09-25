package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.b */
/* compiled from: PG */
public final /* synthetic */ class C17661b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17666g f50801a;

    public /* synthetic */ C17661b(C17666g gVar) {
        this.f50801a = gVar;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream((Set) obj).map(new C17664e(this.f50801a)).collect(C58370cn.f155946a));
    }
}
