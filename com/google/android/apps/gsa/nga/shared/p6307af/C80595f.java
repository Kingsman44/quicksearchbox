package com.google.android.apps.gsa.nga.shared.p6307af;

import android.content.Intent;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80343ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80344cl;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80574h;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80575i;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80576j;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80579m;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80582p;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80584r;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80585s;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80588v;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.f */
/* compiled from: PG */
public final class C80595f {

    /* renamed from: a */
    public final C80579m f221271a;

    public C80595f(C80590x xVar, int i, String str, String str2, String str3) {
        C80585s sVar = (C80585s) C80586t.f221205g.createBuilder();
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(i);
        String format = String.format(locale, "S#%s#%d#%s", new Object[]{Integer.valueOf(xVar.getNumber()), valueOf, Integer.valueOf(str.hashCode())});
        sVar.copyOnWrite();
        format.getClass();
        ((C80586t) sVar.instance).f221207a = format;
        sVar.copyOnWrite();
        str.getClass();
        ((C80586t) sVar.instance).f221208b = str;
        sVar.copyOnWrite();
        str2.getClass();
        ((C80586t) sVar.instance).f221209c = str2;
        if (i != 0) {
            C80582p pVar = (C80582p) C80584r.f221200d.createBuilder();
            pVar.copyOnWrite();
            C80584r rVar = (C80584r) pVar.instance;
            rVar.f221202a = 3;
            rVar.f221203b = valueOf;
            sVar.copyOnWrite();
            C80584r rVar2 = (C80584r) pVar.build();
            rVar2.getClass();
            ((C80586t) sVar.instance).f221210d = rVar2;
        } else if (!TextUtils.isEmpty(str3)) {
            C80582p pVar2 = (C80582p) C80584r.f221200d.createBuilder();
            pVar2.copyOnWrite();
            C80584r rVar3 = (C80584r) pVar2.instance;
            str3.getClass();
            rVar3.f221202a = 1;
            rVar3.f221203b = str3;
            sVar.copyOnWrite();
            C80584r rVar4 = (C80584r) pVar2.build();
            rVar4.getClass();
            ((C80586t) sVar.instance).f221210d = rVar4;
        }
        C80579m mVar = (C80579m) C80581o.f221189i.createBuilder();
        mVar.copyOnWrite();
        ((C80581o) mVar.instance).f221191a = xVar.getNumber();
        C80586t tVar = (C80586t) sVar.build();
        mVar.copyOnWrite();
        tVar.getClass();
        ((C80581o) mVar.instance).f221192b = tVar;
        this.f221271a = mVar;
    }

    /* renamed from: e */
    public static C80595f m128215e(C80590x xVar, int i, String str) {
        return new C80595f(xVar, i, str, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    /* renamed from: f */
    public static C80595f m128216f(C80590x xVar, String str) {
        return new C80595f(xVar, 0, str, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    /* renamed from: g */
    public static C80595f m128217g(C80590x xVar, int i) {
        return new C80595f(xVar, i, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final C80594e mo74357a(Intent intent) {
        C80579m mVar = this.f221271a;
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        C80574h hVar = (C80574h) C80576j.f221168d.createBuilder();
        String uri = intent.toUri(1);
        hVar.copyOnWrite();
        uri.getClass();
        ((C80576j) hVar.instance).f221170a = uri;
        hVar.copyOnWrite();
        ((C80576j) hVar.instance).f221172c = C80575i.m128207a(3);
        C80576j jVar = (C80576j) hVar.build();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        jVar.getClass();
        lVar.f221176b = jVar;
        lVar.f221175a = 3;
        mVar.copyOnWrite();
        C80578l lVar2 = (C80578l) kVar.build();
        C80581o oVar = C80581o.f221189i;
        lVar2.getClass();
        ((C80581o) mVar.instance).f221193c = lVar2;
        return new C80594e(this);
    }

    /* renamed from: b */
    public final C80594e mo74358b() {
        C80343ck ckVar = (C80343ck) C80344cl.f220460d.createBuilder();
        C80590x a = C80590x.m128211a(((C80581o) this.f221271a.instance).f221191a);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        ckVar.copyOnWrite();
        ((C80344cl) ckVar.instance).f220463b = a.getNumber();
        return mo74359c((C80344cl) ckVar.build());
    }

    /* renamed from: c */
    public final C80594e mo74359c(C80344cl clVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        clVar.getClass();
        aqVar.f220360b = clVar;
        aqVar.f220359a = 22;
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        C80295aq aqVar2 = (C80295aq) aoVar.build();
        aqVar2.getClass();
        gVar.f220648b = aqVar2;
        gVar.f220647a = 2;
        lVar.mo74317i(eVar);
        C80401n nVar = (C80401n) lVar.build();
        C80579m mVar = this.f221271a;
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        kVar.copyOnWrite();
        C80578l lVar2 = (C80578l) kVar.instance;
        nVar.getClass();
        lVar2.f221176b = nVar;
        lVar2.f221175a = 8;
        mVar.copyOnWrite();
        C80578l lVar3 = (C80578l) kVar.build();
        C80581o oVar = C80581o.f221189i;
        lVar3.getClass();
        ((C80581o) mVar.instance).f221193c = lVar3;
        return new C80594e(this);
    }

    /* renamed from: d */
    public final C80594e mo74360d(String str) {
        C80579m mVar = this.f221271a;
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        str.getClass();
        lVar.f221175a = 2;
        lVar.f221176b = str;
        mVar.copyOnWrite();
        C80578l lVar2 = (C80578l) kVar.build();
        C80581o oVar = C80581o.f221189i;
        lVar2.getClass();
        ((C80581o) mVar.instance).f221193c = lVar2;
        return new C80594e(this);
    }

    /* renamed from: h */
    public final void mo74361h(int i) {
        C80579m mVar = this.f221271a;
        C80589w wVar = ((C80581o) mVar.instance).f221194d;
        if (wVar == null) {
            wVar = C80589w.f221220i;
        }
        C80588v vVar = (C80588v) wVar.toBuilder();
        vVar.copyOnWrite();
        ((C80589w) vVar.instance).f221226e = i;
        mVar.copyOnWrite();
        C80589w wVar2 = (C80589w) vVar.build();
        wVar2.getClass();
        ((C80581o) mVar.instance).f221194d = wVar2;
    }
}
