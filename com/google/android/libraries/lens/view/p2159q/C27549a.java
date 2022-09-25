package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.q.a */
/* compiled from: PG */
public final /* synthetic */ class C27549a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C27634h f75337a;

    /* renamed from: b */
    public final /* synthetic */ List f75338b;

    public /* synthetic */ C27549a(C27634h hVar, List list) {
        this.f75337a = hVar;
        this.f75338b = list;
    }

    public final void accept(Object obj, Object obj2) {
        C27634h hVar = this.f75337a;
        List list = this.f75338b;
        String str = (String) obj2;
        C29409fd fdVar = hVar.f75490a;
        C28804cs f = C28805ct.m53747f();
        f.mo34449c((String) obj);
        list.add(fdVar.mo34717f(f.mo34447a()));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
