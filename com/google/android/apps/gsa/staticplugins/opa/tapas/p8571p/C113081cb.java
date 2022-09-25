package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.cb */
/* compiled from: PG */
public final /* synthetic */ class C113081cb implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C113083cd f313317a;

    public /* synthetic */ C113081cb(C113083cd cdVar) {
        this.f313317a = cdVar;
    }

    public final Object get() {
        Optional o = this.f313317a.f313322c.mo99544o();
        if (o.isEmpty()) {
            C59104x d = C113083cd.f313321b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasUserProfileFeature");
            ((C59052c) ((C59052c) d).mo56372aa(27940)).mo56386p("Profile signal is not available");
            return Optional.empty();
        }
        HashMap hashMap = new HashMap();
        for (C48716bx bxVar : ((C48718bz) o.get()).f126053a) {
            if (Thread.interrupted()) {
                return Optional.empty();
            }
            String lowerCase = bxVar.f126047c.toLowerCase(Locale.getDefault());
            if (!lowerCase.isEmpty()) {
                int i = 0;
                while (i < lowerCase.length()) {
                    i++;
                    hashMap.put(lowerCase.substring(0, i), Integer.valueOf(((Integer) Map.EL.getOrDefault(hashMap, lowerCase.substring(0, i), 0)).intValue() + 1));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(0, ((String) entry.getKey()).length() - 1);
            if (((C113082cc) Map.EL.getOrDefault(hashMap2, substring, new C113082cc())).f313319b.intValue() < ((Integer) entry.getValue()).intValue()) {
                C113082cc ccVar = new C113082cc();
                ccVar.f313318a = (String) entry.getKey();
                ccVar.f313319b = (Integer) entry.getValue();
                hashMap2.put(substring, ccVar);
            }
        }
        return Optional.m71637of(hashMap2);
    }
}
