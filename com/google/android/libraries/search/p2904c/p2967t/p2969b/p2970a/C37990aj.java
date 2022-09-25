package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.t.b.a.aj */
/* compiled from: PG */
final class C37990aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37991ak f100647a;

    public C37990aj(C37991ak akVar) {
        this.f100647a = akVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C37991ak.f100648a.mo56225c()).mo56382g(th)).mo56372aa(52946)).mo56386p("#audio# Failure in StopListeningStatus future.");
        C2164c cVar = this.f100647a.f100651d;
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS;
        cVar.mo5437b(C37846as.m66807m(C37846as.m66801g(dsVar), C37565ef.FAILED_START_LISTENING));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37418bw bwVar = (C37418bw) obj;
        C2164c cVar = this.f100647a.f100651d;
        C37514du duVar = bwVar.f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        C37565ef a = C37565ef.m66573a(bwVar.f99355c);
        if (a == null) {
            a = C37565ef.UNSET;
        }
        cVar.mo5437b(C37846as.m66807m(duVar, a));
    }
}
