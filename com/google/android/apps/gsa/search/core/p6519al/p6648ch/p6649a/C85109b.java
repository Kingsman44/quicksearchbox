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

/* renamed from: com.google.android.apps.gsa.search.core.al.ch.a.b */
/* compiled from: PG */
public final class C85109b extends C86731k {

    /* renamed from: c */
    private final C89356b f230795c;

    /* renamed from: d */
    private final Query f230796d;

    /* renamed from: e */
    private final C89061q f230797e;

    /* renamed from: f */
    private final C119066v f230798f;

    /* renamed from: g */
    private final C58833ax f230799g;

    public C85109b(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        super("recognizer", "recognizer::createCarEmbeddedVoiceSearchFetcher", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_VOICE);
        this.f230795c = bVar;
        this.f230796d = query;
        this.f230797e = qVar;
        this.f230798f = vVar;
        this.f230799g = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85107a) obj).mo78714b(this.f230795c, this.f230796d, this.f230797e, this.f230798f, this.f230799g);
    }
}
