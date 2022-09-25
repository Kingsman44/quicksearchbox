package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97280c;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22844o;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60761r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.v */
/* compiled from: PG */
public final /* synthetic */ class C116066v implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321831a;

    /* renamed from: b */
    public final /* synthetic */ String f321832b;

    /* renamed from: c */
    public final /* synthetic */ LongSparseArray f321833c;

    /* renamed from: d */
    public final /* synthetic */ long f321834d;

    public /* synthetic */ C116066v(C116070z zVar, String str, LongSparseArray longSparseArray, long j) {
        this.f321831a = zVar;
        this.f321832b = str;
        this.f321833c = longSparseArray;
        this.f321834d = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        int i;
        long[] jArr;
        C116070z zVar = this.f321831a;
        String str = this.f321832b;
        LongSparseArray longSparseArray = this.f321833c;
        long j = this.f321834d;
        C22831b bVar = (C22831b) zVar.f321845f.get(str);
        if (bVar == null) {
            return false;
        }
        long b = zVar.f321842c.mo26870b();
        HashSet hashSet = new HashSet();
        int size = longSparseArray.size();
        if (size == 0) {
            jArr = new long[0];
            i = 3;
        } else {
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < size) {
                C97280c cVar = (C97280c) longSparseArray.valueAt(i2);
                String str2 = cVar.f271693b;
                if (str2 != null) {
                    hashSet.add(str2.toLowerCase(Locale.getDefault()));
                }
                int i3 = size;
                long j3 = cVar.f271655a;
                if (j3 < j2) {
                    j2 = j3;
                }
                i2++;
                size = i3;
            }
            long millis = TimeUnit.MICROSECONDS.toMillis(j2);
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (C22845p pVar : bVar.f62862a) {
                int a = C22840k.m42693a(pVar.f62894c);
                if (a != 0 && a == 2) {
                    long j4 = pVar.f62895d;
                    if (j4 < j) {
                        if (j4 < millis) {
                            i4++;
                            arrayList.add(Long.valueOf(pVar.f62893b));
                            C58976aa aaVar = C58975e.f156826a;
                        } else if (b - j4 > 180000) {
                            C22844o oVar = pVar.f62897f;
                            if (oVar == null) {
                                oVar = C22844o.f62884e;
                            }
                            if (!hashSet.contains(oVar.f62887b.toLowerCase(Locale.getDefault()))) {
                                arrayList.add(Long.valueOf(pVar.f62893b));
                                C58976aa aaVar2 = C58975e.f156826a;
                            }
                        }
                    }
                }
            }
            i = 3;
            if (i4 > 0) {
                C116047c.m192399a(i4, 3);
            }
            jArr = C60761r.m92761g(arrayList);
        }
        int n = C116070z.m192422n(bVar, jArr);
        int length = jArr.length;
        C116070z.m192423w(i, i, length, n);
        zVar.mo102438h(jArr, str);
        return Boolean.valueOf(length > 0);
    }
}
