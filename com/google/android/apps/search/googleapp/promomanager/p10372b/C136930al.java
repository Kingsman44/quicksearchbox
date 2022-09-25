package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4880aq.C63766w;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.al */
/* compiled from: PG */
final class C136930al implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C63766w f372669a;

    /* renamed from: b */
    final /* synthetic */ int f372670b;

    public C136930al(int i, C63766w wVar) {
        this.f372670b = i;
        this.f372669a = wVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        Boolean bool = (Boolean) obj;
        C59052c cVar = (C59052c) ((C59052c) C136931am.f372671a.mo56224b()).mo56372aa(40832);
        switch (this.f372670b) {
            case 1:
                str = "UNKNOWN_CONDITION";
                break;
            case 2:
                str = "IS_VOICE_SEARCH";
                break;
            case 3:
                str = "IS_TEXT_SEARCH";
                break;
            case 4:
                str = "HAS_SEARCH_WIDGET";
                break;
            case 5:
                str = "SEARCH_WIDGET_DELETED_OVER_X_MS_AGO";
                break;
            case 6:
                str = "IS_SETTING_ENABLED";
                break;
            case 7:
                str = "IS_USER_ENGAGED";
                break;
            case 8:
                str = "HAS_WEATHER_HSI_SHORTCUT";
                break;
            case 9:
                str = "HAS_ENTRY_SOURCE";
                break;
            case 10:
                str = "IS_PINAPPWIDGET_SUPPORTED";
                break;
            case 11:
                str = "IS_USER_ELIGIBLE_FOR_SEARCH_CONSOLE_INSIGHTS";
                break;
            default:
                str = "HAS_NOTIFICATIONS_ENABLED";
                break;
        }
        cVar.mo56359L("Condition %s = %b withParams[%s]", str, bool, Collections.unmodifiableMap(this.f372669a.f172504b));
    }
}
