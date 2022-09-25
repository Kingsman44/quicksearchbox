package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.c */
/* compiled from: PG */
public final class C84785c extends C86731k {

    /* renamed from: c */
    private final C89356b f230429c;

    /* renamed from: d */
    private final Query f230430d;

    /* renamed from: e */
    private final ActionData f230431e;

    /* renamed from: f */
    private final C58833ax f230432f;

    /* renamed from: g */
    private final PlaybackStatus f230433g;

    /* renamed from: h */
    private final C86355a f230434h;

    /* renamed from: i */
    private final C86372a f230435i;

    public C84785c(C89356b bVar, Query query, ActionData actionData, C58833ax axVar, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        super("actions", "actions::createActionGraphForSearchGraph", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT, C86724d.SEARCH_VOICE);
        this.f230429c = bVar;
        this.f230430d = query;
        this.f230431e = actionData;
        this.f230432f = axVar;
        this.f230433g = playbackStatus;
        this.f230434h = aVar;
        this.f230435i = aVar2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78484a(this.f230429c, this.f230430d, this.f230431e, this.f230432f, this.f230433g, this.f230434h, this.f230435i);
    }
}
