package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.core.HelpAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.common.base.C58833ax;
import com.google.p4152bb.p4153a.C54972bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.am */
/* compiled from: PG */
public final class C93446am extends C93503i {

    /* renamed from: d */
    public C93493bu f260811d;

    /* renamed from: e */
    private final boolean f260812e;

    public C93446am(C88512f fVar, boolean z, C58833ax axVar) {
        super(fVar, axVar);
        this.f260812e = z;
    }

    /* renamed from: k */
    public final void mo82048k() {
        C93493bu buVar = this.f260811d;
        C88509c cVar = this.f239227c;
        cVar.getClass();
        C93492bt btVar = (C93492bt) cVar;
        if (buVar.f260942b) {
            btVar.mo87759w(buVar.f260943c, buVar.f260944d);
            return;
        }
        buVar.f260941a = btVar;
        btVar.mo87758v(buVar.f260943c);
        buVar.f260945e = 0;
        buVar.mo87802b((C54972bc) buVar.f260946f.get(0));
    }

    /* renamed from: s */
    public final void mo82056s() {
        this.f260811d = new C93493bu((HelpAction) this.f239226b, this.f260812e);
        mo82055r();
    }
}
