package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129714c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129715d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129766b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e.C129776l;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128581b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.s */
/* compiled from: PG */
public final /* synthetic */ class C129799s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128548e f356139a;

    public /* synthetic */ C129799s(C128548e eVar) {
        this.f356139a = eVar;
    }

    public final void accept(Object obj) {
        C129714c cVar;
        C128548e eVar = this.f356139a;
        C59071e eVar2 = C129739aa.f356023a;
        C129776l a = ((C129766b) obj).mo17754z();
        C129715d dVar = (C129715d) eVar.f353476a;
        if (dVar.f355959a == 1) {
            cVar = (C129714c) dVar.f355960b;
        } else {
            cVar = C129714c.f355952d;
        }
        if (cVar.f355955b) {
            a.mo109253g(C128581b.USER_INPUT);
            C129776l.m211869a(a.f356095b).setVisibility(8);
            return;
        }
        a.mo109252f();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
