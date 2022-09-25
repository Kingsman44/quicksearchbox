package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129715d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129716e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129719h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129766b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129836c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.assistant.p3897e.p3921j.p3926e.C51843bd;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.l */
/* compiled from: PG */
public final /* synthetic */ class C129792l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C129739aa f356132a;

    public /* synthetic */ C129792l(C129739aa aaVar) {
        this.f356132a = aaVar;
    }

    public final void accept(Object obj) {
        int i;
        C129739aa aaVar = this.f356132a;
        C128548e eVar = (C128548e) obj;
        C128547d b = eVar.mo108513b((Runnable) null);
        C129836c a = aaVar.mo109207a();
        C129766b bVar = (C129766b) aaVar.f356025b.getChildFragmentManager().f634a.mo671c("ImmersiveCanvasPlateFragment");
        C51843bd bdVar = C51843bd.APPLICATION_URL;
        int i2 = ((C129715d) eVar.f353476a).f355959a;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 0;
            }
        } else {
            i = 1;
        }
        int i3 = i - 1;
        if (i != 0) {
            if (i3 == 0) {
                Optional.ofNullable(a).ifPresent(new C129798r(eVar));
                Optional.ofNullable(bVar).ifPresent(new C129799s(eVar));
            } else if (i3 == 1) {
                aaVar.mo109208d();
                Optional.ofNullable(a).ifPresent(new C129800t(eVar));
            }
            C129716e eVar2 = (C129716e) C129719h.f355962c.createBuilder();
            eVar2.copyOnWrite();
            C129719h hVar = (C129719h) eVar2.instance;
            hVar.f355965b = 1;
            hVar.f355964a |= 1;
            b.mo108511a((C129719h) eVar2.build());
            return;
        }
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
