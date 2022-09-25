package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6872d.C86945bl;
import com.google.android.apps.gsa.search.core.state.p6872d.C86950bq;
import com.google.android.apps.gsa.search.core.state.p6872d.C86962n;
import com.google.android.ssb.C45350g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hi */
/* compiled from: PG */
public final class C87114hi implements C87143ik {

    /* renamed from: a */
    private final C86950bq f235366a;

    /* renamed from: b */
    private final C86842bk f235367b;

    /* renamed from: c */
    private final C86842bk f235368c;

    public C87114hi(C86950bq bqVar, C68214a aVar, C68214a aVar2) {
        this.f235366a = bqVar;
        this.f235367b = new C86842bk(aVar);
        this.f235368c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235366a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        this.f235367b.mo80534b(icVar);
        this.f235368c.mo80534b(icVar);
        C86842bk bkVar = this.f235367b;
        if (bkVar.f234552a || this.f235368c.f234552a) {
            C86950bq bqVar = this.f235366a;
            C86842bk bkVar2 = this.f235368c;
            C45350g g = C86950bq.m140347g((C86962n) bkVar.mo80533a(), (C86945bl) bkVar2.mo80533a());
            boolean z2 = true;
            if (g != bqVar.f234864b) {
                bqVar.f234864b = g;
                bqVar.f234863a.mo78885c(g);
                z = true;
            } else {
                z = false;
            }
            C86945bl blVar = (C86945bl) bkVar2.mo80533a();
            C45350g g2 = C86950bq.m140347g((C86962n) bkVar.mo80533a(), blVar);
            int i = 2;
            if (g2 != C45350g.PLAYING_TTS) {
                i = (blVar.f234837a == 2 || g2 == C45350g.RECORDING) ? 0 : 1;
            }
            if (i != bqVar.f234865c) {
                bqVar.f234865c = i;
                bqVar.f234863a.mo78884a(i);
            } else {
                z2 = false;
            }
            if (z || z2) {
                this.f235366a.mo80591ar();
            }
        }
    }
}
