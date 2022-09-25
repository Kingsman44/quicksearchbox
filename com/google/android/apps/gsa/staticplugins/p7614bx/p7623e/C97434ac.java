package com.google.android.apps.gsa.staticplugins.p7614bx.p7623e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2107v;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.monet.p7116h.C90337f;
import com.google.android.apps.gsa.shared.p7129r.C90468j;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7615a.C97311a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7615a.C97312b;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97419a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97423d;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97424e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.EmbeddedAccountMenu;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.p2385d.C30940a;
import com.google.android.material.navigation.NavigationView;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.e.ac */
/* compiled from: PG */
public final class C97434ac extends C22939d {

    /* renamed from: a */
    public static final C59071e f272081a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bx.e.ac");

    /* renamed from: b */
    public final Context f272082b;

    /* renamed from: c */
    public final C97419a f272083c;

    /* renamed from: d */
    public final C58833ax f272084d;

    /* renamed from: e */
    public final C97424e f272085e;

    /* renamed from: f */
    public final SparseArray f272086f;

    /* renamed from: g */
    public final C97431a f272087g;

    /* renamed from: h */
    public final C90468j f272088h;

    /* renamed from: i */
    public final GmsheadAccountsModelUpdater f272089i;

    /* renamed from: j */
    public C30305n f272090j;

    /* renamed from: k */
    public EmbeddedAccountMenu f272091k;

    /* renamed from: l */
    public Menu f272092l;

    /* renamed from: m */
    public C0392m f272093m;

    /* renamed from: n */
    private final C90337f f272094n;

    /* renamed from: o */
    private final C90314b f272095o;

    /* renamed from: p */
    private final boolean f272096p;

    /* renamed from: q */
    private final C90324b f272097q;

    /* renamed from: r */
    private final C30282k f272098r = new C97432aa(this);

    /* renamed from: s */
    private C28293k f272099s;

    /* renamed from: t */
    private C90315c f272100t;

    public C97434ac(C22945j jVar, C58833ax axVar, C97424e eVar, C97419a aVar, Context context, C97312b bVar, C90314b bVar2, C97431a aVar2, C90468j jVar2, C90323a aVar3) {
        super(jVar);
        C97462z zVar = new C97462z(this);
        this.f272097q = zVar;
        this.f272084d = axVar;
        this.f272085e = eVar;
        this.f272083c = aVar;
        this.f272082b = new ContextThemeWrapper(context, R.style.agsa_one_google_menu);
        this.f272087g = aVar2;
        this.f272088h = jVar2;
        this.f272095o = bVar2;
        this.f272096p = true;
        this.f272094n = new C90337f(jVar, aVar3, zVar);
        this.f272086f = new SparseArray();
        C97311a a = bVar.mo90628a();
        this.f272090j = a.f271758a;
        this.f272089i = a.f271759b;
    }

    /* renamed from: f */
    public static void m161286f(String str, C30305n nVar) {
        if (str.isEmpty()) {
            nVar.mo35858i().f81934a.mo35796e((Object) null);
            return;
        }
        C58485gu b = nVar.mo35858i().f81934a.mo35794b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C30492e eVar = (C30492e) b.get(i);
            if (eVar.mo36114a().equals(str)) {
                nVar.mo35858i().f81934a.mo35796e(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo90715e(int i, C97423d dVar) {
        MenuItem findItem = this.f272092l.findItem(i);
        C97423d dVar2 = C97423d.ENABLED;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            findItem.setEnabled(true);
            findItem.setVisible(true);
            if (this.f272086f.get(i) != null) {
                ((C28292j) this.f272086f.get(i)).mo33794h(1);
            }
        } else if (ordinal == 1) {
            findItem.setEnabled(false);
            findItem.setVisible(true);
            if (this.f272086f.get(i) != null) {
                ((C28292j) this.f272086f.get(i)).mo33794h(1);
            }
        } else if (ordinal == 2) {
            findItem.setEnabled(false);
            findItem.setVisible(false);
            if (this.f272086f.get(i) != null) {
                ((C28292j) this.f272086f.get(i)).mo33794h(2);
            }
        }
    }

    /* renamed from: g */
    public final void mo90716g() {
        C89949q.m146521e(C28285c.m52875b(this.f272099s, 0), false);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f272094n.mo84024a();
        this.f272094n.f252288a.mo5790b(this.f272089i);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f272082b).inflate(R.layout.monet_menu, (ViewGroup) null);
        EmbeddedAccountMenu embeddedAccountMenu = (EmbeddedAccountMenu) viewGroup.findViewById(R.id.menu);
        this.f272091k = embeddedAccountMenu;
        embeddedAccountMenu.mo36415e(this.f272090j, new C97456t(this));
        this.f272091k.setBackground(new ColorDrawable(C1878d.m5128a(this.f272082b, R.color.agsa_color_surface)));
        Context context = this.f272082b;
        NavigationView navigationView = (NavigationView) LayoutInflater.from(!context.getTheme().resolveAttribute(R.attr.ogAccountMenuNavigationViewStyle, new TypedValue(), false) ? new ContextThemeWrapper(context, 2132149647) : context).inflate(R.layout.og_navigation_view, (ViewGroup) null);
        Context context2 = navigationView.getContext();
        int a = C30940a.m57735a(context2);
        int alpha = Color.alpha(a);
        int red = Color.red(a);
        int green = Color.green(a);
        int blue = Color.blue(a);
        double d = (double) alpha;
        Double.isNaN(d);
        int argb = Color.argb((int) (d * 0.12d), red, green, blue);
        Drawable drawable = ((LayerDrawable) context2.getResources().getDrawable(R.drawable.og_nav_item_selected_background, context2.getTheme())).getDrawable(0);
        C30905ae.m57696b(drawable, argb);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable});
        layerDrawable.setLayerInset(0, context2.getResources().getDimensionPixelSize(R.dimen.og_nav_menu_selected_item_background_padding_left), 0, context2.getResources().getDimensionPixelSize(R.dimen.og_nav_menu_selected_item_background_padding_right), 0);
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(C30940a.m57735a(context2)), (Drawable) null, layerDrawable);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, rippleDrawable);
        stateListDrawable.addState(new int[]{16842912}, layerDrawable);
        stateListDrawable.addState(new int[]{16842913}, layerDrawable);
        stateListDrawable.addState(new int[0], (Drawable) null);
        navigationView.f116874f.mo48019l(stateListDrawable);
        navigationView.f116874f.mo48018k(new View(context));
        RecyclerView recyclerView = (RecyclerView) navigationView.getChildAt(0);
        recyclerView.getScrollingChildHelper().mo5279a(false);
        recyclerView.setFocusableInTouchMode(false);
        navigationView.f116574a = null;
        navigationView.setId(R.id.menu_items);
        navigationView.mo48187b(R.menu.monet_menu_items);
        navigationView.f116875g = C97461y.f272161a;
        ChildStub childStub = new ChildStub(this.f272082b);
        childStub.setId(R.id.menu_promotions);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(this.f272082b.getResources().getDimensionPixelSize(R.dimen.menu_tip_margin), 0, this.f272082b.getResources().getDimensionPixelSize(R.dimen.menu_tip_margin), 0);
        childStub.setLayoutParams(marginLayoutParams);
        navigationView.f116874f.mo48018k(childStub);
        ((C23219p) this.f272085e.mo90676b()).mo28685c(new C97433ab(childStub));
        this.f272092l = navigationView.f116873e;
        this.f272091k.addView(navigationView, 0, new ViewGroup.LayoutParams(-1, -2));
        navigationView.f116875g = new C97445i(this);
        C28292j jVar = new C28292j(13163);
        this.f272086f.append(R.id.search_history, new C28292j(60858));
        this.f272086f.append(R.id.recents, new C28292j(35842));
        this.f272086f.append(R.id.updates, new C28292j(106930));
        this.f272086f.append(R.id.reminders, new C28292j(13164));
        this.f272086f.append(R.id.search_widget_customization, new C28292j(49747));
        this.f272086f.append(R.id.contributions, new C28292j(59303));
        this.f272086f.append(R.id.settings, new C28292j(13166));
        this.f272086f.append(R.id.your_data_in_search, new C28292j(61060));
        this.f272086f.append(R.id.hide_explicit_results, new C28292j(87190));
        this.f272086f.append(R.id.send_feedback, new C28292j(13167));
        this.f272086f.append(R.id.help, new C28292j(13168));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f272086f.size(); i++) {
            SparseArray sparseArray = this.f272086f;
            C28292j jVar2 = (C28292j) sparseArray.get(sparseArray.keyAt(i));
            jVar2.mo33795i(5);
            arrayList.add(C28293k.m52908e(jVar2, new C28293k[0]));
        }
        this.f272099s = C28293k.m52907d(jVar, arrayList);
        ((C23249a) this.f272085e.mo90684j()).mo28726b(new C97446j(this));
        ((C23249a) this.f272085e.mo90683i()).mo28726b(new C97447k(this));
        ((C23249a) this.f272085e.mo90682h()).mo28726b(new C97448l(this));
        ((C23249a) this.f272085e.mo90688n()).mo28726b(new C97449m(this));
        ((C23249a) this.f272085e.mo90685k()).mo28726b(new C97450n(this));
        ((C23249a) this.f272085e.mo90677c()).mo28726b(new C97451o(this));
        ((C23249a) this.f272085e.mo90689o()).mo28726b(new C97452p(this));
        ((C23249a) this.f272085e.mo90679e()).mo28726b(new C97457u(this));
        ((C23249a) this.f272085e.mo90678d()).mo28726b(new C97458v(this));
        ((C23249a) this.f272085e.mo90690p()).mo28726b(new C97459w(this));
        ((C23249a) this.f272085e.mo90687m()).mo28726b(new C97460x(this));
        this.f272090j.mo35858i().f81934a.f81880a.add(this.f272098r);
        Menu menu = this.f272092l;
        for (int i2 = 0; i2 < ((C0477q) menu).f1652c.size(); i2++) {
            MenuItem item = menu.getItem(i2);
            C2107v.m5811a(item, item.getTitle());
        }
        mo28295iC(viewGroup);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        ((C23249a) this.f272085e.mo90686l()).mo28726b(new C97453q(this));
        ((C23249a) this.f272085e.mo90681g()).mo28726b(new C97454r(this));
        mo90716g();
        if (this.f272096p) {
            C97455s sVar = new C97455s(this);
            this.f272100t = sVar;
            this.f272095o.mo83994a(sVar);
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        C30306o i = this.f272090j.mo35858i();
        i.f81934a.f81880a.remove(this.f272098r);
    }

    /* renamed from: im */
    public final void mo28298im() {
        if (this.f272096p) {
            C90314b bVar = this.f272095o;
            C90315c cVar = this.f272100t;
            cVar.getClass();
            bVar.mo83995b(cVar);
            this.f272100t = null;
        }
    }
}
