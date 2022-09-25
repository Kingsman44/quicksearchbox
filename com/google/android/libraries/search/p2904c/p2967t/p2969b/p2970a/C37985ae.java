package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.search.c.t.b.a.ae */
/* compiled from: PG */
final class C37985ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37987ag f100631a;

    public C37985ae(C37987ag agVar) {
        this.f100631a = agVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C59104x d = C37987ag.f100634a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.SourceSequencer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(52941)).mo56386p("#audio# audioStreamOptionalFuture Cancelled.");
        } else {
            C59104x c = C37987ag.f100634a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ALT.SourceSequencer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(52940)).mo56386p("#audio# Failure in audioStreamOptionalFuture future.");
        }
        C2164c cVar = this.f100631a.f100638e;
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_STREAM;
        cVar.mo5437b(C37846as.m66799e(C37846as.m66801g(dsVar), C37565ef.FAILED_START_LISTENING));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((C58833ax) obj).mo56113h()) {
            C2164c cVar = this.f100631a.f100638e;
            C37512ds dsVar = C37512ds.FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE;
            cVar.mo5437b(C37846as.m66799e(C37846as.m66801g(dsVar), C37565ef.FAILED_START_LISTENING));
        }
    }
}
