package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.s */
/* compiled from: PG */
public final class C43432s implements C43448h {

    /* renamed from: a */
    public static final C59071e f113463a = C59071e.m91332i("com.google.android.libraries.web.contrib.contextmenu.a.s");

    /* renamed from: b */
    public final Fragment f113464b;

    /* renamed from: c */
    private final C43446f f113465c;

    /* renamed from: d */
    private final C43431r f113466d;

    public C43432s(C43446f fVar, Fragment fragment, C43431r rVar) {
        this.f113465c = fVar;
        this.f113464b = fragment;
        this.f113466d = rVar;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_search_with_google_lens_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 115056;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113464b.requireContext().getResources().getString(R.string.webx_context_menu_search_with_google_lens_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        if (!this.f113465c.f113502c.isEmpty()) {
            C43431r rVar = this.f113466d;
            String str = this.f113465c.f113502c;
            C60870cx a = rVar.f113460a.mo42552a();
            C60931s f = C47810es.m84966f(new C43428o(rVar, str));
            C60870cx h = C60922j.m93045h(a, C47810es.m84966f(f), C60826bg.f164896a);
            C43426m mVar = new C43426m(this);
            C60846c.m92878g(h, Exception.class, C47810es.m84963c(mVar), C60826bg.f164896a);
        }
    }
}
