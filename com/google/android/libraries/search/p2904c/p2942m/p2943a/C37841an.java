package com.google.android.libraries.search.p2904c.p2942m.p2943a;

import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.c.m.a.an */
/* compiled from: PG */
public final /* synthetic */ class C37841an implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C37841an f100375a = new C37841an();

    private /* synthetic */ C37841an() {
    }

    public final C60870cx apply(Object obj) {
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) C37846as.f100388a.mo56226d()).mo56372aa(52816)).mo56386p("#audio# startListeningForHotword failed: exception thrown.");
        C37561eb i = C37846as.m66803i(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE);
        if (th instanceof C37902d) {
            i = ((C37902d) th).f100480a;
        }
        C58836b bVar = C58836b.f156633a;
        return C60856cj.m92900i(new C37844aq(bVar, bVar, i, bVar));
    }
}
