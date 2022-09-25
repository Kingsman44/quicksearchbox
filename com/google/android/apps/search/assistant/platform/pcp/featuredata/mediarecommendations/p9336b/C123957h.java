package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b;

import android.content.ComponentName;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Set;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.h */
/* compiled from: PG */
final class C123957h implements Function {

    /* renamed from: a */
    final /* synthetic */ C123962m f342382a;

    public C123957h(C123962m mVar) {
        this.f342382a = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        C123962m mVar = this.f342382a;
        Set set = C123962m.f342393a;
        if (!((C65603f) mVar.f342399g.mo17428b()).f178307a.contains(componentName.getPackageName())) {
            return Optional.m71637of(componentName);
        }
        ((C58970a) this.f342382a.f342400h.mo56224b()).mo56389s("%s is on deny list for periodic refresh.", componentName.getPackageName());
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
