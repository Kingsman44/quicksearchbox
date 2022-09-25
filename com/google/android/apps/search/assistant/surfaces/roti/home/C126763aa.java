package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.aa */
/* compiled from: PG */
public final /* synthetic */ class C126763aa implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C126763aa f349099a = new C126763aa();

    private /* synthetic */ C126763aa() {
    }

    public final C60870cx apply(Object obj) {
        C59071e eVar = C126780ar.f349122a;
        C37341af a = C37341af.m66350a(((C37338ac) obj).f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        if (a == C37341af.ACQUIRED) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new C126845f());
    }
}
