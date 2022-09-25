package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97278ah;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60761r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.p */
/* compiled from: PG */
public final /* synthetic */ class C116060p implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321819a;

    /* renamed from: b */
    public final /* synthetic */ String f321820b;

    /* renamed from: c */
    public final /* synthetic */ LongSparseArray f321821c;

    /* renamed from: d */
    public final /* synthetic */ long f321822d;

    public /* synthetic */ C116060p(C116070z zVar, String str, LongSparseArray longSparseArray, long j) {
        this.f321819a = zVar;
        this.f321820b = str;
        this.f321821c = longSparseArray;
        this.f321822d = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116070z zVar = this.f321819a;
        String str = this.f321820b;
        LongSparseArray longSparseArray = this.f321821c;
        long j = this.f321822d;
        C22831b bVar = (C22831b) zVar.f321845f.get(str);
        if (bVar == null) {
            return false;
        }
        long b = zVar.f321842c.mo26870b();
        HashSet hashSet = new HashSet();
        int size = longSparseArray.size();
        long j2 = Long.MAX_VALUE;
        int i = 0;
        while (i < size) {
            C97278ah ahVar = (C97278ah) longSparseArray.valueAt(i);
            String str2 = ahVar.f271689b;
            if (str2 != null) {
                hashSet.add(str2.toLowerCase(Locale.getDefault()));
            }
            C116070z zVar2 = zVar;
            long j3 = ahVar.f271655a;
            if (j3 < j2) {
                j2 = j3;
            }
            i++;
            zVar = zVar2;
        }
        C116070z zVar3 = zVar;
        long millis = TimeUnit.MICROSECONDS.toMillis(j2);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (C22845p pVar : bVar.f62862a) {
            int a = C22840k.m42693a(pVar.f62894c);
            if (a == 0) {
                a = 1;
            }
            if (a == 1 || a == 13 || a == 11) {
                long j4 = pVar.f62895d;
                if (j4 < j) {
                    if (j4 < millis) {
                        i2++;
                        arrayList.add(Long.valueOf(pVar.f62893b));
                        C58976aa aaVar = C58975e.f156826a;
                    } else if (b - j4 > 180000 && !hashSet.contains(pVar.f62896e.toLowerCase(Locale.getDefault()))) {
                        arrayList.add(Long.valueOf(pVar.f62893b));
                        C58976aa aaVar2 = C58975e.f156826a;
                    }
                }
            }
        }
        if (i2 > 0) {
            C116047c.m192399a(i2, 2);
        }
        long[] g = C60761r.m92761g(arrayList);
        int n = C116070z.m192422n(bVar, g);
        C58976aa aaVar3 = C58975e.f156826a;
        int length = g.length;
        C116070z.m192423w(3, 2, length, n);
        zVar3.mo102438h(g, str);
        return Boolean.valueOf(length > 0);
    }
}
