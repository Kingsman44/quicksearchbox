package com.google.android.apps.gsa.assistant.settings.features.p548ah.p549a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.p548ah.C10072i;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.a.a */
/* compiled from: PG */
public final class C10062a {
    /* renamed from: a */
    public static C72856b m24861a(Context context, C90021c cVar, C9763o oVar, Bundle bundle) {
        String string;
        if (cVar.mo79746e(C90059dk.f249122bf)) {
            Uri parse = Uri.parse(cVar.mo79758x(C90059dk.f249123bg));
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
        c d = C72856b.m107584d();
        c cVar2 = d;
        cVar2.d = 2;
        d.c(C89849ae.OPA_SETTINGS_PAGE_NOTESLISTS);
        d.g(context.getString(R.string.assistant_settings_notes_lists_title));
        cVar2.b = Optional.m71637of(new C10072i());
        return d.a();
    }
}
