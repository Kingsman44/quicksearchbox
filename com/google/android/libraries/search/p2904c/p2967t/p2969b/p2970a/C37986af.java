package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.t.b.a.af */
/* compiled from: PG */
final class C37986af implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37565ef f100632a;

    /* renamed from: b */
    final /* synthetic */ C37987ag f100633b;

    public C37986af(C37987ag agVar, C37565ef efVar) {
        this.f100633b = agVar;
        this.f100632a = efVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C37987ag.f100634a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ALT.SourceSequencer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(52942)).mo56386p("#audio# closeAudioSource failed: error getting audio source closing status.");
        C2164c cVar = this.f100633b.f100638e;
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS;
        cVar.mo5437b(C37846as.m66799e(C37846as.m66801g(dsVar), this.f100632a));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f100633b.f100638e.mo5437b(C37846as.m66799e((C37514du) obj, this.f100632a));
    }
}
