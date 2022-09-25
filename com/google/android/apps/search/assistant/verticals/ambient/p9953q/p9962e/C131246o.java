package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123747bn;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.o */
/* compiled from: PG */
public final class C131246o {

    /* renamed from: a */
    private static final C59071e f358887a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.q.e.o");

    /* renamed from: a */
    public static int m213738a(C123787p pVar) {
        long millis = Duration.ofSeconds(pVar.f341954e).toMillis();
        String str = pVar.f341953d;
        return (str + millis + "17").hashCode();
    }

    /* renamed from: b */
    public static int m213739b(String str, int i) {
        int b = C123747bn.m203106b(i);
        String a = C123747bn.m203105a(b);
        if (b != 0) {
            String concat = a.concat(String.valueOf(str));
            ((C59052c) ((C59052c) f358887a.mo56224b()).mo56372aa(39090)).mo56389s("event Id %s", concat);
            return concat.hashCode();
        }
        throw null;
    }
}
