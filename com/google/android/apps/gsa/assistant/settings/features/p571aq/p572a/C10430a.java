package com.google.android.apps.gsa.assistant.settings.features.p571aq.p572a;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10010ai;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10011aj;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10012ak;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10015an;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10016ao;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.C10017ap;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.assistant.settings.features.p571aq.C10435f;
import com.google.android.apps.gsa.assistant.settings.features.p571aq.C10436g;
import com.google.android.apps.gsa.assistant.settings.features.p571aq.C10437h;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18514b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18515c;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18516d;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18518f;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18519g;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18521i;
import com.google.common.base.C58831av;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aq.a.a */
/* compiled from: PG */
public final class C10430a {
    /* renamed from: a */
    public static C72856b m25398a(Bundle bundle) {
        Optional optional;
        C18519g gVar;
        Optional optional2;
        Optional optional3;
        Optional optional4;
        c d = C72856b.m107584d();
        c cVar = d;
        cVar.d = 2;
        Bundle bundle2 = (Bundle) C58831av.m90830c(bundle, Bundle.EMPTY);
        C18515c cVar2 = (C18515c) C18516d.f52474d.createBuilder();
        C58485gu guVar = (C58485gu) Optional.ofNullable(bundle2.getIntArray("context_types")).map(C10010ai.f34209a).map(C10011aj.f34210a).orElseGet(C10012ak.f34211a);
        C18521i iVar = (C18521i) C58831av.m90830c(C18521i.m35984a(bundle2.getInt("toggle_action", 0)), C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED);
        if (!iVar.equals(C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED) && guVar.isEmpty()) {
            ((C58970a) ((C58970a) C10017ap.f34216a.mo56226d()).mo56372aa(980)).mo56389s("#MWW Toggle action was %s, but no context types specified.", iVar.name());
            optional = Optional.empty();
        } else if (iVar.equals(C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED)) {
            optional = Optional.empty();
        } else {
            C18518f fVar = (C18518f) C18519g.f52480e.createBuilder();
            fVar.mo24029a(guVar);
            fVar.copyOnWrite();
            C18519g gVar2 = (C18519g) fVar.instance;
            gVar2.f52484d = iVar.f52491e;
            gVar2.f52482a |= 1;
            optional = Optional.m71637of((C18519g) fVar.build());
        }
        if (optional.isPresent()) {
            gVar = (C18519g) optional.get();
        } else {
            String string = bundle2.getString("assistant_settings_feature_action");
            if (string == null) {
                optional3 = Optional.empty();
            } else if (!string.startsWith("toggle_action")) {
                optional3 = Optional.empty();
            } else if (string.length() <= 14) {
                optional3 = Optional.empty();
            } else {
                try {
                    optional3 = Optional.ofNullable(C18521i.m35984a(Integer.parseInt(string.substring(14))));
                } catch (NumberFormatException e) {
                    ((C58970a) ((C58970a) ((C58970a) C10017ap.f34216a.mo56226d()).mo56382g(e)).mo56372aa(981)).mo56389s("#MWW Failed to parse toggle action from feature action: %s", string);
                    optional3 = Optional.empty();
                }
            }
            C18521i iVar2 = (C18521i) optional3.orElse(C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED);
            if (iVar2.equals(C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED)) {
                optional4 = Optional.empty();
            } else {
                Optional ofNullable = Optional.ofNullable(bundle2.getString("assistant_settings_feature_secondary_action"));
                C58869cf a = C58869cf.m90936b(new C58903m(',')).mo56152f(C58911u.f156751b).mo56151a();
                Objects.requireNonNull(a);
                C58485gu guVar2 = (C58485gu) ofNullable.map(new C10015an(a)).map(C10016ao.f34215a).map(C10011aj.f34210a).orElseGet(C10012ak.f34211a);
                if (guVar2.isEmpty()) {
                    ((C58970a) ((C58970a) C10017ap.f34216a.mo56226d()).mo56372aa(982)).mo56389s("#MWW Toggle action was %s, but no context types specified.", iVar2.name());
                    optional4 = Optional.empty();
                } else {
                    C18518f fVar2 = (C18518f) C18519g.f52480e.createBuilder();
                    fVar2.mo24029a(guVar2);
                    fVar2.copyOnWrite();
                    C18519g gVar3 = (C18519g) fVar2.instance;
                    gVar3.f52484d = iVar2.f52491e;
                    gVar3.f52482a |= 1;
                    optional4 = Optional.m71637of((C18519g) fVar2.build());
                }
            }
            gVar = (C18519g) optional4.orElse(C18519g.f52480e);
        }
        cVar2.copyOnWrite();
        C18516d dVar = (C18516d) cVar2.instance;
        gVar.getClass();
        dVar.f52477b = gVar;
        dVar.f52476a |= 1;
        int i = bundle2.getInt("open_tab", -1);
        if (i == -1) {
            optional2 = Optional.empty();
        } else {
            optional2 = Optional.ofNullable(C18514b.m35980a(i));
            if (optional2.isEmpty()) {
                ((C58970a) ((C58970a) C10437h.f35172a.mo56226d()).mo56372aa(1251)).mo56387q("EXTRA_OPEN_TAB was specified, but had invalid value: %d", i);
            }
        }
        if (!optional2.isPresent()) {
            String string2 = bundle2.getString("assistant_settings_feature_action");
            if (string2 == null) {
                optional2 = Optional.empty();
            } else if (string2.startsWith("toggle_action")) {
                optional2 = Optional.m71637of(C18514b.MOBILE);
            } else if (!string2.equals("open_tab")) {
                optional2 = Optional.empty();
            } else {
                String string3 = bundle2.getString("assistant_settings_feature_secondary_action");
                if (string3 == null) {
                    optional2 = Optional.empty();
                } else {
                    try {
                        int parseInt = Integer.parseInt(string3);
                        optional2 = Optional.ofNullable(C18514b.m35980a(parseInt));
                        if (optional2.isEmpty()) {
                            ((C58970a) ((C58970a) C10437h.f35172a.mo56226d()).mo56372aa(1252)).mo56387q("Open tab was specified in URI, but had invalid value: %d", parseInt);
                        }
                    } catch (NumberFormatException unused) {
                        optional2 = Optional.empty();
                    }
                }
            }
        }
        Objects.requireNonNull(cVar2);
        optional2.ifPresent(new C10436g(cVar2));
        cVar.b = Optional.m71637of(C10435f.m25410a((C18516d) cVar2.build()));
        return d.a();
    }
}
