package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.search.core.p6519al.p6634ca.C85051a;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7209d.C91418a;
import com.google.android.apps.gsa.sidekick.shared.util.C91995n;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7912oo;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8178yk;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.aa */
/* compiled from: PG */
final class C104533aa implements C91418a {

    /* renamed from: a */
    final /* synthetic */ C8194z f290750a;

    /* renamed from: b */
    final /* synthetic */ C7718hj f290751b;

    /* renamed from: c */
    final /* synthetic */ C104535ac f290752c;

    public C104533aa(C104535ac acVar, C8194z zVar, C7718hj hjVar) {
        this.f290752c = acVar;
        this.f290750a = zVar;
        this.f290751b = hjVar;
    }

    /* renamed from: a */
    public final void mo85764a() {
    }

    /* renamed from: b */
    public final void mo85765b() {
        this.f290752c.f290762i.mo85744d(this.f290750a);
        if (C91995n.m151001b(this.f290751b)) {
            C104535ac acVar = this.f290752c;
            acVar.f290762i.mo85747g(acVar.mo94245x(C7681g.DISMISS_COLLECTION));
        } else {
            C8178yk ykVar = this.f290751b.f26973n;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            this.f290752c.f290762i.mo85748h(ykVar);
        }
        C7918ou ouVar = this.f290750a.f28781c;
        if (ouVar == null) {
            ouVar = C7918ou.f27824h;
        }
        if ((ouVar.f27826a & 2) != 0) {
            C85051a aVar = this.f290752c.f290756c;
            C7918ou ouVar2 = this.f290750a.f28781c;
            C7918ou ouVar3 = ouVar2 == null ? C7918ou.f27824h : ouVar2;
            if (ouVar2 == null) {
                ouVar2 = C7918ou.f27824h;
            }
            C7912oo ooVar = ouVar2.f27829d;
            if (ooVar == null) {
                ooVar = C7912oo.f27797d;
            }
            aVar.mo78677g(ouVar3, ooVar, this.f290751b);
            return;
        }
        C8194z zVar = this.f290750a;
        if ((zVar.f28779a & 4) != 0) {
            C104535ac acVar2 = this.f290752c;
            C7536ax axVar = zVar.f28782d;
            if (axVar == null) {
                axVar = C7536ax.f26084o;
            }
            C7681g a = C7681g.m22802a(axVar.f26090e);
            if (a == null) {
                a = C7681g.DETAILS;
            }
            acVar2.f290762i.mo85742b(acVar2.mo94245x(a));
        }
    }
}
