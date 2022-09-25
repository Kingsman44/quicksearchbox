package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134558aw;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.Comparator;
import p3186j$.time.Instant;
import p5462h.p5465b.C69544a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.w */
/* compiled from: PG */
public final class C135203w implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C134558aw awVar = ((C135201u) obj).f368294b.f366438b;
        if (awVar == null) {
            awVar = C134558aw.f366443h;
        }
        C63042fg fgVar = awVar.f366446b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "it.sessionState.structure.creationTime");
        Instant d = C62949a.m95469d(fgVar);
        C134558aw awVar2 = ((C135201u) obj2).f368294b.f366438b;
        if (awVar2 == null) {
            awVar2 = C134558aw.f366443h;
        }
        C63042fg fgVar2 = awVar2.f366446b;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar2, "it.sessionState.structure.creationTime");
        return C69544a.m100954a(d, C62949a.m95469d(fgVar2));
    }
}
