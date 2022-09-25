package com.google.android.libraries.onegoogle.account.disc;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.c */
/* compiled from: PG */
public final /* synthetic */ class C30203c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccountParticleDisc f81660a;

    /* renamed from: b */
    public final /* synthetic */ Object f81661b;

    public /* synthetic */ C30203c(AccountParticleDisc accountParticleDisc, Object obj) {
        this.f81660a = accountParticleDisc;
        this.f81661b = obj;
    }

    public final void run() {
        AccountParticleDisc accountParticleDisc = this.f81660a;
        Object obj = this.f81661b;
        C58838bb.m90884s(accountParticleDisc.mo35599q(), "initialize must be called first");
        Object obj2 = accountParticleDisc.f81559m;
        if (obj == null || obj2 == null ? obj != obj2 : !accountParticleDisc.f81562p.mo35552c(obj).equals(accountParticleDisc.f81562p.mo35552c(obj2))) {
            accountParticleDisc.mo35594l();
        }
        accountParticleDisc.f81559m = obj;
        C30195aw awVar = accountParticleDisc.f81551e;
        C19559g.m37304c();
        awVar.mo35653c(awVar.f81636b, awVar.f81637c);
        awVar.mo35653c(awVar.f81635a, awVar.f81637c);
        awVar.f81637c = obj;
        awVar.mo35652b(awVar.f81636b, obj);
        awVar.mo35652b(awVar.f81635a, obj);
        accountParticleDisc.f81563q = accountParticleDisc.mo35586d();
        C30202bc bcVar = accountParticleDisc.f81554h;
        int i = 0;
        if (bcVar != null) {
            C58833ax axVar = accountParticleDisc.f81563q;
            C19559g.m37304c();
            bcVar.mo35661a(axVar, false);
        }
        AvatarView avatarView = accountParticleDisc.f81547a;
        C19559g.m37304c();
        if (obj == null) {
            avatarView.mo35601a();
        } else {
            avatarView.f81572b = accountParticleDisc.mo35584a() - 2;
            avatarView.mo35604d();
        }
        accountParticleDisc.f81557k.mo35680a(obj, avatarView);
        accountParticleDisc.mo35597o();
        DrawableBadgeViewHolder drawableBadgeViewHolder = accountParticleDisc.f81553g;
        if (drawableBadgeViewHolder != null) {
            C30226z b = AccountParticleDisc.m56067b(accountParticleDisc.f81560n);
            C19559g.m37304c();
            if (!C58832aw.m90831a(drawableBadgeViewHolder.f81587e, b)) {
                drawableBadgeViewHolder.f81587e = b;
                drawableBadgeViewHolder.f81583a.setImageDrawable(DrawableBadgeViewHolder.m56096a(b));
                drawableBadgeViewHolder.f81585c.setBadgeScale(drawableBadgeViewHolder.f81587e == null ? 0.0f : 1.0f);
                BadgeFrameLayout badgeFrameLayout = drawableBadgeViewHolder.f81584b;
                if (drawableBadgeViewHolder.f81587e == null) {
                    i = 8;
                }
                badgeFrameLayout.setVisibility(i);
                drawableBadgeViewHolder.mo35609b(b);
            }
        }
        accountParticleDisc.mo35591i();
    }
}
