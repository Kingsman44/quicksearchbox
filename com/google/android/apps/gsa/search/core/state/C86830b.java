package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.b */
/* compiled from: PG */
public final /* synthetic */ class C86830b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87171z f234519a;

    /* renamed from: b */
    public final /* synthetic */ Argument f234520b;

    public /* synthetic */ C86830b(C87171z zVar, Argument argument) {
        this.f234519a = zVar;
        this.f234520b = argument;
    }

    public final void run() {
        C87171z zVar = this.f234519a;
        Argument argument = this.f234520b;
        if (zVar.f235552g.mo85049c(4194304, 0)) {
            zVar.mo80802aj(true);
        }
        if (!argument.mo81265E()) {
            zVar.mo80819s();
        }
    }
}
