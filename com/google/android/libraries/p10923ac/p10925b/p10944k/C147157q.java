package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.common.p4552o.p4566l.C60173ck;
import com.google.common.p4552o.p4566l.C60178cp;
import com.google.common.p4552o.p4566l.C60194de;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.ac.b.k.q */
/* compiled from: PG */
public final /* synthetic */ class C147157q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C147159s f397283a;

    /* renamed from: b */
    public final /* synthetic */ long f397284b;

    /* renamed from: c */
    public final /* synthetic */ boolean f397285c;

    /* renamed from: d */
    public final /* synthetic */ C147131af f397286d;

    /* renamed from: e */
    public final /* synthetic */ Long f397287e;

    /* renamed from: f */
    public final /* synthetic */ boolean f397288f;

    /* renamed from: g */
    public final /* synthetic */ boolean f397289g;

    public /* synthetic */ C147157q(C147159s sVar, long j, boolean z, C147131af afVar, Long l, boolean z2, boolean z3) {
        this.f397283a = sVar;
        this.f397284b = j;
        this.f397285c = z;
        this.f397286d = afVar;
        this.f397287e = l;
        this.f397288f = z2;
        this.f397289g = z3;
    }

    public final C60870cx apply(Object obj) {
        C60194de deVar;
        C147159s sVar = this.f397283a;
        long j = this.f397284b;
        boolean z = this.f397285c;
        C147131af afVar = this.f397286d;
        Long l = this.f397287e;
        boolean z2 = this.f397288f;
        boolean z3 = this.f397289g;
        Exception exc = (Exception) obj;
        synchronized (sVar.f397306j.f397318i) {
            C60173ck ckVar = (C60173ck) C60178cp.f162787o.createBuilder();
            if (exc instanceof C147134ai) {
                deVar = C147159s.m239962i((C147134ai) exc);
            } else if (exc instanceof CancellationException) {
                deVar = C60194de.CANCELLED;
            } else if (exc instanceof InterruptedException) {
                deVar = C60194de.INTERRUPTED;
            } else {
                deVar = C60194de.EXECUTION_ERROR;
            }
            ckVar.copyOnWrite();
            C60178cp cpVar = (C60178cp) ckVar.instance;
            cpVar.f162791c = deVar.getNumber();
            cpVar.f162789a |= 2;
            sVar.mo123981d(j, z, afVar, l, z2, z3, ckVar);
        }
        throw exc;
    }
}
