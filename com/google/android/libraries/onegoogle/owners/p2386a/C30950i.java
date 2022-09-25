package com.google.android.libraries.onegoogle.owners.p2386a;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.C144023z;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.people.C145650d;
import com.google.android.gms.people.C145652f;
import com.google.android.gms.people.C145654h;
import com.google.android.gms.people.C145655i;
import com.google.android.gms.people.C145681j;
import com.google.android.gms.people.C145682k;
import com.google.android.gms.people.C145683l;
import com.google.android.gms.people.C145699q;
import com.google.android.gms.people.internal.C145674k;
import com.google.android.gms.people.internal.p10858b.C145660b;
import com.google.android.gms.people.internal.p10858b.C145663e;
import com.google.android.libraries.onegoogle.accountmanagement.C30255b;
import com.google.android.libraries.onegoogle.owners.C30968c;
import com.google.android.libraries.onegoogle.owners.C30969d;
import com.google.android.libraries.onegoogle.owners.C30972g;
import com.google.android.libraries.onegoogle.owners.C30973h;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.i */
/* compiled from: PG */
public final class C30950i implements C31012n {

    /* renamed from: b */
    public static final /* synthetic */ int f83388b = 0;

    /* renamed from: c */
    private static final C145650d f83389c;

    /* renamed from: a */
    public final CopyOnWriteArrayList f83390a = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final Context f83391d;

    /* renamed from: e */
    private final C145652f f83392e;

    /* renamed from: f */
    private final C145683l f83393f;

    /* renamed from: g */
    private final C145654h f83394g;

    /* renamed from: h */
    private final Executor f83395h;

    /* renamed from: i */
    private final C30969d f83396i;

    /* renamed from: j */
    private final C143875g f83397j;

    /* renamed from: k */
    private final C145655i f83398k;

    static {
        C145650d dVar = new C145650d();
        dVar.f393896a = 1;
        f83389c = dVar;
    }

    public C30950i(Context context, C145652f fVar, C145683l lVar, C145654h hVar, C30969d dVar, Executor executor, C143875g gVar) {
        this.f83391d = context;
        this.f83392e = fVar;
        this.f83393f = lVar;
        this.f83394g = hVar;
        this.f83395h = executor;
        this.f83396i = dVar;
        this.f83397j = gVar;
        this.f83398k = new C30947f(this);
    }

    /* renamed from: h */
    public static Object m57754h(C60870cx cxVar, String str) {
        try {
            return C60856cj.m92909r(cxVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof C144023z) || (cause instanceof C144022y)) {
                throw e;
            }
            Log.e("OneGoogle", "Failed to load ".concat(str), e);
            return null;
        }
    }

    /* renamed from: i */
    private final C60870cx m57755i(int i) {
        if (C143700ab.m233447i(i)) {
            return C60856cj.m92899h(new C144023z(i, "Google Play Services not available", this.f83397j.mo119363k(this.f83391d, i, (String) null)));
        }
        return C60856cj.m92899h(new C144022y());
    }

    /* renamed from: a */
    public final C60870cx mo36637a() {
        return mo36639c();
    }

    /* renamed from: b */
    public final C60870cx mo36638b(String str) {
        return C60922j.m93044g(mo36639c(), C47810es.m84963c(new C30949h(str)), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo36639c() {
        C60870cx cxVar;
        C60870cx a = this.f83396i.mo36668a();
        int j = this.f83397j.mo119362j(this.f83391d, 10000000);
        if (j != 0) {
            cxVar = m57755i(j);
        } else {
            C145652f fVar = this.f83392e;
            C145650d dVar = f83389c;
            C143840l lVar = C145699q.f393973a;
            C143851w wVar = fVar.f389929D;
            C145660b bVar = new C145660b(wVar, dVar);
            wVar.mo119159d(bVar);
            cxVar = C30956o.m57769a(bVar, C47810es.m84963c(C30946e.f83384a), C60826bg.f164896a);
        }
        C30973h hVar = (C30973h) this.f83396i;
        C30972g gVar = new C30972g(hVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(gVar), hVar.f83457c);
        return C47638k.m84751b(a, cxVar, m).mo51520a(new C30945d(a, m, cxVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo36640d(String str, int i) {
        return mo36641e(str, i);
    }

    /* renamed from: e */
    public final C60870cx mo36641e(String str, int i) {
        int j = this.f83397j.mo119362j(this.f83391d, 10400000);
        if (j != 0) {
            return m57755i(j);
        }
        C145654h hVar = this.f83394g;
        C143840l lVar = C145699q.f393973a;
        C143851w wVar = hVar.f389929D;
        C145663e eVar = new C145663e(wVar, str, C30968c.m57808a(i));
        wVar.mo119159d(eVar);
        return C30956o.m57769a(eVar, C30948g.f83386a, this.f83395h);
    }

    /* renamed from: f */
    public final void mo36642f(C30255b bVar) {
        if (this.f83390a.isEmpty()) {
            C145683l lVar = this.f83393f;
            C143784ce b = C143785cf.m233680b(this.f83398k, lVar.f389927B, C145655i.class.getName());
            C145674k kVar = new C145674k(b);
            C145681j jVar = new C145681j(kVar);
            C145682k kVar2 = new C145682k(kVar);
            C143796cq cqVar = new C143796cq();
            cqVar.f389831a = jVar;
            cqVar.f389832b = kVar2;
            cqVar.f389833c = b;
            cqVar.f389836f = 2720;
            lVar.mo119291v(cqVar.mo119255a());
        }
        this.f83390a.add(bVar);
    }

    /* renamed from: g */
    public final void mo36643g(C30255b bVar) {
        this.f83390a.remove(bVar);
        if (this.f83390a.isEmpty()) {
            this.f83393f.mo119292w(C143785cf.m233679a(this.f83398k, C145655i.class.getName()), 2721);
        }
    }
}
