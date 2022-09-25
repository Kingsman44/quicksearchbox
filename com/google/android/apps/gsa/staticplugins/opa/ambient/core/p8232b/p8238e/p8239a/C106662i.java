package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e.p8239a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.a.i */
/* compiled from: PG */
public final /* synthetic */ class C106662i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106664k f297322a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297323b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f297324c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f297325d;

    public /* synthetic */ C106662i(C106664k kVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f297322a = kVar;
        this.f297323b = cxVar;
        this.f297324c = cxVar2;
        this.f297325d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106664k kVar = this.f297322a;
        try {
            return C60856cj.m92900i(kVar.mo95609c((Optional) C60856cj.m92909r(this.f297323b), ((Boolean) C60856cj.m92909r(this.f297324c)).booleanValue(), ((Boolean) C60856cj.m92909r(this.f297325d)).booleanValue()));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) kVar.f297327a.mo56225c()).mo56382g(e)).mo56372aa(23183)).mo56386p("future failure");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
    }
}
