package com.google.android.apps.gsa.search.core;

import com.google.p375ai.p378b.C7886np;
import com.google.p4152bb.p4153a.C55281mo;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;

/* renamed from: com.google.android.apps.gsa.search.core.bm */
/* compiled from: PG */
public enum C85662bm {
    AUDIO_HISTORY(C7886np.AUDIO_HISTORY, C55281mo.UNKNOWN, C56116b.VOICE_AND_AUDIO, C55912b.VOICE_AND_AUDIO_ACTIVITY),
    DEVICE_APPS(C7886np.UNKNOWN, C55281mo.DEVICE_APPS, C56116b.UNKNOWN_ID, C55912b.DEVICE_APPS),
    DEVICE_CONTACTS(C7886np.UNKNOWN, C55281mo.DEVICE_CONTACTS, C56116b.UNKNOWN_ID, C55912b.DEVICE_CONTACTS),
    LOCATION_HISTORY_AND_REPORTING(C7886np.LOCATION_HISTORY_AND_REPORTING, C55281mo.UNKNOWN, C56116b.LOCATION_REPORTING, C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN),
    NOW_CARDS(C7886np.GOOGLE_NOW_CARDS, C55281mo.GOOGLE_NOW, C56116b.UNKNOWN_ID, C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN),
    NOW_NOTIFICATIONS(C7886np.UNKNOWN, C55281mo.GOOGLE_NOW_NOTIFICATIONS, C56116b.UNKNOWN_ID, C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN),
    WEB_HISTORY(C7886np.WEB_HISTORY, C55281mo.WEB_HISTORY, C56116b.WEB_AND_APP, C55912b.WEB_AND_APP_ACTIVITY),
    WEB_AND_APP_HISTORY(C7886np.WEB_AND_APP_HISTORY, C55281mo.WEB_AND_APP_HISTORY, C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL, C55912b.SUPPLEMENTAL_WEB_AND_APP_ACTIVITY),
    CHROME_HISTORY_SYNC(C7886np.UNKNOWN, C55281mo.UNKNOWN, C56116b.UNKNOWN_ID, C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN);
    

    /* renamed from: j */
    public final C7886np f231548j;

    /* renamed from: k */
    public final C55281mo f231549k;

    /* renamed from: l */
    public final C56116b f231550l;

    /* renamed from: m */
    public final C55912b f231551m;

    private C85662bm(C7886np npVar, C55281mo moVar, C56116b bVar, C55912b bVar2) {
        this.f231548j = npVar;
        this.f231549k = moVar;
        this.f231550l = bVar;
        this.f231551m = bVar2;
    }

    /* renamed from: a */
    public static C85662bm m137512a(C7886np npVar) {
        for (C85662bm bmVar : values()) {
            if (bmVar.f231548j == npVar) {
                return bmVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C85662bm m137513b(int i) {
        for (C85662bm bmVar : values()) {
            if (bmVar.f231549k.f145615j == i) {
                return bmVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo79182c() {
        return this.f231551m != C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;
    }
}
