package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.content.ServiceConnection;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.o */
/* compiled from: PG */
final class C106255o implements C106260t {

    /* renamed from: a */
    public final SettableFuture f296459a = new SettableFuture();

    /* renamed from: b */
    public final ServiceConnection f296460b = new C106252l(this);

    /* renamed from: c */
    final /* synthetic */ C106261u f296461c;

    /* renamed from: d */
    private final long f296462d;

    public C106255o(C106261u uVar) {
        this.f296461c = uVar;
        this.f296462d = uVar.f296476i.mo85399d(C90126fx.f251572lO);
    }

    /* renamed from: a */
    public final String mo95471a() {
        return "Connecting";
    }

    /* renamed from: b */
    public final void mo95472b() {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: c */
    public final void mo95473c(String str) {
        this.f296459a.mo57357o(new CancellationException(str));
        this.f296461c.mo95476a(this.f296460b, str);
    }

    /* renamed from: d */
    public final void mo95474d() {
        new C90873ag(C90877ak.m148471e(this.f296459a, C106261u.f296471d.toMillis(), TimeUnit.MILLISECONDS, this.f296461c.f296477j), this.f296461c.f296472e, "checkConnectedComplete", C106244d.f296447a).mo85223a(new C106245e(this));
    }

    /* renamed from: e */
    public final void mo95475e() {
        long j = this.f296462d;
        if (j <= 0) {
            mo95473c("onOpaDisconnected immediate");
        } else {
            new C90873ag(C90877ak.m148471e(this.f296459a, j, TimeUnit.MILLISECONDS, this.f296461c.f296477j), this.f296461c.f296472e, "onOpaDisconnected", new C106246f(this)).mo85223a(new C106247g(this));
        }
    }
}
