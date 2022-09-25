package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.u */
/* compiled from: PG */
public final /* synthetic */ class C113108u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113110w f313385a;

    public /* synthetic */ C113108u(C113110w wVar) {
        this.f313385a = wVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C113110w wVar = this.f313385a;
        if (!((Boolean) obj).booleanValue()) {
            C113110w.f313387a.mo105240i("gemini_user_profile_not_available_apr_bit");
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            long b = wVar.f313391e.mo26870b();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return C60856cj.m92900i((C48635bx) bvVar.build());
        }
        C22871g gVar = wVar.f313390d;
        String F = wVar.f313393g.mo79659F();
        if (F == null) {
            C113110w.f313387a.mo105240i("gemini_user_profile_not_available_not_signed_in");
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            cxVar = wVar.f313392f.a(F, C113110w.f313388b, (String) null, C63662ac.f172144a, C48716bx.f126043g);
        }
        return gVar.mo28209i(cxVar, "build GeminiUserProfileSignal", new C113109v(wVar));
    }
}
