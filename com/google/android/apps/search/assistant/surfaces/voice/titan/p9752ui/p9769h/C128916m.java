package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import com.google.android.libraries.search.p6glow.C39869b;
import com.google.android.libraries.search.p6glow.C39882m;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.m */
/* compiled from: PG */
final class C128916m extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C128917n f354283a;

    /* renamed from: b */
    final /* synthetic */ C128914l f354284b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128916m(C128917n nVar, C128914l lVar) {
        super(0);
        this.f354283a = nVar;
        this.f354284b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        View findViewById = this.f354283a.f354285a.f354272f.requireView().findViewById(R.id.assistant_voice_plate_p6glow_view);
        C69664n.m101060f(findViewById, "voicePlateFragment.requi…_voice_plate_p6glow_view)");
        return new C39882m((AssistantP6GlowView) findViewById, this.f354284b.f354279m, (C39869b) null, 1020);
    }
}
