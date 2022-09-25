package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88159ri;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88160rj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88161rk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88250us;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88251ut;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88252uu;
import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.C90175a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.p7148ui.C90633ai;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.apps.gsa.shared.p7148ui.p7153e.C90674b;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100028a;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100031d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.p1730f.C21370a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.t */
/* compiled from: PG */
public final class C100077t extends C22939d implements C90175a {

    /* renamed from: a */
    public final C100031d f279895a;

    /* renamed from: b */
    public final C87680ah f279896b;

    /* renamed from: c */
    public final C100028a f279897c;

    /* renamed from: d */
    public C100057ax f279898d;

    /* renamed from: e */
    public C22939d f279899e;

    /* renamed from: f */
    public C22939d f279900f;

    /* renamed from: g */
    public C22939d f279901g;

    /* renamed from: h */
    public int f279902h;

    /* renamed from: i */
    public int f279903i;

    /* renamed from: j */
    private final Context f279904j;

    /* renamed from: k */
    private final C100058ay f279905k;

    /* renamed from: l */
    private final float f279906l;

    public C100077t(C22945j jVar, C100031d dVar, C100028a aVar, Context context, C87680ah ahVar, C100058ay ayVar) {
        super(jVar);
        this.f279895a = dVar;
        this.f279897c = aVar;
        this.f279904j = context;
        this.f279896b = ahVar;
        this.f279905k = ayVar;
        this.f279906l = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final C90633ai mo83923a() {
        return (C90633ai) mo28297il();
    }

    /* renamed from: b */
    public final void mo83924b(int i) {
        this.f279902h = i;
        View findViewById = mo28297il().findViewById(R.id.cards_container_wrapper);
        findViewById.setPadding(findViewById.getPaddingLeft(), i, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        mo91740k();
    }

    /* renamed from: e */
    public final void mo91736e(int i, int i2) {
        C88160rj rjVar = (C88160rj) C88161rk.f238326e.createBuilder();
        rjVar.copyOnWrite();
        C88161rk rkVar = (C88161rk) rjVar.instance;
        rkVar.f238328a |= 1;
        rkVar.f238329b = i2;
        rjVar.copyOnWrite();
        C88161rk rkVar2 = (C88161rk) rjVar.instance;
        rkVar2.f238328a |= 2;
        rkVar2.f238330c = i;
        rjVar.copyOnWrite();
        C88161rk rkVar3 = (C88161rk) rjVar.instance;
        rkVar3.f238328a |= 4;
        rkVar3.f238331d = 0;
        C87680ah ahVar = this.f279896b;
        C88489j jVar = new C88489j(C87739bu.PADDING_CHANGED);
        jVar.mo82014b(C88159ri.f238325a, (C88161rk) rjVar.build());
        ahVar.mo81961c(jVar.mo82013a());
    }

    /* renamed from: g */
    public final void mo91737g(boolean z) {
        C22939d dVar = this.f279899e;
        if (dVar != null) {
            dVar.mo28297il().setVisibility(true != z ? 8 : 0);
            if (z) {
                this.f279897c.mo91716e();
            }
        }
    }

    /* renamed from: h */
    public final void mo91738h(boolean z) {
        C22939d dVar = this.f279901g;
        if (dVar != null) {
            dVar.mo28297il().setVisibility(true != z ? 8 : 0);
            if (z) {
                this.f279897c.mo91716e();
            }
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        Display display = null;
        CoScrollContainer coScrollContainer = (CoScrollContainer) LayoutInflater.from(this.f279904j).inflate(R.layout.srp_content, (ViewGroup) null);
        mo28295iC(coScrollContainer);
        C100058ay ayVar = this.f279905k;
        C22945j jVar = this.f63126Q;
        C100028a aVar = this.f279897c;
        C90674b bVar = (C90674b) ayVar.f279844a.mo17428b();
        bVar.getClass();
        C90323a aVar2 = (C90323a) ayVar.f279845b.mo17428b();
        aVar2.getClass();
        C21370a aVar3 = (C21370a) ayVar.f279846c.mo17428b();
        aVar3.getClass();
        jVar.getClass();
        aVar.getClass();
        coScrollContainer.getClass();
        C100057ax axVar = new C100057ax(bVar, aVar2, aVar3, jVar, aVar, coScrollContainer);
        this.f279898d = axVar;
        axVar.f279833d.f253568f = new C100062e(this);
        C23251a aVar4 = ((C100059b) this.f279895a).f279851e;
        Objects.requireNonNull(axVar);
        aVar4.mo28726b(new C100063f(axVar));
        ((C100059b) this.f279895a).f279850d.mo28726b(new C100064g(this));
        C23251a aVar5 = ((C100059b) this.f279895a).f279855i;
        C100057ax axVar2 = this.f279898d;
        Objects.requireNonNull(axVar2);
        aVar5.mo28726b(new C100065h(axVar2));
        ((C100059b) this.f279895a).f279857k.mo28726b(new C100066i(this));
        if (Build.VERSION.SDK_INT >= 30) {
            display = this.f279904j.getDisplay();
        } else {
            WindowManager windowManager = (WindowManager) this.f279904j.getSystemService("window");
            if (windowManager != null) {
                display = windowManager.getDefaultDisplay();
            }
        }
        if (display != null) {
            Point point = new Point();
            display.getSize(point);
            int i = point.x;
            float f = this.f279906l;
            int i2 = point.y;
            float f2 = this.f279906l;
            C88251ut utVar = (C88251ut) C88252uu.f238708d.createBuilder();
            utVar.copyOnWrite();
            C88252uu uuVar = (C88252uu) utVar.instance;
            uuVar.f238710a |= 1;
            uuVar.f238711b = (int) (((float) i) / f);
            utVar.copyOnWrite();
            C88252uu uuVar2 = (C88252uu) utVar.instance;
            uuVar2.f238710a |= 2;
            uuVar2.f238712c = (int) (((float) i2) / f2);
            C88489j jVar2 = new C88489j(C87739bu.SET_BROWSER_DIMENSION);
            jVar2.mo82014b(C88250us.f238707a, (C88252uu) utVar.build());
            this.f279896b.mo81961c(jVar2.mo82013a());
        }
        ((C100059b) this.f279895a).f279849c.mo28685c(new C100073p(this, new C23243a(R.id.native_views_container, coScrollContainer)));
        ((C100059b) this.f279895a).f279854h.mo28726b(new C100070m(this));
        ((C100059b) this.f279895a).f279848b.mo28685c(new C100076s(this, new C23243a(R.id.message_cards_container, coScrollContainer)));
        ((C100059b) this.f279895a).f279853g.mo28726b(new C100069l(this));
        ((C100059b) this.f279895a).f279847a.mo28685c(new C100074q(this, new C23243a(R.id.action_cards_container, coScrollContainer)));
        ((C100059b) this.f279895a).f279852f.mo28726b(new C100067j(this));
        coScrollContainer.mo84822r(new C100075r(this));
        ((C100059b) this.f279895a).f279856j.mo28726b(new C100068k(this));
    }

    /* renamed from: j */
    public final void mo91739j(boolean z) {
        C22939d dVar = this.f279900f;
        if (dVar != null) {
            dVar.mo28297il().setVisibility(true != z ? 8 : 0);
            if (z) {
                this.f279897c.mo91716e();
            }
        }
    }

    /* renamed from: k */
    public final void mo91740k() {
        C100057ax axVar = this.f279898d;
        if (axVar != null) {
            int i = this.f279902h + this.f279903i;
            CoScrollContainer coScrollContainer = axVar.f279832c;
            if (i != coScrollContainer.f253338a) {
                coScrollContainer.f253338a = i;
                coScrollContainer.f253339b = 0;
                coScrollContainer.mo84821q(true, 0);
            }
            mo91736e(this.f279902h + this.f279903i, this.f279898d.f279833d.mo84968a());
        }
    }
}
