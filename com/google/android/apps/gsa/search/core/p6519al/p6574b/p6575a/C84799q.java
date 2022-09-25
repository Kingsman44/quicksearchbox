package com.google.android.apps.gsa.search.core.p6519al.p6574b.p6575a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.b.a.q */
/* compiled from: PG */
public final class C84799q extends C86731k {

    /* renamed from: c */
    private final ModularAction f230484c;

    /* renamed from: d */
    private final C84773a f230485d;

    public C84799q(ModularAction modularAction, C84773a aVar) {
        super("actions", "actions::logNonVisualTimerInteraction", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230484c = modularAction;
        this.f230485d = aVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84809b) obj).mo78504x(this.f230484c, this.f230485d);
        return C118826c.f331423b;
    }
}
