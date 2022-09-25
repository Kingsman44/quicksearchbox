package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2368bp;
import androidx.viewpager.widget.C4281n;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110117c;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8434i.C110185g;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.ClockController;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.PhotosSmartSpaceController;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110415l;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110416m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ar */
/* compiled from: PG */
public final class C110332ar extends Fragment implements C2010ad {

    /* renamed from: A */
    public boolean f307498A = false;

    /* renamed from: B */
    public int f307499B;

    /* renamed from: C */
    private C110415l f307500C;

    /* renamed from: D */
    private View f307501D;

    /* renamed from: E */
    private LinearLayout f307502E;

    /* renamed from: F */
    private View f307503F;

    /* renamed from: G */
    private C4281n f307504G;

    /* renamed from: H */
    private ViewTreeObserver.OnGlobalLayoutListener f307505H;

    /* renamed from: a */
    public C110373ce f307506a;

    /* renamed from: b */
    public C110345bd f307507b;

    /* renamed from: c */
    public C110353bl f307508c;

    /* renamed from: d */
    public C110349bh f307509d;

    /* renamed from: e */
    public C110367bz f307510e;

    /* renamed from: f */
    public C110357bp f307511f;

    /* renamed from: g */
    public C68214a f307512g;

    /* renamed from: h */
    public C110360bs f307513h;

    /* renamed from: i */
    public PhotosSmartSpaceController f307514i;

    /* renamed from: j */
    public C68214a f307515j;

    /* renamed from: k */
    public boolean f307516k;

    /* renamed from: l */
    public C110416m f307517l;

    /* renamed from: m */
    public C87673aa f307518m;

    /* renamed from: n */
    public C110185g f307519n;

    /* renamed from: o */
    public C110331aq f307520o;

    /* renamed from: p */
    public C109024k f307521p;

    /* renamed from: q */
    public ViewPager f307522q;

    /* renamed from: r */
    GestureDetector f307523r;

    /* renamed from: s */
    C110356bo f307524s;

    /* renamed from: t */
    public TextView f307525t;

    /* renamed from: u */
    public TextView f307526u;

    /* renamed from: v */
    public View f307527v;

    /* renamed from: w */
    public C110117c f307528w;

    /* renamed from: x */
    public float f307529x;

    /* renamed from: y */
    public RelativeLayout f307530y;

    /* renamed from: z */
    public View f307531z;

    /* renamed from: b */
    private static float m183722b(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    /* renamed from: c */
    private final void m183723c(C0167am amVar, TextView textView) {
        Resources resources = amVar.getResources();
        textView.setShadowLayer(m183722b(resources, R.dimen.text_shadow_radius), m183722b(resources, R.dimen.text_shadow_dx), m183722b(resources, R.dimen.text_shadow_dy), C1878d.m5128a(getActivity(), R.color.text_shadow_color));
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C2098m q = cpVar.f5994b.mo5234q();
        if (q != null) {
            this.f307531z.setPadding(0, 0, 0, C2097l.m5777a(q.f6013a));
        }
        return cpVar.f5994b.mo5235r();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        view.getClass();
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout) view;
        if (this.f307516k) {
            this.f307529x = ((C0167am) Objects.requireNonNull(getActivity())).getResources().getDisplayMetrics().density;
            this.f307528w = new C110117c();
        } else {
            C110357bp bpVar = this.f307511f;
            Context context = getContext();
            View view2 = this.f307531z;
            context.getClass();
            view2.getClass();
            C68214a a = C68219e.m98518a(((C68226l) bpVar.f307580a).f184585a);
            a.getClass();
            C22871g gVar = (C22871g) bpVar.f307581b.mo17428b();
            gVar.getClass();
            Boolean bool = (Boolean) ((C68221g) bpVar.f307582c).f184583a;
            bool.getClass();
            this.f307524s = new C110356bo(context, view2, a, gVar, bool.booleanValue());
        }
        C109024k kVar = (C109024k) new C2368bp(this).mo5770a(C109024k.class);
        this.f307521p = kVar;
        boolean a2 = C90685b.m148053a(getContext());
        Boolean bool2 = kVar.f303171g;
        if (bool2 == null || bool2.booleanValue() != a2) {
            kVar.f303165a.mo5708l((Object) null);
            kVar.f303166b.mo5708l((Object) null);
            kVar.f303169e.mo5708l((Object) null);
            kVar.f303170f.mo5708l((Object) null);
            kVar.f303171g = Boolean.valueOf(a2);
        }
        ViewPager viewPager = (ViewPager) touchInterceptingFrameLayout.findViewById(R.id.photo_fragment_pager);
        this.f307522q = viewPager;
        C110367bz bzVar = this.f307510e;
        C2332ag agVar = this.f307521p.f303165a;
        C68214a a3 = C68219e.m98518a(((C68226l) bzVar.f307599a).f184585a);
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) bzVar.f307600b).f184585a);
        a4.getClass();
        viewPager.mo9146k(new C110366by(agVar, a3, a4));
        C110328an anVar = new C110328an(this, touchInterceptingFrameLayout);
        this.f307504G = anVar;
        this.f307522q.mo9137f(anVar);
        if (this.f307516k) {
            this.f307523r = new GestureDetector(new C110329ao(this, touchInterceptingFrameLayout));
            this.f307522q.setOnTouchListener(new C110319ae(this));
        } else {
            this.f307523r = new GestureDetector(new C110330ap(this));
            touchInterceptingFrameLayout.f253398a = new C110320af(this);
        }
        this.f307521p.f303165a.mo5704e(this, new C110321ag(this));
        this.f307521p.f303166b.mo5704e(this, new C110322ah(this));
        this.f307521p.f303169e.mo5704e(this, new C110323ai(this));
        this.f307521p.f303170f.mo5704e(this, new C110324aj(this));
        this.f307525t = (TextView) touchInterceptingFrameLayout.findViewById(R.id.photo_fragment_clock);
        if (this.f307516k) {
            m183723c((C0167am) Objects.requireNonNull(getActivity()), this.f307525t);
        }
        C110353bl blVar = this.f307508c;
        C109024k kVar2 = this.f307521p;
        kVar2.getClass();
        C21378h hVar = (C21378h) blVar.f307567a.mo17428b();
        hVar.getClass();
        getLifecycle().mo5790b(new ClockController.Observer());
        this.f307521p.f303167c.mo5704e(this, new C110325ak(this));
        this.f307526u = (TextView) touchInterceptingFrameLayout.findViewById(R.id.photo_fragment_battery);
        if (this.f307516k) {
            m183723c((C0167am) Objects.requireNonNull(getActivity()), this.f307526u);
        }
        this.f307509d.mo98582a(this.f307521p).mo98563b(this);
        this.f307521p.f303168d.mo5704e(this, new C110326al(this));
        this.f307501D = touchInterceptingFrameLayout.findViewById(R.id.photo_fragment_opa_logo);
        if (((C86124t) this.f307512g.mo27525b()).mo79746e(C90014bt.f247551jL)) {
            C110360bs bsVar = this.f307513h;
            bsVar.f307589e = this.f307501D;
            bsVar.f307589e.setVisibility(0);
            bsVar.f307589e.setOnTouchListener(C110358bq.f307583a);
            bsVar.f307589e.setOnClickListener(new C89943l(new C110359br(bsVar)));
            if (this.f307516k) {
                C28292j jVar = new C28292j(83171);
                jVar.mo33795i(5);
                View view3 = this.f307501D;
                view3.getClass();
                C28295m.m52919e(view3, jVar);
            }
        }
        this.f307521p.mo97392a();
        this.f307506a.mo98604b(this.f307522q);
        if (this.f307516k) {
            if (!this.f307518m.mo81951w()) {
                this.f307518m.mo81932c();
            }
            if (!this.f307518m.mo81953y()) {
                this.f307518m.mo81947s((Bundle) null);
            }
            this.f307514i.f307466a.mo98530a((FrameLayout) touchInterceptingFrameLayout.findViewById(R.id.smart_space_frame));
            getLifecycle().mo5790b(new PhotosSmartSpaceController.Observer());
            if (this.f307502E != null) {
                C28292j jVar2 = new C28292j(85045);
                jVar2.mo33795i(5);
                jVar2.mo33794h(2);
                LinearLayout linearLayout = this.f307502E;
                linearLayout.getClass();
                C28295m.m52919e(linearLayout, jVar2);
                C28292j jVar3 = new C28292j(85118);
                jVar3.mo33795i(5);
                jVar3.mo33794h(2);
                View view4 = this.f307503F;
                view4.getClass();
                C28295m.m52919e(view4, jVar3);
                this.f307500C = this.f307517l.mo98652a(this.f307502E, this.f307503F, getActivity().getResources().getColor(R.color.photo_text_and_icon_color, (Resources.Theme) null));
            }
        }
        if (this.f307516k) {
            C28292j jVar4 = new C28292j(82045);
            jVar4.mo33795i(5);
            jVar4.mo33795i(22);
            C28295m.m52919e(touchInterceptingFrameLayout, jVar4);
            ArrayList arrayList = new ArrayList(this.f307514i.f307466a.f307320h.f307395m);
            C110415l lVar = this.f307500C;
            if (lVar != null) {
                arrayList.addAll(lVar.f307758j);
            }
            arrayList.add(C28293k.m52908e(C28295m.m52915a(this.f307501D), new C28293k[0]));
            C89949q.m146521e(C28285c.m52875b(C28293k.m52907d(jVar4, arrayList), 75711), false);
            return;
        }
        C28295m.m52919e(touchInterceptingFrameLayout, new C28292j(59969));
        C89949q.m146521e(C28285c.m52874a(touchInterceptingFrameLayout, 59956), false);
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
    }

    /* JADX WARNING: type inference failed for: r2v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
            r0 = this;
            boolean r2 = r0.f307516k
            r3 = 0
            if (r2 == 0) goto L_0x000d
            r2 = 2131624112(0x7f0e00b0, float:1.8875395E38)
            android.view.View r1 = r1.inflate(r2, r3)
            goto L_0x0014
        L_0x000d:
            r2 = 2131626408(0x7f0e09a8, float:1.8880051E38)
            android.view.View r1 = r1.inflate(r2, r3)
        L_0x0014:
            boolean r2 = r0.f307516k
            if (r2 == 0) goto L_0x0022
            r2 = 2131434494(0x7f0b1bfe, float:1.8490804E38)
            android.view.View r2 = r1.findViewById(r2)
            r3 = r2
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
        L_0x0022:
            r0.f307530y = r3
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131171273(0x7f0717c9, float:1.7956928E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f307499B = r2
            r2 = 2131434498(0x7f0b1c02, float:1.8490812E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.f307527v = r2
            r2 = 2131434495(0x7f0b1bff, float:1.8490806E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.f307531z = r2
            boolean r2 = r0.f307516k
            if (r2 == 0) goto L_0x005c
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.am r2 = new com.google.android.apps.gsa.staticplugins.opa.samson.photos.am
            r2.<init>(r0)
            r0.f307505H = r2
            android.view.View r2 = r0.f307531z
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r0.f307505H
            r3.getClass()
            r2.addOnGlobalLayoutListener(r3)
        L_0x005c:
            r2 = 2131433741(0x7f0b190d, float:1.8489276E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.f307502E = r2
            r2 = 2131433755(0x7f0b191b, float:1.8489305E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.f307503F = r2
            androidx.core.p098j.C2043bi.m5555ai(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110332ar.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f307516k) {
            if (this.f307518m.mo81953y()) {
                this.f307518m.mo81948t(false);
            }
            if (this.f307518m.mo81951w()) {
                this.f307518m.mo81933e();
            }
            if (this.f307505H != null) {
                ViewTreeObserver viewTreeObserver = this.f307531z.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f307505H;
                onGlobalLayoutListener.getClass();
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                this.f307505H = null;
            }
        }
    }

    public final void onPause() {
        super.onPause();
        if (((C86124t) this.f307512g.mo27525b()).mo79746e(C90014bt.f247840p) && this.f307516k) {
            this.f307519n.mo98460b(getContext());
        }
    }

    public final void onResume() {
        super.onResume();
        if (((C86124t) this.f307512g.mo27525b()).mo79746e(C90014bt.f247840p) && this.f307516k) {
            C110415l lVar = this.f307500C;
            if (lVar != null) {
                lVar.mo98651b();
            }
            this.f307519n.mo98459a(getContext());
        }
    }
}
