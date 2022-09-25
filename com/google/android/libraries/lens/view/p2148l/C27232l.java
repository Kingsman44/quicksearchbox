package com.google.android.libraries.lens.view.p2148l;

import android.text.TextUtils;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.base.C58833ax;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.l.l */
/* compiled from: PG */
public abstract class C27232l implements C27654a {

    /* renamed from: A */
    public static final C27232l f74493A = m50570D().mo32678a();

    /* renamed from: D */
    public static C27230j m50570D() {
        C27223c cVar = new C27223c();
        cVar.mo32683f(C62471cu.f168676c);
        cVar.mo32686i(false);
        cVar.mo32690m(0);
        cVar.mo32684g(C62433bj.UNKNOWN.f168594ao);
        cVar.mo32680c(true);
        cVar.mo32689l(false);
        cVar.mo32688k(0);
        cVar.mo32685h(false);
        cVar.mo32687j(false);
        cVar.mo32682e(false);
        cVar.f74447p = (short) (cVar.f74447p | 512);
        return cVar;
    }

    /* renamed from: E */
    static void m50571E(C27658e eVar, String str, C58833ax axVar, String str2) {
        if (axVar.mo56113h()) {
            eVar.mo33149f(str, axVar.mo56107c().toString());
        } else {
            eVar.mo33148e(str, str2);
        }
    }

    /* renamed from: A */
    public abstract boolean mo32691A();

    /* renamed from: B */
    public abstract boolean mo32692B();

    /* renamed from: C */
    public abstract boolean mo32693C();

    /* renamed from: F */
    public final boolean mo32729F(String str) {
        if (str == null) {
            return false;
        }
        if (!C62632i.m94822g(mo32701h()) && !C62632i.m94817b(mo32701h()) && !C62632i.m94824i(mo32701h()) && !C62632i.m94823h(mo32701h())) {
            return false;
        }
        if (!mo32699f().mo56113h() || TextUtils.isEmpty((CharSequence) mo32699f().mo56107c()) || !str.equals(mo32699f().mo56107c())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public abstract int mo32694a();

    /* renamed from: b */
    public abstract int mo32695b();

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensViewConfig");
        m50571E(eVar, "account", mo32699f(), "NO_ACCOUNT");
        m50571E(eVar, "callerPackage", mo32701h(), "NO_CALLER_PACKAGE");
        m50571E(eVar, "locationOverride", mo32712r(), "NO_LOCATION_OVERRIDE");
        m50571E(eVar, "fifeUrl", mo32706l(), "NO_FIFE");
        m50571E(eVar, "imageSrcUri", mo32710p(), "NO_IMAGE_SRC_URI");
        m50571E(eVar, "pageDomain", mo32713s(), "NO_PAGE_DOMAIN");
        m50571E(eVar, "imagePlaceId", mo32709o(), "NO_PLACE_ID");
        eVar.mo33148e("bootstrapImage", String.valueOf(mo32700g().mo56113h()));
        eVar.mo33148e("isTriggeredByAgsaExternal", String.valueOf(mo32721z()));
        eVar.mo33148e("transitionType", String.valueOf(mo32696d()));
        eVar.mo33148e("intentType", String.valueOf(mo32694a()));
        eVar.mo33148e("shouldHideLensCloseButton", String.valueOf(mo32693C()));
        eVar.mo33148e("screenOrientation", String.valueOf(mo32695b()));
        eVar.mo33148e("isFromIncognito", String.valueOf(mo32720y()));
        eVar.mo33148e("promoAddShortcut", String.valueOf(mo32691A()));
        m50571E(eVar, "regionOfInterest", mo32714t().mo56106b(C27229i.f74492a), "NO_ROI");
    }

    /* renamed from: d */
    public abstract int mo32696d();

    /* renamed from: e */
    public abstract C27230j mo32697e();

    /* renamed from: f */
    public abstract C58833ax mo32699f();

    /* renamed from: g */
    public abstract C58833ax mo32700g();

    /* renamed from: h */
    public abstract C58833ax mo32701h();

    /* renamed from: i */
    public abstract C58833ax mo32703i();

    /* renamed from: j */
    public abstract C58833ax mo32704j();

    /* renamed from: k */
    public abstract C58833ax mo32705k();

    /* renamed from: l */
    public abstract C58833ax mo32706l();

    /* renamed from: m */
    public abstract C58833ax mo32707m();

    /* renamed from: n */
    public abstract C58833ax mo32708n();

    /* renamed from: o */
    public abstract C58833ax mo32709o();

    /* renamed from: p */
    public abstract C58833ax mo32710p();

    /* renamed from: q */
    public abstract C58833ax mo32711q();

    /* renamed from: r */
    public abstract C58833ax mo32712r();

    /* renamed from: s */
    public abstract C58833ax mo32713s();

    /* renamed from: t */
    public abstract C58833ax mo32714t();

    /* renamed from: u */
    public abstract C58833ax mo32716u();

    /* renamed from: v */
    public abstract C62471cu mo32717v();

    /* renamed from: w */
    public abstract boolean mo32718w();

    /* renamed from: x */
    public abstract boolean mo32719x();

    /* renamed from: y */
    public abstract boolean mo32720y();

    /* renamed from: z */
    public abstract boolean mo32721z();
}
