package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.assistant.p3781ad.p3789d.p3791b.C48715bw;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.C48721cb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bc */
/* compiled from: PG */
public final /* synthetic */ class C113055bc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313261a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f313262b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f313263c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f313264d;

    public /* synthetic */ C113055bc(C113071bs bsVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f313261a = bsVar;
        this.f313262b = cxVar;
        this.f313263c = cxVar2;
        this.f313264d = cxVar3;
    }

    public final Object call() {
        C113071bs bsVar = this.f313261a;
        C60870cx cxVar = this.f313262b;
        C60870cx cxVar2 = this.f313263c;
        C60870cx cxVar3 = this.f313264d;
        if (!C113090ck.m187089b(bsVar.f313289d, bsVar.f313293h) || !((Boolean) C60856cj.m92909r(cxVar)).booleanValue() || ((Optional) C60856cj.m92909r(cxVar2)).isEmpty()) {
            return Optional.empty();
        }
        C48715bw bwVar = (C48715bw) ((Optional) C60856cj.m92909r(cxVar2)).get();
        bwVar.copyOnWrite();
        C48716bx bxVar = (C48716bx) bwVar.instance;
        C48716bx bxVar2 = C48716bx.f126043g;
        bxVar.mo53175a();
        C62947c.addAll((Iterable) C60856cj.m92909r(cxVar3), (List) bxVar.f126046b);
        C48716bx bxVar3 = (C48716bx) bwVar.build();
        for (C48721cb cbVar : bxVar3.f126046b) {
            if (cbVar.f126064h) {
                bsVar.f313292g.mo99076a(C111255r.USER_PROFILE, String.format("Added a log entry to user profile: %s", new Object[]{bxVar3}));
                return Optional.m71637of(bxVar3);
            }
        }
        return Optional.empty();
    }
}
