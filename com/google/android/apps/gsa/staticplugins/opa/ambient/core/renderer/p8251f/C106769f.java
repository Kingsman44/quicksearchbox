package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.f.f */
/* compiled from: PG */
public final /* synthetic */ class C106769f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C50701am f297542a;

    public /* synthetic */ C106769f(C50701am amVar) {
        this.f297542a = amVar;
    }

    public final Object apply(Object obj) {
        C50701am amVar = this.f297542a;
        List list = (List) obj;
        Optional findFirst = Collection.EL.stream(list).filter(new C106764a(amVar)).findFirst();
        if (!findFirst.isPresent()) {
            return Collection.EL.stream(list).filter(C106765b.f297538a).flatMap(C106766c.f297539a).filter(new C106767d(amVar)).map(C106768e.f297541a).findFirst();
        }
        C50706ar arVar = ((C50738bc) findFirst.get()).f132044k;
        if (arVar == null) {
            arVar = C50706ar.f131960a;
        }
        return Optional.m71637of(arVar);
    }
}
