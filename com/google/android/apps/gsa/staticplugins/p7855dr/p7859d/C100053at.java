package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.graphics.C1924a;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88305wt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88307wv;
import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.C90175a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90186a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90187b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90188c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7089h.C90244b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90248c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90294j;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90295k;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p6975af.C89102a;
import com.google.android.apps.gsa.shared.p6975af.C89103b;
import com.google.android.apps.gsa.shared.p6989am.C89194a;
import com.google.android.apps.gsa.shared.p6993ao.C89243h;
import com.google.android.apps.gsa.shared.p6993ao.C89250o;
import com.google.android.apps.gsa.shared.p6993ao.C89251p;
import com.google.android.apps.gsa.shared.p6993ao.C89252q;
import com.google.android.apps.gsa.shared.p7148ui.C90633ai;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.apps.gsa.shared.p7148ui.header.C90692e;
import com.google.android.apps.gsa.shared.p7148ui.p7149a.C90621a;
import com.google.android.apps.gsa.shared.p7148ui.p7150b.C90655d;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100032e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.p576aq.C10558u;
import com.google.android.libraries.p576aq.C10563z;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.at */
/* compiled from: PG */
public final class C100053at extends C22939d implements C90186a, C90187b {

    /* renamed from: a */
    public static final C90295k f279785a = C90295k.DAYNIGHT_DARK;

    /* renamed from: A */
    public C90655d f279786A;

    /* renamed from: B */
    public final C89252q f279787B;

    /* renamed from: C */
    public C100037ad f279788C;

    /* renamed from: D */
    public int f279789D = 2;

    /* renamed from: E */
    private final C90314b f279790E;

    /* renamed from: F */
    private final ArgbEvaluator f279791F;

    /* renamed from: G */
    private final int f279792G;

    /* renamed from: H */
    private C90714z f279793H;

    /* renamed from: I */
    private C90315c f279794I;

    /* renamed from: J */
    private C89102a f279795J;

    /* renamed from: K */
    private C100036ac f279796K;

    /* renamed from: b */
    public final Context f279797b;

    /* renamed from: c */
    public final C100032e f279798c;

    /* renamed from: d */
    public final C87680ah f279799d;

    /* renamed from: e */
    public final C68214a f279800e;

    /* renamed from: f */
    public final C89194a f279801f;

    /* renamed from: g */
    public final C100050aq f279802g;

    /* renamed from: h */
    public final C10558u f279803h;

    /* renamed from: i */
    public final C10558u f279804i;

    /* renamed from: j */
    public final C10558u f279805j;

    /* renamed from: k */
    final int f279806k;

    /* renamed from: l */
    final int f279807l;

    /* renamed from: m */
    Rect f279808m = new Rect();

    /* renamed from: n */
    C90692e f279809n;

    /* renamed from: o */
    public boolean f279810o = false;

    /* renamed from: p */
    public int f279811p;

    /* renamed from: q */
    public final boolean f279812q;

    /* renamed from: r */
    public int f279813r;

    /* renamed from: s */
    public C90714z f279814s;

    /* renamed from: t */
    public C90714z f279815t;

    /* renamed from: u */
    public C90244b f279816u;

    /* renamed from: v */
    public C90248c f279817v;

    /* renamed from: w */
    public C22939d f279818w;

    /* renamed from: x */
    public C60870cx f279819x;

    /* renamed from: y */
    public C90621a f279820y;

    /* renamed from: z */
    public C90621a f279821z;

    public C100053at(C22945j jVar, C100032e eVar, Context context, C89251p pVar, C90314b bVar, C89194a aVar, C87680ah ahVar, C68214a aVar2) {
        super(jVar);
        this.f279797b = context;
        this.f279798c = eVar;
        this.f279790E = bVar;
        this.f279799d = ahVar;
        this.f279792G = context.getResources().getDimensionPixelSize(R.dimen.corpus_bar_top_margin);
        this.f279800e = aVar2;
        this.f279801f = aVar;
        int color = context.getResources().getColor(R.color.agsa_color_surface);
        this.f279807l = color;
        int h = C1924a.m5189h(color, 0);
        this.f279806k = h;
        C89252q a = pVar.mo83205a(C90208n.SEARCH_TAB);
        this.f279787B = a;
        this.f279802g = new C100050aq(this);
        this.f279791F = new ArgbEvaluator();
        this.f279803h = C10563z.m25518j(Integer.valueOf(h));
        this.f279805j = C10563z.m25518j(f279785a);
        this.f279804i = C10563z.m25518j(false);
        C89250o oVar = a.f242013f;
        if (oVar != null) {
            oVar.mo83204a();
        }
        this.f279812q = true;
    }

    /* renamed from: c */
    public final C10563z mo83932c(C90188c cVar) {
        if (cVar == C90294j.f252212a) {
            return C10563z.m25517i(new C100083z(this));
        }
        if (cVar == C90294j.f252213b) {
            return C10563z.m25517i(new C100034aa(this));
        }
        return null;
    }

    /* renamed from: e */
    public final C90621a mo91722e(String str, ServiceEventData serviceEventData) {
        Object obj;
        C88246uo uoVar = serviceEventData.f236959a;
        C62940bt r1 = C62942bv.checkIsLite(C88305wt.f238821a);
        uoVar.mo58887l(r1);
        Object l = uoVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C88307wv wvVar = (C88307wv) obj;
        this.f279796K.getClass();
        C90621a aVar = new C90621a(this.f279797b);
        aVar.f253402a = str;
        aVar.f253403b = wvVar.f238824a;
        aVar.f253404c = wvVar.f238825b;
        aVar.f253405d = wvVar.f238826c;
        aVar.f253406e = wvVar.f238827d;
        aVar.f253407f = (Intent) serviceEventData.mo81912b(Intent.class);
        aVar.mo84871c();
        return aVar;
    }

    /* renamed from: g */
    public final void mo91723g() {
        C44565p pVar;
        C90621a aVar = this.f279821z;
        if (aVar != null) {
            aVar.mo84869a();
        }
        C90621a aVar2 = this.f279820y;
        if (aVar2 != null) {
            aVar2.mo84869a();
        }
        C90655d dVar = this.f279786A;
        if (dVar != null && (pVar = dVar.f253538i) != null) {
            pVar.dismiss();
        }
    }

    /* renamed from: h */
    public final void mo91724h() {
        C60870cx cxVar = this.f279819x;
        if (cxVar != null && !cxVar.isDone()) {
            this.f279819x.cancel(false);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C90314b bVar = this.f279790E;
        C90315c cVar = this.f279794I;
        cVar.getClass();
        bVar.mo83995b(cVar);
        C89102a aVar = this.f279795J;
        if (aVar != null) {
            this.f279787B.f242008a.mo83074b(aVar);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f279797b).inflate(R.layout.srp_surface, (ViewGroup) null);
        mo28295iC(inflate);
        this.f279796K = C100036ac.f279764a;
        this.f279788C = C100037ad.f279765a;
        ((C100060c) this.f279798c).f279869k.mo28685c(new C100052as(this, inflate));
        ((C100060c) this.f279798c).f279860b.mo28685c(new C100046am(this, inflate));
        ((C100060c) this.f279798c).f279864f.mo28685c(new C100049ap(this, inflate));
        ((C100060c) this.f279798c).f279862d.mo28726b(new C100038ae(this));
        ((C100060c) this.f279798c).f279863e.mo28726b(new C100039af(this));
        ((C100060c) this.f279798c).f279865g.mo28726b(new C100040ag(this));
        ((C100060c) this.f279798c).f279861c.mo28726b(new C100041ah(this));
        ((C100060c) this.f279798c).f279867i.mo28726b(new C100042ai(this));
        ((C100060c) this.f279798c).f279868j.mo28726b(new C100043aj(this));
        this.f63126Q.mo28327o("Take screenshot", new C100044ak(this));
        this.f63126Q.mo28327o("Cancel screenshot", new C100080w(this));
        mo91726k();
        ((C100060c) this.f279798c).f279859a.mo28685c(new C23243a((ChildStub) inflate.findViewById(R.id.bottom_sheet_stub)));
    }

    /* renamed from: j */
    public final void mo91725j() {
        C90244b bVar;
        C90248c cVar;
        C22939d dVar = this.f279818w;
        if (dVar != null) {
            C90633ai a = ((C90175a) dVar).mo83923a();
            if (this.f279793H == null) {
                C90714z zVar = new C90714z(new C89243h(this.f279787B), a, true, this.f279802g);
                this.f279793H = zVar;
                zVar.mo85046j(1, true, false);
                this.f279793H.f253753h = new C100079v(this);
            }
            if (this.f279815t == null && (cVar = this.f279817v) != null) {
                C90714z zVar2 = new C90714z(cVar.mo83966il(), a);
                this.f279815t = zVar2;
                zVar2.mo85046j(2, true, false);
            }
            if (this.f279814s == null && (bVar = this.f279816u) != null) {
                View b = bVar.mo83949b();
                b.getClass();
                C90714z zVar3 = new C90714z(b, a);
                this.f279814s = zVar3;
                zVar3.mo85046j(2, true, false);
            }
            mo91728m(((Boolean) ((C100060c) this.f279798c).f279862d.f63720e).booleanValue());
            mo91726k();
        }
    }

    /* renamed from: k */
    public final void mo91726k() {
        mo91727l(((Boolean) ((C100060c) this.f279798c).f279863e.f63720e).booleanValue());
    }

    /* renamed from: l */
    public final void mo91727l(boolean z) {
        int i;
        int i2;
        C90714z zVar = this.f279793H;
        if (zVar != null) {
            zVar.mo85045i(this.f279813r, true);
        }
        C90714z zVar2 = this.f279814s;
        if (zVar2 != null) {
            zVar2.mo85045i(this.f279813r, true);
        }
        int i3 = this.f279787B.f242008a.f241535a;
        int i4 = 0;
        if (mo91731r()) {
            i = this.f279808m.top;
        } else {
            i = 0;
        }
        if (!z) {
            int i5 = this.f279813r + i3;
            C90244b bVar = this.f279816u;
            if (bVar == null || !bVar.mo83951d()) {
                i2 = 0;
            } else {
                i2 = this.f279816u.mo83948a();
                i5 += i2;
            }
            C90692e eVar = this.f279809n;
            if (eVar != null) {
                int i6 = this.f279813r;
                int i7 = this.f279792G;
                eVar.mo85008a(i6 + i + i3 + i2);
                this.f279809n.mo85009b(i6 + i2 + i7);
                C90692e eVar2 = this.f279809n;
                if (eVar2.f253681j == null || eVar2.f253683l == null || eVar2.f253682k == null) {
                    View inflate = eVar2.f253679h.inflate();
                    inflate.getClass();
                    eVar2.f253681j = inflate;
                    Drawable drawable = eVar2.f253678g.getResources().getDrawable(R.drawable.background_with_dropshadow);
                    drawable.getClass();
                    eVar2.f253682k = (LayerDrawable) drawable;
                    eVar2.f253682k.getDrawable(1).setAlpha(true != eVar2.f253680i ? PrivateKeyType.INVALID : 0);
                    Drawable drawable2 = eVar2.f253682k.getDrawable(2);
                    if (true == eVar2.f253680i) {
                        i4 = PrivateKeyType.INVALID;
                    }
                    drawable2.setAlpha(i4);
                    eVar2.f253675d = eVar2.f253678g.getResources().getDimensionPixelSize(R.dimen.header_background_gradient_height);
                    eVar2.f253676e = eVar2.f253678g.getResources().getDimensionPixelSize(R.dimen.header_background_shadow_height);
                    eVar2.f253681j.setBackground(eVar2.f253682k);
                    eVar2.f253683l = new C90714z(eVar2.f253681j, (C90633ai) null);
                    eVar2.f253683l.mo85046j(eVar2.f253677f, true, true);
                    int i8 = eVar2.f253674c;
                    if (i8 != 0) {
                        eVar2.mo85009b(i8);
                    }
                    int i9 = eVar2.f253673b;
                    if (i9 != 0) {
                        eVar2.mo85008a(i9);
                    }
                    eVar2.mo85010c(eVar2.f253672a);
                }
            }
            i4 = i5;
        }
        C22939d dVar = this.f279818w;
        if (dVar != null) {
            ((C90175a) dVar).mo83924b(i4);
        }
        C90244b bVar2 = this.f279816u;
        if (bVar2 != null) {
            bVar2.mo83950c(i3 + i + this.f279792G);
        }
    }

    /* renamed from: m */
    public final void mo91728m(boolean z) {
        if (z) {
            this.f279804i.mo18619f(true);
            C90714z zVar = this.f279793H;
            if (zVar != null) {
                zVar.mo85046j(3, false, true);
            }
            C90714z zVar2 = this.f279814s;
            if (zVar2 != null) {
                zVar2.mo85046j(3, false, true);
            }
            C90714z zVar3 = this.f279815t;
            if (zVar3 != null) {
                zVar3.mo85046j(3, false, true);
            }
            C90692e eVar = this.f279809n;
            if (eVar != null) {
                eVar.mo85010c(false);
                this.f279809n.mo85011d(3);
                return;
            }
            return;
        }
        this.f279804i.mo18619f(false);
        C90714z zVar4 = this.f279793H;
        if (zVar4 != null) {
            zVar4.mo85046j(1, false, true);
        }
        C90714z zVar5 = this.f279814s;
        if (zVar5 != null) {
            zVar5.mo85046j(2, false, false);
        }
        C90714z zVar6 = this.f279815t;
        if (zVar6 != null) {
            zVar6.mo85046j(2, false, false);
        }
        C90692e eVar2 = this.f279809n;
        if (eVar2 != null) {
            eVar2.mo85010c(true);
            this.f279809n.mo85011d(2);
        }
    }

    /* renamed from: p */
    public final void mo91729p() {
        C90295k kVar;
        if (!this.f279810o) {
            this.f279803h.mo18619f(Integer.valueOf(this.f279807l));
            this.f279805j.mo18619f(f279785a);
            return;
        }
        int i = this.f279787B.f242008a.f241535a + this.f279813r;
        float pow = (float) Math.pow((double) (((float) Math.max(0, Math.min(i, this.f279811p))) / ((float) i)), 3.0d);
        this.f279803h.mo18619f((Integer) this.f279791F.evaluate(pow, Integer.valueOf(this.f279806k), Integer.valueOf(this.f279807l)));
        if (pow < 0.5f) {
            C10558u uVar = this.f279805j;
            if (this.f279789D == 3) {
                kVar = C90295k.ALWAYS_LIGHT;
            } else {
                kVar = C90295k.ALWAYS_DARK;
            }
            uVar.mo18619f(kVar);
            return;
        }
        this.f279805j.mo18619f(f279785a);
    }

    /* renamed from: r */
    public final boolean mo91731r() {
        return this.f279817v != null;
    }

    /* renamed from: q */
    public final void mo91730q() {
        int i;
        int i2 = 0;
        if (mo91731r()) {
            i = 0;
        } else {
            i = this.f279808m.top;
        }
        C91115n.m148874f(mo28297il(), 0, i);
        if (this.f279818w != null) {
            if (mo91731r()) {
                i2 = this.f279808m.top;
            }
            C22939d dVar = this.f279818w;
            dVar.getClass();
            ((ViewGroup.MarginLayoutParams) dVar.mo28297il().getLayoutParams()).topMargin = i2;
        }
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f279795J = new C100081x(this);
        C89103b bVar = this.f279787B.f242008a;
        C89102a aVar = this.f279795J;
        aVar.getClass();
        bVar.mo83073a(aVar);
        C100082y yVar = new C100082y(this);
        this.f279794I = yVar;
        this.f279790E.mo83994a(yVar);
        this.f279809n = new C90692e(this.f279797b, (ViewStub) mo28297il().findViewById(R.id.header_background_stub), ((Boolean) ((C100060c) this.f279798c).f279870l.f63720e).booleanValue());
    }
}
