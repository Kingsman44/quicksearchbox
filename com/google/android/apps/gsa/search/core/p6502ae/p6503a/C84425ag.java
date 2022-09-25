package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21467o;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21473u;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ag */
/* compiled from: PG */
public final class C84425ag implements C90964a {

    /* renamed from: a */
    public static final C59071e f229718a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ae.a.ag");

    /* renamed from: b */
    public static final long f229719b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public final C84421ac f229720c;

    /* renamed from: d */
    public final C22871g f229721d;

    /* renamed from: e */
    public final AtomicInteger f229722e = new AtomicInteger();

    /* renamed from: f */
    public final AtomicBoolean f229723f = new AtomicBoolean();

    public C84425ag(C84421ac acVar, C22871g gVar) {
        this.f229721d = gVar;
        this.f229720c = acVar;
    }

    /* renamed from: a */
    public final C21479b mo77993a(C60870cx cxVar) {
        try {
            return (C21479b) C90877ak.m148473g(cxVar, f229719b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C59104x c = f229718a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9298)).mo56386p("queryGlobalSearch was interrupted");
            return null;
        } catch (RuntimeException e2) {
            C59104x c2 = f229718a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(9299)).mo56386p("Exception when calling queryGlobalSearch");
            C84424af afVar = this.f229720c.f229707a;
            return null;
        }
    }

    /* renamed from: b */
    public final void mo77994b(C91043j jVar) {
        mo77997c();
        this.f229721d.mo28212l("getGlobalSearchSou", new C84455v(this, jVar));
        this.f229721d.mo28212l("maybeDisconnect", new C84453t(this));
    }

    @ProguardMustNotDelete
    public List blockingGetCurrentExperimentIds() {
        C90748e.m148224b();
        ConditionVariable conditionVariable = new ConditionVariable();
        ArrayList arrayList = new ArrayList();
        mo77997c();
        this.f229721d.mo28212l("getCurrentExpr", new C84419aa(this, arrayList, conditionVariable));
        this.f229721d.mo28212l("maybeDisconnect", new C84453t(this));
        conditionVariable.block();
        return arrayList;
    }

    @ProguardMustNotDelete
    public List blockingGetPendingExperimentIds() {
        C90748e.m148224b();
        ConditionVariable conditionVariable = new ConditionVariable();
        ArrayList arrayList = new ArrayList();
        mo77997c();
        this.f229721d.mo28212l("getPendingExpr", new C84458y(this, arrayList, conditionVariable));
        this.f229721d.mo28212l("maybeDisconnect", new C84453t(this));
        conditionVariable.block();
        return arrayList;
    }

    /* renamed from: c */
    public final void mo77997c() {
        this.f229722e.incrementAndGet();
        this.f229721d.mo28212l("maybeConnect", new C84450q(this));
    }

    /* renamed from: e */
    public final void mo77998e(String str, String str2, boolean z, Runnable runnable) {
        mo77997c();
        this.f229721d.mo28212l("setIncludeInGlobal", new C84446m(this, str, str2, z, runnable));
        this.f229721d.mo28212l("maybeDisconnect", new C84453t(this));
    }

    /* renamed from: f */
    public final void mo77999f(boolean z) {
        this.f229721d.mo28212l("setServiceAvail", new C84451r(this, z));
    }

    /* renamed from: g */
    public final C21479b mo78000g(String str, int i, C21467o oVar) {
        C90748e.m148224b();
        ConditionVariable conditionVariable = new ConditionVariable();
        ArrayList arrayList = new ArrayList();
        mo77997c();
        this.f229721d.mo28212l("blockingQueryGloba", new C84449p(this, str, i, oVar, arrayList, conditionVariable));
        this.f229721d.mo28212l("maybeDisconnect", new C84453t(this));
        conditionVariable.block();
        return (C21479b) arrayList.get(0);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("IcingConnection");
        fVar.mo85279c("pending connection").mo85276a(C90752i.m148230d(Integer.valueOf(this.f229722e.get())));
        fVar.mo85279c("waiting for queries").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f229723f.get())));
        fVar.mo85279c("connected").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f229720c.f229707a.f229713d.f59932a.mo119133h())));
    }

    /* renamed from: h */
    public final C21479b mo78001h(String str, String str2, String[] strArr, int i, C21473u uVar) {
        C90748e.m148224b();
        ConditionVariable conditionVariable = new ConditionVariable();
        C21479b[] bVarArr = new C21479b[1];
        mo77997c();
        this.f229721d.mo28212l("query", new C84454u(this, bVarArr, str, str2, strArr, i, uVar, conditionVariable));
        this.f229721d.mo28212l("maybeDisconnect", new C84453t(this));
        conditionVariable.block();
        return bVarArr[0];
    }
}
