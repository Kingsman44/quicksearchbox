package com.google.android.apps.gsa.assistant.settings.features.p532aa.p533a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aa.a.a */
/* compiled from: PG */
public final class C9783a {
    /* renamed from: a */
    public static C72856b m24537a(C90021c cVar, C9763o oVar, Bundle bundle) {
        String string;
        Uri parse = Uri.parse(cVar.mo79758x(C90059dk.f249052aO));
        if (!(bundle == null || (string = bundle.getString("assistant_settings_feature_action")) == null)) {
            parse = parse.buildUpon().appendQueryParameter("feature_action", string).build();
        }
        C9752d dVar = (C9752d) C9753e.f33664d.createBuilder();
        String uri = parse.toString();
        dVar.copyOnWrite();
        C9753e eVar = (C9753e) dVar.instance;
        uri.getClass();
        eVar.f33666a |= 1;
        eVar.f33667b = uri;
        return oVar.mo18024a((C9753e) dVar.build());
    }
}
