package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.view.View;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.ak */
/* compiled from: PG */
final class C128891ak implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128893am f354221a;

    public C128891ak(C128893am amVar) {
        this.f354221a = amVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View findViewById = this.f354221a.f354225c.requireView().findViewById(R.id.assistant_voice_plate_keyboard_icon);
        C69664n.m101060f(findViewById, "requireView().findViewBy…oice_plate_keyboard_icon)");
        ((ImageView) findViewById).setVisibility(true != booleanValue ? 8 : 0);
    }
}
