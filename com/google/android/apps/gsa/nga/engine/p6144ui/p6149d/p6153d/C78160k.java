package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78110b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128097bs;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.k */
/* compiled from: PG */
public final class C78160k {

    /* renamed from: a */
    public final C83357g f215213a = new C83361k(C128097bs.RESPONSE_PLATE_STATE_UNKNOWN, C78110b.class);

    /* renamed from: b */
    private final C22871g f215214b;

    public C78160k(C22871g gVar) {
        this.f215214b = gVar;
    }

    /* renamed from: a */
    public final void mo73107a(int i) {
        C128097bs bsVar;
        C22871g gVar = this.f215214b;
        C83357g gVar2 = this.f215213a;
        int i2 = i - 1;
        if (i2 == 0) {
            bsVar = C128097bs.RESPONSE_PLATE_STATE_UNKNOWN;
        } else if (i2 == 1) {
            bsVar = C128097bs.RESPONSE_PLATE_STATE_WAITING;
        } else if (i2 == 2) {
            bsVar = C128097bs.RESPONSE_PLATE_STATE_RECEIVED;
        } else if (i2 != 3) {
            bsVar = C128097bs.RESPONSE_PLATE_STATE_COMPLETED;
        } else {
            bsVar = C128097bs.RESPONSE_PLATE_STATE_UI_UPDATED;
        }
        C83349aj.m132647b(gVar, gVar2, bsVar, "responsePlateState");
    }
}
