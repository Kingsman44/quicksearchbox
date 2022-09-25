package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b;

import android.content.Context;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65806cj;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.b.j */
/* compiled from: PG */
public final class C133215j implements C133206a {

    /* renamed from: a */
    public static final C59071e f363083a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.b.b.j");

    /* renamed from: b */
    public static final C65753ak f363084b = C65753ak.PRIVACY_SETTINGS;

    /* renamed from: c */
    public static final String f363085c = C65806cj.SEARCH_AND_ASSISTANT.name();

    /* renamed from: d */
    public final C60887da f363086d;

    /* renamed from: e */
    public final Context f363087e;

    /* renamed from: f */
    private final C46175b f363088f;

    /* renamed from: g */
    private final C46723bg f363089g;

    /* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.b.j$a */
    /* compiled from: PG */
    public interface C133216a {
        /* renamed from: fM */
        C38469m mo111025fM();
    }

    public C133215j(Context context, C46175b bVar, C46723bg bgVar, C60887da daVar) {
        this.f363087e = context;
        this.f363088f = bVar;
        this.f363089g = bgVar;
        this.f363086d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo111023a() {
        return C47633f.m84733g(this.f363089g.mo50750c(this.f363088f.mo50245b(), C46788de.FEW_MINUTES)).mo51515h(C133212g.f363080a, this.f363086d).mo51515h(new C133213h(this), this.f363086d).mo51516i(new C133214i(this), this.f363086d);
    }
}
