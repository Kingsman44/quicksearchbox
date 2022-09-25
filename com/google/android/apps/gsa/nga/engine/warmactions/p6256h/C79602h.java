package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.h */
/* compiled from: PG */
public final /* synthetic */ class C79602h implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C79605k f218390a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f218391b;

    public /* synthetic */ C79602h(C79605k kVar, C91006f fVar) {
        this.f218390a = kVar;
        this.f218391b = fVar;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        this.f218391b.mo85278b(str).mo85276a(C90752i.m148228b(Boolean.valueOf(this.f218390a.mo74150b(((Integer) obj2).intValue(), C79605k.m127660c(str)).isPresent())));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
