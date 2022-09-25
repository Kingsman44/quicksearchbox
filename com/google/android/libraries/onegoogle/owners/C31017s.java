package com.google.android.libraries.onegoogle.owners;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.mdi.p2213d.p2219c.C28682k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.owners.s */
/* compiled from: PG */
public final class C31017s {
    /* renamed from: a */
    public static C31012n m57893a(Context context, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        C31016r rVar = new C31016r();
        rVar.f83519a = context.getApplicationContext();
        rVar.f83520b = (ExecutorService) ((C58847bk) axVar2).f156646a;
        rVar.f83521c = (ScheduledExecutorService) ((C58847bk) axVar3).f156646a;
        rVar.f83522d = (Handler) ((C58847bk) axVar).f156646a;
        rVar.f83524f = (C28682k) ((C58847bk) axVar4).f156646a;
        return rVar.mo36683a();
    }
}
