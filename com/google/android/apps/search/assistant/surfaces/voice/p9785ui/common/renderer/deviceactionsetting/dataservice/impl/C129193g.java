package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.database.Cursor;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.g */
/* compiled from: PG */
public final /* synthetic */ class C129193g implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ String f354885a;

    /* renamed from: b */
    public final /* synthetic */ String f354886b;

    public /* synthetic */ C129193g(String str, String str2) {
        this.f354885a = str;
        this.f354886b = str2;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        String str = this.f354885a;
        String str2 = this.f354886b;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst()) {
            C59104x d = C129199m.f354894a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
            ((C59052c) ((C59052c) d).mo56372aa(38171)).mo56389s("Unable to query setting when modifying setting: %s", str2);
        } else if ("0".equals(cursor.getString(2))) {
            String string = cursor.getString(0);
            C58976aa aaVar = C58975e.f156826a;
            return Boolean.valueOf(str.equals(string));
        } else {
            C59104x d2 = C129199m.f354894a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
            ((C59052c) ((C59052c) d2).mo56372aa(38172)).mo56386p("Setting not available when modifying setting values.");
        }
        return false;
    }
}
