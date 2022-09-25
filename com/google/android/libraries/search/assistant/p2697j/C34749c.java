package com.google.android.libraries.search.assistant.p2697j;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.android.concurrent.C58301z;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69648ae;

/* renamed from: com.google.android.libraries.search.assistant.j.c */
/* compiled from: PG */
public final class C34749c implements C2166e {

    /* renamed from: a */
    final /* synthetic */ Duration f92213a;

    /* renamed from: b */
    final /* synthetic */ C21370a f92214b;

    /* renamed from: c */
    final /* synthetic */ C60888db f92215c;

    /* renamed from: d */
    final /* synthetic */ C69615a f92216d;

    public C34749c(Duration duration, C21370a aVar, C60888db dbVar, C69615a aVar2) {
        this.f92213a = duration;
        this.f92214b = aVar;
        this.f92215c = dbVar;
        this.f92216d = aVar2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo3781a(C2164c cVar) {
        C69648ae aeVar = new C69648ae();
        aeVar.f186027a = C58301z.m89281a(new C34724a(aeVar, this.f92216d, cVar), this.f92213a.toMillis(), Long.MAX_VALUE, TimeUnit.MILLISECONDS, this.f92214b, this.f92215c);
        cVar.mo5436a(new C34748b(aeVar), C60826bg.f164896a);
        return C69788q.f186170a;
    }
}
