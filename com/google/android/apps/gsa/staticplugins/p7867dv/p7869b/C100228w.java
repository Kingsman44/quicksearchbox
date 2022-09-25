package com.google.android.apps.gsa.staticplugins.p7867dv.p7869b;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6902k.C87350a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.b.w */
/* compiled from: PG */
final class C100228w implements C87350a {

    /* renamed from: a */
    int f280282a;

    /* renamed from: b */
    final /* synthetic */ C100231z f280283b;

    public C100228w(C100231z zVar) {
        this.f280283b = zVar;
    }

    /* renamed from: a */
    public final void mo81011a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f280283b.f280291e.mo81014a() != 7) {
            C100231z zVar = this.f280283b;
            if (zVar.f280295i == zVar.f280292f.mo80947a()) {
                if (this.f280283b.f280291e.mo81026m()) {
                    this.f280283b.f280291e.mo81021h(true);
                    this.f280283b.f280291e.mo81019f((Query) null);
                    C90875ai.m148465b(new C100226u(this), this.f280283b.f280290d.mo78769j(), this.f280283b.f280293g, "SuggestController.fetchSuggestionsAfterSessionStart").mo85223a(C100227v.f280281a);
                } else if (!this.f280283b.f280291e.mo81023j()) {
                    mo91808c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo81012b() {
        this.f280283b.mo91821r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo91808c() {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f280283b.f280296j) {
            if (!this.f280283b.f280299m.isEmpty() && !this.f280283b.mo91821r()) {
                Iterator it = this.f280283b.f280299m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C22869e eVar = (C22869e) it.next();
                    if (!this.f280283b.f280291e.mo81024k()) {
                        break;
                    }
                    this.f280283b.f280293g.mo28212l(eVar.toString(), eVar);
                }
                this.f280283b.f280299m.clear();
            }
        }
        int a = this.f280283b.f280291e.mo81014a();
        this.f280282a = a;
        if (a == 1 || a == 2 || a == 4) {
            this.f280283b.f280290d.mo78760B();
        }
        Query a2 = this.f280283b.f280289c.mo81002a();
        if (a2.mo84397cd()) {
            this.f280283b.f280291e.mo81020g((Query) null);
        }
        Query b = this.f280283b.f280291e.mo81015b();
        if (!(a2 == null || (i = this.f280282a) == 0 || i == 4 || ((TextUtils.isEmpty(a2.mo84352bk()) && this.f280283b.f280289c.mo81003b().mo84393cZ()) || (b != null && Query.m147223bv(a2, b))))) {
            C100231z zVar = this.f280283b;
            zVar.f280290d.mo78761C(a2, this.f280282a, zVar.f280289c.mo81003b(), this.f280283b.f280291e.mo81016c(), this.f280283b.f280297k);
            this.f280283b.f280291e.mo81019f(a2);
        }
        if (!a2.mo84382cO()) {
            this.f280283b.f280291e.mo81020g(a2);
        }
    }
}
