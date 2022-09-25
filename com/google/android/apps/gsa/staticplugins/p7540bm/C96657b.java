package com.google.android.apps.gsa.staticplugins.p7540bm;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6570ay.C84762a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bm.b */
/* compiled from: PG */
public final class C96657b extends C86734a implements C84762a {

    /* renamed from: a */
    private final Context f270438a;

    /* renamed from: b */
    private final C69464a f270439b;

    /* renamed from: c */
    private final C86124t f270440c;

    public C96657b(Context context, C69464a aVar, C86124t tVar) {
        super(C118575h.WORKER_KNOWLEDGE_INTENTS, "knowledgeintents");
        this.f270438a = context;
        this.f270439b = aVar;
        this.f270440c = tVar;
    }

    /* renamed from: c */
    private final void m160170c(String str, boolean z) {
        this.f270438a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f270438a, str), true != z ? 2 : 1, 1);
    }

    /* renamed from: a */
    public final C60870cx mo78465a() {
        for (C96656a aVar : C96656a.values()) {
            C58833ax axVar = aVar.f270436d;
            C58833ax axVar2 = aVar.f270437e;
            boolean z = ((bm) this.f270439b.mo17428b()).u() && ((bm) this.f270439b.mo17428b()).w() && this.f270440c.mo79746e((C90048d) ((C58847bk) aVar.f270436d).f156646a);
            m160170c((String) ((C58847bk) aVar.f270437e).f156646a, z);
            if (z) {
                m160170c(aVar.f270435c, false);
            } else {
                m160170c(aVar.f270435c, true);
            }
        }
        return C118826c.f331423b;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
