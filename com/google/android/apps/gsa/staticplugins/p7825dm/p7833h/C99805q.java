package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.search.core.p6519al.p6684cz.C85271b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.q */
/* compiled from: PG */
public final /* synthetic */ class C99805q implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C99812x f279215a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f279216b;

    public /* synthetic */ C99805q(C99812x xVar, C2164c cVar) {
        this.f279215a = xVar;
        this.f279216b = cVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C99812x xVar = this.f279215a;
        C2164c cVar = this.f279216b;
        if (i == 2) {
            ((C59052c) ((C59052c) C99812x.f279225a.mo56224b()).mo56372aa(32896)).mo56386p("user consented");
            C60870cx f = xVar.mo91598f();
            C22871g gVar = xVar.f279228f;
            Objects.requireNonNull(cVar);
            C90873ag agVar = new C90873ag(f, gVar, "Get location after consent", new C99810v(cVar));
            Objects.requireNonNull(cVar);
            agVar.mo85224b(Exception.class, new C99811w(cVar));
            Objects.requireNonNull(cVar);
            agVar.mo85223a(new C99811w(cVar));
            return true;
        }
        ((C59052c) ((C59052c) C99812x.f279225a.mo56224b()).mo56372aa(32895)).mo56386p("user declined consent");
        return cVar.mo5439d(new C85271b());
    }
}
