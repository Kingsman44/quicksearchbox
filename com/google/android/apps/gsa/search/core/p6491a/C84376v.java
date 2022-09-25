package com.google.android.apps.gsa.search.core.p6491a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.a.v */
/* compiled from: PG */
public final class C84376v {
    /* renamed from: a */
    public static int m134657a(Query query, C68214a aVar) {
        if (query.mo84412cs()) {
            return true != ((C91123v) aVar.mo27525b()).mo85390b() ? 5 : 6;
        }
        if (!query.mo84457dk()) {
            if (!C14649e.f44256a.contains(query.mo84355bn())) {
                if (query.mo84324bI()) {
                    return 4;
                }
                if (!query.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED")) {
                    if (query.mo84337bV() || query.mo84404ck()) {
                        return 2;
                    }
                    if (!query.mo84417cx()) {
                        return 0;
                    }
                    return 7;
                }
                return 0;
            }
        }
        return 8;
    }

    /* renamed from: b */
    public static boolean m134658b(Query query) {
        if (!query.mo84412cs() && !query.mo84324bI() && !query.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED") && !query.mo84337bV() && !query.mo84404ck() && !query.mo84401ch() && !query.mo84417cx() && !query.mo84339bX()) {
            return true;
        }
        return false;
    }
}
