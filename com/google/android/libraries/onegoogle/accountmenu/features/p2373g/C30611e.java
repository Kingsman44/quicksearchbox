package com.google.android.libraries.onegoogle.accountmenu.features.p2373g;

import androidx.core.p098j.C2043bi;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30638u;
import com.google.android.libraries.onegoogle.common.C30914an;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30939z;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.g.e */
/* compiled from: PG */
public final class C30611e {

    /* renamed from: a */
    public final AccountParticleDisc f82690a;

    /* renamed from: b */
    public final C30897z f82691b;

    /* renamed from: c */
    public final C30638u f82692c;

    /* renamed from: d */
    public final C30922i f82693d;

    /* renamed from: e */
    public final C30306o f82694e;

    /* renamed from: f */
    public final C30939z f82695f;

    /* renamed from: g */
    public final int f82696g;

    /* renamed from: h */
    public final C30158c f82697h;

    public C30611e(C30306o oVar, C30939z zVar, C30897z zVar2, C30638u uVar, AccountParticleDisc accountParticleDisc, int i, C30922i iVar, C30158c cVar) {
        C30898c cVar2 = zVar.f83363a;
        C63643a aVar = (C63643a) zVar.f83364b.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 15;
        bVar.f172121a |= 2;
        this.f82695f = new C30939z(cVar2, (C63644b) aVar.build(), zVar.f83365c);
        this.f82694e = oVar;
        this.f82691b = zVar2;
        this.f82692c = uVar;
        this.f82690a = accountParticleDisc;
        this.f82693d = iVar;
        this.f82696g = i;
        this.f82697h = cVar;
    }

    /* renamed from: a */
    public final void mo36309a() {
        C30610d dVar = new C30610d(this, new C30609c(this));
        if (C2043bi.m5569aw(this.f82690a)) {
            dVar.onViewAttachedToWindow(this.f82690a);
        }
        this.f82690a.addOnAttachStateChangeListener(dVar);
    }

    /* renamed from: b */
    public final void mo36310b() {
        C30914an.m57706a(new C30608b(this));
    }
}
