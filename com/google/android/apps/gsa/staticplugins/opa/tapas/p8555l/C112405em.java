package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113045at;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113083cd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113101n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48588ad;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.em */
/* compiled from: PG */
public final /* synthetic */ class C112405em implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311868a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f311869b;

    /* renamed from: c */
    public final /* synthetic */ String f311870c;

    /* renamed from: d */
    public final /* synthetic */ C113083cd f311871d;

    public /* synthetic */ C112405em(C112435fh fhVar, C58485gu guVar, String str, C113083cd cdVar) {
        this.f311868a = fhVar;
        this.f311869b = guVar;
        this.f311870c = str;
        this.f311871d = cdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional;
        C112435fh fhVar = this.f311868a;
        C58485gu guVar = this.f311869b;
        String str = this.f311870c;
        C113083cd cdVar = this.f311871d;
        C48588ad adVar = (C48588ad) obj;
        if ((adVar.f125580a & 4) != 0) {
            C113101n nVar = adVar.f125586g;
            if (nVar == null) {
                nVar = C113101n.f313365l;
            }
            optional = Optional.m71637of(C113045at.m187027a(str, nVar.f313368b));
        } else {
            optional = Optional.empty();
        }
        Optional optional2 = optional;
        int size = guVar.size();
        C112434fg fgVar = new C112434fg(size);
        return C60856cj.m92894c((C58485gu) IntStream.CC.range(0, 2).mapToObj(new C112400eh(fhVar, new C112399eg(fhVar, adVar, size, fgVar, guVar, optional2, cdVar))).collect(C58370cn.f155946a)).mo57334a(new C112401ei(fgVar), C60826bg.f164896a);
    }
}
