package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.b */
/* compiled from: PG */
public final class C116958b implements Elector {

    /* renamed from: a */
    private final C86124t f324699a;

    /* renamed from: b */
    private final C86338r f324700b;

    /* renamed from: c */
    private final C21370a f324701c;

    /* renamed from: d */
    private final Context f324702d;

    /* renamed from: e */
    private final C29409fd f324703e;

    public C116958b(Context context, C86124t tVar, C86338r rVar, C21370a aVar, C29409fd fdVar) {
        this.f324699a = tVar;
        this.f324700b = rVar;
        this.f324701c = aVar;
        this.f324702d = context;
        this.f324703e = fdVar;
    }

    /* renamed from: a */
    public final void setElections(C88613q qVar) {
        qVar.mo82282k(new C116968l(this.f324699a, this.f324700b, new C42813k(Collections.singletonList(new C42716c(new C42715b(this.f324702d)))), this.f324701c, this.f324703e));
        qVar.mo82280i(new C116969m(this.f324699a));
    }
}
