package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.warmactions;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83356f;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128541f;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.warmactions.a */
/* compiled from: PG */
public final /* synthetic */ class C82114a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ WarmActionsAssistUi f224494a;

    public /* synthetic */ C82114a(WarmActionsAssistUi warmActionsAssistUi) {
        this.f224494a = warmActionsAssistUi;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Duration duration;
        WarmActionsAssistUi warmActionsAssistUi = this.f224494a;
        C128543h hVar = (C128543h) obj;
        C128541f a = C128541f.m209785a(hVar.f353467b);
        if (a == null) {
            a = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
        }
        boolean z = false;
        if (a != C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED) {
            C128541f a2 = C128541f.m209785a(hVar.f353467b);
            if (a2 == null) {
                a2 = C128541f.WARM_ACTIONS_UI_BEHAVIOR_UNSPECIFIED;
            }
            if (a2 != C128541f.NOT_LISTENING) {
                z = true;
            }
        }
        C22871g gVar = warmActionsAssistUi.f224487e;
        C83356f fVar = warmActionsAssistUi.f224485c;
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            duration = Duration.ZERO;
        } else {
            duration = WarmActionsAssistUi.f224483a;
        }
        C83349aj.m132648c(gVar, fVar, valueOf, duration, "isWarmActionsEnabled");
    }
}
