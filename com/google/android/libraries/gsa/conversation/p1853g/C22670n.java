package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.p1855h.C22713q;
import com.google.android.libraries.gsa.conversation.p1855h.C22714r;
import com.google.android.libraries.gsa.conversation.p1855h.C22715s;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.conversation.g.n */
/* compiled from: PG */
public final /* synthetic */ class C22670n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22677u f62440a;

    /* renamed from: b */
    public final /* synthetic */ C52083ep f62441b;

    /* renamed from: c */
    public final /* synthetic */ C51175f f62442c;

    /* renamed from: d */
    public final /* synthetic */ C22715s f62443d;

    /* renamed from: e */
    public final /* synthetic */ C22669m f62444e;

    public /* synthetic */ C22670n(C22677u uVar, C52083ep epVar, C51175f fVar, C22715s sVar, C22669m mVar) {
        this.f62440a = uVar;
        this.f62441b = epVar;
        this.f62442c = fVar;
        this.f62443d = sVar;
        this.f62444e = mVar;
    }

    public final C60870cx apply(Object obj) {
        C52076ei eiVar;
        C22677u uVar = this.f62440a;
        C52083ep epVar = this.f62441b;
        C51175f fVar = this.f62442c;
        C22715s sVar = this.f62443d;
        C22669m mVar = this.f62444e;
        C58833ax axVar = (C58833ax) obj;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        if (eiVar.f136670e && uVar.f62464h == 3) {
            C22677u.m42209e(epVar);
            int i = fVar.f133208b;
            C22713q f = C22715s.m42323f();
            f.mo27842c(C22677u.m42209e(epVar));
            f.mo27843d(C22714r.POSTPONED);
            return C60856cj.m92900i(f.mo27840a());
        } else if (sVar.mo27848c() == C22714r.POSTPONED) {
            C22677u.m42209e(epVar);
            int i2 = fVar.f133208b;
            return C60856cj.m92900i(sVar);
        } else if (!axVar.mo56113h()) {
            C22677u.m42209e(epVar);
            int i3 = fVar.f133208b;
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.IGNORE;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a |= 1;
            C22713q f2 = C22715s.m42323f();
            f2.mo27842c(C22677u.m42209e(epVar));
            f2.mo27843d(C22714r.CANCEL);
            f2.mo27844e((C52070ec) dzVar.build());
            return C60856cj.m92900i(f2.mo27840a());
        } else {
            C22677u.m42209e((C52083ep) axVar.mo56107c());
            int i4 = fVar.f133208b;
            return uVar.mo27783c((C52083ep) axVar.mo56107c(), mVar);
        }
    }
}
