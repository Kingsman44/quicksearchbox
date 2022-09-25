package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.u */
/* compiled from: PG */
final class C132440u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C132441v f361463a;

    public C132440u(C132441v vVar) {
        this.f361463a = vVar;
    }

    public final void run() {
        C132419ac s;
        C132441v vVar = this.f361463a;
        if (!vVar.f361475j && (s = vVar.mo110725s(vVar.f361476k)) != null) {
            C132418ab abVar = s.f361431d;
            C132418ab abVar2 = C132418ab.ASSISTANT_TTS;
            int ordinal = abVar.ordinal();
            int i = 2;
            if (ordinal == 0) {
                this.f361463a.f361477l = C62948a.f169987b;
                C132441v vVar2 = this.f361463a;
                vVar2.f361478m = C62948a.f169987b;
                if (true != vVar2.f361468c.mo6277aw()) {
                    i = 1;
                }
                vVar2.f361480o = i;
            } else if (ordinal == 1) {
                long k = this.f361463a.f361469d.mo6004k();
                long l = this.f361463a.f361469d.mo6005l();
                if (k > 0 && l > 0) {
                    this.f361463a.f361477l = C62948a.m95459j(k);
                    this.f361463a.f361478m = C62948a.m95459j(l);
                }
                C132441v vVar3 = this.f361463a;
                if (true != vVar3.f361469d.mo6277aw()) {
                    i = 1;
                }
                vVar3.f361480o = i;
            }
            this.f361463a.mo110727v();
        }
    }
}
