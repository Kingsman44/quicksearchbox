package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.widget.SeekBar;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.l */
/* compiled from: PG */
class C129213l implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C129217p f354933a;

    public C129213l(C129217p pVar) {
        this.f354933a = pVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C59104x c = C129217p.f354939a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SettingNativeSliderCard");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38132)).mo56386p("Failed to query seek bar progress.");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        Integer num = (Integer) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (num.intValue() != -1) {
            C129212k kVar = this.f354933a.f354940b;
            kVar.getClass();
            SeekBar seekBar = (SeekBar) kVar.requireView().findViewById(R.id.assistant_setting_seek_bar);
            if (!this.f354933a.f354945g.f136794d) {
                seekBar.setEnabled(false);
            } else if (num.intValue() >= 0) {
                seekBar.setProgress(num.intValue());
            }
        }
    }

    /* renamed from: c */
    public final void mo18079c() {
    }
}
