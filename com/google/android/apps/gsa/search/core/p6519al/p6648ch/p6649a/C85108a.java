package com.google.android.apps.gsa.search.core.p6519al.p6648ch.p6649a;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ch.a.a */
/* compiled from: PG */
public final class C85108a extends C86731k {

    /* renamed from: c */
    private final C89356b f230789c;

    /* renamed from: d */
    private final Query f230790d;

    /* renamed from: e */
    private final C89061q f230791e;

    /* renamed from: f */
    private final C85422c f230792f;

    /* renamed from: g */
    private final C119066v f230793g;

    /* renamed from: h */
    private final C58833ax f230794h;

    public C85108a(C89356b bVar, Query query, C89061q qVar, C85422c cVar, C119066v vVar, C58833ax axVar) {
        super("recognizer", "recognizer::createAnbuFetcherForVoiceSearch", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230789c = bVar;
        this.f230790d = query;
        this.f230791e = qVar;
        this.f230792f = cVar;
        this.f230793g = vVar;
        this.f230794h = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85107a) obj).mo78713a(this.f230789c, this.f230790d, this.f230791e, this.f230792f, this.f230793g, this.f230794h);
    }
}
