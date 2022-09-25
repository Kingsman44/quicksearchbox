package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.m */
/* compiled from: PG */
class C129214m implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C129217p f354934a;

    public C129214m(C129217p pVar) {
        this.f354934a = pVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C59104x c = C129217p.f354939a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SettingNativeSliderCard");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38135)).mo56386p("Failed to query icon drawable.");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        Optional optional = (Optional) obj;
        C58976aa aaVar = C58975e.f156826a;
        C129212k kVar = this.f354934a.f354940b;
        kVar.getClass();
        ImageView imageView = (ImageView) kVar.requireView().findViewById(R.id.assistant_setting_icon);
        if (optional.isPresent()) {
            imageView.setImageDrawable((Drawable) optional.get());
        } else {
            imageView.setImageDrawable(this.f354934a.f354941c.getDrawable(R.drawable.quantum_ic_settings_grey600_48));
        }
    }

    /* renamed from: c */
    public final void mo18079c() {
    }
}
