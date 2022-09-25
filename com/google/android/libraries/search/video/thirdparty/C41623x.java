package com.google.android.libraries.search.video.thirdparty;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.C2646bh;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C2848br;
import androidx.media3.exoplayer.C2891ct;
import androidx.media3.exoplayer.video.C3300g;
import androidx.media3.exoplayer.video.p153a.C3292q;
import androidx.media3.p174ui.C3638b;
import androidx.media3.p174ui.LegacyPlayerControlView;
import androidx.media3.p174ui.SubtitleView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.video.thirdparty.p3197ui.AspectRatioFrameLayout;
import com.google.android.libraries.search.video.thirdparty.p3197ui.C41620a;
import com.google.android.libraries.search.video.thirdparty.p3197ui.EqualizerView;

/* renamed from: com.google.android.libraries.search.video.thirdparty.x */
/* compiled from: PG */
public final class C41623x implements C41617s {

    /* renamed from: A */
    private final int f108793A;

    /* renamed from: B */
    private final boolean f108794B;

    /* renamed from: C */
    private C41616r f108795C;

    /* renamed from: a */
    public final Context f108796a;

    /* renamed from: b */
    public final CaptioningManager f108797b;

    /* renamed from: c */
    public ViewGroup f108798c;

    /* renamed from: d */
    public final FrameLayout f108799d;

    /* renamed from: e */
    public final LegacyPlayerControlView f108800e;

    /* renamed from: f */
    public final ImageView f108801f;

    /* renamed from: g */
    public final SubtitleView f108802g;

    /* renamed from: h */
    public final ViewGroup f108803h;

    /* renamed from: i */
    public boolean f108804i = true;

    /* renamed from: j */
    public boolean f108805j;

    /* renamed from: k */
    public boolean f108806k = true;

    /* renamed from: l */
    public CaptioningManager.CaptioningChangeListener f108807l;

    /* renamed from: m */
    private final AccessibilityManager f108808m;

    /* renamed from: n */
    private final AspectRatioFrameLayout f108809n;

    /* renamed from: o */
    private final SurfaceView f108810o;

    /* renamed from: p */
    private final ViewGroup f108811p;

    /* renamed from: q */
    private final ViewGroup f108812q;

    /* renamed from: r */
    private final EqualizerView f108813r;

    /* renamed from: s */
    private final ViewGroup f108814s;

    /* renamed from: t */
    private final ImageView f108815t;

    /* renamed from: u */
    private final ViewGroup f108816u;

    /* renamed from: v */
    private final View f108817v;

    /* renamed from: w */
    private final boolean f108818w;

    /* renamed from: x */
    private final boolean f108819x;

    /* renamed from: y */
    private final boolean f108820y;

    /* renamed from: z */
    private final int f108821z;

    public C41623x(Context context, C41599ac acVar) {
        this.f108796a = context;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(true != acVar.mo44163e() ? R.layout.thirdpartyvideoplayer : R.layout.stampvideoplayer, (ViewGroup) null, false);
        this.f108799d = frameLayout;
        this.f108794B = acVar.mo44163e();
        this.f108808m = (AccessibilityManager) context.getSystemService("accessibility");
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        this.f108797b = captioningManager;
        this.f108809n = (AspectRatioFrameLayout) frameLayout.findViewById(R.id.aspect_frame);
        this.f108810o = (SurfaceView) frameLayout.findViewById(R.id.video_surface);
        this.f108811p = (ViewGroup) frameLayout.findViewById(R.id.modal_overlay);
        this.f108816u = (ViewGroup) frameLayout.findViewById(R.id.third_party_load_indicator);
        this.f108812q = (ViewGroup) frameLayout.findViewById(R.id.continue_watching);
        this.f108817v = frameLayout.findViewById(R.id.exo_play);
        this.f108813r = (EqualizerView) frameLayout.findViewById(R.id.equalizer);
        LegacyPlayerControlView legacyPlayerControlView = (LegacyPlayerControlView) frameLayout.findViewById(R.id.player_controls);
        this.f108800e = legacyPlayerControlView;
        this.f108814s = (ViewGroup) frameLayout.findViewById(R.id.controls_button_wrapper);
        this.f108815t = (ImageView) frameLayout.findViewById(R.id.third_party_full_screen_button);
        this.f108803h = (ViewGroup) frameLayout.findViewById(R.id.ads_container);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.subtitle_button);
        this.f108801f = imageView;
        SubtitleView subtitleView = (SubtitleView) frameLayout.findViewById(R.id.subtitle);
        this.f108802g = subtitleView;
        if (!(subtitleView == null || captioningManager == null)) {
            subtitleView.f11678e = 0.0f;
            subtitleView.mo7678a();
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            int i = C2612ak.f7249a;
            subtitleView.f11675b = C3638b.m10522a(userStyle);
            subtitleView.mo7678a();
            m72977m(subtitleView, captioningManager.getFontScale());
            C41622w wVar = new C41622w(this);
            this.f108807l = wVar;
            captioningManager.addCaptioningChangeListener(wVar);
        }
        ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(R.id.controls_container);
        if (viewGroup != null) {
            viewGroup.getLayoutTransition().setAnimateParentHierarchy(false);
        }
        this.f108821z = context.getResources().getDimensionPixelOffset(R.dimen.third_party_player_time_bar_right_padding_without_fullscreen);
        this.f108793A = context.getResources().getDimensionPixelOffset(R.dimen.third_party_player_time_bar_right_padding_with_fullscreen);
        this.f108819x = acVar.mo44161c();
        this.f108820y = acVar.mo44162d();
        boolean a = acVar.mo44159a();
        this.f108818w = a;
        if (a) {
            frameLayout.setOnTouchListener(new C41618t(this));
            if (legacyPlayerControlView != null) {
                legacyPlayerControlView.mo7664b(SimpleSnackbar.LENGTH_SHORT);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration(2, 200);
                layoutTransition.setDuration(3, 800);
                legacyPlayerControlView.setLayoutTransition(layoutTransition);
            }
            View findViewById = frameLayout.findViewById(R.id.third_party_full_screen_button_wrapper);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C41619u(this));
            }
            if (acVar.mo44160b()) {
                imageView.setOnClickListener(new C41621v(this));
                frameLayout.findViewById(R.id.top_controls_container).setVisibility(0);
            }
        }
    }

    /* renamed from: l */
    public static void m72976l(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: m */
    public static void m72977m(SubtitleView subtitleView, float f) {
        Resources resources;
        float f2 = f * 14.0f;
        Context context = subtitleView.getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        subtitleView.f11676c = 2;
        subtitleView.f11677d = applyDimension;
        subtitleView.mo7678a();
    }

    /* renamed from: n */
    private static void m72978n(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: o */
    private final boolean m72979o() {
        AccessibilityManager accessibilityManager = this.f108808m;
        return accessibilityManager != null && accessibilityManager.isEnabled() && this.f108808m.isTouchExplorationEnabled();
    }

    /* renamed from: a */
    public final void mo44181a(C41607i iVar) {
        SurfaceHolder surfaceHolder;
        SurfaceView surfaceView = this.f108810o;
        LegacyPlayerControlView legacyPlayerControlView = this.f108818w ? this.f108800e : null;
        C41610l lVar = (C41610l) iVar;
        C2759ad adVar = lVar.f108760b;
        if (adVar != null) {
            C2848br brVar = (C2848br) adVar;
            brVar.mo6600aQ();
            boolean z = true;
            if (surfaceView instanceof C3300g) {
                brVar.mo6590aG();
                brVar.mo6596aM(surfaceView);
                brVar.mo6594aK(surfaceView.getHolder());
            } else if (surfaceView instanceof C3292q) {
                brVar.mo6590aG();
                brVar.f8009v = (C3292q) surfaceView;
                C2891ct aC = brVar.mo6586aC(brVar.f7997i);
                aC.mo6678e(10000);
                aC.mo6677d(brVar.f8009v);
                aC.mo6676c();
                brVar.f8009v.f9906a.add(brVar.f7996h);
                brVar.mo6596aM(brVar.f8009v.f9910e);
                brVar.mo6594aK(surfaceView.getHolder());
            } else {
                if (surfaceView == null) {
                    surfaceHolder = null;
                } else {
                    surfaceHolder = surfaceView.getHolder();
                }
                brVar.mo6600aQ();
                if (surfaceHolder == null) {
                    brVar.mo6587aD();
                } else {
                    brVar.mo6590aG();
                    brVar.f8010w = true;
                    brVar.f8008u = surfaceHolder;
                    surfaceHolder.addCallback(brVar.f7996h);
                    Surface surface = surfaceHolder.getSurface();
                    if (surface == null || !surface.isValid()) {
                        brVar.mo6596aM((Object) null);
                        brVar.mo6589aF(0, 0);
                    } else {
                        brVar.mo6596aM(surface);
                        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                        brVar.mo6589aF(surfaceFrame.width(), surfaceFrame.height());
                    }
                }
            }
            if (legacyPlayerControlView instanceof LegacyPlayerControlView) {
                C41605g gVar = new C41605g(lVar.f108760b, iVar);
                C2601a.m6832d(Looper.myLooper() == Looper.getMainLooper());
                if (gVar.mo6009p() != Looper.getMainLooper()) {
                    z = false;
                }
                C2601a.m6830b(z);
                C2646bh bhVar = legacyPlayerControlView.f11660m;
                if (bhVar != gVar) {
                    if (bhVar != null) {
                        bhVar.mo6019z(legacyPlayerControlView.f11647a);
                    }
                    legacyPlayerControlView.f11660m = gVar;
                    gVar.mo6016w(legacyPlayerControlView.f11647a);
                    legacyPlayerControlView.mo7666d();
                }
            }
        }
        LegacyPlayerControlView legacyPlayerControlView2 = this.f108800e;
        if (legacyPlayerControlView2 != null) {
            legacyPlayerControlView2.mo7663a();
        }
    }

    /* renamed from: b */
    public final void mo44182b(ViewGroup viewGroup) {
        this.f108798c = viewGroup;
        viewGroup.addView(this.f108799d);
    }

    /* renamed from: c */
    public final void mo44183c() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f108809n;
        if (aspectRatioFrameLayout.f108780b != 4) {
            aspectRatioFrameLayout.f108780b = 4;
            aspectRatioFrameLayout.requestLayout();
        }
    }

    /* renamed from: d */
    public final void mo44184d(float f) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f108809n;
        if (aspectRatioFrameLayout.f108779a != f) {
            aspectRatioFrameLayout.f108779a = f;
            aspectRatioFrameLayout.requestLayout();
        }
    }

    /* renamed from: e */
    public final void mo44185e(String str) {
        TextView textView = (TextView) this.f108799d.findViewById(R.id.continue_watching_text);
        if (textView != null) {
            m72976l(textView);
            textView.setText(str);
        }
        Button button = (Button) this.f108799d.findViewById(R.id.stamp_watch_full_story_button);
        if (button != null) {
            button.setClickable(false);
            m72976l(button);
            button.setText(str);
        }
    }

    /* renamed from: h */
    public final void mo44187h(C41616r rVar) {
        int i;
        this.f108795C = rVar;
        View findViewById = this.f108799d.findViewById(R.id.third_party_full_screen_button_wrapper);
        if (rVar != null) {
            m72976l(findViewById);
        } else {
            m72978n(findViewById);
        }
        View findViewById2 = this.f108799d.findViewById(R.id.time_bar_wrapper);
        if (findViewById2 != null) {
            if (rVar != null) {
                i = this.f108793A;
            } else {
                i = this.f108821z;
            }
            findViewById2.setPaddingRelative(findViewById2.getPaddingStart(), findViewById2.getPaddingTop(), i, findViewById2.getPaddingBottom());
        }
    }

    /* renamed from: hW */
    public final void mo44142hW() {
    }

    /* renamed from: i */
    public final void mo44143i(int i) {
    }

    /* renamed from: j */
    public final void mo44144j(int i) {
    }

    /* renamed from: k */
    public final void mo44145k(int i, C41607i iVar) {
        if (i == 7) {
            m72976l(this.f108811p);
        } else {
            m72978n(this.f108811p);
        }
        if (i == 2) {
            m72976l(this.f108816u);
        } else {
            m72978n(this.f108816u);
        }
        if (i == 7) {
            m72976l(this.f108812q);
        } else {
            m72978n(this.f108812q);
        }
        View view = this.f108817v;
        if (view != null) {
            if (i == 8) {
                view.setBackgroundResource(R.drawable.quantum_ic_replay_white_48);
            } else {
                view.setBackgroundResource(R.drawable.quantum_ic_play_arrow_white_36);
            }
        }
        if (!this.f108806k) {
            this.f108813r.mo44191a();
            m72978n(this.f108813r);
        } else {
            if (i == 4) {
                EqualizerView equalizerView = this.f108813r;
                int i2 = 0;
                while (true) {
                    ValueAnimator[] valueAnimatorArr = equalizerView.f108785b;
                    int length = valueAnimatorArr.length;
                    if (i2 >= 3) {
                        break;
                    }
                    ValueAnimator valueAnimator = valueAnimatorArr[i2];
                    valueAnimator.addUpdateListener(new C41620a(equalizerView, i2));
                    valueAnimator.start();
                    i2++;
                }
            } else {
                this.f108813r.mo44191a();
            }
            if (i == 4) {
                m72976l(this.f108813r);
            } else if (!(i == 2 || i == 3)) {
                m72978n(this.f108813r);
            }
        }
        LegacyPlayerControlView legacyPlayerControlView = this.f108800e;
        if (legacyPlayerControlView != null) {
            if (!this.f108818w) {
                legacyPlayerControlView.mo7663a();
            } else {
                if (m72979o() || i == 3 || i == 8 || i == 2) {
                    legacyPlayerControlView.mo7664b(0);
                    this.f108804i = false;
                } else {
                    legacyPlayerControlView.mo7664b(SimpleSnackbar.LENGTH_SHORT);
                    this.f108804i = true;
                }
                if (i == 2) {
                    m72978n(this.f108814s);
                } else {
                    m72976l(this.f108814s);
                }
                if (m72979o()) {
                    legacyPlayerControlView.mo7665c();
                } else if (!(i == 6 || i == 5 || i == 4 || i == 2)) {
                    if (i == 3 || i == 8) {
                        legacyPlayerControlView.mo7665c();
                    } else {
                        legacyPlayerControlView.mo7663a();
                    }
                }
            }
        }
        if (this.f108819x && i == 8) {
            m72978n(this.f108810o);
        } else if (this.f108820y && i == 3) {
            m72978n(this.f108810o);
        } else if (!this.f108794B || i != 2) {
            m72976l(this.f108810o);
        } else {
            m72978n(this.f108810o);
        }
    }

    /* renamed from: f */
    public final void mo44186f(boolean z) {
        this.f108805j = z;
        ImageView imageView = this.f108815t;
        if (imageView != null) {
            imageView.setImageResource(true != z ? R.drawable.quantum_ic_fullscreen_white_24 : R.drawable.quantum_ic_fullscreen_exit_white_24);
        }
        C41616r rVar = this.f108795C;
        if (rVar != null) {
            rVar.mo44134a(z);
        }
    }
}
