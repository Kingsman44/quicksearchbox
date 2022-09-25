package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1649b.p1650a.C19604a;
import com.google.android.material.chip.C44596f;
import com.google.android.material.chip.Chip;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.id */
/* compiled from: PG */
public final class C108423id extends C0640fb {

    /* renamed from: a */
    public final List f301554a = new ArrayList();

    /* renamed from: b */
    public C108237bh f301555b;

    /* renamed from: c */
    public final C108226ax f301556c;

    /* renamed from: d */
    public boolean f301557d;

    /* renamed from: e */
    public C28292j f301558e;

    /* renamed from: f */
    public final C86124t f301559f;

    /* renamed from: g */
    public boolean f301560g;

    /* renamed from: h */
    public boolean f301561h = true;

    /* renamed from: i */
    public boolean f301562i;

    /* renamed from: j */
    public boolean f301563j;

    /* renamed from: k */
    public View f301564k;

    /* renamed from: l */
    public RecyclerView f301565l;

    /* renamed from: m */
    private final Context f301566m;

    /* renamed from: n */
    private final ContextThemeWrapper f301567n;

    /* renamed from: o */
    private boolean f301568o;

    /* renamed from: p */
    private final C113863cr f301569p;

    /* renamed from: q */
    private final C68214a f301570q;

    /* renamed from: r */
    private final C0658ft f301571r;

    /* renamed from: s */
    private final boolean f301572s;

    /* renamed from: t */
    private final boolean f301573t;

    /* renamed from: u */
    private final LayoutInflater f301574u;

    public C108423id(Activity activity, C113863cr crVar, C68214a aVar, C86124t tVar, C104149a aVar2, C108237bh bhVar, C108226ax axVar, View view) {
        this.f301566m = activity;
        this.f301555b = bhVar;
        this.f301556c = axVar;
        this.f301565l = null;
        this.f301560g = false;
        this.f301571r = new C108420ia(this);
        this.f301569p = crVar;
        this.f301570q = aVar;
        this.f301557d = false;
        this.f301568o = false;
        this.f301564k = view;
        this.f301559f = tVar;
        this.f301572s = aVar2.mo93971b();
        this.f301573t = aVar2.mo93970a();
        ContextThemeWrapper a = C108435ip.m180256a(aVar2, activity);
        this.f301567n = a;
        this.f301574u = LayoutInflater.from(a);
    }

    /* renamed from: a */
    public static int m180227a(C108430ik ikVar, C108237bh bhVar) {
        if (ikVar instanceof C108249bt) {
            if (((C108249bt) ikVar).f301136a.mo96699a()) {
                return bhVar.mo96683z();
            }
        } else if (ikVar instanceof C108344ff) {
            return bhVar.mo96632E();
        }
        if (m180231p(ikVar)) {
            return bhVar.mo96641N();
        }
        return bhVar.mo96640M();
    }

    /* renamed from: f */
    public static void m180228f(Chip chip, int i) {
        chip.mo47720u(0.0f);
        C44596f fVar = chip.f116093d;
        if (fVar != null) {
            fVar.mo47767k(0.0f);
        }
        float f = (float) i;
        chip.mo47662B(f);
        chip.mo47661A(f);
        chip.mo47664D(0.0f);
        chip.mo47663C(0.0f);
        C44596f fVar2 = chip.f116093d;
        if (fVar2 != null) {
            fVar2.mo47787w(0.0f);
        }
        chip.mo47724y(0.0f);
    }

    /* renamed from: k */
    public static void m180229k(TextView textView, Drawable drawable, int i, C58833ax axVar, C108237bh bhVar) {
        boolean z = false;
        if (drawable != null) {
            double d = 1.0d;
            if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                double intrinsicWidth = (double) drawable.getIntrinsicWidth();
                double intrinsicHeight = (double) drawable.getIntrinsicHeight();
                Double.isNaN(intrinsicWidth);
                Double.isNaN(intrinsicHeight);
                d = intrinsicWidth / intrinsicHeight;
            }
            double d2 = (double) i;
            Double.isNaN(d2);
            drawable.setBounds(0, 0, (int) (d * d2), i);
            if (axVar.mo56113h()) {
                drawable.setColorFilter(((Integer) axVar.mo56107c()).intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter((ColorFilter) null);
            }
        }
        if (textView instanceof Chip) {
            Chip chip = (Chip) textView;
            chip.mo47694q(drawable);
            if (drawable != null) {
                z = true;
            }
            chip.mo47719t(z);
            return;
        }
        textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        if (!TextUtils.isEmpty(textView.getText())) {
            textView.setPadding(bhVar.mo96638K(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: l */
    public static void m180230l(TextView textView, C60870cx cxVar, C91189au auVar, int i, C58833ax axVar, C108237bh bhVar, RecyclerView recyclerView, boolean z) {
        auVar.mo85428r(cxVar, "SuggestCarouselAdapter.ImageCallback", new C108421ib(textView, i, axVar, bhVar, recyclerView, z));
    }

    /* renamed from: p */
    private static boolean m180231p(C108430ik ikVar) {
        String f = ikVar.mo96708f();
        return f != null && !f.isEmpty();
    }

    /* renamed from: b */
    public final int mo96859b() {
        return this.f301554a.size();
    }

    /* renamed from: c */
    public final C28293k mo96860c() {
        if (this.f301558e == null) {
            return C28293k.f76979c;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C108430ik ikVar : this.f301554a) {
            C28292j jVar = ikVar.f301597d;
            aqp aqp = jVar.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159782a |= 2;
            aqs.f159784c = i;
            arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
            i++;
        }
        return C28293k.m52907d(this.f301558e, arrayList);
    }

    /* renamed from: d */
    public final void mo96861d(Collection collection) {
        mo96862e(this.f301554a.size(), collection);
    }

    /* renamed from: e */
    public final void mo96862e(int i, Collection collection) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        collection.size();
        mo96859b();
        this.f301554a.addAll(i, collection);
        this.f301568o = false;
        this.mObservable.mo2882d(i, collection.size());
        mo96865i();
    }

    /* renamed from: g */
    public final void mo96863g() {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(mo96859b() > 0 ? C58979ad.MEDIUM : C58979ad.NONE, "stack size");
        mo96859b();
        mo96864h();
        this.f301554a.clear();
        this.f301557d = false;
        this.f301568o = false;
        this.f301560g = false;
        this.mObservable.mo2879a();
        mo96865i();
        this.f301563j = false;
        this.f301562i = false;
    }

    public final int getItemCount() {
        return this.f301554a.size();
    }

    public final int getItemViewType(int i) {
        int i2;
        C108430ik ikVar = (C108430ik) this.f301554a.get(i);
        if ((ikVar instanceof C108249bt) && ((C108249bt) ikVar).f301136a.mo96699a()) {
            i2 = 0;
        } else if (ikVar instanceof C108344ff) {
            i2 = 5;
        } else {
            i2 = !m180231p(ikVar) ? 4 : 1;
        }
        return ikVar.f301614u ? i2 | 256 : i2;
    }

    /* renamed from: h */
    public final void mo96864h() {
        if (this.f301557d && !this.f301568o) {
            C28293k c = mo96860c();
            View view = this.f301564k;
            view.getClass();
            this.f301569p.mo100721a(0, 0, C28285c.m52876c(c, view));
            this.f301568o = true;
        }
    }

    /* renamed from: i */
    public final void mo96865i() {
        this.f301556c.mo96398k(this.f301554a);
    }

    /* renamed from: j */
    public final void mo96866j(boolean z) {
        this.f301561h = z;
        this.mObservable.mo2879a();
        mo96865i();
    }

    /* renamed from: m */
    public final void mo96867m(boolean z) {
        this.f301562i = z;
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(z ? C58979ad.MEDIUM : C58979ad.NONE, "stack size");
        mo96859b();
    }

    /* renamed from: n */
    public final void mo96868n() {
        Collections.sort(this.f301554a);
        this.mObservable.mo2879a();
    }

    /* renamed from: o */
    public final void mo96869o(RecyclerView recyclerView) {
        this.f301565l = recyclerView;
        recyclerView.addOnScrollListener(this.f301571r);
        RecyclerView recyclerView2 = this.f301565l;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new C19604a((C113798bn) this.f301570q.mo27525b(), false, false));
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        int a;
        C108422ic icVar = (C108422ic) ghVar;
        int dimensionPixelSize = this.f301566m.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_gap);
        C108430ik ikVar = (C108430ik) this.f301554a.get(i);
        if (!ikVar.f301614u) {
            LinearLayout linearLayout = icVar.f301553e;
            double d = 1.0d;
            if (this.f301572s) {
                Chip chip = icVar.f301551c;
                boolean z = !m180231p(ikVar);
                if (z) {
                    chip = icVar.f301552d;
                    chip.getClass();
                }
                chip.getClass();
                if (this.f301573t) {
                    chip.mo47684o(ColorStateList.valueOf(C19391a.m36980a(this.f301567n, R.attr.assistantSuggestionBackground)));
                } else {
                    chip.setBackgroundColor(C19391a.m36980a(this.f301567n, R.attr.colorPrimary));
                }
                chip.setTextColor(C19391a.m36980a(this.f301567n, R.attr.colorOnSurface));
                if (!ikVar.f301615v) {
                    chip.mo47694q((Drawable) null);
                    chip.mo47719t(false);
                    Context context = this.f301566m;
                    C108237bh bhVar = this.f301555b;
                    int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(bhVar.mo96637J());
                    C58833ax Z = bhVar.mo96653Z();
                    chip.setText(ikVar.mo96876g());
                    chip.setElevation((float) this.f301555b.mo96636I());
                    linearLayout.setFocusable(true);
                    linearLayout.setOnFocusChangeListener(new C108416hx(this));
                    if (!this.f301561h && !ikVar.f301617x) {
                        d = this.f301559f.mo79747m(C90014bt.f247207cm);
                    }
                    chip.setAlpha((float) d);
                    if (ikVar instanceof C108431il) {
                        C108431il ilVar = (C108431il) ikVar;
                        C60870cx cxVar = ilVar.f301623c;
                        C91189au auVar = ilVar.f301620B;
                        if (!(cxVar == null || auVar == null)) {
                            m180230l(chip, cxVar, auVar, dimensionPixelSize2, Z, this.f301555b, this.f301565l, this.f301560g);
                        }
                    } else {
                        int i3 = dimensionPixelSize2;
                        if (ikVar instanceof C108249bt) {
                            m180229k(chip, ((C108249bt) ikVar).f301137b, i3, Z, this.f301555b);
                        } else {
                            int i4 = i3;
                            if (ikVar instanceof C108344ff) {
                                C108344ff ffVar = (C108344ff) ikVar;
                                Drawable a2 = ffVar.mo96804a();
                                if (!C82193a.m130503a(context)) {
                                    a2 = ffVar.f301380b.getResources().getDrawable(R.drawable.black_assistant_logo);
                                }
                                m180229k(chip, a2, i4, Z, this.f301555b);
                                ikVar.f301607n = OptionalInt.m71640of(C19391a.m36980a(context, R.attr.assistantOnBackground));
                            }
                        }
                    }
                    if (this.f301561h) {
                        chip.setOnClickListener(new C108417hy(this, ikVar));
                        chip.setOnLongClickListener(new C108418hz(this, ikVar));
                    } else {
                        linearLayout.setClickable(false);
                        linearLayout.setLongClickable(false);
                    }
                    if (z && !TextUtils.isEmpty(ikVar.f301601h)) {
                        chip.setContentDescription(ikVar.f301601h);
                    }
                    chip.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    chip.setGravity(17);
                    chip.setMinHeight((int) C91115n.m148870b(40.0f, this.f301566m));
                    chip.setMinWidth((int) C91115n.m148870b(40.0f, this.f301566m));
                    if (ikVar.f301607n.isPresent()) {
                        chip.setTextColor(ikVar.f301607n.getAsInt());
                    }
                    if (z) {
                        m180228f(chip, this.f301566m.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_chip_material_icon_padding));
                    }
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, this.f301555b.mo96642O()));
                    linearLayout.setPadding(0, 0, dimensionPixelSize, true != this.f301559f.mo79746e(C90014bt.f247760nI) ? dimensionPixelSize : 0);
                    C28295m.m52919e(chip, ikVar.f301597d);
                    return;
                }
                C28295m.m52919e(chip, ikVar.f301597d);
                return;
            }
            TextView textView = icVar.f301549a;
            boolean z2 = !m180231p(ikVar);
            if (z2) {
                textView = icVar.f301550b;
                textView.getClass();
            }
            textView.getClass();
            if (ikVar.f301615v) {
                C28295m.m52919e(textView, ikVar.f301597d);
                return;
            }
            if (!z2) {
                textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setPadding(this.f301566m.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_chip_left_padding), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
            }
            Context context2 = this.f301566m;
            C108237bh bhVar2 = this.f301555b;
            int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(bhVar2.mo96637J());
            C58833ax Z2 = bhVar2.mo96653Z();
            m180227a(ikVar, bhVar2);
            textView.setText(ikVar.mo96876g());
            textView.setElevation((float) this.f301555b.mo96636I());
            linearLayout.setFocusable(true);
            linearLayout.setOnFocusChangeListener(new C108413hu(this));
            if (!this.f301561h && !ikVar.f301617x && ikVar.f301619z) {
                d = this.f301559f.mo79747m(C90014bt.f247207cm);
            }
            textView.setAlpha((float) d);
            if (ikVar instanceof C108431il) {
                C108431il ilVar2 = (C108431il) ikVar;
                C60870cx cxVar2 = ilVar2.f301623c;
                C91189au auVar2 = ilVar2.f301620B;
                if (!(cxVar2 == null || auVar2 == null)) {
                    m180230l(textView, cxVar2, auVar2, dimensionPixelSize3, Z2, this.f301555b, this.f301565l, this.f301560g);
                }
            } else {
                C58833ax axVar = Z2;
                int i5 = dimensionPixelSize3;
                if (ikVar instanceof C108249bt) {
                    Drawable drawable = ((C108249bt) ikVar).f301137b;
                    if (drawable != null) {
                        m180229k(textView, drawable, i5, axVar, this.f301555b);
                    }
                } else {
                    C58833ax axVar2 = axVar;
                    if (ikVar instanceof C108344ff) {
                        Drawable a3 = ((C108344ff) ikVar).mo96804a();
                        if (a3 != null) {
                            m180229k(textView, a3, i5, axVar2, this.f301555b);
                        }
                        ikVar.f301607n = OptionalInt.m71640of(context2.getResources().getColor(R.color.chatui_more_things_to_try_text_color));
                    }
                }
            }
            if (this.f301561h || !ikVar.f301619z) {
                linearLayout.setOnClickListener(new C108414hv(this, ikVar));
                linearLayout.setOnLongClickListener(new C108415hw(this, ikVar));
            } else {
                linearLayout.setClickable(false);
                linearLayout.setLongClickable(false);
            }
            if (this.f301559f.mo79746e(C90014bt.f247760nI) && (a = (int) this.f301559f.mo79743a(C90014bt.f247773nV)) > 0) {
                textView.setTextSize(2, (float) a);
            }
            if (z2 && !TextUtils.isEmpty(ikVar.f301601h)) {
                textView.setContentDescription(ikVar.f301601h);
            }
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setGravity(17);
            boolean a4 = C82193a.m130503a(this.f301566m);
            int i6 = R.drawable.chatui_suggestion_background_v3;
            if (!a4 && !this.f301559f.mo79746e(C90014bt.f247760nI)) {
                i6 = R.drawable.chatui_suggestion_background_v2;
            }
            int paddingLeft = textView.getPaddingLeft();
            int paddingRight = textView.getPaddingRight();
            int paddingTop = textView.getPaddingTop();
            int paddingBottom = textView.getPaddingBottom();
            textView.setBackgroundResource(i6);
            textView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            Resources resources = this.f301566m.getResources();
            if (C82193a.m130503a(this.f301566m)) {
                i2 = R.color.google_white;
            } else {
                i2 = this.f301559f.mo79746e(C90014bt.f247760nI) ? R.color.chatui_suggestion_text_v3 : R.color.chatui_suggestion_text_v2;
            }
            textView.setTextColor(resources.getColor(i2));
            if (ikVar.f301607n.isPresent()) {
                textView.setTextColor(ikVar.f301607n.getAsInt());
            }
            if (ikVar.f301608o.isPresent() || ikVar.f301609p.isPresent()) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius((float) this.f301566m.getResources().getDimensionPixelSize(R.dimen.chatui_bubble_radius_v2));
                if (ikVar.f301608o.isPresent()) {
                    gradientDrawable.setColor(ikVar.f301608o.getAsInt());
                }
                if (ikVar.f301609p.isPresent()) {
                    gradientDrawable.setStroke(this.f301566m.getResources().getDimensionPixelSize(R.dimen.chatui_bubble_stroke_width), ikVar.f301609p.getAsInt());
                }
                int paddingLeft2 = textView.getPaddingLeft();
                int paddingRight2 = textView.getPaddingRight();
                int paddingTop2 = textView.getPaddingTop();
                int paddingBottom2 = textView.getPaddingBottom();
                textView.setBackground(gradientDrawable);
                textView.setPadding(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
            }
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, this.f301555b.mo96642O()));
            linearLayout.setPadding(0, 0, dimensionPixelSize, true != this.f301559f.mo79746e(C90014bt.f247760nI) ? dimensionPixelSize : 0);
            C28295m.m52919e(textView, ikVar.f301597d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ android.support.p033v7.widget.C0673gh onCreateViewHolder(android.view.ViewGroup r10, int r11) {
        /*
            r9 = this;
            android.view.LayoutInflater r10 = r9.f301574u
            r0 = 2131624560(0x7f0e0270, float:1.8876303E38)
            r1 = 0
            r2 = 0
            android.view.View r10 = r10.inflate(r0, r1, r2)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            com.google.android.apps.gsa.staticplugins.opa.chatui.ic r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ic
            r0.<init>(r10)
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 <= 0) goto L_0x001a
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00dd
        L_0x001a:
            boolean r3 = r9.f301572s
            r4 = 16842871(0x1010077, float:2.3693892E-38)
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0078
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 == 0) goto L_0x0059
            if (r11 == r8) goto L_0x0059
            if (r11 == r7) goto L_0x0051
            if (r11 == r6) goto L_0x0034
            if (r11 == r5) goto L_0x0059
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0067
        L_0x0034:
            com.google.android.material.chip.Chip r11 = new com.google.android.material.chip.Chip
            android.view.ContextThemeWrapper r1 = r9.f301567n
            r11.<init>(r1)
            r0.f301552d = r11
            com.google.android.material.chip.Chip r11 = r0.f301552d
            android.view.ContextThemeWrapper r1 = r9.f301567n
            r3 = 2130969167(0x7f04024f, float:1.7547008E38)
            int r1 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r1, r3)
            r11.setBackgroundColor(r1)
            com.google.android.material.chip.Chip r11 = r0.f301552d
            r11.mo47683n(r2)
            goto L_0x0067
        L_0x0051:
            android.widget.ProgressBar r11 = new android.widget.ProgressBar
            android.content.Context r2 = r9.f301566m
            r11.<init>(r2, r1, r4)
            goto L_0x0067
        L_0x0059:
            com.google.android.material.chip.Chip r11 = new com.google.android.material.chip.Chip
            android.view.ContextThemeWrapper r1 = r9.f301567n
            r11.<init>(r1)
            r0.f301551c = r11
            com.google.android.material.chip.Chip r11 = r0.f301551c
            r11.mo47683n(r2)
        L_0x0067:
            com.google.android.material.chip.Chip r11 = r0.f301551c
            if (r11 == 0) goto L_0x0070
            r10.addView(r11)
            goto L_0x00dd
        L_0x0070:
            com.google.android.material.chip.Chip r11 = r0.f301552d
            if (r11 == 0) goto L_0x00dd
            r10.addView(r11)
            goto L_0x00dd
        L_0x0078:
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 == 0) goto L_0x00bf
            if (r11 == r8) goto L_0x00af
            if (r11 == r7) goto L_0x00a7
            if (r11 == r6) goto L_0x0097
            if (r11 == r5) goto L_0x0087
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ce
        L_0x0087:
            com.google.android.apps.gsa.assistant.shared.FlowTextView r11 = new com.google.android.apps.gsa.assistant.shared.FlowTextView
            android.view.ContextThemeWrapper r3 = r9.f301567n
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r9.f301555b
            int r4 = r4.mo96632E()
            r11.<init>(r3, r1, r2, r4)
            r0.f301549a = r11
            goto L_0x00ce
        L_0x0097:
            com.google.android.apps.gsa.assistant.shared.FlowTextView r11 = new com.google.android.apps.gsa.assistant.shared.FlowTextView
            android.view.ContextThemeWrapper r3 = r9.f301567n
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r9.f301555b
            int r4 = r4.mo96640M()
            r11.<init>(r3, r1, r2, r4)
            r0.f301550b = r11
            goto L_0x00ce
        L_0x00a7:
            android.widget.ProgressBar r11 = new android.widget.ProgressBar
            android.content.Context r2 = r9.f301566m
            r11.<init>(r2, r1, r4)
            goto L_0x00ce
        L_0x00af:
            com.google.android.apps.gsa.assistant.shared.FlowTextView r11 = new com.google.android.apps.gsa.assistant.shared.FlowTextView
            android.view.ContextThemeWrapper r3 = r9.f301567n
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r9.f301555b
            int r4 = r4.mo96641N()
            r11.<init>(r3, r1, r2, r4)
            r0.f301549a = r11
            goto L_0x00ce
        L_0x00bf:
            com.google.android.apps.gsa.assistant.shared.FlowTextView r11 = new com.google.android.apps.gsa.assistant.shared.FlowTextView
            android.content.Context r3 = r9.f301566m
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r9.f301555b
            int r4 = r4.mo96683z()
            r11.<init>(r3, r1, r2, r4)
            r0.f301549a = r11
        L_0x00ce:
            android.widget.TextView r11 = r0.f301549a
            if (r11 == 0) goto L_0x00d6
            r10.addView(r11)
            goto L_0x00dd
        L_0x00d6:
            android.widget.TextView r11 = r0.f301550b
            if (r11 == 0) goto L_0x00dd
            r10.addView(r11)
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id.onCreateViewHolder(android.view.ViewGroup, int):android.support.v7.widget.gh");
    }
}
