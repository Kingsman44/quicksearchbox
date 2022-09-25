package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.media.session.C0298ao;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52201iz;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.r */
/* compiled from: PG */
public final /* synthetic */ class C115502r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f320365a;

    /* renamed from: b */
    public final /* synthetic */ int f320366b;

    /* renamed from: c */
    public final /* synthetic */ boolean f320367c;

    public /* synthetic */ C115502r(C115157bb bbVar, int i, boolean z) {
        this.f320365a = bbVar;
        this.f320366b = i;
        this.f320367c = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C115157bb bbVar = this.f320365a;
        int i = this.f320366b;
        boolean z = this.f320367c;
        C115169f fVar = (C115169f) bbVar.f319601l.f319612c.instance;
        int i2 = fVar.f319629c + i;
        if (i == 1) {
            C52176ia iaVar = fVar.f319628b;
            if (iaVar == null) {
                iaVar = C52176ia.f136911k;
            }
            int a = C52201iz.m86539a(iaVar.f136918f);
            if (a != 0 && a == 2) {
                C58976aa aaVar = C58975e.f156826a;
                i2 = ((C115169f) bbVar.f319601l.f319612c.instance).f319629c;
            } else if (!bbVar.f319601l.mo101870d(i2)) {
                C52176ia iaVar2 = ((C115169f) bbVar.f319601l.f319612c.instance).f319628b;
                if (iaVar2 == null) {
                    iaVar2 = C52176ia.f136911k;
                }
                int a2 = C52201iz.m86539a(iaVar2.f136918f);
                if (a2 != 0 && a2 == 3) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    i2 = 0;
                }
            }
        }
        while (bbVar.f319601l.mo101870d(i2) && !C115157bb.m190863q((C52174hz) bbVar.f319601l.mo101868a(i2).mo56107c())) {
            i2 += i;
        }
        if (!bbVar.f319601l.mo101870d(i2)) {
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putInt("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackStateErrorCode", 11);
                bbVar.mo101861m(new C115131ar(bundle));
            }
            return C60856cj.m92900i(C84272l.FAILURE);
        }
        if (!bbVar.f319600k.mo56113h()) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else {
            C58833ax a3 = ((C115493i) bbVar.f319600k.mo56107c()).mo102055a();
            if (a3.mo56113h()) {
                int i3 = i == 1 ? 10 : i == -1 ? 9 : 0;
                C0298ao aoVar = new C0298ao((PlaybackStateCompat) a3.mo56107c());
                aoVar.mo984c(i3, ((PlaybackStateCompat) a3.mo56107c()).f995b, ((PlaybackStateCompat) a3.mo56107c()).f997d, SystemClock.elapsedRealtime());
                ((C115493i) bbVar.f319600k.mo56107c()).f320351b = C58833ax.m90833j(aoVar.mo982a());
            }
        }
        bbVar.mo101866s(2);
        return bbVar.mo101865r(i2, 1);
    }
}
