package com.google.frameworks.client.data.android.server.tiktok.aga;

import com.google.android.libraries.search.p2476a.C32150a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.aga.i */
/* compiled from: PG */
final class C61585i implements C61485f, C32150a {

    /* renamed from: a */
    final /* synthetic */ C61586j f166435a;

    /* renamed from: b */
    private C60870cx f166436b;

    /* renamed from: c */
    private volatile boolean f166437c;

    public C61585i(C61586j jVar) {
        this.f166435a = jVar;
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        try {
            if (!((AccountId) C60856cj.m92909r(this.f166436b)).equals(this.f166435a.f166442e)) {
                return C61479al.m94189b(C61586j.f166438a, new C70334de());
            }
            return this.f166437c ? C61479al.m94189b(C61586j.f166439b, new C70334de()) : C61479al.f166225a;
        } catch (ExecutionException e) {
            return C61479al.m94189b(Status.f186910h.mo61678e(e.getCause()).withDescription("Failed to get AGSA-C account"), new C70334de());
        }
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C60870cx b = this.f166435a.f166440c.mo37974b();
        C61584h hVar = new C61584h(this);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(hVar), C60826bg.f164896a);
        this.f166436b = h;
        return C61479al.m94190c(h);
    }

    /* renamed from: c */
    public final C61480am mo39485c(C61467a aVar) {
        this.f166435a.f166440c.mo37976d(this);
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final C61480am mo39486d(C61483d dVar) {
        return this.f166437c ? C61480am.m94193a(C61586j.f166439b, new C70334de()) : C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final C61479al mo39488f() {
        return this.f166437c ? C61479al.m94189b(C61586j.f166439b, new C70334de()) : C61479al.f166225a;
    }

    /* renamed from: g */
    public final C61480am mo39489g() {
        return this.f166437c ? C61480am.m94193a(C61586j.f166439b, new C70334de()) : C61480am.f166232a;
    }

    /* renamed from: j */
    public final void mo37969j() {
        this.f166437c = true;
    }
}
