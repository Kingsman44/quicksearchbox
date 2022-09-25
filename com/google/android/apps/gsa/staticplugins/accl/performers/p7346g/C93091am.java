package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.am */
/* compiled from: PG */
final class C93091am extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C0320v f259682a;

    /* renamed from: b */
    final /* synthetic */ C0310l f259683b;

    /* renamed from: c */
    final /* synthetic */ C93094ap f259684c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93091am(C93094ap apVar, C0320v vVar, C0310l lVar) {
        super("Unregsiter media controller callback once max duration is reached", 2, 0);
        this.f259684c = apVar;
        this.f259682a = vVar;
        this.f259683b = lVar;
    }

    public final void run() {
        this.f259684c.f259697g.mo19974a(C37176a.f97219hS.mo40805c(C62722b.OK));
        C87594r rVar = (C87594r) this.f259684c.f259694d.mo27525b();
        this.f259682a.mo1041i(this.f259683b);
    }
}
