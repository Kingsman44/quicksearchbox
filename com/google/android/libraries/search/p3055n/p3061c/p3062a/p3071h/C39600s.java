package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.h.s */
/* compiled from: PG */
public final /* synthetic */ class C39600s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39605x f104245a;

    public /* synthetic */ C39600s(C39605x xVar) {
        this.f104245a = xVar;
    }

    public final Object call() {
        C39605x xVar = this.f104245a;
        C59052c cVar = (C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53711);
        C37360ay ayVar = xVar.f104259f.f100035d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        Integer valueOf = Integer.valueOf(ayVar.f99227b);
        C37360ay ayVar2 = xVar.f104259f.f100035d;
        Integer valueOf2 = Integer.valueOf((ayVar2 == null ? C37360ay.f99224l : ayVar2).f99228c);
        Integer valueOf3 = Integer.valueOf((ayVar2 == null ? C37360ay.f99224l : ayVar2).f99229d);
        Integer valueOf4 = Integer.valueOf((ayVar2 == null ? C37360ay.f99224l : ayVar2).f99230e);
        if (ayVar2 == null) {
            ayVar2 = C37360ay.f99224l;
        }
        cVar.mo56362O("Opening hotword mic with params: sourceType=%s,sampleRate=%sHz,channelConfig=%s,encodingFormat=%s, use push mechanism : %b. audioRouteRequestParamsOptional.isPresent() : %b.", valueOf, valueOf2, valueOf3, valueOf4, Boolean.valueOf(ayVar2.f99236k), Boolean.valueOf(xVar.f104260g.mo56113h()));
        return xVar.f104257d.mo41062b((C37462ck) xVar.f104260g.mo56107c()).mo41281a(xVar.f104259f);
    }
}
