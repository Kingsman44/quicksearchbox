package com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a;

import com.google.android.libraries.assistant.auto.tng.assistant.p718a.C11951a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.C12957b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.a.a.a */
/* compiled from: PG */
public final class C11952a implements C11951a {

    /* renamed from: a */
    private static final C16750bk f38393a = C16750bk.f48980u;

    /* renamed from: b */
    private static final C46690ah f38394b = new C46885y("AssistantDataService#getVoicePlateState");

    /* renamed from: c */
    private final C12957b f38395c;

    /* renamed from: d */
    private final C11953b f38396d;

    /* renamed from: e */
    private final C11958g f38397e;

    /* renamed from: f */
    private C11957f f38398f;

    /* renamed from: g */
    private long f38399g;

    public C11952a(C12957b bVar, C11954c cVar, C11958g gVar) {
        this.f38395c = bVar;
        this.f38396d = cVar.mo20334a(f38394b, f38393a);
        this.f38397e = gVar;
    }

    /* renamed from: a */
    public final C46851e mo20325a() {
        return this.f38396d;
    }

    /* renamed from: b */
    public final void mo20326b() {
        this.f38396d.mo20332c();
        C11957f fVar = this.f38398f;
        if (fVar != null) {
            fVar.mo20335a();
            fVar.f38408b.cancel(false);
            C60870cx cxVar = fVar.f38408b;
            C11955d dVar = C11955d.f38405a;
            C46459k.m82829b(C60856cj.m92901j(C60922j.m93045h(cxVar, C47810es.m84966f(dVar), fVar.f38411e)), "requestExecutionManager#handleCancelRequest failed", new Object[0]);
            this.f38398f = null;
        }
    }

    /* renamed from: c */
    public final void mo20327c(Long l) {
        if (l == null || this.f38399g == l.longValue()) {
            mo20326b();
        }
    }

    /* renamed from: d */
    public final void mo20328d(C12986d dVar) {
        C12991i iVar = dVar.f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        if ((yVar.f40415a & 1) != 0) {
            C12991i iVar2 = dVar.f40370d;
            if (iVar2 == null) {
                iVar2 = C12991i.f40380k;
            }
            C13007y yVar2 = iVar2.f40383b;
            if (yVar2 == null) {
                yVar2 = C13007y.f40413d;
            }
            this.f38399g = yVar2.f40416b;
        }
        C11957f fVar = this.f38398f;
        if (fVar != null) {
            fVar.mo20335a();
        }
        C11958g gVar = this.f38397e;
        C60870cx a = this.f38395c.mo20852a(dVar);
        C11953b bVar = this.f38396d;
        a.getClass();
        Executor executor = (Executor) gVar.f38412a.mo17428b();
        executor.getClass();
        C11963l lVar = (C11963l) gVar.f38413b.mo17428b();
        lVar.getClass();
        this.f38398f = new C11957f(a, bVar, executor, lVar);
    }

    /* renamed from: e */
    public final void mo20329e() {
        this.f38396d.mo20332c();
        C11957f fVar = this.f38398f;
        if (fVar != null) {
            fVar.mo20335a();
        }
    }
}
