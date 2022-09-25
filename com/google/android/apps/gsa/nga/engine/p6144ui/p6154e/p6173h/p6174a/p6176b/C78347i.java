package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.education.C75688am;
import com.google.android.apps.gsa.nga.shared.p6307af.C80566a;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80665au;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80716cr;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80723cy;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80724cz;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128184p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3775ac.p3779d.C48461a;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.i */
/* compiled from: PG */
public final class C78347i {

    /* renamed from: a */
    public static final C58528ij f215695a = C58528ij.m90012L(e.a, e.h, e.f);

    /* renamed from: b */
    public final C22871g f215696b;

    /* renamed from: c */
    public final C75688am f215697c;

    /* renamed from: d */
    public final C91142g f215698d;

    /* renamed from: e */
    public final C81252aq f215699e;

    /* renamed from: f */
    public final C128184p f215700f;

    /* renamed from: g */
    public final C80566a f215701g;

    /* renamed from: h */
    public final C60950i f215702h;

    /* renamed from: i */
    private final C68214a f215703i;

    public C78347i(C22871g gVar, C75688am amVar, C81252aq aqVar, C91142g gVar2, C68214a aVar, C128184p pVar, C80566a aVar2, C60950i iVar) {
        this.f215696b = gVar;
        this.f215697c = amVar;
        this.f215698d = gVar2;
        this.f215699e = aqVar;
        this.f215703i = aVar;
        this.f215700f = pVar;
        this.f215701g = aVar2;
        this.f215702h = iVar;
    }

    /* renamed from: b */
    public static C80724cz m125849b(C128178j jVar) {
        C80723cy cyVar = (C80723cy) C80724cz.f221601d.createBuilder();
        String str = jVar.f352615d;
        cyVar.copyOnWrite();
        C80724cz czVar = (C80724cz) cyVar.instance;
        str.getClass();
        czVar.f221603a |= 1;
        czVar.f221604b = str;
        C63204j jVar2 = jVar.f352617f;
        if (jVar2 == null) {
            jVar2 = C63204j.f170749e;
        }
        cyVar.copyOnWrite();
        C80724cz czVar2 = (C80724cz) cyVar.instance;
        jVar2.getClass();
        czVar2.f221605c = jVar2;
        czVar2.f221603a |= 2;
        return (C80724cz) cyVar.build();
    }

    /* renamed from: a */
    public final C80716cr mo73310a(String str, Locale locale, C48468h hVar) {
        C80716cr p = C80722cx.m128539p();
        p.mo74481e(((C81515c) this.f215703i.mo27525b()).mo75121a(locale).getString(R.string.nga_assist_query_suggestion_try_saying, new Object[0]));
        p.mo74488l(str);
        p.mo74483g(true);
        p.mo74482f(this.f215697c.mo71837m());
        p.mo74485i(this.f215697c.mo71828d());
        p.mo74484h(false);
        C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
        C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        str.getClass();
        lVar.f221175a = 2;
        lVar.f221176b = str;
        jVar.copyOnWrite();
        C80578l lVar2 = (C80578l) kVar.build();
        lVar2.getClass();
        ((C80865k) jVar.instance).f221812a = lVar2;
        int i = e.R.ca;
        jVar.copyOnWrite();
        ((C80865k) jVar.instance).f221813b = i;
        eVar.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar.instance;
        C80865k kVar2 = (C80865k) jVar.build();
        kVar2.getClass();
        ajVar.f221754b = kVar2;
        ajVar.f221753a = 2;
        p.mo74479c((C80831aj) eVar.build());
        ((C80665au) p).f221455e = this.f215697c.mo71826b();
        C48461a aVar = (C48461a) C48462b.f125188k.createBuilder();
        aVar.copyOnWrite();
        C48462b bVar = (C48462b) aVar.instance;
        bVar.f125199i = hVar.f125214h;
        bVar.f125191a |= 64;
        p.mo74489m(Optional.m71637of((C48462b) aVar.build()));
        return p;
    }
}
