package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import androidx.core.p092d.C1886a;
import com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9512a.C126912a;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128037f;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128038g;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128042k;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128043l;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128046o;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Map;
import p3186j$.util.OptionalDouble;
import p3186j$.util.function.DoublePredicate;
import p3186j$.util.function.Supplier;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.aj */
/* compiled from: PG */
final class C127960aj implements C127951aa {

    /* renamed from: a */
    public final C37215b f352202a;

    /* renamed from: b */
    public final C51347ei f352203b;

    /* renamed from: c */
    public final C37254c f352204c;

    /* renamed from: d */
    public final C37254c f352205d;

    /* renamed from: e */
    public final ToDoubleFunction f352206e;

    /* renamed from: f */
    private final C128043l f352207f;

    /* renamed from: g */
    private final Supplier f352208g;

    /* renamed from: h */
    private final ExecutorService f352209h;

    /* renamed from: i */
    private final C128042k f352210i;

    /* renamed from: j */
    private final C37254c f352211j;

    public C127960aj(C128043l lVar, C37215b bVar, Supplier supplier, ExecutorService executorService, C51347ei eiVar, C128042k kVar, C37254c cVar, C37254c cVar2, C37254c cVar3, ToDoubleFunction toDoubleFunction) {
        this.f352207f = lVar;
        this.f352202a = bVar;
        this.f352208g = supplier;
        this.f352209h = executorService;
        this.f352203b = eiVar;
        this.f352210i = kVar;
        this.f352211j = cVar;
        this.f352204c = cVar2;
        this.f352205d = cVar3;
        this.f352206e = toDoubleFunction;
    }

    /* renamed from: a */
    static double m209082a(double d, double d2, double d3, double d4, double d5) {
        return C1886a.m5143a(m209090k(Math.hypot(d - d3, d2 - d4), d5) / m209090k(C59203do.f157270a, d5), C59203do.f157270a, 1.0d);
    }

    /* renamed from: d */
    static double m209083d(double d, double d2, double d3) {
        return C1886a.m5143a(m209090k(d - d2, d3) / m209090k(C59203do.f157270a, d3), C59203do.f157270a, 1.0d);
    }

    /* renamed from: e */
    static double m209084e(double d) {
        return C1886a.m5143a((d * 0.4921875d) + 0.5078125d, 0.5078125d, 1.0d);
    }

    /* renamed from: f */
    static double m209085f(C128046o oVar) {
        double d;
        C128046o oVar2 = oVar;
        C58485gu g = m209086g(oVar2, C128045n.GYROSCOPE);
        C58485gu g2 = m209086g(oVar2, C128045n.ACCELEROMETER);
        if (g.size() >= 2) {
            d = 0.011d;
        } else if (g2.size() >= 2) {
            g = g2;
            d = 0.07d;
        } else {
            throw new IllegalStateException("Not enough data");
        }
        double sum = IntStream.CC.range(0, 3).mapToDouble(new C127952ab(g)).sum();
        double d2 = m209083d(sum, C59203do.f157270a, d / 2.0d);
        return sum < d ? m209084e(m209089j(d2, 0.1353352832366127d, 1.0d, 1.0d)) : m209089j(d2, C59203do.f157270a, 0.1353352832366127d, 0.4921875d);
    }

    /* renamed from: g */
    static C58485gu m209086g(C128046o oVar, C128045n... nVarArr) {
        return (C58485gu) DesugarArrays.stream((T[]) nVarArr).flatMap(new C127954ad(oVar)).filter(C127955ae.f352196a).findFirst().orElse(C58485gu.m89845m());
    }

    /* renamed from: h */
    static OptionalDouble m209087h(C128046o oVar, C128045n nVar) {
        return Collection.EL.stream(m209086g(oVar, nVar)).mapToDouble(C127958ah.f352199a).min();
    }

    /* renamed from: i */
    static boolean m209088i(OptionalDouble optionalDouble, DoublePredicate doublePredicate, boolean z) {
        return optionalDouble.isPresent() ? doublePredicate.test(optionalDouble.getAsDouble()) : z;
    }

    /* renamed from: j */
    static double m209089j(double d, double d2, double d3, double d4) {
        return C1886a.m5143a((((d - d2) / (d3 - d2)) * (d4 + C59203do.f157270a)) + C59203do.f157270a, C59203do.f157270a, d4);
    }

    /* renamed from: k */
    private static double m209090k(double d, double d2) {
        double d3 = d / d2;
        return (1.0d / (d2 * Math.sqrt(6.283185307179586d))) * Math.exp(d3 * d3 * -0.5d);
    }

    /* renamed from: b */
    public final C51347ei mo108292b() {
        return this.f352203b;
    }

    /* renamed from: c */
    public final C60870cx mo108293c() {
        String str = (String) this.f352208g.get();
        C37215b bVar = this.f352202a;
        C37252a c = this.f352211j.mo40779c();
        c.mo40795s("motionSignalId", str);
        bVar.mo19974a(c);
        C128043l lVar = this.f352207f;
        C128042k kVar = this.f352210i;
        HashMap hashMap = new HashMap();
        Map.EL.forEach(kVar.mo108311b(), new C128037f(lVar, hashMap, kVar));
        C60870cx a = C47638k.m84752c(hashMap.values()).mo51520a(new C126912a(hashMap), C60826bg.f164896a);
        C128038g gVar = C128038g.f352328a;
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(gVar), lVar.f352343d);
        C127953ac acVar = new C127953ac(this, str);
        C60870cx g2 = C60922j.m93044g(g, C47810es.m84963c(acVar), this.f352209h);
        C127959ai aiVar = new C127959ai(this, str);
        C60856cj.m92911t(g2, C47810es.m84974n(aiVar), this.f352209h);
        return g2;
    }
}
