package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C124463bf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124477bt f343485a;

    public /* synthetic */ C124463bf(C124477bt btVar) {
        this.f343485a = btVar;
    }

    public final C60870cx apply(Object obj) {
        C124441al alVar;
        C124477bt btVar = this.f343485a;
        C124459bb bbVar = (C124459bb) obj;
        if (bbVar.f343472b == 1) {
            return C60866ct.f164955a;
        }
        String name = btVar.name();
        if (bbVar.f343472b == 2) {
            alVar = (C124441al) bbVar.f343473c;
        } else {
            alVar = C124441al.f343439b;
        }
        String str = alVar.f343441a;
        return C60856cj.m92899h(new AssertionError("Failed to perform request of type " + name + " with error " + str));
    }
}
