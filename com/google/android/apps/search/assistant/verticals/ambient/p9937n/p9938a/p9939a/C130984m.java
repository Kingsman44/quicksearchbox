package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9938a.p9939a;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130807i;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9938a.C130971a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131072b;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131077g;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.concurrent.ExecutionException;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.a.a.m */
/* compiled from: PG */
public final class C130984m implements C130971a {

    /* renamed from: a */
    public final boolean f358357a;

    /* renamed from: b */
    public final C65603f f358358b;

    /* renamed from: c */
    public final double f358359c;

    /* renamed from: d */
    public final Duration f358360d;

    /* renamed from: e */
    public final double f358361e;

    /* renamed from: f */
    public final C65603f f358362f;

    /* renamed from: g */
    public final boolean f358363g;

    /* renamed from: h */
    public final boolean f358364h;

    /* renamed from: i */
    public final C58974d f358365i;

    /* renamed from: j */
    public final C60887da f358366j;

    /* renamed from: k */
    public final C131072b f358367k;

    /* renamed from: l */
    public final C130807i f358368l;

    /* renamed from: m */
    public final C18927g f358369m;

    /* renamed from: n */
    public final C131077g f358370n;

    /* renamed from: o */
    public final C130895ag f358371o;

    /* renamed from: p */
    public final PackageManager f358372p;

    public C130984m(boolean z, C65603f fVar, double d, long j, double d2, C65603f fVar2, boolean z2, boolean z3, C130603a aVar, C60887da daVar, C131072b bVar, C130807i iVar, C18927g gVar, C131077g gVar2, C130895ag agVar, PackageManager packageManager) {
        this.f358357a = z;
        this.f358358b = fVar;
        this.f358359c = d;
        this.f358360d = Duration.ofMinutes(j);
        this.f358361e = d2;
        this.f358362f = fVar2;
        this.f358363g = z2;
        this.f358364h = z3;
        C130603a aVar2 = aVar;
        this.f358365i = aVar.mo109740b(this);
        this.f358366j = daVar;
        this.f358367k = bVar;
        this.f358368l = iVar;
        this.f358369m = gVar;
        this.f358370n = gVar2;
        this.f358371o = agVar;
        this.f358372p = packageManager;
    }

    /* renamed from: d */
    public static boolean m213531d(C58485gu guVar, C58485gu guVar2) {
        return (guVar.isEmpty() ^ true) && (guVar2.isEmpty() ^ true) && ((C130701b) guVar.get(0)).mo109797h().equals(((C130701b) guVar2.get(0)).mo109797h());
    }

    /* renamed from: a */
    public final C58485gu mo110016a(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C130980i(this)).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final C58485gu mo110017b(C58485gu guVar) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C130972a(this)).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public final C60870cx mo110018c(C60870cx cxVar, Object obj, String str) {
        return C47633f.m84733g(cxVar).mo51513e(ExecutionException.class, new C130977f(this, str, obj), this.f358366j);
    }
}
