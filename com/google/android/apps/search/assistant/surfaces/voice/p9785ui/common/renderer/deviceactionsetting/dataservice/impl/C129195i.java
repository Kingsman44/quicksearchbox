package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a.C129172b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.i */
/* compiled from: PG */
public final /* synthetic */ class C129195i implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C129199m f354888a;

    /* renamed from: b */
    public final /* synthetic */ int f354889b;

    /* renamed from: c */
    public final /* synthetic */ String f354890c;

    public /* synthetic */ C129195i(C129199m mVar, int i, String str) {
        this.f354888a = mVar;
        this.f354889b = i;
        this.f354890c = str;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        int i;
        int parseInt;
        int parseInt2;
        C129199m mVar = this.f354888a;
        int i2 = this.f354889b;
        String str = this.f354890c;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst()) {
            C59104x d = C129199m.f354894a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
            ((C59052c) ((C59052c) d).mo56372aa(38163)).mo56386p("Unable to query setting when modifying setting value");
        } else if ("0".equals(cursor.getString(1))) {
            String string = cursor.getString(3);
            String string2 = cursor.getString(4);
            C58976aa aaVar = C58975e.f156826a;
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (parseInt = Integer.parseInt(string)) >= (parseInt2 = Integer.parseInt(string2)) || !C129172b.m210855b(Integer.valueOf(i2))) {
                i = -1;
            } else {
                double d2 = (double) parseInt;
                double d3 = (double) ((parseInt2 - parseInt) * i2);
                Double.isNaN(d3);
                Double.isNaN(d2);
                i = (int) (d2 + (d3 / 100.0d));
            }
            if (i == -1) {
                return new C60817ay(C60856cj.m92900i(false));
            }
            return new C60817ay(mVar.mo108896d(Integer.toString(i), str));
        } else {
            C59104x d4 = C129199m.f354894a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
            ((C59052c) ((C59052c) d4).mo56372aa(38164)).mo56386p("Setting not available on modifying setting value.");
        }
        return new C60817ay(C60856cj.m92900i(false));
    }
}
