package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37596fh;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.C37665hl;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.y.a.a.d */
/* compiled from: PG */
final class C38273d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f101394a;

    /* renamed from: b */
    final /* synthetic */ C37773c f101395b;

    /* renamed from: c */
    final /* synthetic */ C38280k f101396c;

    public C38273d(C38280k kVar, long j, C37773c cVar) {
        this.f101396c = kVar;
        this.f101394a = j;
        this.f101395b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38280k.f101415b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
        ((C59052c) ((C59052c) d).mo56372aa(53065)).mo56388r("#audio# cannot retrieve hotword client session(token(%d)) stop listening status", this.f101394a);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        C37665hl hlVar = (C37665hl) C37666hm.f100042d.createBuilder();
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_RETRIEVING_STATUS;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dsVar.f99628K);
        duVar.f99631a = 2;
        C37514du duVar2 = (C37514du) dtVar.build();
        hlVar.copyOnWrite();
        C37666hm hmVar = (C37666hm) hlVar.instance;
        duVar2.getClass();
        hmVar.f100045b = duVar2;
        hmVar.f100044a |= 1;
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        C37666hm hmVar2 = (C37666hm) hlVar.build();
        hmVar2.getClass();
        fjVar.f99916c = hmVar2;
        fjVar.f99915b = 101;
        long j = this.f101394a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        if (C37772b.m66674a(this.f101395b.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101395b;
            fhVar.copyOnWrite();
            C37598fj fjVar3 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar3.f99919f = cVar;
            fjVar3.f99914a |= 1024;
        }
        this.f101396c.mo41355k((C37598fj) fhVar.build());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37516dw dwVar;
        C37512ds dsVar;
        C37666hm hmVar = (C37666hm) obj;
        C37514du duVar = hmVar.f100045b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 2) {
            C37514du duVar2 = hmVar.f100045b;
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
            C37514du duVar3 = hmVar.f100045b;
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
        ((C59052c) ((C59052c) b).mo56372aa(53066)).mo56351D("#audio# hotword client session(token(%d)) stop listening status(%s)", this.f101394a, str);
        C37596fh fhVar = (C37596fh) C37598fj.f99912h.createBuilder();
        fhVar.copyOnWrite();
        C37598fj fjVar = (C37598fj) fhVar.instance;
        hmVar.getClass();
        fjVar.f99916c = hmVar;
        fjVar.f99915b = 101;
        long j = this.f101394a;
        fhVar.copyOnWrite();
        C37598fj fjVar2 = (C37598fj) fhVar.instance;
        fjVar2.f99914a |= 256;
        fjVar2.f99917d = j;
        if (C37772b.m66674a(this.f101395b.f100245a) != C37772b.DETAILS_NOT_SET) {
            C37773c cVar = this.f101395b;
            fhVar.copyOnWrite();
            C37598fj fjVar3 = (C37598fj) fhVar.instance;
            cVar.getClass();
            fjVar3.f99919f = cVar;
            fjVar3.f99914a |= 1024;
        }
        this.f101396c.mo41355k((C37598fj) fhVar.build());
    }
}
