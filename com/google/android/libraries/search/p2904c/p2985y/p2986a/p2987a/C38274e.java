package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37596fh;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.android.libraries.search.p2904c.C37663hj;
import com.google.android.libraries.search.p2904c.C37664hk;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.y.a.a.e */
/* compiled from: PG */
final class C38274e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f101397a;

    /* renamed from: b */
    final /* synthetic */ C37773c f101398b;

    /* renamed from: c */
    final /* synthetic */ C38280k f101399c;

    public C38274e(C38280k kVar, long j, C37773c cVar) {
        this.f101399c = kVar;
        this.f101397a = j;
        this.f101398b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38280k.f101415b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) d).mo56372aa(53067)).mo56388r("#audio# cannot retrieve hotword client session(token(%d)) start listening status", this.f101397a);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        C37663hj hjVar = (C37663hj) C37664hk.f100038c.createBuilder();
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C37519dz dzVar = C37519dz.FAILED_OPENING_ERROR_RETRIEVING_STATUS;
        eaVar.copyOnWrite();
        C37561eb ebVar = (C37561eb) eaVar.instance;
        ebVar.f99803b = Integer.valueOf(dzVar.f99687U);
        ebVar.f99802a = 2;
        C37561eb ebVar2 = (C37561eb) eaVar.build();
        hjVar.copyOnWrite();
        C37664hk hkVar = (C37664hk) hjVar.instance;
        ebVar2.getClass();
        hkVar.f100041b = ebVar2;
        hkVar.f100040a |= 1;
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        C37664hk hkVar2 = (C37664hk) hjVar.build();
        hkVar2.getClass();
        fjVar.f99916c = hkVar2;
        fjVar.f99915b = 100;
        long j = this.f101397a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        if (C37772b.m66674a(this.f101398b.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101398b;
            fhVar.copyOnWrite();
            C37598fj fjVar3 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar3.f99919f = cVar;
            fjVar3.f99914a |= 1024;
        }
        this.f101399c.mo41355k((C37598fj) fhVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37563ed edVar;
        C37519dz dzVar;
        C37656hc hcVar = (C37656hc) obj;
        C37664hk a = hcVar.mo41049a();
        C37561eb ebVar = a.f100041b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 2) {
            C37561eb ebVar2 = a.f100041b;
            if (ebVar2 == null) {
                ebVar2 = C37561eb.f99800c;
            }
            if (ebVar2.f99802a == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar2.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            str = dzVar.name();
        } else {
            C37561eb ebVar3 = a.f100041b;
            if (ebVar3 == null) {
                ebVar3 = C37561eb.f99800c;
            }
            if (ebVar3.f99802a == 1) {
                edVar = C37563ed.m66571a(((Integer) ebVar3.f99803b).intValue());
                if (edVar == null) {
                    edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                }
            } else {
                edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            str = edVar.name();
        }
        C59104x b = C38280k.f101415b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) b).mo56372aa(53068)).mo56351D("#audio# hotword client session(token(%d)) start listening status(%s)", this.f101397a, str);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        a.getClass();
        fjVar.f99916c = a;
        fjVar.f99915b = 100;
        long j = this.f101397a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        if (C37772b.m66674a(this.f101398b.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101398b;
            fhVar.copyOnWrite();
            C37598fj fjVar3 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar3.f99919f = cVar;
            fjVar3.f99914a |= 1024;
        }
        this.f101399c.mo41355k((C37598fj) fhVar.build());
        C38280k kVar = this.f101399c;
        long j2 = this.f101397a;
        C37773c cVar2 = this.f101398b;
        if (hcVar.mo41052d().mo56113h()) {
            C60856cj.m92911t((C60870cx) hcVar.mo41052d().mo56107c(), C47810es.m84974n(new C38278i(kVar, j2, cVar2)), kVar.f101416c);
        }
    }
}
