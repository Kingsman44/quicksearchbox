package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51482ji;
import com.google.assistant.p3897e.p3917i.p3918a.C51484jk;
import com.google.assistant.p3897e.p3917i.p3918a.C51485jl;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ay */
/* compiled from: PG */
public final class C102564ay implements C85812bd {

    /* renamed from: a */
    private final C58833ax f286255a;

    /* renamed from: b */
    private final C68214a f286256b;

    public C102564ay(C58833ax axVar, C68214a aVar) {
        this.f286255a = axVar;
        this.f286256b = aVar;
    }

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        C58833ax axVar;
        if (!((C86124t) this.f286256b.mo27525b()).mo79746e(C90014bt.f247444hK) || !this.f286255a.mo56113h() || !((C74713bn) this.f286255a.mo56107c()).mo71078c()) {
            axVar = C58836b.f156633a;
        } else {
            C51482ji jiVar = (C51482ji) C51485jl.f134149c.createBuilder();
            C51484jk jkVar = C51484jk.NGA;
            jiVar.copyOnWrite();
            C51485jl jlVar = (C51485jl) jiVar.instance;
            jlVar.f134152b = jkVar.f134148d;
            jlVar.f134151a |= 1;
            axVar = C58833ax.m90834k((C51485jl) jiVar.build());
        }
        return axVar.mo56106b(C102563ax.f286254a);
    }
}
