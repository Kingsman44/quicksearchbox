package com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61752n;
import java.util.Iterator;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.g.m */
/* compiled from: PG */
public final class C112050m {

    /* renamed from: a */
    private static final C59071e f311224a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.g.m");

    /* renamed from: a */
    public static Optional m185895a(C61752n nVar, String str) {
        Optional empty;
        Iterator it = nVar.f166812c.iterator();
        while (true) {
            if (!it.hasNext()) {
                ((C59052c) ((C59052c) f311224a.mo56226d()).mo56372aa(27480)).mo56354G("Argument %s doesn't exist in FunctionCall: \n%s", str, nVar);
                empty = Optional.empty();
                break;
            }
            C61746h hVar = (C61746h) it.next();
            if (hVar.f166796d.equals(str)) {
                empty = Optional.m71637of(hVar);
                break;
            }
        }
        return empty.map(C112020a.f311194a);
    }

    /* renamed from: b */
    public static Optional m185896b(C61752n nVar, String str) {
        return m185895a(nVar, str).filter(C112048k.f311222a).map(C112049l.f311223a).filter(C112038b.f311213a).map(C112040c.f311214a);
    }

    /* renamed from: c */
    public static Stream m185897c(C61752n nVar, String... strArr) {
        return DesugarArrays.stream((T[]) strArr).map(new C112041d(nVar)).filter(C112042e.f311216a).map(C112043f.f311217a);
    }
}
