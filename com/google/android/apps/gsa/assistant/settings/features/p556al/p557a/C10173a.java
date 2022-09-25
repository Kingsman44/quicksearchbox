package com.google.android.apps.gsa.assistant.settings.features.p556al.p557a;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.p526e.C9752d;
import com.google.android.apps.gsa.assistant.settings.p526e.C9753e;
import com.google.android.apps.gsa.assistant.settings.p526e.C9763o;
import com.google.android.apps.gsa.assistant.settings.p526e.C9764p;
import com.google.android.apps.gsa.assistant.settings.p526e.C9765q;
import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73747c;
import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73748d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.assistant.p3861at.C50286rl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.al.a.a */
/* compiled from: PG */
public final class C10173a {

    /* renamed from: a */
    private static final C58528ij f34582a = C58528ij.m90011K("proactive_highlight", "proactive_set_and_highlight");

    /* renamed from: a */
    public static C72856b m25044a(C90021c cVar, C9763o oVar, Bundle bundle) {
        String string;
        Uri parse = Uri.parse(cVar.mo79758x(C90059dk.f249139bw));
        if (!(bundle == null || (string = bundle.getString("assistant_settings_feature_action")) == null)) {
            parse = parse.buildUpon().appendQueryParameter("feature_action", string).build();
            if (f34582a.contains(string)) {
                parse = parse.buildUpon().fragment("suggestions").build();
            }
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

    /* renamed from: b */
    public static C9765q m25045b() {
        C9764p pVar = (C9764p) C9765q.f33712d.createBuilder();
        C89849ae aeVar = C89849ae.OPA_SETTINGS_PAGE_PHOTOS;
        pVar.copyOnWrite();
        C9765q qVar = (C9765q) pVar.instance;
        qVar.f33716c = aeVar.f245884YW;
        qVar.f33714a |= 2;
        return (C9765q) pVar.build();
    }

    /* renamed from: c */
    public static Set m25046c(C90021c cVar, C18509a aVar) {
        if (!cVar.mo79746e(C90059dk.f249071ah)) {
            return C58733pz.f156496a;
        }
        C73747c c = C73748d.m108304c();
        c.mo65218c(C50286rl.PHOTOS);
        aVar.mo24024f("photos");
        c.mo65217b(aVar.mo24020b().mo24031a());
        return new C58759qy(c.mo65216a());
    }
}
