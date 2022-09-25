package com.google.apps.tiktok.account.p3606d;

import android.content.Context;
import com.google.android.libraries.storage.p3315b.C42822ah;
import com.google.android.libraries.storage.p3315b.C42823ai;
import com.google.android.libraries.storage.p3315b.C42835au;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.android.libraries.storage.p3315b.C42852g;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.common.base.C58838bb;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.apps.tiktok.account.d.e */
/* compiled from: PG */
public final class C46087e {

    /* renamed from: a */
    public final C46092j f120958a;

    /* renamed from: b */
    private final C42852g f120959b;

    public C46087e(C46092j jVar, C42852g gVar) {
        this.f120958a = jVar;
        this.f120959b = gVar;
    }

    /* renamed from: a */
    public final C42850e mo50195a(String str, C42835au auVar) {
        return mo50196b(str, auVar, C47153d.m83864c(1));
    }

    /* renamed from: b */
    public final C42850e mo50196b(String str, C42835au auVar, C47153d dVar) {
        C42852g gVar = this.f120959b;
        C58838bb.m90868c(!str.contains(File.separator));
        C46086d dVar2 = new C46086d(this, dVar, str);
        Context context = (Context) gVar.f112143a.mo17428b();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) gVar.f112144b.mo17428b();
        scheduledExecutorService.getClass();
        C42822ah ahVar = (C42822ah) gVar.f112145c.mo17428b();
        ahVar.getClass();
        auVar.getClass();
        return new C42850e(new C42823ai(context, scheduledExecutorService, ahVar, dVar2, auVar, (String) null));
    }
}
