package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.app.C0395p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90248c;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7148ui.header.C90695h;
import com.google.android.apps.gsa.shared.p7148ui.header.LogoHeaderView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.C93973d;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.p7396a.C93970b;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100047an;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100048ao;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100053at;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.y */
/* compiled from: PG */
public final class C94001y extends C22939d implements C90248c {

    /* renamed from: a */
    public static final C59071e f262525a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.e.a.y");

    /* renamed from: b */
    public final C93970b f262526b;

    /* renamed from: c */
    public final C93973d f262527c;

    /* renamed from: d */
    public final C91189au f262528d;

    /* renamed from: e */
    public final C22871g f262529e;

    /* renamed from: f */
    public final boolean f262530f;

    /* renamed from: g */
    public LogoHeaderView f262531g;

    /* renamed from: h */
    public boolean f262532h;

    /* renamed from: i */
    public final boolean f262533i;

    /* renamed from: j */
    public Rect f262534j;

    /* renamed from: k */
    public C94000x f262535k;

    /* renamed from: l */
    private final Context f262536l;

    /* renamed from: m */
    private final C90314b f262537m;

    /* renamed from: n */
    private final C22871g f262538n;

    /* renamed from: o */
    private final boolean f262539o;

    /* renamed from: p */
    private int f262540p;

    /* renamed from: q */
    private boolean f262541q;

    /* renamed from: r */
    private C90315c f262542r;

    /* renamed from: s */
    private C100048ao f262543s;

    /* renamed from: t */
    private C100047an f262544t;

    public C94001y(C22945j jVar, C93970b bVar, C93973d dVar, Context context, C90314b bVar2, C91189au auVar, C22871g gVar, C22871g gVar2, boolean z, C58833ax axVar) {
        super(jVar);
        this.f262526b = bVar;
        this.f262536l = context;
        this.f262527c = dVar;
        this.f262537m = bVar2;
        this.f262528d = auVar;
        this.f262529e = gVar;
        this.f262538n = gVar2;
        this.f262530f = z;
        boolean z2 = false;
        if (axVar.mo56113h() && (axVar.mo56107c() instanceof C0395p)) {
            z2 = true;
        }
        this.f262539o = z2;
        this.f262533i = true;
    }

    /* renamed from: b */
    public final void mo83964b(C100047an anVar) {
        this.f262544t = anVar;
        this.f262541q = true;
        mo88270g();
        mo88272j();
    }

    /* renamed from: c */
    public final void mo83965c(C100048ao aoVar) {
        this.f262543s = aoVar;
        if (aoVar != null) {
            aoVar.f279777a.mo91720c(this.f262540p);
        }
    }

    /* renamed from: e */
    public final String mo88268e(DoodleData doodleData) {
        return this.f262530f ? doodleData.f252927H : doodleData.f252944j;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo88269f(int i) {
        this.f262540p = i;
        C100048ao aoVar = this.f262543s;
        if (aoVar != null) {
            aoVar.f279777a.mo91720c(i);
        }
    }

    /* renamed from: g */
    public final void mo88270g() {
        Rect rect;
        if (this.f262541q && (rect = this.f262534j) != null) {
            LogoHeaderView logoHeaderView = this.f262531g;
            int i = rect.top;
            logoHeaderView.f253639k = true;
            logoHeaderView.f253640l = i;
            for (int i2 = 0; i2 < logoHeaderView.getChildCount(); i2++) {
                View childAt = logoHeaderView.getChildAt(i2);
                if (childAt != logoHeaderView.f253634f) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginLayoutParams.topMargin = i;
                    childAt.setLayoutParams(marginLayoutParams);
                }
            }
            int dimensionPixelSize = logoHeaderView.getResources().getDimensionPixelSize(R.dimen.srp_doodle_height);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) logoHeaderView.f253634f.getLayoutParams();
            marginLayoutParams2.height = dimensionPixelSize + i;
            logoHeaderView.f253634f.setLayoutParams(marginLayoutParams2);
        }
    }

    /* renamed from: h */
    public final void mo88271h() {
        this.f262529e.mo28212l("Set doodle drawable", new C93989m(this));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ((C23249a) this.f262526b.mo88238e()).mo28726b(new C93991o(this));
        ((C23249a) this.f262526b.mo88249p()).mo28726b(new C93992p(this));
        LogoHeaderView logoHeaderView = (LogoHeaderView) LayoutInflater.from(this.f262536l).inflate(R.layout.google_logo_or_doodle, (ViewGroup) null);
        this.f262531g = logoHeaderView;
        mo28295iC(logoHeaderView);
        LogoHeaderView logoHeaderView2 = this.f262531g;
        C93993q qVar = new C93993q(this);
        logoHeaderView2.f253632d.add(qVar);
        qVar.f262516a.mo88269f(logoHeaderView2.mo84995a());
        if (this.f262530f) {
            LogoHeaderView logoHeaderView3 = this.f262531g;
            C58838bb.m90869d(logoHeaderView3.f253633e == null, "Must set white logo view before logo inflates");
            logoHeaderView3.f253641m = true;
        }
        View b = this.f262531g.mo84996b();
        b.setOnClickListener(new C93994r(this));
        LogoHeaderView logoHeaderView4 = this.f262531g;
        logoHeaderView4.f253634f.setOnClickListener(new C90695h(logoHeaderView4, new C93995s(this)));
        if (!this.f262530f) {
            LogoView logoView = (LogoView) b;
            new C90873ag(this.f262538n.mo28201a("decodeLogo", new C93996t(logoView)), this.f262529e, "setLogoBitmap", new C93997u(logoView)).mo85223a(C93998v.f262521a);
        }
        this.f262531g.mo84997c(new Rect());
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C93990n nVar = new C93990n(this);
        this.f262542r = nVar;
        this.f262537m.mo83994a(nVar);
        mo88272j();
        if (((Boolean) ((C23249a) this.f262526b.mo88249p()).mo28725a()).booleanValue()) {
            this.f262531g.mo85001g(2, true);
        }
        if (this.f262539o) {
            this.f262535k = new C94000x(this.f262531g);
            C94000x xVar = this.f262535k;
            xVar.getClass();
            ((C23219p) this.f262526b.mo88235b()).mo28685c(xVar);
        }
    }

    /* renamed from: j */
    public final void mo88272j() {
        int i;
        if (this.f262541q) {
            C58833ax axVar = (C58833ax) ((C23249a) this.f262526b.mo88238e()).mo28725a();
            LogoHeaderView logoHeaderView = this.f262531g;
            boolean z = false;
            if (logoHeaderView.f253642n && logoHeaderView.f253643o && logoHeaderView.f253635g != null && axVar.mo56113h()) {
                z = true;
            }
            if (z) {
                DoodleData doodleData = (DoodleData) axVar.mo56107c();
                i = this.f262530f ? doodleData.f252935P : doodleData.f252933N;
            } else {
                i = 2;
            }
            C100047an anVar = this.f262544t;
            if (anVar != null) {
                C100053at atVar = anVar.f279776a.f279778a;
                atVar.f279789D = i;
                atVar.f279810o = z;
                atVar.mo91729p();
            }
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        this.f262532h = true;
    }

    /* renamed from: k */
    public final /* synthetic */ void mo88273k() {
        if (this.f63126Q.mo28316z()) {
            this.f262527c.mo88254e();
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C90314b bVar = this.f262537m;
        C90315c cVar = this.f262542r;
        cVar.getClass();
        bVar.mo83995b(cVar);
        this.f262542r = null;
    }
}
