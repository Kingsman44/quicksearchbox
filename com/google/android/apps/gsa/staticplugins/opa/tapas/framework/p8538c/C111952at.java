package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113165bw;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4520a.C58206am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.at */
/* compiled from: PG */
public final /* synthetic */ class C111952at implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111971bl f311021a;

    public /* synthetic */ C111952at(C111971bl blVar) {
        this.f311021a = blVar;
    }

    public final void run() {
        int i;
        C111971bl blVar = this.f311021a;
        ArrayList arrayList = new ArrayList();
        long a = blVar.f311057d.mo26884a();
        Iterator it = ((C58206am) blVar.f311066m).f155647a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C113165bw bwVar = (C113165bw) entry.getKey();
            C111970bk bkVar = (C111970bk) entry.getValue();
            if (!bkVar.mo99278d().isCancelled()) {
                long b = (bkVar.mo99276b() - C111971bl.f311055c.toNanos()) + C111971bl.f311054b.toNanos();
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[6];
                objArr[0] = bkVar.mo99278d().isDone() ? bkVar.mo99321h(blVar.f311058e) ? "ready" : "invalid" : "loading";
                objArr[1] = bwVar.mo99884f();
                C51331dt b2 = bwVar.mo99879b();
                C51331dt dtVar = C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL;
                int ordinal = b2.ordinal();
                objArr[2] = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "?" : "fully_trusted" : "trusted" : "untrusted" : "unknown";
                objArr[3] = bwVar.mo99880c().name();
                double b3 = (double) (bkVar.mo99276b() - a);
                Double.isNaN(b3);
                objArr[4] = Double.valueOf(b3 / 1.0E9d);
                double d = (double) (b - a);
                Double.isNaN(d);
                objArr[5] = Double.valueOf(d / 1.0E9d);
                arrayList.add(String.format(locale, "\t%s: '%s/%s/%s' (Refresh in %.1fs, TTL: %.1fs)\n", objArr));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder("Suggestion Cache State:\n");
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            sb.append((String) arrayList.get(i));
        }
        blVar.f311063j.mo99076a(C111255r.CACHE, sb.toString());
    }
}
