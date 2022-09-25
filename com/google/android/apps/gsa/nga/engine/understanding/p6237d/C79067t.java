package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.geniefm.C76105k;
import com.google.android.apps.gsa.nga.engine.geniefm.C76106l;
import com.google.common.p4522b.C58532in;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.t */
/* compiled from: PG */
public final /* synthetic */ class C79067t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79073z f217414a;

    /* renamed from: b */
    public final /* synthetic */ C58532in f217415b;

    public /* synthetic */ C79067t(C79073z zVar, C58532in inVar) {
        this.f217414a = zVar;
        this.f217415b = inVar;
    }

    public final void accept(Object obj) {
        C79073z zVar = this.f217414a;
        C58532in inVar = this.f217415b;
        C76106l lVar = (C76106l) obj;
        C76105k kVar = (C76105k) Map.EL.computeIfAbsent(zVar.f217423b, lVar.f210998a, new C79061n(lVar));
        Stream filter = Collection.EL.stream(lVar.f210999b).filter(new C79062o(inVar, lVar));
        Objects.requireNonNull(kVar);
        filter.forEach(new C79063p(kVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
