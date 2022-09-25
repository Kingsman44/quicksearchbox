package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.af */
/* compiled from: PG */
public final class C84780af extends C86731k {

    /* renamed from: c */
    private final ActionData f230410c;

    /* renamed from: d */
    private final int f230411d;

    /* renamed from: e */
    private final int f230412e;

    /* renamed from: f */
    private final boolean f230413f;

    /* renamed from: g */
    private final boolean f230414g;

    /* renamed from: h */
    private final C87541c f230415h;

    public C84780af(ActionData actionData, int i, int i2, boolean z, boolean z2, C87541c cVar) {
        super("actions", "actions::updateActionsErrors", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230410c = actionData;
        this.f230411d = i;
        this.f230412e = i2;
        this.f230413f = z;
        this.f230414g = z2;
        this.f230415h = cVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78496p(this.f230410c, this.f230411d, this.f230412e, this.f230413f, this.f230414g, this.f230415h);
    }
}
