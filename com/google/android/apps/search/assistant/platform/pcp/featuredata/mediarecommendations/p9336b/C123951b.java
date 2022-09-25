package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b;

import android.content.ComponentName;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.b */
/* compiled from: PG */
final class C123951b implements Function {

    /* renamed from: a */
    final /* synthetic */ List f342364a;

    /* renamed from: b */
    final /* synthetic */ C123962m f342365b;

    public C123951b(List list, C123962m mVar) {
        this.f342364a = list;
        this.f342365b = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        if (this.f342364a.contains(componentName)) {
            ((C58970a) this.f342365b.f342400h.mo56224b()).mo56389s("#getTopRankedPausedApp: %s", componentName);
            return Optional.m71637of(componentName);
        }
        ((C58970a) this.f342365b.f342400h.mo56224b()).mo56386p("getTopRankedPausedApp: Top ranked media app is not active or paused.");
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
