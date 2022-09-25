package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90234j;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117489e;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117490f;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117493i;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.ab */
/* compiled from: PG */
public final class C117497ab extends C22939d implements C90234j {

    /* renamed from: a */
    public static final C59071e f326136a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.u.c.ab");

    /* renamed from: b */
    public final Context f326137b;

    /* renamed from: c */
    public final C117493i f326138c;

    /* renamed from: d */
    public final C117490f f326139d;

    /* renamed from: e */
    public final C22945j f326140e;

    /* renamed from: f */
    public final C90314b f326141f;

    /* renamed from: g */
    public final C90743b f326142g;

    /* renamed from: h */
    public C117496aa f326143h;

    /* renamed from: i */
    public TouchInterceptingFrameLayout f326144i;

    /* renamed from: j */
    public boolean f326145j;

    /* renamed from: k */
    boolean f326146k;

    /* renamed from: l */
    public C90315c f326147l;

    /* renamed from: m */
    public View f326148m;

    /* renamed from: n */
    public Rect f326149n;

    /* renamed from: o */
    public C90233i f326150o;

    /* renamed from: p */
    final C117502ag f326151p;

    /* renamed from: q */
    final C117502ag f326152q;

    /* renamed from: r */
    final C117502ag f326153r;

    /* renamed from: s */
    boolean f326154s;

    /* renamed from: t */
    private final int f326155t;

    /* renamed from: u */
    private int f326156u;

    public C117497ab(C22945j jVar, Context context, C117490f fVar, C117493i iVar, C90314b bVar, C90743b bVar2) {
        super(jVar);
        this.f326137b = context;
        this.f326139d = fVar;
        this.f326138c = iVar;
        this.f326140e = jVar;
        this.f326141f = bVar;
        this.f326142g = bVar2;
        this.f326151p = new C117502ag(C117494j.ANIMATE_FADE_OUT.f326130g, jVar);
        this.f326152q = new C117502ag(C117494j.ANIMATE_SLIDE_DOWN.f326130g, jVar);
        this.f326153r = new C117502ag(C117494j.ANIMATE_FADE_OUT_SLIDE_DOWN.f326130g, jVar);
        this.f326155t = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: j */
    private final void m195310j(C117494j jVar) {
        View view;
        View view2;
        if (mo103343e(jVar) != null) {
            this.f326146k = true;
            C117529z zVar = new C117529z(this);
            if (C117494j.ANIMATE_SLIDE_UP == jVar && (view2 = this.f326148m) != null) {
                view2.animate().translationY(0.0f).setDuration(225).setInterpolator(C117507d.f326185b).setListener(zVar);
                this.f326154s = true;
            } else if (C117494j.ANIMATE_SLIDE_DOWN == jVar && (view = this.f326148m) != null) {
                view.animate().translationY((float) this.f326148m.getHeight()).setDuration(195).setInterpolator(C117507d.f326184a).setListener(zVar);
                this.f326154s = false;
            }
        } else {
            ((C59052c) ((C59052c) f326136a.mo56226d()).mo56372aa(18285)).mo56386p("Bottom sheet child animation is null.");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: a */
    public final void mo83947a(int i) {
        C117496aa aaVar;
        if (!this.f326146k && (aaVar = this.f326143h) != null) {
            float f = aaVar.f326133a + ((float) i);
            aaVar.f326133a = f;
            if (f >= aaVar.f326135c && !aaVar.f326134b) {
                aaVar.f326134b = true;
                if (((Boolean) ((C23249a) this.f326138c.mo103333f()).mo28725a()).booleanValue()) {
                    this.f326139d.mo103316h();
                    return;
                }
            }
        }
        if (((Boolean) ((C23249a) this.f326138c.mo103334g()).mo28725a()).booleanValue() && !this.f326146k && this.f326148m != null) {
            if ((i > 0 && this.f326156u < 0) || (i < 0 && this.f326156u > 0)) {
                this.f326156u = 0;
            }
            int i2 = this.f326156u + i;
            this.f326156u = i2;
            if (Math.abs(i2) > this.f326155t) {
                if (this.f326154s) {
                    if (i > 0) {
                        m195310j(C117494j.ANIMATE_SLIDE_DOWN);
                    }
                } else if (i < 0) {
                    m195310j(C117494j.ANIMATE_SLIDE_UP);
                }
                this.f326156u = 0;
            }
        }
    }

    /* renamed from: e */
    public final C117507d mo103343e(C117494j jVar) {
        this.f326148m.getClass();
        C117494j jVar2 = C117494j.ANIMATE_FADE_IN;
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            return new C117507d(C117494j.ANIMATE_FADE_IN, this.f326148m);
        }
        if (ordinal == 2) {
            return new C117507d(C117494j.ANIMATE_SLIDE_UP, this.f326148m);
        }
        if (ordinal == 3) {
            return new C117507d(C117494j.ANIMATE_SLIDE_DOWN, this.f326148m);
        }
        if (ordinal == 4) {
            return new C117507d(C117494j.ANIMATE_FADE_IN_SLIDE_UP, this.f326148m);
        }
        ((C59052c) ((C59052c) f326136a.mo56225c()).mo56372aa(18283)).mo56389s("Unexpected transition in animation type %s", jVar.f326130g);
        return null;
    }

    /* renamed from: f */
    public final void mo103344f() {
        C89949q.m146521e(C28285c.m52882i(this.f326148m, 5, (Integer) null), false);
        this.f326139d.mo103317i(C117489e.TOUCH_INSIDE);
    }

    /* renamed from: g */
    public final void mo103345g() {
        Rect rect = this.f326149n;
        if (rect != null && ((C58833ax) ((C23249a) this.f326138c.mo103339l()).mo28725a()).mo56113h()) {
            C90229e eVar = (C90229e) ((C58833ax) ((C23249a) this.f326138c.mo103339l()).mo28725a()).mo56111f();
            if (eVar == null) {
                ((C59052c) ((C59052c) f326136a.mo56225c()).mo56372aa(18288)).mo56386p("Bottom sheet surface type is not set");
            } else if (C90229e.MINUS_ONE == eVar) {
                boolean g = C91115n.m148875g();
                int i = g ? rect.right : rect.left;
                int i2 = g ? rect.left : rect.right;
                TouchInterceptingFrameLayout touchInterceptingFrameLayout = this.f326144i;
                touchInterceptingFrameLayout.setPadding(i, touchInterceptingFrameLayout.getPaddingTop(), i2, this.f326144i.getPaddingBottom() + rect.bottom);
            } else if (C90229e.SEARCH_NOW == eVar) {
                TouchInterceptingFrameLayout touchInterceptingFrameLayout2 = this.f326144i;
                touchInterceptingFrameLayout2.setPadding(touchInterceptingFrameLayout2.getPaddingStart(), this.f326144i.getPaddingTop(), this.f326144i.getPaddingEnd(), this.f326144i.getPaddingBottom() + rect.bottom);
            }
        }
    }

    /* renamed from: h */
    public final void mo103346h(boolean z) {
        if (z) {
            this.f326144i.setBackgroundColor(this.f326137b.getResources().getColor(R.color.agsa_color_background_transparent_80));
        } else {
            this.f326144i.setBackgroundColor(this.f326137b.getResources().getColor(R.color.agsa_color_transparent));
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout) LayoutInflater.from(this.f326137b).inflate(R.layout.bottomsheet_on_monet, (ViewGroup) null);
        this.f326144i = touchInterceptingFrameLayout;
        touchInterceptingFrameLayout.setVisibility(0);
        mo28295iC(this.f326144i);
        C28295m.m52919e(this.f326144i, new C28292j(51977));
        C89949q.m146522f(this.f326144i);
        ChildStub childStub = (ChildStub) this.f326144i.findViewById(R.id.bottom_sheet_child);
        childStub.f63703a = 4;
        childStub.mo28716a();
        ((C23249a) this.f326138c.mo103336i()).mo28726b(new C117520q(this));
        ((C23219p) this.f326138c.mo103329b()).mo28685c(new C117527x(this, childStub));
        ((C23249a) this.f326138c.mo103332e()).mo28726b(new C117521r(this));
        TouchInterceptingFrameLayout touchInterceptingFrameLayout2 = this.f326144i;
        touchInterceptingFrameLayout2.f253398a = new C117522s(this);
        touchInterceptingFrameLayout2.setOnTouchListener(new C117528y(this));
        ((C23249a) this.f326138c.mo103339l()).mo28726b(new C117523t(this));
        C117524u uVar = new C117524u(this);
        this.f326147l = uVar;
        this.f326141f.mo83994a(uVar);
    }
}
