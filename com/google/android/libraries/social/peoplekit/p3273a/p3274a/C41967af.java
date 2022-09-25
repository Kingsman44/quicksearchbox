package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42026c;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42027d;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42085e;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42086f;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.C42138b;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.af */
/* compiled from: PG */
public final class C41967af implements C42138b {

    /* renamed from: u */
    private static final DecelerateInterpolator f109528u = new DecelerateInterpolator();

    /* renamed from: a */
    public final Context f109529a;

    /* renamed from: b */
    public final View f109530b;

    /* renamed from: c */
    public final View f109531c;

    /* renamed from: d */
    public final C42027d f109532d;

    /* renamed from: e */
    public final TextView f109533e;

    /* renamed from: f */
    public final TextView f109534f;

    /* renamed from: g */
    public final LinearLayout f109535g;

    /* renamed from: h */
    public final PeopleKitSelectionModel f109536h;

    /* renamed from: i */
    public final C42075e f109537i;

    /* renamed from: j */
    public final PeopleKitConfig f109538j;

    /* renamed from: k */
    public final C42089b f109539k;

    /* renamed from: l */
    public final PeopleKitVisualElementPath f109540l;

    /* renamed from: m */
    public C41960a f109541m;

    /* renamed from: n */
    public CoalescedChannels f109542n;

    /* renamed from: o */
    public Channel f109543o;

    /* renamed from: p */
    public boolean f109544p;

    /* renamed from: q */
    public int f109545q;

    /* renamed from: r */
    public C42141b f109546r;

    /* renamed from: s */
    public final C42086f f109547s;

    /* renamed from: t */
    public ColorStateList f109548t;

    /* renamed from: v */
    private final TextView f109549v;

    /* renamed from: w */
    private final PeopleKitDataLayer f109550w;

    /* renamed from: x */
    private final boolean f109551x;

    /* renamed from: y */
    private ColorStateList f109552y;

    /* renamed from: z */
    private final C41996o f109553z;

    public C41967af(Context context, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C41996o oVar, C42075e eVar, PeopleKitConfig peopleKitConfig, C42089b bVar, PeopleKitVisualElementPath peopleKitVisualElementPath, C42141b bVar2) {
        this.f109529a = context;
        this.f109553z = oVar;
        this.f109537i = eVar;
        this.f109538j = peopleKitConfig;
        this.f109539k = bVar;
        this.f109540l = peopleKitVisualElementPath;
        C42087a.m73675a(bVar2);
        this.f109546r = bVar2;
        C42085e eVar2 = new C42085e();
        eVar2.f110007a = this.f109546r;
        eVar2.f110008b = context;
        eVar2.f110009c = executorService;
        eVar2.f110010d = peopleKitDataLayer;
        eVar2.f110011e = eVar;
        eVar2.f110012f = peopleKitVisualElementPath;
        eVar2.f110013g = null;
        this.f109547s = eVar2.mo44594a();
        C42087a.m73676b(this.f109546r);
        View inflate = LayoutInflater.from(context).inflate(R.layout.expandable_peoplekit_row_view, (ViewGroup) null);
        this.f109530b = inflate;
        this.f109531c = inflate.findViewById(R.id.peoplekit_listview_main_row);
        this.f109533e = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_name);
        this.f109534f = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_method);
        this.f109549v = (TextView) inflate.findViewById(R.id.peoplekit_listview_status_text);
        this.f109535g = (LinearLayout) inflate.findViewById(R.id.peoplekit_listview_expanded_contact_methods);
        this.f109550w = peopleKitDataLayer;
        this.f109536h = peopleKitSelectionModel;
        peopleKitSelectionModel.mo44747d(this);
        C42026c cVar = new C42026c(context, eVar, peopleKitVisualElementPath);
        cVar.f109783d = peopleKitConfig;
        cVar.f109784e = bVar2;
        C42027d dVar = new C42027d(cVar);
        this.f109532d = dVar;
        dVar.f109785a.setFocusable(false);
        dVar.f109785a.setImportantForAccessibility(2);
        dVar.f109790f = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_icon_offset);
        ((RelativeLayout) inflate.findViewById(R.id.peoplekit_listview_row_avatar)).addView(dVar.f109785a);
        this.f109551x = ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
        mo44428k();
    }

    /* renamed from: l */
    private final String m73484l(Channel channel) {
        if (this.f109544p) {
            return C42096f.m73804i(channel, this.f109529a);
        }
        if (!channel.mo44611C()) {
            return channel.mo44630k(this.f109529a);
        }
        Context context = this.f109529a;
        return context.getString(R.string.peoplekit_listview_send_via_app, new Object[]{channel.mo44630k(context)});
    }

    /* renamed from: m */
    private final void m73485m(String str) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(32);
        obtain.getText().add(str);
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f109529a.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: n */
    private final void m73486n(View view) {
        for (int i = 0; i < this.f109535g.getChildCount(); i++) {
            View childAt = this.f109535g.getChildAt(i);
            childAt.findViewById(R.id.peoplekit_listview_checkmark).setVisibility(childAt != view ? 4 : 0);
        }
    }

    /* renamed from: o */
    private final void m73487o() {
        C42027d dVar = this.f109532d;
        int i = 1;
        if (true == this.f109536h.mo44751g(this.f109543o)) {
            i = 2;
        }
        dVar.mo44511g(i);
        mo44427j();
    }

    /* renamed from: a */
    public final C41952a mo44418a() {
        if (!this.f109536h.mo44751g(this.f109543o)) {
            if (this.f109543o.mo44620a() == 2) {
                C41952a aVar = new C41952a(C54941a.f144458U);
                aVar.f109502b = Integer.valueOf(this.f109545q);
                return aVar;
            }
            C41952a aVar2 = new C41952a(C54941a.f144442E);
            aVar2.f109502b = Integer.valueOf(this.f109545q);
            return aVar2;
        } else if (this.f109543o.mo44620a() == 2) {
            C41952a aVar3 = new C41952a(C54941a.f144454Q);
            aVar3.f109502b = Integer.valueOf(this.f109545q);
            return aVar3;
        } else {
            C41952a aVar4 = new C41952a(C54941a.f144453P);
            aVar4.f109502b = Integer.valueOf(this.f109545q);
            return aVar4;
        }
    }

    /* renamed from: b */
    public final void mo44419b(Channel channel) {
        this.f109550w.mo44666k(channel, new C41963ab(this, channel));
    }

    /* renamed from: c */
    public final void mo44420c(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        int i;
        int i2;
        int i3;
        int i4;
        ImageView imageView = (ImageView) this.f109530b.findViewById(R.id.peoplekit_listview_chevron);
        float f = 180.0f;
        float f2 = 0.0f;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (true != z) {
                f = 0.0f;
            }
            animate.rotation(f).setDuration(200).start();
        } else {
            if (true != z) {
                f = 0.0f;
            }
            imageView.setRotation(f);
        }
        Resources resources = this.f109529a.getResources();
        if (z2) {
            this.f109533e.animate().translationY(z ? (float) resources.getDimensionPixelSize(R.dimen.peoplekit_listview_name_expanded_offset) : 0.0f).setInterpolator(f109528u).setDuration(200).start();
        } else {
            this.f109533e.setTranslationY(z ? (float) resources.getDimensionPixelSize(R.dimen.peoplekit_listview_name_expanded_offset) : 0.0f);
        }
        int i5 = 0;
        if (z) {
            Context context = this.f109529a;
            imageView.setContentDescription(context.getString(R.string.peoplekit_collapse_button_content_description, new Object[]{this.f109543o.mo44631l(context)}));
            Context context2 = this.f109529a;
            m73485m(context2.getString(R.string.peoplekit_contact_expanded_announcement, new Object[]{this.f109543o.mo44631l(context2)}));
        } else {
            Context context3 = this.f109529a;
            imageView.setContentDescription(context3.getString(R.string.peoplekit_expand_button_content_description, new Object[]{this.f109543o.mo44631l(context3)}));
            Context context4 = this.f109529a;
            m73485m(context4.getString(R.string.peoplekit_contact_collapsed_announcement, new Object[]{this.f109543o.mo44631l(context4)}));
        }
        this.f109533e.setTypeface(Typeface.SANS_SERIF, z ? 1 : 0);
        C42141b bVar = this.f109546r;
        int i6 = bVar.f110297p;
        if (!(i6 == 0 || (i = bVar.f110294m) == 0)) {
            if (z) {
                i2 = C1878d.m5128a(this.f109529a, i6);
            } else {
                i2 = C1878d.m5128a(this.f109529a, i);
            }
            if (z) {
                i3 = C1878d.m5128a(this.f109529a, this.f109546r.f110294m);
            } else {
                i3 = C1878d.m5128a(this.f109529a, this.f109546r.f110297p);
            }
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{i3, i2}).setDuration(200);
            duration.setEvaluator(new ArgbEvaluator());
            Drawable c = C0678gm.m2375e().mo3100c(this.f109529a, R.drawable.quantum_gm_ic_expand_more_gm_grey_24);
            if (z2) {
                duration.addUpdateListener(new C41965ad(c, duration, imageView));
                duration.start();
            } else {
                Drawable mutate = c.mutate();
                if (z) {
                    i4 = C1878d.m5128a(this.f109529a, this.f109546r.f110297p);
                } else {
                    i4 = C1878d.m5128a(this.f109529a, this.f109546r.f110294m);
                }
                C1929b.m5225f(mutate, i4);
                imageView.setImageDrawable(c);
            }
        }
        if (!z2) {
            TextView textView = this.f109534f;
            if (true != z) {
                f2 = 1.0f;
            }
            textView.setAlpha(f2);
            this.f109534f.setVisibility(true != z ? 0 : 4);
        } else if (z) {
            this.f109534f.setAlpha(1.0f);
            this.f109534f.animate().alpha(0.0f).setDuration(200).setListener(new C41966ae(this)).start();
        } else {
            this.f109534f.setVisibility(0);
            this.f109534f.setAlpha(0.0f);
            this.f109534f.animate().alpha(1.0f).setDuration(200).setListener(new C42001t(this)).start();
        }
        int measuredHeight = this.f109530b.findViewById(R.id.peoplekit_listview_main_row).getMeasuredHeight();
        int childCount = (this.f109535g.getChildCount() * resources.getDimensionPixelSize(R.dimen.peoplekit_listview_expanded_contact_row_height)) + measuredHeight + resources.getDimensionPixelSize(R.dimen.peoplekit_listview_row_top_padding);
        if (z) {
            this.f109535g.setVisibility(0);
        }
        if (z) {
            valueAnimator = ValueAnimator.ofInt(new int[]{measuredHeight, childCount});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{childCount, measuredHeight});
        }
        View findViewById = this.f109530b.findViewById(R.id.peoplekit_listview_main_content);
        if (z2) {
            valueAnimator.addUpdateListener(new C42002u(this, findViewById, z));
            valueAnimator.setDuration(200);
            valueAnimator.setInterpolator(f109528u);
            valueAnimator.start();
        } else {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (true == z) {
                measuredHeight = childCount;
            }
            layoutParams.height = measuredHeight;
            LinearLayout linearLayout = this.f109535g;
            if (true != z) {
                i5 = 8;
            }
            linearLayout.setVisibility(i5);
        }
        if (z2) {
            if (z) {
                this.f109553z.f109663a.f109667b.add(this.f109542n);
            } else {
                this.f109553z.f109663a.f109667b.remove(this.f109542n);
            }
        }
        if (z) {
            for (Channel n : this.f109542n.mo44648c()) {
                this.f109550w.mo44669n(n);
            }
        }
    }

    /* renamed from: d */
    public final void mo44421d() {
        ((InputMethodManager) this.f109529a.getSystemService("input_method")).hideSoftInputFromWindow(this.f109530b.getWindowToken(), 0);
    }

    /* renamed from: e */
    public final void mo44422e(Channel channel) {
        if (this.f109542n != null) {
            if (((PeopleKitConfigImpl) this.f109538j).f110258y && this.f109536h.mo44746c().isEmpty()) {
                this.f109534f.setTextColor(this.f109548t);
                for (int i = 0; i < this.f109535g.getChildCount(); i++) {
                    ((TextView) this.f109535g.getChildAt(i).findViewById(R.id.peoplekit_listview_expanded_contact_method_text_view)).setTextColor(this.f109552y);
                }
            }
            List c = this.f109542n.mo44648c();
            for (int i2 = 0; i2 < c.size(); i2++) {
                if (((Channel) c.get(i2)).equals(channel)) {
                    m73487o();
                    m73486n((View) null);
                    this.f109530b.findViewById(R.id.peoplekit_listview_main_content).setContentDescription((CharSequence) null);
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo44424g(CoalescedChannels coalescedChannels) {
        if (this.f109535g.getChildCount() <= 0) {
            coalescedChannels.mo44650e(this.f109529a);
            List c = this.f109542n.mo44648c();
            for (int i = 0; i < c.size(); i++) {
                Channel channel = (Channel) c.get(i);
                C42087a.m73676b(this.f109546r);
                View inflate = LayoutInflater.from(this.f109529a).inflate(R.layout.peoplekit_expanded_contact_method_field, this.f109535g, false);
                int i2 = this.f109546r.f110282a;
                if (i2 != 0) {
                    inflate.setBackgroundColor(C1878d.m5128a(this.f109529a, i2));
                }
                TextView textView = (TextView) inflate.findViewById(R.id.peoplekit_listview_expanded_contact_method_text_view);
                int i3 = this.f109546r.f110289h;
                if (i3 != 0) {
                    textView.setTextColor(C1878d.m5128a(this.f109529a, i3));
                }
                if (this.f109552y == null) {
                    this.f109552y = textView.getTextColors();
                }
                if (!((PeopleKitConfigImpl) this.f109538j).f110258y || this.f109536h.mo44750f(channel)) {
                    textView.setTextColor(this.f109552y);
                } else {
                    textView.setTextColor(C1878d.m5128a(this.f109529a, R.color.google_grey500));
                }
                textView.setText(m73484l(channel));
                if (!((PeopleKitConfigImpl) this.f109538j).f110250q) {
                    if (this.f109536h.mo44751g(channel)) {
                        inflate.findViewById(R.id.peoplekit_listview_checkmark).setVisibility(0);
                        this.f109532d.mo44511g(2);
                        this.f109534f.setText(m73484l(channel));
                        inflate.setContentDescription(this.f109529a.getString(R.string.peoplekit_contact_name_and_method_selected_description, new Object[]{m73484l(channel), BuildConfig.FLAVOR}));
                    } else {
                        inflate.setContentDescription(this.f109529a.getString(R.string.peoplekit_contact_method_unselected_description, new Object[]{m73484l(channel)}));
                    }
                    inflate.setOnClickListener(new C42007z(this, i, channel, coalescedChannels));
                }
                this.f109535g.addView(inflate);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e4, code lost:
        if (android.text.TextUtils.isEmpty(r0.mo44627h()) == false) goto L_0x02ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02e9  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44425h(com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels r15) {
        /*
            r14 = this;
            r14.f109542n = r15
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r14.f109538j
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110258y
            if (r0 == 0) goto L_0x002d
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r0 = r14.f109536h
            java.util.Set r0 = r0.mo44746c()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002d
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r0 = r14.f109536h
            java.util.Set r0 = r0.mo44746c()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r0
            int r0 = r0.mo44621b()
            r15.mo44651f(r0)
        L_0x002d:
            android.widget.LinearLayout r0 = r14.f109535g
            r0.removeAllViews()
            java.util.List r0 = r15.mo44648c()
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r2 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r2
            r14.f109543o = r2
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r0.next()
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r2 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r2
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r3 = r14.f109536h
            boolean r3 = r3.mo44751g(r2)
            if (r3 == 0) goto L_0x0043
            r14.f109543o = r2
            goto L_0x0043
        L_0x005a:
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r0 = r14.f109532d
            if (r0 == 0) goto L_0x0061
            r14.mo44427j()
        L_0x0061:
            int r0 = r15.mo44646a()
            r2 = 2
            r3 = 1
            if (r0 != r3) goto L_0x016c
            android.content.Context r0 = r14.f109529a
            java.util.List r4 = r15.mo44648c()
            java.lang.Object r4 = r4.get(r1)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r4
            java.util.List r5 = r15.mo44649d()
            java.lang.String r6 = r4.mo44631l(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x008b
            java.lang.String r0 = r4.mo44631l(r0)
            goto L_0x010a
        L_0x008b:
            com.google.common.base.ax r4 = r15.mo44647b()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.mo56109e(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x00b0
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x00b0
            java.lang.Object r4 = r5.get(r1)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r4
            java.lang.String r0 = r4.mo44631l(r0)
            goto L_0x010a
        L_0x00b0:
            r4 = r7
            r6 = 0
        L_0x00b2:
            int r8 = r5.size()
            if (r6 >= r8) goto L_0x00e5
            java.lang.Object r8 = r5.get(r6)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r8 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r8
            java.lang.String r9 = r8.mo44632m()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x00cd
            java.lang.String r8 = r8.mo44631l(r0)
            goto L_0x00d1
        L_0x00cd:
            java.lang.String r8 = r8.mo44632m()
        L_0x00d1:
            if (r6 != 0) goto L_0x00d5
            r4 = r8
            goto L_0x00e2
        L_0x00d5:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r1] = r4
            r9[r3] = r8
            r4 = 2132090997(0x7f152075, float:1.982235E38)
            java.lang.String r4 = r0.getString(r4, r9)
        L_0x00e2:
            int r6 = r6 + 1
            goto L_0x00b2
        L_0x00e5:
            com.google.common.base.ax r6 = r15.mo44647b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r6.mo56109e(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r5 = r5.size()
            if (r6 <= r5) goto L_0x0109
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r1] = r4
            r4 = 2132090998(0x7f152076, float:1.9822352E38)
            java.lang.String r0 = r0.getString(r4, r5)
            goto L_0x010a
        L_0x0109:
            r0 = r4
        L_0x010a:
            android.widget.TextView r4 = r14.f109533e
            r4.setText(r0)
            com.google.common.base.ax r4 = r15.mo44647b()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.mo56109e(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0141
            java.util.List r4 = r15.mo44649d()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0141
            java.util.List r4 = r15.mo44649d()
            java.lang.Object r4 = r4.get(r1)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r4
            java.lang.String r7 = r14.m73484l(r4)
            android.widget.TextView r4 = r14.f109534f
            r4.setText(r7)
            goto L_0x0184
        L_0x0141:
            com.google.common.base.ax r4 = r15.mo44647b()
            java.lang.Object r4 = r4.mo56109e(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= r3) goto L_0x0184
            android.content.Context r4 = r14.f109529a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.google.common.base.ax r6 = r15.mo44647b()
            java.lang.Object r6 = r6.mo56107c()
            r5[r1] = r6
            r6 = 2132090996(0x7f152074, float:1.9822348E38)
            java.lang.String r7 = r4.getString(r6, r5)
            android.widget.TextView r4 = r14.f109534f
            r4.setText(r7)
            goto L_0x0184
        L_0x016c:
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = r14.f109543o
            android.content.Context r4 = r14.f109529a
            java.lang.String r0 = r0.mo44631l(r4)
            android.widget.TextView r4 = r14.f109533e
            r4.setText(r0)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = r14.f109543o
            java.lang.String r7 = r14.m73484l(r4)
            android.widget.TextView r4 = r14.f109534f
            r4.setText(r7)
        L_0x0184:
            r13 = r0
            r12 = r7
            com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer r0 = r14.f109550w
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = r14.f109543o
            r0.mo44669n(r4)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = r14.f109543o
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r4 = r14.f109538j
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r4 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r4
            java.lang.String r5 = r4.f110234a
            java.lang.String r4 = r4.f110238e
            boolean r0 = com.google.android.libraries.social.peoplekit.common.dataservice.C42096f.m73800e(r0, r5, r4)
            if (r0 == 0) goto L_0x01ad
            android.content.Context r4 = r14.f109529a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132091022(0x7f15208e, float:1.98224E38)
            java.lang.String r4 = r4.getString(r5)
            r14.mo44426i(r4)
        L_0x01ad:
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r4 = r14.f109532d
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r5 = r14.f109536h
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r6 = r14.f109543o
            boolean r5 = r5.mo44751g(r6)
            if (r3 == r5) goto L_0x01bb
            r5 = 1
            goto L_0x01bc
        L_0x01bb:
            r5 = 2
        L_0x01bc:
            r4.mo44511g(r5)
            android.view.View r4 = r14.f109530b
            r5 = 2131434410(0x7f0b1baa, float:1.8490633E38)
            android.view.View r4 = r4.findViewById(r5)
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r5 = r14.f109536h
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r6 = r14.f109543o
            boolean r5 = r5.mo44751g(r6)
            r6 = 0
            if (r5 == 0) goto L_0x01f6
            android.view.View r5 = r14.f109530b
            android.content.Context r7 = r14.f109529a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r8 = r14.f109543o
            java.lang.String r8 = r8.mo44631l(r7)
            r2[r1] = r8
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r8 = r14.f109543o
            android.content.Context r9 = r14.f109529a
            java.lang.String r8 = r8.mo44630k(r9)
            r2[r3] = r8
            r8 = 2132090989(0x7f15206d, float:1.9822334E38)
            java.lang.String r2 = r7.getString(r8, r2)
            r5.setContentDescription(r2)
            goto L_0x01fb
        L_0x01f6:
            android.view.View r2 = r14.f109530b
            r2.setContentDescription(r6)
        L_0x01fb:
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r2 = r14.f109538j
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r2 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r2
            boolean r2 = r2.f110258y
            if (r2 != 0) goto L_0x0204
            goto L_0x0224
        L_0x0204:
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r2 = r14.f109536h
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r5 = r14.f109543o
            boolean r2 = r2.mo44750f(r5)
            if (r2 != 0) goto L_0x021d
            android.widget.TextView r2 = r14.f109534f
            android.content.Context r5 = r14.f109529a
            r7 = 2131101920(0x7f0608e0, float:1.7816263E38)
            int r5 = androidx.core.content.C1878d.m5128a(r5, r7)
            r2.setTextColor(r5)
            goto L_0x0224
        L_0x021d:
            android.widget.TextView r2 = r14.f109534f
            android.content.res.ColorStateList r5 = r14.f109548t
            r2.setTextColor(r5)
        L_0x0224:
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r2 = r14.f109538j
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r2 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r2
            boolean r2 = r2.f110252s
            if (r2 != 0) goto L_0x0287
            if (r0 == 0) goto L_0x0287
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r15 = r14.f109532d
            android.view.View r15 = r15.f109785a
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            r15.setAlpha(r0)
            com.google.android.libraries.social.peoplekit.configs.b r15 = r14.f109546r
            int r15 = r15.f110287f
            if (r15 == 0) goto L_0x0258
            android.widget.TextView r0 = r14.f109533e
            android.content.Context r2 = r14.f109529a
            int r15 = androidx.core.content.C1878d.m5128a(r2, r15)
            r0.setTextColor(r15)
            android.widget.TextView r15 = r14.f109549v
            android.content.Context r0 = r14.f109529a
            com.google.android.libraries.social.peoplekit.configs.b r2 = r14.f109546r
            int r2 = r2.f110287f
            int r0 = androidx.core.content.C1878d.m5128a(r0, r2)
            r15.setTextColor(r0)
        L_0x0258:
            android.view.View r15 = r14.f109530b
            r15.setClickable(r1)
            boolean r15 = r14.f109551x
            if (r15 == 0) goto L_0x027c
            android.view.View r15 = r14.f109530b
            androidx.core.j.c r0 = new androidx.core.j.c
            android.view.View$AccessibilityDelegate r1 = androidx.core.p098j.C2061c.DEFAULT_DELEGATE
            r0.<init>(r1)
            androidx.core.p098j.C2043bi.m5526T(r15, r0)
            android.content.Context r15 = r14.f109529a
            r0 = 2132091020(0x7f15208c, float:1.9822396E38)
            java.lang.String r15 = r15.getString(r0)
            android.widget.TextView r0 = r14.f109549v
            r0.setContentDescription(r15)
            return
        L_0x027c:
            android.view.View r15 = r14.f109530b
            com.google.android.libraries.social.peoplekit.a.a.v r0 = new com.google.android.libraries.social.peoplekit.a.a.v
            r0.<init>(r14)
            r15.setOnClickListener(r0)
            return
        L_0x0287:
            com.google.android.libraries.social.peoplekit.a.a.w r0 = new com.google.android.libraries.social.peoplekit.a.a.w
            r0.<init>(r14, r15)
            r4.setOnClickListener(r0)
            boolean r0 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r0 == 0) goto L_0x02e6
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r14.f109538j
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110255v
            if (r0 != 0) goto L_0x029e
            goto L_0x02e6
        L_0x029e:
            int r0 = r15.mo44646a()
            if (r0 != 0) goto L_0x02bc
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = r14.f109543o
            int r0 = r0.mo44621b()
            if (r0 == 0) goto L_0x02e6
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = r14.f109543o
            java.lang.String r0 = r0.mo44627h()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02e6
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = r14.f109543o
        L_0x02ba:
            r11 = r0
            goto L_0x02e7
        L_0x02bc:
            int r0 = r15.mo44646a()
            if (r0 != r3) goto L_0x02e6
            java.util.List r0 = r15.mo44649d()
            int r0 = r0.size()
            if (r0 != r3) goto L_0x02e6
            java.util.List r0 = r15.mo44649d()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r0
            int r2 = r0.mo44621b()
            if (r2 == 0) goto L_0x02e6
            java.lang.String r2 = r0.mo44627h()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x02ba
        L_0x02e6:
            r11 = r6
        L_0x02e7:
            if (r11 == 0) goto L_0x02f4
            com.google.android.libraries.social.peoplekit.a.a.x r0 = new com.google.android.libraries.social.peoplekit.a.a.x
            r8 = r0
            r9 = r14
            r10 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r4.setOnLongClickListener(r0)
        L_0x02f4:
            com.google.common.base.ax r0 = r15.mo44647b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo56109e(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 <= r3) goto L_0x0361
            int r0 = r15.mo44646a()
            if (r0 == r3) goto L_0x0361
            android.view.View r0 = r14.f109530b
            r2 = 2131434388(0x7f0b1b94, float:1.8490589E38)
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r1)
            com.google.android.libraries.social.peoplekit.configs.b r4 = r14.f109546r
            int r4 = r4.f110294m
            if (r4 == 0) goto L_0x0343
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.graphics.drawable.Drawable r4 = r4.getDrawable()
            android.graphics.drawable.Drawable r5 = r4.mutate()
            android.content.Context r6 = r14.f109529a
            com.google.android.libraries.social.peoplekit.configs.b r7 = r14.f109546r
            int r7 = r7.f110294m
            int r6 = androidx.core.content.C1878d.m5128a(r6, r7)
            androidx.core.graphics.drawable.C1929b.m5225f(r5, r6)
            android.view.View r5 = r14.f109530b
            android.view.View r2 = r5.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r4)
        L_0x0343:
            android.content.Context r2 = r14.f109529a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = r14.f109543o
            java.lang.String r4 = r4.mo44631l(r2)
            r3[r1] = r4
            r1 = 2132090994(0x7f152072, float:1.9822344E38)
            java.lang.String r1 = r2.getString(r1, r3)
            r0.setContentDescription(r1)
            com.google.android.libraries.social.peoplekit.a.a.y r1 = new com.google.android.libraries.social.peoplekit.a.a.y
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
        L_0x0361:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41967af.mo44425h(com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels):void");
    }

    /* renamed from: i */
    public final void mo44426i(String str) {
        this.f109549v.setText(str);
        this.f109549v.setVisibility(true != TextUtils.isEmpty(str) ? 0 : 8);
    }

    /* renamed from: j */
    public final void mo44427j() {
        if (((PeopleKitConfigImpl) this.f109538j).f110253t) {
            ((ImageView) this.f109532d.f109785a.findViewById(R.id.peoplekit_avatars_in_app_indicator)).setVisibility(true != this.f109543o.mo44611C() ? 8 : 0);
        }
    }

    /* renamed from: k */
    public final void mo44428k() {
        View findViewById = this.f109530b.findViewById(R.id.peoplekit_listview_header);
        int i = this.f109546r.f110282a;
        if (i != 0) {
            this.f109530b.setBackgroundColor(C1878d.m5128a(this.f109529a, i));
            findViewById.setBackgroundColor(C1878d.m5128a(this.f109529a, this.f109546r.f110282a));
            this.f109531c.setBackgroundColor(C1878d.m5128a(this.f109529a, this.f109546r.f110282a));
            this.f109530b.findViewById(R.id.peoplekit_listview_permissions_row).setBackgroundColor(C1878d.m5128a(this.f109529a, this.f109546r.f110282a));
        }
        if (this.f109546r.f110286e != 0) {
            ((TextView) this.f109530b.findViewById(R.id.peoplekit_listview_main_header)).setTextColor(C1878d.m5128a(this.f109529a, this.f109546r.f110286e));
        }
        if (this.f109546r.f110287f != 0) {
            ((TextView) this.f109530b.findViewById(R.id.peoplekit_listview_header_letter)).setTextColor(C1878d.m5128a(this.f109529a, this.f109546r.f110287f));
            C1929b.m5225f(((ImageView) this.f109530b.findViewById(R.id.peoplekit_listview_header_info_icon)).getDrawable().mutate(), C1878d.m5128a(this.f109529a, this.f109546r.f110287f));
        }
        for (int i2 = 0; i2 < this.f109535g.getChildCount(); i2++) {
            View childAt = this.f109535g.getChildAt(i2);
            int i3 = this.f109546r.f110282a;
            if (i3 != 0) {
                childAt.setBackgroundColor(C1878d.m5128a(this.f109529a, i3));
            }
            if (this.f109546r.f110289h != 0) {
                ((TextView) childAt.findViewById(R.id.peoplekit_listview_expanded_contact_method_text_view)).setTextColor(C1878d.m5128a(this.f109529a, this.f109546r.f110289h));
                ((TextView) childAt.findViewById(R.id.peoplekit_listview_expanded_shared_text)).setTextColor(C1878d.m5128a(this.f109529a, this.f109546r.f110289h));
            }
        }
        int i4 = this.f109546r.f110286e;
        if (i4 != 0) {
            this.f109533e.setTextColor(C1878d.m5128a(this.f109529a, i4));
            this.f109549v.setTextColor(C1878d.m5128a(this.f109529a, this.f109546r.f110286e));
        }
        int i5 = this.f109546r.f110287f;
        if (i5 != 0) {
            this.f109534f.setTextColor(C1878d.m5128a(this.f109529a, i5));
        }
        if (((PeopleKitConfigImpl) this.f109538j).f110258y && this.f109548t == null) {
            this.f109548t = this.f109534f.getTextColors();
        }
        if (this.f109546r.f110294m != 0 && this.f109530b.findViewById(R.id.peoplekit_listview_chevron).getVisibility() == 0) {
            Drawable drawable = ((ImageView) this.f109530b.findViewById(R.id.peoplekit_listview_chevron)).getDrawable();
            C1929b.m5225f(drawable.mutate(), C1878d.m5128a(this.f109529a, this.f109546r.f110294m));
            ((ImageView) this.f109530b.findViewById(R.id.peoplekit_listview_chevron)).setImageDrawable(drawable);
        }
    }

    /* renamed from: t */
    public final void mo44429t() {
    }

    /* renamed from: f */
    public final void mo44423f(Channel channel, CoalescedChannels coalescedChannels) {
        CoalescedChannels coalescedChannels2 = this.f109542n;
        if (coalescedChannels2 != null) {
            if (((PeopleKitConfigImpl) this.f109538j).f110258y && this.f109536h.mo44746c().size() == 1) {
                int childCount = this.f109535g.getChildCount();
                mo44425h(coalescedChannels2);
                if (childCount > 0) {
                    mo44424g(coalescedChannels2);
                }
            }
            List c = this.f109542n.mo44648c();
            for (int i = 0; i < c.size(); i++) {
                if (((Channel) c.get(i)).equals(channel)) {
                    this.f109543o = channel;
                    this.f109534f.setText(m73484l(channel));
                    m73487o();
                    if (((Integer) this.f109542n.mo44647b().mo56109e(0)).intValue() > 1 && this.f109542n.mo44646a() != 1) {
                        mo44424g(this.f109542n);
                        if (!((PeopleKitConfigImpl) this.f109538j).f110250q) {
                            List c2 = this.f109542n.mo44648c();
                            for (int i2 = 0; i2 < c2.size(); i2++) {
                                Channel channel2 = (Channel) c2.get(i2);
                                View childAt = this.f109535g.getChildAt(i2);
                                if (channel2.equals(channel)) {
                                    m73486n(childAt);
                                    childAt.setContentDescription(this.f109529a.getString(R.string.peoplekit_contact_name_and_method_selected_description, new Object[]{m73484l(channel2), BuildConfig.FLAVOR}));
                                } else {
                                    childAt.setContentDescription(this.f109529a.getString(R.string.peoplekit_contact_method_unselected_description, new Object[]{m73484l(channel2)}));
                                }
                            }
                        }
                    }
                    View findViewById = this.f109530b.findViewById(R.id.peoplekit_listview_main_content);
                    Context context = this.f109529a;
                    findViewById.setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, new Object[]{channel.mo44631l(context), channel.mo44630k(this.f109529a)}));
                    return;
                }
            }
        }
    }
}
