package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C106436ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106447am f296889a;

    public /* synthetic */ C106436ab(C106447am amVar) {
        this.f296889a = amVar;
    }

    public final Object apply(Object obj) {
        C106447am amVar = this.f296889a;
        C58485gu guVar = (C58485gu) obj;
        boolean z = false;
        if (guVar.isEmpty()) {
            guVar = (C58485gu) Collection.EL.stream(amVar.f296914f.mo79745c(C90017bw.f248033j)).map(C106481v.f296971a).collect(C58370cn.f155946a);
            if (!guVar.isEmpty()) {
                z = true;
            }
        }
        return new C106457aw(guVar, Boolean.valueOf(z));
    }
}
