package com.google.android.apps.search.googleapp.incognito.p10322c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.incognito.C136228b;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;

/* renamed from: com.google.android.apps.search.googleapp.incognito.c.a */
/* compiled from: PG */
public final class C136241a {

    /* renamed from: a */
    private final Fragment f371027a;

    /* renamed from: b */
    private final C136228b f371028b;

    public C136241a(Fragment fragment, C136228b bVar) {
        this.f371027a = fragment;
        this.f371028b = bVar;
    }

    /* renamed from: a */
    public final void mo112856a() {
        C46459k.m82829b(this.f371028b.mo112855b(2), "Unable to start Incognito session.", new Object[0]);
        if (this.f371027a.getActivity() != null) {
            Intent intent = new Intent();
            C136128i l = C136129j.m221208l();
            l.mo112767b(true);
            l.mo112776k(C139779t.HOME_SCREEN);
            C136127h.m221196a(intent, l.mo112766a());
            Context requireContext = this.f371027a.requireContext();
            ComponentName component = intent.getComponent();
            component.getClass();
            intent.setClassName(requireContext, component.getClassName());
            C47709i.m84861a(this.f371027a, intent);
            this.f371027a.requireActivity().finish();
        }
    }
}
