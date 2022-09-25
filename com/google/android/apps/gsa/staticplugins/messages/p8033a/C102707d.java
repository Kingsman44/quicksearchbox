package com.google.android.apps.gsa.staticplugins.messages.p8033a;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.a.d */
/* compiled from: PG */
public final class C102707d {

    /* renamed from: a */
    public static final C58495hd f286734a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C87544b.AIRPLANE_MODE, C102706c.PLANE);
        gzVar.mo55429h(C87544b.DATA_ROAMING_OFF, C102706c.BOAT_DATA);
        gzVar.mo55429h(C87544b.DEVICE_CLOCK_WRONG, C102706c.CLOCK);
        gzVar.mo55429h(C87544b.INTERNAL_ERROR, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.LANGUAGE_PACK_DOWNLOAD_QUEUED, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.LANGUAGE_PACK_INSTALL, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.MIC_PERMISSION, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.MOBILE_DATA_OFF, C102706c.BOAT_DATA);
        gzVar.mo55429h(C87544b.NO_CELL_SUPPORT, C102706c.BOAT_WIFI);
        gzVar.mo55429h(C87544b.NO_DATA_CONNECTION, C102706c.BOAT_DATA);
        gzVar.mo55429h(C87544b.NO_SIGNAL, C102706c.BOAT_DATA);
        gzVar.mo55429h(C87544b.NO_SIM, C102706c.BOAT_SIM);
        gzVar.mo55429h(C87544b.NO_SPEECH_DETECTED, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.OFFLINE, C102706c.DRIZZLE);
        gzVar.mo55429h(C87544b.RECONNECTING, C102706c.SPIN);
        gzVar.mo55429h(C87544b.SEARCH_TIMED_OUT, C102706c.CLOCK);
        gzVar.mo55429h(C87544b.SIM_CARD_ERROR, C102706c.BOAT_SIM);
        gzVar.mo55429h(C87544b.UNKNOWN_MESSAGE, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.VOICE_ERROR, C102706c.DIZZY);
        gzVar.mo55429h(C87544b.WIFI_CAPTIVE_PORTAL, C102706c.BOAT_WIFI);
        f286734a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static int m170306a(Context context) {
        return context.getResources().getIdentifier("message_card_puffy_icon", "id", context.getPackageName());
    }

    /* renamed from: b */
    public static int m170307b(Context context) {
        return context.getResources().getIdentifier("message_card_puffy_icon", "layout", context.getPackageName());
    }
}
