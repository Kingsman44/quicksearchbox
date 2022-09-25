package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.de */
/* compiled from: PG */
public final /* synthetic */ class C28988de implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78703a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78704b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f78705c;

    /* renamed from: d */
    public final /* synthetic */ C29398ev f78706d;

    /* renamed from: e */
    public final /* synthetic */ C29380ed f78707e;

    /* renamed from: f */
    public final /* synthetic */ C29334dr f78708f;

    public /* synthetic */ C28988de(C29117fe feVar, C29392ep epVar, C29328dl dlVar, C29398ev evVar, C29380ed edVar, C29334dr drVar) {
        this.f78703a = feVar;
        this.f78704b = epVar;
        this.f78705c = dlVar;
        this.f78706d = evVar;
        this.f78707e = edVar;
        this.f78708f = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78703a;
        C29392ep epVar = this.f78704b;
        C29328dl dlVar = this.f78705c;
        C29398ev evVar = this.f78706d;
        C29380ed edVar = this.f78707e;
        C29334dr drVar = this.f78708f;
        Void voidR = (Void) obj;
        try {
            C60870cx g = feVar.f78976e.mo34643g(epVar, dlVar, evVar, edVar, drVar.f79513o, drVar.f79514p);
            C29083ex exVar = new C29083ex(feVar, drVar, dlVar, evVar);
            return C60922j.m93045h(g, C47810es.m84966f(exVar), feVar.f78980i);
        } catch (RuntimeException e) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.UNKNOWN_ERROR;
            bnVar.f78064c = e;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
    }
}
