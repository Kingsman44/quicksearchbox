package com.google.android.libraries.social.populous.p3296e.p3302f;

import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.e.f.c */
/* compiled from: PG */
final class C42522c {

    /* renamed from: a */
    final boolean f111506a;

    /* renamed from: b */
    final C42405ab f111507b;

    /* renamed from: c */
    final int f111508c;

    /* renamed from: d */
    final Map f111509d = new HashMap();

    /* renamed from: e */
    final Set f111510e = new HashSet();

    /* renamed from: f */
    final Boolean[] f111511f;

    /* renamed from: g */
    Double f111512g;

    /* renamed from: h */
    Integer f111513h;

    public C42522c(C42405ab abVar, int i, boolean z, int i2) {
        this.f111507b = abVar;
        this.f111508c = i;
        this.f111506a = z;
        this.f111511f = new Boolean[i2];
    }

    /* renamed from: a */
    public final void mo45542a(C42522c cVar) {
        double b = C42524e.m74972b(cVar.f111507b);
        Double d = this.f111512g;
        if (d == null || d.doubleValue() < b) {
            this.f111512g = Double.valueOf(b);
            this.f111513h = Integer.valueOf(cVar.f111508c);
        }
    }
}
