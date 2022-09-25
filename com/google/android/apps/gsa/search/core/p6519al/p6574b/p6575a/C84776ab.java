package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.ab */
/* compiled from: PG */
public final class C84776ab extends C86731k {

    /* renamed from: c */
    private final ActionData f230405c;

    public C84776ab(ActionData actionData) {
        super("actions", "actions::sendActionDataToClient", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_VOICE);
        this.f230405c = actionData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78476D(this.f230405c);
        return C118826c.f331423b;
    }
}
