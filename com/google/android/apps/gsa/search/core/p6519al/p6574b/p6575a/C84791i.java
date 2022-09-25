package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.i */
/* compiled from: PG */
public final class C84791i extends C86731k {

    /* renamed from: c */
    private final ModularAction f230459c;

    /* renamed from: d */
    private final List f230460d;

    public C84791i(ModularAction modularAction, List list) {
        super("actions", "actions::getResolvedAlternateExecutionInfos", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230459c = modularAction;
        this.f230460d = list;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84809b) obj).mo78489h(this.f230459c, this.f230460d);
    }
}
