package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85347p;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85348q;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115423aa;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.bs */
/* compiled from: PG */
public final /* synthetic */ class C115249bs implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319792a;

    /* renamed from: b */
    public final /* synthetic */ C115423aa f319793b;

    public /* synthetic */ C115249bs(C115274cq cqVar, C115423aa aaVar) {
        this.f319792a = cqVar;
        this.f319793b = aaVar;
    }

    public final C60870cx apply(Object obj) {
        C115274cq cqVar = this.f319792a;
        C115423aa aaVar = this.f319793b;
        C85349r rVar = cqVar.f319855i;
        C85347p pVar = (C85347p) ((C85348q) obj).toBuilder();
        boolean z = aaVar == C115423aa.HIGHLIGHTING_ON;
        pVar.copyOnWrite();
        C85348q qVar = (C85348q) pVar.instance;
        qVar.f231142a |= 4;
        qVar.f231145d = z;
        return rVar.mo78865b((C85348q) pVar.build());
    }
}
