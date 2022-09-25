package com.google.android.setupdesign;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4837ao;
import com.airbnb.lottie.C4972s;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p246g.C4958c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3549a.C45241d;
import com.google.android.setupcompat.p3549a.C45242e;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupdesign.view.IllustrationVideoView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class GlifLoadingLayout extends GlifLayout {

    /* renamed from: e */
    View f118312e;

    /* renamed from: f */
    String f118313f;

    /* renamed from: g */
    C45285b f118314g;

    /* renamed from: h */
    int f118315h;

    /* renamed from: i */
    Map f118316i;

    /* renamed from: j */
    private Animator.AnimatorListener f118317j;

    public GlifLoadingLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: A */
    private final void m80703A() {
        ViewStub viewStub;
        if (findViewById(R.id.sud_layout_lottie_illustration) == null && (viewStub = (ViewStub) mo49127h(R.id.sud_loading_layout_lottie_stub)) != null) {
            View inflate = viewStub.inflate();
            this.f118312e = inflate;
            if (inflate instanceof LinearLayout) {
                m80709G((LinearLayout) inflate);
            }
            m80708F();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r0.equals("account") != false) goto L_0x0076;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m80704B(android.util.AttributeSet r5, int r6) {
        /*
            r4 = this;
            com.google.android.setupdesign.f r0 = new com.google.android.setupdesign.f
            r0.<init>(r4, r5, r6)
            java.lang.Class<com.google.android.setupcompat.template.b> r1 = com.google.android.setupcompat.template.C45275b.class
            r4.mo49131l(r1, r0)
            android.content.Context r0 = r4.getContext()
            int[] r1 = com.google.android.setupdesign.p3553b.C45286a.f118331a
            r2 = 0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1, r6, r2)
            r6 = 1
            int r0 = r5.getResourceId(r6, r2)
            r4.f118315h = r0
            java.lang.String r0 = r5.getString(r2)
            r5.recycle()
            int r5 = r4.f118315h
            r1 = 2
            if (r5 == 0) goto L_0x0034
            r4.m80703A()
            android.view.ViewGroup r5 = r4.mo49118c(r2)
            r5.setVisibility(r2)
            goto L_0x00b0
        L_0x0034:
            if (r0 == 0) goto L_0x00a3
            java.lang.String r5 = r4.f118313f
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0045
            r4.f118313f = r0
            java.util.Map r5 = r4.f118316i
            r5.clear()
        L_0x0045:
            int r5 = r0.hashCode()
            r3 = 3
            switch(r5) {
                case -1861655064: goto L_0x006b;
                case -1177318867: goto L_0x0062;
                case -838846263: goto L_0x0058;
                case -775651618: goto L_0x004e;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0075
        L_0x004e:
            java.lang.String r5 = "connection"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0075
            r2 = 1
            goto L_0x0076
        L_0x0058:
            java.lang.String r5 = "update"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0075
            r2 = 2
            goto L_0x0076
        L_0x0062:
            java.lang.String r5 = "account"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0075
            goto L_0x0076
        L_0x006b:
            java.lang.String r5 = "final_hold"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0075
            r2 = 3
            goto L_0x0076
        L_0x0075:
            r2 = -1
        L_0x0076:
            if (r2 == 0) goto L_0x0092
            if (r2 == r6) goto L_0x008d
            if (r2 == r1) goto L_0x0088
            if (r2 == r3) goto L_0x0083
            com.google.android.setupdesign.b r5 = com.google.android.setupdesign.C45285b.CONFIG_DEFAULT
            r4.f118314g = r5
            goto L_0x0096
        L_0x0083:
            com.google.android.setupdesign.b r5 = com.google.android.setupdesign.C45285b.CONFIG_FINAL_HOLD
            r4.f118314g = r5
            goto L_0x0096
        L_0x0088:
            com.google.android.setupdesign.b r5 = com.google.android.setupdesign.C45285b.CONFIG_UPDATE
            r4.f118314g = r5
            goto L_0x0096
        L_0x008d:
            com.google.android.setupdesign.b r5 = com.google.android.setupdesign.C45285b.CONFIG_CONNECTION
            r4.f118314g = r5
            goto L_0x0096
        L_0x0092:
            com.google.android.setupdesign.b r5 = com.google.android.setupdesign.C45285b.CONFIG_ACCOUNT
            r4.f118314g = r5
        L_0x0096:
            boolean r5 = com.google.android.setupcompat.p3550b.C45244a.m80595a()
            if (r5 == 0) goto L_0x00a0
            r4.m80708F()
            goto L_0x00a3
        L_0x00a0:
            r4.m80706D()
        L_0x00a3:
            boolean r5 = com.google.android.setupcompat.p3550b.C45244a.m80595a()
            if (r5 == 0) goto L_0x00ad
            r4.m80703A()
            goto L_0x00b0
        L_0x00ad:
            r4.m80711z()
        L_0x00b0:
            r5 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            android.view.View r5 = r4.mo49127h(r5)
            if (r5 == 0) goto L_0x00c5
            boolean r6 = r4.mo49121f()
            if (r6 == 0) goto L_0x00c2
            com.google.android.setupdesign.p3558f.C45309c.m80756a(r5)
        L_0x00c2:
            r4.mo49198t(r5)
        L_0x00c5:
            r5 = 2131436227(0x7f0b22c3, float:1.8494318E38)
            android.view.View r5 = r4.mo49127h(r5)
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            if (r5 == 0) goto L_0x0104
            android.content.Context r0 = r4.getContext()
            com.google.android.setupcompat.a.c r0 = com.google.android.setupcompat.p3549a.C45240c.m80574e(r0)
            com.google.android.setupcompat.a.a r2 = com.google.android.setupcompat.p3549a.C45238a.CONFIG_LOADING_LAYOUT_HEADER_HEIGHT
            boolean r0 = r0.mo49107l(r2)
            if (r0 == 0) goto L_0x0104
            int r6 = r6.orientation
            if (r6 == r1) goto L_0x0104
            android.content.Context r6 = r4.getContext()
            com.google.android.setupcompat.a.c r6 = com.google.android.setupcompat.p3549a.C45240c.m80574e(r6)
            android.content.Context r0 = r4.getContext()
            com.google.android.setupcompat.a.a r1 = com.google.android.setupcompat.p3549a.C45238a.CONFIG_LOADING_LAYOUT_HEADER_HEIGHT
            r2 = 0
            float r6 = r6.mo49099a(r0, r1, r2)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = (int) r6
            r5.height = r6
        L_0x0104:
            r4.mo49199u()
            com.airbnb.lottie.LottieAnimationView r5 = r4.m80710y()
            if (r5 == 0) goto L_0x0117
            com.google.android.setupdesign.a r6 = new com.google.android.setupdesign.a
            r6.<init>(r4)
            r4.f118317j = r6
            r5.mo9689a(r6)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.GlifLoadingLayout.m80704B(android.util.AttributeSet, int):void");
    }

    /* renamed from: C */
    private final void m80705C(int i) {
        View findViewById = findViewById(R.id.sud_layout_progress_illustration);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: D */
    private final void m80706D() {
        if (findViewById(R.id.sud_layout_progress_illustration) == null) {
            Log.i("GlifLoadingLayout", "Illustration stub not inflated, skip set resource");
            return;
        }
        IllustrationVideoView illustrationVideoView = (IllustrationVideoView) mo49127h(R.id.sud_progress_illustration);
        ProgressBar progressBar = (ProgressBar) mo49127h(R.id.sud_progress_bar);
        C45241d f = C45240c.m80574e(getContext()).mo49102f(getContext(), this.f118314g.f118327f);
        if (f != null) {
            progressBar.setVisibility(8);
            illustrationVideoView.setVisibility(0);
            illustrationVideoView.mo49265c(f.f118174c, f.f118172a);
            return;
        }
        progressBar.setVisibility(0);
        illustrationVideoView.setVisibility(8);
    }

    /* renamed from: E */
    private final void m80707E(int i) {
        View findViewById = findViewById(R.id.sud_layout_lottie_illustration);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: F */
    private final void m80708F() {
        C45238a aVar;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.sud_lottie_view);
        if (lottieAnimationView == null) {
            Log.w("GlifLoadingLayout", "Lottie view not found, skip set resource. Wait for layout inflated.");
        } else if (this.f118315h != 0) {
            lottieAnimationView.mo9704n(C4972s.m13750h(getResources().openRawResource(this.f118315h), (String) null));
            lottieAnimationView.mo9695f();
        } else {
            C45241d f = C45240c.m80574e(getContext()).mo49102f(getContext(), this.f118314g.f118328g);
            if (f != null) {
                lottieAnimationView.mo9704n(C4972s.m13750h(f.f118175d.openRawResource(f.f118174c), (String) null));
                lottieAnimationView.mo9695f();
                m80707E(0);
                m80705C(8);
                LottieAnimationView y = m80710y();
                if (y != null) {
                    if (this.f118316i.isEmpty()) {
                        C45240c e = C45240c.m80574e(getContext());
                        Context context = getContext();
                        if (C45242e.m80594a(getResources().getConfiguration())) {
                            aVar = this.f118314g.f118330i;
                        } else {
                            aVar = this.f118314g.f118329h;
                        }
                        if (aVar.f118156bs == 9) {
                            ArrayList<String> arrayList = new ArrayList<>();
                            try {
                                C45241d g = e.mo49103g(context, aVar.f118155br);
                                Collections.addAll(arrayList, g.f118175d.getStringArray(g.f118174c));
                            } catch (NullPointerException unused) {
                            }
                            for (String str : arrayList) {
                                String[] split = str.split(":");
                                if (split.length == 2) {
                                    this.f118316i.put(new C4890e("**", split[0], "**"), new C4837ao(Color.parseColor(split[1])));
                                } else {
                                    Log.w("GlifLoadingLayout", "incorrect format customization, value=".concat(String.valueOf(str)));
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Not a string array resource");
                        }
                    }
                    for (C4890e eVar : this.f118316i.keySet()) {
                        y.f15138d.mo9756a(eVar, C4829ag.f15366E, new C4958c((ColorFilter) this.f118316i.get(eVar)));
                    }
                    return;
                }
                return;
            }
            m80707E(8);
            m80705C(0);
            m80711z();
        }
    }

    /* renamed from: G */
    private final void m80709G(LinearLayout linearLayout) {
        LinearLayout linearLayout2;
        int paddingTop = linearLayout.getPaddingTop();
        int paddingLeft = linearLayout.getPaddingLeft();
        int paddingRight = linearLayout.getPaddingRight();
        int paddingBottom = linearLayout.getPaddingBottom();
        if (C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LOADING_LAYOUT_PADDING_TOP)) {
            float a = C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LOADING_LAYOUT_PADDING_TOP, 0.0f);
            if (a >= 0.0f) {
                paddingTop = (int) a;
            }
        }
        if (C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LOADING_LAYOUT_PADDING_START)) {
            float a2 = C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LOADING_LAYOUT_PADDING_START, 0.0f);
            if (a2 >= 0.0f) {
                paddingLeft = (int) a2;
            }
        }
        if (C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LOADING_LAYOUT_PADDING_END)) {
            float a3 = C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LOADING_LAYOUT_PADDING_END, 0.0f);
            if (a3 >= 0.0f) {
                paddingRight = (int) a3;
            }
        }
        if (C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LOADING_LAYOUT_PADDING_BOTTOM)) {
            float a4 = C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LOADING_LAYOUT_PADDING_BOTTOM, 0.0f);
            if (a4 >= 0.0f) {
                C45275b bVar = (C45275b) mo49129j(C45275b.class);
                if (bVar == null || (linearLayout2 = bVar.f118264d) == null) {
                    paddingBottom = (int) a4;
                } else {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(linearLayout2.getMeasuredHeight(), 1073741824));
                    paddingBottom = ((int) a4) - ((int) Math.min(a4, (float) linearLayout2.getMeasuredHeight()));
                }
            }
        }
        linearLayout.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* renamed from: y */
    private final LottieAnimationView m80710y() {
        return (LottieAnimationView) findViewById(R.id.sud_lottie_view);
    }

    /* renamed from: z */
    private final void m80711z() {
        ViewStub viewStub;
        if (findViewById(R.id.sud_layout_progress_illustration) == null && (viewStub = (ViewStub) mo49127h(R.id.sud_loading_layout_illustration_stub)) != null) {
            View inflate = viewStub.inflate();
            this.f118312e = inflate;
            if (inflate instanceof LinearLayout) {
                m80709G((LinearLayout) inflate);
            }
            m80706D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo49117b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C45240c.m80574e(getContext()).mo49105j(getContext(), C45238a.CONFIG_LOADING_LAYOUT_FULL_SCREEN_ILLUSTRATION_ENABLED, false) ? R.layout.sud_glif_fullscreen_loading_template : R.layout.sud_glif_loading_template;
        }
        return mo49128i(layoutInflater, 2132150212, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ViewGroup mo49118c(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.mo49118c(i);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f118312e;
        if (view instanceof LinearLayout) {
            m80709G((LinearLayout) view);
        }
    }

    /* renamed from: w */
    public final boolean mo49202w() {
        try {
            if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale") != 0.0f) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: x */
    public final void mo49203x() {
        LottieAnimationView y = m80710y();
        if (y != null) {
            y.mo9698i(R.raw.loading_empty);
        }
    }

    public GlifLoadingLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLoadingLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.f118313f = "default";
        this.f118314g = C45285b.CONFIG_DEFAULT;
        this.f118315h = 0;
        this.f118316i = new HashMap();
        new ArrayList();
        m80704B((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    public GlifLoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f118313f = "default";
        this.f118314g = C45285b.CONFIG_DEFAULT;
        this.f118315h = 0;
        this.f118316i = new HashMap();
        new ArrayList();
        m80704B(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118313f = "default";
        this.f118314g = C45285b.CONFIG_DEFAULT;
        this.f118315h = 0;
        this.f118316i = new HashMap();
        new ArrayList();
        m80704B(attributeSet, i);
    }
}
