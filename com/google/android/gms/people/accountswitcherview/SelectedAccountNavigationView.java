package com.google.android.gms.people.accountswitcherview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.gms.people.internal.C145670g;
import com.google.android.gms.people.p10856c.C145645a;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class SelectedAccountNavigationView extends FrameLayout {

    /* renamed from: a */
    public C145639i f393814a;

    /* renamed from: b */
    public boolean f393815b = true;

    /* renamed from: c */
    public AnimatorSet f393816c;

    /* renamed from: d */
    private int f393817d = 0;

    /* renamed from: e */
    private ArrayList f393818e = new ArrayList(2);

    /* renamed from: f */
    private int f393819f = -1;

    /* renamed from: g */
    private float f393820g;

    /* renamed from: h */
    private float f393821h;

    /* renamed from: i */
    private int f393822i;

    /* renamed from: j */
    private VelocityTracker f393823j;

    /* renamed from: k */
    private int f393824k;

    /* renamed from: l */
    private boolean f393825l;

    /* renamed from: m */
    private int f393826m;

    /* renamed from: n */
    private float f393827n;

    /* renamed from: o */
    private float f393828o;

    /* renamed from: p */
    private float f393829p;

    /* renamed from: q */
    private int f393830q;

    /* renamed from: r */
    private int f393831r;

    /* renamed from: s */
    private int f393832s;

    /* renamed from: t */
    private int f393833t;

    /* renamed from: u */
    private boolean f393834u;

    /* renamed from: v */
    private int f393835v;

    /* renamed from: w */
    private Interpolator f393836w;

    /* renamed from: x */
    private C145638h f393837x;

    /* renamed from: y */
    private C145670g f393838y;

    public SelectedAccountNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f393822i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f393823j = VelocityTracker.obtain();
        this.f393824k = ViewConfiguration.getMinimumFlingVelocity();
        Resources resources = context.getResources();
        this.f393827n = (float) resources.getDimensionPixelSize(R.dimen.selected_account_avatar_size);
        this.f393834u = getResources().getConfiguration().getLayoutDirection() == 1 ? true : z;
        this.f393836w = AnimationUtils.loadInterpolator(context, 17563661);
        resources.getDimensionPixelSize(R.dimen.selected_account_height);
        resources.getDimensionPixelSize(R.dimen.avatar_margin_top);
    }

    /* renamed from: d */
    private final void m236731d() {
        Context context = getContext();
        if (this.f393819f == -1) {
            this.f393819f = R.layout.selected_account;
        }
        if (this.f393837x == null) {
            this.f393837x = new C145638h(this);
        }
        LayoutInflater.from(context).inflate(this.f393819f, this);
        C145638h hVar = this.f393837x;
        C145639i iVar = new C145639i();
        iVar.f393849b = this;
        iVar.f393850c = findViewById(R.id.account_text);
        iVar.f393852e = findViewById(R.id.avatar);
        iVar.f393858k = (ImageView) iVar.f393852e;
        iVar.f393853f = (TextView) findViewById(R.id.account_display_name);
        iVar.f393854g = (TextView) findViewById(R.id.account_address);
        iVar.f393857j = (ImageView) findViewById(R.id.cover_photo);
        iVar.f393851d = (ExpanderView) findViewById(R.id.account_list_button);
        findViewById(R.id.account_list_wrapper);
        iVar.f393848a = findViewById(R.id.scrim);
        hVar.f393847a.findViewById(R.id.account_switcher_lib_view_wrapper);
        if (hVar.f393847a.f393815b) {
            iVar.f393855h = findViewById(R.id.avatar_recents_one);
            iVar.f393859l = (ImageView) findViewById(R.id.avatar_recents_one_image);
            iVar.f393856i = findViewById(R.id.avatar_recents_two);
            iVar.f393860m = (ImageView) findViewById(R.id.avatar_recents_two_image);
            if (iVar.f393859l == null) {
                View view = iVar.f393855h;
                if (view instanceof ImageView) {
                    iVar.f393859l = (ImageView) view;
                }
            }
            if (iVar.f393860m == null) {
                View view2 = iVar.f393856i;
                if (view2 instanceof ImageView) {
                    iVar.f393860m = (ImageView) view2;
                }
            }
            iVar.f393864q = findViewById(R.id.offscreen_avatar);
            iVar.f393868u = (ImageView) iVar.f393864q;
            iVar.f393865r = (ImageView) findViewById(R.id.offscreen_cover_photo);
            iVar.f393861n = findViewById(R.id.offscreen_text);
            iVar.f393862o = (TextView) findViewById(R.id.offscreen_account_display_name);
            iVar.f393863p = (TextView) findViewById(R.id.offscreen_account_address);
            iVar.f393866s = findViewById(R.id.crossfade_avatar_recents_one);
            iVar.f393869v = (ImageView) iVar.f393866s;
            iVar.f393867t = findViewById(R.id.crossfade_avatar_recents_two);
            iVar.f393870w = (ImageView) iVar.f393867t;
        }
        this.f393814a = iVar;
        if (this.f393815b) {
            iVar.f393855h.setOnClickListener(new C145634d(this));
            this.f393814a.f393856i.setOnClickListener(new C145635e(this));
        }
        ExpanderView expanderView = this.f393814a.f393851d;
        if (expanderView != null) {
            expanderView.setOnClickListener(new C145636f(this));
        }
        setOnClickListener(new C145637g(this));
    }

    /* renamed from: e */
    private final void m236732e(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f393826m) {
            this.f393826m = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: f */
    private final void m236733f(C145670g gVar, AnimatorSet.Builder builder, int i) {
        C145639i iVar = this.f393814a;
        m236735h(iVar.f393862o, iVar.f393863p, gVar);
        this.f393814a.f393861n.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f393814a.f393861n, "alpha", new float[]{1.0f});
        ofFloat.setStartDelay((long) i);
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f393814a.f393850c, "alpha", new float[]{0.0f});
        ofFloat2.setStartDelay(0);
        ofFloat2.setDuration(150);
        builder.with(ofFloat).with(ofFloat2);
    }

    /* renamed from: g */
    private static final void m236734g(View view) {
        if (view != null) {
            C2043bi.m5542aI(view);
            C2043bi.m5543aJ(view);
            C2043bi.m5558al(view, 1.0f);
            C2043bi.m5559am(view, 1.0f);
            C2043bi.m5529W(view, 1.0f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m236735h(android.widget.TextView r3, android.widget.TextView r4, com.google.android.gms.people.internal.C145670g r5) {
        /*
            java.lang.String r0 = "account_name"
            r1 = 0
            if (r3 == 0) goto L_0x0026
            boolean r2 = com.google.android.gms.people.accountswitcherview.C145640j.m236740a(r5)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r5.mo121719i()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r5.mo119337kv(r0)
            r3.setText(r2)
            goto L_0x0026
        L_0x001d:
            java.lang.String r2 = r5.mo121719i()
            r3.setText(r2)
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r4 == 0) goto L_0x0041
            if (r3 == 0) goto L_0x003c
            boolean r3 = com.google.android.gms.people.accountswitcherview.C145640j.m236740a(r5)
            if (r3 == 0) goto L_0x003c
            r4.setVisibility(r1)
            java.lang.String r3 = r5.mo119337kv(r0)
            r4.setText(r3)
            return
        L_0x003c:
            r3 = 8
            r4.setVisibility(r3)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.m236735h(android.widget.TextView, android.widget.TextView, com.google.android.gms.people.internal.g):void");
    }

    /* renamed from: i */
    private static final void m236736i(C145639i iVar, ImageView imageView, C145670g gVar) {
        if (imageView != null && iVar.f393857j != null && C145640j.m236740a(gVar)) {
            if (!TextUtils.isEmpty(C145645a.f393872a.mo121683a(gVar.mo119337kv("cover_photo_url")))) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo121667a(int i) {
        View view;
        ImageView imageView;
        View view2;
        ImageView imageView2;
        C145670g gVar;
        float f;
        int i2 = i;
        ArrayList arrayList = this.f393818e;
        if (arrayList != null && !arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (i2 == 0) {
                view = this.f393814a.f393855h;
            } else {
                view = this.f393814a.f393856i;
            }
            if (i2 == 0) {
                imageView = this.f393814a.f393859l;
            } else {
                imageView = this.f393814a.f393860m;
            }
            view.bringToFront();
            C145670g gVar2 = (C145670g) this.f393818e.get(i2);
            if (this.f393828o == 0.0f) {
                this.f393828o = (float) this.f393814a.f393859l.getWidth();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f393814a.f393852e, "alpha", new float[]{1.0f, 0.0f});
            int marginStart = this.f393834u ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
            float f2 = this.f393827n;
            float f3 = this.f393828o;
            float f4 = f2 / f3;
            int i3 = marginLayoutParams.bottomMargin;
            int left = this.f393814a.f393852e.getLeft();
            int left2 = view.getLeft();
            float f5 = this.f393828o;
            float f6 = this.f393827n;
            AnimatorSet.Builder play = animatorSet.play(ofFloat);
            AnimatorSet animatorSet2 = animatorSet;
            C145670g gVar3 = gVar2;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{((float) (left - (left2 + marginStart))) - ((f5 - f6) * 0.5f)});
            ofFloat2.setDuration(450);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", new float[]{(f2 - (f3 - ((float) i3))) * 0.5f});
            ofFloat3.setDuration(450);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f4});
            ofFloat4.setDuration(300);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f4});
            ofFloat5.setDuration(300);
            play.with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
            if (i2 == 0) {
                view2 = this.f393814a.f393866s;
            } else {
                view2 = this.f393814a.f393867t;
            }
            if (i2 == 0) {
                imageView2 = this.f393814a.f393869v;
            } else {
                imageView2 = this.f393814a.f393870w;
            }
            if (imageView2 != null) {
                imageView2.setImageDrawable(this.f393814a.f393858k.getDrawable());
            }
            if (view2 != null) {
                view2.setVisibility(0);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f});
                ofFloat6.setDuration(450);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f});
                ofFloat7.setDuration(450);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f});
                ofFloat8.setDuration(450);
                play.with(ofFloat6).with(ofFloat8).with(ofFloat7);
            }
            C145639i iVar = this.f393814a;
            View view3 = iVar.f393861n;
            if (view3 == null || iVar.f393850c == null) {
                gVar = gVar3;
                f = 0.0f;
            } else {
                f = 0.0f;
                view3.setAlpha(0.0f);
                this.f393814a.f393861n.setTranslationX(0.0f);
                gVar = gVar3;
                m236733f(gVar, play, 150);
            }
            ImageView imageView3 = this.f393814a.f393857j;
            if (imageView3 != null) {
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(imageView3, "alpha", new float[]{f});
                ofFloat9.setDuration(300);
                play.with(ofFloat9);
            }
            C145639i iVar2 = this.f393814a;
            ImageView imageView4 = iVar2.f393865r;
            if (imageView4 != null) {
                m236736i(iVar2, imageView4, gVar);
                this.f393814a.f393865r.setVisibility(0);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f393814a.f393865r, "alpha", new float[]{1.0f});
                ofFloat10.setDuration(300);
                play.with(ofFloat10);
            }
            AnimatorSet animatorSet3 = animatorSet2;
            animatorSet3.addListener(new C145632b(this));
            C145670g gVar4 = this.f393838y;
            this.f393838y = (C145670g) this.f393818e.get(i2);
            this.f393818e.add(i2, gVar4);
            this.f393818e.remove(i2 + 1);
            animatorSet3.setInterpolator(this.f393836w);
            this.f393816c = animatorSet3;
            animatorSet3.start();
        }
    }

    /* renamed from: b */
    public final void mo121668b() {
        if (this.f393814a == null) {
            m236731d();
        }
        if (this.f393815b) {
            m236734g(this.f393814a.f393852e);
            m236734g(this.f393814a.f393855h);
            m236734g(this.f393814a.f393856i);
            m236734g(this.f393814a.f393850c);
            m236734g(this.f393814a.f393857j);
            m236734g(this.f393814a.f393865r);
            m236734g(this.f393814a.f393864q);
        }
        C145639i iVar = this.f393814a;
        C145670g gVar = this.f393838y;
        if (iVar.f393849b != null && C145640j.m236740a(gVar)) {
            iVar.f393849b.setContentDescription(getContext().getResources().getString(R.string.selected_account, new Object[]{this.f393838y.mo119337kv("account_name")}));
        }
        if (iVar.f393858k == null || !C145640j.m236740a(gVar)) {
            m236735h(iVar.f393853f, iVar.f393854g, gVar);
            m236736i(iVar, iVar.f393857j, gVar);
            if (this.f393815b) {
                if (this.f393814a == null) {
                    m236731d();
                }
                ImageView imageView = this.f393814a.f393857j;
                if (imageView == null || imageView.getMeasuredWidth() != 0) {
                    if (!this.f393818e.isEmpty()) {
                        C145639i iVar2 = this.f393814a;
                        iVar2.f393855h.setVisibility(0);
                        ImageView imageView2 = this.f393814a.f393859l;
                        m236736i(iVar2, iVar2.f393865r, (C145670g) this.f393818e.get(0));
                    } else {
                        this.f393814a.f393855h.setVisibility(8);
                    }
                    if (this.f393818e.size() > 1) {
                        this.f393814a.f393856i.setVisibility(0);
                        ImageView imageView3 = this.f393814a.f393860m;
                        C145670g gVar2 = (C145670g) this.f393818e.get(1);
                    } else {
                        this.f393814a.f393856i.setVisibility(8);
                    }
                    this.f393829p = -1.0f;
                } else {
                    forceLayout();
                }
            }
            if (this.f393815b) {
                this.f393828o = (float) this.f393814a.f393859l.getWidth();
                View view = this.f393814a.f393864q;
                if (view != null) {
                    view.setVisibility(8);
                }
                ImageView imageView4 = this.f393814a.f393865r;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                View view2 = this.f393814a.f393861n;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f393814a.f393866s;
                if (view3 != null) {
                    C2043bi.m5529W(view3, 0.0f);
                    C2043bi.m5558al(this.f393814a.f393866s, 0.8f);
                    C2043bi.m5559am(this.f393814a.f393866s, 0.8f);
                    this.f393814a.f393866s.setVisibility(8);
                }
                View view4 = this.f393814a.f393867t;
                if (view4 != null) {
                    C2043bi.m5529W(view4, 0.0f);
                    C2043bi.m5558al(this.f393814a.f393867t, 0.8f);
                    C2043bi.m5559am(this.f393814a.f393867t, 0.8f);
                    this.f393814a.f393867t.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        ImageView imageView5 = iVar.f393858k;
        getContext();
        throw null;
    }

    /* renamed from: c */
    public final void mo121669c() {
        int i = this.f393817d;
        int i2 = i ^ 1;
        boolean z = false;
        if (i != i2) {
            this.f393817d = i2;
            if (this.f393814a == null) {
                m236731d();
            }
            this.f393814a.f393851d.mo121665a(1 == this.f393817d);
        }
        ExpanderView expanderView = this.f393814a.f393851d;
        if (1 == this.f393817d) {
            z = true;
        }
        expanderView.mo121665a(z);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f393825l = false;
            this.f393826m = motionEvent.getPointerId(0);
            this.f393825l = false;
        } else if (action == 6) {
            m236732e(motionEvent);
            this.f393826m = -1;
            this.f393825l = false;
        }
        return this.f393825l;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f393814a == null) {
            m236731d();
        }
        ImageView imageView = this.f393814a.f393857j;
        if (imageView != null) {
            imageView.measure(i, i2);
        }
        View view = this.f393814a.f393848a;
        if (view != null) {
            view.measure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0324, code lost:
        if (java.lang.Math.abs(r0.f393823j.getXVelocity()) > ((float) r0.f393824k)) goto L_0x043c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r19.getAction()
            android.view.ViewParent r3 = r18.getParent()
            r4 = 1
            if (r2 == 0) goto L_0x05d4
            java.lang.String r5 = "SelectedAccountNavigationView"
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 0
            if (r2 == r4) goto L_0x02c0
            r10 = 2
            if (r2 == r10) goto L_0x003e
            r5 = 3
            if (r2 == r5) goto L_0x0038
            r3 = 5
            if (r2 == r3) goto L_0x002c
            r3 = 6
            if (r2 == r3) goto L_0x0027
            goto L_0x05e0
        L_0x0027:
            r18.m236732e(r19)
            goto L_0x05e0
        L_0x002c:
            int r2 = r19.getActionIndex()
            int r1 = r1.getPointerId(r2)
            r0.f393826m = r1
            goto L_0x05e0
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            r3.requestDisallowInterceptTouchEvent(r9)
        L_0x003d:
            return r9
        L_0x003e:
            int r2 = r0.f393826m
            int r2 = r1.findPointerIndex(r2)
            if (r2 >= 0) goto L_0x004c
            java.lang.String r1 = "Got ACTION_MOVE event but have an invalid active pointer id."
            android.util.Log.e(r5, r1)
            return r9
        L_0x004c:
            float r5 = r1.getX(r2)
            float r2 = r1.getY(r2)
            float r10 = r0.f393820g
            float r10 = r5 - r10
            float r11 = r0.f393821h
            float r2 = r2 - r11
            float r11 = r10 * r10
            float r12 = r2 * r2
            float r11 = r11 + r12
            boolean r12 = r0.f393815b
            if (r12 == 0) goto L_0x008c
            java.util.ArrayList r12 = r0.f393818e
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x008c
            boolean r12 = r0.f393825l
            if (r12 != 0) goto L_0x008c
            int r12 = r0.f393822i
            int r12 = r12 * r12
            float r12 = (float) r12
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x008c
            float r10 = java.lang.Math.abs(r10)
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            r0.f393825l = r4
            if (r3 == 0) goto L_0x008c
            r3.requestDisallowInterceptTouchEvent(r4)
        L_0x008c:
            boolean r2 = r0.f393825l
            if (r2 == 0) goto L_0x05e0
            float r2 = r0.f393820g
            float r5 = r5 - r2
            float r2 = r0.f393829p
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00f9
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.widget.ImageView r2 = r2.f393859l
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393860m
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r10 = r0.f393834u
            if (r10 == 0) goto L_0x00b8
            int r2 = r2.getMarginStart()
            goto L_0x00ba
        L_0x00b8:
            int r2 = r2.leftMargin
        L_0x00ba:
            boolean r10 = r0.f393834u
            if (r10 == 0) goto L_0x00c3
            int r3 = r3.getMarginStart()
            goto L_0x00c5
        L_0x00c3:
            int r3 = r3.leftMargin
        L_0x00c5:
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393855h
            int r10 = r10.getLeft()
            int r10 = r10 + r2
            float r2 = (float) r10
            r0.f393829p = r2
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.view.View r2 = r2.f393856i
            int r2 = r2.getLeft()
            int r2 = r2 + r3
            r0.f393830q = r2
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.view.View r2 = r2.f393852e
            int r2 = r2.getLeft()
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393852e
            int r3 = r3.getPaddingLeft()
            int r2 = r2 + r3
            r0.f393832s = r2
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.view.View r2 = r2.f393852e
            int r2 = r2.getWidth()
            r0.f393833t = r2
        L_0x00f9:
            boolean r2 = r0.f393834u
            if (r2 == 0) goto L_0x0102
            float r2 = java.lang.Math.min(r5, r8)
            goto L_0x0106
        L_0x0102:
            float r2 = java.lang.Math.max(r5, r8)
        L_0x0106:
            float r3 = r0.f393828o
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0117
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393859l
            int r3 = r3.getWidth()
            float r3 = (float) r3
            r0.f393828o = r3
        L_0x0117:
            float r5 = r0.f393827n
            float r10 = r3 / r5
            float r3 = r3 - r5
            float r3 = r3 * r6
            java.util.ArrayList r5 = r0.f393818e
            int r5 = r5.size()
            if (r5 <= r4) goto L_0x012a
            int r5 = r0.f393830q
            float r5 = (float) r5
            goto L_0x012c
        L_0x012a:
            float r5 = r0.f393829p
        L_0x012c:
            int r11 = r0.f393832s
            float r11 = (float) r11
            float r5 = r5 - r11
            float r11 = r0.f393828o
            float r12 = r0.f393827n
            float r11 = r11 - r12
            float r11 = r11 * r6
            float r5 = r5 + r11
            float r2 = r2 / r5
            float r2 = java.lang.Math.min(r7, r2)
            float r3 = java.lang.Math.abs(r3)
            float r6 = r7 - r2
            float r11 = java.lang.Math.max(r8, r6)
            com.google.android.gms.people.accountswitcherview.i r12 = r0.f393814a
            android.view.View r12 = r12.f393852e
            float r5 = r5 * r2
            r12.setTranslationX(r5)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393852e
            float r3 = r3 * r2
            float r3 = java.lang.Math.abs(r3)
            float r3 = -r3
            r5.setTranslationY(r3)
            float r3 = r2 * r10
            float r3 = r7 - r3
            float r3 = java.lang.Math.max(r10, r3)
            float r3 = java.lang.Math.min(r7, r3)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393852e
            r5.setScaleX(r3)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393852e
            r5.setScaleY(r3)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393864q
            if (r3 == 0) goto L_0x01c3
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x01b4
            boolean r3 = r0.f393834u
            if (r3 == 0) goto L_0x018f
            int r3 = r18.getWidth()
            int r5 = r0.f393832s
            goto L_0x0194
        L_0x018f:
            int r3 = r0.f393833t
            int r3 = -r3
            int r5 = r0.f393832s
        L_0x0194:
            int r3 = r3 - r5
            r0.f393835v = r3
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393864q
            float r3 = (float) r3
            r5.setTranslationX(r3)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r5 = r3.f393868u
            android.widget.ImageView r3 = r3.f393859l
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            r5.setImageDrawable(r3)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393864q
            r3.setVisibility(r9)
            goto L_0x01c3
        L_0x01b4:
            int r3 = r0.f393835v
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393864q
            float r10 = (float) r3
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 * r2
            float r10 = r10 + r3
            r5.setTranslationX(r10)
        L_0x01c3:
            java.util.ArrayList r3 = r0.f393818e
            int r3 = r3.size()
            if (r3 <= r4) goto L_0x01da
            float r3 = r0.f393829p
            int r5 = r0.f393830q
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393856i
            float r5 = (float) r5
            float r3 = r3 - r5
            float r3 = r3 * r2
            r10.setTranslationX(r3)
        L_0x01da:
            java.util.ArrayList r3 = r0.f393818e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02b9
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393865r
            if (r3 == 0) goto L_0x0204
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x01fd
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393865r
            r3.setAlpha(r8)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393865r
            r3.setVisibility(r9)
            goto L_0x0204
        L_0x01fd:
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393865r
            r3.setAlpha(r2)
        L_0x0204:
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.widget.ImageView r3 = r3.f393857j
            if (r3 == 0) goto L_0x020d
            r3.setAlpha(r6)
        L_0x020d:
            boolean r3 = r0.f393834u
            if (r3 == 0) goto L_0x0223
            int r3 = r18.getLeft()
            float r3 = (float) r3
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393855h
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r6 = r0.f393829p
            float r5 = r5 + r6
            goto L_0x022a
        L_0x0223:
            int r3 = r18.getWidth()
            float r3 = (float) r3
            float r5 = r0.f393829p
        L_0x022a:
            float r3 = r3 - r5
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393855h
            float r3 = r3 * r2
            r5.setTranslationX(r3)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393855h
            r3.setAlpha(r11)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393861n
            r5 = 1077936128(0x40400000, float:3.0)
            if (r3 == 0) goto L_0x029c
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x0275
            java.util.ArrayList r3 = r0.f393818e
            java.lang.Object r3 = r3.get(r9)
            com.google.android.gms.people.internal.g r3 = (com.google.android.gms.people.internal.C145670g) r3
            int r6 = r0.f393835v
            r0.f393831r = r6
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393861n
            float r6 = (float) r6
            r10.setTranslationX(r6)
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.widget.TextView r10 = r6.f393862o
            android.widget.TextView r6 = r6.f393863p
            m236735h(r10, r6, r3)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393861n
            r3.setAlpha(r8)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393861n
            r3.setVisibility(r9)
            goto L_0x029c
        L_0x0275:
            r3 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x028d
            r3 = -1096111445(0xffffffffbeaaaaab, float:-0.33333334)
            float r3 = r3 + r2
            float r3 = r3 * r5
            float r3 = java.lang.Math.min(r7, r3)
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.view.View r6 = r6.f393861n
            r6.setAlpha(r3)
        L_0x028d:
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393861n
            int r6 = r0.f393831r
            float r9 = (float) r6
            int r6 = -r6
            float r6 = (float) r6
            float r6 = r6 * r2
            float r9 = r9 + r6
            r3.setTranslationX(r9)
        L_0x029c:
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r6 = r3.f393850c
            if (r6 == 0) goto L_0x02b9
            android.view.View r3 = r3.f393852e
            float r3 = r3.getTranslationX()
            r6.setTranslationX(r3)
            float r2 = r2 * r5
            float r7 = r7 - r2
            float r2 = java.lang.Math.max(r8, r7)
            com.google.android.gms.people.accountswitcherview.i r3 = r0.f393814a
            android.view.View r3 = r3.f393850c
            r3.setAlpha(r2)
        L_0x02b9:
            android.view.VelocityTracker r2 = r0.f393823j
            r2.addMovement(r1)
            goto L_0x05e0
        L_0x02c0:
            int r2 = r0.f393826m
            int r2 = r1.findPointerIndex(r2)
            if (r2 >= 0) goto L_0x02ce
            java.lang.String r1 = "Got ACTION_UP event but have an invalid active pointer id."
            android.util.Log.e(r5, r1)
            return r9
        L_0x02ce:
            boolean r5 = r0.f393825l
            if (r5 == 0) goto L_0x05c4
            java.util.ArrayList r5 = r0.f393818e
            int r5 = r5.size()
            if (r5 <= r4) goto L_0x02de
            int r5 = r0.f393830q
            float r5 = (float) r5
            goto L_0x02e0
        L_0x02de:
            float r5 = r0.f393829p
        L_0x02e0:
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393852e
            float r10 = r10.getTranslationX()
            boolean r11 = r0.f393834u
            if (r11 == 0) goto L_0x02f0
            float r10 = java.lang.Math.abs(r10)
        L_0x02f0:
            float r5 = r5 * r6
            java.lang.String r11 = "scaleY"
            java.lang.String r12 = "scaleX"
            java.lang.String r13 = "translationY"
            java.lang.String r14 = "alpha"
            java.lang.String r15 = "translationX"
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x043c
            float r1 = r1.getX(r2)
            float r2 = r0.f393820g
            float r1 = r1 - r2
            int r2 = r0.f393822i
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0328
            android.view.VelocityTracker r1 = r0.f393823j
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r2)
            android.view.VelocityTracker r1 = r0.f393823j
            float r1 = r1.getXVelocity()
            float r1 = java.lang.Math.abs(r1)
            int r2 = r0.f393824k
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0328
            goto L_0x043c
        L_0x0328:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.view.View r2 = r2.f393852e
            float[] r5 = new float[r4]
            r5[r9] = r7
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r14, r5)
            android.animation.AnimatorSet$Builder r2 = r1.play(r2)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393852e
            float[] r6 = new float[r4]
            r6[r9] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r15, r6)
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.view.View r6 = r6.f393852e
            float[] r10 = new float[r4]
            r10[r9] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r13, r10)
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393852e
            float[] r13 = new float[r4]
            r13[r9] = r7
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r12, r13)
            com.google.android.gms.people.accountswitcherview.i r12 = r0.f393814a
            android.view.View r12 = r12.f393852e
            float[] r13 = new float[r4]
            r13[r9] = r7
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r12, r11, r13)
            android.animation.AnimatorSet$Builder r5 = r2.with(r5)
            android.animation.AnimatorSet$Builder r5 = r5.with(r6)
            android.animation.AnimatorSet$Builder r5 = r5.with(r10)
            r5.with(r11)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393864q
            float[] r6 = new float[r4]
            int r10 = r0.f393835v
            float r10 = (float) r10
            r6[r9] = r10
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r15, r6)
            r2.with(r5)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.widget.ImageView r5 = r5.f393865r
            if (r5 == 0) goto L_0x039f
            float[] r6 = new float[r4]
            r6[r9] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r14, r6)
            r2.with(r5)
        L_0x039f:
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.widget.ImageView r5 = r5.f393857j
            if (r5 == 0) goto L_0x03b0
            float[] r6 = new float[r4]
            r6[r9] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r14, r6)
            r2.with(r5)
        L_0x03b0:
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393856i
            float[] r6 = new float[r4]
            r6[r9] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r15, r6)
            r2.with(r5)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393855h
            float[] r6 = new float[r4]
            r6[r9] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r15, r6)
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.view.View r6 = r6.f393861n
            float[] r10 = new float[r4]
            int r11 = r18.getWidth()
            int r11 = -r11
            float r11 = (float) r11
            r10[r9] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r15, r10)
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393855h
            float[] r11 = new float[r4]
            r11[r9] = r7
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r14, r11)
            com.google.android.gms.people.accountswitcherview.i r11 = r0.f393814a
            android.view.View r11 = r11.f393850c
            float[] r12 = new float[r4]
            r12[r9] = r8
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r11, r15, r12)
            android.animation.AnimatorSet$Builder r5 = r2.with(r5)
            r5.with(r10)
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393861n
            float[] r10 = new float[r4]
            r10[r9] = r8
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r14, r10)
            com.google.android.gms.people.accountswitcherview.i r8 = r0.f393814a
            android.view.View r8 = r8.f393850c
            float[] r4 = new float[r4]
            r4[r9] = r7
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r8, r14, r4)
            android.animation.AnimatorSet$Builder r2 = r2.with(r6)
            android.animation.AnimatorSet$Builder r2 = r2.with(r5)
            android.animation.AnimatorSet$Builder r2 = r2.with(r11)
            r2.with(r4)
            r4 = 100
            r1.setDuration(r4)
            com.google.android.gms.people.accountswitcherview.a r2 = new com.google.android.gms.people.accountswitcherview.a
            r2.<init>(r0)
            r1.addListener(r2)
            android.view.animation.Interpolator r2 = r0.f393836w
            r1.setInterpolator(r2)
            r0.f393816c = r1
            r1.start()
            goto L_0x05c7
        L_0x043c:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.widget.ImageView r2 = r2.f393859l
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.widget.ImageView r5 = r5.f393860m
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            boolean r10 = r0.f393834u
            if (r10 == 0) goto L_0x045e
            int r2 = r2.getMarginStart()
            goto L_0x0460
        L_0x045e:
            int r2 = r2.leftMargin
        L_0x0460:
            boolean r10 = r0.f393834u
            if (r10 == 0) goto L_0x0469
            int r5 = r5.getMarginStart()
            goto L_0x046b
        L_0x0469:
            int r5 = r5.leftMargin
        L_0x046b:
            float r10 = r0.f393828o
            int r16 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x047c
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.widget.ImageView r10 = r10.f393859l
            int r10 = r10.getWidth()
            float r10 = (float) r10
            r0.f393828o = r10
        L_0x047c:
            float r7 = r0.f393827n
            float r17 = r10 / r7
            float r10 = r10 - r7
            float r10 = r10 * r6
            java.util.ArrayList r7 = r0.f393818e
            int r7 = r7.size()
            if (r7 <= r4) goto L_0x0495
            com.google.android.gms.people.accountswitcherview.i r2 = r0.f393814a
            android.view.View r2 = r2.f393856i
            int r2 = r2.getLeft()
            int r2 = r2 + r5
            goto L_0x049e
        L_0x0495:
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393855h
            int r5 = r5.getLeft()
            int r2 = r2 + r5
        L_0x049e:
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393852e
            int r5 = r5.getLeft()
            int r2 = r2 - r5
            float r2 = (float) r2
            float r5 = r0.f393828o
            float r7 = r0.f393827n
            float r5 = r5 - r7
            float r5 = r5 * r6
            float r2 = r2 + r5
            com.google.android.gms.people.accountswitcherview.i r5 = r0.f393814a
            android.view.View r5 = r5.f393852e
            float[] r6 = new float[r4]
            r6[r9] = r2
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r15, r6)
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.view.View r6 = r6.f393852e
            float[] r7 = new float[r4]
            r7[r9] = r10
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r13, r7)
            com.google.android.gms.people.accountswitcherview.i r7 = r0.f393814a
            android.view.View r7 = r7.f393852e
            float[] r10 = new float[r4]
            r10[r9] = r17
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r11, r10)
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393852e
            float[] r11 = new float[r4]
            r11[r9] = r17
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r12, r11)
            android.animation.AnimatorSet$Builder r5 = r1.play(r5)
            android.animation.AnimatorSet$Builder r5 = r5.with(r6)
            android.animation.AnimatorSet$Builder r5 = r5.with(r10)
            android.animation.AnimatorSet$Builder r5 = r5.with(r7)
            boolean r6 = r0.f393815b
            if (r6 == 0) goto L_0x058b
            java.util.ArrayList r6 = r0.f393818e
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x058b
            java.util.ArrayList r6 = r0.f393818e
            int r6 = r6.size()
            if (r6 <= r4) goto L_0x0525
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.view.View r6 = r6.f393855h
            int r6 = r6.getLeft()
            com.google.android.gms.people.accountswitcherview.i r7 = r0.f393814a
            android.view.View r7 = r7.f393856i
            int r7 = r7.getLeft()
            com.google.android.gms.people.accountswitcherview.i r10 = r0.f393814a
            android.view.View r10 = r10.f393856i
            float[] r11 = new float[r4]
            int r6 = r6 - r7
            float r6 = (float) r6
            r11[r9] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r10, r15, r11)
            r5.with(r6)
        L_0x0525:
            boolean r6 = r0.f393834u
            if (r6 == 0) goto L_0x053c
            int r6 = r18.getLeft()
            float r6 = (float) r6
            com.google.android.gms.people.accountswitcherview.i r7 = r0.f393814a
            android.view.View r7 = r7.f393855h
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r10 = r0.f393829p
            float r7 = r7 + r10
            float r6 = r6 - r7
            goto L_0x054a
        L_0x053c:
            int r6 = r18.getWidth()
            com.google.android.gms.people.accountswitcherview.i r7 = r0.f393814a
            android.view.View r7 = r7.f393855h
            int r7 = r7.getLeft()
            int r6 = r6 - r7
            float r6 = (float) r6
        L_0x054a:
            com.google.android.gms.people.accountswitcherview.i r7 = r0.f393814a
            android.view.View r7 = r7.f393855h
            float[] r10 = new float[r4]
            r10[r9] = r6
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r7, r15, r10)
            com.google.android.gms.people.accountswitcherview.i r7 = r0.f393814a
            android.view.View r7 = r7.f393855h
            float[] r10 = new float[r4]
            r10[r9] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r14, r10)
            android.animation.AnimatorSet$Builder r6 = r5.with(r6)
            r6.with(r7)
            com.google.android.gms.people.accountswitcherview.i r6 = r0.f393814a
            android.view.View r6 = r6.f393864q
            if (r6 == 0) goto L_0x057a
            float[] r4 = new float[r4]
            r4[r9] = r8
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r6, r15, r4)
            r5.with(r4)
        L_0x057a:
            com.google.android.gms.people.accountswitcherview.i r4 = r0.f393814a
            android.view.View r4 = r4.f393861n
            if (r4 == 0) goto L_0x058b
            java.util.ArrayList r4 = r0.f393818e
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.people.internal.g r4 = (com.google.android.gms.people.internal.C145670g) r4
            r0.m236733f(r4, r5, r9)
        L_0x058b:
            com.google.android.gms.people.accountswitcherview.c r4 = new com.google.android.gms.people.accountswitcherview.c
            r4.<init>(r0)
            r1.addListener(r4)
            com.google.android.gms.people.internal.g r4 = r0.f393838y
            java.util.ArrayList r5 = r0.f393818e
            java.lang.Object r5 = r5.remove(r9)
            com.google.android.gms.people.internal.g r5 = (com.google.android.gms.people.internal.C145670g) r5
            r0.f393838y = r5
            java.util.ArrayList r5 = r0.f393818e
            r5.add(r4)
            com.google.android.gms.people.accountswitcherview.i r4 = r0.f393814a
            android.view.View r4 = r4.f393852e
            float r4 = r4.getTranslationX()
            float r4 = r4 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r7 = r2 - r4
            r2 = 1138819072(0x43e10000, float:450.0)
            float r7 = r7 * r2
            long r4 = (long) r7
            r1.setDuration(r4)
            android.view.animation.Interpolator r2 = r0.f393836w
            r1.setInterpolator(r2)
            r0.f393816c = r1
            r1.start()
            goto L_0x05c7
        L_0x05c4:
            r18.mo121669c()
        L_0x05c7:
            r0.f393825l = r9
            if (r3 == 0) goto L_0x05ce
            r3.requestDisallowInterceptTouchEvent(r9)
        L_0x05ce:
            android.view.VelocityTracker r1 = r0.f393823j
            r1.clear()
            return r9
        L_0x05d4:
            float r2 = r19.getX()
            r0.f393820g = r2
            float r1 = r19.getY()
            r0.f393821h = r1
        L_0x05e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
