package com.google.android.apps.gsa.staticplugins.p7877dx.p7881d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90196b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90200f;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90201g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100297a;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100300d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69459x;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.d.n */
/* compiled from: PG */
public final class C100315n extends C22939d implements C90196b {

    /* renamed from: e */
    private static final C59071e f280509e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dx.d.n");

    /* renamed from: f */
    private static final C90201g f280510f;

    /* renamed from: g */
    private static final C90201g f280511g;

    /* renamed from: h */
    private static final C90201g f280512h;

    /* renamed from: i */
    private static final C90201g f280513i;

    /* renamed from: j */
    private static final C90201g f280514j;

    /* renamed from: k */
    private static final C90201g f280515k;

    /* renamed from: l */
    private static final C90201g f280516l;

    /* renamed from: m */
    private static final C90201g f280517m;

    /* renamed from: a */
    C90201g[] f280518a = new C90201g[0];

    /* renamed from: b */
    public final C100300d f280519b;

    /* renamed from: c */
    public final C100297a f280520c;

    /* renamed from: d */
    public boolean f280521d;

    /* renamed from: n */
    private final Context f280522n;

    /* renamed from: o */
    private final List f280523o = new ArrayList();

    /* renamed from: p */
    private final C90314b f280524p;

    /* renamed from: q */
    private int f280525q;

    /* renamed from: r */
    private ViewGroup f280526r;

    /* renamed from: s */
    private C90315c f280527s;

    /* renamed from: t */
    private final boolean f280528t;

    /* renamed from: u */
    private final boolean f280529u;

    static {
        C90200f fVar = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar = C90208n.SEARCH_TAB;
        fVar.copyOnWrite();
        C90201g gVar = (C90201g) fVar.instance;
        gVar.f251971b = nVar.f251999l;
        gVar.f251970a |= 1;
        fVar.copyOnWrite();
        C90201g gVar2 = (C90201g) fVar.instance;
        gVar2.f251970a |= 2;
        gVar2.f251972c = R.string.navigation_search_label;
        fVar.copyOnWrite();
        C90201g gVar3 = (C90201g) fVar.instance;
        gVar3.f251970a |= 4;
        gVar3.f251973d = R.drawable.googleapp_m2_search_tab;
        fVar.copyOnWrite();
        C90201g gVar4 = (C90201g) fVar.instance;
        gVar4.f251970a |= 8;
        gVar4.f251974e = 37026;
        f280510f = (C90201g) fVar.build();
        C90200f fVar2 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar2 = C90208n.TABS_TAB;
        fVar2.copyOnWrite();
        C90201g gVar5 = (C90201g) fVar2.instance;
        gVar5.f251971b = nVar2.f251999l;
        gVar5.f251970a |= 1;
        fVar2.copyOnWrite();
        C90201g gVar6 = (C90201g) fVar2.instance;
        gVar6.f251970a |= 2;
        gVar6.f251972c = R.string.navigation_tabs_label;
        fVar2.copyOnWrite();
        C90201g gVar7 = (C90201g) fVar2.instance;
        gVar7.f251970a |= 4;
        gVar7.f251973d = R.drawable.googleapp_m2_tabs_tab;
        fVar2.copyOnWrite();
        C90201g gVar8 = (C90201g) fVar2.instance;
        gVar8.f251970a |= 8;
        gVar8.f251974e = 106497;
        f280511g = (C90201g) fVar2.build();
        C90200f fVar3 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar3 = C90208n.INTERESTS_TAB;
        fVar3.copyOnWrite();
        C90201g gVar9 = (C90201g) fVar3.instance;
        gVar9.f251971b = nVar3.f251999l;
        gVar9.f251970a |= 1;
        fVar3.copyOnWrite();
        C90201g gVar10 = (C90201g) fVar3.instance;
        gVar10.f251970a |= 2;
        gVar10.f251972c = R.string.navigation_spark_label;
        fVar3.copyOnWrite();
        C90201g gVar11 = (C90201g) fVar3.instance;
        gVar11.f251970a |= 4;
        gVar11.f251973d = R.drawable.googleapp_m2_discover_tab;
        fVar3.copyOnWrite();
        C90201g gVar12 = (C90201g) fVar3.instance;
        gVar12.f251970a |= 8;
        gVar12.f251974e = 37024;
        f280512h = (C90201g) fVar3.build();
        C90200f fVar4 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar4 = C90208n.UPDATES_TAB;
        fVar4.copyOnWrite();
        C90201g gVar13 = (C90201g) fVar4.instance;
        gVar13.f251971b = nVar4.f251999l;
        gVar13.f251970a |= 1;
        fVar4.copyOnWrite();
        C90201g gVar14 = (C90201g) fVar4.instance;
        gVar14.f251970a |= 2;
        gVar14.f251972c = R.string.navigation_snapshot_label;
        fVar4.copyOnWrite();
        C90201g gVar15 = (C90201g) fVar4.instance;
        gVar15.f251970a |= 4;
        gVar15.f251973d = R.drawable.googleapp_m2_updates_tab;
        fVar4.copyOnWrite();
        C90201g gVar16 = (C90201g) fVar4.instance;
        gVar16.f251970a |= 8;
        gVar16.f251974e = 37025;
        f280513i = (C90201g) fVar4.build();
        C90200f fVar5 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar5 = C90208n.UPDATES_TAB;
        fVar5.copyOnWrite();
        C90201g gVar17 = (C90201g) fVar5.instance;
        gVar17.f251971b = nVar5.f251999l;
        gVar17.f251970a |= 1;
        fVar5.copyOnWrite();
        C90201g gVar18 = (C90201g) fVar5.instance;
        gVar18.f251970a |= 2;
        gVar18.f251972c = R.string.navigation_updates_label;
        fVar5.copyOnWrite();
        C90201g gVar19 = (C90201g) fVar5.instance;
        gVar19.f251970a |= 4;
        gVar19.f251973d = R.drawable.zero_state_gold_brick_v2;
        fVar5.copyOnWrite();
        C90201g gVar20 = (C90201g) fVar5.instance;
        gVar20.f251970a |= 8;
        gVar20.f251974e = 37025;
        f280514j = (C90201g) fVar5.build();
        C90200f fVar6 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar6 = C90208n.UPDATES_TAB;
        fVar6.copyOnWrite();
        C90201g gVar21 = (C90201g) fVar6.instance;
        gVar21.f251971b = nVar6.f251999l;
        gVar21.f251970a |= 1;
        fVar6.copyOnWrite();
        C90201g gVar22 = (C90201g) fVar6.instance;
        gVar22.f251970a |= 2;
        gVar22.f251972c = R.string.navigation_updates_label;
        fVar6.copyOnWrite();
        C90201g gVar23 = (C90201g) fVar6.instance;
        gVar23.f251970a |= 4;
        gVar23.f251973d = R.drawable.googleapp_m2_updates_tab;
        fVar6.copyOnWrite();
        C90201g gVar24 = (C90201g) fVar6.instance;
        gVar24.f251970a |= 8;
        gVar24.f251974e = 37025;
        f280515k = (C90201g) fVar6.build();
        C90200f fVar7 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar7 = C90208n.DRAWER_TAB;
        fVar7.copyOnWrite();
        C90201g gVar25 = (C90201g) fVar7.instance;
        gVar25.f251971b = nVar7.f251999l;
        gVar25.f251970a |= 1;
        fVar7.copyOnWrite();
        C90201g gVar26 = (C90201g) fVar7.instance;
        gVar26.f251970a |= 2;
        gVar26.f251972c = R.string.navigation_drawer_label;
        fVar7.copyOnWrite();
        C90201g gVar27 = (C90201g) fVar7.instance;
        gVar27.f251970a |= 4;
        gVar27.f251973d = R.drawable.googleapp_m2_drawer_tab;
        fVar7.copyOnWrite();
        C90201g gVar28 = (C90201g) fVar7.instance;
        gVar28.f251970a |= 8;
        gVar28.f251974e = 42539;
        f280516l = (C90201g) fVar7.build();
        C90200f fVar8 = (C90200f) C90201g.f251968f.createBuilder();
        C90208n nVar8 = C90208n.COLLECTIONS_TAB;
        fVar8.copyOnWrite();
        C90201g gVar29 = (C90201g) fVar8.instance;
        gVar29.f251971b = nVar8.f251999l;
        gVar29.f251970a |= 1;
        fVar8.copyOnWrite();
        C90201g gVar30 = (C90201g) fVar8.instance;
        gVar30.f251970a |= 2;
        gVar30.f251972c = R.string.navigation_collections_label;
        fVar8.copyOnWrite();
        C90201g gVar31 = (C90201g) fVar8.instance;
        gVar31.f251970a |= 4;
        gVar31.f251973d = R.drawable.googleapp_m2_collections_tab;
        fVar8.copyOnWrite();
        C90201g gVar32 = (C90201g) fVar8.instance;
        gVar32.f251970a |= 8;
        gVar32.f251974e = 48930;
        f280517m = (C90201g) fVar8.build();
    }

    public C100315n(C22945j jVar, C100300d dVar, C100297a aVar, Context context, C90314b bVar, C91142g gVar) {
        super(jVar);
        this.f280519b = dVar;
        this.f280520c = aVar;
        this.f280524p = bVar;
        this.f280528t = true;
        this.f280529u = gVar.mo85405j(C90080ee.f249813l);
        this.f280522n = context;
        this.f280525q = context.getResources().getDimensionPixelSize(R.dimen.googleapp_bottom_navigation_destination_height_m2);
    }

    /* renamed from: k */
    static final C90201g m166269k(View view) {
        Object tag = view.getTag(R.id.googleapp_tab_description);
        if (tag instanceof C90201g) {
            return (C90201g) tag;
        }
        ((C59052c) ((C59052c) f280509e.mo56225c()).mo56372aa(33303)).mo56386p("Unable to find TabDescription for view");
        return null;
    }

    /* renamed from: l */
    private final void m166270l(TextView textView, ImageView imageView, boolean z) {
        int i = z ? 2132150335 : 2132150334;
        if (z) {
            imageView.setColorFilter(C1878d.m5128a(this.f280522n, R.color.agsa_color_primary));
        } else {
            imageView.setColorFilter(C1878d.m5128a(this.f280522n, R.color.agsa_color_on_surface_variant));
        }
        textView.setTextAppearance(i);
    }

    /* renamed from: a */
    public final int mo83937a() {
        return this.f280525q;
    }

    /* renamed from: b */
    public final void mo83938b(int i) {
        ViewGroup e = mo91873e();
        e.setPadding(e.getPaddingLeft(), e.getPaddingTop(), e.getPaddingRight(), i);
    }

    /* renamed from: c */
    public final void mo83939c(C90208n nVar) {
        for (View view : this.f280523o) {
            C90201g k = m166269k(view);
            if (k != null) {
                C90208n a = C90208n.m146767a(k.f251971b);
                if (a == null) {
                    a = C90208n.UNKNOWN_TAB;
                }
                boolean z = a == nVar;
                view.setSelected(z);
                m166270l((TextView) view.findViewById(R.id.googleapp_navigation_bar_destination_label), (ImageView) view.findViewById(R.id.googleapp_navigation_bar_destination_icon), z);
            }
        }
        this.f280520c.mo91868h(nVar);
    }

    /* renamed from: g */
    public final void mo91874g(C58833ax axVar) {
        C69459x xVar;
        if (axVar.mo56113h()) {
            C69396ar arVar = (C69396ar) axVar.mo56107c();
            if (arVar.f185680a == 7) {
                xVar = (C69459x) arVar.f185681b;
            } else {
                xVar = C69459x.f185869c;
            }
            C90208n a = C90208n.m146767a(xVar.f185871a);
            if (a == null) {
                a = C90208n.UNKNOWN_TAB;
            }
            View j = mo91876j(a);
            if (j != null) {
                C69421bp bpVar = ((C69396ar) axVar.mo56107c()).f185682c;
                if (bpVar == null) {
                    bpVar = C69421bp.f185742q;
                }
                if (!bpVar.f185749f) {
                    j.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo91875h() {
        for (View view : this.f280523o) {
            C90201g k = m166269k(view);
            if (k != null) {
                C90208n a = C90208n.m146767a(k.f251971b);
                if (a == null) {
                    a = C90208n.UNKNOWN_TAB;
                }
                boolean z = a == ((C58833ax) ((C23249a) this.f280519b.mo91858c()).mo28725a()).mo56107c();
                view.setSelected(z);
                m166270l((TextView) view.findViewById(R.id.googleapp_navigation_bar_destination_label), (ImageView) view.findViewById(R.id.googleapp_navigation_bar_destination_icon), z);
            }
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f280522n).inflate(R.layout.googleapp_navigation_bar, (ViewGroup) null);
        C28295m.m52919e(viewGroup.findViewById(R.id.googleapp_bottom_navigation_destinations), new C28292j(39081));
        this.f280526r = (ViewGroup) viewGroup.findViewById(R.id.googleapp_navigation_bar);
        mo28295iC(viewGroup);
        ((C23249a) this.f280519b.mo91858c()).mo28726b(new C100308g(this));
        ((C23249a) this.f280519b.mo91860e()).mo28726b(new C100309h(this));
        ((C23219p) this.f280519b.mo91857b()).mo28685c(new C23243a(R.id.googleapp_drawer_child, viewGroup));
        ((C23249a) this.f280519b.mo91861f()).mo28726b(new C100310i(this));
        ((C23249a) this.f280519b.mo91863h()).mo28726b(new C100311j(this));
        ((C23249a) this.f280519b.mo91859d()).mo28726b(new C100312k(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C90201g gVar;
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = (C58485gu) ((C23249a) this.f280519b.mo91862g()).mo28725a();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C90208n nVar = (C90208n) guVar.get(i);
            C90208n nVar2 = C90208n.UNKNOWN_TAB;
            int ordinal = nVar.ordinal();
            if (ordinal == 1) {
                gVar = f280512h;
            } else if (ordinal == 2) {
                gVar = this.f280529u ? f280513i : this.f280521d ? f280514j : f280515k;
            } else if (ordinal == 4) {
                gVar = f280510f;
            } else if (ordinal == 10) {
                gVar = f280511g;
            } else if (ordinal == 6) {
                gVar = f280516l;
            } else if (ordinal == 7) {
                gVar = f280517m;
            } else {
                throw new IllegalArgumentException("No TabDescription for TabNavigationTabType ".concat(String.valueOf(nVar.name())));
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        this.f280518a = (C90201g[]) arrayList.toArray(new C90201g[arrayList.size()]);
        ViewGroup viewGroup = this.f280526r;
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(this.f280522n);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.googleapp_bottom_navigation_destinations);
            linearLayout.removeAllViews();
            C100307f fVar = new C100307f(this);
            this.f280523o.clear();
            for (C90201g gVar2 : this.f280518a) {
                View inflate = from.inflate(R.layout.googleapp_navigation_bar_destination, linearLayout, false);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.googleapp_navigation_bar_destination_icon);
                TextView textView = (TextView) inflate.findViewById(R.id.googleapp_navigation_bar_destination_label);
                textView.setText(this.f280522n.getResources().getText(gVar2.f251972c));
                textView.setVisibility(0);
                this.f280523o.add(inflate);
                inflate.setTag(R.id.googleapp_tab_description, gVar2);
                C90208n a = C90208n.m146767a(gVar2.f251971b);
                if (a == null) {
                    a = C90208n.UNKNOWN_TAB;
                }
                inflate.setTag(a);
                C89941l.m146512c(inflate, gVar2.f251974e);
                inflate.setOnClickListener(new C89943l(fVar));
                inflate.setContentDescription(this.f280522n.getResources().getText(gVar2.f251972c));
                inflate.setAccessibilityDelegate(new C100314m());
                imageView.setImageResource(gVar2.f251973d);
                linearLayout.addView(inflate);
                int i2 = gVar2.f251971b;
            }
            mo91875h();
            if (((Boolean) ((C23249a) this.f280519b.mo91860e()).mo28725a()).booleanValue()) {
                this.f280525q = this.f280522n.getResources().getDimensionPixelSize(R.dimen.googleapp_bottom_navigation_destination_height_opa);
            }
            for (View layoutParams : this.f280523o) {
                layoutParams.getLayoutParams().height = this.f280525q;
            }
            mo91874g((C58833ax) ((C23249a) this.f280519b.mo91859d()).mo28725a());
            C89949q.m146522f(linearLayout);
        }
        if (this.f280528t) {
            C100313l lVar = new C100313l(this);
            this.f280527s = lVar;
            this.f280524p.mo83994a(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final View mo91876j(C90208n nVar) {
        for (View view : this.f280523o) {
            C90201g k = m166269k(view);
            if (k != null) {
                C90208n a = C90208n.m146767a(k.f251971b);
                if (a == null) {
                    a = C90208n.UNKNOWN_TAB;
                }
                if (a == nVar) {
                    return view.findViewById(R.id.googleapp_promotion_indicator);
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C100306e.f280501a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final ViewGroup mo91873e() {
        ViewGroup viewGroup = this.f280526r;
        viewGroup.getClass();
        return (ViewGroup) viewGroup.findViewById(R.id.googleapp_bottom_navigation_destinations);
    }

    /* renamed from: im */
    public final void mo28298im() {
        if (this.f280528t) {
            C90314b bVar = this.f280524p;
            C90315c cVar = this.f280527s;
            cVar.getClass();
            bVar.mo83995b(cVar);
            this.f280527s = null;
        }
    }
}
