package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8053a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.bs;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80198as;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80199at;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80214bh;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80215bi;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80241ch;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80242ci;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80259n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81371e;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81372f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82408eb;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83667s;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83670v;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103041b;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui.C103153bp;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.a.c */
/* compiled from: PG */
public final class C103035c implements C103032a, bs {

    /* renamed from: e */
    private static final C58974d f287638e = C58974d.m91136j();

    /* renamed from: a */
    public final Context f287639a;

    /* renamed from: b */
    public final C86124t f287640b;

    /* renamed from: c */
    public final C103153bp f287641c;

    /* renamed from: d */
    public final C83357g f287642d = new C83361k(C80244ck.f220137i, C0826b.class);

    /* renamed from: f */
    private final C22871g f287643f;

    /* renamed from: g */
    private final C103335ap f287644g;

    /* renamed from: h */
    private final C81372f f287645h;

    /* renamed from: i */
    private final SharedPreferences f287646i;

    /* renamed from: j */
    private final C83305i f287647j;

    /* renamed from: k */
    private final C103041b f287648k;

    /* renamed from: l */
    private final C87568k f287649l;

    /* renamed from: m */
    private final AtomicBoolean f287650m = new AtomicBoolean(false);

    public C103035c(Context context, C22871g gVar, C103335ap apVar, C86124t tVar, C81372f fVar, SharedPreferences sharedPreferences, C83305i iVar, C103041b bVar, C87568k kVar, C103153bp bpVar) {
        this.f287639a = context;
        this.f287643f = gVar;
        this.f287644g = apVar;
        this.f287640b = tVar;
        this.f287645h = fVar;
        this.f287646i = sharedPreferences;
        this.f287647j = iVar;
        this.f287648k = bVar;
        this.f287649l = kVar;
        this.f287641c = bpVar;
    }

    /* renamed from: a */
    public final boolean mo93578a() {
        return mo71923b() == C80201av.PIE_ELIGIBLE && this.f287645h.mo75051a() == C81371e.GESTURE;
    }

    /* renamed from: b */
    public final C80201av mo71923b() {
        return (C80201av) Optional.ofNullable(C80201av.m128093a(this.f287646i.getInt("NGA_PIE_LAST_ELIGIBILITY", C80201av.PIE_ELIGIBILITY_UNKNOWN.f220046m))).orElse(C80201av.PIE_ELIGIBILITY_UNKNOWN);
    }

    /* renamed from: c */
    public final boolean mo93579c(String str) {
        if (!mo93578a() || !this.f287640b.mo79746e(C90126fx.f251394hw)) {
            return false;
        }
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80198as asVar = (C80198as) C80199at.f220028c.createBuilder();
        asVar.copyOnWrite();
        C80199at atVar = (C80199at) asVar.instance;
        atVar.f220030a = 2;
        atVar.f220031b = str;
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        C80199at atVar2 = (C80199at) asVar.build();
        atVar2.getClass();
        axVar.f220050b = atVar2;
        axVar.f220049a = 5;
        mo93573m((C80203ax) awVar.build());
        return true;
    }

    /* renamed from: d */
    public final boolean mo93580d() {
        if (!mo93578a() || !this.f287640b.mo79746e(C90126fx.f251394hw)) {
            return false;
        }
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80198as asVar = (C80198as) C80199at.f220028c.createBuilder();
        asVar.copyOnWrite();
        C80199at atVar = (C80199at) asVar.instance;
        atVar.f220030a = 1;
        atVar.f220031b = true;
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        C80199at atVar2 = (C80199at) asVar.build();
        atVar2.getClass();
        axVar.f220050b = atVar2;
        axVar.f220049a = 5;
        mo93573m((C80203ax) awVar.build());
        return true;
    }

    /* renamed from: e */
    public final C83358h mo93565e() {
        return this.f287642d;
    }

    /* renamed from: g */
    public final void mo93567g() {
        C83305i iVar = this.f287647j;
        String name = mo71923b().name();
        if (name != null) {
            iVar.mo75579d(new C82408eb("NGA_PIE_ELIGIBILITY", name));
            return;
        }
        throw new NullPointerException("Null eligibility");
    }

    /* renamed from: h */
    public final void mo93568h() {
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        axVar.f220049a = 3;
        axVar.f220050b = true;
        mo93573m((C80203ax) awVar.build());
    }

    /* renamed from: i */
    public final void mo93569i() {
        this.f287649l.mo81688b(this.f287639a, new Bundle());
    }

    /* renamed from: iS */
    public final boolean mo93581iS() {
        return this.f287650m.get();
    }

    /* renamed from: j */
    public final void mo93570j(boolean z) {
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        int i = true != z ? 4 : 3;
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        axVar.f220050b = Integer.valueOf(i - 1);
        axVar.f220049a = 2;
        mo93573m((C80203ax) awVar.build());
    }

    /* renamed from: l */
    public final void mo93572l(C80246cm cmVar) {
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80241ch chVar = (C80241ch) C80242ci.f220133c.createBuilder();
        chVar.copyOnWrite();
        C80242ci ciVar = (C80242ci) chVar.instance;
        ciVar.f220136b = cmVar.f220162n;
        ciVar.f220135a |= 1;
        C80242ci ciVar2 = (C80242ci) chVar.build();
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        ciVar2.getClass();
        axVar.f220050b = ciVar2;
        axVar.f220049a = 12;
        mo93573m((C80203ax) awVar.build());
    }

    /* renamed from: m */
    public final void mo93573m(C80203ax axVar) {
        this.f287644g.mo93762u(new ProtoLiteParcelable((MessageLite) axVar));
    }

    /* renamed from: n */
    public final void mo93574n(String str) {
        C103335ap apVar = this.f287644g;
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
        e eVar = e.bb;
        abVar.copyOnWrite();
        C83614ac acVar = (C83614ac) abVar.instance;
        acVar.f227955c = eVar.ca;
        acVar.f227953a |= 2;
        abVar.copyOnWrite();
        C83614ac acVar2 = (C83614ac) abVar.instance;
        acVar2.f227954b = 1;
        acVar2.f227953a = 1 | acVar2.f227953a;
        abVar.copyOnWrite();
        C83614ac acVar3 = (C83614ac) abVar.instance;
        str.getClass();
        acVar3.f227953a |= 4;
        acVar3.f227956d = str;
        C83614ac acVar4 = (C83614ac) abVar.build();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        acVar4.getClass();
        yVar.f228084c = acVar4;
        yVar.f228083b = 5;
        apVar.mo93763v((C83673y) wVar.build(), Bundle.EMPTY);
    }

    /* renamed from: o */
    public final void mo93575o(C80248co coVar, C80213bg bgVar) {
        if (mo71923b() != C80201av.PIE_ELIGIBLE) {
            ((C58970a) ((C58970a) f287638e.mo56226d()).mo56372aa(21409)).mo56386p("Received signal tracking request when PIE is ineligible.");
            return;
        }
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80214bh bhVar = (C80214bh) C80215bi.f220083d.createBuilder();
        bhVar.copyOnWrite();
        C80215bi biVar = (C80215bi) bhVar.instance;
        biVar.f220086b = coVar.f220171g;
        biVar.f220085a |= 1;
        bhVar.copyOnWrite();
        C80215bi biVar2 = (C80215bi) bhVar.instance;
        bgVar.getClass();
        biVar2.f220087c = bgVar;
        biVar2.f220085a |= 2;
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        C80215bi biVar3 = (C80215bi) bhVar.build();
        biVar3.getClass();
        axVar.f220050b = biVar3;
        axVar.f220049a = 6;
        mo93573m((C80203ax) awVar.build());
    }

    /* renamed from: p */
    public final void mo93576p(String str) {
        C83667s sVar = (C83667s) C83670v.f228073f.createBuilder();
        sVar.copyOnWrite();
        C83670v vVar = (C83670v) sVar.instance;
        vVar.f228076b = 1;
        vVar.f228075a = 1 | vVar.f228075a;
        sVar.copyOnWrite();
        C83670v vVar2 = (C83670v) sVar.instance;
        str.getClass();
        vVar2.f228075a |= 2;
        vVar2.f228077c = str;
        e eVar = e.bb;
        sVar.copyOnWrite();
        C83670v vVar3 = (C83670v) sVar.instance;
        vVar3.f228079e = eVar.ca;
        vVar3.f228075a |= 8;
        C83670v vVar4 = (C83670v) sVar.build();
        C103335ap apVar = this.f287644g;
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        vVar4.getClass();
        yVar.f228084c = vVar4;
        yVar.f228083b = 14;
        apVar.mo93763v((C83673y) wVar.build(), Bundle.EMPTY);
    }

    /* renamed from: f */
    public final C60870cx mo93566f(C80257l lVar) {
        C80201av avVar;
        int i = lVar.f220194a;
        boolean z = false;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 3 : 2 : 1 : 4;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            return this.f287643f.mo28201a("[NGA] PieControllerImpl.setUiState", new C103033a(this, lVar));
        } else {
            if (i3 == 1) {
                if (i == 2) {
                    avVar = C80201av.m128093a(((Integer) lVar.f220195b).intValue());
                    if (avVar == null) {
                        avVar = C80201av.PIE_ELIGIBILITY_UNKNOWN;
                    }
                } else {
                    avVar = C80201av.PIE_ELIGIBILITY_UNKNOWN;
                }
                this.f287646i.edit().putInt("NGA_PIE_LAST_ELIGIBILITY", avVar.f220046m).apply();
                this.f287648k.mo93583a();
            } else if (i3 == 2) {
                AtomicBoolean atomicBoolean = this.f287650m;
                if (i == 3) {
                    z = ((Boolean) lVar.f220195b).booleanValue();
                }
                atomicBoolean.set(z);
            } else if (i3 == 3) {
                ((C58970a) ((C58970a) f287638e.mo56226d()).mo56372aa(21408)).mo56386p("Empty request");
                return C60856cj.m92899h(new Throwable("Empty request"));
            }
            return C60856cj.m92900i(C80259n.f220196a);
        }
    }

    /* renamed from: k */
    public final void mo93571k(boolean z) {
        C80203ax axVar;
        if (z) {
            C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
            awVar.copyOnWrite();
            C80203ax axVar2 = (C80203ax) awVar.instance;
            axVar2.f220049a = 9;
            axVar2.f220050b = true;
            axVar = (C80203ax) awVar.build();
        } else {
            C80202aw awVar2 = (C80202aw) C80203ax.f220047c.createBuilder();
            awVar2.copyOnWrite();
            C80203ax axVar3 = (C80203ax) awVar2.instance;
            axVar3.f220049a = 1;
            axVar3.f220050b = true;
            axVar = (C80203ax) awVar2.build();
        }
        mo93573m(axVar);
    }
}
