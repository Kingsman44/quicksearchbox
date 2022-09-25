package com.google.android.apps.search.podcasts.settings;

import android.content.Context;
import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.ak */
/* compiled from: PG */
final class C141068ak implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141098t f382983a;

    public C141068ak(C141098t tVar) {
        this.f382983a = tVar;
    }

    public final void onClick(View view) {
        C141098t tVar = this.f382983a;
        Context context = tVar.f383070c;
        int i = ((C58724pq) C141098t.f383069b).f156474d;
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = C141098t.f383069b.get(i2);
            C69664n.m101060f(obj, "OPTIONS_FOR_THEME_SETTING[i]");
            charSequenceArr[i2] = context.getString(C141098t.m229092c((C140449ak) obj));
        }
        C58485gu guVar = C141098t.f383069b;
        C141050c cVar = tVar.f383081n;
        C69664n.m101058d(cVar);
        int indexOf = guVar.indexOf(cVar.f382940i);
        C44581b bVar = new C44581b(tVar.f383071d.requireContext(), 0);
        bVar.mo47605x(tVar.f383071d.getString(R.string.podcasts_choose_theme));
        bVar.mo47603v(charSequenceArr, indexOf, C141101u.f383088a);
        bVar.mo47602u(tVar.f383071d.getString(R.string.podcasts_settings_ok), new C47752cq(tVar.f383075h, "Preferences: update theme preference", new C141102v(indexOf, tVar)));
        C0392m create = bVar.create();
        C69664n.m101060f(create, "private fun openThemeSet…e()\n    dialog.show()\n  }");
        create.show();
    }
}
