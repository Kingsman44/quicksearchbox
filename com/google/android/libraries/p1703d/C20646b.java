package com.google.android.libraries.p1703d;

import android.os.Bundle;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.d.b */
/* compiled from: PG */
public abstract class C20646b {

    /* renamed from: a */
    private static final C58528ij f57884a = C58528ij.m90012L("status_code", "last_update_time_ms", "version");

    /* renamed from: c */
    public static C20646b m38758c(Bundle bundle) {
        C20636a aVar;
        String string;
        int i = bundle.getInt("status_code", -1);
        C20636a[] values = C20636a.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i2];
            if (aVar.f57881c == i) {
                break;
            }
            i2++;
        }
        if (aVar == null) {
            return null;
        }
        long j = bundle.getLong("last_update_time_ms", 0);
        C58490gz gzVar = new C58490gz(4);
        for (String str : bundle.keySet()) {
            if (!f57884a.contains(str) && (string = bundle.getString(str)) != null) {
                gzVar.mo55429h(str, string);
            }
        }
        return new C20647c(aVar, j, gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public abstract long mo25602a();

    /* renamed from: b */
    public abstract C20636a mo25603b();

    /* renamed from: d */
    public abstract C58495hd mo25604d();
}
