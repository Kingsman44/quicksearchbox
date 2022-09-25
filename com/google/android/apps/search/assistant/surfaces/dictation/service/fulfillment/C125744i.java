package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b.C125706b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b.C125707c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.i */
/* compiled from: PG */
public final /* synthetic */ class C125744i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125750o f346545a;

    /* renamed from: b */
    public final /* synthetic */ boolean f346546b;

    /* renamed from: c */
    public final /* synthetic */ C125708c f346547c;

    public /* synthetic */ C125744i(C125750o oVar, boolean z, C125708c cVar) {
        this.f346545a = oVar;
        this.f346546b = z;
        this.f346547c = cVar;
    }

    public final C60870cx apply(Object obj) {
        C125750o oVar = this.f346545a;
        boolean z = this.f346546b;
        C125708c cVar = this.f346547c;
        List list = (List) obj;
        if (!list.isEmpty()) {
            return C60856cj.m92900i(Optional.m71637of(new C125751p(C125034a.TRIGGER_VOICE, list, C125752q.f346566a)));
        }
        if (!z) {
            return C60856cj.m92900i(Optional.empty());
        }
        C125707c cVar2 = oVar.f346555a;
        C60870cx e = C71663i.m104692e(cVar2.f346475b, (C71424ay) null, new C125706b(cVar2, cVar, (C69577g) null), 3);
        C125741f fVar = C125741f.f346542a;
        return C60922j.m93045h(e, C47810es.m84966f(fVar), oVar.f346557c);
    }
}
