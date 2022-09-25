package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129766b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129776l;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.u */
/* compiled from: PG */
public final /* synthetic */ class C129801u implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C129801u f356141a = new C129801u();

    private /* synthetic */ C129801u() {
    }

    public final void accept(Object obj) {
        C59071e eVar = C129739aa.f356023a;
        C129776l a = ((C129766b) obj).mo17754z();
        a.mo109254h(false);
        C128582b bVar = (C128582b) a.f356095b.getChildFragmentManager().f634a.mo670b(R.id.assistant_canvas_p6glow_container);
        if (bVar != null) {
            bVar.mo17754z().mo108537g();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
