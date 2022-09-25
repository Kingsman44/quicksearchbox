package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131073c;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131074d;
import com.google.assistant.p3886c.p3887a.C50665a;
import com.google.assistant.p3886c.p3887a.C50666b;
import com.google.assistant.p3886c.p3887a.C50668d;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3886c.p3887a.C50680p;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59203do;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C130996aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131043cc f358387a;

    /* renamed from: b */
    public final /* synthetic */ boolean f358388b;

    /* renamed from: c */
    public final /* synthetic */ C50672h f358389c;

    /* renamed from: d */
    public final /* synthetic */ C50680p f358390d;

    /* renamed from: e */
    public final /* synthetic */ C50680p f358391e;

    /* renamed from: f */
    public final /* synthetic */ C131074d f358392f;

    /* renamed from: g */
    public final /* synthetic */ long f358393g;

    /* renamed from: h */
    public final /* synthetic */ C58485gu f358394h;

    public /* synthetic */ C130996aj(C131043cc ccVar, boolean z, C50672h hVar, C50680p pVar, C50680p pVar2, C131074d dVar, long j, C58485gu guVar) {
        this.f358387a = ccVar;
        this.f358388b = z;
        this.f358389c = hVar;
        this.f358390d = pVar;
        this.f358391e = pVar2;
        this.f358392f = dVar;
        this.f358393g = j;
        this.f358394h = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        double d;
        long j;
        long j2;
        C50668d dVar;
        double d2;
        C131043cc ccVar = this.f358387a;
        boolean z = this.f358388b;
        C50672h hVar = this.f358389c;
        C50680p pVar = this.f358390d;
        C50680p pVar2 = this.f358391e;
        C131074d dVar2 = this.f358392f;
        long j3 = this.f358393g;
        C58485gu guVar = this.f358394h;
        C58485gu guVar2 = (C58485gu) obj;
        C50665a aVar = (C50665a) ((C50666b) Collection.EL.stream(guVar2).reduce(C131032bs.f358442a).get()).toBuilder();
        aVar.mo53418a(C131043cc.m213551d(guVar2).f131799k);
        C50666b bVar = (C50666b) aVar.build();
        if (z) {
            long longValue = ((C131073c) dVar2).f358529c.longValue();
            C50668d e = C131043cc.m213552e(guVar2, Optional.empty(), Optional.empty());
            if ((hVar.f131818a & 1) != 0) {
                C106531e a = C106531e.m177306a(hVar.f131819b);
                if (a == null) {
                    a = C106531e.UNKNOWN;
                }
                dVar = C131043cc.m213552e(guVar2, Optional.m71637of(a), Optional.empty());
            } else {
                dVar = C50668d.f131800j;
            }
            double c = C131043cc.m213550c(e, pVar.f131852c);
            double c2 = C131043cc.m213550c(dVar, pVar2.f131852c);
            if (longValue == 0) {
                d2 = 1.0d;
            } else {
                double min = (double) Math.min(longValue, pVar2.f131851b);
                double d3 = (double) longValue;
                Double.isNaN(min);
                Double.isNaN(d3);
                d2 = min / d3;
            }
            d = (c2 * d2) + ((1.0d - d2) * c);
        } else if (j3 <= 0) {
            ((C58970a) ((C58970a) ccVar.f358456b.mo56226d()).mo56372aa(39023)).mo56386p("Headphone duration is zero. Setting score to zero.");
            d = C59203do.f157270a;
        } else {
            double d4 = (double) j3;
            double d5 = (double) (bVar.f131791c + bVar.f131792d);
            Double.isNaN(d4);
            Double.isNaN(d4);
            Double.isNaN(d5);
            d = d5 / (d4 + d4);
        }
        if (z) {
            C50668d e2 = C131043cc.m213552e(guVar2, Optional.empty(), Optional.empty());
            j = e2.f131803b + e2.f131804c;
            j2 = e2.f131805d;
        } else {
            j = bVar.f131792d + bVar.f131791c;
            j2 = bVar.f131793e;
        }
        String str = bVar.f131790b;
        C130696a b = C130701b.m213087b();
        b.mo109786b(str);
        b.mo109787c(d);
        ((C130735c) b).f357923c = Optional.m71637of(Duration.ofMillis(j));
        b.mo109789e((float) j2);
        return (C130701b) Collection.EL.stream(guVar).filter(new C131033bt(str)).findFirst().flatMap(C131034bu.f358444a).map(new C131035bv(b)).orElse(b.mo109785a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
