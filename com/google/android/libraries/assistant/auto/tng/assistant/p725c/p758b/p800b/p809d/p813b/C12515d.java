package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p813b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4452c.C57950j;
import com.google.p4449cd.p4452c.C57953m;
import com.google.p4449cd.p4453d.C57958d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.b.d */
/* compiled from: PG */
final class C12515d {

    /* renamed from: a */
    private static final SimpleDateFormat f39433a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

    /* renamed from: a */
    public static String m28621a(C12512a aVar, boolean z) {
        String str;
        String str2;
        C12512a aVar2 = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.US, "%s [created at %s]\n", new Object[]{aVar2.f39428b, f39433a.format(new Date(aVar2.f39429c))}));
        sb.append("                                 method                 future  (Note: all times are in ms. relative to TaskGraph creation)\nrequested,   queued,  started, finished (+  latency), finished, task\n");
        if (!aVar.mo20640a().isEmpty()) {
            long longValue = ((Long) aVar2.f39430d.mo56109e(Long.valueOf(((C57950j) aVar2.f39427a).f154974a))).longValue();
            C58485gu F = C58485gu.m89836F(Comparator.CC.comparing(C12514c.f39432a), aVar.mo20640a());
            int i = ((C58724pq) F).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C57953m mVar = (C57953m) F.get(i2);
                C58833ax c = m28623c(longValue, mVar.mo54551h());
                C58833ax c2 = m28623c(longValue, mVar.mo54545c());
                if (!c.mo56113h() || !c2.mo56113h()) {
                    str = "            ";
                } else {
                    str = "(+" + m28622b(((Long) c2.mo56107c()).longValue() - ((Long) c.mo56107c()).longValue()) + ")";
                }
                C57958d j = mVar.mo54554j();
                C58976aa aaVar = C58975e.f156826a;
                StringBuilder sb2 = new StringBuilder();
                if (j.f155001a.f155000f) {
                    sb2.append(j.mo54564b());
                } else {
                    Class<Object> a = j.mo54563a();
                    if (C58837ba.m90859h(a.getSimpleName())) {
                        Class<? super Object> superclass = a.getSuperclass();
                        Class<Object> cls = Object.class;
                        if (superclass == null || cls.equals(superclass)) {
                            Class<Object>[] interfaces = a.getInterfaces();
                            int length = interfaces.length;
                            if (length == 0) {
                                a = cls;
                            } else if (length == 1) {
                                a = interfaces[0];
                            }
                        } else {
                            a = superclass;
                        }
                    }
                    if (z) {
                        str2 = a.getName();
                    } else {
                        str2 = a.getSimpleName();
                    }
                    sb2.append(str2);
                }
                String sb3 = sb2.toString();
                sb.append(String.format(Locale.US, "%s,%s,%s,%s %s, %s, %s, %s, %s, %s\n", new Object[]{m28624d(m28623c(longValue, mVar.mo54550g())), m28624d(m28623c(longValue, mVar.mo54549f())), m28624d(m28623c(longValue, mVar.mo54551h())), m28624d(m28623c(longValue, mVar.mo54545c())), str, m28624d(m28623c(longValue, mVar.mo54546d())), sb3, mVar.mo54543a().mo56109e(0L), mVar.mo54553i().mo56109e(0L), mVar.mo54547e().mo56109e(0L)}));
                if (mVar.mo54544b().mo56113h()) {
                    sb.append("\tTask ");
                    sb.append(sb3);
                    sb.append(", execution failed with the following error:\n");
                    for (String append : C58869cf.m90936b(new C58903m(10)).mo56153g(((Throwable) mVar.mo54544b().mo56107c()).toString())) {
                        sb.append("\t");
                        sb.append(append);
                        sb.append("\n");
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    static String m28622b(long j) {
        if (j == 0) {
            return "    -----";
        }
        return String.format(Locale.US, "%9.03f", new Object[]{Float.valueOf(((float) j) / 1000000.0f)});
    }

    /* renamed from: c */
    private static C58833ax m28623c(long j, C58833ax axVar) {
        return axVar.mo56106b(new C12513b(j));
    }

    /* renamed from: d */
    private static String m28624d(C58833ax axVar) {
        return m28622b(((Long) axVar.mo56109e(0L)).longValue());
    }
}
