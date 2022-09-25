package com.google.android.apps.search.pronunciationlearning.p10628a;

import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.common.base.C58894dd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.pronunciationlearning.a.g */
/* compiled from: PG */
public final /* synthetic */ class C141300g implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C141300g f383606a = new C141300g();

    private /* synthetic */ C141300g() {
    }

    public final C60870cx apply(Object obj) {
        C37346ak akVar = C141305l.f383614a;
        C37341af a = C37341af.m66350a(((C37338ac) obj).f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        if (a == C37341af.ACQUIRED) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new C58894dd("failed to acquire Audio Focus"));
    }
}
