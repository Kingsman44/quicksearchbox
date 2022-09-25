package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37417bv;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37596fh;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.y.a.a.b */
/* compiled from: PG */
final class C38271b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f101386a;

    /* renamed from: b */
    final /* synthetic */ long f101387b;

    /* renamed from: c */
    final /* synthetic */ C37773c f101388c;

    /* renamed from: d */
    final /* synthetic */ C38280k f101389d;

    public C38271b(C38280k kVar, int i, long j, C37773c cVar) {
        this.f101389d = kVar;
        this.f101386a = i;
        this.f101387b = j;
        this.f101388c = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38280k.f101415b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) d).mo56372aa(53061)).mo56394x("#audio# cannot retrieve audio request client(token(%d)) session(token(%d)) stop listening status", this.f101386a, this.f101387b);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        C37417bv bvVar = (C37417bv) C37418bw.f99351d.createBuilder();
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_RETRIEVING_STATUS;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dsVar.f99628K);
        duVar.f99631a = 2;
        C37514du duVar2 = (C37514du) dtVar.build();
        bvVar.copyOnWrite();
        C37418bw bwVar = (C37418bw) bvVar.instance;
        duVar2.getClass();
        bwVar.f99354b = duVar2;
        bwVar.f99353a |= 1;
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        C37418bw bwVar2 = (C37418bw) bvVar.build();
        bwVar2.getClass();
        fjVar.f99916c = bwVar2;
        fjVar.f99915b = 2;
        long j = this.f101387b;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        int i = this.f101386a;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        fjVar3.f99914a |= 2048;
        fjVar3.f99920g = (long) i;
        if (C37772b.m66674a(this.f101388c.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101388c;
            fhVar.copyOnWrite();
            C37598fj fjVar4 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar4.f99919f = cVar;
            fjVar4.f99914a |= 1024;
        }
        this.f101389d.mo41355k((C37598fj) fhVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37516dw dwVar;
        C37512ds dsVar;
        C37418bw bwVar = (C37418bw) obj;
        C37514du duVar = bwVar.f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 2) {
            C37514du duVar2 = bwVar.f99354b;
            if (duVar2 == null) {
                duVar2 = C37514du.f99629c;
            }
            if (duVar2.f99631a == 2) {
                dsVar = C37512ds.m66519a(((Integer) duVar2.f99632b).intValue());
                if (dsVar == null) {
                    dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                }
            } else {
                dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            str = dsVar.name();
        } else {
            C37514du duVar3 = bwVar.f99354b;
            if (duVar3 == null) {
                duVar3 = C37514du.f99629c;
            }
            if (duVar3.f99631a == 1) {
                dwVar = C37516dw.m66521a(((Integer) duVar3.f99632b).intValue());
                if (dwVar == null) {
                    dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                }
            } else {
                dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            str = dwVar.name();
        }
        C59104x b = C38280k.f101415b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) b).mo56372aa(53062)).mo56359L("#audio# audio request client(token(%d)) session(token(%d)) stop listening status(%s)", Integer.valueOf(this.f101386a), Long.valueOf(this.f101387b), str);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        bwVar.getClass();
        fjVar.f99916c = bwVar;
        fjVar.f99915b = 2;
        long j = this.f101387b;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        int i = this.f101386a;
        fhVar.copyOnWrite();
        C37598fj fjVar3 = (C37598fj) fhVar.instance;
        fjVar3.f99914a |= 2048;
        fjVar3.f99920g = (long) i;
        if (C37772b.m66674a(this.f101388c.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101388c;
            fhVar.copyOnWrite();
            C37598fj fjVar4 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar4.f99919f = cVar;
            fjVar4.f99914a |= 1024;
        }
        this.f101389d.mo41355k((C37598fj) fhVar.build());
    }
}
