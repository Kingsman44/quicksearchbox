package com.google.android.apps.gsa.assistant.settings.features.p536ac.p537a;

import android.net.Uri;
import com.google.android.apps.gsa.assistant.settings.features.p536ac.C9790a;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ac.a.a */
/* compiled from: PG */
public final class C9791a {
    /* renamed from: a */
    public static C72856b m24549a(C90021c cVar, C9763o oVar, C9790a aVar) {
        String x = cVar.mo79758x(C90059dk.f249161cr);
        C9752d dVar = (C9752d) C9753e.f33664d.createBuilder();
        String string = aVar.f33771a.getString("assistant_settings_your_places_place_id");
        String string2 = aVar.f33771a.getString("assistant_settings_your_places_nickname");
        Uri.Builder buildUpon = Uri.parse(x).buildUpon();
        if (string != null) {
            buildUpon.appendQueryParameter("placeId", string);
        }
        if (string2 != null) {
            buildUpon.appendQueryParameter("nickname", string2);
        }
        String uri = buildUpon.build().toString();
        dVar.copyOnWrite();
        C9753e eVar = (C9753e) dVar.instance;
        uri.getClass();
        eVar.f33666a |= 1;
        eVar.f33667b = uri;
        return oVar.mo18024a((C9753e) dVar.build());
    }
}
