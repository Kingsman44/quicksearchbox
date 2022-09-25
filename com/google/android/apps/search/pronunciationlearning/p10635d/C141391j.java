package com.google.android.apps.search.pronunciationlearning.p10635d;

import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.common.base.C58894dd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.j */
/* compiled from: PG */
public final /* synthetic */ class C141391j implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C141391j f383812a = new C141391j();

    private /* synthetic */ C141391j() {
    }

    public final C60870cx apply(Object obj) {
        C37346ak akVar = C141399r.f383822a;
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
