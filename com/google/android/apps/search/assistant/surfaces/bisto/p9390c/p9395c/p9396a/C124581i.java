package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C124581i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343683a;

    /* renamed from: b */
    public final /* synthetic */ String f343684b;

    /* renamed from: c */
    public final /* synthetic */ C124570ap f343685c;

    public /* synthetic */ C124581i(C124571aq aqVar, String str, C124570ap apVar) {
        this.f343683a = aqVar;
        this.f343684b = str;
        this.f343685c = apVar;
    }

    public final Object apply(Object obj) {
        C124571aq aqVar = this.f343683a;
        String str = this.f343684b;
        C124570ap apVar = this.f343685c;
        Optional optional = (Optional) obj;
        C58838bb.m90884s(optional.isPresent(), "Can not generate client instance id");
        aqVar.f343669k.mo106447c(str, apVar.mo106534a().mo106513k(), apVar.mo106535b(), (String) optional.get());
        return apVar;
    }
}
