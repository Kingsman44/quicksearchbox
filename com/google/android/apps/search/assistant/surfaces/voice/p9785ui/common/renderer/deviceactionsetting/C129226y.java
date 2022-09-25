package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import androidx.slice.SliceItem;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.C4147c;
import com.android.p273i.p274a.C5169a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.y */
/* compiled from: PG */
public final /* synthetic */ class C129226y implements C4141as {

    /* renamed from: a */
    public static final /* synthetic */ C129226y f354971a = new C129226y();

    private /* synthetic */ C129226y() {
    }

    /* renamed from: b */
    public final void mo8726b(C4147c cVar, SliceItem sliceItem) {
        Optional optional;
        int i = cVar.f13338b;
        if (i == 0) {
            optional = Optional.m71637of(C5169a.TOGGLE);
        } else if (i == 2) {
            optional = Optional.m71637of(C5169a.SLIDER);
        } else if (i != 3) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(C5169a.CONTENT);
        }
        if (optional.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            ((C5169a) optional.get()).name();
        }
        C59104x d = C129174aa.f354826a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SettingSliceCard");
        ((C59052c) ((C59052c) d).mo56372aa(38159)).mo56386p("VE logging not yet implemented");
    }
}
