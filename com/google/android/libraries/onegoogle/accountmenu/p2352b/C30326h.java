package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2347c.C30170d;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30353ah;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30365at;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30395bw;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30437e;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30461b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30482w;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.common.base.C58833ax;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.h */
/* compiled from: PG */
public final /* synthetic */ class C30326h implements C30353ah {

    /* renamed from: a */
    public final /* synthetic */ C30305n f82004a;

    /* renamed from: b */
    public final /* synthetic */ Context f82005b;

    /* renamed from: c */
    public final /* synthetic */ C63644b f82006c;

    /* renamed from: d */
    public final /* synthetic */ C30922i f82007d;

    /* renamed from: e */
    public final /* synthetic */ C30395bw f82008e;

    /* renamed from: f */
    public final /* synthetic */ C30545a f82009f;

    public /* synthetic */ C30326h(C30545a aVar, C30305n nVar, Context context, C63644b bVar, C30922i iVar, C30395bw bwVar) {
        this.f82009f = aVar;
        this.f82004a = nVar;
        this.f82005b = context;
        this.f82006c = bVar;
        this.f82007d = iVar;
        this.f82008e = bwVar;
    }

    /* renamed from: a */
    public final C30365at mo35811a(Object obj) {
        C30545a aVar = this.f82009f;
        C30305n nVar = this.f82004a;
        Context context = this.f82005b;
        C63644b bVar = this.f82006c;
        C30922i iVar = this.f82007d;
        C30395bw bwVar = this.f82008e;
        C30170d dVar = aVar.f82517a;
        nVar.mo35852b();
        boolean a = dVar.mo35583a(obj);
        C30464e eVar = null;
        if (!a) {
            return null;
        }
        if (nVar.mo35860k().mo36181n().mo56113h()) {
            C30313v vVar = (C30313v) nVar.mo35866q().mo56111f();
            vVar.getClass();
            C30462c g = C30464e.m56760g();
            g.mo36053f(R.id.og_ai_turn_on_incognito);
            g.mo36054g(context.getString(R.string.og_turn_on_incognito_mode));
            g.mo36052e(C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_incognito_vd_theme_24));
            C30306o i = nVar.mo35858i();
            nVar.mo35852b();
            C30466g gVar = (C30466g) g;
            gVar.f82289c = new C30482w(i, ((C30545a) nVar.mo35860k().mo36181n().mo56107c()).f82517a);
            g.mo36056i(90143);
            C30901aa aaVar = new C30901aa(new C30327i(nVar, bVar, vVar));
            aaVar.f83316d = iVar.mo35755b();
            aaVar.f83317e = iVar.mo35754a();
            gVar.f82288b = new C30938y(aaVar);
            g.mo36049b(C30461b.INCOGNITO);
            eVar = g.mo36048a();
        }
        C30437e eVar2 = new C30437e(eVar);
        eVar2.f82169x = C58833ax.m90834k(bwVar);
        return eVar2;
    }
}
