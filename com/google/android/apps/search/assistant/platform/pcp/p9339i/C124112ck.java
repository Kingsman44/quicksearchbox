package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ck */
/* compiled from: PG */
public final /* synthetic */ class C124112ck implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C124114cm f342783a;

    public /* synthetic */ C124112ck(C124114cm cmVar) {
        this.f342783a = cmVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C124114cm cmVar = this.f342783a;
        Map map = (Map) obj;
        if (map.isEmpty() || map.keySet().isEmpty()) {
            ((C58970a) ((C58970a) cmVar.f342789e.mo56226d()).mo56372aa(35416)).mo56386p("#isWeatherAvailable Weather is not available.");
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
