package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ae */
/* compiled from: PG */
public final /* synthetic */ class C103212ae implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Map f287977a;

    public /* synthetic */ C103212ae(Map map) {
        this.f287977a = map;
    }

    public final void accept(Object obj, Object obj2) {
        Map.EL.merge(this.f287977a, (C103217aj) obj, Double.valueOf(Collection.EL.stream((java.util.Collection) obj2).mapToDouble(C103215ah.f287981a).sum()), C103216ai.f287982a);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
