package com.google.android.apps.gsa.staticplugins.accl.performers.p7350k;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.search.assistant.verticals.p9880a.p9881a.p9882a.C130324a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.k.f */
/* compiled from: PG */
public final /* synthetic */ class C93207f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93213l f259936a;

    /* renamed from: b */
    public final /* synthetic */ C64735n f259937b;

    public /* synthetic */ C93207f(C93213l lVar, C64735n nVar) {
        this.f259936a = lVar;
        this.f259937b = nVar;
    }

    public final C60870cx apply(Object obj) {
        C93213l lVar = this.f259936a;
        return C60856cj.m92908q(C2169h.m6027a(new C93209h(lVar, this.f259937b, (C130324a) obj)), lVar.f259949c.mo79743a(C90126fx.f251757oo), TimeUnit.MILLISECONDS, lVar.f259950d);
    }
}
