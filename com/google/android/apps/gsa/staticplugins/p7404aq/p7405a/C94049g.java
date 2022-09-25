package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import com.google.common.base.C58827ar;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.g */
/* compiled from: PG */
public final class C94049g {

    /* renamed from: a */
    public static final C58827ar f262699a = new C58827ar(" ");

    /* renamed from: b */
    public final String f262700b;

    /* renamed from: c */
    final int f262701c;

    /* renamed from: d */
    final long f262702d;

    /* renamed from: e */
    double f262703e;

    public C94049g(String str, int i, long j) {
        this.f262700b = str;
        this.f262701c = i;
        this.f262702d = j;
    }

    /* renamed from: a */
    public final void mo88314a(String str, double d, Map map) {
        if (map.containsKey(str)) {
            ((C94052j) map.get(str)).f262715d += d;
            return;
        }
        map.put(str, new C94052j(str, d));
    }

    public final String toString() {
        String str = this.f262700b;
        int i = this.f262701c;
        long j = this.f262702d;
        double d = this.f262703e;
        return "GrammarContact[" + str + ",#" + i + ",last-time=" + j + ",weigth=" + d + "]";
    }
}
