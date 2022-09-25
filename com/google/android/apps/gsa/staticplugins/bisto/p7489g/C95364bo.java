package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96457ao;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124527h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bo */
/* compiled from: PG */
public final class C95364bo extends C95447t {

    /* renamed from: f */
    private final C22871g f266814f;

    /* renamed from: g */
    private final C95428dy f266815g;

    /* renamed from: h */
    private C95427dx f266816h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95364bo(Context context, C22871g gVar, C22871g gVar2, C95432eb ebVar, C95850a aVar, C68214a aVar2, C89656k kVar, C95188c cVar, C95428dy dyVar) {
        super("wired", context, gVar, gVar2, ebVar, aVar, aVar2, kVar, cVar);
        this.f266814f = gVar;
        this.f266815g = dyVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo89304B() {
        C95428dy dyVar = this.f266815g;
        C95397cu cuVar = (C95397cu) dyVar.f267016a.mo17428b();
        cuVar.getClass();
        C96457ao aoVar = (C96457ao) dyVar.f267017b.mo17428b();
        aoVar.getClass();
        C95411dh dhVar = (C95411dh) dyVar.f267018c.mo17428b();
        dhVar.getClass();
        C95427dx dxVar = new C95427dx(cuVar, aoVar, dhVar, false, this);
        this.f266816h = dxVar;
        dxVar.f267011b.f266947c.set(dxVar);
        return dxVar.f267010a.mo89343b(dxVar, false);
    }

    /* renamed from: d */
    public final C124715m mo89263d() {
        if (mo89278w()) {
            return C124715m.FULLY_CONNECTED;
        }
        return C124715m.NOT_CONNECTED;
    }

    /* renamed from: e */
    public final C60870cx mo89264e() {
        if (!C124527h.m203996b(this.f267070b)) {
            return C60856cj.m92899h(new Exception("Unable to listen to media buttons"));
        }
        return super.mo89264e();
    }

    /* renamed from: l */
    public final String mo89305l() {
        return "legacy-wired";
    }

    /* renamed from: m */
    public final String mo89306m() {
        return "N/A";
    }

    /* renamed from: s */
    public final void mo89307s() {
        C95427dx dxVar = this.f266816h;
        if (dxVar != null) {
            C22871g gVar = this.f266814f;
            Objects.requireNonNull(dxVar);
            gVar.mo28212l("startVoiceInput", new C95363bn(dxVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo89308t() {
        C95427dx dxVar = this.f266816h;
        if (dxVar != null) {
            dxVar.f267011b.f266947c.set((Object) null);
            dxVar.f267010a.mo89342a(false);
        }
        this.f266816h = null;
    }

    /* renamed from: u */
    public final boolean mo89309u() {
        return true;
    }

    /* renamed from: v */
    public final boolean mo89310v(boolean z, boolean z2, boolean z3) {
        return z3 && !z;
    }
}
