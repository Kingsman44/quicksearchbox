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

/* renamed from: com.google.android.apps.gsa.search.core.al.ch.a.j */
/* compiled from: PG */
public final class C85117j extends C86731k {

    /* renamed from: c */
    private final C89356b f230835c;

    /* renamed from: d */
    private final Query f230836d;

    /* renamed from: e */
    private final C89061q f230837e;

    /* renamed from: f */
    private final C119066v f230838f;

    /* renamed from: g */
    private final C58833ax f230839g;

    public C85117j(C89356b bVar, Query query, C89061q qVar, C119066v vVar, C58833ax axVar) {
        super("recognizer", "recognizer::createPushToTalkVoiceSearchFetcher", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230835c = bVar;
        this.f230836d = query;
        this.f230837e = qVar;
        this.f230838f = vVar;
        this.f230839g = axVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85107a) obj).mo78722j(this.f230835c, this.f230836d, this.f230837e, this.f230838f, this.f230839g);
    }
}
