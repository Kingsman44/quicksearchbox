package com.google.android.libraries.search.p2871b.p2896j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.search.p2871b.p2892g.C37243e;
import com.google.common.p4522b.C58495hd;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4419bx.C57862c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.b.j.f */
/* compiled from: PG */
public final class C37272f {
    /* renamed from: a */
    public static String m66226a(C57862c cVar, C37243e eVar) {
        C58495hd hdVar;
        if ((cVar.f154577a & 2) != 0) {
            String str = cVar.f154579c;
            int i = cVar.f154578b;
            C58495hd c = eVar.mo40753c();
            if (c.containsKey(str) && (hdVar = (C58495hd) c.get(str)) != null) {
                Integer valueOf = Integer.valueOf(i);
                if (hdVar.containsKey(valueOf)) {
                    return str + ":" + ((String) hdVar.get(valueOf));
                }
            }
            return str + ":" + i;
        }
        C62722b a = C62722b.m94931a(cVar.f154578b);
        if (a != null) {
            return a.name();
        }
        return String.format(Locale.US, "%s(%d)", new Object[]{"INVALID", Integer.valueOf(cVar.f154578b)});
    }

    /* renamed from: b */
    public static String m66227b(long j) {
        if (j == 0) {
            return "0";
        }
        C62910ar l = C62948a.m95461l(j);
        if (C62948a.m95451b(l) > 0) {
            C62910ar h = C62948a.m95457h(C62948a.m95451b(l));
            return m66228c(C62948a.m95451b(h), C19618h.f54585a, C62948a.m95454e(C62948a.m95463n(l, h)), "m");
        } else if (C62948a.m95454e(l) <= 0) {
            C62948a.m95465p(l);
            if (l.f169860a > 0) {
                C62948a.m95465p(l);
                C62910ar m = C62948a.m95462m(l.f169860a, 0);
                C62948a.m95465p(m);
                return m66228c(m.f169860a, C59002s.f156871a, C62948a.m95453d(C62948a.m95463n(l, m)), "ms");
            } else if (C62948a.m95453d(l) <= 0) {
                return m66228c(0, BuildConfig.FLAVOR, C62948a.m95455f(l), "ns");
            } else {
                C62910ar j2 = C62948a.m95459j(C62948a.m95453d(l));
                return m66228c(C62948a.m95453d(j2), "ms", C62948a.m95455f(C62948a.m95463n(l, j2)) / 1000, "us");
            }
        } else {
            C62910ar k = C62948a.m95460k(C62948a.m95454e(l));
            long e = C62948a.m95454e(k);
            C62910ar n = C62948a.m95463n(l, k);
            C62948a.m95465p(n);
            return m66228c(e, "m", n.f169860a, C59002s.f156871a);
        }
    }

    /* renamed from: c */
    private static String m66228c(long j, String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder();
        if (j > 0) {
            sb.append(j);
            sb.append(str);
        }
        if (j2 > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(j2);
            sb.append(str2);
        }
        return sb.toString();
    }
}
