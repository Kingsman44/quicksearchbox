package com.google.android.apps.gsa.staticplugins.search.session.p8719i;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6902k.C87350a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6902k.C87352c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116775hx;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58838bb;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.i.d */
/* compiled from: PG */
public final class C116557d implements C87352c {

    /* renamed from: a */
    public final C116775hx f323201a;

    /* renamed from: b */
    final Map f323202b;

    /* renamed from: c */
    public final C116766ho f323203c;

    /* renamed from: d */
    public boolean f323204d = false;

    /* renamed from: e */
    public C116556c f323205e;

    public C116557d(C116775hx hxVar, C116766ho hoVar) {
        this.f323201a = hxVar;
        this.f323203c = hoVar;
        this.f323202b = new HashMap();
    }

    /* renamed from: a */
    public final int mo81014a() {
        return this.f323201a.f323953f;
    }

    /* renamed from: b */
    public final Query mo81015b() {
        return this.f323201a.f323962o;
    }

    /* renamed from: c */
    public final Query mo81016c() {
        return this.f323201a.f323963p;
    }

    /* renamed from: d */
    public final void mo81017d() {
        this.f323201a.mo80591ar();
    }

    /* renamed from: e */
    public final void mo81018e(C23052c cVar, C87350a aVar) {
        if (this.f323202b.isEmpty()) {
            C58838bb.m90883r(this.f323205e == null);
            C116556c cVar2 = new C116556c(this);
            this.f323205e = cVar2;
            this.f323203c.mo80760l(cVar2);
        }
        if (!this.f323202b.containsKey(aVar)) {
            C116554a aVar2 = new C116554a(this, aVar);
            cVar.mo28427o(aVar2);
            this.f323202b.put(aVar, new C116555b(cVar, aVar2));
        }
    }

    /* renamed from: f */
    public final void mo81019f(Query query) {
        this.f323201a.f323962o = query;
    }

    /* renamed from: g */
    public final void mo81020g(Query query) {
        this.f323201a.f323963p = query;
    }

    /* renamed from: h */
    public final void mo81021h(boolean z) {
        this.f323201a.f323956i = z;
    }

    /* renamed from: i */
    public final void mo81022i(C88329xq xqVar) {
        C116775hx hxVar = this.f323201a;
        boolean z = false;
        if (hxVar.f323957j) {
            hxVar.f323957j = false;
            z = true;
        }
        if (xqVar.f238874f == 1 && !hxVar.f323961n) {
            hxVar.f323961n = true;
        } else if (!z) {
            return;
        }
        hxVar.mo80591ar();
    }

    /* renamed from: j */
    public final boolean mo81023j() {
        return this.f323201a.f323956i;
    }

    /* renamed from: k */
    public final boolean mo81024k() {
        return this.f323201a.f323958k;
    }

    /* renamed from: l */
    public final boolean mo81025l() {
        boolean z = this.f323204d;
        this.f323204d = false;
        return z;
    }

    /* renamed from: m */
    public final boolean mo81026m() {
        return this.f323201a.mo102936j();
    }
}
