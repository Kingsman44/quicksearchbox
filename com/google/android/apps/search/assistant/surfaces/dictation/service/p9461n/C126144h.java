package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.h */
/* compiled from: PG */
public final /* synthetic */ class C126144h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126150n f347599a;

    /* renamed from: b */
    public final /* synthetic */ C119299u f347600b;

    public /* synthetic */ C126144h(C126150n nVar, C119299u uVar) {
        this.f347599a = nVar;
        this.f347600b = uVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C126150n nVar = this.f347599a;
        C119299u uVar = this.f347600b;
        C58485gu guVar = (C58485gu) obj;
        String str = (String) C126054bs.m206109f(guVar).orElse(BuildConfig.FLAVOR);
        boolean i = C126054bs.m206110i(guVar);
        C60870cx i2 = C60856cj.m92900i(C58485gu.m89845m());
        if (str.isEmpty()) {
            C126038bc bcVar = nVar.f347612b;
            C125931t a = bcVar.f347357c.mo107202a();
            C58485gu guVar2 = (C58485gu) bcVar.f347377w.get();
            if (guVar2.size() < 2 || !Collection.EL.stream(guVar2).limit(2).allMatch(C125964av.f347184a)) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                C60870cx b = C126038bc.m206090b(bcVar.f347373s);
                C125967ay ayVar = new C125967ay(bcVar, a);
                cxVar = C60922j.m93044g(b, C47810es.m84963c(ayVar), C60826bg.f164896a);
            }
            C126147k kVar = new C126147k(nVar, guVar);
            i2 = C60922j.m93045h(cxVar, C47810es.m84966f(kVar), C60826bg.f164896a);
        }
        C126148l lVar = new C126148l(nVar, guVar, str, i, uVar);
        return C60922j.m93044g(i2, C47810es.m84963c(lVar), C60826bg.f164896a);
    }
}
