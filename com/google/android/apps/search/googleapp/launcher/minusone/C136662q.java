package com.google.android.apps.search.googleapp.launcher.minusone;

import android.content.Intent;
import com.google.android.apps.gsa.h.p.a;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import java.util.Collections;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.q */
/* compiled from: PG */
final class C136662q implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136652i f372020a;

    public C136662q(C136652i iVar) {
        this.f372020a = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139762c cVar = (C139762c) bVar;
        C136652i iVar = this.f372020a;
        C69664n.m101061g(cVar, "event");
        C139767h a = cVar.mo115221a();
        if ((a.f379871a & 8) != 0) {
            C139779t tVar = C139779t.SEARCH;
            C139779t a2 = C139779t.m227245a(a.f379872b);
            if (a2 == null) {
                a2 = C139779t.UNSPECIFIED;
            }
            if (tVar == a2) {
                if (!iVar.f372001t.mo113716a() || !iVar.f372002u) {
                    iVar.f371986e.mo41490e(a.b(a.f379876f, Optional.m71637of("and.gsa.tng.minus1"), Collections.unmodifiableMap(a.f379875e)));
                    return C47392e.f123115a;
                }
                Intent intent = new Intent();
                C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                C69664n.m101060f(eVar, "newBuilder()");
                String str = a.f379876f;
                eVar.copyOnWrite();
                C137418g gVar = (C137418g) eVar.instance;
                str.getClass();
                gVar.f373769a |= 1;
                gVar.f373770b = str;
                eVar.mo113713a(Collections.unmodifiableMap(a.f379875e));
                eVar.copyOnWrite();
                C137418g gVar2 = (C137418g) eVar.instance;
                gVar2.f373779k = 5;
                gVar2.f373769a |= 512;
                C136128i l = C136129j.m221208l();
                C139779t a3 = C139779t.m227245a(a.f379872b);
                if (a3 == null) {
                    a3 = C139779t.UNSPECIFIED;
                }
                l.mo112776k(a3);
                l.mo112775j(Optional.m71637of(eVar.build()));
                C136127h.m221196a(intent, l.mo112766a());
                C47709i.m84861a(iVar.f371988g, intent);
                return C47392e.f123115a;
            }
        }
        return C47392e.f123116b;
    }
}
