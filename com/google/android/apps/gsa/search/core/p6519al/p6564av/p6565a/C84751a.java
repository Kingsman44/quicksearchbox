package com.google.android.apps.gsa.search.core.p6519al.p6564av.p6565a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6564av.C84750a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.av.a.a */
/* compiled from: PG */
public final class C84751a extends C86731k {

    /* renamed from: c */
    private final Suggestion f230383c;

    public C84751a(Suggestion suggestion) {
        super("icing", "icing::cacheSuggestionInIcing", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230383c = suggestion;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84750a) obj).mo78460a(this.f230383c);
        return C118826c.f331423b;
    }
}
