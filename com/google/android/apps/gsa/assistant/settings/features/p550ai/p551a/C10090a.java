package com.google.android.apps.gsa.assistant.settings.features.p550ai.p551a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ai.a.a */
/* compiled from: PG */
public final class C10090a {
    /* renamed from: a */
    public static C72856b m24901a(C90021c cVar, C86106b bVar, C9763o oVar, Bundle bundle) {
        C9752d dVar = (C9752d) C9753e.f33664d.createBuilder();
        String c = m24903c(cVar, bundle, bVar, true);
        dVar.copyOnWrite();
        C9753e eVar = (C9753e) dVar.instance;
        c.getClass();
        eVar.f33666a |= 1;
        eVar.f33667b = c;
        return oVar.mo18024a((C9753e) dVar.build());
    }

    /* renamed from: b */
    public static C72856b m24902b(C90021c cVar, C86106b bVar, C9763o oVar, Bundle bundle) {
        C9752d dVar = (C9752d) C9753e.f33664d.createBuilder();
        String c = m24903c(cVar, bundle, bVar, false);
        dVar.copyOnWrite();
        C9753e eVar = (C9753e) dVar.instance;
        c.getClass();
        eVar.f33666a |= 1;
        eVar.f33667b = c;
        return oVar.mo18024a((C9753e) dVar.build());
    }

    /* renamed from: c */
    private static String m24903c(C90021c cVar, Bundle bundle, C86106b bVar, boolean z) {
        Uri.Builder buildUpon = Uri.parse(cVar.mo79758x(C90059dk.f249129bm)).buildUpon();
        if (bundle != null) {
            bundle.getString("assistant_device_id");
        }
        String str = null;
        if (C58837ba.m90859h((String) null)) {
            str = bVar.mo79727b();
        }
        if (str != null) {
            buildUpon.appendQueryParameter("deviceId", str);
        }
        String string = bundle.getString("assistant_settings_feature_action");
        if (string != null) {
            buildUpon.appendQueryParameter("categoryId", string);
        }
        String string2 = bundle.getString("assistant_settings_feature_secondary_action");
        if (string2 != null) {
            buildUpon.appendQueryParameter("categoryGroupId", string2);
        }
        if (z) {
            buildUpon.appendQueryParameter("fromMain", "true");
        }
        return buildUpon.toString();
    }
}
