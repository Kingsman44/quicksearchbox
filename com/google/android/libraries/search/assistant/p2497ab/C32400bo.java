package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.base.C58890d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.ab.bo */
/* compiled from: PG */
public final /* synthetic */ class C32400bo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32407bv f86850a;

    public /* synthetic */ C32400bo(C32407bv bvVar) {
        this.f86850a = bvVar;
    }

    public final C60870cx apply(Object obj) {
        C32407bv bvVar = this.f86850a;
        String str = (String) obj;
        if (str != null) {
            String c = C58890d.m90988c(str);
            if (c.endsWith("@gmail.com") || c.endsWith("@google.com")) {
                return bvVar.f86859c.mo38053b(str);
            }
        }
        return C60856cj.m92900i(C32376ar.f86796d);
    }
}
