package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79998cs;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79999ct;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3921j.C52407qp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.f */
/* compiled from: PG */
public final /* synthetic */ class C111141f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79998cs f309413a;

    public /* synthetic */ C111141f(C79998cs csVar) {
        this.f309413a = csVar;
    }

    public final void accept(Object obj) {
        C79998cs csVar = this.f309413a;
        C51592nk nkVar = (C51592nk) obj;
        C121537f fVar = C111136ae.f309392a;
        C52407qp qpVar = nkVar.f134471h;
        if (qpVar == null) {
            qpVar = C52407qp.f137523d;
        }
        long j = qpVar.f137526b;
        csVar.copyOnWrite();
        C79999ct ctVar = (C79999ct) csVar.instance;
        C79999ct ctVar2 = C79999ct.f219469i;
        ctVar.f219471a |= 2;
        ctVar.f219473c = (float) j;
        long longValue = nkVar.f134465b == 5 ? ((Long) nkVar.f134466c).longValue() : 0;
        csVar.copyOnWrite();
        C79999ct ctVar3 = (C79999ct) csVar.instance;
        ctVar3.f219471a |= 16;
        ctVar3.f219475e = ((float) longValue) / 1000.0f;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
