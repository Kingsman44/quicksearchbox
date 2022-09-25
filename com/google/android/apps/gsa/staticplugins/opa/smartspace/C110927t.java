package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83724a;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.t */
/* compiled from: PG */
public final class C110927t {

    /* renamed from: a */
    public final C60887da f309014a;

    /* renamed from: b */
    public final C21370a f309015b;

    /* renamed from: c */
    public final Context f309016c;

    /* renamed from: d */
    private final C91189au f309017d;

    /* renamed from: e */
    private final C60887da f309018e;

    /* renamed from: f */
    private final C86124t f309019f;

    public C110927t(C91189au auVar, C60887da daVar, C60887da daVar2, C86124t tVar, C21370a aVar, Context context) {
        this.f309017d = auVar;
        this.f309018e = daVar2;
        this.f309014a = daVar;
        this.f309019f = tVar;
        this.f309015b = aVar;
        this.f309016c = context;
    }

    /* renamed from: a */
    public static C83800p m184682a(C50818do doVar, C83739ak akVar, Drawable drawable) {
        C83798n k = C83800p.m133473k();
        C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
        alVar.copyOnWrite();
        C83741am amVar = (C83741am) alVar.instance;
        doVar.getClass();
        amVar.f228252c = doVar;
        amVar.f228250a |= 4;
        alVar.copyOnWrite();
        C83741am amVar2 = (C83741am) alVar.instance;
        amVar2.f228251b = akVar;
        amVar2.f228250a |= 2;
        k.mo77043b((C83741am) alVar.build());
        if (drawable != null) {
            ((C83724a) k).f228192c = C58485gu.m89842j(C58485gu.m89846n(((BitmapDrawable) drawable).getBitmap()));
        }
        return k.mo77042a();
    }

    /* renamed from: b */
    public static C50818do m184683b(C83739ak akVar, C50731p pVar, long j, C63088z zVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C49156z zVar2 = akVar.f228240i;
        if (zVar2 == null) {
            zVar2 = C49156z.f127111d;
        }
        C63042fg fgVar = zVar2.f127115c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long millis = timeUnit.toMillis(fgVar.f170154a);
        C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
        mVar.copyOnWrite();
        C50729n nVar = (C50729n) mVar.instance;
        nVar.f132009a |= 1;
        nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
        Optional e = m184685e(akVar.f228243l);
        Objects.requireNonNull(mVar);
        e.ifPresent(new C110914r(mVar));
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = akVar.f228234c;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.END;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar3 = (C50723h) aVar.build();
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        if ((akVar.f228232a & 4) != 0) {
            C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
            String str2 = akVar.f228235d;
            aVar2.copyOnWrite();
            C50723h hVar4 = (C50723h) aVar2.instance;
            str2.getClass();
            hVar4.f132001a |= 1;
            hVar4.f132002b = str2;
            C50722g gVar2 = C50722g.END;
            aVar2.copyOnWrite();
            C50723h hVar5 = (C50723h) aVar2.instance;
            hVar5.f132003c = gVar2.f131998e;
            hVar5.f132001a |= 2;
            cyVar.copyOnWrite();
            C50802cz czVar2 = (C50802cz) cyVar.instance;
            C50723h hVar6 = (C50723h) aVar2.build();
            hVar6.getClass();
            czVar2.f132241d = hVar6;
            czVar2.f132238a |= 4;
        }
        if ((akVar.f228232a & 8) != 0) {
            C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
            String str3 = akVar.f228236e;
            aVar3.copyOnWrite();
            C50723h hVar7 = (C50723h) aVar3.instance;
            str3.getClass();
            hVar7.f132001a |= 1;
            hVar7.f132002b = str3;
            C50722g gVar3 = C50722g.END;
            aVar3.copyOnWrite();
            C50723h hVar8 = (C50723h) aVar3.instance;
            hVar8.f132003c = gVar3.f131998e;
            hVar8.f132001a |= 2;
            cyVar.copyOnWrite();
            C50802cz czVar3 = (C50802cz) cyVar.instance;
            C50723h hVar9 = (C50723h) aVar3.build();
            hVar9.getClass();
            czVar3.f132243f = hVar9;
            czVar3.f132238a |= 16;
        }
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 65536;
        doVar.f132321r = true;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132304a |= 524288;
        doVar2.f132324u = true;
        int hashCode = String.valueOf(akVar.f228234c).concat(String.valueOf(akVar.f228235d)).hashCode();
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        doVar3.f132304a |= 4;
        doVar3.f132307d = hashCode;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132304a |= 1;
        doVar4.f132305b = false;
        C50792cp cpVar = C50792cp.PRIMARY;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        doVar5.f132306c = cpVar.f132174e;
        doVar5.f132304a |= 2;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        C50802cz czVar4 = (C50802cz) cyVar.build();
        czVar4.getClass();
        doVar6.f132312i = czVar4;
        doVar6.f132304a |= 128;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        C50802cz czVar5 = (C50802cz) cyVar.build();
        czVar5.getClass();
        doVar7.f132309f = czVar5;
        doVar7.f132304a |= 16;
        C50729n nVar2 = (C50729n) mVar.build();
        cnVar.copyOnWrite();
        C50818do doVar8 = (C50818do) cnVar.instance;
        nVar2.getClass();
        doVar8.f132314k = nVar2;
        doVar8.f132304a |= 512;
        C50794cr a = C50794cr.m85938a(akVar.f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        cnVar.copyOnWrite();
        C50818do doVar9 = (C50818do) cnVar.instance;
        doVar9.f132315l = a.f132222T;
        doVar9.f132304a |= 1024;
        cnVar.mo53459a((Iterable) Collection.EL.stream(akVar.f228246o).map(new C110926s(akVar)).collect(C58370cn.f155946a));
        if ((akVar.f228232a & 4096) != 0) {
            C50728m mVar2 = (C50728m) C50729n.f132007g.createBuilder();
            C63088z zVar3 = akVar.f228245n;
            mVar2.copyOnWrite();
            C50729n nVar3 = (C50729n) mVar2.instance;
            zVar3.getClass();
            nVar3.f132009a |= 16;
            nVar3.f132013e = zVar3;
            cnVar.copyOnWrite();
            C50818do doVar10 = (C50818do) cnVar.instance;
            C50729n nVar4 = (C50729n) mVar2.build();
            nVar4.getClass();
            doVar10.f132326w = nVar4;
            doVar10.f132304a |= 1048576;
        }
        if (zVar != null) {
            C50728m mVar3 = (C50728m) C50729n.f132007g.createBuilder();
            mVar3.copyOnWrite();
            C50729n nVar5 = (C50729n) mVar3.instance;
            nVar5.f132009a |= 16;
            nVar5.f132013e = zVar;
            C50729n nVar6 = (C50729n) mVar3.build();
            cnVar.copyOnWrite();
            C50818do doVar11 = (C50818do) cnVar.instance;
            nVar6.getClass();
            doVar11.f132327x = nVar6;
            doVar11.f132304a |= C89885b.NOW_VALUE;
        }
        String str4 = akVar.f228238g;
        C50794cr a2 = C50794cr.m85938a(akVar.f228239h);
        if (a2 == null) {
            a2 = C50794cr.UNDEFINED;
        }
        C50733r c = m184684c(str4, a2, pVar);
        cnVar.copyOnWrite();
        C50818do doVar12 = (C50818do) cnVar.instance;
        c.getClass();
        doVar12.f132316m = c;
        doVar12.f132304a |= 2048;
        cnVar.copyOnWrite();
        C50818do doVar13 = (C50818do) cnVar.instance;
        doVar13.f132304a |= 4096;
        doVar13.f132317n = j;
        cnVar.copyOnWrite();
        C50818do doVar14 = (C50818do) cnVar.instance;
        doVar14.f132304a |= 8192;
        doVar14.f132318o = j;
        cnVar.copyOnWrite();
        C50818do doVar15 = (C50818do) cnVar.instance;
        doVar15.f132304a |= 16384;
        doVar15.f132319p = millis - j;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a |= 1;
        ctVar.f132226b = millis;
        cnVar.copyOnWrite();
        C50818do doVar16 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar16.f132320q = ctVar2;
        doVar16.f132304a |= 32768;
        return (C50818do) cnVar.build();
    }

    /* renamed from: c */
    static C50733r m184684c(String str, C50794cr crVar, C50731p pVar) {
        Intent c = C92122r.m151185c(str, crVar, pVar, false);
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        String uri = c.toUri(1);
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri.getClass();
        rVar2.f132023a |= 2;
        rVar2.f132025c = uri;
        return (C50733r) qVar.build();
    }

    /* renamed from: e */
    private static Optional m184685e(List list) {
        if (list.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(((C83734af) Collection.EL.stream(list).filter(C110698i.f308461a).findFirst().orElseGet(new C110715k(list))).f228219b);
    }

    /* renamed from: d */
    public final C60870cx mo98939d(C83739ak akVar) {
        C50731p pVar;
        C60870cx cxVar;
        C60870cx cxVar2;
        if (akVar == null) {
            return C60856cj.m92900i(C83800p.m133473k().mo77042a());
        }
        if (this.f309019f.mo79746e(C89985ax.f246715aw)) {
            pVar = C50731p.START_ACTIVITY;
        } else {
            pVar = C50731p.BROADCAST;
        }
        Optional e = m184685e(akVar.f228243l);
        C60870cx e2 = e.isPresent() ? this.f309017d.mo85418e(Uri.parse((String) e.get()), 7) : null;
        C83736ah ahVar = akVar.f228247p;
        if (ahVar == null) {
            ahVar = C83736ah.f228222c;
        }
        if (ahVar.f228224a == 1) {
            C83736ah ahVar2 = akVar.f228247p;
            if (ahVar2 == null) {
                ahVar2 = C83736ah.f228222c;
            }
            cxVar = C60922j.m93044g(this.f309017d.mo85425m(Uri.parse(ahVar2.f228224a == 1 ? (String) ahVar2.f228225b : BuildConfig.FLAVOR), C58836b.f156633a, 7), C47810es.m84963c(C110791m.f308694a), this.f309018e);
        } else {
            C83736ah ahVar3 = akVar.f228247p;
            if (ahVar3 == null) {
                ahVar3 = C83736ah.f228222c;
            }
            cxVar = ahVar3.f228224a == 2 ? this.f309018e.mo19399b(new C110839n(this, akVar)) : null;
        }
        if (cxVar == null) {
            cxVar2 = C60856cj.m92900i(m184683b(akVar, pVar, this.f309015b.mo26870b(), (C63088z) null));
        } else {
            cxVar2 = C60922j.m93044g(cxVar, C47810es.m84963c(new C110841o(this, akVar, pVar)), this.f309014a);
        }
        if (e2 == null) {
            return C60922j.m93044g(cxVar2, C47810es.m84963c(new C110875p(akVar)), this.f309014a);
        }
        return C60922j.m93045h(e2, C47810es.m84966f(new C110895q(this, cxVar2, akVar)), this.f309014a);
    }
}
