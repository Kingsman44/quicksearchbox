package com.google.android.gms.measurement.internal;

import androidx.p060c.C0984n;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
/* compiled from: PG */
final class C145220a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f392547a;

    /* renamed from: b */
    final /* synthetic */ long f392548b;

    /* renamed from: c */
    final /* synthetic */ C145301d f392549c;

    public C145220a(C145301d dVar, String str, long j) {
        this.f392549c = dVar;
        this.f392547a = str;
        this.f392548b = j;
    }

    public final void run() {
        C145301d dVar = this.f392549c;
        String str = this.f392547a;
        long j = this.f392548b;
        dVar.mo120904g();
        C143919bh.m233969l(str);
        Map map = dVar.f392676b;
        if (map.isEmpty()) {
            dVar.f392677c = j;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            dVar.f392676b.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        Map map2 = dVar.f392676b;
        if (((C0984n) map2).f3122d >= 100) {
            dVar.f393011w.mo120965ar().f392798f.mo120894a("Too many ads visible");
            return;
        }
        map2.put(str, 1);
        dVar.f392675a.put(str, Long.valueOf(j));
    }
}
