package com.google.android.libraries.search.p2904c.p2962q.p2963a;

import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37675hv;
import com.google.android.libraries.search.p2904c.C37676hw;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.q.a.g */
/* compiled from: PG */
final class C37953g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f100565a;

    /* renamed from: b */
    final /* synthetic */ C37954h f100566b;

    /* renamed from: c */
    final /* synthetic */ int f100567c;

    public C37953g(C37954h hVar, int i, C60870cx cxVar) {
        this.f100566b = hVar;
        this.f100567c = i;
        this.f100565a = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37563ed edVar;
        C37561eb ebVar = (C37561eb) obj;
        if (ebVar.f99802a == 1) {
            C37954h hVar = this.f100566b;
            C37675hv hvVar = (C37675hv) C37676hw.f100061e.createBuilder();
            if (ebVar.f99802a == 1) {
                edVar = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
                if (edVar == null) {
                    edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                }
            } else {
                edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            hvVar.copyOnWrite();
            C37676hw hwVar = (C37676hw) hvVar.instance;
            hwVar.f100065c = Integer.valueOf(edVar.f99809d);
            hwVar.f100064b = 2;
            int i = this.f100567c;
            hvVar.copyOnWrite();
            C37676hw hwVar2 = (C37676hw) hvVar.instance;
            hwVar2.f100066d = i - 1;
            hwVar2.f100063a |= 1;
            C37676hw hwVar3 = (C37676hw) hvVar.build();
            hVar.mo41165b();
            C60856cj.m92911t(this.f100565a, C47810es.m84974n(new C37952f(this)), this.f100566b.f100569a);
        }
    }
}
