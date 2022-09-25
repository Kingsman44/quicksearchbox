package com.google.android.apps.gsa.nga.shared.p6331aq.p6332a;

import android.os.Build;
import com.google.android.apps.gsa.nga.api.C74717bu;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81011b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82461ga;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82463gc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82468gh;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82472gl;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.ahi;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.aq.a.e */
/* compiled from: PG */
public class C81009e implements C81006b, C90991b {

    /* renamed from: a */
    private static final C58974d f222031a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f222032b = C58528ij.m90014N(Integer.valueOf(C90126fx.f251453jB.f248757a), Integer.valueOf(C90126fx.f251471jT.f248757a), Integer.valueOf(C90126fx.f251780pk.f251802a), Integer.valueOf(C90126fx.f251785pp.f251802a), Integer.valueOf(C90126fx.f251786pq.f251802a));

    /* renamed from: c */
    private final C74717bu f222033c;

    /* renamed from: d */
    private final C91142g f222034d;

    /* renamed from: e */
    private final Supplier f222035e;

    /* renamed from: f */
    private final Supplier f222036f;

    /* renamed from: g */
    private final Supplier f222037g;

    /* renamed from: h */
    private final C81013d f222038h;

    protected C81009e(C91142g gVar, Supplier supplier, Supplier supplier2, C74717bu buVar, Supplier supplier3, C81013d dVar) {
        this.f222033c = buVar;
        this.f222034d = gVar;
        this.f222035e = supplier;
        this.f222036f = supplier2;
        this.f222037g = supplier3;
        this.f222038h = dVar;
    }

    /* renamed from: h */
    private final NgaState m128921h() {
        return (NgaState) C58831av.m90830c(this.f222033c.mo71087a(), NgaState.c);
    }

    /* renamed from: i */
    private final boolean m128922i() {
        return C90772bp.m148274A(C89988b.m146551d(this.f222034d.mo85403h(C90126fx.f251785pp)), Build.MODEL);
    }

    /* renamed from: j */
    private final boolean m128923j() {
        return C90772bp.m148274A(C89988b.m146551d(this.f222034d.mo85403h(C90126fx.f251786pq)), ((Locale) this.f222035e.get()).toLanguageTag());
    }

    /* renamed from: a */
    public final C81011b mo74776a() {
        C81011b bVar;
        if (!this.f222034d.mo85405j(C90126fx.f251453jB)) {
            bVar = C81011b.MWW_FLAG_DISABLED;
        } else if (!m128922i()) {
            bVar = C81011b.DEVICE_UNSUPPORTED;
        } else if (!m128923j()) {
            bVar = C81011b.LOCALE_UNSUPPORTED;
        } else if (!((ahi) this.f222036f.get()).equals(ahi.ELIGIBLE)) {
            int ordinal = ((ahi) this.f222036f.get()).ordinal();
            if (ordinal == 1) {
                bVar = C81011b.NONE;
            } else if (ordinal == 5) {
                bVar = C81011b.WORK_PROFILE;
            } else if (ordinal == 13) {
                bVar = C81011b.ACCOUNT_WITH_INVALID_OAUTH_TOKEN;
            } else if (ordinal != 20) {
                bVar = C81011b.NGA_INELIGIBLE;
            } else {
                bVar = C81011b.DASHER_SAA_DISABLED;
            }
        } else if (!m128921h().b()) {
            bVar = C81011b.NGA_INACTIVE;
        } else if (!((Boolean) this.f222037g.get()).booleanValue()) {
            bVar = C81011b.NGA_ON_DEVICE_DISABLED;
        } else {
            bVar = C81011b.NONE;
        }
        C83305i iVar = ((C81014e) this.f222038h).f222055a;
        String name = bVar.name();
        if (name != null) {
            iVar.mo75579d(new C82463gc("NGA_WARM_ACTIONS_INELIGIBILITY_REASON", name));
            return bVar;
        }
        throw new NullPointerException("Null ineligibilityReason");
    }

    /* renamed from: b */
    public final C81011b mo74777b() {
        C81011b bVar;
        if (!this.f222034d.mo85405j(C90126fx.f251453jB)) {
            bVar = C81011b.MWW_FLAG_DISABLED;
        } else if (!m128922i()) {
            bVar = C81011b.DEVICE_UNSUPPORTED;
        } else if (!m128923j()) {
            bVar = C81011b.LOCALE_UNSUPPORTED;
        } else {
            bVar = C81011b.NONE;
        }
        C83305i iVar = ((C81014e) this.f222038h).f222055a;
        String name = bVar.name();
        if (name != null) {
            iVar.mo75579d(new C82468gh("NGA_WARM_ACTIONS_SETTINGS_INELIGIBILITY_REASON", name));
            return bVar;
        }
        throw new NullPointerException("Null ineligibilityReason");
    }

    /* renamed from: c */
    public final C58528ij mo74778c() {
        C58485gu guVar;
        String h = this.f222034d.mo85403h(C90126fx.f251780pk);
        try {
            guVar = C89988b.m146549b(h);
        } catch (NumberFormatException unused) {
            ((C58970a) ((C58970a) f222031a.mo56226d()).mo56372aa(6572)).mo56389s("Wrong value for int list: %s.", h);
            guVar = C58485gu.m89845m();
        }
        return (C58528ij) Collection.EL.stream(guVar).map(C81007c.f222029a).filter(C81008d.f222030a).collect(C58370cn.f155947b);
    }

    /* renamed from: e */
    public final boolean mo74779e(C79570b bVar) {
        boolean contains = mo74778c().contains(bVar);
        C81013d dVar = this.f222038h;
        C81011b bVar2 = contains ? C81011b.NONE : C81011b.CONTEXT_FLAG_DISABLED;
        C83305i iVar = ((C81014e) dVar).f222055a;
        int i = bVar.f218339o;
        String name = bVar2.name();
        if (name != null) {
            iVar.mo75579d(new C82461ga("NGA_WARM_ACTIONS_CONTEXT_INELIGIBILITY_REASON", i, name));
            return contains;
        }
        throw new NullPointerException("Null ineligibilityReason");
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo74780f() {
        return C81005a.m128912a(this);
    }

    /* renamed from: g */
    public final boolean mo74781g() {
        C81011b bVar;
        if (!this.f222034d.mo85405j(C90126fx.f251471jT)) {
            bVar = C81011b.SUW_FLAG_DISABLED;
        } else if (!m128922i()) {
            bVar = C81011b.DEVICE_UNSUPPORTED;
        } else if (!m128923j()) {
            bVar = C81011b.LOCALE_UNSUPPORTED;
        } else {
            bVar = C81011b.NONE;
        }
        C83305i iVar = ((C81014e) this.f222038h).f222055a;
        String name = bVar.name();
        if (name != null) {
            iVar.mo75579d(new C82472gl("NGA_WARM_ACTIONS_SUW_INELIGIBILITY_REASON", name));
            return bVar.equals(C81011b.NONE);
        }
        throw new NullPointerException("Null ineligibilityReason");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MWW eligibility");
        fVar.mo85278b("MWW Eligible").mo85276a(C90752i.m148228b(Boolean.valueOf(C81005a.m128912a(this))));
        fVar.mo85278b("MWW Eligible for SUW").mo85276a(C90752i.m148228b(Boolean.valueOf(mo74781g())));
        fVar.mo85278b("MWW Eligible for settings").mo85276a(C90752i.m148228b(Boolean.valueOf(C81005a.m128913b(this))));
        fVar.mo85278b("NGA Eligible").mo85276a(C90752i.m148229c(((ahi) this.f222036f.get()).name()));
        fVar.mo85278b("NGA State").mo85276a(C90752i.m148231e(m128921h()));
        fVar.mo85278b("NGA On-device").mo85276a(C90752i.m148228b((Boolean) this.f222037g.get()));
        fVar.mo85278b("MWW Flag").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f222034d.mo85405j(C90126fx.f251453jB))));
        fVar.mo85278b("MWW Enabled contexts").mo85276a(C90752i.m148229c(this.f222034d.mo85403h(C90126fx.f251780pk)));
        fVar.mo85278b("MWW Supported devices").mo85276a(C90752i.m148229c(this.f222034d.mo85403h(C90126fx.f251785pp)));
        C91005e b = fVar.mo85278b("Device model");
        String str = Build.MODEL;
        String str2 = "unsupported";
        String str3 = true != m128922i() ? str2 : "supported";
        b.mo85276a(C90752i.m148229c(str + " (" + str3 + ")"));
        fVar.mo85278b("MWW Supported locales").mo85276a(C90752i.m148229c(this.f222034d.mo85403h(C90126fx.f251786pq)));
        C91005e b2 = fVar.mo85278b("Primary locale");
        String languageTag = ((Locale) this.f222035e.get()).toLanguageTag();
        if (true == m128923j()) {
            str2 = "supported";
        }
        b2.mo85276a(C90752i.m148229c(languageTag + " (" + str2 + ")"));
    }
}
