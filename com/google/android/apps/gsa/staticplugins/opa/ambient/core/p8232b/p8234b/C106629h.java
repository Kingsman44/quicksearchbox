package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.h */
/* compiled from: PG */
public final /* synthetic */ class C106629h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106630i f297274a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297275b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f297276c;

    public /* synthetic */ C106629h(C106630i iVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f297274a = iVar;
        this.f297275b = cxVar;
        this.f297276c = cxVar2;
    }

    public final Object call() {
        C106630i iVar = this.f297274a;
        C60870cx cxVar = this.f297275b;
        C60870cx cxVar2 = this.f297276c;
        C58480gp e = C58485gu.m89837e();
        try {
            e.mo55395g(iVar.mo95604b(((C131090m) C60856cj.m92909r(cxVar)).mo110067b(), C33425t.ON_DEVICE_MEDIA_APP_SUGGESTIONS));
        } catch (ExecutionException e2) {
            ((C59052c) ((C59052c) ((C59052c) C106630i.f297277a.mo56225c()).mo56382g(e2)).mo56372aa(23175)).mo56386p("Failed to retrieve app suggestions based on on-device usage");
            C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
            C33425t tVar = C33425t.ON_DEVICE_MEDIA_APP_SUGGESTIONS;
            uVar.copyOnWrite();
            C33427v vVar = (C33427v) uVar.instance;
            vVar.f89526b = tVar.f89522p;
            vVar.f89525a |= 1;
            String executionException = e2.toString();
            uVar.copyOnWrite();
            C33427v vVar2 = (C33427v) uVar.instance;
            executionException.getClass();
            vVar2.f89525a |= 4;
            vVar2.f89528d = executionException;
            e.mo55395g((C33427v) uVar.build());
        }
        try {
            e.mo55395g(iVar.mo95604b((C58485gu) C60856cj.m92909r(cxVar2), C33425t.HABITS_PROFILE_MEDIA_APP_SUGGESTIONS));
        } catch (ExecutionException e3) {
            ((C59052c) ((C59052c) ((C59052c) C106630i.f297277a.mo56225c()).mo56382g(e3)).mo56372aa(23174)).mo56386p("Failed to retrieve app suggestions based on Habits profiles");
            C33426u uVar2 = (C33426u) C33427v.f89523e.createBuilder();
            C33425t tVar2 = C33425t.HABITS_PROFILE_MEDIA_APP_SUGGESTIONS;
            uVar2.copyOnWrite();
            C33427v vVar3 = (C33427v) uVar2.instance;
            vVar3.f89526b = tVar2.f89522p;
            vVar3.f89525a |= 1;
            String executionException2 = e3.toString();
            uVar2.copyOnWrite();
            C33427v vVar4 = (C33427v) uVar2.instance;
            executionException2.getClass();
            vVar4.f89525a |= 4;
            vVar4.f89528d = executionException2;
            e.mo55395g((C33427v) uVar2.build());
        }
        return e.mo55394f();
    }
}
