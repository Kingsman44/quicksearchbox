package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123753bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.av */
/* compiled from: PG */
public final /* synthetic */ class C106887av implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297784a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f297785b;

    public /* synthetic */ C106887av(C106918bz bzVar, C58495hd hdVar) {
        this.f297784a = bzVar;
        this.f297785b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C123730ax axVar;
        C123742bi biVar;
        C123753bt btVar;
        C106918bz bzVar = this.f297784a;
        C58495hd hdVar = this.f297785b;
        C123744bk bkVar = (C123744bk) obj;
        int i = bkVar.f341810e;
        if (i == 9) {
            if (bkVar.f341808c == 5) {
                axVar = (C123730ax) bkVar.f341809d;
            } else {
                axVar = C123730ax.f341767b;
            }
            return Collection.EL.stream(axVar.f341769a).flatMap(new C106902bj(bzVar, hdVar));
        } else if (i == 19) {
            if (bkVar.f341808c == 6) {
                biVar = (C123742bi) bkVar.f341809d;
            } else {
                biVar = C123742bi.f341800b;
            }
            return Collection.EL.stream(biVar.f341802a).flatMap(new C106890ay(bzVar, hdVar));
        } else if (i != 29) {
            return Collection.EL.stream(C58485gu.m89845m());
        } else {
            if (bkVar.f341808c == 29) {
                btVar = (C123753bt) bkVar.f341809d;
            } else {
                btVar = C123753bt.f341832c;
            }
            C123730ax axVar2 = btVar.f341835b;
            if (axVar2 == null) {
                axVar2 = C123730ax.f341767b;
            }
            return Collection.EL.stream(axVar2.f341769a).flatMap(new C106911bs(bzVar, hdVar));
        }
    }
}
