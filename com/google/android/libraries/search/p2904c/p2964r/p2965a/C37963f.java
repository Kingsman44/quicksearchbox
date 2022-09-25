package com.google.android.libraries.search.p2904c.p2964r.p2965a;

import android.os.Build;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.r.a.f */
/* compiled from: PG */
final class C37963f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37773c f100582a;

    /* renamed from: b */
    final /* synthetic */ C37965h f100583b;

    public C37963f(C37965h hVar, C37773c cVar) {
        this.f100583b = hVar;
        this.f100582a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C37965h.f100587a.mo56226d()).mo56382g(th)).mo56372aa(52873)).mo56386p("#audio# seamless handover timeout failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37666hm hmVar = (C37666hm) obj;
        C37514du duVar = hmVar.f100045b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 1) {
            C37565ef a = C37565ef.m66573a(hmVar.f100046c);
            if (a == null) {
                a = C37565ef.UNSET;
            }
            if (a == C37565ef.SEAMLESS_HANDOVER_TIMEOUT) {
                ((C58970a) ((C58970a) C37965h.f100587a.mo56224b()).mo56372aa(52874)).mo56386p("#audio# seamless handover timeout success");
                int i = Build.VERSION.SDK_INT;
                ((C19567d) ((C39141kp) this.f100583b.f100588b.mo27525b()).f102861as.mo6453a()).mo24822a(1, (String) this.f100583b.f100589c.mo6453a(), Integer.valueOf(i), C37772b.m66674a(this.f100582a.f100245a).name());
            }
        }
    }
}
