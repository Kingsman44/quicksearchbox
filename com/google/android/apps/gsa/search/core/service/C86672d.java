package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.C87678af;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.search.core.service.d */
/* compiled from: PG */
public final /* synthetic */ class C86672d implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C86672d f234148a = new C86672d();

    private /* synthetic */ C86672d() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C58528ij ijVar = C87678af.f237025a;
        C87739bu a = C87739bu.m142761a(((ClientEventData) obj).f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        return !ijVar.contains(a);
    }
}
