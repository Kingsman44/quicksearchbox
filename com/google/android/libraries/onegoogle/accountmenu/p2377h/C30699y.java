package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import androidx.lifecycle.C2331af;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30356ak;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30382bj;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30383bk;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30395bw;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30439g;
import com.google.android.libraries.onegoogle.accountmenu.features.AccountMessagesFeature;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.features.C30632o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30633p;
import com.google.android.libraries.onegoogle.accountmenu.features.C30636s;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30326h;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.y */
/* compiled from: PG */
final class C30699y {

    /* renamed from: a */
    public final Context f82864a;

    /* renamed from: b */
    public final C2391v f82865b;

    /* renamed from: c */
    public final C2332ag f82866c;

    /* renamed from: d */
    public boolean f82867d;

    /* renamed from: e */
    public boolean f82868e;

    /* renamed from: f */
    public C58485gu f82869f;

    /* renamed from: g */
    public C58485gu f82870g;

    /* renamed from: h */
    public boolean f82871h;

    /* renamed from: i */
    public boolean f82872i;

    /* renamed from: j */
    private final C30305n f82873j;

    /* renamed from: k */
    private final C63644b f82874k;

    /* renamed from: l */
    private final C30922i f82875l;

    public C30699y(C30305n nVar, Context context, C63644b bVar, C30922i iVar, C2391v vVar) {
        this(nVar, context, bVar, iVar, vVar, new C2332ag(C30356ak.m56540d().mo35932a()));
    }

    /* renamed from: b */
    private final void m57360b(C30395bw bwVar, C58480gp gpVar) {
        C30439g gVar;
        Context context = this.f82864a;
        C30305n nVar = this.f82873j;
        C63644b bVar = this.f82874k;
        C30922i iVar = this.f82875l;
        if (!nVar.mo35860k().mo36181n().mo56113h()) {
            gVar = null;
        } else {
            bVar.getClass();
            ((C30313v) nVar.mo35866q().mo56111f()).getClass();
            gVar = new C30439g(new C30326h((C30545a) nVar.mo35860k().mo36181n().mo56107c(), nVar, context, bVar, iVar, bwVar));
        }
        if (gVar != null) {
            gpVar.mo55395g(gVar);
        }
        if (this.f82873j.mo35860k().mo36178k().mo56113h()) {
            gpVar.mo55395g(new C30439g(new C30632o((C30633p) this.f82873j.mo35860k().mo36178k().mo56107c(), bwVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C30698x mo36385a() {
        C58833ax axVar;
        C58833ax axVar2;
        C2331af afVar;
        C30636s d = this.f82873j.mo35860k().mo36171d();
        if (this.f82867d) {
            axVar = d.mo36147d();
        } else {
            axVar = C58836b.f156633a;
        }
        C58485gu e = this.f82868e ? d.mo36148e() : C58485gu.m89845m();
        if (this.f82867d) {
            axVar2 = d.mo36146c();
        } else {
            axVar2 = C58836b.f156633a;
        }
        C58485gu guVar = (C58485gu) axVar2.mo56106b(new C30696v(this)).mo56109e(C58485gu.m89845m());
        C58480gp gpVar = new C58480gp(4);
        C58480gp gpVar2 = new C58480gp(4);
        gpVar.mo55396h(this.f82870g);
        if (this.f82871h) {
            if (e.isEmpty()) {
                m57360b(C30395bw.COMMON_ACTION_CARD, gpVar2);
            } else {
                m57360b(C30395bw.CUSTOM_ACTION_CARD, gpVar);
            }
        }
        C58833ax h = this.f82873j.mo35860k().mo36175h();
        if (this.f82872i && h.mo56113h()) {
            gpVar.mo55395g(((AccountMessagesFeature) h.mo56107c()).mo36128h(this.f82864a, this.f82866c, this.f82865b));
        }
        C58485gu f = gpVar.mo55394f();
        gpVar2.mo55396h(this.f82869f);
        C58485gu f2 = gpVar2.mo55394f();
        C2332ag agVar = null;
        if (axVar.mo56113h() || !e.isEmpty() || !guVar.isEmpty() || !f.isEmpty()) {
            C30383bk bkVar = new C30383bk();
            bkVar.f82137a = f;
            bkVar.f82139c = axVar;
            C58480gp gpVar3 = new C58480gp(4);
            gpVar3.mo55396h(guVar);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                gpVar3.mo55395g(new C30439g(new C30697w((C30631n) e.get(i))));
            }
            bkVar.f82138b = gpVar3.mo55394f();
            afVar = new C2331af();
            afVar.mo5727n((LiveData) bkVar.f82139c.mo56109e(new C2332ag(C58485gu.m89845m())), new C30382bj(bkVar, afVar));
        } else {
            afVar = null;
        }
        if (!f2.isEmpty()) {
            agVar = new C2332ag(f2);
        }
        return new C30695u(afVar, agVar);
    }

    public C30699y(C30305n nVar, Context context, C63644b bVar, C30922i iVar, C2391v vVar, C2332ag agVar) {
        this.f82869f = C58485gu.m89845m();
        this.f82870g = C58485gu.m89845m();
        this.f82873j = nVar;
        this.f82864a = context;
        this.f82874k = bVar;
        this.f82875l = iVar;
        this.f82865b = vVar;
        this.f82866c = agVar;
    }
}
