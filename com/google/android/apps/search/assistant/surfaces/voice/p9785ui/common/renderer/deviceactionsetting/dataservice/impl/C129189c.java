package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a.C129172b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.c */
/* compiled from: PG */
public final /* synthetic */ class C129189c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C129199m f354881a;

    public /* synthetic */ C129189c(C129199m mVar) {
        this.f354881a = mVar;
    }

    public final Object apply(Object obj) {
        Drawable drawable;
        C129199m mVar = this.f354881a;
        Cursor cursor = (Cursor) obj;
        if ("0".equals(cursor.getString(1))) {
            int columnIndex = cursor.getColumnIndex("icon");
            Context context = mVar.f354895b;
            try {
                drawable = context.getPackageManager().getResourcesForApplication("com.android.settings").getDrawable(cursor.getInt(columnIndex));
                drawable.setTint(context.getResources().getColor(R.color.assistant_device_action_card_drawable_tint));
            } catch (Exception e) {
                ((C59052c) ((C59052c) C129172b.f354824a.mo56226d()).mo56372aa(38198)).mo56389s("While getting drawable from android settings: %s", e.getMessage());
                drawable = null;
            }
            return Optional.ofNullable(drawable);
        }
        C59104x d = C129199m.f354894a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
        ((C59052c) ((C59052c) d).mo56372aa(38169)).mo56386p("Setting not available when querying icon drawable.");
        return Optional.empty();
    }
}
