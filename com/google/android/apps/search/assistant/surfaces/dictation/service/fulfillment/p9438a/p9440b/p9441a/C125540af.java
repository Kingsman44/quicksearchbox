package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125662ao;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z;
import java.util.List;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.af */
/* compiled from: PG */
public final class C125540af {
    /* renamed from: a */
    public static final C125693z m205539a(String str, C69762k kVar) {
        String str2;
        String str3;
        C69759h c = kVar.mo61435c(str);
        List a = c != null ? c.mo61432a() : null;
        C125666as asVar = (a == null || (str3 = (String) a.get(1)) == null) ? null : (C125666as) C125548an.f346165h.get(str3);
        String obj = (a == null || (str2 = (String) a.get(2)) == null) ? null : C69764m.m101197q(str2).toString();
        if (asVar == null || obj == null) {
            return null;
        }
        return new C125662ao(asVar, obj);
    }
}
