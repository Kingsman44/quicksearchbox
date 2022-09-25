package com.google.android.apps.gsa.nga.engine.viss;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.b.a;
import com.google.android.apps.gsa.nga.engine.b.e;
import com.google.android.apps.gsa.nga.engine.p5978b.C75190c;
import com.google.android.apps.gsa.nga.engine.p5978b.C75214d;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120037v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.ad */
/* compiled from: PG */
public final class C79371ad implements C75214d, k {

    /* renamed from: a */
    public final e f217983a;

    /* renamed from: b */
    public final C120037v f217984b;

    /* renamed from: c */
    public final boolean f217985c;

    /* renamed from: d */
    private final Object f217986d = new Object();

    /* renamed from: e */
    private NgaVoiceInteractionSessionService f217987e;

    public C79371ad(e eVar, C120037v vVar, boolean z) {
        this.f217983a = eVar;
        this.f217984b = vVar;
        this.f217985c = z;
    }

    /* renamed from: b */
    public static boolean m127352b(NgaState ngaState) {
        return ngaState != null && ngaState.a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73943a(NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService) {
        synchronized (this.f217986d) {
            this.f217987e = ngaVoiceInteractionSessionService;
        }
    }

    /* renamed from: e */
    public final void mo71496e(C75190c cVar) {
        NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService;
        if (!this.f217984b.mo104643a(Bundle.EMPTY).f334197b) {
            a aVar = (a) cVar;
            if (m127352b(aVar.a) || m127352b(aVar.b)) {
                synchronized (this.f217986d) {
                    ngaVoiceInteractionSessionService = this.f217987e;
                }
                if (ngaVoiceInteractionSessionService != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    C22871g gVar = ngaVoiceInteractionSessionService.f217955b;
                    gVar.getClass();
                    gVar.mo28212l("[NGA] NgaVoiceInteractionSessionService.onSessionEnabledChanged", new C79382l(ngaVoiceInteractionSessionService));
                }
            }
        }
    }

    /* renamed from: gE */
    public final void mo73944gE(C58528ij ijVar) {
    }
}
