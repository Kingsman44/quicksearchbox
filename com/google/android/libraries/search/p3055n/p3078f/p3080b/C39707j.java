package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import com.google.android.libraries.search.p3055n.C39665cs;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.p3058b.p3060b.C39280aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66950fm;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66722az;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.n.f.b.j */
/* compiled from: PG */
public final /* synthetic */ class C39707j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39711n f104486a;

    /* renamed from: b */
    public final /* synthetic */ C66950fm f104487b;

    public /* synthetic */ C39707j(C39711n nVar, C66950fm fmVar) {
        this.f104486a = nVar;
        this.f104487b = fmVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C39711n nVar = this.f104486a;
        C66950fm fmVar = this.f104487b;
        Void voidR = (Void) obj;
        C66722az b = nVar.mo41997b(fmVar);
        C66716at atVar = nVar.f104501j.f181497c;
        if (atVar == null) {
            atVar = C66716at.f181484b;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(atVar.f181486a);
        C66716at atVar2 = b.f181497c;
        if (atVar2 == null) {
            atVar2 = C66716at.f181484b;
        }
        if (!unmodifiableMap.equals(Collections.unmodifiableMap(atVar2.f181486a))) {
            nVar.f104501j = b;
            try {
                C39665cs csVar = (C39665cs) C39666ct.f104415e.createBuilder();
                csVar.copyOnWrite();
                C39666ct ctVar = (C39666ct) csVar.instance;
                b.getClass();
                ctVar.f104420c = b;
                ctVar.f104419b = 1;
                cxVar = ((C39280aa) nVar.f104497f.get()).mo41760f((C39666ct) csVar.build());
            } catch (NullPointerException unused) {
                cxVar = C60866ct.f164955a;
            }
        } else {
            cxVar = C60866ct.f164955a;
        }
        C39703f fVar = new C39703f(nVar, fmVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(fVar), nVar.f104494c);
    }
}
