package com.google.android.play.core.p3538g.p3541c;

import android.os.SystemClock;
import com.google.android.play.core.p3538g.C45137aw;
import java.util.List;

/* renamed from: com.google.android.play.core.g.c.f */
/* compiled from: PG */
public final /* synthetic */ class C45152f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45160n f117865a;

    /* renamed from: b */
    public final /* synthetic */ long f117866b;

    /* renamed from: c */
    public final /* synthetic */ List f117867c;

    /* renamed from: d */
    public final /* synthetic */ List f117868d;

    /* renamed from: e */
    public final /* synthetic */ List f117869e;

    public /* synthetic */ C45152f(C45160n nVar, long j, List list, List list2, List list3) {
        this.f117865a = nVar;
        this.f117866b = j;
        this.f117867c = list;
        this.f117868d = list2;
        this.f117869e = list3;
    }

    public final void run() {
        C45160n nVar = this.f117865a;
        long j = this.f117866b;
        List list = this.f117867c;
        List list2 = this.f117868d;
        List list3 = this.f117869e;
        long j2 = j / 3;
        long j3 = 0;
        int i = 0;
        while (i < 3) {
            long min = Math.min(j, j3 + j2);
            int i2 = i;
            nVar.mo49006n(2, 0, Long.valueOf(min), Long.valueOf(j), (List) null, (Integer) null, (List) null);
            SystemClock.sleep(C45160n.f117884a);
            C45137aw j4 = nVar.mo49003j();
            if (j4.mo48947c() != 9 && j4.mo48947c() != 7 && j4.mo48947c() != 6) {
                i = i2 + 1;
                j3 = min;
            } else {
                return;
            }
        }
        nVar.f117888e.execute(new C45149c(nVar, list, list2, list3, j));
    }
}
