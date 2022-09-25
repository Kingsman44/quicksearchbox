package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.C125522a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.d */
/* compiled from: PG */
public final /* synthetic */ class C125710d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125750o f346483a;

    /* renamed from: b */
    public final /* synthetic */ String f346484b;

    /* renamed from: c */
    public final /* synthetic */ C125708c f346485c;

    /* renamed from: d */
    public final /* synthetic */ boolean f346486d;

    public /* synthetic */ C125710d(C125750o oVar, String str, C125708c cVar, boolean z) {
        this.f346483a = oVar;
        this.f346484b = str;
        this.f346485c = cVar;
        this.f346486d = z;
    }

    public final C60870cx apply(Object obj) {
        C125750o oVar = this.f346483a;
        String str = this.f346484b;
        C125708c cVar = this.f346485c;
        boolean z = this.f346486d;
        C125751p pVar = (C125751p) obj;
        if (!pVar.f346564b.isEmpty()) {
            return C60856cj.m92900i(Optional.m71637of(pVar));
        }
        C125522a aVar = oVar.f346558d;
        Objects.requireNonNull(aVar);
        C125742g gVar = new C125742g(aVar);
        C125702i iVar = oVar.f346559e;
        Objects.requireNonNull(iVar);
        C60870cx b = oVar.mo107102b(str, cVar, gVar, new C125743h(iVar));
        C125744i iVar2 = new C125744i(oVar, z, cVar);
        return C60922j.m93045h(b, C47810es.m84966f(iVar2), oVar.f346557c);
    }
}
