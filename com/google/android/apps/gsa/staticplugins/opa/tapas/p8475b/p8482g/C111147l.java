package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48588ad;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48661v;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.l */
/* compiled from: PG */
public final /* synthetic */ class C111147l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111136ae f309419a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f309420b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f309421c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f309422d;

    public /* synthetic */ C111147l(C111136ae aeVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f309419a = aeVar;
        this.f309420b = cxVar;
        this.f309421c = cxVar2;
        this.f309422d = cxVar3;
    }

    public final Object call() {
        Optional optional;
        Optional optional2;
        C111136ae aeVar = this.f309419a;
        C60870cx cxVar = this.f309420b;
        C60870cx cxVar2 = this.f309421c;
        C60870cx cxVar3 = this.f309422d;
        C80007da e = aeVar.mo99047e(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
        C48635bx bxVar = (C48635bx) C60856cj.m92909r(cxVar);
        C48635bx bxVar2 = (C48635bx) C60856cj.m92909r(cxVar2);
        if (bxVar.f125706a == 15) {
            optional = Optional.m71637of((C48718bz) bxVar.f125707b);
        } else {
            optional = Optional.empty();
        }
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        Optional empty3 = Optional.empty();
        if (bxVar2.f125706a == 14) {
            optional2 = Optional.m71637of((C48661v) bxVar2.f125707b);
        } else {
            optional2 = Optional.empty();
        }
        C48588ad f = aeVar.mo99048f(optional, booleanValue, empty, empty2, empty3, optional2, Optional.m71637of(e));
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar.copyOnWrite();
        C48635bx bxVar3 = (C48635bx) bvVar.instance;
        f.getClass();
        bxVar3.f125707b = f;
        bxVar3.f125706a = 23;
        long b = aeVar.f309399h.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return (C48635bx) bvVar.build();
    }
}
