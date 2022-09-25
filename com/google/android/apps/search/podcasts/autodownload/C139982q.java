package com.google.android.apps.search.podcasts.autodownload;

import androidx.work.C4381ae;
import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140508t;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.q */
/* compiled from: PG */
final class C139982q extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139980p f380483a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139982q(C139980p pVar) {
        super(1);
        this.f380483a = pVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C4381ae aeVar;
        C140508t tVar = ((C140450al) obj).f381525k;
        if (tVar == null) {
            tVar = C140508t.f381626c;
        }
        if (tVar.f381629b) {
            aeVar = C4381ae.UNMETERED;
        } else {
            aeVar = C4381ae.CONNECTED;
        }
        C46578l lVar = this.f380483a.f380480c;
        C46582p j = C46586t.m83063j(C139980p.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.search.podcasts.autodownload.AutoDownloadWorker", C4634o.KEEP));
        C4410f fVar = new C4410f();
        fVar.mo9351c(aeVar);
        dVar.f121753b = fVar.mo9349a();
        C60870cx b = lVar.mo50546b(j.mo50561a());
        C69664n.m101060f(b, "tikTokWorkManager.enqueu…     .build()\n          )");
        return b;
    }
}
