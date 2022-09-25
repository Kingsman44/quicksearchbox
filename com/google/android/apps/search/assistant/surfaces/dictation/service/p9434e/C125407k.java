package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Arrays;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.k */
/* compiled from: PG */
public final /* synthetic */ class C125407k implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125411o f345855a;

    public /* synthetic */ C125407k(C125411o oVar) {
        this.f345855a = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C125411o oVar = this.f345855a;
        ((C59052c) ((C59052c) C125411o.f345861a.mo56224b()).mo56372aa(36496)).mo56389s("Stopping: %s [SD]", oVar.f345877q);
        if (!oVar.f345874n.compareAndSet(false, true) || oVar.f345878r == null) {
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) C125411o.f345861a.mo56224b()).mo56372aa(36497)).mo56389s("Stopping the audio capture for: %s [SD]", oVar.f345877q);
        C37401bf a = oVar.f345878r.mo20354a();
        C60870cx a2 = a.mo20353a();
        C126308aq aqVar = new C126308aq(C125405i.f345853a, C125406j.f345854a);
        C60856cj.m92911t(a2, C47810es.m84974n(aqVar), oVar.f345870j);
        C37325aa aaVar = oVar.f345879s;
        aaVar.getClass();
        C60870cx b = aaVar.mo40883b();
        C126308aq aqVar2 = new C126308aq(new C125399c(oVar), new C125400d(oVar));
        C60856cj.m92911t(b, C47810es.m84974n(aqVar2), oVar.f345870j);
        return C126309ar.m206525d(Arrays.asList(new C60870cx[]{b, a.mo20353a()}));
    }
}
