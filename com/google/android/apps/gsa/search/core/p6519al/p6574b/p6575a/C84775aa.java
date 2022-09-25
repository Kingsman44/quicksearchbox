package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.aa */
/* compiled from: PG */
public final class C84775aa extends C86731k {

    /* renamed from: c */
    private final PersonDisambiguation f230403c;

    /* renamed from: d */
    private final Query f230404d;

    public C84775aa(PersonDisambiguation personDisambiguation, Query query) {
        super("actions", "actions::saveRelationship", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230403c = personDisambiguation;
        this.f230404d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78475C(this.f230403c, this.f230404d);
        return C118826c.f331423b;
    }
}
