package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6179c.p6180a;

import com.google.android.apps.gsa.assistant.shared.appactions.p5807g.C73821h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78317f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80339cg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80340ch;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80341ci;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80342cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80343ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80344cl;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80579m;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80585s;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80588v;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.assistant.p3745ab.C48304dc;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3861at.C49826ak;
import com.google.common.p4552o.C60056je;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.c.a.a */
/* compiled from: PG */
public final class C78547a {

    /* renamed from: a */
    public final C78317f f216298a;

    /* renamed from: b */
    public final C81515c f216299b;

    /* renamed from: c */
    public final C83358h f216300c;

    public C78547a(C78317f fVar, C81515c cVar, C83358h hVar) {
        this.f216298a = fVar;
        this.f216299b = cVar;
        this.f216300c = hVar;
    }

    /* renamed from: a */
    public static boolean m126190a(C87693ab abVar) {
        C49826ak akVar = abVar.f237119c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        return !akVar.f129465b.isEmpty();
    }

    /* renamed from: b */
    public final C80581o mo73492b(C87693ab abVar, int i, int i2, int i3, int i4) {
        C80339cg cgVar = (C80339cg) C80340ch.f220451d.createBuilder();
        cgVar.copyOnWrite();
        C80340ch chVar = (C80340ch) cgVar.instance;
        chVar.f220455c = i - 2;
        chVar.f220453a |= 2;
        cgVar.copyOnWrite();
        C80340ch chVar2 = (C80340ch) cgVar.instance;
        abVar.getClass();
        chVar2.f220454b = abVar;
        chVar2.f220453a |= 1;
        C80340ch chVar3 = (C80340ch) cgVar.build();
        C80343ck ckVar = (C80343ck) C80344cl.f220460d.createBuilder();
        C80590x xVar = C80590x.APP_ACTIONS;
        ckVar.copyOnWrite();
        ((C80344cl) ckVar.instance).f220463b = xVar.getNumber();
        C80341ci ciVar = (C80341ci) C80342cj.f220456c.createBuilder();
        ciVar.copyOnWrite();
        C80342cj cjVar = (C80342cj) ciVar.instance;
        chVar3.getClass();
        cjVar.f220459b = chVar3;
        cjVar.f220458a |= 2;
        C80342cj cjVar2 = (C80342cj) ciVar.build();
        ckVar.copyOnWrite();
        C80344cl clVar = (C80344cl) ckVar.instance;
        cjVar2.getClass();
        clVar.f220464c = cjVar2;
        clVar.f220462a |= 1;
        C80344cl clVar2 = (C80344cl) ckVar.build();
        C48304dc dcVar = (C48304dc) C48305dd.f124927d.createBuilder();
        C49826ak akVar = abVar.f237119c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C60056je b = C73821h.m108391b(akVar);
        dcVar.copyOnWrite();
        C48305dd ddVar = (C48305dd) dcVar.instance;
        b.getClass();
        ddVar.f124932c = b;
        ddVar.f124930a |= 2;
        C48305dd ddVar2 = (C48305dd) dcVar.build();
        C80595f f = C80595f.m128216f(C80590x.APP_ACTIONS, this.f216299b.mo75121a((Locale) ((C83361k) this.f216300c).f227199b.get()).getString(i2, new Object[0]));
        C80579m mVar = f.f221271a;
        C80586t tVar = ((C80581o) mVar.instance).f221192b;
        if (tVar == null) {
            tVar = C80586t.f221205g;
        }
        C80585s sVar = (C80585s) tVar.toBuilder();
        sVar.copyOnWrite();
        ((C80586t) sVar.instance).f221212f = i3 - 2;
        C80586t tVar2 = (C80586t) sVar.build();
        mVar.copyOnWrite();
        tVar2.getClass();
        ((C80581o) mVar.instance).f221192b = tVar2;
        f.mo74361h(i4);
        C80579m mVar2 = f.f221271a;
        C80589w wVar = ((C80581o) mVar2.instance).f221194d;
        if (wVar == null) {
            wVar = C80589w.f221220i;
        }
        C80588v vVar = (C80588v) wVar.toBuilder();
        vVar.copyOnWrite();
        ddVar2.getClass();
        ((C80589w) vVar.instance).f221229h = ddVar2;
        mVar2.copyOnWrite();
        C80589w wVar2 = (C80589w) vVar.build();
        wVar2.getClass();
        ((C80581o) mVar2.instance).f221194d = wVar2;
        return f.mo74359c(clVar2).mo74356a();
    }
}
