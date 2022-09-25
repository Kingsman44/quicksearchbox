package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122465t;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122960l;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122965q;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.p9293a.C122899af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3863av.p3864a.p3865a.p3866a.C50532j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61910bt;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61961dq;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;
import com.google.p4273bs.p4277b.p4278a.p4279a.C56461a;
import com.google.protos.p5124m.p5125a.C65603f;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.au */
/* compiled from: PG */
public final class C122641au {

    /* renamed from: a */
    public static final C59071e f339858a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.au");

    /* renamed from: b */
    public final C122463r f339859b;

    /* renamed from: c */
    public final C123033c f339860c;

    /* renamed from: d */
    public final C122960l f339861d;

    /* renamed from: e */
    public final C122960l f339862e;

    /* renamed from: f */
    public final C122960l f339863f;

    /* renamed from: g */
    public final C122960l f339864g;

    /* renamed from: h */
    public final C122960l f339865h;

    /* renamed from: i */
    public final Context f339866i;

    /* renamed from: j */
    public final C122660p f339867j;

    /* renamed from: k */
    public final C123001av f339868k;

    /* renamed from: l */
    public final C60887da f339869l;

    /* renamed from: m */
    public final C50532j f339870m;

    /* renamed from: n */
    public final boolean f339871n;

    /* renamed from: o */
    public final boolean f339872o;

    /* renamed from: p */
    public final C122642av f339873p;

    /* renamed from: q */
    public final C122645ay f339874q;

    /* renamed from: r */
    public final C122661q f339875r;

    /* renamed from: s */
    public final C122965q f339876s;

    /* renamed from: t */
    public final C122899af f339877t;

    public C122641au(C122463r rVar, C123033c cVar, Context context, String str, C122642av avVar, C122960l lVar, C122960l lVar2, C122899af afVar, C122960l lVar3, C122960l lVar4, C122960l lVar5, C50532j jVar, C122661q qVar, boolean z, C65603f fVar, C122645ay ayVar, C122660p pVar, C123001av avVar2, C122965q qVar2, C60887da daVar) {
        C122463r rVar2 = rVar;
        this.f339859b = rVar2;
        this.f339860c = cVar;
        this.f339873p = avVar;
        this.f339861d = lVar;
        this.f339862e = lVar2;
        this.f339877t = afVar;
        this.f339863f = lVar3;
        this.f339864g = lVar4;
        this.f339865h = lVar5;
        this.f339870m = jVar;
        this.f339875r = qVar;
        this.f339866i = context;
        this.f339874q = ayVar;
        this.f339867j = pVar;
        this.f339876s = qVar2;
        this.f339868k = avVar2;
        this.f339869l = daVar;
        C122465t tVar = rVar2.f339496b;
        this.f339871n = (tVar == null ? C122465t.f339501d : tVar).f339505c;
        boolean z2 = false;
        if (z) {
            String str2 = str;
            if (fVar.f178307a.contains(str) && rVar2.f339495a) {
                z2 = true;
            }
        }
        this.f339872o = z2;
    }

    /* renamed from: b */
    static /* synthetic */ void m202042b(AtomicReference atomicReference) {
        C122659o oVar = (C122659o) atomicReference.get();
        if (oVar != null) {
            C123047cn.m202382b(oVar.mo105717c(), C122633am.f339838a, C60826bg.f164896a);
        } else {
            ((C59052c) ((C59052c) f339858a.mo56225c()).mo56372aa(34907)).mo56386p("Update is called too early");
        }
    }

    /* renamed from: c */
    public static void m202043c(WebrefAndPkgModelProvider webrefAndPkgModelProvider, String str, Context context) {
        try {
            webrefAndPkgModelProvider.mo58313c(C56461a.m88196b(context.getFilesDir(), str), true);
        } catch (IOException e) {
            webrefAndPkgModelProvider.mo58313c((C61910bt) null, false);
            throw e;
        }
    }

    /* renamed from: d */
    public static C60870cx m202044d(C122959k kVar) {
        return C47633f.m84733g(kVar.mo105792a()).mo51515h(C122622ab.f339812a, C60826bg.f164896a).mo51513e(Throwable.class, new C122624ad(kVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public static void m202045e(WebrefAndPkgModelProvider webrefAndPkgModelProvider, Optional optional, C122640at atVar, C122964p pVar) {
        Objects.requireNonNull(atVar);
        Optional flatMap = optional.flatMap(new C122626af(atVar));
        try {
            webrefAndPkgModelProvider.mo58315d((C61961dq) flatMap.orElse(null), flatMap.isPresent());
            pVar.mo105804a(flatMap.flatMap(new C122627ag(optional)));
        } catch (IOException e) {
            pVar.mo105804a(Optional.empty());
            webrefAndPkgModelProvider.mo58315d((C61961dq) null, false);
            throw e;
        }
    }

    /* renamed from: a */
    public final C61920cc mo105710a(C122640at atVar, Optional optional, Optional optional2, Runnable runnable) {
        C122964p pVar = new C122964p(this.f339876s);
        Objects.requireNonNull(atVar);
        Optional flatMap = optional2.flatMap(new C122626af(atVar));
        if (flatMap.isPresent()) {
            pVar.mo105804a(optional2.map(C122662r.f339911a));
        }
        C61920cc ccVar = new C61920cc((Closeable) flatMap.orElse(null));
        optional.ifPresent(new C122630aj(this, atVar, pVar, ccVar, runnable));
        return ccVar;
    }
}
