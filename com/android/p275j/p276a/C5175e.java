package com.android.p275j.p276a;

import com.android.p275j.C5199k;
import com.evernote.android.state.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.j.a.e */
/* compiled from: PG */
final class C5175e {

    /* renamed from: a */
    long f16441a;

    /* renamed from: b */
    final String f16442b;

    /* renamed from: c */
    final String f16443c;

    /* renamed from: d */
    final long f16444d;

    /* renamed from: e */
    final long f16445e;

    /* renamed from: f */
    final long f16446f;

    /* renamed from: g */
    final long f16447g;

    /* renamed from: h */
    final List f16448h;

    public C5175e(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f16442b = str;
        this.f16443c = true == BuildConfig.FLAVOR.equals(str2) ? null : str2;
        this.f16444d = j;
        this.f16445e = j2;
        this.f16446f = j3;
        this.f16447g = j4;
        this.f16448h = list;
    }

    /* renamed from: a */
    static C5175e m14118a(C5176f fVar) {
        if (C5177g.m14119e(fVar) == 538247942) {
            String h = C5177g.m14121h(fVar);
            String h2 = C5177g.m14121h(fVar);
            long f = C5177g.m14120f(fVar);
            long f2 = C5177g.m14120f(fVar);
            long f3 = C5177g.m14120f(fVar);
            long f4 = C5177g.m14120f(fVar);
            int e = C5177g.m14119e(fVar);
            if (e >= 0) {
                List emptyList = e == 0 ? Collections.emptyList() : new ArrayList();
                for (int i = 0; i < e; i++) {
                    emptyList.add(new C5199k(C5177g.m14121h(fVar).intern(), C5177g.m14121h(fVar).intern()));
                }
                return new C5175e(h, h2, f, f2, f3, f4, emptyList);
            }
            throw new IOException("readHeaderList size=" + e);
        }
        throw new IOException();
    }
}
