package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134552aq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.e */
/* compiled from: PG */
public final class C135348e {
    /* renamed from: a */
    public static final boolean m219497a(C134552aq aqVar, Instant instant) {
        C69664n.m101061g(aqVar, "expirationInfo");
        C69664n.m101061g(instant, "fragmentCreationTime");
        if (!aqVar.f366423b) {
            return false;
        }
        C63042fg fgVar = aqVar.f366424c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "expirationInfo.getExpirationTime()");
        return instant.compareTo(C62949a.m95469d(fgVar)) > 0;
    }
}
