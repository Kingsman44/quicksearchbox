package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.assistant.p4008y.p4009a.C53554an;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.as */
/* compiled from: PG */
public final /* synthetic */ class C109395as implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109398av f304684a;

    public /* synthetic */ C109395as(C109398av avVar) {
        this.f304684a = avVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C109398av avVar = this.f304684a;
        C53593bz bzVar = (C53593bz) obj;
        int i = bzVar.f140660a;
        if (!((i & 1) == 0 || (i & 32) == 0)) {
            C53554an anVar = bzVar.f140666g;
            if (anVar == null) {
                anVar = C53554an.f140545b;
            }
            if (Collection.EL.stream(anVar.f140547a).anyMatch(C109389am.f304675a)) {
                C60870cx g = C60922j.m93044g(avVar.f304690d, new C109390an(bzVar), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                return g;
            }
        }
        return C60856cj.m92900i(bzVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
