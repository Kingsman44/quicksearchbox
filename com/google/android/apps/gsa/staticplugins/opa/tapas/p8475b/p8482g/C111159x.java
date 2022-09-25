package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80005cz;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8486j.C111217a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113151bi;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48603as;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48610az;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48613bb;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48615bd;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48642cd;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48658s;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.C50251qd;
import com.google.assistant.p3861at.act;
import com.google.common.p4580v.C60950i;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.x */
/* compiled from: PG */
public final /* synthetic */ class C111159x implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111136ae f309435a;

    /* renamed from: b */
    public final /* synthetic */ Optional f309436b;

    /* renamed from: c */
    public final /* synthetic */ Optional f309437c;

    /* renamed from: d */
    public final /* synthetic */ Optional f309438d;

    /* renamed from: e */
    public final /* synthetic */ Optional f309439e;

    /* renamed from: f */
    public final /* synthetic */ Optional f309440f;

    /* renamed from: g */
    public final /* synthetic */ Optional f309441g;

    public /* synthetic */ C111159x(C111136ae aeVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.f309435a = aeVar;
        this.f309436b = optional;
        this.f309437c = optional2;
        this.f309438d = optional3;
        this.f309439e = optional4;
        this.f309440f = optional5;
        this.f309441g = optional6;
    }

    public final Object get() {
        String str;
        C111136ae aeVar = this.f309435a;
        Optional optional = this.f309436b;
        Optional optional2 = this.f309437c;
        Optional optional3 = this.f309438d;
        Optional optional4 = this.f309439e;
        Optional optional5 = this.f309440f;
        Optional optional6 = this.f309441g;
        C80005cz czVar = (C80005cz) C80007da.f219520C.createBuilder();
        String F = ((C86054o) aeVar.f309397f.mo27525b()).mo79659F();
        if (F == null) {
            str = "en";
        } else {
            str = ((ae) aeVar.f309398g.mo27525b()).d(F).toLanguageTag();
        }
        czVar.copyOnWrite();
        C80007da daVar = (C80007da) czVar.instance;
        str.getClass();
        daVar.f219524a |= 1;
        daVar.f219525b = str;
        if (optional.isPresent()) {
            C111136ae.m184907h(czVar, (String) optional.get());
        }
        if (((C111217a) aeVar.f309395d.mo27525b()).mo99058a().isPresent()) {
            String str2 = (String) ((C111217a) aeVar.f309395d.mo27525b()).mo99058a().get();
            czVar.copyOnWrite();
            C80007da daVar2 = (C80007da) czVar.instance;
            str2.getClass();
            daVar2.f219524a |= 2;
            daVar2.f219526c = str2;
        }
        if (optional2.isPresent()) {
            C48658s sVar = (C48658s) optional2.get();
            boolean z = sVar.f125755a;
            czVar.copyOnWrite();
            C80007da daVar3 = (C80007da) czVar.instance;
            daVar3.f219524a |= 4;
            daVar3.f219527d = z;
            int i = sVar.f125756b;
            czVar.copyOnWrite();
            C80007da daVar4 = (C80007da) czVar.instance;
            daVar4.f219524a |= 16;
            daVar4.f219529f = (float) i;
        } else {
            czVar.copyOnWrite();
            C80007da daVar5 = (C80007da) czVar.instance;
            daVar5.f219524a |= 4;
            daVar5.f219527d = false;
            czVar.copyOnWrite();
            C80007da daVar6 = (C80007da) czVar.instance;
            daVar6.f219524a |= 16;
            daVar6.f219529f = 100.0f;
        }
        C111136ae.f309392a.mo105241j("addTapasMediaContext", new C111157v(aeVar, czVar));
        if (optional3.isPresent() && ((C48642cd) optional3.get()).f125722a != null) {
            C48603as asVar = ((C48642cd) optional3.get()).f125722a;
            if (asVar == null) {
                asVar = C48603as.f125613d;
            }
            double d = asVar.f125615a;
            double d2 = asVar.f125616b;
            if (optional4.isPresent()) {
                C49842b bVar = ((act) optional4.get()).f128899f;
                if (bVar == null) {
                    bVar = C49842b.f129519l;
                }
                if ((bVar.f129521a & 8) != 0) {
                    C50251qd qdVar = bVar.f129524d;
                    if (qdVar == null) {
                        qdVar = C50251qd.f130676e;
                    }
                    boolean booleanValue = C111136ae.m184906g(d, d2, qdVar).booleanValue();
                    czVar.copyOnWrite();
                    C80007da daVar7 = (C80007da) czVar.instance;
                    daVar7.f219524a |= 256;
                    daVar7.f219530g = booleanValue;
                }
                if ((bVar.f129521a & 16) != 0) {
                    C50251qd qdVar2 = bVar.f129525e;
                    if (qdVar2 == null) {
                        qdVar2 = C50251qd.f130676e;
                    }
                    boolean booleanValue2 = C111136ae.m184906g(d, d2, qdVar2).booleanValue();
                    czVar.copyOnWrite();
                    C80007da daVar8 = (C80007da) czVar.instance;
                    daVar8.f219524a |= 512;
                    daVar8.f219531h = booleanValue2;
                }
            }
        }
        if (optional5.isPresent()) {
            C48615bd bdVar = (C48615bd) optional5.get();
            if (!bdVar.f125635a.isEmpty()) {
                C48610az azVar = ((C48613bb) bdVar.f125635a.get(0)).f125631a;
                if (azVar == null) {
                    azVar = C48610az.f125624d;
                }
                if (!azVar.f125627b.isEmpty()) {
                    String str3 = (String) azVar.f125627b.get(0);
                    czVar.copyOnWrite();
                    C80007da daVar9 = (C80007da) czVar.instance;
                    str3.getClass();
                    daVar9.f219524a |= 1024;
                    daVar9.f219532i = str3;
                }
            }
        }
        optional6.ifPresent(new C111152q(czVar));
        LocalDateTime c = ((C60950i) aeVar.f309400i.mo27525b()).mo57446c((ZoneId) aeVar.f309401j.mo6453a());
        int value = c.getDayOfWeek().getValue();
        czVar.copyOnWrite();
        C80007da daVar10 = (C80007da) czVar.instance;
        daVar10.f219524a |= 8192;
        daVar10.f219534k = value;
        int hour = c.getHour();
        int minute = c.getMinute();
        czVar.copyOnWrite();
        C80007da daVar11 = (C80007da) czVar.instance;
        daVar11.f219524a |= 32768;
        daVar11.f219536m = ((float) hour) + (((float) minute) / 60.0f) + 1.0f;
        boolean K = C90772bp.m148284K(aeVar.f309396e);
        czVar.copyOnWrite();
        C80007da daVar12 = (C80007da) czVar.instance;
        daVar12.f219524a |= 65536;
        daVar12.f219537n = K;
        boolean D = C90772bp.m148277D(aeVar.f309396e);
        czVar.copyOnWrite();
        C80007da daVar13 = (C80007da) czVar.instance;
        daVar13.f219524a |= C89885b.S3REQUEST_VALUE;
        daVar13.f219538o = D;
        boolean H = C90772bp.m148281H(aeVar.f309396e);
        czVar.copyOnWrite();
        C80007da daVar14 = (C80007da) czVar.instance;
        daVar14.f219524a |= C89885b.HTTP_VALUE;
        daVar14.f219539p = H;
        boolean I = C90772bp.m148282I(aeVar.f309396e);
        czVar.copyOnWrite();
        C80007da daVar15 = (C80007da) czVar.instance;
        daVar15.f219524a |= 524288;
        daVar15.f219540q = I;
        boolean G = C90772bp.m148280G(aeVar.f309396e);
        czVar.copyOnWrite();
        C80007da daVar16 = (C80007da) czVar.instance;
        daVar16.f219524a |= 1048576;
        daVar16.f219541r = G;
        czVar.copyOnWrite();
        C80007da daVar17 = (C80007da) czVar.instance;
        daVar17.f219524a |= C89885b.NOW_VALUE;
        daVar17.f219542s = false;
        boolean f = C113151bi.m187168f(aeVar.f309396e);
        czVar.copyOnWrite();
        C80007da daVar18 = (C80007da) czVar.instance;
        daVar18.f219524a |= 67108864;
        daVar18.f219547x = f;
        Optional d3 = C113151bi.m187166d(aeVar.f309396e);
        Objects.requireNonNull(czVar);
        d3.ifPresent(new C111153r(czVar));
        Optional b = C113151bi.m187164b(aeVar.f309396e);
        Objects.requireNonNull(czVar);
        b.ifPresent(new C111154s(czVar));
        Optional e = C113151bi.m187167e(aeVar.f309396e);
        Objects.requireNonNull(czVar);
        e.ifPresent(new C111155t(czVar));
        Optional a = C113151bi.m187163a(aeVar.f309396e);
        Objects.requireNonNull(czVar);
        a.ifPresent(new C111156u(czVar));
        return (C80007da) czVar.build();
    }
}
