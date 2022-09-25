package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.p2982x.C38248g;
import com.google.android.libraries.search.p2904c.p2982x.C38250i;
import com.google.android.libraries.search.p2904c.p2982x.C38264w;
import com.google.android.libraries.search.p2904c.p2982x.C38265x;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.c.k.a.k */
/* compiled from: PG */
public final /* synthetic */ class C37803k implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C37810r f100308a;

    /* renamed from: b */
    public final /* synthetic */ C37662hi f100309b;

    public /* synthetic */ C37803k(C37810r rVar, C37662hi hiVar) {
        this.f100308a = rVar;
        this.f100309b = hiVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C37810r rVar = this.f100308a;
        C37662hi hiVar = this.f100309b;
        C38248g gVar = rVar.f100325b;
        C38264w wVar = (C38264w) C38265x.f101374c.createBuilder();
        wVar.copyOnWrite();
        C38265x xVar = (C38265x) wVar.instance;
        hiVar.getClass();
        xVar.f101377b = hiVar;
        xVar.f101376a |= 1;
        C38265x xVar2 = (C38265x) wVar.build();
        C37360ay ayVar = hiVar.f100035d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        C58881cr a = C58886cw.m90973a(new C37802j(rVar, ayVar));
        C37360ay ayVar2 = hiVar.f100035d;
        if (ayVar2 == null) {
            ayVar2 = C37360ay.f99224l;
        }
        C70876o.m103763d(gVar.f189039a.mo39510a(C38250i.m67541i(), gVar.f189040b), xVar2, C47686k.m84827a(new C37809q(cVar, a, C58886cw.m90973a(new C37804l(rVar, ayVar2)), rVar.f100327d)), true);
        return "hotwordListeningSessionFuture";
    }
}
