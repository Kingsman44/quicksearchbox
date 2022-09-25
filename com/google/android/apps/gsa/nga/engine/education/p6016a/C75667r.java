package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.google.android.apps.gsa.assistant.shared.p5810d.C73853f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.r */
/* compiled from: PG */
public final /* synthetic */ class C75667r implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C75674y f210034a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f210035b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f210036c;

    public /* synthetic */ C75667r(C75674y yVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f210034a = yVar;
        this.f210035b = cxVar;
        this.f210036c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C75674y yVar = this.f210034a;
        C60870cx cxVar = this.f210035b;
        Optional optional = (Optional) C60856cj.m92909r(this.f210036c);
        yVar.f210047d.set(C75674y.m121962b((C73853f) C60856cj.m92909r(cxVar)));
        if (optional.isPresent()) {
            optional.get();
            yVar.f210048e.set(C75674y.m121962b((C73853f) optional.get()));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }
}
