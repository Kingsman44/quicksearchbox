package com.google.android.apps.gsa.staticplugins.searchboxroot.p8723c;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.c.d */
/* compiled from: PG */
public final class C116847d implements C116844a {

    /* renamed from: a */
    public static final C59071e f324304a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.c.d");

    /* renamed from: b */
    public final Context f324305b;

    /* renamed from: c */
    private final C86034c f324306c;

    /* renamed from: d */
    private final Executor f324307d;

    /* renamed from: e */
    private final C84486a f324308e;

    /* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.c.d$a */
    /* compiled from: PG */
    public interface C116848a {
        /* renamed from: hj */
        C58833ax mo103033hj();
    }

    public C116847d(Context context, C84486a aVar, C86034c cVar, Executor executor) {
        this.f324305b = context;
        this.f324308e = aVar;
        this.f324306c = cVar;
        this.f324307d = executor;
    }

    /* renamed from: a */
    public final void mo103032a(C41658m mVar) {
        if (this.f324308e.mo78205l()) {
            C59104x b = f324304a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "sb.r.PDSWriter");
            ((C59052c) ((C59052c) b).mo56372aa(32585)).mo56386p("Updating TNG suggest bootstrap data");
            C47633f i = C47633f.m84733g(this.f324306c.mo79697b()).mo51516i(new C116845b(this, mVar), this.f324307d);
            C116846c cVar = new C116846c();
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(cVar), C60826bg.f164896a);
        }
    }
}
