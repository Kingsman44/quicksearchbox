package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112975j;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4580v.C60948g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* compiled from: PG */
final class JniBridge {

    /* renamed from: a */
    private static final C58869cf f313029a = C58869cf.m90936b(new C58903m(';')).mo56151a();

    /* renamed from: b */
    private static final C58869cf f313030b = C58869cf.m90936b(new C58903m(':')).mo56151a();

    private JniBridge() {
    }

    /* renamed from: a */
    private static List m186950a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String g : f313029a.mo56153g(str)) {
            Iterator it = f313030b.mo56153g(g).iterator();
            try {
                String str2 = (String) it.next();
                String str3 = (String) it.next();
                if (!it.hasNext()) {
                    arrayList.add(new C112960a(str2, str3));
                }
            } catch (NoSuchElementException unused) {
            }
        }
        return arrayList;
    }

    private static String getActiveCallContextString() {
        C58485gu m = ((C112967h) C112968i.f313043a.get()) == null ? C58485gu.m89845m() : null;
        StringBuilder sb = new StringBuilder();
        C58801sm G = m.listIterator(0);
        while (G.hasNext()) {
            C112965f fVar = (C112965f) G.next();
            if (sb.length() > 0) {
                sb.append(';');
            }
            sb.append(fVar.mo99789a());
            sb.append(':');
            sb.append(fVar.mo99790b());
        }
        return sb.toString();
    }

    private static void reportEvent(String str, String str2, String str3) {
        new C112960a(str, str2);
        List a = m186950a(str3);
        List list = C112964e.f313040a;
        C60948g gVar = C60948g.f165068a;
        Instant.now();
        if (!C112964e.f313040a.isEmpty()) {
            C112964e.m186954b(a);
            for (C112975j jVar : C112964e.f313040a) {
            }
        }
    }

    private static void reportQuantity(String str, String str2, String str3, long j) {
        new C112960a(str, str2);
        List a = m186950a(str3);
        if (!C112964e.f313040a.isEmpty()) {
            C112964e.m186954b(a);
            for (C112975j jVar : C112964e.f313040a) {
            }
        }
    }

    private static void reportSpan(String str, String str2, String str3, long j, long j2, long j3) {
        new C112960a(str, str2);
        List a = m186950a(str3);
        Instant.ofEpochSecond(j, j2);
        Duration.ofNanos(j3);
        C112964e.m186954b(a);
        for (C112975j jVar : C112964e.f313040a) {
        }
    }
}
