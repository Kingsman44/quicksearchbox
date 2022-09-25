package com.google.android.apps.gsa.search.core.p6519al.p6737i.p6738a;

import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.i.a.c */
/* compiled from: PG */
public final class C85497c extends C86731k {

    /* renamed from: c */
    private final Query f231342c;

    /* renamed from: d */
    private final C89356b f231343d;

    public C85497c(Query query, C89356b bVar) {
        super("assistantrequest", "assistantrequest::buildAssistantRequestForVoiceSearch", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f231342c = query;
        this.f231343d = bVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85494a) obj).mo79018c(this.f231342c, this.f231343d);
    }
}
