package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.aa */
/* compiled from: PG */
public final class C42875aa implements C60931s {

    /* renamed from: a */
    public final List f112183a;

    /* renamed from: b */
    public final Executor f112184b;

    public C42875aa(List list, Executor executor) {
        this.f112183a = list;
        this.f112184b = executor;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C42999ef efVar = (C42999ef) obj;
        int size = this.f112183a.size();
        ArrayList arrayList = new ArrayList(size);
        for (C43019v c : this.f112183a) {
            arrayList.add(c.mo18056c());
        }
        C60931s f = C47810es.m84966f(new C43020w(this, arrayList, size));
        C60826bg bgVar = C60826bg.f164896a;
        efVar.f112448a.f112453e.mo51388a();
        return C60922j.m93045h(C60922j.m93045h(C60856cj.m92901j(efVar.f112448a.f112451c.mo50395b()), C47810es.m84966f(new C42998ee(efVar, f, bgVar)), C60826bg.f164896a), C47810es.m84966f(new C43021x(this, size, arrayList)), C60826bg.f164896a);
    }
}
