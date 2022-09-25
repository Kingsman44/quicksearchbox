package com.google.android.libraries.search.logging.p3039b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;

/* renamed from: com.google.android.libraries.search.logging.b.a */
/* compiled from: PG */
public final /* synthetic */ class C38829a {
    @Deprecated
    /* renamed from: a */
    public static void m68180a(C60548tz tzVar, long j, C21370a aVar) {
        long b = aVar.mo26870b();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        C60555uf ufVar2 = C60555uf.f164065cO;
        ufVar.f164093a |= 1;
        ufVar.f164257l = b + j;
        long c = aVar.mo26871c();
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164250e |= 16;
        ufVar3.f164094aA = c + j;
        long d = aVar.mo26872d();
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        ufVar4.f164250e |= 4096;
        ufVar4.f164099aF = d + (j * 1000000);
    }
}
