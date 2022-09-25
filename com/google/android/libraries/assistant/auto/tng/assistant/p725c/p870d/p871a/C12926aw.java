package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.C12957b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15494t;
import com.google.android.libraries.assistant.auto.tng.p893b.C13184b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.aw */
/* compiled from: PG */
public final class C12926aw implements C12957b {

    /* renamed from: a */
    public static final C59071e f40227a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.aw");

    /* renamed from: b */
    public final Executor f40228b;

    /* renamed from: c */
    public final C69464a f40229c;

    /* renamed from: d */
    public final C69464a f40230d;

    /* renamed from: e */
    public final C69464a f40231e;

    /* renamed from: f */
    public final C69464a f40232f;

    /* renamed from: g */
    public final C69464a f40233g;

    /* renamed from: h */
    public final C12929az f40234h;

    /* renamed from: i */
    public final Map f40235i;

    /* renamed from: j */
    public final C15481g f40236j;

    /* renamed from: k */
    public final C58833ax f40237k;

    /* renamed from: l */
    public final C15494t f40238l;

    /* renamed from: m */
    public final Executor f40239m;

    /* renamed from: n */
    public final C21370a f40240n;

    /* renamed from: o */
    public final C12915al f40241o;

    /* renamed from: p */
    public final C13184b f40242p;

    /* renamed from: q */
    public C12925av f40243q;

    public C12926aw(Executor executor, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C58833ax axVar, Map map, C15481g gVar, C15494t tVar, C13184b bVar, C21370a aVar7, C12915al alVar) {
        this.f40228b = executor;
        this.f40229c = aVar;
        this.f40230d = aVar2;
        this.f40231e = aVar3;
        this.f40232f = aVar4;
        this.f40233g = aVar5;
        C12931ba baVar = (C12931ba) aVar6.mo17428b();
        C12154a aVar8 = (C12154a) baVar.f40251a.mo17428b();
        aVar8.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) baVar.f40252b.mo17428b();
        scheduledExecutorService.getClass();
        this.f40234h = new C12929az(aVar8, scheduledExecutorService, baVar.f40253c);
        this.f40235i = map;
        this.f40237k = axVar;
        this.f40236j = gVar;
        this.f40238l = tVar;
        this.f40239m = new C60904dr(executor);
        this.f40240n = aVar7;
        this.f40241o = alVar;
        this.f40242p = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20852a(C12986d dVar) {
        ((C59052c) ((C59052c) f40227a.mo56224b()).mo56372aa(44559)).mo56386p("#execute");
        C47558bi a = C47831fm.m85006a("SessionManager.execute");
        try {
            C12917an anVar = new C12917an(this, dVar);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(anVar), this.f40239m);
            C12918ao aoVar = C12918ao.f40213a;
            C60870cx g = C60922j.m93044g(n, C47810es.m84963c(aoVar), this.f40228b);
            a.mo51417a(g);
            a.close();
            return g;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
