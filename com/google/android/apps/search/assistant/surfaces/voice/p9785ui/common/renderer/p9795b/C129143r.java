package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32952e;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.r */
/* compiled from: PG */
public final /* synthetic */ class C129143r implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C129143r f354764a = new C129143r();

    private /* synthetic */ C129143r() {
    }

    public final Object apply(Object obj) {
        C128258a aVar = C128258a.UNKNOWN;
        int ordinal = ((C128258a) obj).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return C32952e.SUCCEEDED;
            }
            if (ordinal == 2) {
                return C32952e.CANCELLED;
            }
            if (ordinal != 3) {
                return C32952e.ERROR;
            }
        }
        return C32952e.ERROR;
    }
}
