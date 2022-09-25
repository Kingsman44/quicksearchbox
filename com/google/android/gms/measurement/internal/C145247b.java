package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.b */
/* compiled from: PG */
final class C145247b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f392618a;

    /* renamed from: b */
    final /* synthetic */ long f392619b;

    /* renamed from: c */
    final /* synthetic */ C145301d f392620c;

    public C145247b(C145301d dVar, String str, long j) {
        this.f392620c = dVar;
        this.f392618a = str;
        this.f392619b = j;
    }

    public final void run() {
        C145301d dVar = this.f392620c;
        String str = this.f392618a;
        long j = this.f392619b;
        dVar.mo120904g();
        C143919bh.m233969l(str);
        Integer num = (Integer) dVar.f392676b.get(str);
        if (num != null) {
            C145423hn i = dVar.f393011w.mo120974l().mo121122i(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                dVar.f392676b.remove(str);
                Long l = (Long) dVar.f392675a.get(str);
                if (l == null) {
                    dVar.f393011w.mo120965ar().f392795c.mo120894a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    dVar.f392675a.remove(str);
                    dVar.mo120851d(str, j - longValue, i);
                }
                if (dVar.f392676b.isEmpty()) {
                    long j2 = dVar.f392677c;
                    if (j2 == 0) {
                        dVar.f393011w.mo120965ar().f392795c.mo120894a("First ad exposure time was never set");
                        return;
                    }
                    dVar.mo120850c(j - j2, i);
                    dVar.f392677c = 0;
                    return;
                }
                return;
            }
            dVar.f392676b.put(str, Integer.valueOf(intValue));
            return;
        }
        dVar.f393011w.mo120965ar().f392795c.mo120895b("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
