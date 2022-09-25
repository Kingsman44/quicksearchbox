package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import android.text.TextUtils;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.store.C118302a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.bn */
/* compiled from: PG */
public final class C108014bn {

    /* renamed from: a */
    public static final C118302a f300500a = C118302a.m196461a(1);

    /* renamed from: b */
    public static final C118302a f300501b = C118302a.m196461a(3);

    /* renamed from: c */
    public static final C118302a f300502c = C118302a.m196461a(4);

    /* renamed from: d */
    private final C86054o f300503d;

    public C108014bn(C86054o oVar) {
        this.f300503d = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo96370a(int i, int i2, C58833ax axVar) {
        if (axVar.mo56113h()) {
            return mo96371b(i, i2, Base64.encodeToString((byte[]) axVar.mo56107c(), 0));
        }
        return mo96371b(i, i2, BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final String mo96371b(int i, int i2, String str) {
        String str2;
        String str3;
        String[] strArr = new String[4];
        strArr[0] = this.f300503d.mo79659F();
        switch (i) {
            case 3:
                str2 = "ZERO_STATE";
                break;
            case 4:
                str2 = "LOCAL_AGENDA_CONTENT";
                break;
            case 5:
                str2 = "LOCAL_ACQUISITION_NOTIFICATION_CONTENT";
                break;
            case 6:
                str2 = "EMBEDDED";
                break;
            case 7:
                str2 = "LOCAL_NOTIFICATION_CONTENT";
                break;
            case 8:
                str2 = "DEVICE";
                break;
            case 9:
                str2 = "GROWTH_SYNC";
                break;
            case 10:
                str2 = "LOCAL_CONTACT_CONTENT";
                break;
            case 11:
                str2 = "TOP_CONTACTS";
                break;
            case 12:
                str2 = "SMARTSPACE";
                break;
            case 13:
                str2 = "CHALKBOARD";
                break;
            case 14:
                str2 = "POTTER_MEDIA_RECOMMENDATION";
                break;
            case 15:
                str2 = "ASSISTANT_GROWTH";
                break;
            case 16:
                str2 = "TAPAS";
                break;
            case 17:
                str2 = "PROACTIVE_API";
                break;
            default:
                str2 = "PCP";
                break;
        }
        strArr[1] = str2;
        switch (i2) {
            case 4:
                str3 = "ZERO_STATE_CLIENT_RESPONSE";
                break;
            case 5:
                str3 = "AGENDA_CARD";
                break;
            case 6:
                str3 = "ACQUISITION_NOTIFICATION_INTERACTION";
                break;
            case 7:
                str3 = "CONVERSATION_DELTA";
                break;
            case 8:
                str3 = "OPA_GROWTH_SETTINGS";
                break;
            case 9:
                str3 = "ZERO_STATE_CLIENT_CARD_IMPRESSION_COUNT_LIST";
                break;
            case 10:
                str3 = "OPA_TIMESTAMP";
                break;
            case 11:
                str3 = "ZERO_STATE_EMBEDDED_ASSISTANT_RESPONSE";
                break;
            case 12:
                str3 = "ZERO_STATE_CLIENT_DISMISSED_CARD";
                break;
            case 13:
                str3 = "ZERO_STATE_CLIENT_DISMISSED_ELEMENT";
                break;
            case 14:
                str3 = "OPA_ONBOARDING_PREFETCH_RESPONSE";
                break;
            case 15:
                str3 = "ZERO_STATE_CONTACT_BOOK";
                break;
            case 16:
                str3 = "OPA_CALENDAR_EVENTLISTS";
                break;
            case 17:
                str3 = "ZERO_STATE_TOP_CONTACTS";
                break;
            case 18:
                str3 = "SMARTSPACE_CARD_UPDATE";
                break;
            case 19:
                str3 = "SMARTSPACE_WEATHER_CARD_UPDATE";
                break;
            case 20:
                str3 = "OPA_CHALKBOARD_PREFETCH_RESPONSE";
                break;
            case 21:
                str3 = "ZERO_STATE_MEDIA_RECOMMENDATION";
                break;
            case 22:
                str3 = "ZERO_STATE_CONTEXTUAL_SUGGESTIONS";
                break;
            case 23:
                str3 = "UPDATES_CENTER_QUEUE";
                break;
            case 24:
                str3 = "TAPAS_TRAINING_BUFFERS";
                break;
            case 25:
                str3 = "TAPAS_MODELS";
                break;
            case 26:
                str3 = "UPDATES_CENTER_VISUAL_DATA";
                break;
            case 27:
                str3 = "SMARTSPACE_CHIP_UPDATE";
                break;
            case 28:
                str3 = "PROACTIVE_API_CLIENT_CONTENT";
                break;
            case 29:
                str3 = "PROACTIVE_DATA_LIST";
                break;
            case 30:
                str3 = "PROACTIVE_API_JOURNEY_STATE";
                break;
            case 31:
                str3 = "UPDATES_CENTER_FIRST_ACCESS";
                break;
            case 34:
                str3 = "ON_DEVICE_MEDIA_RECOMMENDATION";
                break;
            case 35:
                str3 = "TAPAS_USER_RETENTION";
                break;
            case 36:
                str3 = "TAPAS_OFFLINE_WORKER_RESPONSE";
                break;
            case 37:
                str3 = "SMARTSPACE_DISMISSAL_ID";
                break;
            default:
                str3 = "null";
                break;
        }
        strArr[2] = str3;
        strArr[3] = str;
        return TextUtils.join("_", strArr);
    }
}
