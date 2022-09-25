package com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9388c;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C124531c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C124532d f343596a;

    /* renamed from: b */
    public final /* synthetic */ String f343597b;

    /* renamed from: c */
    public final /* synthetic */ String f343598c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f343599d;

    /* renamed from: e */
    public final /* synthetic */ Duration f343600e;

    public /* synthetic */ C124531c(C124532d dVar, String str, String str2, byte[] bArr, Duration duration) {
        this.f343596a = dVar;
        this.f343597b = str;
        this.f343598c = str2;
        this.f343599d = bArr;
        this.f343600e = duration;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C124532d dVar = this.f343596a;
        C146006ab e = C146021aq.m237851e(dVar.f343602b.mo123258a(this.f343597b, this.f343598c, this.f343599d), this.f343600e.toMillis(), TimeUnit.MILLISECONDS);
        C146014aj ajVar = (C146014aj) e;
        ajVar.mo122495n(C146013ai.f394700a, new C124529a(cVar));
        ajVar.mo122494m(C146013ai.f394700a, new C124530b(cVar));
        return e;
    }
}
