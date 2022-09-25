package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import android.provider.Settings;
import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C59052c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.al */
/* compiled from: PG */
public final /* synthetic */ class C130900al implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130912ax f358193a;

    public /* synthetic */ C130900al(C130912ax axVar) {
        this.f358193a = axVar;
    }

    public final Object apply(Object obj) {
        C130912ax axVar = this.f358193a;
        C50833ec ecVar = (C50833ec) obj;
        if (ecVar.f132354c.size() == 0) {
            return ecVar;
        }
        int i = Settings.Secure.getInt(axVar.f358214d.getContentResolver(), "content_capture_enabled", -1);
        for (String str : Collections.unmodifiableMap(ecVar.f132354c).keySet()) {
            List i2 = C58869cf.m90936b(new C58903m(',')).mo56156j().mo56155i(str);
            if (i2.size() != 2) {
                ((C59052c) ((C59052c) C130912ax.f358209a.mo56226d()).mo56372aa(39004)).mo56389s("AiaiCardPushStatusDauMap contains invalid key: %s", str);
            } else {
                axVar.f358212b.mo41671E(axVar.f358213c, C130912ax.m213349aL(axVar.f358214d), "Classic", (String) i2.get(0), true, i, (String) i2.get(1));
            }
        }
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        dxVar.copyOnWrite();
        ((C50833ec) dxVar.instance).mo53481b().clear();
        return (C50833ec) dxVar.build();
    }
}
