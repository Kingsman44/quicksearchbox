package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2794d.C36496e;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36499c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2795e.C36501e;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36604g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36618u;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36536h;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.an */
/* compiled from: PG */
final class C36568an implements C36618u {

    /* renamed from: a */
    public final C36536h f95370a;

    /* renamed from: b */
    public final Executor f95371b;

    /* renamed from: c */
    public final C36608k f95372c;

    /* renamed from: d */
    public final C60836bq f95373d = new C60836bq();

    /* renamed from: e */
    private final C36501e f95374e;

    public C36568an(C36536h hVar, C36501e eVar, Executor executor, C36608k kVar) {
        this.f95370a = hVar;
        this.f95374e = eVar;
        this.f95371b = executor;
        this.f95372c = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo40221a(C36604g gVar) {
        C36501e eVar = this.f95374e;
        C36499c cVar = C36499c.SEND_NOTIFICATION_EVENT;
        C36567am amVar = new C36567am(this, gVar);
        C36609l a = C36609l.m65137a(this.f95372c.f95443b);
        if (a == null) {
            a = C36609l.UNRECOGNIZED;
        }
        return eVar.mo40205b(cVar, amVar, a.getNumber());
    }

    /* renamed from: b */
    public final C36536h mo40222b(C36476g gVar) {
        C36536h hVar = this.f95370a;
        C70334de deVar = new C70334de();
        C36496e.m65044b(deVar, gVar);
        return (C36536h) hVar.mo62576o(new C70879r(deVar));
    }
}
