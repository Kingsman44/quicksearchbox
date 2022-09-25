package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.discover.p10181d.C134206ak;
import com.google.android.apps.search.googleapp.discover.p10181d.C134212aq;
import com.google.android.apps.search.googleapp.discover.p10181d.C134218g;
import com.google.android.apps.search.googleapp.discover.p10248y.C135270u;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134722b;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ba */
/* compiled from: PG */
public final class C134841ba implements Runnable {

    /* renamed from: a */
    private final C134212aq f367094a;

    /* renamed from: b */
    private final C134722b f367095b;

    /* renamed from: c */
    private final C134779a f367096c;

    /* renamed from: d */
    private final C134828av f367097d;

    public C134841ba(C134212aq aqVar, C134722b bVar, C134779a aVar, C134828av avVar) {
        C69664n.m101061g(aqVar, "discoverStreamAppFlowLogger");
        C69664n.m101061g(bVar, "discoverInitialRenderTracker");
        C69664n.m101061g(aVar, "discoverInteractiveState");
        this.f367094a = aqVar;
        this.f367095b = bVar;
        this.f367096c = aVar;
        this.f367097d = avVar;
    }

    public final void run() {
        C134218g gVar;
        this.f367096c.f366979a.mo62807f(true);
        C134828av avVar = this.f367097d;
        if (avVar instanceof C134832az) {
            C134212aq aqVar = this.f367094a;
            Instant instant = ((C134832az) avVar).f367069a;
            synchronized (aqVar.f365586d) {
                C134206ak akVar = aqVar.f365587e;
                if (akVar != null) {
                    akVar.mo111628g(instant);
                    if (aqVar.f365587e.mo111636o()) {
                        aqVar.mo111640a();
                    }
                }
            }
            this.f367095b.mo111906b(C134218g.SUCCESS);
        } else if (avVar instanceof C134831ay) {
            this.f367094a.mo111643d(((C134831ay) avVar).f367068a);
            this.f367095b.mo111906b(C134218g.PREPENDED_ERROR_CARD);
        } else if (avVar instanceof C134829aw) {
            this.f367094a.mo111643d(((C134829aw) avVar).f367066a);
            C134722b bVar = this.f367095b;
            C89885b bVar2 = ((C134829aw) this.f367097d).f367066a;
            C135270u uVar = C135270u.REQUEST_FAILED_NO_INTERNET;
            C89885b bVar3 = C89885b.UNKNOWN;
            int ordinal = bVar2.ordinal();
            if (!(ordinal == 697 || ordinal == 698 || ordinal == 700 || ordinal == 701 || ordinal == 703 || ordinal == 704 || ordinal == 706)) {
                switch (ordinal) {
                    case 713:
                    case 714:
                    case 716:
                        gVar = C134218g.INTERNAL_ERROR;
                        break;
                    case 715:
                    case 717:
                    case 718:
                        break;
                    default:
                        gVar = C134218g.INTERNAL_ERROR;
                        break;
                }
            }
            gVar = C134218g.FULL_FEED_ERROR;
            bVar.mo111906b(gVar);
        }
    }
}
