package com.google.android.libraries.directboot;

import android.content.Context;
import android.content.IntentFilter;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.util.concurrent.C60826bg;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.directboot.a */
/* compiled from: PG */
public final /* synthetic */ class C20671a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ Runnable f57947a;

    /* renamed from: b */
    public final /* synthetic */ Context f57948b;

    public /* synthetic */ C20671a(Runnable runnable, Context context) {
        this.f57947a = runnable;
        this.f57948b = context;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        Runnable runnable = this.f57947a;
        Context context = this.f57948b;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C20673c cVar2 = new C20673c(atomicBoolean, runnable, cVar);
        context.registerReceiver(cVar2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!C20674d.m38856e(context) || !atomicBoolean.compareAndSet(false, true)) {
            cVar.mo5436a(new C20672b(atomicBoolean, context, cVar2), C60826bg.f164896a);
            return "DirectBootUtils.runWhenUnlocked";
        }
        context.unregisterReceiver(cVar2);
        runnable.run();
        cVar.mo5437b((Object) null);
        return "DirectBootUtils.runWhenUnlocked";
    }
}
