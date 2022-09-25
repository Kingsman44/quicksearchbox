package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.database.Cursor;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a.C129172b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.e */
/* compiled from: PG */
public final /* synthetic */ class C129191e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C129191e f354883a = new C129191e();

    private /* synthetic */ C129191e() {
    }

    public final Object apply(Object obj) {
        int i;
        int i2;
        Cursor cursor = (Cursor) obj;
        if ("0".equals(cursor.getString(1))) {
            Integer g = C129199m.m210911g(cursor, 3);
            Integer g2 = C129199m.m210911g(cursor, 4);
            Integer g3 = C129199m.m210911g(cursor, 0);
            if (!(g.intValue() == -1 || g2.intValue() == -1 || g3.intValue() == -1)) {
                int intValue = g.intValue();
                int intValue2 = g2.intValue();
                int intValue3 = g3.intValue();
                if (intValue >= intValue2) {
                    i = null;
                } else if (intValue3 <= intValue) {
                    i = 0;
                } else {
                    if (intValue3 >= intValue2) {
                        i2 = 100;
                    } else {
                        double d = (double) (intValue3 - intValue);
                        Double.isNaN(d);
                        double d2 = (double) (intValue2 - intValue);
                        Double.isNaN(d2);
                        i2 = (int) ((d * 100.0d) / d2);
                    }
                    i = Integer.valueOf(i2);
                }
                if (i != null && C129172b.m210855b(i)) {
                    return i;
                }
            }
        } else {
            C59104x d3 = C129199m.f354894a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
            ((C59052c) ((C59052c) d3).mo56372aa(38176)).mo56386p("Setting not available when querying percentage value.");
        }
        return -1;
    }
}
