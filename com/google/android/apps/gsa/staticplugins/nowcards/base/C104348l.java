package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83423l;
import com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub;
import com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91668g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91925a;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91934j;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91935k;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91937m;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.sidekick.shared.util.C91958ai;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104424aa;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104428ae;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104429af;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104435al;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104441d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104456s;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104460w;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8115f.C104852a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.C104993a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105064a;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.apps.p489g.p494d.C9200ci;
import com.google.android.apps.p489g.p494d.C9201cj;
import com.google.android.apps.p489g.p494d.C9275s;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58880cq;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7691gj;
import com.google.p375ai.p378b.C7693gl;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7848me;
import com.google.p375ai.p378b.C7851mh;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62921ba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5451f.p5452a.p5453a.p5454a.C69399au;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.l */
/* compiled from: PG */
public abstract class C104348l implements View.OnAttachStateChangeListener, C91668g {

    /* renamed from: A */
    private static final C58528ij f290296A;

    /* renamed from: B */
    private static final C9278v f290297B = C9278v.f32165Z;

    /* renamed from: a */
    public static final C58495hd f290298a;

    /* renamed from: y */
    private static final C59071e f290299y = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.l");

    /* renamed from: z */
    private static final C58485gu f290300z = C58485gu.m89845m();

    /* renamed from: C */
    private int f290301C = -1;

    /* renamed from: D */
    private int f290302D = -1;

    /* renamed from: E */
    private C83423l f290303E;

    /* renamed from: F */
    private boolean f290304F;

    /* renamed from: G */
    private final Map f290305G = new HashMap();

    /* renamed from: H */
    private final List f290306H = new ArrayList();

    /* renamed from: b */
    public final Context f290307b;

    /* renamed from: c */
    public final C91940p f290308c;

    /* renamed from: d */
    public C91671j f290309d;

    /* renamed from: e */
    public C9278v f290310e = f290297B;

    /* renamed from: f */
    public View f290311f;

    /* renamed from: g */
    public final Map f290312g;

    /* renamed from: h */
    public String f290313h;

    /* renamed from: i */
    public final C104350n f290314i;

    /* renamed from: j */
    public C83423l f290315j;

    /* renamed from: k */
    public C91857e f290316k;

    /* renamed from: l */
    public C58881cr f290317l;

    /* renamed from: m */
    public boolean f290318m;

    /* renamed from: n */
    public C104429af f290319n;

    /* renamed from: o */
    public C104456s f290320o;

    /* renamed from: p */
    public C104435al f290321p;

    /* renamed from: q */
    public C104441d f290322q;

    /* renamed from: r */
    public C104460w f290323r;

    /* renamed from: s */
    public C104428ae f290324s;

    /* renamed from: t */
    public C104424aa f290325t;

    /* renamed from: u */
    public final Map f290326u = new HashMap();

    /* renamed from: v */
    public final SparseArray f290327v = new SparseArray();

    /* renamed from: w */
    public final Map f290328w = new HashMap();

    /* renamed from: x */
    public final GradientDrawable f290329x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-434036447, 1291845632, 0});

    static {
        C58495hd p = C58495hd.m89902p(C69399au.SNOWMAN, new C58759qy(C9140ac.CARD_MENU_OPEN), C69399au.REACTION, C58528ij.m90011K(C9140ac.FEED_REACTION_FROM_SET, C9140ac.FEED_REACTION_FROM_DEFAULT), C69399au.PLAY_VIDEO, new C58759qy(C9140ac.PLAY_VIDEO_ACTION));
        f290298a = p;
        C58471gg g = p.values();
        C58526ih ihVar = new C58526ih();
        C58800sl lA = g.iterator();
        while (lA.hasNext()) {
            ihVar.mo55489i((C58528ij) lA.next());
        }
        f290296A = ihVar.mo55486f();
    }

    public C104348l(Context context, C104350n nVar) {
        this.f290307b = context;
        this.f290314i = nVar;
        this.f290308c = new C91940p(context, nVar.f290334d, ((Boolean) nVar.f290339i.mo6453a()).booleanValue());
        if (nVar.f290335e) {
            this.f290303E = new C104342f(this);
        }
        this.f290312g = new HashMap();
    }

    /* renamed from: L */
    private static void m172488L(int i, View view) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: M */
    private final void mo94398M() {
        ImageView imageView = (ImageView) this.f290311f.findViewById(R.id.android_for_work_icon);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: N */
    private static void m172490N(int i, View view) {
        View findViewById = view.findViewById(i);
        if (findViewById instanceof RecyclerViewStub) {
            ((RecyclerViewStub) findViewById).mo76715b();
        }
    }

    /* renamed from: O */
    private static void m172491O(C9201cj cjVar, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if ((cjVar.f31775a & 256) != 0) {
                i = cjVar.f31786l;
            } else {
                i = marginLayoutParams.leftMargin;
            }
            if ((cjVar.f31775a & 64) != 0) {
                i2 = cjVar.f31784j;
            } else {
                i2 = marginLayoutParams.topMargin;
            }
            if ((cjVar.f31775a & 512) != 0) {
                i3 = cjVar.f31787m;
            } else {
                i3 = marginLayoutParams.rightMargin;
            }
            if ((cjVar.f31775a & 128) != 0) {
                i4 = cjVar.f31785k;
            } else {
                i4 = marginLayoutParams.bottomMargin;
            }
            C91115n.m148873e(marginLayoutParams, i, i2, i3, i4);
        }
    }

    /* renamed from: P */
    private final boolean m172492P(int i) {
        return this.f290314i.f290335e && (i & 16777215) == (16777215 & this.f290307b.getResources().getColor(R.color.card_background_for_comparison));
    }

    /* renamed from: A */
    public final void mo94102A(boolean z) {
        LayerDrawable layerDrawable;
        Drawable drawable;
        int i;
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & 16777216) == 0 || m172492P(vVar.f32167A)) {
            C9278v vVar2 = this.f290310e;
            layerDrawable = ((vVar2.f32192a & 33554432) == 0 || m172492P(vVar2.f32168B)) ? null : mo94118l(this.f290310e.f32168B);
        } else {
            layerDrawable = mo94118l(this.f290310e.f32167A);
            this.f290311f.setTag(R.id.module_color, Integer.valueOf(this.f290310e.f32167A));
        }
        C9278v vVar3 = this.f290310e;
        if ((vVar3.f32192a & 67108864) != 0 && z) {
            if ((vVar3.f32195b & 2048) != 0) {
                C105064a aVar = this.f290314i.f290348r;
                int a = C7693gl.m22807a(vVar3.f32184R);
                if (a == 0) {
                    a = 1;
                }
                int a2 = C7691gj.m22806a(vVar3.f32186T);
                if (a2 == 0) {
                    a2 = 1;
                }
                drawable = aVar.mo94505a(a, a2);
            } else {
                C105064a aVar2 = this.f290314i.f290348r;
                int a3 = C7693gl.m22807a(vVar3.f32184R);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a3 == 5) {
                    a3 = 5;
                    i = 2;
                } else {
                    i = 3;
                }
                drawable = aVar2.mo94505a(a3, i);
            }
            layerDrawable = layerDrawable != null ? new LayerDrawable(new Drawable[]{layerDrawable, drawable}) : drawable;
        }
        mo94125r(this.f290311f, layerDrawable);
    }

    /* renamed from: B */
    public final void mo94103B(View view, C9141ad adVar) {
        C7718hj hjVar = this.f290310e.f32174H;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        mo94104C(view, adVar, hjVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo94104C(View view, C9141ad adVar, C7718hj hjVar) {
        C9141ad adVar2;
        View view2;
        View view3 = view;
        C9141ad adVar3 = adVar;
        C7718hj hjVar2 = hjVar;
        if ((adVar3.f31535a & 4096) != 0) {
            view3.setContentDescription(adVar3.f31549o);
        }
        if ((adVar3.f31535a & 134217728) != 0) {
            this.f290327v.put(adVar3.f31524B, view3);
        }
        C9140ac a = C9140ac.m23674a(adVar3.f31537c);
        if (a == null) {
            a = C9140ac.OPEN_URL;
        }
        if (f290296A.contains(a)) {
            if (!this.f290328w.containsKey(a)) {
                this.f290328w.put(a, new HashSet());
            }
            ((Set) this.f290328w.get(a)).add(view3);
        }
        if (!(this.f290323r == null || (adVar3.f31535a & 16) == 0)) {
            C9195cd cdVar = adVar3.f31541g;
            if (cdVar == null) {
                cdVar = C9195cd.f31746j;
            }
            if (cdVar.f31755h) {
                view3.setOnTouchListener(new C104345i(this));
            }
        }
        if (this.f290314i.f290335e) {
            if (this.f290316k != null) {
                int i = adVar3.f31535a;
                if (!((2097152 & i) == 0 || (i & 4194304) == 0)) {
                    view3.setOnClickListener(new C104341e(this, adVar3));
                    return;
                }
            }
            C58881cr o = mo94121o();
            C91857e eVar = this.f290316k;
            eVar.getClass();
            Context context = this.f290307b;
            String str = this.f290313h;
            C104350n nVar = this.f290314i;
            C91692g gVar = nVar.f290343m;
            C104456s sVar = this.f290320o;
            C104429af afVar = this.f290319n;
            C104435al alVar = this.f290321p;
            C104441d dVar = this.f290322q;
            C104460w wVar = this.f290323r;
            C104424aa aaVar = this.f290325t;
            C104337bl blVar = nVar.f290346p;
            if (adVar3 == null) {
                view2 = view3;
                adVar2 = adVar3;
            } else {
                C104337bl blVar2 = blVar;
                C91857e eVar2 = eVar;
                C104332bg bgVar = r0;
                C91857e eVar3 = eVar;
                C104337bl blVar3 = blVar2;
                C91857e eVar4 = eVar3;
                adVar2 = adVar3;
                C104332bg bgVar2 = new C104332bg(context, gVar, this, eVar2, str, sVar, afVar, alVar, dVar, wVar, aaVar, blVar3, view);
                C7718hj hjVar3 = this.f290310e.f32174H;
                if (hjVar3 == null) {
                    hjVar3 = C7718hj.f26927af;
                }
                boolean f = C91992k.m150978f(adVar);
                C91934j jVar = (C91934j) o.mo6453a();
                jVar.mo86614f(hjVar3);
                jVar.mo86613e(adVar2);
                jVar.mo86610b(C7681g.m22802a(adVar2.f31538d));
                jVar.mo86615g(!f);
                C7526an anVar = adVar2.f31540f;
                if (anVar == null) {
                    anVar = C7526an.f26049l;
                }
                jVar.mo86612d(anVar);
                jVar.mo86611c(this.f290309d);
                jVar.mo86617i(eVar4);
                C9277u a2 = C9277u.m23705a(this.f290310e.f32196c);
                if (a2 == null) {
                    a2 = C9277u.UNKNOWN;
                }
                jVar.mo86616h(a2);
                view2 = view;
                view2.setOnClickListener(new C104331bf(jVar.mo86609a(), adVar2, bgVar));
            }
            if (adVar2 != null && (adVar2.f31535a & 16777216) != 0) {
                C8178yk ykVar = adVar2.f31559y;
                if (ykVar == null) {
                    ykVar = C8178yk.f28736g;
                }
                if (!ykVar.f28742e) {
                    Map map = this.f290312g;
                    C8178yk ykVar2 = adVar2.f31559y;
                    if (ykVar2 == null) {
                        ykVar2 = C8178yk.f28736g;
                    }
                    map.put(ykVar2, view2);
                    return;
                }
                return;
            }
            return;
        }
        View view4 = view3;
        C9141ad adVar4 = adVar3;
        C91671j jVar2 = this.f290309d;
        jVar2.getClass();
        C58881cr o2 = mo94121o();
        Context context2 = this.f290307b;
        boolean e = this.f290314i.f290337g.mo86459e();
        C91692g gVar2 = this.f290314i.f290343m;
        if (adVar4 != null) {
            C7681g a3 = C7681g.m22802a(adVar4.f31538d);
            C9140ac a4 = C9140ac.m23674a(adVar4.f31537c);
            if (a4 == null) {
                a4 = C9140ac.OPEN_URL;
            }
            int i2 = a4.f31520am;
            C7746ik a5 = C7746ik.m22834a(jVar2.mo86085g().f26966g);
            if (a5 == null) {
                a5 = C7746ik.UNKNOWN;
            }
            int i3 = a5.f27108J;
            if (hjVar2 != null) {
                C104328bc bcVar = new C104328bc(context2, gVar2, this, jVar2, e);
                boolean f2 = C91992k.m150978f(adVar);
                C91934j jVar3 = (C91934j) o2.mo6453a();
                jVar3.mo86614f(hjVar2);
                jVar3.mo86610b(a3);
                jVar3.mo86615g(!f2);
                C7526an anVar2 = adVar4.f31540f;
                if (anVar2 == null) {
                    anVar2 = C7526an.f26049l;
                }
                jVar3.mo86612d(anVar2);
                jVar3.mo86611c(jVar2);
                view4.setOnClickListener(new C104326ba(jVar3.mo86609a(), adVar4, bcVar));
                return;
            }
            throw new NullPointerException(C58880cq.m90965a("Action type: %s does not have a module entry. Card type is %s", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    /* renamed from: D */
    public final void mo94105D(C58485gu guVar, boolean z) {
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            int i2 = 1;
            C7851mh mhVar = (C7851mh) C23245b.m43557b((ProtoParcelable) guVar.get(i), C7851mh.f27519f.getParserForType(), C62921ba.m95368a(), true);
            if (!(mhVar == null || (mhVar.f27521a & 2) == 0)) {
                String str = mhVar.f27524d;
                this.f290305G.put(str, mhVar);
                if (this.f290326u.containsKey(str) && (mhVar.f27521a & 1) != 0) {
                    C104335bj bjVar = (C104335bj) this.f290326u.get(str);
                    if (bjVar.f290268d) {
                        int a = C7848me.m22878a(mhVar.f27522b);
                        if (a != 0) {
                            i2 = a;
                        }
                        bjVar.mo94092c(i2, false, z, false);
                    } else {
                        bjVar.mo94090a(mhVar);
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public final boolean mo94106E() {
        return this.f290310e != f290297B;
    }

    /* renamed from: F */
    public final boolean mo94107F() {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return a == C9277u.METADATA_CARD_SMALL_CENTERED_ICON || a == C9277u.METADATA_CARD_SMALL_CAROUSEL_TEXTONLY_RADIO || a == C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE || a == C9277u.METADATA_CARD_SMALL_CAROUSEL_WEB_LOGO || a == C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON || a == C9277u.TRAY_SPORTS_STANDINGS || a == C9277u.TRAY_CRITIC || a == C9277u.TRAY_GENERIC_SMALL_SPACE || a == C9277u.TRAY_GENERIC_LARGE_SPACE || a == C9277u.TRAY_IMAGE_FULL || a == C9277u.HERO_IMAGE_CENTER || a == C9277u.HERO_IMAGE_RIGHT || a == C9277u.GRID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo94108G() {
        return this.f290314i.f290337g.mo86459e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo94109H() {
        return this.f290314i.f290337g.mo86461f();
    }

    /* renamed from: I */
    public void mo94110I(C104852a aVar) {
        C9278v vVar = aVar.f292195a;
        if (vVar instanceof C9278v) {
            mo94114h(vVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final RecyclerViewStub mo94111J(View view, C9164b bVar, int i) {
        if (i == 2) {
            return null;
        }
        return mo94116j(view, bVar, R.id.gutter_icon_stub, R.id.icon_background, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo94112K(View view, C9164b bVar, int i) {
        ImageView imageView;
        int i2;
        View findViewById = view.findViewById(R.id.gutter_container);
        if (findViewById != null) {
            mo94111J(findViewById, bVar, i);
        } else if (i != 2 && bVar != null && (bVar.f31644a & 1) != 0 && (imageView = (ImageView) view.findViewById(R.id.action_icon)) != null) {
            if (!this.f290318m || (bVar.f31644a & 2) == 0 || (i2 = bVar.f31646c) == 0) {
                i2 = bVar.f31645b;
            }
            imageView.setImageResource(i2);
            imageView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public View mo86091a(C91671j jVar, C9278v vVar) {
        if (!this.f290314i.f290335e && jVar == null) {
            throw null;
        }
        this.f290309d = jVar;
        mo94126s(vVar);
        View b = mo94018b(this.f290308c.f256406b);
        this.f290311f = b;
        b.setTag(R.id.is_swipeable, Boolean.valueOf(vVar.f32176J));
        this.f290311f.setTag(R.id.card_module_presenter, this);
        C90476a aVar = this.f290314i.f290345o;
        if (vVar.f32181O) {
            this.f290311f.setTag(R.id.suppress_divider, Boolean.TRUE);
        }
        if ((vVar.f32192a & LinearLayoutManager.INVALID_OFFSET) != 0) {
            View view = this.f290311f;
            C7718hj hjVar = vVar.f32174H;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            view.setTag(R.id.card_entry, hjVar);
        }
        if ((vVar.f32195b & 16384) != 0) {
            this.f290311f.setTag(R.id.module_overlap_px, Integer.valueOf((int) TypedValue.applyDimension(1, (float) vVar.f32187U, this.f290307b.getResources().getDisplayMetrics())));
        }
        this.f290311f.addOnAttachStateChangeListener(this);
        mo94020e();
        mo94076z();
        mo94075w();
        mo94398M();
        C9278v vVar2 = this.f290310e;
        if ((vVar2.f32195b & 32) != 0) {
            this.f290311f.setContentDescription(vVar2.f32180N);
        }
        return this.f290311f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract View mo94018b(LayoutInflater layoutInflater);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo94019c(C9277u uVar, ViewGroup viewGroup);

    /* renamed from: d */
    public List mo94030d() {
        return f290300z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo94020e();

    /* renamed from: f */
    public boolean mo94026f() {
        return false;
    }

    /* renamed from: g */
    public final View mo94113g(C9277u uVar, ViewGroup viewGroup) {
        this.f290308c.f256405a.getTheme().applyStyle(R.style.small_content_module_default, true);
        View c = mo94019c(uVar, viewGroup);
        this.f290311f = c;
        if (c != null) {
            c.setTag(R.id.card_module_presenter, this);
            this.f290311f.addOnAttachStateChangeListener(this);
        }
        return this.f290311f;
    }

    /* renamed from: h */
    public View mo94114h(C9278v vVar) {
        if (vVar.equals(this.f290310e)) {
            return this.f290311f;
        }
        mo94126s(vVar);
        mo94020e();
        mo94076z();
        mo94075w();
        mo94398M();
        return this.f290311f;
    }

    /* renamed from: i */
    public final ViewGroup mo94115i() {
        C91671j jVar = this.f290309d;
        if (jVar == null) {
            return null;
        }
        return jVar.mo86101p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final RecyclerViewStub mo94116j(View view, C9164b bVar, int i, int i2, boolean z) {
        RecyclerViewStub recyclerViewStub = (RecyclerViewStub) view.findViewById(i);
        if (recyclerViewStub == null) {
            return null;
        }
        recyclerViewStub.f227323a = bVar == null ? R.layout.empty_gutter : bVar.f31649f != 0 ? (bVar.f31644a & 4) != 0 ? true != bVar.f31654k ? R.layout.gutter_icon_web_tint_with_background : R.layout.gutter_icon_web_with_background : true != bVar.f31654k ? R.layout.gutter_icon_with_background : R.layout.gutter_icon_non_tint_with_background : (bVar.f31644a & 4) != 0 ? true != bVar.f31654k ? R.layout.gutter_icon_tint_web : R.layout.gutter_icon_web : true != bVar.f31654k ? R.layout.gutter_icon_tint_resource : R.layout.gutter_icon_non_tint_resource;
        recyclerViewStub.mo76716c(this.f290314i.f290349s);
        recyclerViewStub.mo76714a().setVisibility(0);
        mo94130y(view, bVar, i2, z);
        return recyclerViewStub;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final WebImageView mo94117k(View view, int i, String str) {
        WebImageView webImageView;
        if (TextUtils.isEmpty(str) || (webImageView = (WebImageView) view.findViewById(i)) == null) {
            return null;
        }
        webImageView.mo76738i(str, this.f290314i.f290332b.mo86214a());
        webImageView.setVisibility(0);
        View findViewById = this.f290311f.findViewById(R.id.icon_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        return webImageView;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r3 = r6.f290310e.f32184R;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.sidekick.shared.p7256ui.C91941q mo94118l(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f290307b
            int r0 = com.google.android.apps.gsa.now.shared.p6421ui.C83413b.m132808a(r0)
            com.google.android.apps.gsa.sidekick.shared.ui.q r1 = new com.google.android.apps.gsa.sidekick.shared.ui.q
            r1.<init>(r7, r0)
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r7 = r6.f290309d
            r0 = -1
            if (r7 == 0) goto L_0x001b
            int r7 = r7.mo86100o(r6)
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r2 = r6.f290309d
            int r2 = r2.mo86099n()
            goto L_0x001d
        L_0x001b:
            r7 = -1
            r2 = -1
        L_0x001d:
            if (r7 == 0) goto L_0x004b
            com.google.android.apps.g.d.v r3 = r6.f290310e
            int r3 = r3.f32184R
            int r4 = com.google.p375ai.p378b.C7693gl.m22807a(r3)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            r5 = 2
            if (r4 != r5) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            int r2 = r2 + r0
            if (r7 == r2) goto L_0x0045
            int r7 = com.google.p375ai.p378b.C7693gl.m22807a(r3)
            if (r7 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r0 = 4
            if (r7 == r0) goto L_0x0045
        L_0x003b:
            int r7 = com.google.p375ai.p378b.C7693gl.m22807a(r3)
            if (r7 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            r0 = 7
            if (r7 != r0) goto L_0x004f
        L_0x0045:
            r7 = 12
            r1.mo86641a(r7)
            goto L_0x004f
        L_0x004b:
            r7 = 3
            r1.mo86641a(r7)
        L_0x004f:
            boolean r7 = r6.mo94107F()
            if (r7 == 0) goto L_0x005a
            r7 = 15
            r1.mo86641a(r7)
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l.mo94118l(int):com.google.android.apps.gsa.sidekick.shared.ui.q");
    }

    /* renamed from: m */
    public final C104335bj mo94119m(C7851mh mhVar, C105069f fVar) {
        C104335bj bjVar = new C104335bj(this.f290307b, new C104346j(this, fVar), this.f290314i.f290331a);
        if (mhVar.f27525e) {
            bjVar.setBackground(this.f290307b.getResources().getDrawable(R.drawable.qp_clickable_module_background));
        }
        if ((mhVar.f27521a & 2) != 0) {
            String str = mhVar.f27524d;
            if (!str.isEmpty() && this.f290305G.containsKey(str) && this.f290305G.get(str) != null) {
                mhVar = (C7851mh) this.f290305G.get(str);
            }
            this.f290326u.put(str, bjVar);
            bjVar.f290269e = new C104339c(this, str);
        }
        bjVar.mo94090a(mhVar);
        return bjVar;
    }

    /* renamed from: n */
    public final CardRenderingContext mo94120n() {
        return (CardRenderingContext) this.f290314i.f290340j.mo6453a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C58881cr mo94121o() {
        C104350n nVar = this.f290314i;
        if (!nVar.f290335e || this.f290316k == null) {
            return nVar.f290341k;
        }
        C91934j j = C91935k.m150850j(((C104993a) nVar.f290341k).f292493a);
        ((C91925a) j).f256364b = this.f290316k;
        return new C58885cv(j);
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* renamed from: p */
    public final void mo94124p(View view, View view2, C9201cj cjVar, boolean z, int i, int i2) {
        TextView textView;
        View view3;
        View view4 = view;
        View view5 = view2;
        C9201cj cjVar2 = cjVar;
        int i3 = i;
        int i4 = i2;
        View findViewById = view4.findViewById(R.id.media_caption_fv2);
        if (view4.findViewById(R.id.media_icon) != null) {
            view4.findViewById(R.id.media_icon).setVisibility(8);
        }
        if (view4.findViewById(R.id.media_icon_animated) != null) {
            view4.findViewById(R.id.media_icon_animated).setVisibility(8);
        }
        if (view4.findViewById(R.id.media_caption_fv2) != null) {
            view4.findViewById(R.id.media_caption_fv2).setVisibility(8);
        }
        if (view4.findViewById(R.id.launch_on_3P_app_icon) != null) {
            view4.findViewById(R.id.launch_on_3P_app_icon).setVisibility(8);
        }
        if (cjVar2 != null && (cjVar2.f31775a & 1) != 0) {
            WebImageView webImageView = (WebImageView) view4.findViewById(R.id.photo);
            if ((cjVar2.f31775a & 32) != 0) {
                webImageView.f227360j = (double) cjVar2.f31783i;
            }
            C9277u a = C9277u.m23705a(this.f290310e.f32196c);
            if (a == null) {
                a = C9277u.UNKNOWN;
            }
            if (a == C9277u.TRAY_GENERIC_SMALL_SPACE) {
                C91115n.m148873e((ViewGroup.MarginLayoutParams) view2.getLayoutParams(), 0, 0, 0, 0);
            } else if (view4.findViewById(R.id.photo_padding) != null) {
                m172491O(cjVar2, view4.findViewById(R.id.photo_padding));
            } else {
                m172491O(cjVar2, webImageView);
            }
            if (z) {
                mo94127u(R.id.photo);
            }
            String str = (!this.f290318m || (cjVar2.f31775a & 2) == 0) ? cjVar2.f31776b : cjVar2.f31777c;
            Uri parse = Uri.parse(str);
            if (i3 > 0 && i4 > 0 && C91958ai.m150914d(str)) {
                parse = C91958ai.m150912b(i3, i4, str);
            }
            webImageView.mo76737h(parse, this.f290314i.f290332b.mo86214a());
            if (webImageView instanceof RoundedCornerWebImageView) {
                ((RoundedCornerWebImageView) webImageView).mo76724hc(0);
            }
            if ((cjVar2.f31775a & 4) != 0) {
                C9141ad adVar = cjVar2.f31779e;
                if (adVar == null) {
                    adVar = C9141ad.f31521K;
                }
                mo94103B(view5, adVar);
            }
            if (cjVar2.f31788n) {
                CardRenderingContext n = mo94120n();
                if (n == null || !n.mo49320o()) {
                    view3 = view4.findViewById(R.id.media_icon);
                } else {
                    view3 = view4.findViewById(R.id.media_icon_animated);
                    if (view3 == null) {
                        view3 = view4.findViewById(R.id.media_icon);
                    }
                }
                if (view3 != null) {
                    C9277u a2 = C9277u.m23705a(this.f290310e.f32196c);
                    if (a2 == null) {
                        a2 = C9277u.UNKNOWN;
                    }
                    mo94128v(a2, view3);
                    view3.setVisibility(0);
                    Drawable background = view3.getBackground();
                    if (background != null) {
                        background.setAlpha(findViewById == null ? 204 : 221);
                    }
                    view3.setContentDescription(this.f290307b.getString(R.string.play_video_icon));
                }
            }
            if (!((cjVar2.f31775a & 16384) == 0 || (textView = (TextView) view4.findViewById(R.id.media_caption_fv2)) == null)) {
                textView.setVisibility(0);
                C91985d.m150954a(view4, R.id.media_caption_fv2, cjVar2.f31794t);
            }
            CardRenderingContext n2 = mo94120n();
            C9141ad adVar2 = this.f290310e.f32169C;
            if (adVar2 == null) {
                adVar2 = C9141ad.f31521K;
            }
            int i5 = adVar2.f31535a & 1048576;
            if (n2 != null) {
                C9277u a3 = C9277u.m23705a(this.f290310e.f32196c);
                if (a3 == null) {
                    a3 = C9277u.UNKNOWN;
                }
                if (a3 == C9277u.HERO_IMAGE_CENTER && cjVar2.f31788n && (cjVar2.f31775a & 16384) != 0 && cjVar2.f31789o && i5 == 0) {
                    view4.findViewById(R.id.launch_on_3P_app_icon).setVisibility(0);
                }
            }
            if ((cjVar2.f31775a & 8192) != 0) {
                view5.setContentDescription(cjVar2.f31793s);
                view5.setFocusable(true);
                view5.setImportantForAccessibility(1);
            }
            TextView textView2 = (TextView) view4.findViewById(R.id.photo_attribution_primary);
            TextView textView3 = (TextView) view4.findViewById(R.id.photo_attribution_secondary);
            if (cjVar2.f31778d.size() <= 0 || textView2 == null) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                textView2.setText((String) cjVar2.f31778d.get(0));
                textView2.setVisibility(0);
                if (cjVar2.f31780f.size() > 0) {
                    mo94103B(textView2, (C9141ad) cjVar2.f31780f.get(0));
                }
                if (cjVar2.f31778d.size() > 1 && textView3 != null) {
                    textView3.setText((String) cjVar2.f31778d.get(1));
                    textView3.setVisibility(0);
                    if (cjVar2.f31780f.size() > 1) {
                        mo94103B(textView3, (C9141ad) cjVar2.f31780f.get(1));
                    }
                }
            }
            view5.setVisibility(0);
        }
    }

    /* renamed from: q */
    public void mo94036q() {
        if (this.f290310e != f290297B) {
            this.f290311f.setBackground((Drawable) null);
            this.f290311f.setContentDescription((CharSequence) null);
            this.f290311f.setOnClickListener((View.OnClickListener) null);
            this.f290311f.setTag(R.id.is_swipeable, (Object) null);
            this.f290311f.setTag(R.id.suppress_divider, (Object) null);
            this.f290311f.setTag(R.id.card_entry, (Object) null);
            this.f290311f.setTag(R.id.module_color, (Object) null);
            this.f290311f.setTag(R.id.card_module_presenter, (Object) null);
            this.f290311f.setTag(R.id.card_layout_file, (Object) null);
            if (this.f290301C >= 0) {
                int i = this.f290302D;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f290311f.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i;
                }
                View view = this.f290311f;
                view.setPadding(view.getPaddingLeft(), this.f290311f.getPaddingTop(), this.f290311f.getPaddingRight(), 0);
                this.f290301C = -1;
                this.f290302D = -1;
            }
            if (this.f290311f.findViewById(R.id.photo_padding) != null) {
                C9200ci ciVar = (C9200ci) C9201cj.f31773u.createBuilder();
                ciVar.copyOnWrite();
                C9201cj cjVar = (C9201cj) ciVar.instance;
                cjVar.f31775a |= 128;
                cjVar.f31785k = 0;
                ciVar.copyOnWrite();
                C9201cj cjVar2 = (C9201cj) ciVar.instance;
                cjVar2.f31775a |= 64;
                cjVar2.f31784j = 0;
                ciVar.copyOnWrite();
                C9201cj cjVar3 = (C9201cj) ciVar.instance;
                cjVar3.f31775a |= 256;
                cjVar3.f31786l = 0;
                ciVar.copyOnWrite();
                C9201cj cjVar4 = (C9201cj) ciVar.instance;
                cjVar4.f31775a |= 512;
                cjVar4.f31787m = 0;
                m172491O((C9201cj) ciVar.build(), this.f290311f.findViewById(R.id.photo_padding));
            }
            for (WebImageView webImageView : this.f290306H) {
                webImageView.f227358h = null;
            }
            this.f290306H.clear();
            View findViewById = this.f290311f.findViewById(R.id.photo);
            if (findViewById != null && (findViewById instanceof WebImageView)) {
                ((WebImageView) findViewById).f227360j = C59203do.f157270a;
            }
            m172488L(R.id.load_indicator, this.f290311f);
            m172488L(R.id.action_icon, this.f290311f);
            m172488L(R.id.icon_container, this.f290311f);
            m172488L(R.id.video_black_overlay_for_transition, this.f290311f);
            m172488L(R.id.video_interception_view, this.f290311f);
            m172490N(R.id.gutter_icon_stub, this.f290311f);
            m172490N(R.id.icon_stub, this.f290311f);
            m172490N(R.id.photo_stub, this.f290311f);
            this.f290312g.clear();
            this.f290305G.clear();
            this.f290326u.clear();
            this.f290327v.clear();
            this.f290328w.clear();
            this.f290310e = f290297B;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo94125r(View view, Drawable drawable) {
        if (drawable != null) {
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            int paddingStart = view.getPaddingStart();
            int paddingEnd = view.getPaddingEnd();
            view.setBackground(drawable);
            if (mo94107F() && view.getElevation() > 0.0f) {
                view.setOutlineProvider(new C104343g(this));
            }
            view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
        }
    }

    /* renamed from: s */
    public void mo94126s(C9278v vVar) {
        this.f290310e = vVar;
        this.f290308c.mo86640a((vVar.f32192a & 16777216) != 0);
        View view = this.f290311f;
        if (view != null) {
            view.setTag(R.id.card_module_presenter, this);
            C90476a aVar = this.f290314i.f290345o;
            this.f290311f.setTag(R.id.is_swipeable, Boolean.valueOf(this.f290310e.f32176J));
            if (this.f290310e.f32181O) {
                this.f290311f.setTag(R.id.suppress_divider, Boolean.TRUE);
            }
            C9278v vVar2 = this.f290310e;
            if ((vVar2.f32192a & LinearLayoutManager.INVALID_OFFSET) != 0) {
                View view2 = this.f290311f;
                C7718hj hjVar = vVar2.f32174H;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                view2.setTag(R.id.card_entry, hjVar);
            }
            C9278v vVar3 = this.f290310e;
            if ((vVar3.f32195b & 32) != 0) {
                this.f290311f.setContentDescription(vVar3.f32180N);
            }
        }
    }

    /* renamed from: t */
    public void mo94037t(boolean z) {
        if (z != this.f290318m || !this.f290304F) {
            this.f290304F = true;
            this.f290318m = z;
            if (this.f290310e != f290297B) {
                mo94020e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo94127u(int i) {
        WebImageView webImageView = (WebImageView) this.f290311f.findViewById(i);
        if (this.f290314i.f290335e) {
            webImageView.f227358h = this.f290303E;
        } else {
            webImageView.f227358h = new C91937m(((Boolean) this.f290314i.f290339i.mo6453a()).booleanValue(), new C104340d(this));
        }
        this.f290306H.add(webImageView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo94128v(C9277u uVar, View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94075w() {
        C7718hj hjVar;
        mo94129x();
        CardRenderingContext n = mo94120n();
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & 67108864) != 0) {
            View view = this.f290311f;
            C9141ad adVar = vVar.f32169C;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
            mo94103B(view, adVar);
        } else if (n == null || !n.mo49319n()) {
            C9278v vVar2 = this.f290310e;
            if (!vVar2.f32188V) {
                C91671j jVar = this.f290309d;
                if ((vVar2.f32192a & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    hjVar = vVar2.f32174H;
                    if (hjVar == null) {
                        hjVar = C7718hj.f26927af;
                    }
                } else if (jVar != null) {
                    hjVar = jVar.mo86085g();
                } else {
                    ((C59052c) ((C59052c) f290299y.mo56225c()).mo56372aa(21933)).mo56386p("No module entry or adapter entry when setting up an entry click listener");
                    C90476a aVar = this.f290314i.f290345o;
                    hjVar = null;
                }
                if (hjVar != null) {
                    View view2 = this.f290311f;
                    C91934j jVar2 = (C91934j) mo94121o().mo6453a();
                    jVar2.mo86614f(hjVar);
                    jVar2.mo86610b(C7681g.UNCLICKABLE_MODULE);
                    C9277u a = C9277u.m23705a(this.f290310e.f32196c);
                    if (a == null) {
                        a = C9277u.UNKNOWN;
                    }
                    jVar2.mo86616h(a);
                    jVar2.mo86611c(jVar);
                    view2.setOnClickListener(new C104344h(jVar2.mo86609a()));
                }
            }
        } else {
            this.f290311f.setFocusable(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo94129x() {
        C9278v vVar = this.f290310e;
        int a = C9275s.m23704a(vVar.f32178L);
        if (a == 0) {
            a = 1;
        }
        C9141ad adVar = vVar.f32169C;
        if (adVar == null) {
            adVar = C9141ad.f31521K;
        }
        C9164b bVar = null;
        if (!((adVar.f31535a & 4) == 0 || a == 2)) {
            C9141ad adVar2 = this.f290310e.f32169C;
            if (adVar2 == null) {
                adVar2 = C9141ad.f31521K;
            }
            bVar = adVar2.f31539e;
            if (bVar == null) {
                bVar = C9164b.f31642o;
            }
        }
        if (bVar != null || a == 3) {
            mo94112K(this.f290311f, bVar, a);
        }
        View findViewById = this.f290311f.findViewById(R.id.action_icon);
        if (a == 3 && findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00da, code lost:
        if (r8 != 0) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94130y(android.view.View r8, com.google.android.apps.p489g.p494d.C9164b r9, int r10, boolean r11) {
        /*
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0022
            int r1 = r9.f31649f
            if (r1 == 0) goto L_0x0022
            android.content.Context r2 = r7.f290307b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131171504(0x7f0718b0, float:1.7957396E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            android.content.Context r3 = r7.f290307b
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131171503(0x7f0718af, float:1.7957394E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            goto L_0x0025
        L_0x0022:
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0025:
            r4 = 0
            if (r2 <= 0) goto L_0x0040
            if (r3 <= 0) goto L_0x0040
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            boolean r6 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 != 0) goto L_0x0039
            boolean r6 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r6 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r5 = r4
            goto L_0x003b
        L_0x0039:
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x003b:
            if (r5 == 0) goto L_0x0040
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r5, r2, r0, r3, r0)
        L_0x0040:
            if (r9 == 0) goto L_0x0088
            int r2 = r9.f31644a
            r3 = r2 & 1
            r5 = 2131427518(0x7f0b00be, float:1.8476655E38)
            if (r3 == 0) goto L_0x006a
            android.view.View r2 = r8.findViewById(r5)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L_0x0089
            boolean r3 = r7.f290318m
            if (r3 == 0) goto L_0x0061
            int r3 = r9.f31644a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0061
            int r3 = r9.f31646c
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            int r3 = r9.f31645b
        L_0x0063:
            r2.setImageResource(r3)
            r2.setVisibility(r0)
            goto L_0x0089
        L_0x006a:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0088
            boolean r0 = r7.f290318m
            if (r0 == 0) goto L_0x0081
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r9.f31648e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = r9.f31648e
            goto L_0x0083
        L_0x0081:
            java.lang.String r0 = r9.f31647d
        L_0x0083:
            com.google.android.apps.gsa.now.shared.ui.WebImageView r2 = r7.mo94117k(r8, r5, r0)
            goto L_0x0089
        L_0x0088:
            r2 = r4
        L_0x0089:
            if (r1 == 0) goto L_0x00b7
            android.content.Context r0 = r7.f290307b
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131102527(0x7f060b3f, float:1.7817494E38)
            int r0 = r0.getColor(r3)
            if (r1 == r0) goto L_0x00b7
            android.view.View r10 = r8.findViewById(r10)
            if (r10 != 0) goto L_0x00a6
            java.lang.String r10 = "icon_background_tag"
            android.view.View r10 = r8.findViewWithTag(r10)
        L_0x00a6:
            if (r10 == 0) goto L_0x00b7
            if (r11 == 0) goto L_0x00ae
            r10.setBackgroundColor(r1)
            goto L_0x00b7
        L_0x00ae:
            android.graphics.drawable.Drawable r8 = r10.getBackground()
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r8.setColorFilter(r1, r10)
        L_0x00b7:
            if (r2 == 0) goto L_0x00ed
            boolean r8 = r7.f290318m
            if (r8 == 0) goto L_0x00d8
            int r8 = r9.f31653j
            if (r8 == 0) goto L_0x00c6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            goto L_0x00e0
        L_0x00c6:
            boolean r8 = r9.f31654k
            if (r8 != 0) goto L_0x00d8
            android.content.Context r8 = r7.f290307b
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131100395(0x7f0602eb, float:1.781317E38)
            int r8 = r8.getColor(r9)
            goto L_0x00dc
        L_0x00d8:
            int r8 = r9.f31652i
            if (r8 == 0) goto L_0x00e0
        L_0x00dc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
        L_0x00e0:
            if (r4 == 0) goto L_0x00ea
            int r8 = r4.intValue()
            r2.setColorFilter(r8)
            return
        L_0x00ea:
            r2.clearColorFilter()
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l.mo94130y(android.view.View, com.google.android.apps.g.d.b, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo94076z() {
        mo94102A(true);
    }
}
