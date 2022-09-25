package com.google.android.apps.search.pronunciationlearning;

import com.google.android.apps.search.pronunciationlearning.content.C141360a;
import com.google.android.apps.search.pronunciationlearning.content.C141366g;
import com.google.android.apps.search.pronunciationlearning.content.C141376q;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4552o.apw;
import com.google.common.p4552o.apx;
import com.google.common.p4552o.aqb;
import com.google.common.p4552o.aqf;

/* renamed from: com.google.android.apps.search.pronunciationlearning.o */
/* compiled from: PG */
final class C141422o implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141419n f383883a;

    public C141422o(C141419n nVar) {
        this.f383883a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C141376q.C141377a aVar = (C141376q.C141377a) bVar;
        C141419n nVar = this.f383883a;
        String str = aVar.f383790a;
        C141366g gVar = nVar.f383866b;
        gVar.f383767b.mo46039a(new C141360a(str), gVar.f383768c);
        C141330c cVar = nVar.f383875k;
        int length = aVar.f383790a.length();
        apw apw = (apw) apx.f159707d.createBuilder();
        apw.copyOnWrite();
        apx apx = (apx) apw.instance;
        apx.f159709a |= 1;
        apx.f159710b = length;
        cVar.mo116362b(C37200a.f98692b.mo40812e(aqf.f159732l, cVar.mo116361a((apx) apw.build(), (aqb) null)));
        nVar.mo116423d(aVar.f383790a, true);
        return C47392e.f123115a;
    }
}
