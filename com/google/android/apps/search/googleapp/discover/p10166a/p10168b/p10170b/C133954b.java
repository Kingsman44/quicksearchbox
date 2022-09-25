package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import com.google.android.libraries.storage.p3315b.C42838ax;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.b */
/* compiled from: PG */
final class C133954b implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C42838ax f364869a;

    public C133954b(C42838ax axVar) {
        this.f364869a = axVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        int intValue = ((Number) obj).intValue();
        C42838ax axVar = this.f364869a;
        axVar.f112125a.append(", ?");
        axVar.f112126b.add(String.valueOf(intValue));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
