package com.google.android.apps.gsa.search.core.preferences.notification;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.notification.h */
/* compiled from: PG */
public final class C86333h {

    /* renamed from: a */
    public static final C59071e f233422a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.notification.h");

    /* renamed from: b */
    public final Context f233423b;

    /* renamed from: c */
    public final C86124t f233424c;

    /* renamed from: d */
    private final C22871g f233425d;

    /* renamed from: e */
    private final C86034c f233426e;

    /* renamed from: f */
    private final C84474e f233427f;

    public C86333h(C22871g gVar, C86034c cVar, Context context, C86124t tVar, C84474e eVar) {
        this.f233425d = gVar;
        this.f233426e = cVar;
        this.f233423b = context;
        this.f233424c = tVar;
        this.f233427f = eVar;
    }

    /* renamed from: a */
    public final void mo80060a() {
        mo80061b(this.f233427f.mo78123l());
    }

    /* renamed from: b */
    public final void mo80061b(String str) {
        new C90873ag(this.f233425d.mo28209i(this.f233426e.mo79697b(), "NotificationWebUiLauncher getCurrentAccountId", new C86330e(this, str)), this.f233425d, "createAndSetupNewWebView callback", C86331f.f233420a).mo85223a(C86332g.f233421a);
    }
}
