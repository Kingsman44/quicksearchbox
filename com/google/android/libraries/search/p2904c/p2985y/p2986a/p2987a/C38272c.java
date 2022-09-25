package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37415bt;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37596fh;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.y.a.a.c */
/* compiled from: PG */
final class C38272c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f101390a;

    /* renamed from: b */
    final /* synthetic */ long f101391b;

    /* renamed from: c */
    final /* synthetic */ C37773c f101392c;

    /* renamed from: d */
    final /* synthetic */ C38280k f101393d;

    public C38272c(C38280k kVar, int i, long j, C37773c cVar) {
        this.f101393d = kVar;
        this.f101390a = i;
        this.f101391b = j;
        this.f101392c = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38280k.f101415b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) d).mo56372aa(53063)).mo56394x("#audio# cannot retrieve audio request client(token(%d)) session(token(%d)) start listening status", this.f101390a, this.f101391b);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        C37415bt btVar = (C37415bt) C37416bu.f99347c.createBuilder();
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C37519dz dzVar = C37519dz.FAILED_OPENING_ERROR_RETRIEVING_STATUS;
        eaVar.copyOnWrite();
        C37561eb ebVar = (C37561eb) eaVar.instance;
        ebVar.f99803b = Integer.valueOf(dzVar.f99687U);
        ebVar.f99802a = 2;
        C37561eb ebVar2 = (C37561eb) eaVar.build();
        btVar.copyOnWrite();
        C37416bu buVar = (C37416bu) btVar.instance;
        ebVar2.getClass();
        buVar.f99350b = ebVar2;
        buVar.f99349a |= 1;
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        C37416bu buVar2 = (C37416bu) btVar.build();
        buVar2.getClass();
        fjVar.f99916c = buVar2;
        fjVar.f99915b = 1;
        long j = this.f101391b;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        int i = this.f101390a;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        fjVar3.f99914a |= 2048;
        fjVar3.f99920g = (long) i;
        if (C37772b.m66674a(this.f101392c.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101392c;
            fhVar.copyOnWrite();
            C37598fj fjVar4 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar4.f99919f = cVar;
            fjVar4.f99914a |= 1024;
        }
        this.f101393d.mo41355k((C37598fj) fhVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37563ed edVar;
        C37519dz dzVar;
        C37400be beVar = (C37400be) obj;
        C37416bu a = beVar.mo40929a();
        C37561eb ebVar = a.f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 2) {
            C37561eb ebVar2 = a.f99350b;
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
            C37561eb ebVar3 = a.f99350b;
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
        ((C59052c) ((C59052c) b).mo56372aa(53064)).mo56359L("#audio# audio request client(token(%d)) session(token(%d)) start listening status(%s)", Integer.valueOf(this.f101390a), Long.valueOf(this.f101391b), str);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        a.getClass();
        fjVar.f99916c = a;
        fjVar.f99915b = 1;
        long j = this.f101391b;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        int i = this.f101390a;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        fjVar3.f99914a |= 2048;
        fjVar3.f99920g = (long) i;
        if (C37772b.m66674a(this.f101392c.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101392c;
            fhVar.copyOnWrite();
            C37598fj fjVar4 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar4.f99919f = cVar;
            fjVar4.f99914a |= 1024;
        }
        this.f101393d.mo41355k((C37598fj) fhVar.build());
        C38280k kVar = this.f101393d;
        int i2 = this.f101390a;
        long j2 = this.f101391b;
        C37773c cVar2 = this.f101392c;
        if (beVar.mo40932d().mo56113h()) {
            C60856cj.m92911t((C60870cx) beVar.mo40932d().mo56107c(), C47810es.m84974n(new C38277h(kVar, j2, i2, cVar2)), kVar.f101416c);
        }
    }
}
