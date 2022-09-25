package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import com.google.assistant.p3781ad.p3789d.p3790a.C48556i;
import com.google.assistant.p3781ad.p3789d.p3790a.C48557j;
import com.google.assistant.p3781ad.p3789d.p3790a.C48558k;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.g */
/* compiled from: PG */
public final /* synthetic */ class C111856g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C111856g f310840a = new C111856g();

    private /* synthetic */ C111856g() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C48557j jVar = (C48557j) C48558k.f125445c.createBuilder();
        C48556i iVar = (C48556i) optional.get();
        jVar.copyOnWrite();
        C48558k kVar = (C48558k) jVar.instance;
        iVar.getClass();
        kVar.f125448b = iVar;
        kVar.f125447a = 2;
        return Optional.m71637of((C48558k) jVar.build());
    }
}
