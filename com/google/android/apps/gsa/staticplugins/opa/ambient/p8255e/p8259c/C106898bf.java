package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.protobuf.C63088z;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bf */
/* compiled from: PG */
public final /* synthetic */ class C106898bf implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297799a;

    /* renamed from: b */
    public final /* synthetic */ Map f297800b;

    public /* synthetic */ C106898bf(C106918bz bzVar, Map map) {
        this.f297799a = bzVar;
        this.f297800b = map;
    }

    public final void accept(Object obj) {
        C106918bz bzVar = this.f297799a;
        Map map = this.f297800b;
        C106868ac acVar = (C106868ac) obj;
        C52568wo woVar = acVar.mo95703d().f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        C63088z zVar = (C63088z) map.get(dcVar.f132817c);
        if (zVar == null || zVar.mo59173M()) {
            bzVar.f297828c.mo41706u();
        } else {
            acVar.mo95710k(zVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
