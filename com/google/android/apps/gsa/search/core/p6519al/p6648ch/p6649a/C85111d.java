package com.google.android.apps.gsa.search.core.p6519al.p6648ch.p6649a;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ch.a.d */
/* compiled from: PG */
public final class C85111d extends C86731k {

    /* renamed from: c */
    private final C89356b f230805c;

    /* renamed from: d */
    private final Query f230806d;

    /* renamed from: e */
    private final C89061q f230807e;

    /* renamed from: f */
    private final C119066v f230808f;

    /* renamed from: g */
    private final C58833ax f230809g;

    public C85111d(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        super("recognizer", "recognizer::createCarNetworkVoiceSearchFetcher", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f230805c = bVar;
        this.f230806d = query;
        this.f230807e = qVar;
        this.f230808f = vVar;
        this.f230809g = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85107a) obj).mo78716d(this.f230805c, this.f230806d, this.f230807e, this.f230808f, this.f230809g);
    }
}
