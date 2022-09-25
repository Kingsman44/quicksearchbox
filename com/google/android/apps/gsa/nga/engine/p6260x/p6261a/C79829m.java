package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.m */
/* compiled from: PG */
public final /* synthetic */ class C79829m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79829m f218900a = new C79829m();

    private /* synthetic */ C79829m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C82876ds dsVar;
        C82885ea eaVar = ((C82889ee) obj).f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 36) {
            dsVar = (C82876ds) eaVar.f225980b;
        } else {
            dsVar = C82876ds.f225961e;
        }
        C51544lq lqVar = dsVar.f225966d;
        return lqVar == null ? C51544lq.f134342j : lqVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
