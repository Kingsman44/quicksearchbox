package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.de */
/* compiled from: PG */
public final /* synthetic */ class C104618de implements C23109a {

    /* renamed from: a */
    public final /* synthetic */ C104627dn f291248a;

    /* renamed from: b */
    public final /* synthetic */ boolean f291249b;

    /* renamed from: c */
    public final /* synthetic */ C9278v f291250c;

    /* renamed from: d */
    public final /* synthetic */ C104626dm f291251d;

    /* renamed from: e */
    public final /* synthetic */ boolean f291252e;

    public /* synthetic */ C104618de(C104627dn dnVar, boolean z, C9278v vVar, C104626dm dmVar, boolean z2) {
        this.f291248a = dnVar;
        this.f291249b = z;
        this.f291250c = vVar;
        this.f291251d = dmVar;
        this.f291252e = z2;
    }

    /* renamed from: a */
    public final void mo28347a(Object obj) {
        C104627dn dnVar = this.f291248a;
        boolean z = this.f291249b;
        C9278v vVar = this.f291250c;
        C104626dm dmVar = this.f291251d;
        boolean z2 = this.f291252e;
        C23056g gVar = (C23056g) obj;
        if (gVar instanceof C104535ac) {
            ((C104535ac) gVar).f290760g = new C104621dh(dnVar);
        } else if (gVar instanceof C104560ba) {
            ((C104560ba) gVar).mo94256e(new C104622di(dnVar));
        }
        if (z && (vVar.f32192a & 8388608) == 0) {
            C7718hj hjVar = vVar.f32174H;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            C104623dj djVar = new C104623dj(dnVar, hjVar, gVar, dmVar);
            dnVar.f291271d.add(djVar);
            dnVar.f291270c.mo77632b(djVar);
        }
        if (z2) {
            ((C23251a) dnVar.f291269b.mo94215j()).mo28730f(gVar.mo28496Q(), false);
        }
    }
}
