package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.libraries.assistant.pcp.p1573k.C18940t;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.t.h.ah */
/* compiled from: PG */
public final /* synthetic */ class C118388ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328617a;

    public /* synthetic */ C118388ah(C118426bs bsVar) {
        this.f328617a = bsVar;
    }

    public final C60870cx apply(Object obj) {
        C118426bs bsVar = this.f328617a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        Stream flatMap = Collection.EL.stream(((C118365g) axVar.mo56107c()).f328544a).filter(C118404ax.f328641a).flatMap(C118405ay.f328642a).filter(C118406az.f328643a).flatMap(C118408ba.f328646a);
        C18940t tVar = bsVar.f328691l;
        Objects.requireNonNull(tVar);
        return (C60870cx) flatMap.filter(new C118409bb(tVar)).map(C118410bc.f328648a).filter(C118411bd.f328649a).findFirst().map(new C118412be(bsVar)).orElse(C60866ct.f164955a);
    }
}
