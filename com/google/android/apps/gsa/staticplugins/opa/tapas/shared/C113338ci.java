package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ci */
/* compiled from: PG */
public final /* synthetic */ class C113338ci implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Map f313863a;

    public /* synthetic */ C113338ci(Map map) {
        this.f313863a = map;
    }

    public final void accept(Object obj, Object obj2) {
        int i = C113339cj.f313864a;
        ((C113295bt) Map.EL.computeIfAbsent(this.f313863a, (C48670ae) obj, C113334ce.f313859a)).f313760a.addAll(((C113291bp) obj2).f313754b);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
