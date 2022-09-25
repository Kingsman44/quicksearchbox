package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.p */
/* compiled from: PG */
public final /* synthetic */ class C115500p implements C115139az {

    /* renamed from: a */
    public final /* synthetic */ long f320363a;

    public /* synthetic */ C115500p(long j) {
        this.f320363a = j;
    }

    /* renamed from: a */
    public final C60870cx mo101844a(C115493i iVar) {
        long j = this.f320363a;
        C115159bd bdVar = new C115159bd(iVar);
        if (bdVar.mo77798d() <= 0 || j <= bdVar.mo77798d()) {
            iVar.f320350a.mo1037e().mo1024i(j);
            return C60856cj.m92900i(C84272l.SUCCESS);
        }
        C59104x c = C115157bb.f319590a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
        ((C59052c) ((C59052c) c).mo56372aa(29666)).mo56350C("Seek position (%d) is out of range [0, %d]", j, bdVar.mo77798d());
        return C60856cj.m92900i(C84272l.FAILURE);
    }
}
