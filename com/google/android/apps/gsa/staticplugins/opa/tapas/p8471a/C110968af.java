package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3825an.p3830c.p3831a.C49314cf;
import com.google.assistant.p3825an.p3830c.p3831a.C49318cj;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.af */
/* compiled from: PG */
public final /* synthetic */ class C110968af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f309139a;

    /* renamed from: b */
    public final /* synthetic */ Map f309140b;

    public /* synthetic */ C110968af(String str, Map map) {
        this.f309139a = str;
        this.f309140b = map;
    }

    public final Object apply(Object obj) {
        Predicate predicate;
        String str = this.f309139a;
        Map map = this.f309140b;
        Map map2 = (Map) obj;
        if (map2 == null) {
            return BuildConfig.FLAVOR;
        }
        if (map2.containsKey(str)) {
            C49314cf cfVar = (C49314cf) map2.get(str);
            Stream stream = Collection.EL.stream(cfVar.f127458b);
            if (Collection.EL.stream(((C58495hd) map).values()).anyMatch(C110974al.f309151a)) {
                predicate = C110975am.f309152a;
            } else {
                predicate = new C110976an(map);
            }
            Optional map3 = stream.filter(predicate).findFirst().map(new C110973ak(map));
            if (!map3.isEmpty()) {
                return (String) map3.get();
            }
            C58976aa aaVar = C58975e.f156826a;
            for (C49318cj cjVar : cfVar.f127459c) {
                if (cjVar.f127465a.replace('-', '_').equals(Locale.getDefault().toString())) {
                    return cjVar.f127466b;
                }
            }
            return BuildConfig.FLAVOR;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return BuildConfig.FLAVOR;
    }
}
