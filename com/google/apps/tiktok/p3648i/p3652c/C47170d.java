package com.google.apps.tiktok.p3648i.p3652c;

import android.content.Context;
import androidx.p182p.C3918aa;
import androidx.p182p.C3919ab;
import androidx.p182p.C3921ad;
import androidx.p182p.C3925ah;
import androidx.p182p.p184b.C3937a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.i.c.d */
/* compiled from: PG */
public final class C47170d {
    /* renamed from: a */
    public static C3925ah m83916a(Context context, Executor executor, C47174h hVar, Class cls, Callable callable, Object... objArr) {
        C3919ab a = C3918aa.m11218a(context, cls, "0xDEADBEEF");
        a.mo8160f(executor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C69664n.m101061g(timeUnit, "autoCloseTimeUnit");
        a.f12538g = 60;
        a.f12539h = timeUnit;
        a.f12533b = new C47169c(context, callable);
        a.mo8157c((C3937a[]) hVar.mo51087c().toArray(new C3937a[hVar.mo51087c().size()]));
        if (((Boolean) hVar.mo51086b().mo56109e(false)).booleanValue()) {
            a.mo8158d();
        }
        C3921ad adVar = C3921ad.WRITE_AHEAD_LOGGING;
        C69664n.m101061g(adVar, "journalMode");
        a.f12535d = adVar;
        return a.mo8155a();
    }
}
