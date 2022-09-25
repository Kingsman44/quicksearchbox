package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.content.Context;
import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39383c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c.C39458h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39542ag;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39580br;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39581bs;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39606y;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.n.c.a.av */
/* compiled from: PG */
public final class C39406av {

    /* renamed from: a */
    public static final C59071e f103747a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.av");

    /* renamed from: b */
    public final C47632e f103748b = new C47632e();

    /* renamed from: c */
    public final Executor f103749c;

    /* renamed from: d */
    public final C39580br f103750d;

    /* renamed from: e */
    public final HotwordInformation f103751e;

    /* renamed from: f */
    public final C39633o f103752f;

    /* renamed from: g */
    public final C39396al f103753g;

    public C39406av(C33497h hVar, C39425bb bbVar, C39396al alVar, C39526i iVar, Executor executor, C39634p pVar, C39581bs bsVar) {
        C39634p pVar2 = pVar;
        C39581bs bsVar2 = bsVar;
        this.f103751e = bbVar.mo41840a();
        this.f103753g = alVar;
        this.f103749c = executor;
        ((Context) bsVar2.f104191a.mo17428b()).getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bsVar2.f104192b.mo17428b();
        scheduledExecutorService.getClass();
        Executor executor2 = (Executor) bsVar2.f104193c.mo17428b();
        executor2.getClass();
        Executor executor3 = (Executor) bsVar2.f104194d.mo17428b();
        executor3.getClass();
        C37660hg hgVar = (C37660hg) bsVar2.f104195e.mo17428b();
        hgVar.getClass();
        C39542ag agVar = (C39542ag) bsVar2.f104196f.mo17428b();
        agVar.getClass();
        C58833ax axVar = (C58833ax) bsVar2.f104197g.mo17428b();
        axVar.getClass();
        C58833ax axVar2 = (C58833ax) bsVar2.f104198h.mo17428b();
        axVar2.getClass();
        C39383c cVar = (C39383c) bsVar2.f104199i.mo17428b();
        cVar.getClass();
        C39606y yVar = (C39606y) bsVar2.f104200j.mo17428b();
        yVar.getClass();
        Boolean bool = (Boolean) bsVar2.f104201k.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C62910ar arVar = (C62910ar) bsVar2.f104202l.mo17428b();
        arVar.getClass();
        Boolean bool2 = (Boolean) bsVar2.f104203m.mo17428b();
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        iVar.getClass();
        C39580br brVar = r4;
        C39580br brVar2 = new C39580br(scheduledExecutorService, executor2, executor3, hgVar, agVar, axVar, axVar2, cVar, yVar, booleanValue, arVar, booleanValue2, iVar);
        this.f103750d = brVar;
        hVar.getClass();
        bbVar.getClass();
        alVar.getClass();
        iVar.getClass();
        Context context = (Context) pVar2.f104337a.mo17428b();
        context.getClass();
        C21370a aVar = (C21370a) pVar2.f104338b.mo17428b();
        aVar.getClass();
        C39458h hVar2 = (C39458h) pVar2.f104339c.mo17428b();
        hVar2.getClass();
        Executor executor4 = (Executor) pVar2.f104340d.mo17428b();
        executor4.getClass();
        C46428ao aoVar = (C46428ao) pVar2.f104341e.mo17428b();
        aoVar.getClass();
        Executor executor5 = (Executor) pVar2.f104342f.mo17428b();
        executor5.getClass();
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) pVar2.f104343g.mo17428b();
        scheduledExecutorService2.getClass();
        C39383c cVar2 = (C39383c) pVar2.f104344h.mo17428b();
        cVar2.getClass();
        this.f103752f = new C39633o(hVar, bbVar, alVar, brVar, iVar, context, aVar, hVar2, executor4, aoVar, executor5, scheduledExecutorService2, cVar2);
    }

    /* renamed from: a */
    public final C60870cx mo41818a() {
        return this.f103748b.mo51512b(new C39404at(this), this.f103749c);
    }
}
