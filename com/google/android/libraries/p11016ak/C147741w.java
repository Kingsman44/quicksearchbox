package com.google.android.libraries.p11016ak;

import android.content.Context;
import com.google.android.libraries.p11016ak.p11018b.C147634c;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ScheduledExecutorService;
import p5285d.p5290b.p5291a.p5292a.C68154aq;
import p5285d.p5290b.p5291a.p5292a.C68155ar;
import p5285d.p5290b.p5291a.p5292a.C68202o;
import p5285d.p5290b.p5291a.p5292a.C68203p;
import p5285d.p5290b.p5291a.p5292a.C68209v;

/* renamed from: com.google.android.libraries.ak.w */
/* compiled from: PG */
public final class C147741w {

    /* renamed from: a */
    public static final C59071e f398670a = C59071e.m91332i("com.google.android.libraries.ak.w");

    /* renamed from: b */
    public final C147620aa f398671b;

    /* renamed from: c */
    public final C147634c f398672c;

    /* renamed from: d */
    public final ScheduledExecutorService f398673d;

    /* renamed from: e */
    public final C147725g f398674e;

    /* renamed from: f */
    public final Context f398675f;

    public C147741w(C147620aa aaVar, C68155ar arVar, C68154aq aqVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f398671b = aaVar;
        this.f398673d = scheduledExecutorService;
        C147630ak akVar = aaVar.f398436a;
        C147634c cVar = new C147634c(arVar, aqVar, akVar == null ? C147630ak.f398459e : akVar);
        this.f398672c = cVar;
        this.f398674e = new C147725g(cVar, aaVar);
        this.f398675f = context;
        C31760t.m59102i(context);
    }

    /* renamed from: a */
    public final C60870cx mo124428a(C147743y yVar) {
        C60870cx cxVar;
        C68202o oVar = this.f398671b.f398444i;
        if (oVar == null) {
            oVar = C68202o.f184551c;
        }
        int a = C68203p.m98509a(oVar.f184553a);
        if (a != 0 && a == 4) {
            cxVar = this.f398674e.mo124425a();
        } else {
            cxVar = C60856cj.m92900i(C68209v.f184561d);
        }
        return C47633f.m84733g(cxVar).mo51513e(Exception.class, C147737s.f398665a, C60826bg.f164896a).mo51516i(new C147738t(this, yVar), C60826bg.f164896a);
    }
}
