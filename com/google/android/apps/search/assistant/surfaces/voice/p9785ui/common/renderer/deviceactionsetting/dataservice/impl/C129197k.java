package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.database.Cursor;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.k */
/* compiled from: PG */
public final /* synthetic */ class C129197k implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C129197k f354892a = new C129197k();

    private /* synthetic */ C129197k() {
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if ("0".equals(cursor.getString(1))) {
            return Optional.ofNullable(cursor.getString(0));
        }
        C59104x d = C129199m.f354894a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
        ((C59052c) ((C59052c) d).mo56372aa(38170)).mo56386p("Setting not available when querying setting values.");
        return Optional.m71637of(Boolean.toString(false));
    }
}
