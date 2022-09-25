package com.google.android.libraries.social.populous.storage;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.storage.bp */
/* compiled from: PG */
abstract class C42642bp implements C42688i {
    /* renamed from: f */
    private static C60870cx m75315f(C60870cx cxVar) {
        return C60922j.m93044g(cxVar, C42639bm.f111848a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo45746a(C58485gu guVar, Set set, String str, long j) {
        return m75315f(mo45749e(C42676cw.m75373a(guVar), set, str, j));
    }

    /* renamed from: b */
    public final C60870cx mo45747b(Set set, String str, long j) {
        return m75315f(mo45748d(set, str, j));
    }

    /* renamed from: d */
    public abstract C60870cx mo45748d(Set set, String str, long j);

    /* renamed from: e */
    public abstract C60870cx mo45749e(String str, Set set, String str2, long j);
}
