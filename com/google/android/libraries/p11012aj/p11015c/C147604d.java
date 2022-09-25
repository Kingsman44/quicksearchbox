package com.google.android.libraries.p11012aj.p11015c;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.aj.c.d */
/* compiled from: PG */
public final class C147604d {
    /* renamed from: a */
    public static void m240679a(Map map) {
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            C47558bi s = C47831fm.m85024s((String) entry.getKey());
            try {
                ((C147601a) ((C69464a) entry.getValue()).mo17428b()).mo29159ln();
                s.close();
            } catch (Throwable th) {
                C147602b.m240677a(th, th);
            }
        }
        return;
        throw th;
    }
}
