package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10297k;

import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.k.b */
/* compiled from: PG */
public final /* synthetic */ class C135868b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C135869c f370039a;

    /* renamed from: b */
    public final /* synthetic */ C43376u f370040b;

    public /* synthetic */ C135868b(C135869c cVar, C43376u uVar) {
        this.f370039a = cVar;
        this.f370040b = uVar;
    }

    public final C60870cx apply(Object obj) {
        C135869c cVar = this.f370039a;
        C43376u uVar = this.f370040b;
        C46108a aVar = (C46108a) obj;
        if (!cVar.f370047g.f101930a && !aVar.mo50210b().f121165j.equals("pseudonymous") && !uVar.f113329b.equals(cVar.f370046f)) {
            int i = uVar.f113328a;
            if ((i & 64) == 0 && (i & 4) == 0) {
                C43369n a = C43369n.m76519a(uVar.f113330c);
                if (a == null) {
                    a = C43369n.UNSPECIFIED;
                }
                if (a.equals(C43369n.SUCCESS) && uVar.f113333f == 100 && !cVar.f370045e.mo110979b()) {
                    String str = uVar.f113334g;
                    String str2 = uVar.f113329b;
                    cVar.f370046f = str2;
                    C60870cx a2 = cVar.f370048h.mo46277a(TimeUnit.MILLISECONDS);
                    C135867a aVar2 = new C135867a(cVar, str, str2);
                    return C60922j.m93045h(a2, C47810es.m84966f(aVar2), cVar.f370044d);
                }
            }
        }
        return C60866ct.f164955a;
    }
}
