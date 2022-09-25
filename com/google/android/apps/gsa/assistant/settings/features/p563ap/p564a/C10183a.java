package com.google.android.apps.gsa.assistant.settings.features.p563ap.p564a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ap.a.a */
/* compiled from: PG */
public final class C10183a {
    /* renamed from: a */
    public static C72856b m25056a(C90021c cVar, C9763o oVar, Bundle bundle) {
        Uri.Builder buildUpon = Uri.parse(cVar.mo79758x(C90059dk.f249093bC)).buildUpon();
        buildUpon.appendQueryParameter("entrySource", bundle.getString("extra_assistant_settings_entry_source", "unknown"));
        C9752d dVar = (C9752d) C9753e.f33664d.createBuilder();
        String builder = buildUpon.toString();
        dVar.copyOnWrite();
        C9753e eVar = (C9753e) dVar.instance;
        builder.getClass();
        eVar.f33666a |= 1;
        eVar.f33667b = builder;
        return oVar.mo18024a((C9753e) dVar.build());
    }
}
