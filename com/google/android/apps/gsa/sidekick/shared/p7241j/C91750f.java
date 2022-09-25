package com.google.android.apps.gsa.sidekick.shared.p7241j;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.j.f */
/* compiled from: PG */
public final class C91750f {

    /* renamed from: a */
    static final long f255875a = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public static boolean m150308a(Intent intent, Query query) {
        if (intent.getBooleanExtra("disable-opt-in", false) || C90722af.m148174b(intent)) {
            return false;
        }
        if (query != null && query.mo84420dA() && query.f252767f == QueryTriggerType.USER && query.f252770i.isEmpty()) {
            return true;
        }
        if (query != null && (query.mo84420dA() || query.mo84369cB())) {
            return false;
        }
        if (query == null || TextUtils.isEmpty(query.f252768g)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m150309b(C21370a aVar, long j) {
        long b = aVar.mo26870b() - j;
        return b >= 0 && b < f255875a;
    }
}
