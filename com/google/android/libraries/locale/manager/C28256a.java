package com.google.android.libraries.locale.manager;

import android.content.Context;
import android.os.Build;
import androidx.work.C4390an;
import androidx.work.C4391ao;
import androidx.work.C4410f;
import androidx.work.C4634o;
import androidx.work.impl.C4452ag;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.locale.manager.a */
/* compiled from: PG */
public final class C28256a {

    /* renamed from: a */
    public static final String f76907a = String.valueOf(C28256a.class.getName()).concat(".SyncApplicationLocalesWorker");

    /* renamed from: a */
    public static C60870cx m52817a(Context context) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        if (Build.VERSION.SDK_INT < 33) {
            return C60866ct.f164955a;
        }
        C4390an anVar = new C4390an(SyncApplicationLocalesWorker.class, 1, timeUnit, 4, timeUnit2);
        C4410f fVar = new C4410f();
        fVar.f14073c = true;
        anVar.mo9339d(fVar.mo9349a());
        return C60922j.m93044g(C4452ag.m12686j(context).mo9331e(f76907a, C4634o.REPLACE, (C4391ao) anVar.mo9337b()).mo9320a(), new C58819aj((Object) null), C60826bg.f164896a);
    }
}
