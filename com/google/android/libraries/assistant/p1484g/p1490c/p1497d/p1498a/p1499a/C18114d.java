package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18103d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.a.d */
/* compiled from: PG */
public final class C18114d {

    /* renamed from: d */
    private static final C58974d f51583d = C58974d.m91136j();

    /* renamed from: a */
    public final String f51584a;

    /* renamed from: b */
    public final Map f51585b;

    /* renamed from: c */
    public final C58485gu f51586c;

    public C18114d(String str, C58485gu guVar, C58485gu guVar2) {
        this.f51584a = str;
        this.f51585b = (Map) Collection.EL.stream(guVar).collect(Collectors.toMap(C18113c.f51582a, Function.CC.identity()));
        this.f51586c = guVar2;
    }

    /* renamed from: a */
    public static boolean m35281a(Bundle bundle, Map map) {
        if (bundle == null) {
            return true;
        }
        for (String str : bundle.keySet()) {
            Bundle bundle2 = bundle.getBundle(str);
            if (bundle2 == null) {
                ((C58970a) ((C58970a) f51583d.mo56226d()).mo56372aa(47056)).mo56354G("Missing expected bundle at key %s in %s", str, bundle);
                return false;
            }
            C18103d dVar = (C18103d) map.get(str);
            if (dVar == null) {
                if (bundle2.getBoolean("required")) {
                    ((C58970a) ((C58970a) f51583d.mo56226d()).mo56372aa(47060)).mo56389s("Arguments not supported due to missing required argument %s", str);
                }
            } else if (bundle2.getBoolean("required") && !dVar.mo23603d()) {
                ((C58970a) ((C58970a) f51583d.mo56226d()).mo56372aa(47059)).mo56389s("Arguments not supported due required argument being optional %s", str);
            } else if (m35283c("argument", dVar, bundle2)) {
                Bundle bundle3 = bundle2.getBundle("fields");
                if (bundle3 != null) {
                    HashMap hashMap = new HashMap();
                    for (C18103d dVar2 : dVar.mo23600a()) {
                        hashMap.put(dVar2.mo23601b(), dVar2);
                    }
                    if (!m35281a(bundle3, hashMap)) {
                    }
                } else {
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m35282b(Bundle bundle, Iterable iterable) {
        if (bundle == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C18103d dVar = (C18103d) it.next();
            Bundle bundle2 = bundle.getBundle(dVar.mo23601b());
            if (bundle2 == null) {
                if (dVar.mo23603d()) {
                    arrayList.add(dVar.mo23601b());
                }
            } else if (!m35283c("result", dVar, bundle2)) {
                return false;
            } else {
                if (dVar.mo23603d() && !bundle2.getBoolean("required")) {
                    arrayList.add(dVar.mo23601b());
                } else if (!dVar.mo23600a().iterator().hasNext()) {
                    continue;
                } else {
                    Bundle bundle3 = bundle2.getBundle("fields");
                    if (bundle3 == null) {
                        ((C58970a) ((C58970a) f51583d.mo56226d()).mo56372aa(47058)).mo56389s("Results not compatible due to no subfields provided for Bundle field %s", dVar.mo23601b());
                        return false;
                    } else if (!m35282b(bundle3, dVar.mo23600a())) {
                        return false;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        C58970a aVar = (C58970a) ((C58970a) f51583d.mo56226d()).mo56372aa(47057);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        aVar.mo56389s("Results not compatible due to missing required fields %s.", sb.toString());
        return false;
    }

    /* renamed from: c */
    private static boolean m35283c(String str, C18103d dVar, Bundle bundle) {
        boolean equals = dVar.mo23602c().equals(bundle.getString("type"));
        if (!equals) {
            ((C58970a) ((C58970a) f51583d.mo56226d()).mo56372aa(47061)).mo56360M("Arguments not supported due to incompatible type of %s %s; want %s, have %s.", str, dVar.mo23601b(), bundle.getString("type"), dVar.mo23602c());
        }
        return equals;
    }
}
