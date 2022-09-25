package com.google.android.apps.gsa.search.core.p6519al.p6723dr.p6724a;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85414a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dr.a.b */
/* compiled from: PG */
public final class C85416b extends C86731k {

    /* renamed from: c */
    private final Query f231215c;

    /* renamed from: d */
    private final C89356b f231216d;

    /* renamed from: e */
    private final C119066v f231217e;

    /* renamed from: f */
    private final C58833ax f231218f;

    public C85416b(Query query, C89356b bVar, C119066v vVar, C58833ax axVar) {
        super("voicesearchfetcher", "voicesearchfetcher::createVoiceSearchFetcher", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231215c = query;
        this.f231216d = bVar;
        this.f231217e = vVar;
        this.f231218f = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85414a) obj).mo78927a(this.f231215c, this.f231216d, this.f231217e, this.f231218f);
    }
}
