package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113082cc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113083cd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ar */
/* compiled from: PG */
public final class C111906ar implements C111917k {

    /* renamed from: a */
    private final C113083cd f310937a;

    public C111906ar(C113083cd cdVar) {
        this.f310937a = cdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58485gu mo99294a(C113408es esVar) {
        return C58485gu.m89845m();
    }

    /* renamed from: b */
    public final C58485gu mo99295b(String str) {
        Optional optional;
        C113083cd cdVar = this.f310937a;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        C60870cx cxVar = cdVar.f313336q;
        if (cxVar == null) {
            cdVar.mo99840e();
            optional = Optional.empty();
        } else if (!cxVar.isDone()) {
            optional = Optional.empty();
        } else {
            try {
                Optional optional2 = (Optional) C60856cj.m92909r(cdVar.f313336q);
                if (optional2 != null) {
                    if (!optional2.isEmpty()) {
                        String str2 = ((C113082cc) Map.EL.getOrDefault((java.util.Map) optional2.get(), lowerCase.toLowerCase(Locale.getDefault()), new C113082cc())).f313318a;
                        optional = str2.isEmpty() ? Optional.empty() : Optional.m71637of(str2);
                    }
                }
                cdVar.mo99840e();
                optional = Optional.empty();
            } catch (ExecutionException e) {
                cdVar.mo99840e();
                C59104x d = C113083cd.f313321b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasUserProfileFeature");
                C59052c cVar = (C59052c) d;
                cVar.mo56378ag(C58975e.f156826a, "TapasUserProfileFeaturesExtractor");
                ((C59052c) cVar.mo56372aa(27941)).mo56389s("Exception in predictNextPrefix: %s", e.getMessage());
                optional = Optional.empty();
            }
        }
        if (optional.isPresent()) {
            return C58485gu.m89846n((String) optional.get());
        }
        return C58485gu.m89845m();
    }

    /* renamed from: c */
    public final String mo99296c() {
        return BuildConfig.FLAVOR;
    }
}
