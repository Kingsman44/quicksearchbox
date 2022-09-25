package com.google.android.libraries.search.p2904c.p2962q.p2963a;

import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37675hv;
import com.google.android.libraries.search.p2904c.C37676hw;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.q.a.f */
/* compiled from: PG */
final class C37952f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37953g f100564a;

    public C37952f(C37953g gVar) {
        this.f100564a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37516dw dwVar;
        C37514du duVar = (C37514du) obj;
        if (duVar.f99631a == 1) {
            C37954h hVar = this.f100564a.f100566b;
            C37675hv hvVar = (C37675hv) C37676hw.f100061e.createBuilder();
            if (duVar.f99631a == 1) {
                dwVar = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
                if (dwVar == null) {
                    dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                }
            } else {
                dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            hvVar.copyOnWrite();
            C37676hw hwVar = (C37676hw) hvVar.instance;
            hwVar.f100065c = Integer.valueOf(dwVar.f99638d);
            hwVar.f100064b = 3;
            int i = this.f100564a.f100567c;
            hvVar.copyOnWrite();
            C37676hw hwVar2 = (C37676hw) hvVar.instance;
            hwVar2.f100066d = i - 1;
            hwVar2.f100063a |= 1;
            C37676hw hwVar3 = (C37676hw) hvVar.build();
            hVar.mo41165b();
        }
    }
}
