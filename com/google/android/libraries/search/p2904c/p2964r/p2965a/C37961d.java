package com.google.android.libraries.search.p2904c.p2964r.p2965a;

import android.os.Build;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.r.a.d */
/* compiled from: PG */
final class C37961d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37773c f100578a;

    /* renamed from: b */
    final /* synthetic */ C37965h f100579b;

    public C37961d(C37965h hVar, C37773c cVar) {
        this.f100579b = hVar;
        this.f100578a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C37965h.f100587a.mo56226d()).mo56382g(th)).mo56372aa(52869)).mo56386p("#audio# HotwordListeningSession start listening failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37563ed edVar;
        C37561eb ebVar = ((C37656hc) obj).mo41049a().f100041b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        int i = ebVar.f99802a;
        if (i == 2) {
            C37519dz a = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
            if (a == null) {
                a = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            str = a.name();
        } else {
            if (i == 1) {
                edVar = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
                if (edVar == null) {
                    edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                }
            } else {
                edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            str = edVar.name();
        }
        boolean z = ebVar.f99802a == 1;
        ((C58970a) ((C58970a) C37965h.f100587a.mo56224b()).mo56372aa(52870)).mo56389s("#audio# HotwordListeningSession start listening status: %s", str);
        ((C19567d) ((C39141kp) this.f100579b.f100588b.mo27525b()).f102857ao.mo6453a()).mo24822a(1, str, (String) this.f100579b.f100589c.mo6453a(), Integer.valueOf(Build.VERSION.SDK_INT), Boolean.valueOf(z), C37772b.m66674a(this.f100578a.f100245a).name());
    }
}
