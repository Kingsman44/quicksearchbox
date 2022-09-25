package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54827at;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54828au;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.cf */
/* compiled from: PG */
public final class C112228cf extends C112646l {

    /* renamed from: a */
    static final Function f311523a = new C112274df();

    /* renamed from: b */
    private final C86124t f311524b;

    /* renamed from: c */
    private final C113425ff f311525c;

    public C112228cf(C86124t tVar, C113425ff ffVar, C112280dl dlVar, C112291dw dwVar) {
        super(dlVar, dwVar);
        this.f311524b = tVar;
        this.f311525c = ffVar;
    }

    /* renamed from: b */
    public final void mo99474b(C80012i iVar, C54827at atVar) {
        if (!this.f311524b.mo79746e(C90063do.f249373cM) || !this.f311525c.mo100143i()) {
            String str = iVar.f219562b;
            String substring = str.substring(0, Math.min(str.length(), 3));
            atVar.copyOnWrite();
            C54828au auVar = (C54828au) atVar.instance;
            C54828au auVar2 = C54828au.f143868g;
            substring.getClass();
            auVar.f143870a |= 1;
            auVar.f143871b = substring;
            return;
        }
        String str2 = iVar.f219562b;
        atVar.copyOnWrite();
        C54828au auVar3 = (C54828au) atVar.instance;
        C54828au auVar4 = C54828au.f143868g;
        str2.getClass();
        auVar3.f143870a |= 1;
        auVar3.f143871b = str2;
    }
}
