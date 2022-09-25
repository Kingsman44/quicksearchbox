package com.google.android.apps.gsa.search.core.p6519al.p6648ch.p6649a;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ch.a.h */
/* compiled from: PG */
public final class C85115h extends C86731k {

    /* renamed from: c */
    private final C89356b f230825c;

    /* renamed from: d */
    private final Query f230826d;

    /* renamed from: e */
    private final C85422c f230827e;

    /* renamed from: f */
    private final C119066v f230828f;

    /* renamed from: g */
    private final C58833ax f230829g;

    public C85115h(C89356b bVar, Query query, C85422c cVar, C119066v vVar, C58833ax axVar) {
        super("recognizer", "recognizer::createHybridOrEmbeddedVoiceSearchFetcher", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230825c = bVar;
        this.f230826d = query;
        this.f230827e = cVar;
        this.f230828f = vVar;
        this.f230829g = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85107a) obj).mo78720h(this.f230825c, this.f230826d, this.f230827e, this.f230828f, this.f230829g);
    }
}
