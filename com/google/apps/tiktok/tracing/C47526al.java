package com.google.apps.tiktok.tracing;

import android.util.Log;
import android.util.SparseArray;
import androidx.p060c.C0981k;
import com.google.android.libraries.p11012aj.p11014b.C147597a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.google.apps.tiktok.tracing.al */
/* compiled from: PG */
public final class C47526al implements C47779do, C147597a {

    /* renamed from: a */
    private final C47541b f123363a;

    public C47526al(C47541b bVar) {
        this.f123363a = bVar;
    }

    /* renamed from: c */
    private static void m84587c(C47814ew ewVar, int i) {
        String concat;
        if ((ewVar.f123832a & 16) != 0) {
            C47860t tVar = ewVar.f123838g;
            if (tVar == null) {
                tVar = C47860t.f123928d;
            }
            if ((tVar.f123930a & 2) != 0) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = ((C47556bg) ewVar.f123835d.get(0)).f123407b;
                C47857q qVar = tVar.f123932c;
                if (qVar == null) {
                    qVar = C47857q.f123919d;
                }
                objArr[1] = Integer.valueOf(qVar.f123923c);
                Log.println(i, "trace_manager", String.format(locale, "Trace %s timed out before completion. %s spans remaining", objArr));
            }
            if ((tVar.f123930a & 1) != 0) {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[2];
                objArr2[0] = ((C47556bg) ewVar.f123835d.get(0)).f123407b;
                C47859s sVar = tVar.f123931b;
                if (sVar == null) {
                    sVar = C47859s.f123924c;
                }
                objArr2[1] = Integer.valueOf(sVar.f123927b);
                Log.println(i, "trace_manager", String.format(locale2, "Trace %s tried to log too many spans. %s spans dropped", objArr2));
            }
        }
        C0981k kVar = new C0981k(10);
        for (C47556bg bgVar : ewVar.f123835d) {
            kVar.mo3682i((long) bgVar.f123408c, bgVar);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < kVar.mo3675c(); i2++) {
            C47556bg bgVar2 = (C47556bg) kVar.mo3680g(i2);
            long j = (long) bgVar2.f123408c;
            String str = bgVar2.f123411f + " ms";
            while (true) {
                C47556bg bgVar3 = (C47556bg) kVar.mo3678e(j);
                if (bgVar3 != null) {
                    long j2 = (long) bgVar3.f123409d;
                    str = bgVar3.f123407b + " > " + str;
                    if (j2 == -1) {
                        concat = str;
                        break;
                    }
                    j = j2;
                } else {
                    concat = "Orphaned Root > ".concat(str);
                    break;
                }
            }
            arrayList.add(String.format(Locale.US, "%06d\t%s", new Object[]{Long.valueOf(bgVar2.f123410e), concat}));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Log.println(i, "trace_manager", (String) arrayList.get(i3));
        }
    }

    /* renamed from: a */
    public final C60870cx mo51390a() {
        if (this.f123363a.mo51404a().isEmpty()) {
            return C60866ct.f164955a;
        }
        if (Log.isLoggable("trace_manager", 4)) {
            Log.i("trace_manager", "The following traces were active when the app crashed:");
            int i = 0;
            for (C47814ew c : this.f123363a.mo51404a().values()) {
                Log.println(4, "trace_manager", "Trace: " + i);
                m84587c(c, 4);
                i++;
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final void mo51372b(C47814ew ewVar, SparseArray sparseArray) {
        if (Log.isLoggable("trace_manager", 2)) {
            m84587c(ewVar, 2);
        }
    }
}
