package com.google.android.apps.search.googleapp.search.p10420k;

import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.googleapp.search.k.d */
/* compiled from: PG */
public final /* synthetic */ class C137545d implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C137416e f374098a;

    public /* synthetic */ C137545d(C137416e eVar) {
        this.f374098a = eVar;
    }

    public final void accept(Object obj, Object obj2) {
        C137416e eVar = this.f374098a;
        String str = (String) obj;
        String str2 = (String) obj2;
        if ("tbm".equals(str)) {
            C137418g gVar = (C137418g) eVar.instance;
            if ((gVar.f373769a & 2) == 0 || gVar.f373771c.isEmpty()) {
                eVar.copyOnWrite();
                C137418g gVar2 = (C137418g) eVar.instance;
                str2.getClass();
                gVar2.f373769a |= 2;
                gVar2.f373771c = str2;
                return;
            }
            return;
        }
        eVar.mo113714b(str, str2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
