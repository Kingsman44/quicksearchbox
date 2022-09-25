package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16003a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47414a;

    public /* synthetic */ C16003a(C16027ax axVar) {
        this.f47414a = axVar;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47414a;
        long millis = Duration.ofHours(((Long) axVar.f47458i.mo17428b()).longValue()).toMillis();
        return axVar.f47455f.mo22706a((C58485gu) Collection.EL.stream((List) obj).filter(new C16033f(axVar, millis)).collect(C58370cn.f155946a));
    }
}
