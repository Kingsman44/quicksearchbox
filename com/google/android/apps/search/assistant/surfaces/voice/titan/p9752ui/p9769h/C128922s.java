package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147768a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.s */
/* compiled from: PG */
final class C128922s implements C147768a {

    /* renamed from: a */
    final /* synthetic */ C128914l f354294a;

    public C128922s(C128914l lVar) {
        this.f354294a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42047a(Object obj) {
        Float f = (Float) obj;
        View findViewById = this.f354294a.f354272f.requireView().findViewById(R.id.assistant_voice_plate_scrim);
        C69664n.m101060f(f, "it");
        findViewById.setAlpha(f.floatValue());
    }
}
