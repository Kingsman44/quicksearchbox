package com.google.android.apps.gsa.staticplugins.p7850dq.p7852b;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.p7850dq.p7851a.C99952a;
import com.google.android.libraries.p11016ak.p11023e.C147723g;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.b.b */
/* compiled from: PG */
public final /* synthetic */ class C99954b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f279605a;

    /* renamed from: b */
    public final /* synthetic */ C90851k f279606b;

    public /* synthetic */ C99954b(C90851k kVar, C86124t tVar) {
        this.f279606b = kVar;
        this.f279605a = tVar;
    }

    public final Object apply(Object obj) {
        C90851k kVar = this.f279606b;
        C86124t tVar = this.f279605a;
        C52582xb xbVar = (C52582xb) obj;
        C147723g gVar = new C147723g(kVar.mo85208a("fake-channel-executor"));
        if (tVar.mo79746e(C90125fw.f250899P)) {
            Status status = Status.f186915m;
            C58838bb.m90868c(!status.mo61679g());
            gVar.f398630d = C58485gu.m89845m();
            gVar.f398632f = status;
        } else {
            gVar.f398630d = C58485gu.m89842j(C99952a.m165627a(Base64.decode(tVar.mo79758x(C90125fw.f250915ae), 0)));
            gVar.f398632f = Status.f186902OK;
            gVar.f398631e = C99952a.f279597a;
        }
        return C60856cj.m92900i(gVar);
    }
}
