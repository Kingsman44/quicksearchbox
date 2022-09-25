package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C107016e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C107017f;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cf */
/* compiled from: PG */
public final /* synthetic */ class C106925cf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297847a;

    public /* synthetic */ C106925cf(C106941cv cvVar) {
        this.f297847a = cvVar;
    }

    public final Object apply(Object obj) {
        C106941cv cvVar = this.f297847a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || cvVar.f297878f.mo77081e()) {
            return C107017f.m177726d().mo95685a();
        }
        cvVar.f297878f.mo77077a("8/9: Suggestions created and bypassing content store.");
        C107016e d = C107017f.m177726d();
        d.mo95687c(Optional.m71637of((C50819dp) optional.get()));
        return d.mo95685a();
    }
}
