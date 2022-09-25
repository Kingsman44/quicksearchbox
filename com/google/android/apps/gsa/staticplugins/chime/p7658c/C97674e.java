package com.google.android.apps.gsa.staticplugins.chime.p7658c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91754b;
import com.google.android.apps.gsa.staticplugins.chime.C97735q;
import com.google.android.apps.search.googleapp.p10310h.C136120a;
import com.google.android.apps.search.googleapp.p10310h.C136122c;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10310h.C136130k;
import com.google.android.apps.search.googleapp.p10310h.C136131l;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7548bb;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7973qv;
import com.google.p4283bv.p4345d.C57041t;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import com.google.p4283bv.p4354e.p4356b.C57052a;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c.e */
/* compiled from: PG */
public final class C97674e implements C97671b {

    /* renamed from: a */
    private static final C59071e f272764a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.c.e");

    /* renamed from: b */
    private final Context f272765b;

    /* renamed from: c */
    private final C90021c f272766c;

    /* renamed from: d */
    private final C84486a f272767d;

    public C97674e(Context context, C90021c cVar, C84486a aVar) {
        this.f272765b = context;
        this.f272766c = cVar;
        this.f272767d = aVar;
    }

    /* renamed from: b */
    private final C57057b m161918b(C56968d dVar) {
        C57000j jVar = dVar.f152041d;
        if (jVar == null) {
            jVar = C57000j.f152155i;
        }
        C57057b bVar = jVar.f152164h;
        if (bVar == null) {
            bVar = C57057b.f152311e;
        }
        C57052a aVar = (C57052a) bVar.toBuilder();
        C57000j jVar2 = dVar.f152041d;
        if (jVar2 == null) {
            jVar2 = C57000j.f152155i;
        }
        C57041t tVar = jVar2.f152160d;
        if (tVar == null) {
            tVar = C57041t.f152278e;
        }
        C7669fo foVar = tVar.f152281b;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        aVar.copyOnWrite();
        C57057b bVar2 = (C57057b) aVar.instance;
        foVar.getClass();
        bVar2.f152314b = foVar;
        bVar2.f152313a |= 1;
        if (this.f272766c.mo79746e(C90010bp.f246945aN)) {
            C57000j jVar3 = dVar.f152041d;
            if (jVar3 == null) {
                jVar3 = C57000j.f152155i;
            }
            C57041t tVar2 = jVar3.f152160d;
            if (tVar2 == null) {
                tVar2 = C57041t.f152278e;
            }
            C7973qv qvVar = tVar2.f152282c;
            if (qvVar == null) {
                qvVar = C7973qv.f28001c;
            }
            aVar.copyOnWrite();
            C57057b bVar3 = (C57057b) aVar.instance;
            qvVar.getClass();
            bVar3.f152315c = qvVar;
            bVar3.f152313a |= 2;
        }
        return (C57057b) aVar.build();
    }

    /* renamed from: c */
    private static final Optional m161919c(C56975k kVar) {
        C7548bb bbVar;
        if (kVar.f152093b == 9) {
            bbVar = (C7548bb) kVar.f152094c;
        } else {
            bbVar = C7548bb.f26117c;
        }
        if ((bbVar.f26119a & 1) != 0) {
            C57315dp dpVar = bbVar.f26120b;
            if (dpVar == null) {
                dpVar = C57315dp.f152986c;
            }
            return Optional.m71637of(dpVar);
        }
        ((C59052c) ((C59052c) f272764a.mo56226d()).mo56372aa(18978)).mo56386p("Attempted to handle DiscoverPinnedContentAction, but the action doesn't have a Token.");
        return Optional.empty();
    }

    /* renamed from: a */
    public final Intent mo90789a(C29827r rVar, C56975k kVar) {
        if (this.f272767d.mo78205l()) {
            Intent intent = new Intent();
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.HOME_SCREEN);
            l.mo112767b(false);
            C136122c cVar = (C136122c) C136123d.f370743d.createBuilder();
            Optional c = m161919c(kVar);
            Objects.requireNonNull(cVar);
            c.ifPresent(new C97673d(cVar));
            C56968d b = C97735q.m162005b(rVar);
            if ((b.f152038a & 8192) != 0) {
                C136130k kVar2 = (C136130k) C136131l.f370752d.createBuilder();
                C7682ga gaVar = b.f152051n;
                if (gaVar == null) {
                    gaVar = C7682ga.f26836d;
                }
                kVar2.copyOnWrite();
                C136131l lVar = (C136131l) kVar2.instance;
                gaVar.getClass();
                lVar.f370755b = gaVar;
                lVar.f370754a = 1 | lVar.f370754a;
                C57057b b2 = m161918b(b);
                kVar2.copyOnWrite();
                C136131l lVar2 = (C136131l) kVar2.instance;
                b2.getClass();
                lVar2.f370756c = b2;
                lVar2.f370754a |= 2;
                C136131l lVar3 = (C136131l) kVar2.build();
                cVar.copyOnWrite();
                C136123d dVar = (C136123d) cVar.instance;
                lVar3.getClass();
                dVar.f370747c = lVar3;
                dVar.f370745a |= 2;
            }
            ((C136120a) l).f370720a = C58833ax.m90834k((C136123d) cVar.build());
            l.mo112774i(Optional.empty());
            C136127h.m221196a(intent, l.mo112766a());
            intent.putExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0);
            intent.addFlags(268435456);
            return intent;
        }
        C91754b bVar = new C91754b(this.f272765b);
        bVar.f255887k = true;
        bVar.f255880d = 0;
        Optional c2 = m161919c(kVar);
        Objects.requireNonNull(bVar);
        c2.ifPresent(new C97672c(bVar));
        C56968d b3 = C97735q.m162005b(rVar);
        if ((b3.f152038a & 8192) != 0) {
            C7682ga gaVar2 = b3.f152051n;
            if (gaVar2 == null) {
                gaVar2 = C7682ga.f26836d;
            }
            C57057b b4 = m161918b(b3);
            bVar.f255884h = gaVar2;
            bVar.f255885i = b4;
        }
        return bVar.mo86242a();
    }
}
