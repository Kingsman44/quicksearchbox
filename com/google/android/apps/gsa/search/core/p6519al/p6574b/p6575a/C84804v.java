package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.v */
/* compiled from: PG */
public final class C84804v extends C86731k {

    /* renamed from: c */
    private final Query f230494c;

    /* renamed from: d */
    private final ActionData f230495d;

    /* renamed from: e */
    private final PlaybackStatus f230496e;

    /* renamed from: f */
    private final C86355a f230497f;

    /* renamed from: g */
    private final C86372a f230498g;

    public C84804v(Query query, ActionData actionData, PlaybackStatus playbackStatus, C86355a aVar, C86372a aVar2) {
        super("actions", "actions::processActionDataUsingSearchGraph", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230494c = query;
        this.f230495d = actionData;
        this.f230496e = playbackStatus;
        this.f230497f = aVar;
        this.f230498g = aVar2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78493l(this.f230494c, this.f230495d, this.f230496e, this.f230497f, this.f230498g);
    }
}
