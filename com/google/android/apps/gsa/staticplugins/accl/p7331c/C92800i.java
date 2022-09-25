package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86254i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.i */
/* compiled from: PG */
public final /* synthetic */ class C92800i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C92804m f258961a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f258962b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f258963c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f258964d;

    public /* synthetic */ C92800i(C92804m mVar, C60870cx cxVar, C60870cx cxVar2, C58833ax axVar) {
        this.f258961a = mVar;
        this.f258962b = cxVar;
        this.f258963c = cxVar2;
        this.f258964d = axVar;
    }

    public final Object call() {
        C92804m mVar = this.f258961a;
        C60870cx cxVar = this.f258962b;
        C60870cx cxVar2 = this.f258963c;
        C58833ax axVar = this.f258964d;
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar3 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (axVar2.mo56113h()) {
            C86232bo boVar = (C86232bo) axVar2.mo56107c();
            if (boVar instanceof C86254i) {
                C60870cx a = ((C86254i) boVar).mo79949a();
                C60870cx q = boVar.mo79893q();
                C60856cj.m92895d(a, q).mo57334a(new C92799h(mVar, a, axVar3, q, axVar), C60826bg.f164896a);
            }
        } else {
            ((C59052c) ((C59052c) C92804m.f258971a.mo56225c()).mo56372aa(13043)).mo56386p("Can't send result to event bus because SearchResult is not present");
        }
        return C118826c.f331422a;
    }
}
