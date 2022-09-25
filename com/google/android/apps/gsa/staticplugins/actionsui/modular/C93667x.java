package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.x */
/* compiled from: PG */
final class C93667x implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C93666w f261456a;

    /* renamed from: b */
    final /* synthetic */ C93524ab f261457b;

    public C93667x(C93524ab abVar, C93666w wVar) {
        this.f261457b = abVar;
        this.f261456a = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        Argument argument = this.f261456a.f261447m;
        boolean z = false;
        if (argument == null || argument.mo81264D()) {
            return false;
        }
        CardDecision ao = this.f261457b.f261158d.mo82039ao();
        if ((argument.mo81263C() && this.f261456a.mo87740ig() && !argument.mo81262B()) || (ao.mo81417a() == argument.f236140a && !ao.f236254h && ao.f236252f)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
