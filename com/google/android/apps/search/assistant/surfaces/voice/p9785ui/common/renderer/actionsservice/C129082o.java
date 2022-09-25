package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2050bp;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32480m;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.o */
/* compiled from: PG */
public final class C129082o {
    /* renamed from: a */
    public final C32480m mo108838a(View view) {
        if (view instanceof C32480m) {
            return (C32480m) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        Iterator a = C2050bp.m5609a((ViewGroup) view).mo5191a();
        while (a.hasNext()) {
            C32480m a2 = mo108838a((View) a.next());
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
