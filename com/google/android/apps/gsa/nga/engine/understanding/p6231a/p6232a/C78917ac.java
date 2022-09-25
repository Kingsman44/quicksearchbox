package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C78917ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78918ad f217141a;

    /* renamed from: b */
    public final /* synthetic */ C79326x f217142b;

    public /* synthetic */ C78917ac(C78918ad adVar, C79326x xVar) {
        this.f217141a = adVar;
        this.f217142b = xVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C78918ad adVar = this.f217141a;
        C79326x xVar = this.f217142b;
        C79890l lVar = (C79890l) obj;
        float d = ((float) adVar.f217144a.mo85399d(C90126fx.f251008ah)) / 1000.0f;
        if (d >= 1.0f) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(Float.valueOf(d));
        }
        boolean booleanValue = ((Boolean) optional.map(new C78916ab(lVar)).orElse(false)).booleanValue();
        if (booleanValue) {
            xVar.mo73900a("Deeplink predicted by DeeplinkClassifier");
        } else {
            xVar.mo73900a("No deeplink predicted by DeeplinkClassifier");
        }
        return Boolean.valueOf(booleanValue);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
