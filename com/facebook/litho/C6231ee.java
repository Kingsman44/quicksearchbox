package com.facebook.litho;

import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.Map;

/* renamed from: com.facebook.litho.ee */
/* compiled from: PG */
public final class C6231ee {
    /* renamed from: a */
    public static C6261fd m16500a(C6411u uVar, C21215m mVar, C6261fd fdVar) {
        return m16501b(mVar, uVar.mo13470f(), fdVar, uVar.f19016i);
    }

    /* renamed from: b */
    public static C6261fd m16501b(C21215m mVar, String str, C6261fd fdVar, C6381hf hfVar) {
        Map b;
        if (fdVar == null) {
            return null;
        }
        if (str == null) {
            C21215m.m39904c(fdVar);
            return null;
        }
        fdVar.mo13235a("log_tag", str);
        if (hfVar == null || (b = mVar.mo26270b(hfVar)) == null) {
            return fdVar;
        }
        for (Map.Entry entry : b.entrySet()) {
            fdVar.mo13235a((String) entry.getKey(), (String) entry.getValue());
        }
        return fdVar;
    }
}
