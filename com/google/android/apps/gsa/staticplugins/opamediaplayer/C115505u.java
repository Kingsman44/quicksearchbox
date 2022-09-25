package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.u */
/* compiled from: PG */
public final /* synthetic */ class C115505u implements C115139az {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f320370a;

    /* renamed from: b */
    public final /* synthetic */ int f320371b;

    public /* synthetic */ C115505u(C115157bb bbVar, int i) {
        this.f320370a = bbVar;
        this.f320371b = i;
    }

    /* renamed from: a */
    public final C60870cx mo101844a(C115493i iVar) {
        C115157bb bbVar = this.f320370a;
        int i = this.f320371b;
        C58833ax a = iVar.mo102055a();
        if (!a.mo56113h() || ((PlaybackStateCompat) a.mo56107c()).f994a == 1) {
            C58976aa aaVar = C58975e.f156826a;
            return bbVar.mo101865r(i, 2);
        }
        int i2 = ((PlaybackStateCompat) a.mo56107c()).f994a;
        if (i2 == 2) {
            C58976aa aaVar2 = C58975e.f156826a;
            iVar.f320350a.mo1037e().mo1018c();
        } else if (i2 == 3 || i2 == 6) {
            C58976aa aaVar3 = C58975e.f156826a;
            iVar.f320350a.mo1037e().mo1017b();
        }
        return C60856cj.m92900i(C84272l.SUCCESS);
    }
}
