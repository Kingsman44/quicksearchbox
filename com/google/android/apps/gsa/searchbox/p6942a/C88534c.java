package com.google.android.apps.gsa.searchbox.p6942a;

import com.google.android.apps.gsa.store.C118329t;
import com.google.android.apps.gsa.store.C118333v;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59291p;
import com.google.common.p4537i.C59294s;
import com.google.common.p4552o.anh;
import com.google.common.p4552o.aov;
import com.google.common.p4552o.apd;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.searchbox.a.c */
/* compiled from: PG */
public final /* synthetic */ class C88534c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C88536e f239276a;

    /* renamed from: b */
    public final /* synthetic */ long f239277b;

    /* renamed from: c */
    public final /* synthetic */ apd f239278c;

    /* renamed from: d */
    public final /* synthetic */ int f239279d;

    public /* synthetic */ C88534c(C88536e eVar, long j, apd apd, int i) {
        this.f239276a = eVar;
        this.f239277b = j;
        this.f239278c = apd;
        this.f239279d = i;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C88536e eVar = this.f239276a;
        long j = this.f239277b;
        apd apd = this.f239278c;
        int i = this.f239279d;
        C59291p c = ((C59277b) C59294s.m92133c()).mo56765c(8);
        c.mo56745f(j);
        String nVar = c.mo56758p().toString();
        C118329t e = eVar.f239287h.mo91760e();
        C118333v b = e.mo103668b(nVar, apd.toByteArray(), C88536e.f239281b.longValue(), TimeUnit.DAYS);
        b.mo103672a(C88536e.f239282c, Long.valueOf(j));
        b.mo103672a(C88536e.f239283d, Long.valueOf((long) i));
        anh anh = null;
        if ((apd.f159583a & 4096) != 0) {
            aov aov = apd.f159619k;
            if (aov == null) {
                aov = aov.f159510u;
            }
            if ((aov.f159512a & 16384) != 0 && (anh = aov.f159527p) == null) {
                anh = anh.f159362e;
            }
        }
        if (anh != null) {
            int i2 = anh.f159364a;
            if (!((i2 & 2) == 0 || (i2 & 1) == 0 || (i2 & 4) == 0)) {
                b.mo103673b(C88536e.f239284e, anh.f159366c);
                b.mo103673b(C88536e.f239285f, anh.f159365b);
                b.mo103673b(C88536e.f239286g, anh.f159367d);
            }
        }
        return eVar.f239287h.mo91762h(e.mo103669c());
    }
}
