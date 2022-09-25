package com.google.android.libraries.search.p2904c.p2964r.p2965a;

import android.os.Build;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.r.a.c */
/* compiled from: PG */
final class C37960c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37773c f100576a;

    /* renamed from: b */
    final /* synthetic */ C37965h f100577b;

    public C37960c(C37965h hVar, C37773c cVar) {
        this.f100577b = hVar;
        this.f100576a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C37965h.f100587a.mo56226d()).mo56382g(th)).mo56372aa(52867)).mo56386p("#audio# AudioRequestListeningSession stop listening failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C37516dw dwVar;
        C37418bw bwVar = (C37418bw) obj;
        C37514du duVar = bwVar.f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        C37565ef a = C37565ef.m66573a(bwVar.f99355c);
        if (a == null) {
            a = C37565ef.UNSET;
        }
        int i = duVar.f99631a;
        if (i == 2) {
            C37512ds a2 = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
            if (a2 == null) {
                a2 = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            str = a2.name();
        } else {
            if (i == 1) {
                dwVar = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
                if (dwVar == null) {
                    dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                }
            } else {
                dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            str = dwVar.name();
        }
        ((C58970a) ((C58970a) C37965h.f100587a.mo56224b()).mo56372aa(52868)).mo56389s("#audio# AudioRequestListeningSession stop listening status: %s", str);
        String name = a.name();
        int i2 = Build.VERSION.SDK_INT;
        ((C19567d) ((C39141kp) this.f100577b.f100588b.mo27525b()).f102850ah.mo6453a()).mo24822a(1, str, name, (String) this.f100577b.f100589c.mo6453a(), Integer.valueOf(i2), C37772b.m66674a(this.f100576a.f100245a).name());
    }
}
