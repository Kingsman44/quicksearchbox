package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.support.p033v7.app.C0392m;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.graphics.C1924a;
import androidx.mediarouter.p175a.C3685au;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.mediarouter.app.ad */
/* compiled from: PG */
public final class C3758ad extends C0392m {

    /* renamed from: c */
    static final boolean f12082c = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* renamed from: d */
    static final int f12083d = ((int) TimeUnit.SECONDS.toMillis(30));

    /* renamed from: A */
    public int f12084A;

    /* renamed from: B */
    public final int f12085B;

    /* renamed from: C */
    Map f12086C;

    /* renamed from: D */
    C0320v f12087D;

    /* renamed from: E */
    final C3788y f12088E;

    /* renamed from: F */
    PlaybackStateCompat f12089F;

    /* renamed from: G */
    MediaDescriptionCompat f12090G;

    /* renamed from: H */
    C3787x f12091H;

    /* renamed from: I */
    Bitmap f12092I;

    /* renamed from: J */
    Uri f12093J;

    /* renamed from: K */
    boolean f12094K;

    /* renamed from: L */
    Bitmap f12095L;

    /* renamed from: M */
    int f12096M;

    /* renamed from: N */
    boolean f12097N;

    /* renamed from: O */
    boolean f12098O;

    /* renamed from: P */
    boolean f12099P;

    /* renamed from: Q */
    boolean f12100Q;

    /* renamed from: R */
    boolean f12101R;

    /* renamed from: S */
    int f12102S;

    /* renamed from: T */
    public int f12103T;

    /* renamed from: U */
    public int f12104U;

    /* renamed from: V */
    public Interpolator f12105V;

    /* renamed from: W */
    final AccessibilityManager f12106W;

    /* renamed from: X */
    final Runnable f12107X = new C3777n(this);

    /* renamed from: Y */
    private final C3789z f12108Y;

    /* renamed from: Z */
    private boolean f12109Z;

    /* renamed from: aa */
    private boolean f12110aa;

    /* renamed from: ab */
    private int f12111ab;

    /* renamed from: ac */
    private Button f12112ac;

    /* renamed from: ad */
    private Button f12113ad;

    /* renamed from: ae */
    private ImageButton f12114ae;

    /* renamed from: af */
    private ImageButton f12115af;

    /* renamed from: ag */
    private MediaRouteExpandCollapseButton f12116ag;

    /* renamed from: ah */
    private TextView f12117ah;

    /* renamed from: ai */
    private TextView f12118ai;

    /* renamed from: aj */
    private TextView f12119aj;

    /* renamed from: ak */
    private final boolean f12120ak = true;

    /* renamed from: al */
    private View f12121al;

    /* renamed from: am */
    private final Interpolator f12122am;

    /* renamed from: an */
    private final Interpolator f12123an;

    /* renamed from: e */
    final C3687aw f12124e;

    /* renamed from: f */
    final C3685au f12125f;

    /* renamed from: g */
    final Context f12126g;

    /* renamed from: h */
    public FrameLayout f12127h;

    /* renamed from: i */
    public LinearLayout f12128i;

    /* renamed from: j */
    FrameLayout f12129j;

    /* renamed from: k */
    public ImageView f12130k;

    /* renamed from: l */
    final boolean f12131l;

    /* renamed from: m */
    public LinearLayout f12132m;

    /* renamed from: n */
    public RelativeLayout f12133n;

    /* renamed from: o */
    LinearLayout f12134o;

    /* renamed from: p */
    OverlayListView f12135p;

    /* renamed from: q */
    C3757ac f12136q;

    /* renamed from: r */
    public List f12137r;

    /* renamed from: s */
    Set f12138s;

    /* renamed from: t */
    public Set f12139t;

    /* renamed from: u */
    Set f12140u;

    /* renamed from: v */
    SeekBar f12141v;

    /* renamed from: w */
    C3756ab f12142w;

    /* renamed from: x */
    C3685au f12143x;

    /* renamed from: y */
    public int f12144y;

    /* renamed from: z */
    public int f12145z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3758ad(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            android.content.Context r4 = androidx.mediarouter.app.C3763ai.m10927h(r4, r0)
            int r1 = androidx.mediarouter.app.C3763ai.m10921b(r4)
            r3.<init>(r4, r1)
            r3.f12120ak = r0
            androidx.mediarouter.app.n r0 = new androidx.mediarouter.app.n
            r0.<init>(r3)
            r3.f12107X = r0
            android.content.Context r0 = r3.getContext()
            r3.f12126g = r0
            androidx.mediarouter.app.y r1 = new androidx.mediarouter.app.y
            r1.<init>(r3)
            r3.f12088E = r1
            androidx.mediarouter.a.aw r1 = androidx.mediarouter.p175a.C3687aw.m10683e(r0)
            r3.f12124e = r1
            boolean r2 = androidx.mediarouter.p175a.C3687aw.m10685n()
            r3.f12131l = r2
            androidx.mediarouter.app.z r2 = new androidx.mediarouter.app.z
            r2.<init>(r3)
            r3.f12108Y = r2
            androidx.mediarouter.a.au r2 = r1.mo7770d()
            r3.f12125f = r2
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r1.mo7768a()
            r3.m10897D(r1)
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131170326(0x7f071416, float:1.7955007E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.f12085B = r1
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r3.f12106W = r0
            r0 = 2131558435(0x7f0d0023, float:1.8742186E38)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.f12122am = r0
            r0 = 2131558434(0x7f0d0022, float:1.8742184E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.f12123an = r4
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C3758ad.<init>(android.content.Context):void");
    }

    /* renamed from: D */
    private final void m10897D(MediaSessionCompat.Token token) {
        C0320v vVar = this.f12087D;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (vVar != null) {
            vVar.mo1041i(this.f12088E);
            this.f12087D = null;
        }
        if (token != null && this.f12110aa) {
            C0320v vVar2 = new C0320v(this.f12126g, token);
            this.f12087D = vVar2;
            vVar2.mo1040h(this.f12088E, (Handler) null);
            MediaMetadataCompat d = this.f12087D.mo1036d();
            if (d != null) {
                mediaDescriptionCompat = d.mo819d();
            }
            this.f12090G = mediaDescriptionCompat;
            this.f12089F = this.f12087D.mo1038f();
            mo7969s();
            mo7968q(false);
        }
    }

    /* renamed from: o */
    static void m10898o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: x */
    static boolean m10899x(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo7956A() {
        return (this.f12089F.f998e & 516) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo7957B() {
        return (this.f12089F.f998e & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean mo7958C(C3685au auVar) {
        return this.f12120ak && auVar.mo7754a() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo7959g(int i, int i2) {
        return i >= i2 ? (int) (((((float) this.f12111ab) * ((float) i2)) / ((float) i)) + 0.5f) : (int) (((((float) this.f12111ab) * 9.0f) / 16.0f) + 0.5f);
    }

    /* renamed from: h */
    public final int mo7960h(boolean z) {
        if (!z && this.f12134o.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.f12132m.getPaddingTop() + this.f12132m.getPaddingBottom();
        if (z) {
            paddingTop += this.f12133n.getMeasuredHeight();
        }
        if (this.f12134o.getVisibility() == 0) {
            paddingTop += this.f12134o.getMeasuredHeight();
        }
        return (!z || this.f12134o.getVisibility() != 0) ? paddingTop : paddingTop + this.f12121al.getMeasuredHeight();
    }

    /* renamed from: i */
    public final void mo7961i(View view, int i) {
        C3783t tVar = new C3783t(view.getLayoutParams().height, i, view);
        tVar.setDuration((long) this.f12102S);
        tVar.setInterpolator(this.f12105V);
        view.startAnimation(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo7962j(boolean z) {
        Set set;
        int firstVisiblePosition = this.f12135p.getFirstVisiblePosition();
        for (int i = 0; i < this.f12135p.getChildCount(); i++) {
            View childAt = this.f12135p.getChildAt(i);
            C3685au auVar = (C3685au) this.f12136q.getItem(firstVisiblePosition + i);
            if (!z || (set = this.f12138s) == null || !set.contains(auVar)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        for (C3764aj ajVar : this.f12135p.f12076a) {
            ajVar.f12160k = true;
            ajVar.f12161l = true;
            C3774k kVar = ajVar.f12162m;
            if (kVar != null) {
                kVar.mo7997a();
            }
        }
        if (!z) {
            mo7964m(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo7963k() {
        this.f12094K = false;
        this.f12095L = null;
        this.f12096M = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo7964m(boolean z) {
        this.f12138s = null;
        this.f12139t = null;
        this.f12100Q = false;
        if (this.f12101R) {
            this.f12101R = false;
            mo7971u(z);
        }
        this.f12135p.setEnabled(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo7965n() {
        this.f12105V = this.f12099P ? this.f12122am : this.f12123an;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12110aa = true;
        this.f12124e.mo7773h(C3753z.f12042a, this.f12108Y, 2);
        m10897D(this.f12124e.mo7768a());
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        mo1197b().mo1188p(R.layout.mr_controller_material_dialog_b);
        mo1197b().mo1177e(16908315).setVisibility(8);
        C3786w wVar = new C3786w(this);
        FrameLayout frameLayout = (FrameLayout) mo1197b().mo1177e(R.id.mr_expandable_area);
        this.f12127h = frameLayout;
        frameLayout.setOnClickListener(new C3778o(this));
        LinearLayout linearLayout = (LinearLayout) mo1197b().mo1177e(R.id.mr_dialog_area);
        this.f12128i = linearLayout;
        linearLayout.setOnClickListener(new C3779p());
        Context context = this.f12126g;
        int e = C3763ai.m10924e(context, 0, R.attr.colorPrimary);
        if (C1924a.m5182a(e, C3763ai.m10924e(context, 0, 16842801)) < 3.0d) {
            e = C3763ai.m10924e(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) mo1197b().mo1177e(16908314);
        this.f12112ac = button;
        button.setText(R.string.mr_controller_disconnect);
        this.f12112ac.setTextColor(e);
        this.f12112ac.setOnClickListener(wVar);
        Button button2 = (Button) mo1197b().mo1177e(16908313);
        this.f12113ad = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.f12113ad.setTextColor(e);
        this.f12113ad.setOnClickListener(wVar);
        this.f12119aj = (TextView) mo1197b().mo1177e(R.id.mr_name);
        ImageButton imageButton = (ImageButton) mo1197b().mo1177e(R.id.mr_close);
        this.f12115af = imageButton;
        imageButton.setOnClickListener(wVar);
        FrameLayout frameLayout2 = (FrameLayout) mo1197b().mo1177e(R.id.mr_custom_control);
        this.f12129j = (FrameLayout) mo1197b().mo1177e(R.id.mr_default_control);
        C3780q qVar = new C3780q(this);
        ImageView imageView = (ImageView) mo1197b().mo1177e(R.id.mr_art);
        this.f12130k = imageView;
        imageView.setOnClickListener(qVar);
        mo1197b().mo1177e(R.id.mr_control_title_container).setOnClickListener(qVar);
        this.f12132m = (LinearLayout) mo1197b().mo1177e(R.id.mr_media_main_control);
        this.f12121al = mo1197b().mo1177e(R.id.mr_control_divider);
        this.f12133n = (RelativeLayout) mo1197b().mo1177e(R.id.mr_playback_control);
        this.f12117ah = (TextView) mo1197b().mo1177e(R.id.mr_control_title);
        this.f12118ai = (TextView) mo1197b().mo1177e(R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) mo1197b().mo1177e(R.id.mr_control_playback_ctrl);
        this.f12114ae = imageButton2;
        imageButton2.setOnClickListener(wVar);
        LinearLayout linearLayout2 = (LinearLayout) mo1197b().mo1177e(R.id.mr_volume_control);
        this.f12134o = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) mo1197b().mo1177e(R.id.mr_volume_slider);
        this.f12141v = seekBar;
        seekBar.setTag(this.f12125f);
        C3756ab abVar = new C3756ab(this);
        this.f12142w = abVar;
        this.f12141v.setOnSeekBarChangeListener(abVar);
        this.f12135p = (OverlayListView) mo1197b().mo1177e(R.id.mr_volume_group_list);
        this.f12137r = new ArrayList();
        C3757ac acVar = new C3757ac(this, this.f12135p.getContext(), this.f12137r);
        this.f12136q = acVar;
        this.f12135p.setAdapter(acVar);
        this.f12140u = new HashSet();
        Context context2 = this.f12126g;
        LinearLayout linearLayout3 = this.f12132m;
        OverlayListView overlayListView = this.f12135p;
        boolean y = mo7974y();
        int e2 = C3763ai.m10924e(context2, 0, R.attr.colorPrimary);
        int e3 = C3763ai.m10924e(context2, 0, R.attr.colorPrimaryDark);
        if (y && C3763ai.m10922c(context2, 0) == -570425344) {
            e3 = e2;
            e2 = -1;
        }
        linearLayout3.setBackgroundColor(e2);
        overlayListView.setBackgroundColor(e3);
        linearLayout3.setTag(Integer.valueOf(e2));
        overlayListView.setTag(Integer.valueOf(e3));
        C3763ai.m10926g(this.f12126g, (MediaRouteVolumeSlider) this.f12141v, this.f12132m);
        HashMap hashMap = new HashMap();
        this.f12086C = hashMap;
        hashMap.put(this.f12125f, this.f12141v);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) mo1197b().mo1177e(R.id.mr_group_expand_collapse);
        this.f12116ag = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f12070f = new C3781r(this);
        mo7965n();
        this.f12102S = this.f12126g.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.f12103T = this.f12126g.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.f12104U = this.f12126g.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.f12109Z = true;
        mo7970t();
    }

    public final void onDetachedFromWindow() {
        this.f12124e.mo7774j(this.f12108Y);
        m10897D((MediaSessionCompat.Token) null);
        this.f12110aa = false;
        super.onDetachedFromWindow();
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0159  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7968q(boolean r10) {
        /*
            r9 = this;
            androidx.mediarouter.a.au r0 = r9.f12143x
            r1 = 1
            if (r0 == 0) goto L_0x000d
            r9.f12097N = r1
            boolean r0 = r9.f12098O
            r10 = r10 | r0
            r9.f12098O = r10
            return
        L_0x000d:
            r0 = 0
            r9.f12097N = r0
            r9.f12098O = r0
            androidx.mediarouter.a.au r2 = r9.f12125f
            boolean r2 = r2.mo7764k()
            if (r2 == 0) goto L_0x01c1
            androidx.mediarouter.a.au r2 = r9.f12125f
            boolean r2 = r2.mo7761h()
            if (r2 == 0) goto L_0x0024
            goto L_0x01c1
        L_0x0024:
            boolean r2 = r9.f12109Z
            if (r2 != 0) goto L_0x0029
            return
        L_0x0029:
            android.widget.TextView r2 = r9.f12119aj
            androidx.mediarouter.a.au r3 = r9.f12125f
            java.lang.String r3 = r3.f11864d
            r2.setText(r3)
            android.widget.Button r2 = r9.f12112ac
            androidx.mediarouter.a.au r3 = r9.f12125f
            boolean r3 = r3.f11869i
            r4 = 8
            if (r1 == r3) goto L_0x003f
            r3 = 8
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            r2.setVisibility(r3)
            boolean r2 = r9.f12094K
            if (r2 == 0) goto L_0x007a
            android.graphics.Bitmap r2 = r9.f12095L
            boolean r2 = m10899x(r2)
            if (r2 == 0) goto L_0x0069
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't set artwork image with recycled bitmap: "
            r2.<init>(r3)
            android.graphics.Bitmap r5 = r9.f12095L
            r2.append(r5)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "MediaRouteCtrlDialog"
            android.util.Log.w(r3, r2)
            goto L_0x0077
        L_0x0069:
            android.widget.ImageView r2 = r9.f12130k
            android.graphics.Bitmap r3 = r9.f12095L
            r2.setImageBitmap(r3)
            android.widget.ImageView r2 = r9.f12130k
            int r3 = r9.f12096M
            r2.setBackgroundColor(r3)
        L_0x0077:
            r9.mo7963k()
        L_0x007a:
            boolean r2 = r9.f12131l
            if (r2 != 0) goto L_0x0097
            boolean r2 = r9.mo7974y()
            if (r2 == 0) goto L_0x0097
            android.widget.LinearLayout r2 = r9.f12134o
            r2.setVisibility(r4)
            r9.f12099P = r1
            androidx.mediarouter.app.OverlayListView r2 = r9.f12135p
            r2.setVisibility(r0)
            r9.mo7965n()
            r9.mo7971u(r0)
            goto L_0x00db
        L_0x0097:
            boolean r2 = r9.f12099P
            if (r2 == 0) goto L_0x009f
            boolean r2 = r9.f12131l
            if (r2 == 0) goto L_0x00a7
        L_0x009f:
            androidx.mediarouter.a.au r2 = r9.f12125f
            boolean r2 = r9.mo7958C(r2)
            if (r2 != 0) goto L_0x00ad
        L_0x00a7:
            android.widget.LinearLayout r2 = r9.f12134o
            r2.setVisibility(r4)
            goto L_0x00db
        L_0x00ad:
            android.widget.LinearLayout r2 = r9.f12134o
            int r2 = r2.getVisibility()
            if (r2 != r4) goto L_0x00db
            android.widget.LinearLayout r2 = r9.f12134o
            r2.setVisibility(r0)
            android.widget.SeekBar r2 = r9.f12141v
            androidx.mediarouter.a.au r3 = r9.f12125f
            int r3 = r3.f11874n
            r2.setMax(r3)
            android.widget.SeekBar r2 = r9.f12141v
            androidx.mediarouter.a.au r3 = r9.f12125f
            int r3 = r3.f11873m
            r2.setProgress(r3)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r2 = r9.f12116ag
            boolean r3 = r9.mo7974y()
            if (r1 == r3) goto L_0x00d7
            r3 = 8
            goto L_0x00d8
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            r2.setVisibility(r3)
        L_0x00db:
            boolean r2 = r9.mo7973w()
            if (r2 == 0) goto L_0x01bd
            android.support.v4.media.MediaDescriptionCompat r2 = r9.f12090G
            r3 = 0
            if (r2 != 0) goto L_0x00e8
            r2 = r3
            goto L_0x00ea
        L_0x00e8:
            java.lang.CharSequence r2 = r2.f933b
        L_0x00ea:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            r5 = r5 ^ r1
            android.support.v4.media.MediaDescriptionCompat r6 = r9.f12090G
            if (r6 != 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            java.lang.CharSequence r3 = r6.f934c
        L_0x00f6:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r6 = r6 ^ r1
            androidx.mediarouter.a.au r7 = r9.f12125f
            int r7 = r7.f11875o
            r8 = -1
            if (r7 == r8) goto L_0x010d
            android.widget.TextView r2 = r9.f12117ah
            r3 = 2132089491(0x7f151a93, float:1.9819295E38)
            r2.setText(r3)
        L_0x010a:
            r2 = 1
        L_0x010b:
            r3 = 0
            goto L_0x013f
        L_0x010d:
            android.support.v4.media.session.PlaybackStateCompat r7 = r9.f12089F
            if (r7 == 0) goto L_0x0136
            int r7 = r7.f994a
            if (r7 != 0) goto L_0x0116
            goto L_0x0136
        L_0x0116:
            if (r5 != 0) goto L_0x0123
            if (r6 != 0) goto L_0x0123
            android.widget.TextView r2 = r9.f12117ah
            r3 = 2132089496(0x7f151a98, float:1.9819305E38)
            r2.setText(r3)
            goto L_0x010a
        L_0x0123:
            if (r5 == 0) goto L_0x012c
            android.widget.TextView r5 = r9.f12117ah
            r5.setText(r2)
            r2 = 1
            goto L_0x012d
        L_0x012c:
            r2 = 0
        L_0x012d:
            if (r6 == 0) goto L_0x010b
            android.widget.TextView r5 = r9.f12118ai
            r5.setText(r3)
            r3 = 1
            goto L_0x013f
        L_0x0136:
            android.widget.TextView r2 = r9.f12117ah
            r3 = 2132089497(0x7f151a99, float:1.9819307E38)
            r2.setText(r3)
            goto L_0x010a
        L_0x013f:
            android.widget.TextView r5 = r9.f12117ah
            if (r1 == r2) goto L_0x0146
            r2 = 8
            goto L_0x0147
        L_0x0146:
            r2 = 0
        L_0x0147:
            r5.setVisibility(r2)
            android.widget.TextView r2 = r9.f12118ai
            if (r1 == r3) goto L_0x0151
            r3 = 8
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            r2.setVisibility(r3)
            android.support.v4.media.session.PlaybackStateCompat r2 = r9.f12089F
            if (r2 == 0) goto L_0x01bd
            int r2 = r2.f994a
            r3 = 6
            if (r2 == r3) goto L_0x0164
            r3 = 3
            if (r2 != r3) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r2 = 0
            goto L_0x0165
        L_0x0164:
            r2 = 1
        L_0x0165:
            android.widget.ImageButton r3 = r9.f12114ae
            android.content.Context r3 = r3.getContext()
            if (r2 == 0) goto L_0x017b
            boolean r5 = r9.mo7975z()
            if (r5 == 0) goto L_0x017b
            r2 = 2130970558(0x7f0407be, float:1.754983E38)
            r5 = 2132089498(0x7f151a9a, float:1.981931E38)
        L_0x0179:
            r6 = 1
            goto L_0x019c
        L_0x017b:
            if (r2 == 0) goto L_0x018a
            boolean r5 = r9.mo7957B()
            if (r5 == 0) goto L_0x018a
            r2 = 2130970562(0x7f0407c2, float:1.7549838E38)
            r5 = 2132089500(0x7f151a9c, float:1.9819314E38)
            goto L_0x0179
        L_0x018a:
            if (r2 != 0) goto L_0x0199
            boolean r2 = r9.mo7956A()
            if (r2 == 0) goto L_0x0199
            r2 = 2130970559(0x7f0407bf, float:1.7549832E38)
            r5 = 2132089499(0x7f151a9b, float:1.9819311E38)
            goto L_0x0179
        L_0x0199:
            r2 = 0
            r5 = 0
            r6 = 0
        L_0x019c:
            android.widget.ImageButton r7 = r9.f12114ae
            if (r1 == r6) goto L_0x01a2
            r0 = 8
        L_0x01a2:
            r7.setVisibility(r0)
            if (r6 == 0) goto L_0x01bd
            android.widget.ImageButton r0 = r9.f12114ae
            int r1 = androidx.mediarouter.app.C3763ai.m10925f(r3, r2)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r9.f12114ae
            android.content.res.Resources r1 = r3.getResources()
            java.lang.CharSequence r1 = r1.getText(r5)
            r0.setContentDescription(r1)
        L_0x01bd:
            r9.mo7971u(r10)
            return
        L_0x01c1:
            r9.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C3758ad.mo7968q(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo7970t() {
        int a = C3761ag.m10919a(this.f12126g);
        getWindow().setLayout(a, -2);
        View decorView = getWindow().getDecorView();
        this.f12111ab = (a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f12126g.getResources();
        this.f12144y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f12145z = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f12084A = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.f12092I = null;
        this.f12093J = null;
        mo7969s();
        mo7968q(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo7971u(boolean z) {
        this.f12129j.requestLayout();
        this.f12129j.getViewTreeObserver().addOnGlobalLayoutListener(new C3782s(this, z));
    }

    /* renamed from: v */
    public final void mo7972v(boolean z) {
        int i = 0;
        this.f12121al.setVisibility((this.f12134o.getVisibility() != 0 || !z) ? 8 : 0);
        LinearLayout linearLayout = this.f12132m;
        if (this.f12134o.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: w */
    public final boolean mo7973w() {
        return (this.f12090G == null && this.f12089F == null) ? false : true;
    }

    /* renamed from: y */
    public final boolean mo7974y() {
        return this.f12125f.mo7762i() && Collections.unmodifiableList(this.f12125f.f11878r).size() > 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo7975z() {
        return (this.f12089F.f998e & 514) != 0;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f12131l || !this.f12099P) {
            this.f12125f.mo7757d(i == 25 ? -1 : 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo7969s() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f12090G;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f936e;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.f937f;
        }
        C3787x xVar = this.f12091H;
        if (xVar == null) {
            bitmap2 = this.f12092I;
        } else {
            bitmap2 = xVar.f12209a;
        }
        if (xVar == null) {
            uri = this.f12093J;
        } else {
            uri = xVar.f12210b;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri != null && uri.equals(uri2)) {
                return;
            }
            if (uri == null && uri2 == null) {
                return;
            }
        }
        if (!mo7974y() || this.f12131l) {
            C3787x xVar2 = this.f12091H;
            if (xVar2 != null) {
                xVar2.cancel(true);
            }
            C3787x xVar3 = new C3787x(this);
            this.f12091H = xVar3;
            xVar3.execute(new Void[0]);
        }
    }
}
