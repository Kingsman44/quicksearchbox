package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.Context;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18714f;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.LinkedHashSet;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.r */
/* compiled from: PG */
public final /* synthetic */ class C18744r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18727ah f52849a;

    /* renamed from: b */
    public final /* synthetic */ C18718c f52850b;

    public /* synthetic */ C18744r(C18727ah ahVar, C18718c cVar) {
        this.f52849a = ahVar;
        this.f52850b = cVar;
    }

    public final C60870cx apply(Object obj) {
        C18727ah ahVar = this.f52849a;
        C18718c cVar = this.f52850b;
        Context context = ahVar.f52808b;
        LinkedHashSet linkedHashSet = new LinkedHashSet((LinkedHashSet) obj);
        if (Collection.EL.stream(linkedHashSet).noneMatch(C18751y.f52857a)) {
            return C60856cj.m92900i(Optional.m71637of(linkedHashSet));
        }
        C47633f i = C47633f.m84733g(cVar.mo24114a(C18717i.f52795a)).mo51516i(new C18752z(ahVar, context), ahVar.f52811e);
        C60870cx a = cVar.mo24114a(C18714f.f52792b);
        return C47636i.m84744c(i, a).mo51518a(new C18720aa(i, a, linkedHashSet), ahVar.f52811e);
    }
}
