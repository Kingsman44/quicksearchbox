package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9627e;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127637b;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127929h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p5462h.C69677g;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71074dt;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.e.a */
/* compiled from: PG */
public final class C127676a {
    /* renamed from: a */
    public static final Set m208731a(C127637b bVar, List list) {
        C71074dt dtVar;
        C69664n.m101061g(bVar, "disconnectReason");
        C69664n.m101061g(list, "fcfFailureReasons");
        C127637b bVar2 = C127637b.APA_PINNING_DESTROY;
        C127929h hVar = C127929h.UNKNOWN;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return C69514bd.m100888b(C71074dt.APA_PINNING_DESTROY);
        } else if (ordinal == 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int ordinal2 = ((C127929h) it.next()).ordinal();
                if (ordinal2 == 2) {
                    dtVar = C71074dt.CONTINUED_CONVERSATION_ENABLED;
                } else if (ordinal2 == 3) {
                    dtVar = C71074dt.LOCALE_INVALID;
                } else if (ordinal2 != 4) {
                    dtVar = C71074dt.UNKNOWN_REASON_FOR_DISCONNECT;
                } else {
                    dtVar = C71074dt.A11Y_SERVICES_ENABLED;
                }
                linkedHashSet.add(dtVar);
            }
            return linkedHashSet;
        } else if (ordinal == 2) {
            return C69514bd.m100888b(C71074dt.SUBSCRIPTION_FAILED);
        } else if (ordinal == 3) {
            return C69514bd.m100888b(C71074dt.SUBSCRIPTION_COMPLETE);
        } else if (ordinal == 4) {
            return C69514bd.m100888b(C71074dt.SUBSCRIPTION_RECONNECT_REQUEST);
        } else {
            throw new C69677g();
        }
    }
}
