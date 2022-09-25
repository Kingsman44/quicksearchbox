package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import android.app.Activity;
import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.p2199f.C28414a;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.education.C30546a;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30319a;
import com.google.android.libraries.onegoogle.actions.C30805f;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30903ac;
import com.google.android.libraries.onegoogle.common.C30904ad;
import com.google.android.libraries.onegoogle.common.C30910aj;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30861a;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30870ac;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30871ad;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30891t;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30894w;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30895x;
import com.google.android.libraries.onegoogle.p2380c.p2382b.p2383a.C30862a;
import com.google.android.libraries.onegoogle.tooltip.C31066b;
import com.google.android.libraries.onegoogle.tooltip.C31067c;
import com.google.android.libraries.onegoogle.tooltip.C31068d;
import com.google.android.libraries.onegoogle.tooltip.C31069e;
import com.google.android.libraries.onegoogle.tooltip.C31075k;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p2203m.p2204a.C28487a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.aic;
import com.google.common.p4552o.aid;
import com.google.common.p4552o.aiq;
import com.google.common.p4552o.air;
import com.google.protobuf.C62940bt;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.k */
/* compiled from: PG */
public final class C30564k extends C30546a {

    /* renamed from: a */
    public final C30570q f82581a;

    public C30564k(C30570q qVar) {
        this.f82581a = qVar;
    }

    /* renamed from: a */
    public final C58528ij mo36206a() {
        return this.f82581a.mo36236k();
    }

    /* renamed from: b */
    public final boolean mo36207b() {
        return ((Boolean) this.f82581a.mo36234i().mo6453a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo36208c() {
        return ((Boolean) this.f82581a.mo36235j().mo6453a()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo36209d(FragmentManager fragmentManager, C31067c cVar, Runnable runnable) {
        C58833ax axVar;
        int i;
        FragmentManager fragmentManager2 = fragmentManager;
        C31067c cVar2 = cVar;
        C30555b s = this.f82581a.mo36244s();
        this.f82581a.mo36242q();
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) cVar2;
        selectedAccountDisc.f81902c.getContext();
        Context context = selectedAccountDisc.f81902c.getContext();
        int o = this.f82581a.mo36240o();
        if (o != 0) {
            boolean z = false;
            if (o == 2 && C30910aj.m57700a(context)) {
                return false;
            }
            C31075k kVar = (C31075k) fragmentManager2.f634a.mo671c("com.google.android.libraries.onegoogle.tooltip.TooltipFragment");
            if (kVar == null) {
                kVar = new C31075k();
            }
            C30572s a = s.f82529a.mo36212a(context);
            if (a != null) {
                C58833ax k = C58833ax.m90834k(Integer.valueOf(C28487a.m53260a(a.getContext(), R.attr.colorSurface)));
                if (this.f82581a.mo36239n() || C30910aj.m57700a(context)) {
                    axVar = C58833ax.m90834k(Integer.valueOf(C28487a.m53260a(a.getContext(), R.attr.slimCardScrimColor)));
                } else {
                    axVar = C58836b.f156633a;
                }
                C58833ax axVar2 = axVar;
                Objects.requireNonNull(runnable);
                C30558e eVar = new C30558e(runnable);
                int p = this.f82581a.mo36241p();
                int i2 = p - 1;
                if (p != 0) {
                    if (i2 == 0) {
                        i = 2;
                    } else if (i2 == 1) {
                        i = 3;
                    } else {
                        throw new IllegalStateException();
                    }
                    C31069e eVar2 = new C31069e(k, axVar2, a, eVar, i, new C30559f(this, a, cVar2, kVar));
                    if (C31066b.m57973a(cVar)) {
                        if (cVar2 != null) {
                            kVar.f83710d = new C31068d(eVar2, cVar2);
                            kVar.f83709c.mo36609b();
                            Activity activity = (Activity) selectedAccountDisc.f81909j.get();
                            if (activity != null && activity.isFinishing()) {
                                z = true;
                            }
                            if (!kVar.isAdded() && !kVar.f83711e && !z) {
                                C0154a aVar = new C0154a(fragmentManager2);
                                aVar.mo685r(kVar, "com.google.android.libraries.onegoogle.tooltip.TooltipFragment");
                                aVar.mo505b(true);
                            }
                            z = true;
                        } else {
                            throw new NullPointerException("Null anchorViewProvider");
                        }
                    }
                    if (z) {
                        this.f82581a.mo36237l().run();
                    }
                    return z;
                }
                throw null;
            }
            throw new NullPointerException("Null contentView");
        }
        throw null;
    }

    /* renamed from: e */
    public final boolean mo36210e(View view, Runnable runnable) {
        this.f82581a.mo36242q();
        view.getContext();
        if (!C2043bi.m5569aw(view)) {
            return false;
        }
        this.f82581a.mo36244s();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.og_highlight_container);
        frameLayout.getClass();
        frameLayout.removeAllViews();
        Context context = view.getContext();
        C30904ad e = C30904ad.m57690e(context);
        C30805f fVar = new C30805f(C30899a.m57682a(context, R.attr.ogIconColor), e.mo36590d(C30903ac.COLOR_PRIMARY_GOOGLE), e.mo36590d(C30903ac.COLOR_ON_PRIMARY_GOOGLE), true);
        String string = context.getString(R.string.og_highlight_new);
        C30319a.m56482a(frameLayout, fVar, string);
        frameLayout.setContentDescription(string);
        C30563j jVar = new C30563j(view, runnable);
        view.addOnAttachStateChangeListener(jVar);
        if (!C2043bi.m5569aw(view)) {
            jVar.onViewDetachedFromWindow(view);
        }
        return true;
    }

    /* renamed from: f */
    public final int mo36211f() {
        return this.f82581a.mo36243r();
    }

    /* renamed from: g */
    public final void mo36252g(View view, int i) {
        C30870ac f = this.f82581a.mo36230f();
        C28353e[] eVarArr = new C28353e[1];
        int r = this.f82581a.mo36243r();
        C62940bt btVar = C30891t.f83295a;
        C30894w wVar = (C30894w) C30895x.f83301c.createBuilder();
        aiq aiq = (aiq) air.f158830f.createBuilder();
        aic aic = (aic) aid.f158801c.createBuilder();
        aic.copyOnWrite();
        aid aid = (aid) aic.instance;
        int i2 = r - 1;
        if (r != 0) {
            aid.f158804b = i2;
            aid.f158803a |= 2;
            aiq.copyOnWrite();
            air air = (air) aiq.instance;
            aid aid2 = (aid) aic.build();
            aid2.getClass();
            air.f158835c = aid2;
            air.f158833a |= 4;
            wVar.copyOnWrite();
            C30895x xVar = (C30895x) wVar.instance;
            air air2 = (air) aiq.build();
            air2.getClass();
            xVar.f83304b = air2;
            xVar.f83303a = 1 | xVar.f83303a;
            eVarArr[0] = new C28353e(btVar, (C30895x) wVar.build());
            if (f.mo36560f()) {
                f.mo36557c().getClass();
                Object a = f.mo36557c().mo35765a();
                C19559g.m37304c();
                if (f.mo36560f()) {
                    C28421h hVar = (C28421h) Objects.requireNonNull(f.mo36555a());
                    C28313c a2 = hVar.mo33882c().mo33805a(C28427h.m53115a(i));
                    if (f.mo36559e().mo56113h()) {
                        a2.mo33858f(((C30862a) f.mo36559e().mo56107c()).mo36551a());
                    }
                    a2.mo33859g(C28414a.m53090a());
                    a2.mo33859g(C30861a.m57616b(f.mo36556b(), f.mo36558d(), a).mo36548a());
                    for (int i3 = 0; i3 <= 0; i3++) {
                        a2.mo33858f(eVarArr[i3]);
                    }
                    hVar.mo33881b().mo33801b(view, a2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: h */
    public final void mo36253h(View view) {
        C30870ac f = this.f82581a.mo36230f();
        C28440j h = C28442l.m53142h();
        if (f.mo36560f()) {
            if (f.mo36559e().mo56113h()) {
                h.mo33895b(((C30862a) f.mo36559e().mo56107c()).mo36552b());
            }
            C30871ad.m57643a(((C28421h) Objects.requireNonNull(f.mo36555a())).mo33880a(), h, view);
        }
    }
}
