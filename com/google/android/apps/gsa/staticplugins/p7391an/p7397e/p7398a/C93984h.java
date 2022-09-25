package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.support.p033v7.app.C0395p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90246a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7092k.C90250a;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7113e.C90321e;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105481ai;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.C93968a;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.p7396a.C93969a;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C93976a;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94003b;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94006e;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94009h;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94010i;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94015n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23301q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68221g;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.h */
/* compiled from: PG */
public final class C93984h extends C22939d implements C90246a, C90250a, C23301q {

    /* renamed from: k */
    private static final C59071e f262454k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.e.a.h");

    /* renamed from: a */
    public final C93969a f262455a;

    /* renamed from: b */
    public final C93968a f262456b;

    /* renamed from: c */
    public final Context f262457c;

    /* renamed from: d */
    public final C94015n f262458d;

    /* renamed from: e */
    public C93983g f262459e;

    /* renamed from: f */
    public boolean f262460f;

    /* renamed from: g */
    public Rect f262461g = new Rect();

    /* renamed from: h */
    public boolean f262462h;

    /* renamed from: i */
    public boolean f262463i;

    /* renamed from: j */
    public C105481ai f262464j;

    /* renamed from: l */
    private final C90314b f262465l;

    /* renamed from: m */
    private final C90320d f262466m;

    /* renamed from: n */
    private final boolean f262467n;

    /* renamed from: o */
    private final boolean f262468o;

    /* renamed from: p */
    private final C86124t f262469p;

    /* renamed from: q */
    private C90315c f262470q;

    /* renamed from: r */
    private ViewGroup f262471r;

    /* renamed from: s */
    private ViewGroup f262472s;

    /* renamed from: t */
    private ImageView f262473t;

    /* renamed from: u */
    private boolean f262474u;

    /* renamed from: v */
    private boolean f262475v = true;

    /* renamed from: w */
    private C90321e f262476w;

    /* renamed from: x */
    private volatile boolean f262477x;

    public C93984h(C22945j jVar, C93969a aVar, C93968a aVar2, Context context, C90314b bVar, C90320d dVar, C94015n nVar, C91142g gVar, C58833ax axVar, C86124t tVar) {
        super(jVar);
        this.f262455a = aVar;
        this.f262456b = aVar2;
        this.f262457c = context;
        this.f262465l = bVar;
        this.f262466m = dVar;
        this.f262458d = nVar;
        boolean z = false;
        if (axVar.mo56113h() && (axVar.mo56107c() instanceof C0395p)) {
            z = true;
        }
        this.f262467n = z;
        this.f262463i = true;
        this.f262468o = gVar.mo85405j(C90080ee.f249813l);
        this.f262469p = tVar;
    }

    /* renamed from: t */
    private final int m155093t() {
        if (((Boolean) ((C23249a) this.f262455a.mo88236c()).mo28725a()).booleanValue()) {
            return C90686c.m148055a(this.f262457c, 4);
        }
        Context context = this.f262457c;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int c = C90686c.m148057c(context, i, false, 4);
        return i - (c + c);
    }

    /* renamed from: a */
    public final int mo83953a() {
        return this.f262457c.getResources().getDimensionPixelSize(true != ((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue() ? R.dimen.now_header_doodle_button_size : R.dimen.rounded_doodle_button_size);
    }

    /* renamed from: b */
    public final int mo83954b() {
        return this.f262458d.f262598g;
    }

    /* renamed from: c */
    public final int mo83955c() {
        if (((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue()) {
            return this.f262457c.getResources().getDimensionPixelSize(R.dimen.rounded_doodle_vertical_margin);
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo83956d(boolean z) {
        if (this.f262474u != z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f262474u = z;
            C94015n nVar = this.f262458d;
            nVar.f262611t = z;
            if (!z) {
                Runnable runnable = nVar.f262612u;
                if (runnable != null) {
                    runnable.run();
                    nVar.f262612u = null;
                }
                mo88264q((C58833ax) ((C23249a) this.f262455a.mo88238e()).mo28725a());
            }
        }
    }

    /* renamed from: f */
    public final boolean mo83958f() {
        return this.f262462h;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (!this.f262477x) {
                C59104x d = f262454k.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FeedDoodleHeaderRndr");
                ((C59052c) ((C59052c) d).mo56372aa(19393)).mo56389s("finalize() without destroy() %s", Integer.toHexString(System.identityHashCode(this)));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo83959g(C105481ai aiVar) {
        this.f262464j = aiVar;
    }

    /* renamed from: h */
    public final int mo83960h() {
        return this.f262471r.getLayoutParams().height - this.f262461g.top;
    }

    /* renamed from: i */
    public final int mo83968i() {
        return this.f262472s.getLayoutParams().height;
    }

    /* renamed from: im */
    public final void mo28298im() {
        C58976aa aaVar = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(this));
        C90314b bVar = this.f262465l;
        C90315c cVar = this.f262470q;
        cVar.getClass();
        bVar.mo83995b(cVar);
        this.f262470q = null;
        this.f262466m.mo84001b(this.f262476w);
        this.f262458d.mo88294e();
        if (this.f262469p.mo79746e(C89972ak.f246537L)) {
            this.f262456b.mo88253i();
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(this));
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f262457c).inflate(R.layout.now_doodle_themed_header, (ViewGroup) null);
        mo28295iC(viewGroup);
        C94015n nVar = this.f262458d;
        nVar.f262601j = false;
        nVar.f262614w = new C93981e(this);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.doodle_container);
        this.f262471r = viewGroup2;
        viewGroup2.addView(this.f262458d.mo88290a());
        this.f262472s = (ViewGroup) viewGroup.findViewById(R.id.header);
        View findViewById = viewGroup.findViewById(R.id.now_title_bar);
        if (this.f262468o && (findViewById instanceof TextView)) {
            ((TextView) findViewById).setText(R.string.assistant_snapshot);
        }
        ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.google_logo);
        this.f262473t = imageView;
        C28295m.m52919e(imageView, new C28292j(53));
        C94015n nVar2 = this.f262458d;
        nVar2.f262594c = this.f262473t;
        nVar2.f262609r = false;
        View findViewById2 = viewGroup.findViewById(R.id.logo_and_doodle_container);
        C28295m.m52919e(findViewById2, new C28292j(20990));
        C94015n nVar3 = this.f262458d;
        nVar3.f262595d = findViewById2;
        C93979c cVar = new C93979c(this);
        nVar3.f262599h = cVar;
        nVar3.f262592a.setOnClickListener(cVar);
        this.f262476w = new C93982f(this);
        ((C23249a) this.f262455a.mo88238e()).mo28726b(new C93980d(this));
        if (this.f262467n) {
            this.f262459e = new C93983g(this, viewGroup);
            ((C23219p) this.f262455a.mo88235b()).mo28685c(this.f262459e);
        }
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C58976aa aaVar = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(this));
        this.f262458d.f262606o = true != ((Boolean) ((C23249a) this.f262455a.mo88237d()).mo28725a()).booleanValue() ? 300 : 0;
        if (((Boolean) ((C23249a) this.f262455a.mo88240g()).mo28725a()).booleanValue()) {
            this.f262473t.setVisibility(8);
        } else {
            this.f262473t.setImageDrawable(this.f262457c.getResources().getDrawable(R.drawable.logo_daynight));
            this.f262473t.setVisibility(0);
        }
        this.f262458d.f262605n = m155093t();
        this.f262458d.f262602k = ((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue();
        this.f262458d.f262603l = ((Boolean) ((C23249a) this.f262455a.mo88241h()).mo28725a()).booleanValue();
        this.f262458d.f262604m = ((Boolean) ((C23249a) this.f262455a.mo88243j()).mo28725a()).booleanValue();
        this.f262458d.f262613v = ((Boolean) ((C23249a) this.f262455a.mo88242i()).mo28725a()).booleanValue();
        mo88265r();
        C93977a aVar = new C93977a(this);
        this.f262470q = aVar;
        this.f262465l.mo83994a(aVar);
        this.f262466m.mo84000a(this.f262476w);
        Integer.toHexString(System.identityHashCode(this));
        mo88264q((C58833ax) ((C23249a) this.f262455a.mo88238e()).mo28725a());
        if (!this.f262460f) {
            this.f262458d.mo88295f();
        }
        this.f262456b.mo88251f(this.f262462h);
    }

    /* renamed from: j */
    public final int mo88259j() {
        if (((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue()) {
            return 0;
        }
        return this.f262457c.getResources().getDimensionPixelSize(R.dimen.now_header_doodle_gradient_height);
    }

    /* renamed from: js */
    public final void mo28301js() {
        C58976aa aaVar = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(this));
        C94015n nVar = this.f262458d;
        nVar.f262614w = null;
        nVar.mo88292c();
        this.f262477x = true;
    }

    /* renamed from: k */
    public final int mo88260k() {
        return this.f262457c.getResources().getDimensionPixelSize(true != ((Boolean) ((C23249a) this.f262455a.mo88244k()).mo28725a()).booleanValue() ? R.dimen.now_header_google_logo_bottom_margin_resized_small : R.dimen.now_header_google_logo_bottom_margin_resized_mini);
    }

    /* renamed from: l */
    public final int mo88261l() {
        return this.f262457c.getResources().getDimensionPixelSize(true != ((Boolean) ((C23249a) this.f262455a.mo88244k()).mo28725a()).booleanValue() ? R.dimen.now_header_google_logo_height_resized_small : R.dimen.now_header_google_logo_height_resized_mini);
    }

    /* renamed from: m */
    public final int mo88262m() {
        Resources resources = this.f262457c.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(true != ((Boolean) ((C23249a) this.f262455a.mo88244k()).mo28725a()).booleanValue() ? R.dimen.now_header_height_resized_small : R.dimen.now_header_height_resized_mini);
        if (((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue()) {
            return resources.getDimensionPixelSize(R.dimen.rounded_doodle_max_image_height);
        }
        return (dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.search_bg_9_baked_margin)) - resources.getDimensionPixelSize(R.dimen.text_search_plate_height);
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return new C93978b(this);
    }

    /* renamed from: p */
    public final void mo88263p() {
        if (this.f262460f || !this.f262475v) {
            this.f262458d.mo88294e();
        } else {
            this.f262458d.mo88295f();
        }
    }

    /* renamed from: q */
    public final void mo88264q(C58833ax axVar) {
        int i;
        if (this.f262470q == null || this.f262474u) {
            return;
        }
        if (axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            axVar.mo56107c();
            Integer.toHexString(System.identityHashCode(this));
            if (((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue()) {
                i = this.f262457c.getResources().getDimensionPixelSize(R.dimen.rounded_doodle_max_image_width);
            } else {
                i = m155093t();
            }
            Point point = new Point(i, mo88262m());
            C94015n nVar = this.f262458d;
            DoodleData doodleData = (DoodleData) axVar.mo56107c();
            if (!nVar.mo88296g(doodleData)) {
                nVar.f262612u = null;
                C94009h hVar = nVar.f262596e;
                if (hVar != null) {
                    hVar.mo88281d();
                    nVar.f262596e = null;
                    nVar.mo88297h(nVar.f262594c, nVar.f262597f);
                }
                C94010i iVar = nVar.f262593b;
                Rect rect = nVar.f262600i;
                int i2 = nVar.f262605n;
                boolean z = nVar.f262602k;
                boolean z2 = nVar.f262604m;
                boolean z3 = nVar.f262613v;
                doodleData.getClass();
                rect.getClass();
                Context context = (Context) ((C68221g) iVar.f262581a).f184583a;
                context.getClass();
                C91189au auVar = (C91189au) ((C68221g) iVar.f262582b).f184583a;
                auVar.getClass();
                C22871g gVar = (C22871g) iVar.f262583c.mo17428b();
                gVar.getClass();
                C22871g gVar2 = (C22871g) iVar.f262584d.mo17428b();
                gVar2.getClass();
                nVar.f262596e = new C94009h(doodleData, nVar, rect, point, i2, z, z2, z3, context, auVar, gVar, gVar2);
                if (nVar.f262610s) {
                    nVar.f262596e.mo88283f();
                }
                C94009h hVar2 = nVar.f262596e;
                if (!hVar2.f262573p) {
                    DoodleData doodleData2 = hVar2.f262559b;
                    boolean z4 = true;
                    if (!doodleData2.f252958x && !hVar2.f262566i) {
                        z4 = false;
                    }
                    if (!doodleData2.mo84530a(hVar2.f262561d, !z4, hVar2.f262566i)) {
                        hVar2.mo88282e();
                        return;
                    }
                    if (z4) {
                        hVar2.f262567j = hVar2.f262565h.mo28209i(hVar2.f262562e.mo85425m(Uri.parse(hVar2.f262566i ? hVar2.f262559b.f252923D : hVar2.f262559b.f252943i), C58836b.f156633a, 26), "decode doodle GIF", new C93976a());
                    } else {
                        hVar2.f262567j = hVar2.f262565h.mo28201a("decode doodle GIF", new C94003b(hVar2));
                    }
                    hVar2.f262564g.mo28211k(hVar2.f262567j, "display doodle GIF", new C94006e(hVar2));
                    return;
                }
                return;
            }
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(this));
        this.f262458d.mo88291b();
    }

    /* renamed from: r */
    public final void mo88265r() {
        int i;
        int i2;
        Resources resources = this.f262472s.getResources();
        int m = mo88262m();
        int j = mo88259j();
        int c = mo83955c();
        int i3 = m + j + c + c;
        if (((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue()) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.rounded_doodle_vertical_padding);
            i2 = i3 + dimensionPixelSize + dimensionPixelSize;
            i = i2;
        } else {
            i = i3;
            i2 = resources.getDimensionPixelSize(true != ((Boolean) ((C23249a) this.f262455a.mo88244k()).mo28725a()).booleanValue() ? R.dimen.now_header_height_resized_small : R.dimen.now_header_height_resized_mini);
        }
        int i4 = i2 + this.f262461g.top;
        int i5 = i + this.f262461g.top;
        ViewGroup.LayoutParams layoutParams = this.f262472s.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, 0);
        }
        if (layoutParams.height != i4) {
            layoutParams.height = i4;
            this.f262472s.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f262471r.getLayoutParams();
        if (layoutParams2.height != i5) {
            layoutParams2.height = i5;
            this.f262471r.setLayoutParams(layoutParams2);
        }
        int l = mo88261l();
        int k = mo88260k();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f262473t.getLayoutParams();
        if (!(marginLayoutParams.height == l && marginLayoutParams.bottomMargin == k)) {
            marginLayoutParams.height = l;
            marginLayoutParams.bottomMargin = k;
            this.f262473t.setLayoutParams(marginLayoutParams);
        }
        if (this.f262463i) {
            this.f262473t.setPadding(this.f262461g.left, 0, this.f262461g.right, 0);
        }
        if (!((Boolean) ((C23249a) this.f262455a.mo88239f()).mo28725a()).booleanValue()) {
            mo28297il().setPadding(0, 0, 0, resources.getDimensionPixelSize(R.dimen.now_header_height_bottom_padding));
        }
    }

    /* renamed from: s */
    public final boolean mo28805s() {
        C58976aa aaVar = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(this));
        return true;
    }

    /* renamed from: e */
    public final void mo83957e(boolean z) {
        if (this.f262475v != z) {
            this.f262475v = z;
            C94015n nVar = this.f262458d;
            if (nVar.f262607p != z) {
                nVar.f262607p = z;
                if (z && nVar.f262608q) {
                    nVar.mo88293d();
                }
            }
            mo88263p();
        }
    }
}
