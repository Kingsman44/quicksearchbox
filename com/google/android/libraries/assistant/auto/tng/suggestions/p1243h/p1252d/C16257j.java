package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.j */
/* compiled from: PG */
public final /* synthetic */ class C16257j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16267t f47874a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f47875b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f47876c;

    public /* synthetic */ C16257j(C16267t tVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f47874a = tVar;
        this.f47875b = cxVar;
        this.f47876c = cxVar2;
    }

    public final Object call() {
        C16267t tVar = this.f47874a;
        C60870cx cxVar = this.f47875b;
        C60870cx cxVar2 = this.f47876c;
        C58485gu.m89845m();
        C58495hd hdVar = C58729pv.f156485a;
        try {
            hdVar = (C58495hd) ((Optional) C60856cj.m92909r(cxVar)).map(C16259l.f47878a).orElse(C58729pv.f156485a);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C16267t.f47888a.mo56226d()).mo56382g(e)).mo56372aa(46662)).mo56386p("Exception getting suggestion metrics");
        }
        try {
            return (C58485gu) Collection.EL.stream(C58485gu.m89842j((java.util.Collection) C60856cj.m92909r(cxVar2))).filter(new C16249b(hdVar, Instant.ofEpochMilli(tVar.f47890c.mo26870b()))).map(C16250c.f47860a).collect(C58370cn.f155946a);
        } catch (ExecutionException e2) {
            ((C59052c) ((C59052c) ((C59052c) C16267t.f47888a.mo56226d()).mo56382g(e2)).mo56372aa(46661)).mo56386p("Exception getting suggestions");
            return C58485gu.m89845m();
        }
    }
}
