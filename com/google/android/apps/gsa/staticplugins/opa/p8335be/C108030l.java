package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58758qx;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.l */
/* compiled from: PG */
public final /* synthetic */ class C108030l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108035q f300532a;

    /* renamed from: b */
    public final /* synthetic */ Set f300533b;

    /* renamed from: c */
    public final /* synthetic */ int f300534c;

    /* renamed from: d */
    public final /* synthetic */ int f300535d;

    public /* synthetic */ C108030l(C108035q qVar, Set set, int i, int i2) {
        this.f300532a = qVar;
        this.f300533b = set;
        this.f300534c = i;
        this.f300535d = i2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108035q qVar = this.f300532a;
        Set<byte[]> set = this.f300533b;
        int i = this.f300534c;
        int i2 = this.f300535d;
        Set set2 = (Set) obj;
        HashSet hashSet = new HashSet();
        for (byte[] k : set) {
            hashSet.add(qVar.f300541c.mo96370a(i, i2, C58833ax.m90834k(k)));
        }
        return qVar.mo96372a(C58758qx.m90645c(set2, hashSet), "deleteObjects");
    }
}
