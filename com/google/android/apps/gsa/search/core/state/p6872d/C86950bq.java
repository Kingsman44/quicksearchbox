package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6697de.C85351a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C86997dw;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.ssb.C45350g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bq */
/* compiled from: PG */
public final class C86950bq extends C86898ct implements C86997dw {

    /* renamed from: a */
    public final C85351a f234863a;

    /* renamed from: b */
    public C45350g f234864b;

    /* renamed from: c */
    public int f234865c = 1;

    public C86950bq(C68214a aVar, C85351a aVar2) {
        super(aVar, 15);
        this.f234863a = aVar2;
    }

    /* renamed from: e */
    public final C45350g mo80607e() {
        C45350g gVar = this.f234864b;
        return gVar == null ? C45350g.IDLE : gVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("ssb audio state").mo85276a(C90752i.m148231e(this.f234864b));
        C91005e c = fVar.mo85279c("voice dialog state");
        int i = this.f234865c;
        c.mo85276a(C90752i.m148229c(i != 0 ? i != 1 ? "SPEAKING" : "PROCESSING" : "LISTENING"));
    }

    /* renamed from: g */
    public static C45350g m140347g(C86962n nVar, C86945bl blVar) {
        C45350g gVar;
        if (nVar.f234888a) {
            return C45350g.PLAYING_TTS;
        }
        int i = blVar.f234837a;
        if (i == 1 || i == 2) {
            gVar = C45350g.LISTENING;
        } else {
            if (i != 3) {
                if (i == 4) {
                    gVar = C45350g.PROCESSING;
                } else if (i != 10) {
                    gVar = C45350g.IDLE;
                }
            }
            gVar = C45350g.RECORDING;
        }
        return (gVar != C45350g.IDLE || !nVar.mo80440n()) ? gVar : C45350g.PROCESSING;
    }
}
